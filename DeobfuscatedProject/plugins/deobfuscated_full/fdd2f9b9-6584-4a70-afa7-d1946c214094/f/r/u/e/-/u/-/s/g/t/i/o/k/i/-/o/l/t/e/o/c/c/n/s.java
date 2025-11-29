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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.F;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
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

public class s
implements G {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lIIIlIlIII;
    private static /* synthetic */ WorldPoint cE;
    static /* synthetic */ int ck;
    private static /* synthetic */ WorldPoint cD;
    private static /* synthetic */ WorldPoint cG;
    private static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ WorldPoint cC;
    public static /* synthetic */ boolean cv;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean cu;
    public static /* synthetic */ boolean cw;
    static /* synthetic */ int cz;
    public static /* synthetic */ boolean cy;
    private static /* synthetic */ int[] lIIIlIlIIl;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ WorldPoint cA;
    private static /* synthetic */ WorldPoint cF;
    public static /* synthetic */ boolean cx;

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
                    0;
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
        s.lIIIlIlIII[s.lIIIlIlIIl[1]] = s."Finished buying items, switching back to quest";
        s.lIIIlIlIII[s.lIIIlIlIIl[0]] = s."Nav to bank";
        s.lIIIlIlIII[s.lIIIlIlIIl[5]] = s."Handling banking";
        s.lIIIlIlIII[s.lIIIlIlIIl[10]] = s."We are missing quest supplies, switching to BUYING";
        s.lIIIlIlIII[s.lIIIlIlIIl[6]] = s."Eat";
        s.lIIIlIlIII[s.lIIIlIlIIl[13]] = s."Drink";
        s.lIIIlIlIII[s.lIIIlIlIIl[17]] = s."Nav to start";
        s.lIIIlIlIII[s.lIIIlIlIIl[18]] = s."Starting quest";
        s.lIIIlIlIII[s.lIIIlIlIIl[2]] = s."Veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[24]] = s."Enchanted scroll";
        s.lIIIlIlIII[s.lIIIlIlIIl[12]] = s."Feather";
        s.lIIIlIlIII[s.lIIIlIlIIl[25]] = s."Enchanted quill";
        s.lIIIlIlIII[s.lIIIlIlIIl[15]] = s."Enchanted scroll";
        s.lIIIlIlIII[s.lIIIlIlIIl[26]] = s."Feather";
        s.lIIIlIlIII[s.lIIIlIlIIl[27]] = s."Enchanted quill";
        s.lIIIlIlIII[s.lIIIlIlIIl[28]] = s."Nav to pisc tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[29]] = s."Talking pisc";
        s.lIIIlIlIII[s.lIIIlIlIIl[30]] = s."Leenz";
        s.lIIIlIlIII[s.lIIIlIlIIl[31]] = s."Finished pisc";
        s.lIIIlIlIII[s.lIIIlIlIIl[32]] = s."Nav to arc tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[33]] = s."Talking arc";
        s.lIIIlIlIII[s.lIIIlIlIIl[34]] = s."Regath";
        s.lIIIlIlIII[s.lIIIlIlIIl[35]] = s."Finished arc";
        s.lIIIlIlIII[s.lIIIlIlIIl[36]] = s."Nav to lova tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[37]] = s."Talking lova";
        s.lIIIlIlIII[s.lIIIlIlIIl[38]] = s."Munty";
        s.lIIIlIlIII[s.lIIIlIlIIl[39]] = s."Finished munty";
        s.lIIIlIlIII[s.lIIIlIlIIl[40]] = s."Nav to shyzien tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[41]] = s."Talking shyzien";
        s.lIIIlIlIII[s.lIIIlIlIIl[42]] = s."Jennifer";
        s.lIIIlIlIII[s.lIIIlIlIIl[43]] = s."Finished shyzien";
        s.lIIIlIlIII[s.lIIIlIlIIl[44]] = s."Nav to hosidius tile";
        s.lIIIlIlIII[s.lIIIlIlIIl[45]] = s."Talking hosidius";
        s.lIIIlIlIII[s.lIIIlIlIIl[46]] = s."Horace";
        s.lIIIlIlIII[s.lIIIlIlIIl[47]] = s."Finished hosidius";
        s.lIIIlIlIII[s.lIIIlIlIIl[48]] = s."Nav to start";
        s.lIIIlIlIII[s.lIIIlIlIIl[49]] = s."talking veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[50]] = s."Veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[51]] = s."Nav to dark altar";
        s.lIIIlIlIII[s.lIIIlIlIIl[52]] = s."Mysterious orb";
        s.lIIIlIlIII[s.lIIIlIlIIl[53]] = s."Mysterious orb";
        s.lIIIlIlIII[s.lIIIlIlIIl[54]] = s."Activate";
        s.lIIIlIlIII[s.lIIIlIlIIl[55]] = s."Nav to start";
        s.lIIIlIlIII[s.lIIIlIlIIl[56]] = s."talking veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[57]] = s."Veos";
        s.lIIIlIlIII[s.lIIIlIlIIl[58]] = s."Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[60]] = s."Rubbing lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[61]] = s."Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[62]] = s."Rub";
        s.lIIIlIlIII[s.lIIIlIlIIl[63]] = s."Selecting slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[64]] = s."Slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[65]] = s."Confirm";
        s.lIIIlIlIII[s.lIIIlIlIIl[66]] = s."Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[67]] = s."Rubbing lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[68]] = s."Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[69]] = s."Rub";
        s.lIIIlIlIII[s.lIIIlIlIIl[70]] = s."Selecting slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[71]] = s."Slayer";
        s.lIIIlIlIII[s.lIIIlIlIIl[72]] = s."Confirm";
        s.lIIIlIlIII[s.lIIIlIlIIl[73]] = s."Feather";
        s.lIIIlIlIII[s.lIIIlIlIIl[78]] = s."Client of Kourend";
        s.lIIIlIlIII[s.lIIIlIlIIl[79]] = s."Antique lamp";
        s.lIIIlIlIII[s.lIIIlIlIIl[80]] = s."ring of wealth (";
        s.lIIIlIlIII[s.lIIIlIlIIl[81]] = s."Can I ask you about Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[82]] = s."let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[16]] = s."Let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[83]] = s."Can I ask you about Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[84]] = s."Let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[85]] = s."Can I ask you about Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[86]] = s."Let's trade.";
        s.lIIIlIlIII[s.lIIIlIlIIl[87]] = s."Can I ask you about Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[88]] = s."I don't need anything.";
        s.lIIIlIlIII[s.lIIIlIlIIl[89]] = s."Can I ask you about Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[90]] = s."I don't need anything right now.";
        s.lIIIlIlIII[s.lIIIlIlIIl[105]] = s."Have you got any quests for me?";
        s.lIIIlIlIII[s.lIIIlIlIIl[106]] = s."Yes.";
        s.lIIIlIlIII[s.lIIIlIlIIl[107]] = s."yes.";
        s.lIIIlIlIII[s.lIIIlIlIIl[108]] = s."Can I ask you about Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[109]] = s."Why should I gain favour with Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[110]] = s."Can I ask you about Port Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[111]] = s."Can I ask you about Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[112]] = s."Why should I gain favour with Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[113]] = s."Can I ask you about Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[114]] = s."Why should I gain favour with Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[115]] = s."Can I ask you about Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[116]] = s."Why should I gain favour with Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[117]] = s."Can I ask you about Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[118]] = s."Why should I gain favour with Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[119]] = s."What is there to do in Port Piscarilius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[120]] = s."What is there to do in Arceuus?";
        s.lIIIlIlIII[s.lIIIlIlIIl[121]] = s."What is there to do in Lovakengj?";
        s.lIIIlIlIII[s.lIIIlIlIIl[122]] = s."What is there to do in Shayzien?";
        s.lIIIlIlIII[s.lIIIlIlIIl[123]] = s."What is there to do in Hosidius?";
        s.lIIIlIlIII[s.lIIIlIlIIl[124]] = s."Let's talk about your client...";
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
                0;
                AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[70]];
                Widget widget = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[27]);
                if (s.lllIlIllIlIl(widget)) {
                    widget.interact(lIIIlIlIII[lIIIlIlIIl[71]]);
                    Time.sleepTicks((int)lIIIlIlIIl[0]);
                    0;
                }
                if (s.lllIlIllIlIl(lIlIIIllllII = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[39]))) {
                    lIlIIIllllII.interact(lIIIlIlIII[lIIIlIlIIl[72]]);
                    Time.sleepTicks((int)lIIIlIlIIl[5]);
                    0;
                }
            }
            Time.sleepTicks((int)lIIIlIlIIl[0]);
            0;
        }
    }

    @Override
    public int T() {
        try {
            s.aH();
            0;
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
            d d2 = new d(lIIIlIlIIl[9], lIIIlIlIIl[12], lIIIlIlIIl[74]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIIlIlIIl[0]];
        nArray2[s.lIIIlIlIIl[1]] = lIIIlIlIIl[11];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIIIlllIIl = new d(lIIIlIlIIl[11], lIIIlIlIIl[13], i.bq);
            bv.add((d)lIlIIIlllIIl);
            0;
        }
        if (s.lllIlIllIIlI(Bank.contains(lIlIIIlllIIl = item -> item.getName().toLowerCase().contains(lIIIlIlIII[lIIIlIlIIl[80]])) ? 1 : 0)) {
            lIlIIIlllIII = new d(lIIIlIlIIl[75], lIIIlIlIIl[13], lIIIlIlIIl[76]);
            bv.add(lIlIIIlllIII);
            0;
        }
        int[] nArray3 = new int[lIIIlIlIIl[0]];
        nArray3[s.lIIIlIlIIl[1]] = lIIIlIlIIl[7];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIIIlllIII = new d(lIIIlIlIIl[7], lIIIlIlIIl[53], lIIIlIlIIl[74]);
            bv.add(lIlIIIlllIII);
            0;
        }
        int[] nArray4 = new int[lIIIlIlIIl[0]];
        nArray4[s.lIIIlIlIIl[1]] = lIIIlIlIIl[8];
        if (s.lllIlIllIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIIIlllIII = new d(lIIIlIlIIl[8], lIIIlIlIIl[12], lIIIlIlIIl[74]);
            bv.add(lIlIIIlllIII);
            0;
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
                0;
                if (1 != -1) return n2 != 0;
                return false;
            }
        }
        n2 = lIIIlIlIIl[1];
        return n2 != 0;
    }

    private static String lllIlIlIllII(String lIlIIIIlllll, String lIlIIIlIIIII) {
        try {
            SecretKeySpec lIlIIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIl[2]), "DES");
            Cipher lIlIIIlIIIll = Cipher.getInstance("DES");
            lIlIIIlIIIll.init(lIIIlIlIIl[5], lIlIIIlIIlII);
            return new String(lIlIIIlIIIll.doFinal(Base64.getDecoder().decode(lIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlIIIlI) {
            lIlIIIlIIIlI.printStackTrace();
            return null;
        }
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
                            0;
                        }
                        if (s.lllIlIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[5]];
                            if (s.lllIlIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIIlIlIIl[6]);
                                0;
                            }
                            if (s.lllIlIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)lIIIlIlIIl[5]);
                                0;
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
                0;
            }
            if (s.lllIlIllIIII(Inventory.contains((int[])f.aV) ? 1 : 0) && s.lllIlIllIIIl(Movement.getRunEnergy(), lIIIlIlIIl[16])) {
                Inventory.getFirst((int[])f.aV).interact(lIIIlIlIII[lIIIlIlIIl[13]]);
                Time.sleepTicks((int)lIIIlIlIIl[0]);
                0;
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
                                0;
                            }
                        }
                    }
                    String[] stringArray6 = new String[lIIIlIlIIl[0]];
                    stringArray6[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[27]];
                    if (s.lllIlIllIIII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (s.lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cB), lIIIlIlIIl[2])) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[28]];
                            Movement.walkTo((WorldPoint)cB);
                            0;
                            Time.sleepTicks((int)lIIIlIlIIl[0]);
                            0;
                        }
                        if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cB), lIIIlIlIIl[2])) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[29]];
                            g.a(lIIIlIlIII[lIIIlIlIIl[30]], bR, lIIIlIlIIl[0]);
                            Time.sleepTicks((int)lIIIlIlIIl[0]);
                            0;
                            lIlIIlIIIlII = Dialog.getOptions();
                            lIlIIlIIIIll = new ArrayList();
                            if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                                lIlIIlIIIIlI = lIIIlIlIIl[1];
                                while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                    lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());
                                    0;
                                    ++lIlIIlIIIIlI;
                                    0;
                                    
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
                        0;
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[33]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[34]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());
                                0;
                                ++lIlIIlIIIIlI;
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cD), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[37]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[38]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());
                                0;
                                ++lIlIIlIIIIlI;
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cE), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[41]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[42]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());
                                0;
                                ++lIlIIlIIIIlI;
                                0;
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
                        0;
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                    }
                    if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cF), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[45]];
                        g.a(lIIIlIlIII[lIIIlIlIIl[46]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks((int)lIIIlIlIIl[0]);
                        0;
                        lIlIIlIIIlII = Dialog.getOptions();
                        lIlIIlIIIIll = new ArrayList();
                        if (s.lllIlIllIIlI(lIlIIlIIIlII.isEmpty() ? 1 : 0)) {
                            lIlIIlIIIIlI = lIIIlIlIIl[1];
                            while (s.lllIlIllIIIl(lIlIIlIIIIlI, lIlIIlIIIlII.size())) {
                                lIlIIlIIIIll.add(((Widget)lIlIIlIIIlII.get(lIlIIlIIIIlI)).getText());
                                0;
                                ++lIlIIlIIIIlI;
                                0;
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
                    0;
                    Time.sleepTicks((int)lIIIlIlIIl[0]);
                    0;
                }
                if (s.lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cG), lIIIlIlIIl[6])) {
                    String[] stringArray = new String[lIIIlIlIIl[0]];
                    stringArray[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[52]];
                    if (s.lllIlIllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[lIIIlIlIIl[0]];
                        stringArray7[s.lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lIIIlIlIII[lIIIlIlIIl[54]]);
                        Time.sleepTicks((int)lIIIlIlIIl[10]);
                        0;
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
                        0;
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[63]];
                        lIlIIlIIIlII = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[27]);
                        if (s.lllIlIllIlIl(lIlIIlIIIlII)) {
                            lIlIIlIIIlII.interact(lIIIlIlIII[lIIIlIlIIl[64]]);
                            Time.sleepTicks((int)lIIIlIlIIl[0]);
                            0;
                        }
                        if (s.lllIlIllIlIl(lIlIIlIIIIll = Widgets.get((int)lIIIlIlIIl[59], (int)lIIIlIlIIl[39]))) {
                            lIlIIlIIIIll.interact(lIIIlIlIII[lIIIlIlIIl[65]]);
                            Time.sleepTicks((int)lIIIlIlIIl[5]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)lIIIlIlIIl[0]);
                    0;
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

    private static String lllIlIlIllIl(String lIlIIIlIllII, String lIlIIIlIllIl) {
        try {
            SecretKeySpec lIlIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIllIIII = Cipher.getInstance("Blowfish");
            lIlIIIllIIII.init(lIIIlIlIIl[5], lIlIIIllIIIl);
            return new String(lIlIIIllIIII.doFinal(Base64.getDecoder().decode(lIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlIllll) {
            lIlIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlIlIll(String lIlIIIIlIIIl, String lIlIIIIIlIll) {
        lIlIIIIlIIIl = new String(Base64.getDecoder().decode(lIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIIllll = new StringBuilder();
        char[] lIlIIIIIlllI = lIlIIIIIlIll.toCharArray();
        int lIlIIIIIllIl = lIIIlIlIIl[1];
        char[] lIlIIIIIIlll = lIlIIIIlIIIl.toCharArray();
        int lIlIIIIIIllI = lIlIIIIIIlll.length;
        int lIlIIIIIIlIl = lIIIlIlIIl[1];
        while (s.lllIlIllIIIl(lIlIIIIIIlIl, lIlIIIIIIllI)) {
            char lIlIIIIlIIlI = lIlIIIIIIlll[lIlIIIIIIlIl];
            lIlIIIIIllll.append((char)(lIlIIIIlIIlI ^ lIlIIIIIlllI[lIlIIIIIllIl % lIlIIIIIlllI.length]));
            0;
            ++lIlIIIIIllIl;
            ++lIlIIIIIIlIl;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(lIlIIIIIllll);
    }

    private static boolean lllIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIlIlIllll() {
        lIIIlIlIIl = new int[126];
        s.lIIIlIlIIl[0] = 1;
        s.lIIIlIlIIl[1] = (0x2B ^ 0x72) & ~(0x2B ^ 0x72);
        s.lIIIlIlIIl[2] = 0x3F ^ 0x37;
        s.lIIIlIlIIl[3] = -(0xFFFFB5FA & 0x6A9F) & (0xFFFFFAB9 & Short.MAX_VALUE);
        s.lIIIlIlIIl[4] = -(0xFFFFF96F & 0xEF3) & (0xFFFFFFEB & 0x1BFE);
        s.lIIIlIlIIl[5] = 2;
        s.lIIIlIlIIl[6] = 0x85 ^ 0x81;
        s.lIIIlIlIIl[7] = 0xFFFFBFF7 & 0x5F4F;
        s.lIIIlIlIIl[8] = 0xFFFFBF7B & 0x5FCD;
        s.lIIIlIlIIl[9] = 0xFFFF8FFA & 0x713F;
        s.lIIIlIlIIl[10] = 3;
        s.lIIIlIlIIl[11] = -(0xFFFFDB47 & 0x2CBD) & (0xFFFFBBFD & 0x7D57);
        s.lIIIlIlIIl[12] = 0x19 ^ 0x21 ^ (0x96 ^ 0xA4);
        s.lIIIlIlIIl[13] = 0x2B ^ 0x66 ^ (0x51 ^ 0x19);
        s.lIIIlIlIIl[14] = 0xFFFF8BFF & 0x757B;
        s.lIIIlIlIIl[15] = 0x8D ^ 0x81;
        s.lIIIlIlIIl[16] = 0xCC ^ 0x8D;
        s.lIIIlIlIIl[17] = 0xD6 ^ 0xB1 ^ (0x4D ^ 0x2C);
        s.lIIIlIlIIl[18] = 0x39 ^ 0x3E;
        s.lIIIlIlIIl[19] = 0xFFFFD7FF & 0x3DF4;
        s.lIIIlIlIIl[20] = -(0xFFFFE3AF & 0x5E5B) & (0xFFFFD7FF & Short.MAX_VALUE);
        s.lIIIlIlIIl[21] = -(0xFFFFFA1B & 0x2DEE) & (0xFFFFFFFF & 0x3DFF);
        s.lIIIlIlIIl[22] = -(0xFFFFAACD & 0x7F33) & (0xFFFFBFF7 & Short.MAX_VALUE);
        s.lIIIlIlIIl[23] = 0xFFFFDFFD & 0x35FA;
        s.lIIIlIlIIl[24] = 0xB ^ 0x69 ^ (0x26 ^ 0x4D);
        s.lIIIlIlIIl[25] = 0x10 ^ 0x39 ^ (0x39 ^ 0x1B);
        s.lIIIlIlIIl[26] = 0xAB ^ 0xA6;
        s.lIIIlIlIIl[27] = 0x43 ^ 0x4D;
        s.lIIIlIlIIl[28] = 0xDE ^ 0x81 ^ (0xFD ^ 0xAD);
        s.lIIIlIlIIl[29] = 0x81 ^ 0x91;
        s.lIIIlIlIIl[30] = 0x3C ^ 0x2D;
        s.lIIIlIlIIl[31] = 0x77 ^ 0x65;
        s.lIIIlIlIIl[32] = 0x86 ^ 0x95;
        s.lIIIlIlIIl[33] = 0x50 ^ 0x44;
        s.lIIIlIlIIl[34] = 0x24 ^ 0x31;
        s.lIIIlIlIIl[35] = 91 + 62 - 126 + 149 ^ 87 + 126 - 178 + 131;
        s.lIIIlIlIIl[36] = 0x33 ^ 0x24;
        s.lIIIlIlIIl[37] = 97 + 112 - 35 + 47 ^ 1 + 18 - -51 + 127;
        s.lIIIlIlIIl[38] = 0xA ^ 0x14 ^ (0x28 ^ 0x2F);
        s.lIIIlIlIIl[39] = 0x6F ^ 0x75;
        s.lIIIlIlIIl[40] = 0x15 ^ 0xE;
        s.lIIIlIlIIl[41] = 35 + 28 - -46 + 61 ^ 38 + 132 - 108 + 120;
        s.lIIIlIlIIl[42] = 0xAA ^ 0x9C ^ (0x50 ^ 0x7B);
        s.lIIIlIlIIl[43] = 0xB5 ^ 0xAB;
        s.lIIIlIlIIl[44] = 0xAE ^ 0xB1;
        s.lIIIlIlIIl[45] = 0x12 ^ 0x32;
        s.lIIIlIlIIl[46] = 0x4E ^ 0xD ^ (9 ^ 0x6B);
        s.lIIIlIlIIl[47] = 0x57 ^ 0x45 ^ (0x42 ^ 0x72);
        s.lIIIlIlIIl[48] = 149 + 149 - 187 + 53 ^ 99 + 104 - 119 + 51;
        s.lIIIlIlIIl[49] = 52 + 75 - -27 + 77 ^ 82 + 6 - -59 + 48;
        s.lIIIlIlIIl[50] = 0x95 ^ 0xB0;
        s.lIIIlIlIIl[51] = 86 + 30 - -5 + 47 ^ 123 + 105 - 208 + 122;
        s.lIIIlIlIIl[52] = 2 ^ 0x25;
        s.lIIIlIlIIl[53] = 0x69 ^ 0x1D ^ (0x5E ^ 2);
        s.lIIIlIlIIl[54] = 39 + 44 - -25 + 43 ^ 98 + 180 - 264 + 176;
        s.lIIIlIlIIl[55] = 0xB4 ^ 0x9E;
        s.lIIIlIlIIl[56] = 0x48 ^ 0x10 ^ (0x7A ^ 9);
        s.lIIIlIlIIl[57] = 0x13 ^ 0x3F;
        s.lIIIlIlIIl[58] = 0xF1 ^ 0x82 ^ (0x4B ^ 0x15);
        s.lIIIlIlIIl[59] = 181 + 156 - 168 + 71;
        s.lIIIlIlIIl[60] = 0x90 ^ 0x9B ^ (0x94 ^ 0xB1);
        s.lIIIlIlIIl[61] = 0x4E ^ 0x61;
        s.lIIIlIlIIl[62] = 0x2A ^ 0x1A;
        s.lIIIlIlIIl[63] = 45 + 166 - 105 + 63 ^ 72 + 87 - 56 + 49;
        s.lIIIlIlIIl[64] = 0x4A ^ 0x78;
        s.lIIIlIlIIl[65] = 0x30 ^ 3;
        s.lIIIlIlIIl[66] = 0xA6 ^ 0xC3 ^ (0xCF ^ 0x9E);
        s.lIIIlIlIIl[67] = 0xBA ^ 0xB6 ^ (0x4F ^ 0x76);
        s.lIIIlIlIIl[68] = 0x3A ^ 0xC;
        s.lIIIlIlIIl[69] = 25 + 109 - 9 + 44 ^ 125 + 42 - 146 + 137;
        s.lIIIlIlIIl[70] = 3 ^ 0x35 ^ (0x8E ^ 0x80);
        s.lIIIlIlIIl[71] = 11 + 34 - -84 + 51 ^ 90 + 81 - 130 + 100;
        s.lIIIlIlIIl[72] = 0x9B ^ 0xC2 ^ (0xDB ^ 0xB8);
        s.lIIIlIlIIl[73] = 0x61 ^ 0x27 ^ (0xB9 ^ 0xC4);
        s.lIIIlIlIIl[74] = 0xFFFF83CC & 0x7FB7;
        s.lIIIlIlIIl[75] = -(0xFFFFF3FC & 0x5C37) & (0xFFFFFEFF & Short.MAX_VALUE);
        s.lIIIlIlIIl[76] = -(0xFFFFDD76 & 0x32DD) & (0xFFFFF7FB & 0x79FF);
        s.lIIIlIlIIl[77] = 0x1F ^ 0x41 ^ (0x19 ^ 0x23);
        s.lIIIlIlIIl[78] = 0xDD ^ 0xC2 ^ (0x92 ^ 0xB1);
        s.lIIIlIlIIl[79] = 0xA4 ^ 0x99;
        s.lIIIlIlIIl[80] = 0x55 ^ 0x67 ^ (0x18 ^ 0x14);
        s.lIIIlIlIIl[81] = 0x68 ^ 0x57;
        s.lIIIlIlIIl[82] = 0 ^ 0x40;
        s.lIIIlIlIIl[83] = 44 + 43 - 39 + 79 ^ (0x2C ^ 0x11);
        s.lIIIlIlIIl[84] = 123 + 23 - 132 + 190 ^ 141 + 77 - 85 + 10;
        s.lIIIlIlIIl[85] = 0xAE ^ 0x8D ^ (0x1B ^ 0x7C);
        s.lIIIlIlIIl[86] = 0xD0 ^ 0x91 ^ (0x23 ^ 0x27);
        s.lIIIlIlIIl[87] = 0x83 ^ 0xC5;
        s.lIIIlIlIIl[88] = 0x56 ^ 0x11;
        s.lIIIlIlIIl[89] = 0x2D ^ 0x65;
        s.lIIIlIlIIl[90] = 0xE2 ^ 0xAB;
        s.lIIIlIlIIl[91] = 0xFFFF87A5 & 0x7F7B;
        s.lIIIlIlIIl[92] = -(0xFFFFFFFE & 0x1197) & (0xFFFF9FFF & Short.MAX_VALUE);
        s.lIIIlIlIIl[93] = 0xFFFFE73F & 0x1FCF;
        s.lIIIlIlIIl[94] = -(0x61 ^ 0x70) & (0xFFFFAFFE & 0x5E9F);
        s.lIIIlIlIIl[95] = -(0xFFFFDF79 & 0x71C7) & (0xFFFFFFFF & 0x57F7);
        s.lIIIlIlIIl[96] = -(0xFFFFF569 & 0x3B97) & (0xFFFFBFFF & 0x7F8D);
        s.lIIIlIlIIl[97] = 0xFFFFF6FF & 0xF0F;
        s.lIIIlIlIIl[98] = -(0xFFFFFEFD & 0x215B) & (0xFFFFAFFF & 0x7EFD);
        s.lIIIlIlIIl[99] = 0xFFFFAFFA & 0x55F5;
        s.lIIIlIlIIl[100] = -(0xFFFFE3BB & 0x3DF5) & (0xFFFFEFB7 & 0x3FFF);
        s.lIIIlIlIIl[101] = 0xFFFFAEFF & 0x57EE;
        s.lIIIlIlIIl[102] = -(0xFFFFE1DB & 0x3FB5) & (0xFFFFAF96 & 0x7FFD);
        s.lIIIlIlIIl[103] = -(0xFFFFFBF9 & 0x7D0F) & (0xFFFFFFFA & 0x7FBD);
        s.lIIIlIlIIl[104] = 0xFFFF9F6F & 0x6FBB;
        s.lIIIlIlIIl[105] = 153 + 225 - 215 + 73 ^ 27 + 111 - 2 + 30;
        s.lIIIlIlIIl[106] = 0x80 ^ 0xA8 ^ (0xA7 ^ 0xC4);
        s.lIIIlIlIIl[107] = 0xD5 ^ 0x99;
        s.lIIIlIlIIl[108] = 0x7A ^ 0x6F ^ (0xE3 ^ 0xBB);
        s.lIIIlIlIIl[109] = 0xD7 ^ 0xC2 ^ (0x15 ^ 0x4E);
        s.lIIIlIlIIl[110] = 0x35 ^ 0x1F ^ (0x22 ^ 0x47);
        s.lIIIlIlIIl[111] = 115 + 113 - 36 + 9 ^ 76 + 86 - 87 + 78;
        s.lIIIlIlIIl[112] = 0x21 ^ 0x70;
        s.lIIIlIlIIl[113] = 53 + 111 - -3 + 54 ^ 1 + 134 - 119 + 127;
        s.lIIIlIlIIl[114] = 0xFB ^ 0xA8;
        s.lIIIlIlIIl[115] = 0xC6 ^ 0x92;
        s.lIIIlIlIIl[116] = 0x1A ^ 0x4F;
        s.lIIIlIlIIl[117] = 0x39 ^ 0x6F;
        s.lIIIlIlIIl[118] = 178 + 191 - 352 + 199 ^ 111 + 110 - 134 + 56;
        s.lIIIlIlIIl[119] = 33 + 26 - -20 + 131 ^ 117 + 44 - 24 + 1;
        s.lIIIlIlIIl[120] = 0xC5 ^ 0x9C;
        s.lIIIlIlIIl[121] = 23 + 20 - -67 + 49 ^ 113 + 9 - 85 + 160;
        s.lIIIlIlIIl[122] = 0x16 ^ 0x4D;
        s.lIIIlIlIIl[123] = 30 + 105 - -11 + 89 ^ 66 + 106 - 168 + 179;
        s.lIIIlIlIIl[124] = 48 + 92 - 95 + 180 ^ 43 + 184 - 52 + 13;
        s.lIIIlIlIIl[125] = 0xCF ^ 0x91;
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

