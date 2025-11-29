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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.AHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ANHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.ABHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.BHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.DHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.FHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.GHelper;
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.JHelper;

public class XHelper
implements ac {
    public static  boolean bt;
    public static  boolean dB;
    private static  WorldPoint dI;
    private static  WorldPoint dL;
    static  boolean dj;
    private static  WorldPoint dM;
    private static  WorldPoint dG;
    
    public static  boolean dA;
    public static  boolean dE;
    private static  WorldPoint dK;
    public static  List<d> bv;
    static  int di;
    
    public static  boolean dC;
    public static  boolean dD;
    static  int dF;
    
    private static  WorldPoint dH;
    private static  WorldPoint dJ;

    private static boolean lIlIlIIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return llIIIlllIl[llIIlIIIIl[78]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIlIIIIl[0]];
        stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[73]];
        if (x.lIlIlIIlIIIlI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIIlIIIIl[0]];
            nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
            if (x.lIlIlIIlIIIlI(Inventory.getCount((int[])nArray)) && x.lIlIlIIlIIIlI(Inventory.getCount((int[])f.ba))) {
                int[] nArray2 = new int[llIIlIIIIl[0]];
                nArray2[x.llIIlIIIIl[1]] = llIIlIIIIl[8];
                if (x.lIlIlIIlIIIlI(Inventory.getCount((int[])nArray2))) {
                    n2 = llIIlIIIIl[0];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llIIlIIIIl[1];
        return n2 != 0;
    }

    private static void Q() {
        d var1;
        Object var2;
        int[] nArray = new int[llIIlIIIIl[0]];
        nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[9];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llIIlIIIIl[9], llIIlIIIIl[12], llIIlIIIIl[74]);
            bv.add(d2);

        }
        int[] nArray2 = new int[llIIlIIIIl[0]];
        nArray2[x.llIIlIIIIl[1]] = llIIlIIIIl[11];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(llIIlIIIIl[11], llIIlIIIIl[13], j.cf);
            bv.add((DHelper) ar2);

        }
        if (x.lIlIlIIIlllIl(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(llIIIlllIl[llIIlIIIIl[80]])) ? 1 : 0)) {
            var1 = new DHelper(llIIlIIIIl[75], llIIlIIIIl[13], llIIlIIIIl[76]);
            bv.add(var1);

        }
        int[] nArray3 = new int[llIIlIIIIl[0]];
        nArray3[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new DHelper(llIIlIIIIl[7], llIIlIIIIl[53], llIIlIIIIl[74]);
            bv.add(var1);

        }
        int[] nArray4 = new int[llIIlIIIIl[0]];
        nArray4[x.llIIlIIIIl[1]] = llIIlIIIIl[8];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(llIIlIIIIl[8], llIIlIIIIl[12], llIIlIIIIl[74]);
            bv.add(var1);

        }
    }

    @Override
    public int af() {
        try {
            x.bi();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x82 ^ 0xA6) & ~(0x59 ^ 0x7D)) != 0) {
            return (0x52 ^ 0x1B) & ~(0x11 ^ 0x58);
        }
        return llIIlIIIIl[77];
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIlIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlIIIIl(Object object) {
        return object != null;
    }

    public static void bj() {
        String[] stringArray = new String[llIIlIIIIl[0]];
        stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[66]];
        if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (x.lIlIlIIlIIIIl(Widgets.get((int)llIIlIIIIl[59]))) {
                Widget var4;
                AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[67]];
                String[] stringArray2 = new String[llIIlIIIIl[0]];
                stringArray2[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(llIIIlllIl[llIIlIIIIl[69]]);
                Time.sleepTicks((int)llIIlIIIIl[6]);

                AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[70]];
                Widget widget = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[27]);
                if (x.lIlIlIIlIIIIl(widget)) {
                    widget.interact(llIIIlllIl[llIIlIIIIl[71]]);
                    Time.sleepTicks((int)llIIlIIIIl[0]);

                }
                if (x.lIlIlIIlIIIIl(var4 = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[39]))) {
                    var4.interact(llIIIlllIl[llIIlIIIIl[72]]);
                    Time.sleepTicks((int)llIIlIIIIl[5]);

                }
            }
            Time.sleepTicks((int)llIIlIIIIl[0]);

        }
    }

    @Override
    public boolean ae() {
        return llIIlIIIIl[1];
    }

    private static boolean lIlIlIIlIIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (x.lIlIlIIIlllll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[24])) {
            String[] stringArray = new String[llIIlIIIIl[0]];
            stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[79]];
            if (x.lIlIlIIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llIIlIIIIl[0];

                if (((106 + 94 - 174 + 202 ^ 136 + 50 - 181 + 165) & (200 + 75 - 121 + 100 ^ 154 + 167 - 249 + 104 ^ -1)) == 0) return n2 != 0;
                return ((46 + 145 - 110 + 97 ^ 20 + 138 - 22 + 10) & (0x22 ^ 0x41 ^ (0x7B ^ 0x38) ^ -1)) != 0;
            }
        }
        n2 = llIIlIIIIl[1];
        return n2 != 0;
    }

    private static void lIlIlIIIlIIIl() {
        llIIIlllIl = new String[llIIlIIIIl[125]];
        x.llIIIlllIl[x.llIIlIIIIl[1]] = "Finished buying items, switching back to quest";
        x.llIIIlllIl[x.llIIlIIIIl[0]] = "Nav to bank";
        x.llIIIlllIl[x.llIIlIIIIl[5]] = "Handling banking";
        x.llIIIlllIl[x.llIIlIIIIl[10]] = "We are missing quest supplies, switching to BUYING";
        x.llIIIlllIl[x.llIIlIIIIl[6]] = "Eat";
        x.llIIIlllIl[x.llIIlIIIIl[13]] = "Drink";
        x.llIIIlllIl[x.llIIlIIIIl[17]] = "Nav to start";
        x.llIIIlllIl[x.llIIlIIIIl[18]] = "Starting quest";
        x.llIIIlllIl[x.llIIlIIIIl[2]] = "Veos";
        x.llIIIlllIl[x.llIIlIIIIl[24]] = "Enchanted scroll";
        x.llIIIlllIl[x.llIIlIIIIl[12]] = "Feather";
        x.llIIIlllIl[x.llIIlIIIIl[25]] = "Enchanted quill";
        x.llIIIlllIl[x.llIIlIIIIl[15]] = "Enchanted scroll";
        x.llIIIlllIl[x.llIIlIIIIl[26]] = "Feather";
        x.llIIIlllIl[x.llIIlIIIIl[27]] = "Enchanted quill";
        x.llIIIlllIl[x.llIIlIIIIl[28]] = "Nav to pisc tile";
        x.llIIIlllIl[x.llIIlIIIIl[29]] = "Talking pisc";
        x.llIIIlllIl[x.llIIlIIIIl[30]] = "Leenz";
        x.llIIIlllIl[x.llIIlIIIIl[31]] = "Finished pisc";
        x.llIIIlllIl[x.llIIlIIIIl[32]] = "Nav to arc tile";
        x.llIIIlllIl[x.llIIlIIIIl[33]] = "Talking arc";
        x.llIIIlllIl[x.llIIlIIIIl[34]] = "Regath";
        x.llIIIlllIl[x.llIIlIIIIl[35]] = "Finished arc";
        x.llIIIlllIl[x.llIIlIIIIl[36]] = "Nav to lova tile";
        x.llIIIlllIl[x.llIIlIIIIl[37]] = "Talking lova";
        x.llIIIlllIl[x.llIIlIIIIl[38]] = "Munty";
        x.llIIIlllIl[x.llIIlIIIIl[39]] = "Finished munty";
        x.llIIIlllIl[x.llIIlIIIIl[40]] = "Nav to shyzien tile";
        x.llIIIlllIl[x.llIIlIIIIl[41]] = "Talking shyzien";
        x.llIIIlllIl[x.llIIlIIIIl[42]] = "Jennifer";
        x.llIIIlllIl[x.llIIlIIIIl[43]] = "Finished shyzien";
        x.llIIIlllIl[x.llIIlIIIIl[44]] = "Nav to hosidius tile";
        x.llIIIlllIl[x.llIIlIIIIl[45]] = "Talking hosidius";
        x.llIIIlllIl[x.llIIlIIIIl[46]] = "Horace";
        x.llIIIlllIl[x.llIIlIIIIl[47]] = "Finished hosidius";
        x.llIIIlllIl[x.llIIlIIIIl[48]] = "Nav to start";
        x.llIIIlllIl[x.llIIlIIIIl[49]] = "talking veos";
        x.llIIIlllIl[x.llIIlIIIIl[50]] = "Veos";
        x.llIIIlllIl[x.llIIlIIIIl[51]] = "Nav to dark altar";
        x.llIIIlllIl[x.llIIlIIIIl[52]] = "Mysterious orb";
        x.llIIIlllIl[x.llIIlIIIIl[53]] = "Mysterious orb";
        x.llIIIlllIl[x.llIIlIIIIl[54]] = "Activate";
        x.llIIIlllIl[x.llIIlIIIIl[55]] = "Nav to start";
        x.llIIIlllIl[x.llIIlIIIIl[56]] = "talking veos";
        x.llIIIlllIl[x.llIIlIIIIl[57]] = "Veos";
        x.llIIIlllIl[x.llIIlIIIIl[58]] = "Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[60]] = "Rubbing lamp";
        x.llIIIlllIl[x.llIIlIIIIl[61]] = "Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[62]] = "Rub";
        x.llIIIlllIl[x.llIIlIIIIl[63]] = "Selecting slayer";
        x.llIIIlllIl[x.llIIlIIIIl[64]] = "Slayer";
        x.llIIIlllIl[x.llIIlIIIIl[65]] = "Confirm";
        x.llIIIlllIl[x.llIIlIIIIl[66]] = "Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[67]] = "Rubbing lamp";
        x.llIIIlllIl[x.llIIlIIIIl[68]] = "Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[69]] = "Rub";
        x.llIIIlllIl[x.llIIlIIIIl[70]] = "Selecting slayer";
        x.llIIIlllIl[x.llIIlIIIIl[71]] = "Slayer";
        x.llIIIlllIl[x.llIIlIIIIl[72]] = "Confirm";
        x.llIIIlllIl[x.llIIlIIIIl[73]] = "Feather";
        x.llIIIlllIl[x.llIIlIIIIl[78]] = "Client of Kourend";
        x.llIIIlllIl[x.llIIlIIIIl[79]] = "Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[80]] = "ring of wealth (";
        x.llIIIlllIl[x.llIIlIIIIl[81]] = "Can I ask you about Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[82]] = "let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[16]] = "Let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[83]] = "Can I ask you about Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[84]] = "Let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[85]] = "Can I ask you about Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[86]] = "Let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[87]] = "Can I ask you about Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[88]] = "I don't need anything.";
        x.llIIIlllIl[x.llIIlIIIIl[89]] = "Can I ask you about Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[90]] = "I don't need anything right now.";
        x.llIIIlllIl[x.llIIlIIIIl[105]] = "Have you got any quests for me?";
        x.llIIIlllIl[x.llIIlIIIIl[106]] = "Yes.";
        x.llIIIlllIl[x.llIIlIIIIl[107]] = "yes.";
        x.llIIIlllIl[x.llIIlIIIIl[108]] = "Can I ask you about Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[109]] = "Why should I gain favour with Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[110]] = "Can I ask you about Port Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[111]] = "Can I ask you about Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[112]] = "Why should I gain favour with Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[113]] = "Can I ask you about Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[114]] = "Why should I gain favour with Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[115]] = "Can I ask you about Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[116]] = "Why should I gain favour with Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[117]] = "Can I ask you about Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[118]] = "Why should I gain favour with Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[119]] = "What is there to do in Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[120]] = "What is there to do in Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[121]] = "What is there to do in Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[122]] = "What is there to do in Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[123]] = "What is there to do in Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[124]] = "Let's talk about your client...";
    }

    private static boolean lIlIlIIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIlIIIlI(int n2) {
        return n2 > 0;
    }

    static {
        x.lIlIlIIIlIllI();
        x.lIlIlIIIlIIIl();
        bv = new ArrayList<d>();
        dF = llIIlIIIIl[1];
        dG = new WorldPoint(llIIlIIIIl[91], llIIlIIIIl[92], llIIlIIIIl[1]);
        dH = new WorldPoint(llIIlIIIIl[93], llIIlIIIIl[94], llIIlIIIIl[1]);
        dI = new WorldPoint(llIIlIIIIl[95], llIIlIIIIl[96], llIIlIIIIl[1]);
        dJ = new WorldPoint(llIIlIIIIl[97], llIIlIIIIl[98], llIIlIIIIl[1]);
        dK = new WorldPoint(llIIlIIIIl[99], llIIlIIIIl[100], llIIlIIIIl[1]);
        dL = new WorldPoint(llIIlIIIIl[101], llIIlIIIIl[102], llIIlIIIIl[1]);
        dM = new WorldPoint(llIIlIIIIl[103], llIIlIIIIl[104], llIIlIIIIl[1]);
        String[] stringArray = new String[llIIlIIIIl[33]];
        stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[105]];
        stringArray[x.llIIlIIIIl[0]] = llIIIlllIl[llIIlIIIIl[106]];
        stringArray[x.llIIlIIIIl[5]] = llIIIlllIl[llIIlIIIIl[107]];
        stringArray[x.llIIlIIIIl[10]] = llIIIlllIl[llIIlIIIIl[108]];
        stringArray[x.llIIlIIIIl[6]] = llIIIlllIl[llIIlIIIIl[109]];
        stringArray[x.llIIlIIIIl[13]] = llIIIlllIl[llIIlIIIIl[110]];
        stringArray[x.llIIlIIIIl[17]] = llIIIlllIl[llIIlIIIIl[111]];
        stringArray[x.llIIlIIIIl[18]] = llIIIlllIl[llIIlIIIIl[112]];
        stringArray[x.llIIlIIIIl[2]] = llIIIlllIl[llIIlIIIIl[113]];
        stringArray[x.llIIlIIIIl[24]] = llIIIlllIl[llIIlIIIIl[114]];
        stringArray[x.llIIlIIIIl[12]] = llIIIlllIl[llIIlIIIIl[115]];
        stringArray[x.llIIlIIIIl[25]] = llIIIlllIl[llIIlIIIIl[116]];
        stringArray[x.llIIlIIIIl[15]] = llIIIlllIl[llIIlIIIIl[117]];
        stringArray[x.llIIlIIIIl[26]] = llIIIlllIl[llIIlIIIIl[118]];
        stringArray[x.llIIlIIIIl[27]] = llIIIlllIl[llIIlIIIIl[119]];
        stringArray[x.llIIlIIIIl[28]] = llIIIlllIl[llIIlIIIIl[120]];
        stringArray[x.llIIlIIIIl[29]] = llIIIlllIl[llIIlIIIIl[121]];
        stringArray[x.llIIlIIIIl[30]] = llIIIlllIl[llIIlIIIIl[122]];
        stringArray[x.llIIlIIIIl[31]] = llIIIlllIl[llIIlIIIIl[123]];
        stringArray[x.llIIlIIIIl[32]] = llIIIlllIl[llIIlIIIIl[124]];
        cE = stringArray;
    }

    public static void bi() {
        block80: {
            Widget var5;
            Object var6;
            block82: {
                block81: {
                    if (x.lIlIlIIIllIII(bt ? 1 : 0)) {
                        b.a(bv);
                        if (x.lIlIlIIIllIll(bv.size(), llIIlIIIIl[0])) {
                            System.out.println(llIIIlllIl[llIIlIIIIl[1]]);
                            bt = llIIlIIIIl[1];
                        }
                    }
                    if (!x.lIlIlIIIlllIl(bt ? 1 : 0)) break block80;
                    if (!x.lIlIlIIIlllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) break block81;
                    int[] nArray = new int[llIIlIIIIl[0]];
                    nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[3];
                    if (!x.lIlIlIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                ab.ex();
            }
            if (x.lIlIlIIIlllIl(x.an() ? 1 : 0) && x.lIlIlIIIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0]) && x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] nArray = new int[llIIlIIIIl[0]];
                nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[3];
                if (x.lIlIlIIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    var6 = BankLocation.getNearest();
                    if (x.lIlIlIIlIIIIl(var6) && x.lIlIlIIIlllIl(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[0]];
                        a.a((BankLocation)var6);
                    }
                    if (x.lIlIlIIlIIIIl(var6) && x.lIlIlIIIllIII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (x.lIlIlIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIIIl[4]);

                        }
                        if (x.lIlIlIIIllIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[5]];
                            if (x.lIlIlIIlIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIIIIl[6]);

                            }
                            if (x.lIlIlIIlIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlIIIIl[5]);

                            }
                            int[] nArray2 = new int[llIIlIIIIl[6]];
                            nArray2[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
                            nArray2[x.llIIlIIIIl[0]] = llIIlIIIIl[8];
                            nArray2[x.llIIlIIIIl[5]] = llIIlIIIIl[9];
                            nArray2[x.llIIlIIIIl[10]] = llIIlIIIIl[11];
                            if (x.lIlIlIIIlllIl(e.c(nArray2) ? 1 : 0)) {
                                x.Q();
                                System.out.println(llIIIlllIl[llIIlIIIIl[10]]);
                                bt = llIIlIIIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[llIIlIIIIl[6]];
                            nArray3[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
                            nArray3[x.llIIlIIIIl[0]] = llIIlIIIIl[8];
                            nArray3[x.llIIlIIIIl[5]] = llIIlIIIIl[9];
                            nArray3[x.llIIlIIIIl[10]] = llIIlIIIIl[11];
                            if (x.lIlIlIIIllIII(e.c(nArray3) ? 1 : 0)) {
                                a.a(llIIlIIIIl[7], llIIlIIIIl[12]);
                                a.a(llIIlIIIIl[8], llIIlIIIIl[12]);
                                a.a(llIIlIIIIl[9], llIIlIIIIl[0]);
                                a.a(llIIlIIIIl[11], llIIlIIIIl[13]);
                                a.a(llIIlIIIIl[14], llIIlIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llIIlIIIIl[0]];
            nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[14];
            if (x.lIlIlIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0) && x.lIlIlIIIlllll(Combat.getMissingHealth(), llIIlIIIIl[15])) {
                int[] nArray4 = new int[llIIlIIIIl[0]];
                nArray4[x.llIIlIIIIl[1]] = llIIlIIIIl[14];
                Inventory.getFirst((int[])nArray4).interact(llIIIlllIl[llIIlIIIIl[6]]);
                Time.sleepTicks((int)llIIlIIIIl[5]);

            }
            if (x.lIlIlIIIllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && x.lIlIlIIIllIll(Movement.getRunEnergy(), llIIlIIIIl[16])) {
                Inventory.getFirst((int[])f.ba).interact(llIIIlllIl[llIIlIIIIl[13]]);
                Time.sleepTicks((int)llIIlIIIIl[0]);

            }
            if (x.lIlIlIIIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0]) && x.lIlIlIIIllIII(x.an() ? 1 : 0) && x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] nArray5 = new int[llIIlIIIIl[0]];
                nArray5[x.llIIlIIIIl[1]] = llIIlIIIIl[3];
                if (x.lIlIlIIIlllIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (x.lIlIlIIIlllIl(Players.getLocal().getWorldLocation().equals((Object)dG) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[17]];
                        if (x.lIlIlIIIllIII(Dialog.isOpen() ? 1 : 0) && x.lIlIlIIIllIll(dF, llIIlIIIIl[5])) {
                            Dialog.close();
                            dF += llIIlIIIIl[0];
                        }
                        e.a(dG);
                    }
                    if (x.lIlIlIIIllIII(Players.getLocal().getWorldLocation().equals((Object)dG) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[18]];
                        g.a(llIIIlllIl[llIIlIIIIl[2]], cE);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llIIlIIIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)llIIlIIIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)llIIlIIIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)llIIlIIIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)llIIlIIIIl[23]));
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[19]), llIIlIIIIl[0])) {
                dA = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[20]), llIIlIIIIl[0])) {
                dB = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[21]), llIIlIIIIl[0])) {
                dC = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[22]), llIIlIIIIl[0])) {
                dD = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[23]), llIIlIIIIl[0])) {
                dE = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0])) {
                int var7;
                di = llIIlIIIIl[1];
                if (x.lIlIlIIIlllIl(dA ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIIIIl[0]];
                    stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[24]];
                    if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llIIlIIIIl[0]];
                        stringArray2[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[12]];
                        if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llIIlIIIIl[0]];
                            stringArray3[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[25]];
                            if (x.lIlIlIIIlllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llIIlIIIIl[0]];
                                stringArray4[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[15]];
                                String[] stringArray5 = new String[llIIlIIIIl[0]];
                                stringArray5[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llIIlIIIIl[5]);

                            }
                        }
                    }
                    String[] stringArray6 = new String[llIIlIIIIl[0]];
                    stringArray6[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[27]];
                    if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dH), llIIlIIIIl[2])) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[28]];
                            Movement.walkTo((WorldPoint)dH);

                            Time.sleepTicks((int)llIIlIIIIl[0]);

                        }
                        if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dH), llIIlIIIIl[2])) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[29]];
                            g.a(llIIIlllIl[llIIlIIIIl[30]], cE, llIIlIIIIl[0]);
                            Time.sleepTicks((int)llIIlIIIIl[0]);

                            var6 = Dialog.getOptions();
                            var5 = new ArrayList();
                            if (x.lIlIlIIIlllIl(var6.isEmpty() ? 1 : 0)) {
                                var7 = llIIlIIIIl[1];
                                while (x.lIlIlIIIllIll(var7, var6.size())) {
                                    var5.add(((Widget)var6.get(var7)).getText());

                                    ++var7;

                                    if (2 == 2) continue;
                                    return;
                                }
                                var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[90]])) ? 1 : 0;
                                int n2 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[89]]));
                                if (x.lIlIlIIIllIII(var7) && x.lIlIlIIIllIII(n2)) {
                                    System.out.println(llIIIlllIl[llIIlIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dI), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[32]];
                        Movement.walkTo((WorldPoint)dI);

                        Time.sleepTicks((int)llIIlIIIIl[0]);

                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dI), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[33]];
                        g.a(llIIIlllIl[llIIlIIIIl[34]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (x.lIlIlIIIlllIl(var6.isEmpty() ? 1 : 0)) {
                            var7 = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (2 < (0x91 ^ 0x95)) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[88]])) ? 1 : 0;
                            int n3 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[87]]));
                            if (x.lIlIlIIIllIII(var7) && x.lIlIlIIIllIII(n3)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[35]]);
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dC ? 1 : 0) && x.lIlIlIIIllIII(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dJ), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[36]];
                        Movement.walkTo((WorldPoint)dJ);

                        Time.sleepTicks((int)llIIlIIIIl[0]);

                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dJ), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[37]];
                        g.a(llIIIlllIl[llIIlIIIIl[38]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (x.lIlIlIIIlllIl(var6.isEmpty() ? 1 : 0)) {
                            var7 = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (3 == 3) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[86]])) ? 1 : 0;
                            int n4 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[85]]));
                            if (x.lIlIlIIIllIII(var7) && x.lIlIlIIIllIII(n4)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[39]]);
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dD ? 1 : 0) && x.lIlIlIIIllIII(dC ? 1 : 0) && x.lIlIlIIIllIII(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dK), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[40]];
                        Movement.walkTo((WorldPoint)dK);

                        Time.sleepTicks((int)llIIlIIIIl[0]);

                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dK), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[41]];
                        g.a(llIIIlllIl[llIIlIIIIl[42]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (x.lIlIlIIIlllIl(var6.isEmpty() ? 1 : 0)) {
                            var7 = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (2 != 1) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[84]])) ? 1 : 0;
                            int n5 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[83]]));
                            if (x.lIlIlIIIllIII(var7) && x.lIlIlIIIllIII(n5)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[43]]);
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dE ? 1 : 0) && x.lIlIlIIIllIII(dD ? 1 : 0) && x.lIlIlIIIllIII(dC ? 1 : 0) && x.lIlIlIIIllIII(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dL), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[44]];
                        Movement.walkTo((WorldPoint)dL);

                        Time.sleepTicks((int)llIIlIIIIl[0]);

                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dL), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[45]];
                        g.a(llIIIlllIl[llIIlIIIIl[46]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (x.lIlIlIIIlllIl(var6.isEmpty() ? 1 : 0)) {
                            var7 = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (2 != (0xBB ^ 0x87 ^ (0x62 ^ 0x5A))) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[16]])) ? 1 : 0;
                            int n6 = var5.stream().anyMatch(string -> string.contains(llIIIlllIl[llIIlIIIIl[82]]));
                            int n7 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[81]]));
                            if ((!x.lIlIlIIIlllIl(var7) || x.lIlIlIIIllIII(n6)) && x.lIlIlIIIllIII(n7)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[5])) {
                if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[48]];
                    if (x.lIlIlIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(dG);
                }
                if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[49]];
                    g.a(llIIIlllIl[llIIlIIIIl[50]], cE);
                }
            }
            if (!x.lIlIlIIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[10]) || x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[17])) {
                g.a(cE);
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[6])) {
                if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlIIIIl[6])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[51]];
                    Movement.walkTo((WorldPoint)dM);

                    Time.sleepTicks((int)llIIlIIIIl[0]);

                }
                if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlIIIIl[6])) {
                    String[] stringArray = new String[llIIlIIIIl[0]];
                    stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[52]];
                    if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llIIlIIIIl[0]];
                        stringArray7[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(llIIIlllIl[llIIlIIIIl[54]]);
                        Time.sleepTicks((int)llIIlIIIIl[10]);

                    }
                }
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[13])) {
                if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[55]];
                    e.a(dG);
                }
                if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[56]];
                    g.a(llIIIlllIl[llIIlIIIIl[57]], cE);
                }
            }
            if (!x.lIlIlIIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[18]) || x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[2])) {
                if (x.lIlIlIIIllIll(di, llIIlIIIIl[0])) {
                    aN.sn += llIIlIIIIl[0];
                    aN.u(AccBuilderSotf.m);
                    di += llIIlIIIIl[0];
                    aN.sn = llIIlIIIIl[1];
                    dj = llIIlIIIIl[1];
                }
                String[] stringArray = new String[llIIlIIIIl[0]];
                stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[58]];
                if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (x.lIlIlIIlIIIIl(Widgets.get((int)llIIlIIIIl[59]))) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[60]];
                        String[] stringArray8 = new String[llIIlIIIIl[0]];
                        stringArray8[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(llIIIlllIl[llIIlIIIIl[62]]);
                        Time.sleepTicks((int)llIIlIIIIl[6]);

                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[63]];
                        var6 = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[27]);
                        if (x.lIlIlIIlIIIIl(var6)) {
                            var6.interact(llIIIlllIl[llIIlIIIIl[64]]);
                            Time.sleepTicks((int)llIIlIIIIl[0]);

                        }
                        if (x.lIlIlIIlIIIIl(var5 = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[39]))) {
                            var5.interact(llIIIlllIl[llIIlIIIIl[65]]);
                            Time.sleepTicks((int)llIIlIIIIl[5]);

                        }
                    }
                    Time.sleepTicks((int)llIIlIIIIl[0]);

                }
            }
        }
    }

    private static boolean lIlIlIIIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }
}

