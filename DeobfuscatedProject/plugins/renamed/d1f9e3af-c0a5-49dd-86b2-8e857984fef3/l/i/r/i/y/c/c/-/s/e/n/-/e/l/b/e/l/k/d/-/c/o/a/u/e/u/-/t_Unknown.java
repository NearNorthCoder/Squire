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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.V_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
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

public class t_Unknown
implements W {
    public static /* synthetic */ boolean cv;
    private static /* synthetic */ int[] llIIIIIIl;
    static /* synthetic */ int cl;
    public static /* synthetic */ boolean cz;
    private static /* synthetic */ WorldPoint cH;
    private static /* synthetic */ WorldPoint cG;
    private static /* synthetic */ WorldPoint cC;
    private static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ boolean cy;
    public static /* synthetic */ boolean cw;
    static /* synthetic */ int cA;
    static /* synthetic */ boolean cm;
    private static /* synthetic */ WorldPoint cE;
    private static /* synthetic */ String[] bR;
    private static /* synthetic */ WorldPoint cD;
    public static /* synthetic */ boolean cx;
    private static /* synthetic */ WorldPoint cF;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] lIllllIll;

    private static void lIlIIIIIllll() {
        lIllllIll = new String[llIIIIIIl[125]];
        t.lIllllIll[t.llIIIIIIl[1]] = t."Finished buying items, switching back to quest";
        t.lIllllIll[t.llIIIIIIl[0]] = t."Nav to bank";
        t.lIllllIll[t.llIIIIIIl[5]] = t."Handling banking";
        t.lIllllIll[t.llIIIIIIl[10]] = t."We are missing quest supplies, switching to BUYING";
        t.lIllllIll[t.llIIIIIIl[6]] = t."Eat";
        t.lIllllIll[t.llIIIIIIl[13]] = t."Drink";
        t.lIllllIll[t.llIIIIIIl[17]] = t."Nav to start";
        t.lIllllIll[t.llIIIIIIl[18]] = t."Starting quest";
        t.lIllllIll[t.llIIIIIIl[2]] = t."Veos";
        t.lIllllIll[t.llIIIIIIl[24]] = t."Enchanted scroll";
        t.lIllllIll[t.llIIIIIIl[12]] = t."Feather";
        t.lIllllIll[t.llIIIIIIl[25]] = t."Enchanted quill";
        t.lIllllIll[t.llIIIIIIl[15]] = t."Enchanted scroll";
        t.lIllllIll[t.llIIIIIIl[26]] = t."Feather";
        t.lIllllIll[t.llIIIIIIl[27]] = t."Enchanted quill";
        t.lIllllIll[t.llIIIIIIl[28]] = t."Nav to pisc tile";
        t.lIllllIll[t.llIIIIIIl[29]] = t."Talking pisc";
        t.lIllllIll[t.llIIIIIIl[30]] = t."Leenz";
        t.lIllllIll[t.llIIIIIIl[31]] = t."Finished pisc";
        t.lIllllIll[t.llIIIIIIl[32]] = t."Nav to arc tile";
        t.lIllllIll[t.llIIIIIIl[33]] = t."Talking arc";
        t.lIllllIll[t.llIIIIIIl[34]] = t."Regath";
        t.lIllllIll[t.llIIIIIIl[35]] = t."Finished arc";
        t.lIllllIll[t.llIIIIIIl[36]] = t."Nav to lova tile";
        t.lIllllIll[t.llIIIIIIl[37]] = t."Talking lova";
        t.lIllllIll[t.llIIIIIIl[38]] = t."Munty";
        t.lIllllIll[t.llIIIIIIl[39]] = t."Finished munty";
        t.lIllllIll[t.llIIIIIIl[40]] = t."Nav to shyzien tile";
        t.lIllllIll[t.llIIIIIIl[41]] = t."Talking shyzien";
        t.lIllllIll[t.llIIIIIIl[42]] = t."Jennifer";
        t.lIllllIll[t.llIIIIIIl[43]] = t."Finished shyzien";
        t.lIllllIll[t.llIIIIIIl[44]] = t."Nav to hosidius tile";
        t.lIllllIll[t.llIIIIIIl[45]] = t."Talking hosidius";
        t.lIllllIll[t.llIIIIIIl[46]] = t."Horace";
        t.lIllllIll[t.llIIIIIIl[47]] = t."Finished hosidius";
        t.lIllllIll[t.llIIIIIIl[48]] = t."Nav to start";
        t.lIllllIll[t.llIIIIIIl[49]] = t."talking veos";
        t.lIllllIll[t.llIIIIIIl[50]] = t."Veos";
        t.lIllllIll[t.llIIIIIIl[51]] = t."Nav to dark altar";
        t.lIllllIll[t.llIIIIIIl[52]] = t."Mysterious orb";
        t.lIllllIll[t.llIIIIIIl[53]] = t."Mysterious orb";
        t.lIllllIll[t.llIIIIIIl[54]] = t."Activate";
        t.lIllllIll[t.llIIIIIIl[55]] = t."Nav to start";
        t.lIllllIll[t.llIIIIIIl[56]] = t."talking veos";
        t.lIllllIll[t.llIIIIIIl[57]] = t."Veos";
        t.lIllllIll[t.llIIIIIIl[58]] = t."Antique lamp";
        t.lIllllIll[t.llIIIIIIl[60]] = t."Rubbing lamp";
        t.lIllllIll[t.llIIIIIIl[61]] = t."Antique lamp";
        t.lIllllIll[t.llIIIIIIl[62]] = t."Rub";
        t.lIllllIll[t.llIIIIIIl[63]] = t."Selecting slayer";
        t.lIllllIll[t.llIIIIIIl[64]] = t."Slayer";
        t.lIllllIll[t.llIIIIIIl[65]] = t."Confirm";
        t.lIllllIll[t.llIIIIIIl[66]] = t."Antique lamp";
        t.lIllllIll[t.llIIIIIIl[67]] = t."Rubbing lamp";
        t.lIllllIll[t.llIIIIIIl[68]] = t."Antique lamp";
        t.lIllllIll[t.llIIIIIIl[69]] = t."Rub";
        t.lIllllIll[t.llIIIIIIl[70]] = t."Selecting slayer";
        t.lIllllIll[t.llIIIIIIl[71]] = t."Slayer";
        t.lIllllIll[t.llIIIIIIl[72]] = t."Confirm";
        t.lIllllIll[t.llIIIIIIl[73]] = t."Feather";
        t.lIllllIll[t.llIIIIIIl[78]] = t."Client of Kourend";
        t.lIllllIll[t.llIIIIIIl[79]] = t."Antique lamp";
        t.lIllllIll[t.llIIIIIIl[80]] = t."ring of wealth (";
        t.lIllllIll[t.llIIIIIIl[81]] = t."Can I ask you about Hosidius?";
        t.lIllllIll[t.llIIIIIIl[82]] = t."let's trade.";
        t.lIllllIll[t.llIIIIIIl[16]] = t."Let's trade.";
        t.lIllllIll[t.llIIIIIIl[83]] = t."Can I ask you about Shayzien?";
        t.lIllllIll[t.llIIIIIIl[84]] = t."Let's trade.";
        t.lIllllIll[t.llIIIIIIl[85]] = t."Can I ask you about Lovakengj?";
        t.lIllllIll[t.llIIIIIIl[86]] = t."Let's trade.";
        t.lIllllIll[t.llIIIIIIl[87]] = t."Can I ask you about Arceuus?";
        t.lIllllIll[t.llIIIIIIl[88]] = t."I don't need anything.";
        t.lIllllIll[t.llIIIIIIl[89]] = t."Can I ask you about Port Piscarilius?";
        t.lIllllIll[t.llIIIIIIl[90]] = t."I don't need anything right now.";
        t.lIllllIll[t.llIIIIIIl[105]] = t."Have you got any quests for me?";
        t.lIllllIll[t.llIIIIIIl[106]] = t."Yes.";
        t.lIllllIll[t.llIIIIIIl[107]] = t."yes.";
        t.lIllllIll[t.llIIIIIIl[108]] = t."Can I ask you about Port Piscarilius?";
        t.lIllllIll[t.llIIIIIIl[109]] = t."Why should I gain favour with Port Piscarilius?";
        t.lIllllIll[t.llIIIIIIl[110]] = t."Can I ask you about Port Arceuus?";
        t.lIllllIll[t.llIIIIIIl[111]] = t."Can I ask you about Arceuus?";
        t.lIllllIll[t.llIIIIIIl[112]] = t."Why should I gain favour with Arceuus?";
        t.lIllllIll[t.llIIIIIIl[113]] = t."Can I ask you about Lovakengj?";
        t.lIllllIll[t.llIIIIIIl[114]] = t."Why should I gain favour with Lovakengj?";
        t.lIllllIll[t.llIIIIIIl[115]] = t."Can I ask you about Shayzien?";
        t.lIllllIll[t.llIIIIIIl[116]] = t."Why should I gain favour with Shayzien?";
        t.lIllllIll[t.llIIIIIIl[117]] = t."Can I ask you about Hosidius?";
        t.lIllllIll[t.llIIIIIIl[118]] = t."Why should I gain favour with Hosidius?";
        t.lIllllIll[t.llIIIIIIl[119]] = t."What is there to do in Port Piscarilius?";
        t.lIllllIll[t.llIIIIIIl[120]] = t."What is there to do in Arceuus?";
        t.lIllllIll[t.llIIIIIIl[121]] = t."What is there to do in Lovakengj?";
        t.lIllllIll[t.llIIIIIIl[122]] = t."What is there to do in Shayzien?";
        t.lIllllIll[t.llIIIIIIl[123]] = t."What is there to do in Hosidius?";
        t.lIllllIll[t.llIIIIIIl[124]] = t."Let's talk about your client...";
    }

    private static boolean lIlIIIIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        t.lIlIIIIllIII();
        t.lIlIIIIIllll();
        bv = new ArrayList<d>();
        cA = llIIIIIIl[1];
        cB = new WorldPoint(llIIIIIIl[91], llIIIIIIl[92], llIIIIIIl[1]);
        cC = new WorldPoint(llIIIIIIl[93], llIIIIIIl[94], llIIIIIIl[1]);
        cD = new WorldPoint(llIIIIIIl[95], llIIIIIIl[96], llIIIIIIl[1]);
        cE = new WorldPoint(llIIIIIIl[97], llIIIIIIl[98], llIIIIIIl[1]);
        cF = new WorldPoint(llIIIIIIl[99], llIIIIIIl[100], llIIIIIIl[1]);
        cG = new WorldPoint(llIIIIIIl[101], llIIIIIIl[102], llIIIIIIl[1]);
        cH = new WorldPoint(llIIIIIIl[103], llIIIIIIl[104], llIIIIIIl[1]);
        String[] stringArray = new String[llIIIIIIl[33]];
        stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[105]];
        stringArray[t.llIIIIIIl[0]] = lIllllIll[llIIIIIIl[106]];
        stringArray[t.llIIIIIIl[5]] = lIllllIll[llIIIIIIl[107]];
        stringArray[t.llIIIIIIl[10]] = lIllllIll[llIIIIIIl[108]];
        stringArray[t.llIIIIIIl[6]] = lIllllIll[llIIIIIIl[109]];
        stringArray[t.llIIIIIIl[13]] = lIllllIll[llIIIIIIl[110]];
        stringArray[t.llIIIIIIl[17]] = lIllllIll[llIIIIIIl[111]];
        stringArray[t.llIIIIIIl[18]] = lIllllIll[llIIIIIIl[112]];
        stringArray[t.llIIIIIIl[2]] = lIllllIll[llIIIIIIl[113]];
        stringArray[t.llIIIIIIl[24]] = lIllllIll[llIIIIIIl[114]];
        stringArray[t.llIIIIIIl[12]] = lIllllIll[llIIIIIIl[115]];
        stringArray[t.llIIIIIIl[25]] = lIllllIll[llIIIIIIl[116]];
        stringArray[t.llIIIIIIl[15]] = lIllllIll[llIIIIIIl[117]];
        stringArray[t.llIIIIIIl[26]] = lIllllIll[llIIIIIIl[118]];
        stringArray[t.llIIIIIIl[27]] = lIllllIll[llIIIIIIl[119]];
        stringArray[t.llIIIIIIl[28]] = lIllllIll[llIIIIIIl[120]];
        stringArray[t.llIIIIIIl[29]] = lIllllIll[llIIIIIIl[121]];
        stringArray[t.llIIIIIIl[30]] = lIllllIll[llIIIIIIl[122]];
        stringArray[t.llIIIIIIl[31]] = lIllllIll[llIIIIIIl[123]];
        stringArray[t.llIIIIIIl[32]] = lIllllIll[llIIIIIIl[124]];
        bR = stringArray;
    }

    private static boolean lIlIIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean S() {
        return llIIIIIIl[1];
    }

    private static boolean lIlIIIIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void af() {
        d lIllllIlIIIIII;
        Object lIllllIlIIIIIl;
        int[] nArray = new int[llIIIIIIl[0]];
        nArray[t.llIIIIIIl[1]] = llIIIIIIl[9];
        if (t.lIlIIIIllIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIIIl[9], llIIIIIIl[12], llIIIIIIl[74]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIIIIIl[0]];
        nArray2[t.llIIIIIIl[1]] = llIIIIIIl[11];
        if (t.lIlIIIIllIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIllllIlIIIIIl = new d(llIIIIIIl[11], llIIIIIIl[13], i.bq);
            bv.add((d)lIllllIlIIIIIl);
            0;
        }
        if (t.lIlIIIIllIll(Bank.contains(lIllllIlIIIIIl = item -> item.getName().toLowerCase().contains(lIllllIll[llIIIIIIl[80]])) ? 1 : 0)) {
            lIllllIlIIIIII = new d(llIIIIIIl[75], llIIIIIIl[13], llIIIIIIl[76]);
            bv.add(lIllllIlIIIIII);
            0;
        }
        int[] nArray3 = new int[llIIIIIIl[0]];
        nArray3[t.llIIIIIIl[1]] = llIIIIIIl[7];
        if (t.lIlIIIIllIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIllllIlIIIIII = new d(llIIIIIIl[7], llIIIIIIl[53], llIIIIIIl[74]);
            bv.add(lIllllIlIIIIII);
            0;
        }
        int[] nArray4 = new int[llIIIIIIl[0]];
        nArray4[t.llIIIIIIl[1]] = llIIIIIIl[8];
        if (t.lIlIIIIllIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIllllIlIIIIII = new d(llIIIIIIl[8], llIIIIIIl[12], llIIIIIIl[74]);
            bv.add(lIllllIlIIIIII);
            0;
        }
    }

    private static String lIIllllIllIl(String lIllllIIIllllI, String lIllllIIIlllIl) {
        try {
            SecretKeySpec lIllllIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllllIIlIIIII = Cipher.getInstance("Blowfish");
            lIllllIIlIIIII.init(llIIIIIIl[5], lIllllIIlIIIIl);
            return new String(lIllllIIlIIIII.doFinal(Base64.getDecoder().decode(lIllllIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIIIlllll) {
            lIllllIIIlllll.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[llIIIIIIl[0]];
        stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[73]];
        if (t.lIlIIIIlllll(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIIIIIIl[0]];
            nArray[t.llIIIIIIl[1]] = llIIIIIIl[7];
            if (t.lIlIIIIlllll(Inventory.getCount((int[])nArray)) && t.lIlIIIIlllll(Inventory.getCount((int[])f.aV))) {
                int[] nArray2 = new int[llIIIIIIl[0]];
                nArray2[t.llIIIIIIl[1]] = llIIIIIIl[8];
                if (t.lIlIIIIlllll(Inventory.getCount((int[])nArray2))) {
                    n2 = llIIIIIIl[0];
                    0;
                    if (((0xC7 ^ 0xA6) & ~(0xD5 ^ 0xB4)) < (0x88 ^ 0x8C)) return n2 != 0;
                    return false;
                }
            }
        }
        n2 = llIIIIIIl[1];
        return n2 != 0;
    }

    @Override
    public String U() {
        return lIllllIll[llIIIIIIl[78]];
    }

    private static boolean lIlIIIIlllll(int n2) {
        return n2 > 0;
    }

    @Override
    public int T() {
        try {
            t.aL();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 > 0) {
            return (0x95 ^ 0xC5) & ~(0xEE ^ 0xBE);
        }
        return llIIIIIIl[77];
    }

    private static String lIIllllllIlI(String lIllllIIIIllll, String lIllllIIIlIIII) {
        try {
            SecretKeySpec lIllllIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIIIlIIII.getBytes(StandardCharsets.UTF_8)), llIIIIIIl[2]), "DES");
            Cipher lIllllIIIlIIll = Cipher.getInstance("DES");
            lIllllIIIlIIll.init(llIIIIIIl[5], lIllllIIIlIlII);
            return new String(lIllllIIIlIIll.doFinal(Base64.getDecoder().decode(lIllllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIIIlIIlI) {
            lIllllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIIllllI(Object object) {
        return object != null;
    }

    private static boolean lIlIIIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean V() {
        int n2;
        if (t.lIlIIIIlllII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[24])) {
            String[] stringArray = new String[llIIIIIIl[0]];
            stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[79]];
            if (t.lIlIIIIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llIIIIIIl[0];
                0;
                if (((0xB9 ^ 0x99) & ~(0x8D ^ 0xAD)) == 0) return n2 != 0;
                return false;
            }
        }
        n2 = llIIIIIIl[1];
        return n2 != 0;
    }

    public static void aL() {
        block80: {
            Widget lIllllIlIIlIll;
            Object lIllllIlIIllII;
            block82: {
                block81: {
                    if (t.lIlIIIIllIIl(bt ? 1 : 0)) {
                        b.a(bv);
                        if (t.lIlIIIIllIlI(bv.size(), llIIIIIIl[0])) {
                            System.out.println(lIllllIll[llIIIIIIl[1]]);
                            bt = llIIIIIIl[1];
                        }
                    }
                    if (!t.lIlIIIIllIll(bt ? 1 : 0)) break block80;
                    if (!t.lIlIIIIlllII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIIIIIl[2])) break block81;
                    int[] nArray = new int[llIIIIIIl[0]];
                    nArray[t.llIIIIIIl[1]] = llIIIIIIl[3];
                    if (!t.lIlIIIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                V.dd();
            }
            if (t.lIlIIIIllIll(t.ab() ? 1 : 0) && t.lIlIIIIllIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[0]) && t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIIIIIl[2])) {
                int[] nArray = new int[llIIIIIIl[0]];
                nArray[t.llIIIIIIl[1]] = llIIIIIIl[3];
                if (t.lIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    lIllllIlIIllII = BankLocation.getNearest();
                    if (t.lIlIIIIllllI(lIllllIlIIllII) && t.lIlIIIIllIll(lIllllIlIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[0]];
                        a.a((BankLocation)lIllllIlIIllII);
                    }
                    if (t.lIlIIIIllllI(lIllllIlIIllII) && t.lIlIIIIllIIl(lIllllIlIIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (t.lIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIIIl[4]);
                            0;
                        }
                        if (t.lIlIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[5]];
                            if (t.lIlIIIIlllll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIIIl[6]);
                                0;
                            }
                            if (t.lIlIIIIlllll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIIIl[5]);
                                0;
                            }
                            int[] nArray2 = new int[llIIIIIIl[6]];
                            nArray2[t.llIIIIIIl[1]] = llIIIIIIl[7];
                            nArray2[t.llIIIIIIl[0]] = llIIIIIIl[8];
                            nArray2[t.llIIIIIIl[5]] = llIIIIIIl[9];
                            nArray2[t.llIIIIIIl[10]] = llIIIIIIl[11];
                            if (t.lIlIIIIllIll(e.b(nArray2) ? 1 : 0)) {
                                t.af();
                                System.out.println(lIllllIll[llIIIIIIl[10]]);
                                bt = llIIIIIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[llIIIIIIl[6]];
                            nArray3[t.llIIIIIIl[1]] = llIIIIIIl[7];
                            nArray3[t.llIIIIIIl[0]] = llIIIIIIl[8];
                            nArray3[t.llIIIIIIl[5]] = llIIIIIIl[9];
                            nArray3[t.llIIIIIIl[10]] = llIIIIIIl[11];
                            if (t.lIlIIIIllIIl(e.b(nArray3) ? 1 : 0)) {
                                a.a(llIIIIIIl[7], llIIIIIIl[12]);
                                a.a(llIIIIIIl[8], llIIIIIIl[12]);
                                a.a(llIIIIIIl[9], llIIIIIIl[0]);
                                a.a(llIIIIIIl[11], llIIIIIIl[13]);
                                a.a(llIIIIIIl[14], llIIIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llIIIIIIl[0]];
            nArray[t.llIIIIIIl[1]] = llIIIIIIl[14];
            if (t.lIlIIIIllIIl(Inventory.contains((int[])nArray) ? 1 : 0) && t.lIlIIIIlllII(Combat.getMissingHealth(), llIIIIIIl[15])) {
                int[] nArray4 = new int[llIIIIIIl[0]];
                nArray4[t.llIIIIIIl[1]] = llIIIIIIl[14];
                Inventory.getFirst((int[])nArray4).interact(lIllllIll[llIIIIIIl[6]]);
                Time.sleepTicks((int)llIIIIIIl[5]);
                0;
            }
            if (t.lIlIIIIllIIl(Inventory.contains((int[])f.aV) ? 1 : 0) && t.lIlIIIIllIlI(Movement.getRunEnergy(), llIIIIIIl[16])) {
                Inventory.getFirst((int[])f.aV).interact(lIllllIll[llIIIIIIl[13]]);
                Time.sleepTicks((int)llIIIIIIl[0]);
                0;
            }
            if (t.lIlIIIIllIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[0]) && t.lIlIIIIllIIl(t.ab() ? 1 : 0) && t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIIIIIl[2])) {
                int[] nArray5 = new int[llIIIIIIl[0]];
                nArray5[t.llIIIIIIl[1]] = llIIIIIIl[3];
                if (t.lIlIIIIllIll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (t.lIlIIIIllIll(Players.getLocal().getWorldLocation().equals((Object)cB) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[17]];
                        if (t.lIlIIIIllIIl(Dialog.isOpen() ? 1 : 0) && t.lIlIIIIllIlI(cA, llIIIIIIl[5])) {
                            Dialog.close();
                            cA += llIIIIIIl[0];
                        }
                        e.a(cB);
                    }
                    if (t.lIlIIIIllIIl(Players.getLocal().getWorldLocation().equals((Object)cB) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[18]];
                        g.a(lIllllIll[llIIIIIIl[2]], bR);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llIIIIIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)llIIIIIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)llIIIIIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)llIIIIIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)llIIIIIIl[23]));
            if (t.lIlIIIIlllIl(Vars.getBit((int)llIIIIIIl[19]), llIIIIIIl[0])) {
                cv = llIIIIIIl[0];
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)llIIIIIIl[20]), llIIIIIIl[0])) {
                cw = llIIIIIIl[0];
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)llIIIIIIl[21]), llIIIIIIl[0])) {
                cx = llIIIIIIl[0];
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)llIIIIIIl[22]), llIIIIIIl[0])) {
                cy = llIIIIIIl[0];
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)llIIIIIIl[23]), llIIIIIIl[0])) {
                cz = llIIIIIIl[0];
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[0])) {
                int lIllllIlIIlIlI;
                cl = llIIIIIIl[1];
                if (t.lIlIIIIllIll(cv ? 1 : 0)) {
                    String[] stringArray = new String[llIIIIIIl[0]];
                    stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[24]];
                    if (t.lIlIIIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llIIIIIIl[0]];
                        stringArray2[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[12]];
                        if (t.lIlIIIIllIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llIIIIIIl[0]];
                            stringArray3[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[25]];
                            if (t.lIlIIIIllIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llIIIIIIl[0]];
                                stringArray4[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[15]];
                                String[] stringArray5 = new String[llIIIIIIl[0]];
                                stringArray5[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llIIIIIIl[5]);
                                0;
                            }
                        }
                    }
                    String[] stringArray6 = new String[llIIIIIIl[0]];
                    stringArray6[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[27]];
                    if (t.lIlIIIIllIIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cC), llIIIIIIl[2])) {
                            AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[28]];
                            Movement.walkTo((WorldPoint)cC);
                            0;
                            Time.sleepTicks((int)llIIIIIIl[0]);
                            0;
                        }
                        if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cC), llIIIIIIl[2])) {
                            AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[29]];
                            g.a(lIllllIll[llIIIIIIl[30]], bR, llIIIIIIl[0]);
                            Time.sleepTicks((int)llIIIIIIl[0]);
                            0;
                            lIllllIlIIllII = Dialog.getOptions();
                            lIllllIlIIlIll = new ArrayList();
                            if (t.lIlIIIIllIll(lIllllIlIIllII.isEmpty() ? 1 : 0)) {
                                lIllllIlIIlIlI = llIIIIIIl[1];
                                while (t.lIlIIIIllIlI(lIllllIlIIlIlI, lIllllIlIIllII.size())) {
                                    lIllllIlIIlIll.add(((Widget)lIllllIlIIllII.get(lIllllIlIIlIlI)).getText());
                                    0;
                                    ++lIllllIlIIlIlI;
                                    0;
                                    if (((0xE8 ^ 0xBF) & ~(0x12 ^ 0x45)) < (0xBA ^ 0xBE)) continue;
                                    return;
                                }
                                lIllllIlIIlIlI = lIllllIlIIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[90]])) ? 1 : 0;
                                int n2 = lIllllIlIIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[89]]));
                                if (t.lIlIIIIllIIl(lIllllIlIIlIlI) && t.lIlIIIIllIIl(n2)) {
                                    System.out.println(lIllllIll[llIIIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (t.lIlIIIIllIll(cw ? 1 : 0) && t.lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cD), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[32]];
                        Movement.walkTo((WorldPoint)cD);
                        0;
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                    }
                    if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cD), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[33]];
                        g.a(lIllllIll[llIIIIIIl[34]], bR, llIIIIIIl[0]);
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                        lIllllIlIIllII = Dialog.getOptions();
                        lIllllIlIIlIll = new ArrayList();
                        if (t.lIlIIIIllIll(lIllllIlIIllII.isEmpty() ? 1 : 0)) {
                            lIllllIlIIlIlI = llIIIIIIl[1];
                            while (t.lIlIIIIllIlI(lIllllIlIIlIlI, lIllllIlIIllII.size())) {
                                lIllllIlIIlIll.add(((Widget)lIllllIlIIllII.get(lIllllIlIIlIlI)).getText());
                                0;
                                ++lIllllIlIIlIlI;
                                0;
                                if (1 != 0) continue;
                                return;
                            }
                            lIllllIlIIlIlI = lIllllIlIIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[88]])) ? 1 : 0;
                            int n3 = lIllllIlIIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[87]]));
                            if (t.lIlIIIIllIIl(lIllllIlIIlIlI) && t.lIlIIIIllIIl(n3)) {
                                System.out.println(lIllllIll[llIIIIIIl[35]]);
                            }
                        }
                    }
                }
                if (t.lIlIIIIllIll(cx ? 1 : 0) && t.lIlIIIIllIIl(cw ? 1 : 0) && t.lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cE), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[36]];
                        Movement.walkTo((WorldPoint)cE);
                        0;
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                    }
                    if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cE), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[37]];
                        g.a(lIllllIll[llIIIIIIl[38]], bR, llIIIIIIl[0]);
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                        lIllllIlIIllII = Dialog.getOptions();
                        lIllllIlIIlIll = new ArrayList();
                        if (t.lIlIIIIllIll(lIllllIlIIllII.isEmpty() ? 1 : 0)) {
                            lIllllIlIIlIlI = llIIIIIIl[1];
                            while (t.lIlIIIIllIlI(lIllllIlIIlIlI, lIllllIlIIllII.size())) {
                                lIllllIlIIlIll.add(((Widget)lIllllIlIIllII.get(lIllllIlIIlIlI)).getText());
                                0;
                                ++lIllllIlIIlIlI;
                                0;
                                if (((0x14 ^ 0x77) & ~(0x6A ^ 9)) == 0) continue;
                                return;
                            }
                            lIllllIlIIlIlI = lIllllIlIIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[86]])) ? 1 : 0;
                            int n4 = lIllllIlIIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[85]]));
                            if (t.lIlIIIIllIIl(lIllllIlIIlIlI) && t.lIlIIIIllIIl(n4)) {
                                System.out.println(lIllllIll[llIIIIIIl[39]]);
                            }
                        }
                    }
                }
                if (t.lIlIIIIllIll(cy ? 1 : 0) && t.lIlIIIIllIIl(cx ? 1 : 0) && t.lIlIIIIllIIl(cw ? 1 : 0) && t.lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cF), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[40]];
                        Movement.walkTo((WorldPoint)cF);
                        0;
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                    }
                    if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cF), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[41]];
                        g.a(lIllllIll[llIIIIIIl[42]], bR, llIIIIIIl[0]);
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                        lIllllIlIIllII = Dialog.getOptions();
                        lIllllIlIIlIll = new ArrayList();
                        if (t.lIlIIIIllIll(lIllllIlIIllII.isEmpty() ? 1 : 0)) {
                            lIllllIlIIlIlI = llIIIIIIl[1];
                            while (t.lIlIIIIllIlI(lIllllIlIIlIlI, lIllllIlIIllII.size())) {
                                lIllllIlIIlIll.add(((Widget)lIllllIlIIllII.get(lIllllIlIIlIlI)).getText());
                                0;
                                ++lIllllIlIIlIlI;
                                0;
                                if (-2 < 0) continue;
                                return;
                            }
                            lIllllIlIIlIlI = lIllllIlIIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[84]])) ? 1 : 0;
                            int n5 = lIllllIlIIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[83]]));
                            if (t.lIlIIIIllIIl(lIllllIlIIlIlI) && t.lIlIIIIllIIl(n5)) {
                                System.out.println(lIllllIll[llIIIIIIl[43]]);
                            }
                        }
                    }
                }
                if (t.lIlIIIIllIll(cz ? 1 : 0) && t.lIlIIIIllIIl(cy ? 1 : 0) && t.lIlIIIIllIIl(cx ? 1 : 0) && t.lIlIIIIllIIl(cw ? 1 : 0) && t.lIlIIIIllIIl(cv ? 1 : 0)) {
                    if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cG), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[44]];
                        Movement.walkTo((WorldPoint)cG);
                        0;
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                    }
                    if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cG), llIIIIIIl[18])) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[45]];
                        g.a(lIllllIll[llIIIIIIl[46]], bR, llIIIIIIl[0]);
                        Time.sleepTicks((int)llIIIIIIl[0]);
                        0;
                        lIllllIlIIllII = Dialog.getOptions();
                        lIllllIlIIlIll = new ArrayList();
                        if (t.lIlIIIIllIll(lIllllIlIIllII.isEmpty() ? 1 : 0)) {
                            lIllllIlIIlIlI = llIIIIIIl[1];
                            while (t.lIlIIIIllIlI(lIllllIlIIlIlI, lIllllIlIIllII.size())) {
                                lIllllIlIIlIll.add(((Widget)lIllllIlIIllII.get(lIllllIlIIlIlI)).getText());
                                0;
                                ++lIllllIlIIlIlI;
                                0;
                                
                                return;
                            }
                            lIllllIlIIlIlI = lIllllIlIIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[16]])) ? 1 : 0;
                            int n6 = lIllllIlIIlIll.stream().anyMatch(string -> string.contains(lIllllIll[llIIIIIIl[82]]));
                            int n7 = lIllllIlIIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(lIllllIll[llIIIIIIl[81]]));
                            if ((!t.lIlIIIIllIll(lIllllIlIIlIlI) || t.lIlIIIIllIIl(n6)) && t.lIlIIIIllIIl(n7)) {
                                System.out.println(lIllllIll[llIIIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[5])) {
                if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[48]];
                    if (t.lIlIIIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(cB);
                }
                if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[49]];
                    g.a(lIllllIll[llIIIIIIl[50]], bR);
                }
            }
            if (!t.lIlIIIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[10]) || t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[17])) {
                g.a(bR);
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[6])) {
                if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cH), llIIIIIIl[6])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[51]];
                    Movement.walkTo((WorldPoint)cH);
                    0;
                    Time.sleepTicks((int)llIIIIIIl[0]);
                    0;
                }
                if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cH), llIIIIIIl[6])) {
                    String[] stringArray = new String[llIIIIIIl[0]];
                    stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[52]];
                    if (t.lIlIIIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llIIIIIIl[0]];
                        stringArray7[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(lIllllIll[llIIIIIIl[54]]);
                        Time.sleepTicks((int)llIIIIIIl[10]);
                        0;
                    }
                }
            }
            if (t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[13])) {
                if (t.lIlIIIlIIIII(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[55]];
                    e.a(cB);
                }
                if (t.lIlIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(cB), llIIIIIIl[5])) {
                    AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[56]];
                    g.a(lIllllIll[llIIIIIIl[57]], bR);
                }
            }
            if (!t.lIlIIIllIlII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[18]) || t.lIlIIIIlllIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIIIIIl[2])) {
                if (t.lIlIIIIllIlI(cl, llIIIIIIl[0])) {
                    an.oY += llIIIIIIl[0];
                    an.o(AccBuilderEasyClues.m);
                    cl += llIIIIIIl[0];
                    an.oY = llIIIIIIl[1];
                    cm = llIIIIIIl[1];
                }
                String[] stringArray = new String[llIIIIIIl[0]];
                stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[58]];
                if (t.lIlIIIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (t.lIlIIIIllllI(Widgets.get((int)llIIIIIIl[59]))) {
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[60]];
                        String[] stringArray8 = new String[llIIIIIIl[0]];
                        stringArray8[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(lIllllIll[llIIIIIIl[62]]);
                        Time.sleepTicks((int)llIIIIIIl[6]);
                        0;
                        AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[63]];
                        lIllllIlIIllII = Widgets.get((int)llIIIIIIl[59], (int)llIIIIIIl[27]);
                        if (t.lIlIIIIllllI(lIllllIlIIllII)) {
                            lIllllIlIIllII.interact(lIllllIll[llIIIIIIl[64]]);
                            Time.sleepTicks((int)llIIIIIIl[0]);
                            0;
                        }
                        if (t.lIlIIIIllllI(lIllllIlIIlIll = Widgets.get((int)llIIIIIIl[59], (int)llIIIIIIl[39]))) {
                            lIllllIlIIlIll.interact(lIllllIll[llIIIIIIl[65]]);
                            Time.sleepTicks((int)llIIIIIIl[5]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)llIIIIIIl[0]);
                    0;
                }
            }
        }
    }

    private static String lIIllllllIIl(String lIllllIIllIIll, String lIllllIIlIllIl) {
        lIllllIIllIIll = new String(Base64.getDecoder().decode(lIllllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllIIllIIIl = new StringBuilder();
        char[] lIllllIIllIIII = lIllllIIlIllIl.toCharArray();
        int lIllllIIlIllll = llIIIIIIl[1];
        char[] lIllllIIlIlIIl = lIllllIIllIIll.toCharArray();
        int lIllllIIlIlIII = lIllllIIlIlIIl.length;
        int lIllllIIlIIlll = llIIIIIIl[1];
        while (t.lIlIIIIllIlI(lIllllIIlIIlll, lIllllIIlIlIII)) {
            char lIllllIIllIlII = lIllllIIlIlIIl[lIllllIIlIIlll];
            lIllllIIllIIIl.append((char)(lIllllIIllIlII ^ lIllllIIllIIII[lIllllIIlIllll % lIllllIIllIIII.length]));
            0;
            ++lIllllIIlIllll;
            ++lIllllIIlIIlll;
            0;
            
            return null;
        }
        return String.valueOf(lIllllIIllIIIl);
    }

    public static void aM() {
        String[] stringArray = new String[llIIIIIIl[0]];
        stringArray[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[66]];
        if (t.lIlIIIIllIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (t.lIlIIIIllllI(Widgets.get((int)llIIIIIIl[59]))) {
                Widget lIllllIlIIIlII;
                AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[67]];
                String[] stringArray2 = new String[llIIIIIIl[0]];
                stringArray2[t.llIIIIIIl[1]] = lIllllIll[llIIIIIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(lIllllIll[llIIIIIIl[69]]);
                Time.sleepTicks((int)llIIIIIIl[6]);
                0;
                AccBuilderEasyClues.c = lIllllIll[llIIIIIIl[70]];
                Widget widget = Widgets.get((int)llIIIIIIl[59], (int)llIIIIIIl[27]);
                if (t.lIlIIIIllllI(widget)) {
                    widget.interact(lIllllIll[llIIIIIIl[71]]);
                    Time.sleepTicks((int)llIIIIIIl[0]);
                    0;
                }
                if (t.lIlIIIIllllI(lIllllIlIIIlII = Widgets.get((int)llIIIIIIl[59], (int)llIIIIIIl[39]))) {
                    lIllllIlIIIlII.interact(lIllllIll[llIIIIIIl[72]]);
                    Time.sleepTicks((int)llIIIIIIl[5]);
                    0;
                }
            }
            Time.sleepTicks((int)llIIIIIIl[0]);
            0;
        }
    }

    private static boolean lIlIIIllIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIIIIllIII() {
        llIIIIIIl = new int[126];
        t.llIIIIIIl[0] = 1;
        t.llIIIIIIl[1] = (6 ^ 0) & ~(0xA ^ 0xC);
        t.llIIIIIIl[2] = 0x30 ^ 0x45 ^ (0x56 ^ 0x2B);
        t.llIIIIIIl[3] = -(0xFFFF8D37 & 0x76CF) & (0xFFFFDF3F & 0x7EE6);
        t.llIIIIIIl[4] = 0xFFFFD7D9 & 0x3BAE;
        t.llIIIIIIl[5] = 2;
        t.llIIIIIIl[6] = 0xC1 ^ 0x90 ^ (0xF7 ^ 0xA2);
        t.llIIIIIIl[7] = -(0xFFFFFA91 & 0x65FF) & (0xFFFFFFFF & 0x7FD7);
        t.llIIIIIIl[8] = -(0xFFFFF0FD & 0x6F33) & (0xFFFFFFF9 & 0x7F7F);
        t.llIIIIIIl[9] = -(0xFFFFE9D7 & 0x5EEE) & (0xFFFFC9FF & Short.MAX_VALUE);
        t.llIIIIIIl[10] = 3;
        t.llIIIIIIl[11] = -(0xFFFFFFAD & 0x4ADB) & (0xFFFFFFFD & 0x7BDB);
        t.llIIIIIIl[12] = 0x6D ^ 0x28 ^ (0x7A ^ 0x35);
        t.llIIIIIIl[13] = 0xC2 ^ 0xC7;
        t.llIIIIIIl[14] = -(0xFFFFFB35 & 0x66CF) & (0xFFFFFB7F & 0x67FF);
        t.llIIIIIIl[15] = 0x87 ^ 0x8B;
        t.llIIIIIIl[16] = 0xED ^ 0xAC;
        t.llIIIIIIl[17] = 0x18 ^ 0x1E;
        t.llIIIIIIl[18] = 0x1B ^ 0x48 ^ (0x1D ^ 0x49);
        t.llIIIIIIl[19] = 0xFFFFFFF6 & 0x15FD;
        t.llIIIIIIl[20] = -(0xFFFFDAAF & 0x2D5B) & (0xFFFFBFFF & 0x5DFF);
        t.llIIIIIIl[21] = -(0xFFFFFD93 & 0x6A6D) & (0xFFFFFFF6 & 0x7DFF);
        t.llIIIIIIl[22] = -(0xFFFFCCDF & 0x7B29) & (0xFFFFFFFF & 0x5DFF);
        t.llIIIIIIl[23] = -(0xFFFF869D & 0x7B66) & (0xFFFFDFFB & 0x37FF);
        t.llIIIIIIl[24] = 0x1B ^ 0x72 ^ (0xD5 ^ 0xB5);
        t.llIIIIIIl[25] = 0x93 ^ 0x98;
        t.llIIIIIIl[26] = 0x6C ^ 0x61;
        t.llIIIIIIl[27] = 0x3D ^ 0x33;
        t.llIIIIIIl[28] = 2 ^ 0xD;
        t.llIIIIIIl[29] = 51 + 188 - 94 + 70 ^ 10 + 165 - 78 + 102;
        t.llIIIIIIl[30] = 0x8B ^ 0x9A;
        t.llIIIIIIl[31] = 0x82 ^ 0x90;
        t.llIIIIIIl[32] = 0xB1 ^ 0xA2;
        t.llIIIIIIl[33] = 0x11 ^ 0xB ^ (0xB7 ^ 0xB9);
        t.llIIIIIIl[34] = 0x32 ^ 0x23 ^ (0x1F ^ 0x1B);
        t.llIIIIIIl[35] = 0x22 ^ 0x1C ^ (0x60 ^ 0x48);
        t.llIIIIIIl[36] = 0x4E ^ 0x20 ^ (0x7D ^ 4);
        t.llIIIIIIl[37] = 0x27 ^ 0x5A ^ (0x2D ^ 0x48);
        t.llIIIIIIl[38] = 31 + 26 - 33 + 108 ^ 127 + 84 - 55 + 1;
        t.llIIIIIIl[39] = 0x9B ^ 0x81;
        t.llIIIIIIl[40] = 0x17 ^ 0x38 ^ (0x6A ^ 0x5E);
        t.llIIIIIIl[41] = 1 ^ 0x1D;
        t.llIIIIIIl[42] = 0xD ^ 0x2D ^ (0x3A ^ 7);
        t.llIIIIIIl[43] = 0x42 ^ 0x5C;
        t.llIIIIIIl[44] = 142 + 44 - 88 + 84 ^ 161 + 139 - 275 + 144;
        t.llIIIIIIl[45] = 0xE2 ^ 0xC2;
        t.llIIIIIIl[46] = 0x31 ^ 0x10;
        t.llIIIIIIl[47] = 0x49 ^ 0x1E ^ (0x7F ^ 0xA);
        t.llIIIIIIl[48] = 0x12 ^ 0x69 ^ (0xD1 ^ 0x89);
        t.llIIIIIIl[49] = 0x2C ^ 8;
        t.llIIIIIIl[50] = 0x77 ^ 5 ^ (0x40 ^ 0x17);
        t.llIIIIIIl[51] = 28 + 93 - 11 + 38 ^ 67 + 147 - 188 + 152;
        t.llIIIIIIl[52] = 0xE9 ^ 0x95 ^ (0xD2 ^ 0x89);
        t.llIIIIIIl[53] = 19 + 116 - 111 + 132 ^ 65 + 2 - 31 + 144;
        t.llIIIIIIl[54] = 0x31 ^ 0x18;
        t.llIIIIIIl[55] = 178 + 19 - 166 + 154 ^ 66 + 143 - 87 + 25;
        t.llIIIIIIl[56] = 0x80 ^ 0x9A ^ (0x7B ^ 0x4A);
        t.llIIIIIIl[57] = 0x29 ^ 5;
        t.llIIIIIIl[58] = 0x54 ^ 0x79;
        t.llIIIIIIl[59] = (0x2D ^ 0x7D) + (0x21 ^ 0x6E) - (0xAA ^ 0x83) + (0xFD ^ 0x87);
        t.llIIIIIIl[60] = 106 + 8 - -71 + 5 ^ 101 + 10 - 71 + 104;
        t.llIIIIIIl[61] = 0xBE ^ 0x91;
        t.llIIIIIIl[62] = 0x10 ^ 0x20;
        t.llIIIIIIl[63] = 115 + 121 - 96 + 30 ^ 39 + 38 - -35 + 43;
        t.llIIIIIIl[64] = 158 + 161 - 242 + 98 ^ 58 + 49 - -43 + 7;
        t.llIIIIIIl[65] = 0x63 ^ 0x41 ^ (0x26 ^ 0x37);
        t.llIIIIIIl[66] = 0x3C ^ 0x4D ^ (0x49 ^ 0xC);
        t.llIIIIIIl[67] = 74 + 18 - 55 + 152 ^ 126 + 20 - 32 + 22;
        t.llIIIIIIl[68] = 0x48 ^ 0x7E;
        t.llIIIIIIl[69] = 0xE0 ^ 0xB5 ^ (0x24 ^ 0x46);
        t.llIIIIIIl[70] = 0xB3 ^ 0x8B;
        t.llIIIIIIl[71] = 87 + 117 - 55 + 39 ^ 103 + 107 - 123 + 46;
        t.llIIIIIIl[72] = 0x5F ^ 0x65;
        t.llIIIIIIl[73] = 0x8B ^ 0xB0;
        t.llIIIIIIl[74] = -(0xFFFFED6F & 0x3EDB) & (0xFFFFEFFE & 0x3FCF);
        t.llIIIIIIl[75] = 0xFFFFEEFC & 0x3FCF;
        t.llIIIIIIl[76] = -(0xFFFFFF16 & 0x1EFF) & (0xFFFFFFBD & Short.MAX_VALUE);
        t.llIIIIIIl[77] = 0xD5 ^ 0xB1;
        t.llIIIIIIl[78] = 0x94 ^ 0x9C ^ (0x35 ^ 1);
        t.llIIIIIIl[79] = 116 + 69 - 100 + 104 ^ 74 + 39 - 83 + 98;
        t.llIIIIIIl[80] = 125 + 117 - 194 + 92 ^ 131 + 85 - 213 + 175;
        t.llIIIIIIl[81] = 0x4C ^ 0x50 ^ (0xA ^ 0x29);
        t.llIIIIIIl[82] = 0x6B ^ 0x2B;
        t.llIIIIIIl[83] = 0 ^ 0x68 ^ (0x8F ^ 0xA5);
        t.llIIIIIIl[84] = 4 ^ 0x47;
        t.llIIIIIIl[85] = 0x36 ^ 0x72;
        t.llIIIIIIl[86] = 0x3F ^ 0xC ^ (0xDD ^ 0xAB);
        t.llIIIIIIl[87] = 0x5C ^ 0x1A;
        t.llIIIIIIl[88] = 0x57 ^ 0x3F ^ (0xB6 ^ 0x99);
        t.llIIIIIIl[89] = 0xFC ^ 0x8E ^ (0x70 ^ 0x4A);
        t.llIIIIIIl[90] = 0xFB ^ 0xB2;
        t.llIIIIIIl[91] = -(0xFFFFBFEB & 0x789F) & (0xFFFFFFAB & 0x3FFF);
        t.llIIIIIIl[92] = -(0xFFFFDFD6 & 0x303F) & (0xFFFFFE7F & 0x1FFF);
        t.llIIIIIIl[93] = -(0xFFFFFCE9 & 0x7B77) & (0xFFFFFFFF & 0x7F6F);
        t.llIIIIIIl[94] = 0xFFFFCEFE & 0x3F8F;
        t.llIIIIIIl[95] = 0xFFFFC7FF & 0x3EB7;
        t.llIIIIIIl[96] = 0xFFFFFFBD & 0xECF;
        t.llIIIIIIl[97] = 0xFFFF9E4F & 0x67BF;
        t.llIIIIIIl[98] = 0xFFFFDFB5 & 0x2EEF;
        t.llIIIIIIl[99] = 0xFFFFC5F0 & 0x3FFF;
        t.llIIIIIIl[100] = 0xFFFF9E1F & 0x6FE7;
        t.llIIIIIIl[101] = 0xFFFFEFFF & 0x16EE;
        t.llIIIIIIl[102] = -(152 + 55 - 134 + 96) & (0xFFFF9FFE & 0x6EAD);
        t.llIIIIIIl[103] = -(0xFFFFF9FC & 0xE4B) & (0xFFFFFEF7 & 0xFFF);
        t.llIIIIIIl[104] = -(0xFFFFA1F3 & 0x7EDD) & (0xFFFFFFFB & 0x2FFF);
        t.llIIIIIIl[105] = 0x3A ^ 0x48 ^ (0x51 ^ 0x69);
        t.llIIIIIIl[106] = 0x37 ^ 0x7C;
        t.llIIIIIIl[107] = 0 ^ 0x69 ^ (0x6D ^ 0x48);
        t.llIIIIIIl[108] = 169 + 36 - 80 + 99 ^ 88 + 97 - 132 + 120;
        t.llIIIIIIl[109] = 136 + 45 - 127 + 163 ^ 21 + 39 - 52 + 143;
        t.llIIIIIIl[110] = 0x73 ^ 0x1D ^ (0x50 ^ 0x71);
        t.llIIIIIIl[111] = 82 + 88 - 74 + 52 ^ 30 + 156 - 103 + 113;
        t.llIIIIIIl[112] = 0x65 ^ 0x43 ^ (0x3D ^ 0x4A);
        t.llIIIIIIl[113] = 0xE ^ 0x78 ^ (0x7F ^ 0x5B);
        t.llIIIIIIl[114] = 0xEB ^ 0xB8;
        t.llIIIIIIl[115] = 0xDD ^ 0x89;
        t.llIIIIIIl[116] = 0x9E ^ 0xB6 ^ (0xC0 ^ 0xBD);
        t.llIIIIIIl[117] = 0xCD ^ 0x9B;
        t.llIIIIIIl[118] = 0xC8 ^ 0x9F;
        t.llIIIIIIl[119] = 0xD9 ^ 0x81;
        t.llIIIIIIl[120] = 0xFE ^ 0xA7;
        t.llIIIIIIl[121] = 0x33 ^ 0x69;
        t.llIIIIIIl[122] = 76 + 128 - 157 + 173 ^ 54 + 122 - 158 + 117;
        t.llIIIIIIl[123] = 0xE1 ^ 0xBD;
        t.llIIIIIIl[124] = 0x7B ^ 0x26;
        t.llIIIIIIl[125] = 0x5E ^ 0x6D ^ (0x1E ^ 0x73);
    }
}

