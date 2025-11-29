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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.QHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.AHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.BHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.DHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.FHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.GHelper;
import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.IHelper;
import gg.squire.account.AccBuilderBarrows;
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

public class RHelper
implements F {
    public static  boolean cs;
    
    public static  boolean bz;
    
    private static  WorldPoint cC;
    
    private static  WorldPoint cz;
    static  boolean cj;
    private static  WorldPoint cD;
    public static  boolean ct;
    public static  List<d> bB;
    private static  WorldPoint cA;
    public static  boolean cu;
    static  int ci;
    static  int cx;
    public static  boolean cw;
    private static  WorldPoint cy;
    private static  WorldPoint cB;
    public static  boolean cv;
    private static  WorldPoint cE;

    private static boolean llIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllllI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        r.llIlIIlIlII();
        r.llIlIIlIIll();
        bB = new ArrayList<d>();
        cx = llllllll[1];
        cy = new WorldPoint(llllllll[91], llllllll[92], llllllll[1]);
        cz = new WorldPoint(llllllll[93], llllllll[94], llllllll[1]);
        cA = new WorldPoint(llllllll[95], llllllll[96], llllllll[1]);
        cB = new WorldPoint(llllllll[97], llllllll[98], llllllll[1]);
        cC = new WorldPoint(llllllll[99], llllllll[100], llllllll[1]);
        cD = new WorldPoint(llllllll[101], llllllll[102], llllllll[1]);
        cE = new WorldPoint(llllllll[103], llllllll[104], llllllll[1]);
        String[] stringArray = new String[llllllll[33]];
        stringArray[r.llllllll[1]] = llllllIl[llllllll[105]];
        stringArray[r.llllllll[0]] = llllllIl[llllllll[106]];
        stringArray[r.llllllll[5]] = llllllIl[llllllll[107]];
        stringArray[r.llllllll[10]] = llllllIl[llllllll[108]];
        stringArray[r.llllllll[6]] = llllllIl[llllllll[109]];
        stringArray[r.llllllll[13]] = llllllIl[llllllll[110]];
        stringArray[r.llllllll[17]] = llllllIl[llllllll[111]];
        stringArray[r.llllllll[18]] = llllllIl[llllllll[112]];
        stringArray[r.llllllll[2]] = llllllIl[llllllll[113]];
        stringArray[r.llllllll[24]] = llllllIl[llllllll[114]];
        stringArray[r.llllllll[12]] = llllllIl[llllllll[115]];
        stringArray[r.llllllll[25]] = llllllIl[llllllll[116]];
        stringArray[r.llllllll[15]] = llllllIl[llllllll[117]];
        stringArray[r.llllllll[26]] = llllllIl[llllllll[118]];
        stringArray[r.llllllll[27]] = llllllIl[llllllll[119]];
        stringArray[r.llllllll[28]] = llllllIl[llllllll[120]];
        stringArray[r.llllllll[29]] = llllllIl[llllllll[121]];
        stringArray[r.llllllll[30]] = llllllIl[llllllll[122]];
        stringArray[r.llllllll[31]] = llllllIl[llllllll[123]];
        stringArray[r.llllllll[32]] = llllllIl[llllllll[124]];
        bX = stringArray;
    }

    private static boolean llIlIIllIlI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[llllllll[0]];
        stringArray[r.llllllll[1]] = llllllIl[llllllll[73]];
        if (r.llIlIIllIll(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllllll[0]];
            nArray[r.llllllll[1]] = llllllll[7];
            if (r.llIlIIllIll(Inventory.getCount((int[])nArray)) && r.llIlIIllIll(Inventory.getCount((int[])f.bb))) {
                int[] nArray2 = new int[llllllll[0]];
                nArray2[r.llllllll[1]] = llllllll[8];
                if (r.llIlIIllIll(Inventory.getCount((int[])nArray2))) {
                    n2 = llllllll[0];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llllllll[1];
        return n2 != 0;
    }

    private static boolean llIlIIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void ag() {
        d lIIllIIIIlIIIII;
        Object lIIllIIIIlIIIIl;
        int[] nArray = new int[llllllll[0]];
        nArray[r.llllllll[1]] = llllllll[9];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new DHelper(llllllll[9], llllllll[12], llllllll[74]);
            bB.add(d2);

        }
        int[] nArray2 = new int[llllllll[0]];
        nArray2[r.llllllll[1]] = llllllll[11];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllIIIIlIIIIl = new DHelper(llllllll[11], llllllll[13], i.bw);
            bB.add((DHelper) IIllIIIIlIIIIl);

        }
        if (r.llIlIIlIlll(Bank.contains(lIIllIIIIlIIIIl = item -> item.getName().toLowerCase().contains(llllllIl[llllllll[80]])) ? 1 : 0)) {
            lIIllIIIIlIIIII = new DHelper(llllllll[75], llllllll[13], llllllll[76]);
            bB.add(lIIllIIIIlIIIII);

        }
        int[] nArray3 = new int[llllllll[0]];
        nArray3[r.llllllll[1]] = llllllll[7];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllIIIIlIIIII = new DHelper(llllllll[7], llllllll[53], llllllll[74]);
            bB.add(lIIllIIIIlIIIII);

        }
        int[] nArray4 = new int[llllllll[0]];
        nArray4[r.llllllll[1]] = llllllll[8];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllIIIIlIIIII = new DHelper(llllllll[8], llllllll[12], llllllll[74]);
            bB.add(lIIllIIIIlIIIII);

        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean W() {
        int n2;
        if (r.llIlIIllIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[24])) {
            String[] stringArray = new String[llllllll[0]];
            stringArray[r.llllllll[1]] = llllllIl[llllllll[79]];
            if (r.llIlIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llllllll[0];

                if ((0x47 ^ 0x13 ^ (0x55 ^ 5)) >= 1) return n2 != 0;
                return ((0xF6 ^ 0x80 ^ (0x3A ^ 0x7D)) & (0xE3 ^ 0xC2 ^ (0xBE ^ 0xAE) ^ -1)) != 0;
            }
        }
        n2 = llllllll[1];
        return n2 != 0;
    }

    public static void aG() {
        String[] stringArray = new String[llllllll[0]];
        stringArray[r.llllllll[1]] = llllllIl[llllllll[66]];
        if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (r.llIlIIllIlI(Widgets.get((int)llllllll[59]))) {
                Widget lIIllIIIIlIIlII;
                AccBuilderBarrows.c = llllllIl[llllllll[67]];
                String[] stringArray2 = new String[llllllll[0]];
                stringArray2[r.llllllll[1]] = llllllIl[llllllll[68]];
                Inventory.getFirst((String[])stringArray2).interact(llllllIl[llllllll[69]]);
                Time.sleepTicks((int)llllllll[6]);

                AccBuilderBarrows.c = llllllIl[llllllll[70]];
                Widget widget = Widgets.get((int)llllllll[59], (int)llllllll[27]);
                if (r.llIlIIllIlI(widget)) {
                    widget.interact(llllllIl[llllllll[71]]);
                    Time.sleepTicks((int)llllllll[0]);

                }
                if (r.llIlIIllIlI(lIIllIIIIlIIlII = Widgets.get((int)llllllll[59], (int)llllllll[39]))) {
                    lIIllIIIIlIIlII.interact(llllllIl[llllllll[72]]);
                    Time.sleepTicks((int)llllllll[5]);

                }
            }
            Time.sleepTicks((int)llllllll[0]);

        }
    }

    private static void llIlIIlIIll() {
        llllllIl = new String[llllllll[125]];
        r.llllllIl[r.llllllll[1]] = "Finished buying items, switching back to quest";
        r.llllllIl[r.llllllll[0]] = "Nav to bank";
        r.llllllIl[r.llllllll[5]] = "Handling banking";
        r.llllllIl[r.llllllll[10]] = "We are missing quest supplies, switching to BUYING";
        r.llllllIl[r.llllllll[6]] = "Eat";
        r.llllllIl[r.llllllll[13]] = "Drink";
        r.llllllIl[r.llllllll[17]] = "Nav to start";
        r.llllllIl[r.llllllll[18]] = "Starting quest";
        r.llllllIl[r.llllllll[2]] = "Veos";
        r.llllllIl[r.llllllll[24]] = "Enchanted scroll";
        r.llllllIl[r.llllllll[12]] = "Feather";
        r.llllllIl[r.llllllll[25]] = "Enchanted quill";
        r.llllllIl[r.llllllll[15]] = "Enchanted scroll";
        r.llllllIl[r.llllllll[26]] = "Feather";
        r.llllllIl[r.llllllll[27]] = "Enchanted quill";
        r.llllllIl[r.llllllll[28]] = "Nav to pisc tile";
        r.llllllIl[r.llllllll[29]] = "Talking pisc";
        r.llllllIl[r.llllllll[30]] = "Leenz";
        r.llllllIl[r.llllllll[31]] = "Finished pisc";
        r.llllllIl[r.llllllll[32]] = "Nav to arc tile";
        r.llllllIl[r.llllllll[33]] = "Talking arc";
        r.llllllIl[r.llllllll[34]] = "Regath";
        r.llllllIl[r.llllllll[35]] = "Finished arc";
        r.llllllIl[r.llllllll[36]] = "Nav to lova tile";
        r.llllllIl[r.llllllll[37]] = "Talking lova";
        r.llllllIl[r.llllllll[38]] = "Munty";
        r.llllllIl[r.llllllll[39]] = "Finished munty";
        r.llllllIl[r.llllllll[40]] = "Nav to shyzien tile";
        r.llllllIl[r.llllllll[41]] = "Talking shyzien";
        r.llllllIl[r.llllllll[42]] = "Jennifer";
        r.llllllIl[r.llllllll[43]] = "Finished shyzien";
        r.llllllIl[r.llllllll[44]] = "Nav to hosidius tile";
        r.llllllIl[r.llllllll[45]] = "Talking hosidius";
        r.llllllIl[r.llllllll[46]] = "Horace";
        r.llllllIl[r.llllllll[47]] = "Finished hosidius";
        r.llllllIl[r.llllllll[48]] = "Nav to start";
        r.llllllIl[r.llllllll[49]] = "talking veos";
        r.llllllIl[r.llllllll[50]] = "Veos";
        r.llllllIl[r.llllllll[51]] = "Nav to dark altar";
        r.llllllIl[r.llllllll[52]] = "Mysterious orb";
        r.llllllIl[r.llllllll[53]] = "Mysterious orb";
        r.llllllIl[r.llllllll[54]] = "Activate";
        r.llllllIl[r.llllllll[55]] = "Nav to start";
        r.llllllIl[r.llllllll[56]] = "talking veos";
        r.llllllIl[r.llllllll[57]] = "Veos";
        r.llllllIl[r.llllllll[58]] = "Antique lamp";
        r.llllllIl[r.llllllll[60]] = "Rubbing lamp";
        r.llllllIl[r.llllllll[61]] = "Antique lamp";
        r.llllllIl[r.llllllll[62]] = "Rub";
        r.llllllIl[r.llllllll[63]] = "Selecting slayer";
        r.llllllIl[r.llllllll[64]] = "Slayer";
        r.llllllIl[r.llllllll[65]] = "Confirm";
        r.llllllIl[r.llllllll[66]] = "Antique lamp";
        r.llllllIl[r.llllllll[67]] = "Rubbing lamp";
        r.llllllIl[r.llllllll[68]] = "Antique lamp";
        r.llllllIl[r.llllllll[69]] = "Rub";
        r.llllllIl[r.llllllll[70]] = "Selecting slayer";
        r.llllllIl[r.llllllll[71]] = "Slayer";
        r.llllllIl[r.llllllll[72]] = "Confirm";
        r.llllllIl[r.llllllll[73]] = "Feather";
        r.llllllIl[r.llllllll[78]] = "Client of Kourend";
        r.llllllIl[r.llllllll[79]] = "Antique lamp";
        r.llllllIl[r.llllllll[80]] = "ring of wealth (";
        r.llllllIl[r.llllllll[81]] = "Can I ask you about Hosidius?";
        r.llllllIl[r.llllllll[82]] = "let's trade.";
        r.llllllIl[r.llllllll[16]] = "Let's trade.";
        r.llllllIl[r.llllllll[83]] = "Can I ask you about Shayzien?";
        r.llllllIl[r.llllllll[84]] = "Let's trade.";
        r.llllllIl[r.llllllll[85]] = "Can I ask you about Lovakengj?";
        r.llllllIl[r.llllllll[86]] = "Let's trade.";
        r.llllllIl[r.llllllll[87]] = "Can I ask you about Arceuus?";
        r.llllllIl[r.llllllll[88]] = "I don't need anything.";
        r.llllllIl[r.llllllll[89]] = "Can I ask you about Port Piscarilius?";
        r.llllllIl[r.llllllll[90]] = "I don't need anything right now.";
        r.llllllIl[r.llllllll[105]] = "Have you got any quests for me?";
        r.llllllIl[r.llllllll[106]] = "Yes.";
        r.llllllIl[r.llllllll[107]] = "yes.";
        r.llllllIl[r.llllllll[108]] = "Can I ask you about Port Piscarilius?";
        r.llllllIl[r.llllllll[109]] = "Why should I gain favour with Port Piscarilius?";
        r.llllllIl[r.llllllll[110]] = "Can I ask you about Port Arceuus?";
        r.llllllIl[r.llllllll[111]] = "Can I ask you about Arceuus?";
        r.llllllIl[r.llllllll[112]] = "Why should I gain favour with Arceuus?";
        r.llllllIl[r.llllllll[113]] = "Can I ask you about Lovakengj?";
        r.llllllIl[r.llllllll[114]] = "Why should I gain favour with Lovakengj?";
        r.llllllIl[r.llllllll[115]] = "Can I ask you about Shayzien?";
        r.llllllIl[r.llllllll[116]] = "Why should I gain favour with Shayzien?";
        r.llllllIl[r.llllllll[117]] = "Can I ask you about Hosidius?";
        r.llllllIl[r.llllllll[118]] = "Why should I gain favour with Hosidius?";
        r.llllllIl[r.llllllll[119]] = "What is there to do in Port Piscarilius?";
        r.llllllIl[r.llllllll[120]] = "What is there to do in Arceuus?";
        r.llllllIl[r.llllllll[121]] = "What is there to do in Lovakengj?";
        r.llllllIl[r.llllllll[122]] = "What is there to do in Shayzien?";
        r.llllllIl[r.llllllll[123]] = "What is there to do in Hosidius?";
        r.llllllIl[r.llllllll[124]] = "Let's talk about your client...";
    }

    private static boolean llIlIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean T() {
        return llllllll[1];
    }

    private static boolean llIlIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlllII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int U() {
        try {
            r.aF();

        }
        catch (Exception exception) {
            // empty catch block
        }
        
        return llllllll[77];
    }

    @Override
    public String V() {
        return llllllIl[llllllll[78]];
    }

    private static boolean llIlIIllIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIIllIIIIIIIlII);
    }

    public static void aF() {
        block80: {
            Widget lIIllIIIIlIlIll;
            Object lIIllIIIIlIllII;
            block82: {
                block81: {
                    if (r.llIlIIlIlIl(bz ? 1 : 0)) {
                        b.a(bB);
                        if (r.llIlIIlIllI(bB.size(), llllllll[0])) {
                            System.out.println(llllllIl[llllllll[1]]);
                            bz = llllllll[1];
                        }
                    }
                    if (!r.llIlIIlIlll(bz ? 1 : 0)) break block80;
                    if (!r.llIlIIllIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) break block81;
                    int[] nArray = new int[llllllll[0]];
                    nArray[r.llllllll[1]] = llllllll[3];
                    if (!r.llIlIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                E.ck();
            }
            if (r.llIlIIlIlll(r.ac() ? 1 : 0) && r.llIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0]) && r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] nArray = new int[llllllll[0]];
                nArray[r.llllllll[1]] = llllllll[3];
                if (r.llIlIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    lIIllIIIIlIllII = BankLocation.getNearest();
                    if (r.llIlIIllIlI(lIIllIIIIlIllII) && r.llIlIIlIlll(lIIllIIIIlIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[0]];
                        a.a((BankLocation)lIIllIIIIlIllII);
                    }
                    if (r.llIlIIllIlI(lIIllIIIIlIllII) && r.llIlIIlIlIl(lIIllIIIIlIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (r.llIlIIlIlll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llllllll[4]);

                        }
                        if (r.llIlIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = llllllIl[llllllll[5]];
                            if (r.llIlIIllIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllllll[6]);

                            }
                            if (r.llIlIIllIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllllll[5]);

                            }
                            int[] nArray2 = new int[llllllll[6]];
                            nArray2[r.llllllll[1]] = llllllll[7];
                            nArray2[r.llllllll[0]] = llllllll[8];
                            nArray2[r.llllllll[5]] = llllllll[9];
                            nArray2[r.llllllll[10]] = llllllll[11];
                            if (r.llIlIIlIlll(e.b(nArray2) ? 1 : 0)) {
                                r.ag();
                                System.out.println(llllllIl[llllllll[10]]);
                                bz = llllllll[0];
                                return;
                            }
                            int[] nArray3 = new int[llllllll[6]];
                            nArray3[r.llllllll[1]] = llllllll[7];
                            nArray3[r.llllllll[0]] = llllllll[8];
                            nArray3[r.llllllll[5]] = llllllll[9];
                            nArray3[r.llllllll[10]] = llllllll[11];
                            if (r.llIlIIlIlIl(e.b(nArray3) ? 1 : 0)) {
                                a.a(llllllll[7], llllllll[12]);
                                a.a(llllllll[8], llllllll[12]);
                                a.a(llllllll[9], llllllll[0]);
                                a.a(llllllll[11], llllllll[13]);
                                a.a(llllllll[14], llllllll[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llllllll[0]];
            nArray[r.llllllll[1]] = llllllll[14];
            if (r.llIlIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && r.llIlIIllIII(Combat.getMissingHealth(), llllllll[15])) {
                int[] nArray4 = new int[llllllll[0]];
                nArray4[r.llllllll[1]] = llllllll[14];
                Inventory.getFirst((int[])nArray4).interact(llllllIl[llllllll[6]]);
                Time.sleepTicks((int)llllllll[5]);

            }
            if (r.llIlIIlIlIl(Inventory.contains((int[])f.bb) ? 1 : 0) && r.llIlIIlIllI(Movement.getRunEnergy(), llllllll[16])) {
                Inventory.getFirst((int[])f.bb).interact(llllllIl[llllllll[13]]);
                Time.sleepTicks((int)llllllll[0]);

            }
            if (r.llIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0]) && r.llIlIIlIlIl(r.ac() ? 1 : 0) && r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] nArray5 = new int[llllllll[0]];
                nArray5[r.llllllll[1]] = llllllll[3];
                if (r.llIlIIlIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (r.llIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)cy) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[17]];
                        if (r.llIlIIlIlIl(Dialog.isOpen() ? 1 : 0) && r.llIlIIlIllI(cx, llllllll[5])) {
                            Dialog.close();
                            cx += llllllll[0];
                        }
                        e.a(cy);
                    }
                    if (r.llIlIIlIlIl(Players.getLocal().getWorldLocation().equals((Object)cy) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[18]];
                        g.a(llllllIl[llllllll[2]], bX);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llllllll[19]));
            System.out.println("5621: " + Vars.getBit((int)llllllll[20]));
            System.out.println("5622: " + Vars.getBit((int)llllllll[21]));
            System.out.println("5623: " + Vars.getBit((int)llllllll[22]));
            System.out.println("5624: " + Vars.getBit((int)llllllll[23]));
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[19]), llllllll[0])) {
                cs = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[20]), llllllll[0])) {
                ct = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[21]), llllllll[0])) {
                cu = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[22]), llllllll[0])) {
                cv = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[23]), llllllll[0])) {
                cw = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0])) {
                int lIIllIIIIlIlIlI;
                ci = llllllll[1];
                if (r.llIlIIlIlll(cs ? 1 : 0)) {
                    String[] stringArray = new String[llllllll[0]];
                    stringArray[r.llllllll[1]] = llllllIl[llllllll[24]];
                    if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llllllll[0]];
                        stringArray2[r.llllllll[1]] = llllllIl[llllllll[12]];
                        if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llllllll[0]];
                            stringArray3[r.llllllll[1]] = llllllIl[llllllll[25]];
                            if (r.llIlIIlIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llllllll[0]];
                                stringArray4[r.llllllll[1]] = llllllIl[llllllll[15]];
                                String[] stringArray5 = new String[llllllll[0]];
                                stringArray5[r.llllllll[1]] = llllllIl[llllllll[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llllllll[5]);

                            }
                        }
                    }
                    String[] stringArray6 = new String[llllllll[0]];
                    stringArray6[r.llllllll[1]] = llllllIl[llllllll[27]];
                    if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cz), llllllll[2])) {
                            AccBuilderBarrows.c = llllllIl[llllllll[28]];
                            Movement.walkTo((WorldPoint)cz);

                            Time.sleepTicks((int)llllllll[0]);

                        }
                        if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cz), llllllll[2])) {
                            AccBuilderBarrows.c = llllllIl[llllllll[29]];
                            g.a(llllllIl[llllllll[30]], bX, llllllll[0]);
                            Time.sleepTicks((int)llllllll[0]);

                            lIIllIIIIlIllII = Dialog.getOptions();
                            lIIllIIIIlIlIll = new ArrayList();
                            if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                                lIIllIIIIlIlIlI = llllllll[1];
                                while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                    lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());

                                    ++lIIllIIIIlIlIlI;

                                    if (-(0x6A ^ 0x66 ^ (0x57 ^ 0x5F)) <= 0) continue;
                                    return;
                                }
                                lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[90]])) ? 1 : 0;
                                int n2 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[89]]));
                                if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n2)) {
                                    System.out.println(llllllIl[llllllll[31]]);
                                }
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cA), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[32]];
                        Movement.walkTo((WorldPoint)cA);

                        Time.sleepTicks((int)llllllll[0]);

                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cA), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[33]];
                        g.a(llllllIl[llllllll[34]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);

                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());

                                ++lIIllIIIIlIlIlI;

                                if (1 <= 2) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[88]])) ? 1 : 0;
                            int n3 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[87]]));
                            if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n3)) {
                                System.out.println(llllllIl[llllllll[35]]);
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(cu ? 1 : 0) && r.llIlIIlIlIl(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cB), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[36]];
                        Movement.walkTo((WorldPoint)cB);

                        Time.sleepTicks((int)llllllll[0]);

                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cB), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[37]];
                        g.a(llllllIl[llllllll[38]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);

                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());

                                ++lIIllIIIIlIlIlI;

                                if (3 < (1 ^ (0x4F ^ 0x4A))) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[86]])) ? 1 : 0;
                            int n4 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[85]]));
                            if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n4)) {
                                System.out.println(llllllIl[llllllll[39]]);
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(cv ? 1 : 0) && r.llIlIIlIlIl(cu ? 1 : 0) && r.llIlIIlIlIl(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cC), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[40]];
                        Movement.walkTo((WorldPoint)cC);

                        Time.sleepTicks((int)llllllll[0]);

                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cC), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[41]];
                        g.a(llllllIl[llllllll[42]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);

                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());

                                ++lIIllIIIIlIlIlI;

                                if ((5 ^ 1) > 0) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[84]])) ? 1 : 0;
                            int n5 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[83]]));
                            if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n5)) {
                                System.out.println(llllllIl[llllllll[43]]);
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(cw ? 1 : 0) && r.llIlIIlIlIl(cv ? 1 : 0) && r.llIlIIlIlIl(cu ? 1 : 0) && r.llIlIIlIlIl(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cD), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[44]];
                        Movement.walkTo((WorldPoint)cD);

                        Time.sleepTicks((int)llllllll[0]);

                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cD), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[45]];
                        g.a(llllllIl[llllllll[46]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);

                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());

                                ++lIIllIIIIlIlIlI;

                                if (((0xA3 ^ 0xAC) & ~(0x6B ^ 0x64)) == 0) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[16]])) ? 1 : 0;
                            int n6 = lIIllIIIIlIlIll.stream().anyMatch(string -> string.contains(llllllIl[llllllll[82]]));
                            int n7 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[81]]));
                            if ((!r.llIlIIlIlll(lIIllIIIIlIlIlI) || r.llIlIIlIlIl(n6)) && r.llIlIIlIlIl(n7)) {
                                System.out.println(llllllIl[llllllll[47]]);
                            }
                        }
                    }
                }
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[5])) {
                if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[48]];
                    if (r.llIlIIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(cy);
                }
                if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[49]];
                    g.a(llllllIl[llllllll[50]], bX);
                }
            }
            if (!r.llIlIIllllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[10]) || r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[17])) {
                g.a(bX);
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[6])) {
                if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cE), llllllll[6])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[51]];
                    Movement.walkTo((WorldPoint)cE);

                    Time.sleepTicks((int)llllllll[0]);

                }
                if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cE), llllllll[6])) {
                    String[] stringArray = new String[llllllll[0]];
                    stringArray[r.llllllll[1]] = llllllIl[llllllll[52]];
                    if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llllllll[0]];
                        stringArray7[r.llllllll[1]] = llllllIl[llllllll[53]];
                        Inventory.getFirst((String[])stringArray7).interact(llllllIl[llllllll[54]]);
                        Time.sleepTicks((int)llllllll[10]);

                    }
                }
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[13])) {
                if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[55]];
                    e.a(cy);
                }
                if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[56]];
                    g.a(llllllIl[llllllll[57]], bX);
                }
            }
            if (!r.llIlIIllllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[18]) || r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[2])) {
                if (r.llIlIIlIllI(ci, llllllll[0])) {
                    Q.lJ += llllllll[0];
                    Q.o(AccBuilderBarrows.m);
                    ci += llllllll[0];
                    Q.lJ = llllllll[1];
                    cj = llllllll[1];
                }
                String[] stringArray = new String[llllllll[0]];
                stringArray[r.llllllll[1]] = llllllIl[llllllll[58]];
                if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (r.llIlIIllIlI(Widgets.get((int)llllllll[59]))) {
                        AccBuilderBarrows.c = llllllIl[llllllll[60]];
                        String[] stringArray8 = new String[llllllll[0]];
                        stringArray8[r.llllllll[1]] = llllllIl[llllllll[61]];
                        Inventory.getFirst((String[])stringArray8).interact(llllllIl[llllllll[62]]);
                        Time.sleepTicks((int)llllllll[6]);

                        AccBuilderBarrows.c = llllllIl[llllllll[63]];
                        lIIllIIIIlIllII = Widgets.get((int)llllllll[59], (int)llllllll[27]);
                        if (r.llIlIIllIlI(lIIllIIIIlIllII)) {
                            lIIllIIIIlIllII.interact(llllllIl[llllllll[64]]);
                            Time.sleepTicks((int)llllllll[0]);

                        }
                        if (r.llIlIIllIlI(lIIllIIIIlIlIll = Widgets.get((int)llllllll[59], (int)llllllll[39]))) {
                            lIIllIIIIlIlIll.interact(llllllIl[llllllll[65]]);
                            Time.sleepTicks((int)llllllll[5]);

                        }
                    }
                    Time.sleepTicks((int)llllllll[0]);

                }
            }
        }
    }
}

