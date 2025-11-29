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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.ZHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.AHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.BHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.DHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.FHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.GHelper;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.JHelper;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VHelper
implements K {
    private static  WorldPoint dy;
    public static  boolean bn;
    public static  List<d> bp;

    public static  boolean do;
    public static  boolean dq;
    private static  WorldPoint dw;
    public static  boolean dp;
    static  int dc;
    private static  WorldPoint dt;
    private static  WorldPoint dv;
    private static  WorldPoint ds;
    private static  WorldPoint dx;
    public static  boolean dm;
    static  int dr;
    private static  WorldPoint du;
    static  boolean dd;
    
    public static  boolean dn;

    @Override
    public boolean ac() {
        return lIlllIlIIl[1];
    }

    private static boolean lIIlllIlllIII(int n2) {
        return n2 > 0;
    }

    private static void O() {
        d var1;
        Object var2;
        int[] nArray = new int[lIlllIlIIl[0]];
        nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[9];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(lIlllIlIIl[9], lIlllIlIIl[12], lIlllIlIIl[74]);
            bp.add(d2);

        }
        int[] nArray2 = new int[lIlllIlIIl[0]];
        nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[11];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var2 = new DHelper(lIlllIlIIl[11], lIlllIlIIl[13], j.bZ);
            bp.add((DHelper) ar2);

        }
        if (v.lIIlllIllIlII(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lIlllIIlll[lIlllIlIIl[80]])) ? 1 : 0)) {
            var1 = new DHelper(lIlllIlIIl[75], lIlllIlIIl[13], lIlllIlIIl[76]);
            bp.add(var1);

        }
        int[] nArray3 = new int[lIlllIlIIl[0]];
        nArray3[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var1 = new DHelper(lIlllIlIIl[7], lIlllIlIIl[53], lIlllIlIIl[74]);
            bp.add(var1);

        }
        int[] nArray4 = new int[lIlllIlIIl[0]];
        nArray4[v.lIlllIlIIl[1]] = lIlllIlIIl[8];
        if (v.lIIlllIllIlII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var1 = new DHelper(lIlllIlIIl[8], lIlllIlIIl[12], lIlllIlIIl[74]);
            bp.add(var1);

        }
    }

    private static boolean lIIlllIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var3);
    }

    static {
        v.lIIlllIllIIIl();
        v.lIIlllIllIIII();
        bp = new ArrayList<d>();
        dr = lIlllIlIIl[1];
        ds = new WorldPoint(lIlllIlIIl[91], lIlllIlIIl[92], lIlllIlIIl[1]);
        dt = new WorldPoint(lIlllIlIIl[93], lIlllIlIIl[94], lIlllIlIIl[1]);
        du = new WorldPoint(lIlllIlIIl[95], lIlllIlIIl[96], lIlllIlIIl[1]);
        dv = new WorldPoint(lIlllIlIIl[97], lIlllIlIIl[98], lIlllIlIIl[1]);
        dw = new WorldPoint(lIlllIlIIl[99], lIlllIlIIl[100], lIlllIlIIl[1]);
        dx = new WorldPoint(lIlllIlIIl[101], lIlllIlIIl[102], lIlllIlIIl[1]);
        dy = new WorldPoint(lIlllIlIIl[103], lIlllIlIIl[104], lIlllIlIIl[1]);
        String[] stringArray = new String[lIlllIlIIl[33]];
        stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[105]];
        stringArray[v.lIlllIlIIl[0]] = lIlllIIlll[lIlllIlIIl[106]];
        stringArray[v.lIlllIlIIl[5]] = lIlllIIlll[lIlllIlIIl[107]];
        stringArray[v.lIlllIlIIl[10]] = lIlllIIlll[lIlllIlIIl[108]];
        stringArray[v.lIlllIlIIl[6]] = lIlllIIlll[lIlllIlIIl[109]];
        stringArray[v.lIlllIlIIl[13]] = lIlllIIlll[lIlllIlIIl[110]];
        stringArray[v.lIlllIlIIl[17]] = lIlllIIlll[lIlllIlIIl[111]];
        stringArray[v.lIlllIlIIl[18]] = lIlllIIlll[lIlllIlIIl[112]];
        stringArray[v.lIlllIlIIl[2]] = lIlllIIlll[lIlllIlIIl[113]];
        stringArray[v.lIlllIlIIl[24]] = lIlllIIlll[lIlllIlIIl[114]];
        stringArray[v.lIlllIlIIl[12]] = lIlllIIlll[lIlllIlIIl[115]];
        stringArray[v.lIlllIlIIl[25]] = lIlllIIlll[lIlllIlIIl[116]];
        stringArray[v.lIlllIlIIl[15]] = lIlllIIlll[lIlllIlIIl[117]];
        stringArray[v.lIlllIlIIl[26]] = lIlllIIlll[lIlllIlIIl[118]];
        stringArray[v.lIlllIlIIl[27]] = lIlllIIlll[lIlllIlIIl[119]];
        stringArray[v.lIlllIlIIl[28]] = lIlllIIlll[lIlllIlIIl[120]];
        stringArray[v.lIlllIlIIl[29]] = lIlllIIlll[lIlllIlIIl[121]];
        stringArray[v.lIlllIlIIl[30]] = lIlllIIlll[lIlllIlIIl[122]];
        stringArray[v.lIlllIlIIl[31]] = lIlllIIlll[lIlllIlIIl[123]];
        stringArray[v.lIlllIlIIl[32]] = lIlllIIlll[lIlllIlIIl[124]];
        cy = stringArray;
    }

    private static boolean lIIlllIlllIll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public int ad() {
        try {
            v.bf();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 > (0x91 ^ 0xA2 ^ (0x28 ^ 0x1F))) {
            return (0xE7 ^ 0xB1 ^ (0x6D ^ 0x2F)) & (0x98 ^ 0x96 ^ (0x4F ^ 0x55) ^ -1);
        }
        return lIlllIlIIl[77];
    }

    private static boolean lIIlllIllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIllIlll(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean af() {
        int n2;
        if (v.lIIlllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[24])) {
            String[] stringArray = new String[lIlllIlIIl[0]];
            stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[79]];
            if (v.lIIlllIllIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = lIlllIlIIl[0];

                if (((0x48 ^ 1) & ~(0x79 ^ 0x30)) >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIlllIlIIl[1];
        return n2 != 0;
    }

    private static void lIIlllIllIIII() {
        lIlllIIlll = new String[lIlllIlIIl[125]];
        v.lIlllIIlll[v.lIlllIlIIl[1]] = "Finished buying items, switching back to quest";
        v.lIlllIIlll[v.lIlllIlIIl[0]] = "Nav to bank";
        v.lIlllIIlll[v.lIlllIlIIl[5]] = "Handling banking";
        v.lIlllIIlll[v.lIlllIlIIl[10]] = "We are missing quest supplies, switching to BUYING";
        v.lIlllIIlll[v.lIlllIlIIl[6]] = "Eat";
        v.lIlllIIlll[v.lIlllIlIIl[13]] = "Drink";
        v.lIlllIIlll[v.lIlllIlIIl[17]] = "Nav to start";
        v.lIlllIIlll[v.lIlllIlIIl[18]] = "Starting quest";
        v.lIlllIIlll[v.lIlllIlIIl[2]] = "Veos";
        v.lIlllIIlll[v.lIlllIlIIl[24]] = "Enchanted scroll";
        v.lIlllIIlll[v.lIlllIlIIl[12]] = "Feather";
        v.lIlllIIlll[v.lIlllIlIIl[25]] = "Enchanted quill";
        v.lIlllIIlll[v.lIlllIlIIl[15]] = "Enchanted scroll";
        v.lIlllIIlll[v.lIlllIlIIl[26]] = "Feather";
        v.lIlllIIlll[v.lIlllIlIIl[27]] = "Enchanted quill";
        v.lIlllIIlll[v.lIlllIlIIl[28]] = "Nav to pisc tile";
        v.lIlllIIlll[v.lIlllIlIIl[29]] = "Talking pisc";
        v.lIlllIIlll[v.lIlllIlIIl[30]] = "Leenz";
        v.lIlllIIlll[v.lIlllIlIIl[31]] = "Finished pisc";
        v.lIlllIIlll[v.lIlllIlIIl[32]] = "Nav to arc tile";
        v.lIlllIIlll[v.lIlllIlIIl[33]] = "Talking arc";
        v.lIlllIIlll[v.lIlllIlIIl[34]] = "Regath";
        v.lIlllIIlll[v.lIlllIlIIl[35]] = "Finished arc";
        v.lIlllIIlll[v.lIlllIlIIl[36]] = "Nav to lova tile";
        v.lIlllIIlll[v.lIlllIlIIl[37]] = "Talking lova";
        v.lIlllIIlll[v.lIlllIlIIl[38]] = "Munty";
        v.lIlllIIlll[v.lIlllIlIIl[39]] = "Finished munty";
        v.lIlllIIlll[v.lIlllIlIIl[40]] = "Nav to shyzien tile";
        v.lIlllIIlll[v.lIlllIlIIl[41]] = "Talking shyzien";
        v.lIlllIIlll[v.lIlllIlIIl[42]] = "Jennifer";
        v.lIlllIIlll[v.lIlllIlIIl[43]] = "Finished shyzien";
        v.lIlllIIlll[v.lIlllIlIIl[44]] = "Nav to hosidius tile";
        v.lIlllIIlll[v.lIlllIlIIl[45]] = "Talking hosidius";
        v.lIlllIIlll[v.lIlllIlIIl[46]] = "Horace";
        v.lIlllIIlll[v.lIlllIlIIl[47]] = "Finished hosidius";
        v.lIlllIIlll[v.lIlllIlIIl[48]] = "Nav to start";
        v.lIlllIIlll[v.lIlllIlIIl[49]] = "talking veos";
        v.lIlllIIlll[v.lIlllIlIIl[50]] = "Veos";
        v.lIlllIIlll[v.lIlllIlIIl[51]] = "Nav to dark altar";
        v.lIlllIIlll[v.lIlllIlIIl[52]] = "Mysterious orb";
        v.lIlllIIlll[v.lIlllIlIIl[53]] = "Mysterious orb";
        v.lIlllIIlll[v.lIlllIlIIl[54]] = "Activate";
        v.lIlllIIlll[v.lIlllIlIIl[55]] = "Nav to start";
        v.lIlllIIlll[v.lIlllIlIIl[56]] = "talking veos";
        v.lIlllIIlll[v.lIlllIlIIl[57]] = "Veos";
        v.lIlllIIlll[v.lIlllIlIIl[58]] = "Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[60]] = "Rubbing lamp";
        v.lIlllIIlll[v.lIlllIlIIl[61]] = "Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[62]] = "Rub";
        v.lIlllIIlll[v.lIlllIlIIl[63]] = "Selecting slayer";
        v.lIlllIIlll[v.lIlllIlIIl[64]] = "Slayer";
        v.lIlllIIlll[v.lIlllIlIIl[65]] = "Confirm";
        v.lIlllIIlll[v.lIlllIlIIl[66]] = "Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[67]] = "Rubbing lamp";
        v.lIlllIIlll[v.lIlllIlIIl[68]] = "Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[69]] = "Rub";
        v.lIlllIIlll[v.lIlllIlIIl[70]] = "Selecting slayer";
        v.lIlllIIlll[v.lIlllIlIIl[71]] = "Slayer";
        v.lIlllIIlll[v.lIlllIlIIl[72]] = "Confirm";
        v.lIlllIIlll[v.lIlllIlIIl[73]] = "Feather";
        v.lIlllIIlll[v.lIlllIlIIl[78]] = "Client of Kourend";
        v.lIlllIIlll[v.lIlllIlIIl[79]] = "Antique lamp";
        v.lIlllIIlll[v.lIlllIlIIl[80]] = "ring of wealth (";
        v.lIlllIIlll[v.lIlllIlIIl[81]] = "Can I ask you about Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[82]] = "let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[16]] = "Let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[83]] = "Can I ask you about Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[84]] = "Let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[85]] = "Can I ask you about Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[86]] = "Let's trade.";
        v.lIlllIIlll[v.lIlllIlIIl[87]] = "Can I ask you about Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[88]] = "I don't need anything.";
        v.lIlllIIlll[v.lIlllIlIIl[89]] = "Can I ask you about Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[90]] = "I don't need anything right now.";
        v.lIlllIIlll[v.lIlllIlIIl[105]] = "Have you got any quests for me?";
        v.lIlllIIlll[v.lIlllIlIIl[106]] = "Yes.";
        v.lIlllIIlll[v.lIlllIlIIl[107]] = "yes.";
        v.lIlllIIlll[v.lIlllIlIIl[108]] = "Can I ask you about Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[109]] = "Why should I gain favour with Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[110]] = "Can I ask you about Port Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[111]] = "Can I ask you about Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[112]] = "Why should I gain favour with Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[113]] = "Can I ask you about Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[114]] = "Why should I gain favour with Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[115]] = "Can I ask you about Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[116]] = "Why should I gain favour with Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[117]] = "Can I ask you about Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[118]] = "Why should I gain favour with Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[119]] = "What is there to do in Port Piscarilius?";
        v.lIlllIIlll[v.lIlllIlIIl[120]] = "What is there to do in Arceuus?";
        v.lIlllIIlll[v.lIlllIlIIl[121]] = "What is there to do in Lovakengj?";
        v.lIlllIIlll[v.lIlllIlIIl[122]] = "What is there to do in Shayzien?";
        v.lIlllIIlll[v.lIlllIlIIl[123]] = "What is there to do in Hosidius?";
        v.lIlllIIlll[v.lIlllIlIIl[124]] = "Let's talk about your client...";
    }

    private static boolean lIIlllIllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlllIllIllI(int n2, int n3) {
        return n2 == n3;
    }

    public static void bg() {
        String[] stringArray = new String[lIlllIlIIl[0]];
        stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[66]];
        if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (v.lIIlllIllIlll(Widgets.get((int)lIlllIlIIl[59]))) {
                Widget var4;
                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[67]];
                String[] stringArray2 = new String[lIlllIlIIl[0]];
                stringArray2[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lIlllIIlll[lIlllIlIIl[69]]);
                Time.sleepTicks((int)lIlllIlIIl[6]);

                AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[70]];
                Widget widget = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[27]);
                if (v.lIIlllIllIlll(widget)) {
                    widget.interact(lIlllIIlll[lIlllIlIIl[71]]);
                    Time.sleepTicks((int)lIlllIlIIl[0]);

                }
                if (v.lIIlllIllIlll(var4 = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[39]))) {
                    var4.interact(lIlllIIlll[lIlllIlIIl[72]]);
                    Time.sleepTicks((int)lIlllIlIIl[5]);

                }
            }
            Time.sleepTicks((int)lIlllIlIIl[0]);

        }
    }

    public static void bf() {
        block80: {
            Widget var5;
            Object var6;
            block82: {
                block81: {
                    if (v.lIIlllIllIIlI(bn ? 1 : 0)) {
                        b.a(bp);
                        if (v.lIIlllIllIIll(bp.size(), lIlllIlIIl[0])) {
                            System.out.println(lIlllIIlll[lIlllIlIIl[1]]);
                            bn = lIlllIlIIl[1];
                        }
                    }
                    if (!v.lIIlllIllIlII(bn ? 1 : 0)) break block80;
                    if (!v.lIIlllIllIlIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) break block81;
                    int[] nArray = new int[lIlllIlIIl[0]];
                    nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[3];
                    if (!v.lIIlllIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                J.cL();
            }
            if (v.lIIlllIllIlII(v.al() ? 1 : 0) && v.lIIlllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0]) && v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] nArray = new int[lIlllIlIIl[0]];
                nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[3];
                if (v.lIIlllIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    var6 = BankLocation.getNearest();
                    if (v.lIIlllIllIlll(var6) && v.lIIlllIllIlII(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[0]];
                        a.a((BankLocation)var6);
                    }
                    if (v.lIIlllIllIlll(var6) && v.lIIlllIllIIlI(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (v.lIIlllIllIlII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)lIlllIlIIl[4]);

                        }
                        if (v.lIIlllIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[5]];
                            if (v.lIIlllIlllIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIlllIlIIl[6]);

                            }
                            if (v.lIIlllIlllIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIlllIlIIl[5]);

                            }
                            int[] nArray2 = new int[lIlllIlIIl[6]];
                            nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
                            nArray2[v.lIlllIlIIl[0]] = lIlllIlIIl[8];
                            nArray2[v.lIlllIlIIl[5]] = lIlllIlIIl[9];
                            nArray2[v.lIlllIlIIl[10]] = lIlllIlIIl[11];
                            if (v.lIIlllIllIlII(e.b(nArray2) ? 1 : 0)) {
                                v.O();
                                System.out.println(lIlllIIlll[lIlllIlIIl[10]]);
                                bn = lIlllIlIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[lIlllIlIIl[6]];
                            nArray3[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
                            nArray3[v.lIlllIlIIl[0]] = lIlllIlIIl[8];
                            nArray3[v.lIlllIlIIl[5]] = lIlllIlIIl[9];
                            nArray3[v.lIlllIlIIl[10]] = lIlllIlIIl[11];
                            if (v.lIIlllIllIIlI(e.b(nArray3) ? 1 : 0)) {
                                a.a(lIlllIlIIl[7], lIlllIlIIl[12]);
                                a.a(lIlllIlIIl[8], lIlllIlIIl[12]);
                                a.a(lIlllIlIIl[9], lIlllIlIIl[0]);
                                a.a(lIlllIlIIl[11], lIlllIlIIl[13]);
                                a.a(lIlllIlIIl[14], lIlllIlIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[lIlllIlIIl[0]];
            nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[14];
            if (v.lIIlllIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0) && v.lIIlllIllIlIl(Combat.getMissingHealth(), lIlllIlIIl[15])) {
                int[] nArray4 = new int[lIlllIlIIl[0]];
                nArray4[v.lIlllIlIIl[1]] = lIlllIlIIl[14];
                Inventory.getFirst((int[])nArray4).interact(lIlllIIlll[lIlllIlIIl[6]]);
                Time.sleepTicks((int)lIlllIlIIl[5]);

            }
            if (v.lIIlllIllIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && v.lIIlllIllIIll(Movement.getRunEnergy(), lIlllIlIIl[16])) {
                Inventory.getFirst((int[])f.aU).interact(lIlllIIlll[lIlllIlIIl[13]]);
                Time.sleepTicks((int)lIlllIlIIl[0]);

            }
            if (v.lIIlllIllIIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0]) && v.lIIlllIllIIlI(v.al() ? 1 : 0) && v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlllIlIIl[2])) {
                int[] nArray5 = new int[lIlllIlIIl[0]];
                nArray5[v.lIlllIlIIl[1]] = lIlllIlIIl[3];
                if (v.lIIlllIllIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (v.lIIlllIllIlII(Players.getLocal().getWorldLocation().equals((Object)ds) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[17]];
                        if (v.lIIlllIllIIlI(Dialog.isOpen() ? 1 : 0) && v.lIIlllIllIIll(dr, lIlllIlIIl[5])) {
                            Dialog.close();
                            dr += lIlllIlIIl[0];
                        }
                        e.a(ds);
                    }
                    if (v.lIIlllIllIIlI(Players.getLocal().getWorldLocation().equals((Object)ds) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[18]];
                        g.a(lIlllIIlll[lIlllIlIIl[2]], cy);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)lIlllIlIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)lIlllIlIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)lIlllIlIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)lIlllIlIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)lIlllIlIIl[23]));
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[19]), lIlllIlIIl[0])) {
                dm = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[20]), lIlllIlIIl[0])) {
                dn = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[21]), lIlllIlIIl[0])) {
                do = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[22]), lIlllIlIIl[0])) {
                dp = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)lIlllIlIIl[23]), lIlllIlIIl[0])) {
                dq = lIlllIlIIl[0];
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[0])) {
                int var7;
                dc = lIlllIlIIl[1];
                if (v.lIIlllIllIlII(dm ? 1 : 0)) {
                    String[] stringArray = new String[lIlllIlIIl[0]];
                    stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[24]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[lIlllIlIIl[0]];
                        stringArray2[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[12]];
                        if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lIlllIlIIl[0]];
                            stringArray3[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[25]];
                            if (v.lIIlllIllIlII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[lIlllIlIIl[0]];
                                stringArray4[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[15]];
                                String[] stringArray5 = new String[lIlllIlIIl[0]];
                                stringArray5[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)lIlllIlIIl[5]);

                            }
                        }
                    }
                    String[] stringArray6 = new String[lIlllIlIIl[0]];
                    stringArray6[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[27]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[28]];
                            Movement.walkTo((WorldPoint)dt);

                            Time.sleepTicks((int)lIlllIlIIl[0]);

                        }
                        if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dt), lIlllIlIIl[2])) {
                            AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[29]];
                            g.a(lIlllIIlll[lIlllIlIIl[30]], cy, lIlllIlIIl[0]);
                            Time.sleepTicks((int)lIlllIlIIl[0]);

                            var6 = Dialog.getOptions();
                            var5 = new ArrayList();
                            if (v.lIIlllIllIlII(var6.isEmpty() ? 1 : 0)) {
                                var7 = lIlllIlIIl[1];
                                while (v.lIIlllIllIIll(var7, var6.size())) {
                                    var5.add(((Widget)var6.get(var7)).getText());

                                    ++var7;

                                    if (((0x90 ^ 0xAA) & ~(0x14 ^ 0x2E)) >= -1) continue;
                                    return;
                                }
                                var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[90]])) ? 1 : 0;
                                int n2 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[89]]));
                                if (v.lIIlllIllIIlI(var7) && v.lIIlllIllIIlI(n2)) {
                                    System.out.println(lIlllIIlll[lIlllIlIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[32]];
                        Movement.walkTo((WorldPoint)du);

                        Time.sleepTicks((int)lIlllIlIIl[0]);

                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(du), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[33]];
                        g.a(lIlllIIlll[lIlllIlIIl[34]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (v.lIIlllIllIlII(var6.isEmpty() ? 1 : 0)) {
                            var7 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (((0x15 ^ 0x27) & ~(0x6D ^ 0x5F)) == 0) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[88]])) ? 1 : 0;
                            int n3 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[87]]));
                            if (v.lIIlllIllIIlI(var7) && v.lIIlllIllIIlI(n3)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[35]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[36]];
                        Movement.walkTo((WorldPoint)dv);

                        Time.sleepTicks((int)lIlllIlIIl[0]);

                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dv), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[37]];
                        g.a(lIlllIIlll[lIlllIlIIl[38]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (v.lIIlllIllIlII(var6.isEmpty() ? 1 : 0)) {
                            var7 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (3 >= 0) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[86]])) ? 1 : 0;
                            int n4 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[85]]));
                            if (v.lIIlllIllIIlI(var7) && v.lIIlllIllIIlI(n4)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[39]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dp ? 1 : 0) && v.lIIlllIllIIlI(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[40]];
                        Movement.walkTo((WorldPoint)dw);

                        Time.sleepTicks((int)lIlllIlIIl[0]);

                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dw), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[41]];
                        g.a(lIlllIIlll[lIlllIlIIl[42]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (v.lIIlllIllIlII(var6.isEmpty() ? 1 : 0)) {
                            var7 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (((0x83 ^ 0x94 ^ (0x14 ^ 0x25)) & (125 + 41 - 83 + 81 ^ 104 + 120 - 162 + 68 ^ -1)) <= 0) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[84]])) ? 1 : 0;
                            int n5 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[83]]));
                            if (v.lIIlllIllIIlI(var7) && v.lIIlllIllIIlI(n5)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[43]]);
                            }
                        }
                    }
                }
                if (v.lIIlllIllIlII(dq ? 1 : 0) && v.lIIlllIllIIlI(dp ? 1 : 0) && v.lIIlllIllIIlI(do ? 1 : 0) && v.lIIlllIllIIlI(dn ? 1 : 0) && v.lIIlllIllIIlI(dm ? 1 : 0)) {
                    if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[44]];
                        Movement.walkTo((WorldPoint)dx);

                        Time.sleepTicks((int)lIlllIlIIl[0]);

                    }
                    if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dx), lIlllIlIIl[18])) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[45]];
                        g.a(lIlllIIlll[lIlllIlIIl[46]], cy, lIlllIlIIl[0]);
                        Time.sleepTicks((int)lIlllIlIIl[0]);

                        var6 = Dialog.getOptions();
                        var5 = new ArrayList();
                        if (v.lIIlllIllIlII(var6.isEmpty() ? 1 : 0)) {
                            var7 = lIlllIlIIl[1];
                            while (v.lIIlllIllIIll(var7, var6.size())) {
                                var5.add(((Widget)var6.get(var7)).getText());

                                ++var7;

                                if (((2 ^ 0x14) & ~(0x9B ^ 0x8D)) == 0) continue;
                                return;
                            }
                            var7 = var5.stream().anyMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[16]])) ? 1 : 0;
                            int n6 = var5.stream().anyMatch(string -> string.contains(lIlllIIlll[lIlllIlIIl[82]]));
                            int n7 = var5.stream().noneMatch(string -> string.equalsIgnoreCase(lIlllIIlll[lIlllIlIIl[81]]));
                            if ((!v.lIIlllIllIlII(var7) || v.lIIlllIllIIlI(n6)) && v.lIIlllIllIIlI(n7)) {
                                System.out.println(lIlllIIlll[lIlllIlIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[5])) {
                if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[48]];
                    if (v.lIIlllIllIIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(ds);
                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[49]];
                    g.a(lIlllIIlll[lIlllIlIIl[50]], cy);
                }
            }
            if (!v.lIIlllIlllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[10]) || v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[17])) {
                g.a(cy);
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[6])) {
                if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[51]];
                    Movement.walkTo((WorldPoint)dy);

                    Time.sleepTicks((int)lIlllIlIIl[0]);

                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(dy), lIlllIlIIl[6])) {
                    String[] stringArray = new String[lIlllIlIIl[0]];
                    stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[52]];
                    if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[lIlllIlIIl[0]];
                        stringArray7[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lIlllIIlll[lIlllIlIIl[54]]);
                        Time.sleepTicks((int)lIlllIlIIl[10]);

                    }
                }
            }
            if (v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[13])) {
                if (v.lIIlllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[55]];
                    e.a(ds);
                }
                if (v.lIIlllIlllIlI(Players.getLocal().getWorldLocation().distanceTo(ds), lIlllIlIIl[5])) {
                    AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[56]];
                    g.a(lIlllIIlll[lIlllIlIIl[57]], cy);
                }
            }
            if (!v.lIIlllIlllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[18]) || v.lIIlllIllIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIlllIlIIl[2])) {
                if (v.lIIlllIllIIll(dc, lIlllIlIIl[0])) {
                    Z.nu += lIlllIlIIl[0];
                    Z.p(AccBuilderShamans.m);
                    dc += lIlllIlIIl[0];
                    Z.nu = lIlllIlIIl[1];
                    dd = lIlllIlIIl[1];
                }
                String[] stringArray = new String[lIlllIlIIl[0]];
                stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[58]];
                if (v.lIIlllIllIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (v.lIIlllIllIlll(Widgets.get((int)lIlllIlIIl[59]))) {
                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[60]];
                        String[] stringArray8 = new String[lIlllIlIIl[0]];
                        stringArray8[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(lIlllIIlll[lIlllIlIIl[62]]);
                        Time.sleepTicks((int)lIlllIlIIl[6]);

                        AccBuilderShamans.c = lIlllIIlll[lIlllIlIIl[63]];
                        var6 = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[27]);
                        if (v.lIIlllIllIlll(var6)) {
                            var6.interact(lIlllIIlll[lIlllIlIIl[64]]);
                            Time.sleepTicks((int)lIlllIlIIl[0]);

                        }
                        if (v.lIIlllIllIlll(var5 = Widgets.get((int)lIlllIlIIl[59], (int)lIlllIlIIl[39]))) {
                            var5.interact(lIlllIIlll[lIlllIlIIl[65]]);
                            Time.sleepTicks((int)lIlllIlIIl[5]);

                        }
                    }
                    Time.sleepTicks((int)lIlllIlIIl[0]);

                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIlllIlIIl[0]];
        stringArray[v.lIlllIlIIl[1]] = lIlllIIlll[lIlllIlIIl[73]];
        if (v.lIIlllIlllIII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIlllIlIIl[0]];
            nArray[v.lIlllIlIIl[1]] = lIlllIlIIl[7];
            if (v.lIIlllIlllIII(Inventory.getCount((int[])nArray)) && v.lIIlllIlllIII(Inventory.getCount((int[])f.aU))) {
                int[] nArray2 = new int[lIlllIlIIl[0]];
                nArray2[v.lIlllIlIIl[1]] = lIlllIlIIl[8];
                if (v.lIIlllIlllIII(Inventory.getCount((int[])nArray2))) {
                    n2 = lIlllIlIIl[0];

                    if (3 >= 3) return n2 != 0;
                    return ((0x74 ^ 0x65 ^ (0x16 ^ 0x57)) & (164 + 197 - 311 + 166 ^ 104 + 109 - 168 + 91 ^ -1)) != 0;
                }
            }
        }
        n2 = lIlllIlIIl[1];
        return n2 != 0;
    }

    @Override
    public String ae() {
        return lIlllIIlll[lIlllIlIIl[78]];
    }
}

