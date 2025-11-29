/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class F
implements K {
    public static /* synthetic */ WorldPoint cV;
    public static /* synthetic */ WorldPoint iH;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldArea iL;
    static /* synthetic */ int dc;
    public static /* synthetic */ WorldPoint iI;
    public static /* synthetic */ WorldPoint iJ;
    static /* synthetic */ String[] cy;
    static /* synthetic */ int iK;
    static /* synthetic */ boolean dd;
    public static /* synthetic */ List<d> bp;
    private static /* synthetic */ String[] lIlIIlIlII;
    public static /* synthetic */ WorldPoint iG;
    private static /* synthetic */ int[] lIlIIlIllI;

    private static boolean lIIIllIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean al() {
        void llllllllllllllllllllIIlIIllIlIII;
        int[] nArray = new int[lIlIIlIllI[4]];
        nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[5];
        nArray[F.lIlIIlIllI[0]] = lIlIIlIllI[6];
        nArray[F.lIlIIlIllI[3]] = lIlIIlIllI[7];
        nArray[F.lIlIIlIllI[8]] = lIlIIlIllI[9];
        int[] nArray2 = nArray;
        int llllllllllllllllllllIIlIIllIIlll = lIlIIlIllI[1];
        while (F.lIIIllIIIllIl(llllllllllllllllllllIIlIIllIIlll, ((void)llllllllllllllllllllIIlIIllIlIII).length)) {
            int[] nArray3 = new int[lIlIIlIllI[0]];
            nArray3[F.lIlIIlIllI[1]] = llllllllllllllllllllIIlIIllIlIII[llllllllllllllllllllIIlIIllIIlll];
            if (F.lIIIllIIIlllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIlIIlIllI[1];
            }
            ++llllllllllllllllllllIIlIIllIIlll;
            0;
            if (((0x1C ^ 0x24) & ~(0x95 ^ 0xAD)) == 0) continue;
            return ((0xA8 ^ 0x99) & ~(0x2D ^ 0x1C)) != 0;
        }
        return lIlIIlIllI[0];
    }

    private static void lIIIllIIIlIIl() {
        lIlIIlIlII = new String[lIlIIlIllI[197]];
        F.lIlIIlIlII[F.lIlIIlIllI[1]] = F."Finished buying items, switching back to quest";
        F.lIlIIlIlII[F.lIlIIlIllI[0]] = F."Nav to bank";
        F.lIlIIlIlII[F.lIlIIlIllI[3]] = F."Handling banking";
        F.lIlIIlIlII[F.lIlIIlIllI[8]] = F."We are missing quest supplies, switching to BUYING";
        F.lIlIIlIlII[F.lIlIIlIllI[4]] = F."Drink";
        F.lIlIIlIlII[F.lIlIIlIllI[14]] = F."Eat";
        F.lIlIIlIlII[F.lIlIIlIllI[17]] = F."Nav to start";
        F.lIlIIlIlII[F.lIlIIlIllI[18]] = F."Start quest";
        F.lIlIIlIlII[F.lIlIIlIllI[16]] = F."Veronica";
        F.lIlIIlIlII[F.lIlIIlIllI[20]] = F."Key";
        F.lIlIIlIlII[F.lIlIIlIllI[10]] = F."Nav to fish food";
        F.lIlIIlIlII[F.lIlIIlIllI[23]] = F."Can't reach, navigating";
        F.lIlIIlIlII[F.lIlIIlIllI[24]] = F."Taking food";
        F.lIlIIlIlII[F.lIlIIlIllI[25]] = F."Take";
        F.lIlIIlIlII[F.lIlIIlIllI[26]] = F."Making poison fish food";
        F.lIlIIlIlII[F.lIlIIlIllI[27]] = F."Key";
        F.lIlIIlIlII[F.lIlIIlIllI[28]] = F."Nav to compost";
        F.lIlIIlIlII[F.lIlIIlIllI[29]] = F."Digging";
        F.lIlIIlIlII[F.lIlIIlIllI[30]] = F."Compost heap";
        F.lIlIIlIlII[F.lIlIIlIllI[31]] = F."Search";
        F.lIlIIlIlII[F.lIlIIlIllI[32]] = F."Key";
        F.lIlIIlIlII[F.lIlIIlIllI[33]] = F."Nav to fountain";
        F.lIlIIlIlII[F.lIlIIlIllI[34]] = F."Fountain";
        F.lIlIIlIlII[F.lIlIIlIllI[35]] = F."Key";
        F.lIlIIlIlII[F.lIlIIlIllI[36]] = F."Pressure gauge";
        F.lIlIIlIlII[F.lIlIIlIllI[37]] = F."Getting guage";
        F.lIlIIlIlII[F.lIlIIlIllI[38]] = F."Fountain";
        F.lIlIIlIlII[F.lIlIIlIllI[39]] = F."Search";
        F.lIlIIlIlII[F.lIlIIlIllI[40]] = F."Key";
        F.lIlIIlIlII[F.lIlIIlIllI[41]] = F."Pressure gauge";
        F.lIlIIlIlII[F.lIlIIlIllI[42]] = F."Rubber tube";
        F.lIlIIlIlII[F.lIlIIlIllI[46]] = F."Nav to door";
        F.lIlIIlIlII[F.lIlIIlIllI[47]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[48]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[49]] = F."Get tube";
        F.lIlIIlIlII[F.lIlIIlIllI[50]] = F."Rubber tube";
        F.lIlIIlIlII[F.lIlIIlIllI[51]] = F."Take";
        F.lIlIIlIlII[F.lIlIIlIllI[52]] = F."Rubber tube";
        F.lIlIIlIlII[F.lIlIIlIllI[53]] = F."Oil can";
        F.lIlIIlIlII[F.lIlIIlIllI[56]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[57]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[58]] = F."Nav to final room";
        F.lIlIIlIlII[F.lIlIIlIllI[59]] = F."Ladder";
        F.lIlIIlIlII[F.lIlIIlIllI[60]] = F."Climb-down";
        F.lIlIIlIlII[F.lIlIIlIllI[76]] = F."Nav to a";
        F.lIlIIlIlII[F.lIlIIlIllI[77]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[78]] = F."Lever A";
        F.lIlIIlIlII[F.lIlIIlIllI[79]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[81]] = F."Nav to b";
        F.lIlIIlIlII[F.lIlIIlIllI[82]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[15]] = F."Lever B";
        F.lIlIIlIlII[F.lIlIIlIllI[83]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[85]] = F."Nav to d";
        F.lIlIIlIlII[F.lIlIIlIllI[86]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[87]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[88]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[89]] = F."Lever D";
        F.lIlIIlIlII[F.lIlIIlIllI[90]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[92]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[93]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[94]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[95]] = F."Nav to b";
        F.lIlIIlIlII[F.lIlIIlIllI[96]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[97]] = F."Lever B";
        F.lIlIIlIlII[F.lIlIIlIllI[98]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[99]] = F."Nav to a";
        F.lIlIIlIlII[F.lIlIIlIllI[100]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[101]] = F."Lever A";
        F.lIlIIlIlII[F.lIlIIlIllI[102]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[105]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[106]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[107]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[110]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[111]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[112]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[114]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[115]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[116]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[117]] = F."Nav to e";
        F.lIlIIlIlII[F.lIlIIlIllI[118]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[119]] = F."Lever E";
        F.lIlIIlIlII[F.lIlIIlIllI[120]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[122]] = F."Nav to f";
        F.lIlIIlIlII[F.lIlIIlIllI[123]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[124]] = F."Lever F";
        F.lIlIIlIlII[F.lIlIIlIllI[125]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[128]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[129]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[130]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[132]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[133]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[134]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[135]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[136]] = F."Lever C";
        F.lIlIIlIlII[F.lIlIIlIllI[137]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[139]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[140]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[141]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[142]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[143]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[144]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[145]] = F."Nav to e";
        F.lIlIIlIlII[F.lIlIIlIllI[146]] = F."Pull lever";
        F.lIlIIlIlII[F.lIlIIlIllI[147]] = F."Lever E";
        F.lIlIIlIlII[F.lIlIIlIllI[148]] = F."Pull";
        F.lIlIIlIlII[F.lIlIIlIllI[149]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[150]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[151]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[153]] = F."Move to door";
        F.lIlIIlIlII[F.lIlIIlIllI[154]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[155]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[156]] = F."Opening 145";
        F.lIlIIlIlII[F.lIlIIlIllI[158]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[160]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[163]] = F."Oil can";
        F.lIlIIlIlII[F.lIlIIlIllI[164]] = F."Oil can";
        F.lIlIIlIlII[F.lIlIIlIllI[165]] = F."Take";
        F.lIlIIlIlII[F.lIlIIlIllI[166]] = F."Rubber tube";
        F.lIlIIlIlII[F.lIlIIlIllI[167]] = F."Oil can";
        F.lIlIIlIlII[F.lIlIIlIllI[168]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[169]] = F."Nav to professor";
        F.lIlIIlIlII[F.lIlIIlIllI[170]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[171]] = F."Professor Oddenstein";
        F.lIlIIlIlII[F.lIlIIlIllI[172]] = F."Nav to professor";
        F.lIlIIlIlII[F.lIlIIlIllI[173]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[174]] = F."Professor Oddenstein";
        F.lIlIIlIlII[F.lIlIIlIllI[180]] = F."Ernest the Chicken";
        F.lIlIIlIlII[F.lIlIIlIllI[181]] = F."ring of wealth (";
        F.lIlIIlIlII[F.lIlIIlIllI[182]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[183]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[185]] = F."Door";
        F.lIlIIlIlII[F.lIlIIlIllI[186]] = F."Open";
        F.lIlIIlIlII[F.lIlIIlIllI[193]] = F."Yes.";
        F.lIlIIlIlII[F.lIlIIlIllI[194]] = F."I'm looking for a guy called Ernest.";
        F.lIlIIlIlII[F.lIlIIlIllI[195]] = F."I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static boolean lIIIllIIlIIII(int n2) {
        return n2 > 0;
    }

    private static String lIIIllIIIIlII(String llllllllllllllllllllIIlIIlIIllIl, String llllllllllllllllllllIIlIIlIIllII) {
        llllllllllllllllllllIIlIIlIIllIl = new String(Base64.getDecoder().decode(llllllllllllllllllllIIlIIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIIlIIlIlIIII = new StringBuilder();
        char[] llllllllllllllllllllIIlIIlIIllll = llllllllllllllllllllIIlIIlIIllII.toCharArray();
        int llllllllllllllllllllIIlIIlIIlllI = lIlIIlIllI[1];
        char[] llllllllllllllllllllIIlIIlIIlIII = llllllllllllllllllllIIlIIlIIllIl.toCharArray();
        int llllllllllllllllllllIIlIIlIIIlll = llllllllllllllllllllIIlIIlIIlIII.length;
        int llllllllllllllllllllIIlIIlIIIllI = lIlIIlIllI[1];
        while (F.lIIIllIIIllIl(llllllllllllllllllllIIlIIlIIIllI, llllllllllllllllllllIIlIIlIIIlll)) {
            char llllllllllllllllllllIIlIIlIlIIll = llllllllllllllllllllIIlIIlIIlIII[llllllllllllllllllllIIlIIlIIIllI];
            llllllllllllllllllllIIlIIlIlIIII.append((char)(llllllllllllllllllllIIlIIlIlIIll ^ llllllllllllllllllllIIlIIlIIllll[llllllllllllllllllllIIlIIlIIlllI % llllllllllllllllllllIIlIIlIIllll.length]));
            0;
            ++llllllllllllllllllllIIlIIlIIlllI;
            ++llllllllllllllllllllIIlIIlIIIllI;
            0;
            if ((0xC4 ^ 0xC0) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllIIlIIlIlIIII);
    }

    private static boolean lIIIllIIlIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        return lIlIIlIllI[1];
    }

    static {
        F.lIIIllIIIlIlI();
        F.lIIIllIIIlIIl();
        bp = new ArrayList<d>();
        cV = new WorldPoint(lIlIIlIllI[64], lIlIIlIllI[187], lIlIIlIllI[1]);
        iG = new WorldPoint(lIlIIlIllI[188], lIlIIlIllI[189], lIlIIlIllI[1]);
        iH = new WorldPoint(lIlIIlIllI[161], lIlIIlIllI[190], lIlIIlIllI[1]);
        iI = new WorldPoint(lIlIIlIllI[191], lIlIIlIllI[192], lIlIIlIllI[1]);
        iJ = new WorldPoint(lIlIIlIllI[64], lIlIIlIllI[45], lIlIIlIllI[3]);
        iK = lIlIIlIllI[47];
        String[] stringArray = new String[lIlIIlIllI[8]];
        stringArray[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[193]];
        stringArray[F.lIlIIlIllI[0]] = lIlIIlIlII[lIlIIlIllI[194]];
        stringArray[F.lIlIIlIllI[3]] = lIlIIlIlII[lIlIIlIllI[195]];
        cy = stringArray;
        iL = new WorldArea(lIlIIlIllI[188], lIlIIlIllI[196], lIlIIlIllI[50], lIlIIlIllI[40], lIlIIlIllI[1]);
    }

    private static boolean lIIIllIIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static void O() {
        block14: {
            d llllllllllllllllllllIIlIIllIIIll;
            block13: {
                block12: {
                    block11: {
                        Object llllllllllllllllllllIIlIIllIIlII;
                        int[] nArray = new int[lIlIIlIllI[0]];
                        nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[6];
                        if (F.lIIIllIIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lIlIIlIllI[6], lIlIIlIllI[10], lIlIIlIllI[175]);
                            bp.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lIlIIlIllI[0]];
                        nArray2[F.lIlIIlIllI[1]] = lIlIIlIllI[7];
                        if (F.lIIIllIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            llllllllllllllllllllIIlIIllIIlII = new d(lIlIIlIllI[7], lIlIIlIllI[0], lIlIIlIllI[175]);
                            bp.add((d)llllllllllllllllllllIIlIIllIIlII);
                            0;
                        }
                        int[] nArray3 = new int[lIlIIlIllI[0]];
                        nArray3[F.lIlIIlIllI[1]] = lIlIIlIllI[9];
                        if (F.lIIIllIIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            llllllllllllllllllllIIlIIllIIlII = new d(lIlIIlIllI[9], lIlIIlIllI[0], lIlIIlIllI[175]);
                            bp.add((d)llllllllllllllllllllIIlIIllIIlII);
                            0;
                        }
                        if (F.lIIIllIIIlllI(Bank.contains((Predicate)(llllllllllllllllllllIIlIIllIIlII = item -> item.getName().toLowerCase().contains(lIlIIlIlII[lIlIIlIllI[181]]))) ? 1 : 0)) {
                            llllllllllllllllllllIIlIIllIIIll = new d(lIlIIlIllI[176], lIlIIlIllI[14], lIlIIlIllI[177]);
                            bp.add(llllllllllllllllllllIIlIIllIIIll);
                            0;
                        }
                        int[] nArray4 = new int[lIlIIlIllI[0]];
                        nArray4[F.lIlIIlIllI[1]] = lIlIIlIllI[12];
                        if (F.lIIIllIIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            llllllllllllllllllllIIlIIllIIIll = new d(lIlIIlIllI[12], lIlIIlIllI[4], j.bZ);
                            bp.add(llllllllllllllllllllIIlIIllIIIll);
                            0;
                        }
                        int[] nArray5 = new int[lIlIIlIllI[0]];
                        nArray5[F.lIlIIlIllI[1]] = lIlIIlIllI[13];
                        if (!F.lIIIllIIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIlIIlIllI[0]];
                        nArray6[F.lIlIIlIllI[1]] = lIlIIlIllI[13];
                        if (!F.lIIIllIIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIlIIlIllI[0]];
                        nArray7[F.lIlIIlIllI[1]] = lIlIIlIllI[13];
                        if (!F.lIIIllIIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIlIllI[14])) break block12;
                    }
                    llllllllllllllllllllIIlIIllIIIll = new d(lIlIIlIllI[13], lIlIIlIllI[10], lIlIIlIllI[178]);
                    bp.add(llllllllllllllllllllIIlIIllIIIll);
                    0;
                }
                int[] nArray = new int[lIlIIlIllI[0]];
                nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[5];
                if (!F.lIIIllIIIllII(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIlIIlIllI[0]];
                nArray8[F.lIlIIlIllI[1]] = lIlIIlIllI[5];
                if (!F.lIIIllIIIllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIlIIlIllI[0]];
                nArray9[F.lIlIIlIllI[1]] = lIlIIlIllI[5];
                if (!F.lIIIllIIIllIl(Bank.getFirst((int[])nArray9).getQuantity(), lIlIIlIllI[27])) break block14;
            }
            llllllllllllllllllllIIlIIllIIIll = new d(lIlIIlIllI[5], lIlIIlIllI[57], lIlIIlIllI[179]);
            bp.add(llllllllllllllllllllIIlIIllIIIll);
            0;
        }
    }

    private static String lIIIllIIIIIll(String llllllllllllllllllllIIlIIIlIlllI, String llllllllllllllllllllIIlIIIlIllll) {
        try {
            SecretKeySpec llllllllllllllllllllIIlIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIlIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIlIIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIlIIIllIIlI.init(lIlIIlIllI[3], llllllllllllllllllllIIlIIIllIIll);
            return new String(llllllllllllllllllllIIlIIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIIlIIIllIIIl) {
            llllllllllllllllllllIIlIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIlllI(int n2) {
        return n2 == 0;
    }

    public static void ce() {
        block134: {
            BankLocation llllllllllllllllllllIIlIIllllIII;
            block135: {
                WorldArea llllllllllllllllllllIIlIIlllIllI;
                TileItem llllllllllllllllllllIIlIIlllIlll;
                block137: {
                    block136: {
                        if (F.lIIIllIIIllII(bn ? 1 : 0)) {
                            b.a(bp);
                            if (F.lIIIllIIIllIl(bp.size(), lIlIIlIllI[0])) {
                                System.out.println(lIlIIlIlII[lIlIIlIllI[1]]);
                                bn = lIlIIlIllI[1];
                            }
                        }
                        if (!F.lIIIllIIIlllI(bn ? 1 : 0)) break block134;
                        if (F.lIIIllIIIlllI(F.al() ? 1 : 0) && F.lIIIllIIIllIl(e.j(iK), lIlIIlIllI[0])) {
                            llllllllllllllllllllIIlIIllllIII = BankLocation.getNearest();
                            if (F.lIIIllIIIllll(llllllllllllllllllllIIlIIllllIII) && F.lIIIllIIIlllI(llllllllllllllllllllIIlIIllllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[0]];
                                a.a(llllllllllllllllllllIIlIIllllIII);
                            }
                            if (F.lIIIllIIIllll(llllllllllllllllllllIIlIIllllIII) && F.lIIIllIIIllII(llllllllllllllllllllIIlIIllllIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (F.lIIIllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIlIllI[2]);
                                    0;
                                }
                                if (F.lIIIllIIIllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[3]];
                                    if (F.lIIIllIIlIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIlIIlIllI[4]);
                                        0;
                                    }
                                    if (F.lIIIllIIlIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIlIIlIllI[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lIlIIlIllI[4]];
                                    nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[5];
                                    nArray[F.lIlIIlIllI[0]] = lIlIIlIllI[6];
                                    nArray[F.lIlIIlIllI[3]] = lIlIIlIllI[7];
                                    nArray[F.lIlIIlIllI[8]] = lIlIIlIllI[9];
                                    if (F.lIIIllIIIlllI(e.b(nArray) ? 1 : 0)) {
                                        F.O();
                                        System.out.println(lIlIIlIlII[lIlIIlIllI[8]]);
                                        bn = lIlIIlIllI[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIlIIlIllI[4]];
                                    nArray2[F.lIlIIlIllI[1]] = lIlIIlIllI[5];
                                    nArray2[F.lIlIIlIllI[0]] = lIlIIlIllI[6];
                                    nArray2[F.lIlIIlIllI[3]] = lIlIIlIllI[7];
                                    nArray2[F.lIlIIlIllI[8]] = lIlIIlIllI[9];
                                    if (F.lIIIllIIIllII(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIlIIlIllI[5], lIlIIlIllI[10]);
                                        a.a(lIlIIlIllI[6], lIlIIlIllI[10]);
                                        a.a(lIlIIlIllI[7], lIlIIlIllI[0]);
                                        a.a(lIlIIlIllI[11], lIlIIlIllI[0]);
                                        a.a(lIlIIlIllI[9], lIlIIlIllI[0]);
                                        a.a(lIlIIlIllI[12], lIlIIlIllI[0]);
                                        a.a(lIlIIlIllI[13], lIlIIlIllI[14]);
                                    }
                                }
                            }
                        }
                        if (F.lIIIllIIIllII(Inventory.contains((int[])f.aU) ? 1 : 0) && F.lIIIllIIIllIl(Movement.getRunEnergy(), lIlIIlIllI[15])) {
                            Inventory.getFirst((int[])f.aU).interact(lIlIIlIlII[lIlIIlIllI[4]]);
                            Time.sleepTicks((int)lIlIIlIllI[0]);
                            0;
                        }
                        int[] nArray = new int[lIlIIlIllI[0]];
                        nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[13];
                        if (F.lIIIllIIIllII(Inventory.contains((int[])nArray) ? 1 : 0) && F.lIIIllIIlIIIl(F.lIIIllIIIlIll(e.u(), 50.0))) {
                            int[] nArray3 = new int[lIlIIlIllI[0]];
                            nArray3[F.lIlIIlIllI[1]] = lIlIIlIllI[13];
                            Inventory.getFirst((int[])nArray3).interact(lIlIIlIlII[lIlIIlIllI[14]]);
                            Time.sleepTicks((int)lIlIIlIllI[3]);
                            0;
                        }
                        if (F.lIIIllIIIllII(F.al() ? 1 : 0) && F.lIIIllIIIlllI(e.j(iK))) {
                            if (F.lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIllI[16])) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[17]];
                                Movement.walkTo((WorldPoint)cV);
                                0;
                                Time.sleepTicks((int)lIlIIlIllI[0]);
                                0;
                            }
                            if (F.lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIllI[16])) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[18]];
                                if (F.lIIIllIIIllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIlIIlIlII[lIlIIlIllI[16]], cy);
                            }
                        }
                        if (!F.lIIIllIIlIlII(e.j(iK), lIlIIlIllI[0])) break block135;
                        dc = lIlIIlIllI[1];
                        int[] nArray4 = new int[lIlIIlIllI[0]];
                        nArray4[F.lIlIIlIllI[1]] = lIlIIlIllI[11];
                        if (F.lIIIllIIIlllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIlIIlIllI[0]];
                            nArray5[F.lIlIIlIllI[1]] = lIlIIlIllI[19];
                            if (F.lIIIllIIIlllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIlIIlIllI[0]];
                                stringArray[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[20]];
                                if (F.lIIIllIIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllllIII = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[22], lIlIIlIllI[0]);
                                    int[] nArray6 = new int[lIlIIlIllI[0]];
                                    nArray6[F.lIlIIlIllI[1]] = lIlIIlIllI[11];
                                    if (F.lIIIllIIIlllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (F.lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllllIIlIIllllIII), lIlIIlIllI[14])) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[10]];
                                            Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllllIII);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIllI[0]);
                                            0;
                                        }
                                        if (F.lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllllIIlIIllllIII), lIlIIlIllI[14])) {
                                            int[] nArray7 = new int[lIlIIlIllI[0]];
                                            nArray7[F.lIlIIlIllI[1]] = lIlIIlIllI[11];
                                            llllllllllllllllllllIIlIIlllIlll = TileItems.getNearest((int[])nArray7);
                                            if (F.lIIIllIIIllll(llllllllllllllllllllIIlIIlllIlll)) {
                                                if (F.lIIIllIIIlllI(Reachable.isInteractable((Locatable)llllllllllllllllllllIIlIIlllIlll) ? 1 : 0)) {
                                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[23]];
                                                    Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIlll.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lIlIIlIllI[0]);
                                                    0;
                                                }
                                                if (F.lIIIllIIIllII(Reachable.isInteractable((Locatable)llllllllllllllllllllIIlIIlllIlll) ? 1 : 0)) {
                                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[24]];
                                                    llllllllllllllllllllIIlIIlllIlll.interact(lIlIIlIlII[lIlIIlIllI[25]]);
                                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                                    0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIlIIlIllI[0]];
                        nArray8[F.lIlIIlIllI[1]] = lIlIIlIllI[11];
                        if (!F.lIIIllIIIlllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIlIIlIllI[0]];
                        nArray9[F.lIlIIlIllI[1]] = lIlIIlIllI[19];
                        if (!F.lIIIllIIIllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIlIIlIllI[0]];
                    nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[19];
                    if (F.lIIIllIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIlIIlIllI[0]];
                        nArray10[F.lIlIIlIllI[1]] = lIlIIlIllI[11];
                        if (F.lIIIllIIIllII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[26]];
                            int[] nArray11 = new int[lIlIIlIllI[0]];
                            nArray11[F.lIlIIlIllI[1]] = lIlIIlIllI[11];
                            int[] nArray12 = new int[lIlIIlIllI[0]];
                            nArray12[F.lIlIIlIllI[1]] = lIlIIlIllI[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIlIIlIllI[0]);
                            0;
                        }
                    }
                    int[] nArray13 = new int[lIlIIlIllI[0]];
                    nArray13[F.lIlIIlIllI[1]] = lIlIIlIllI[19];
                    if (F.lIIIllIIIllII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIlIllI[0]];
                        stringArray[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[27]];
                        if (F.lIIIllIIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (F.lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iG), lIlIIlIllI[4])) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[28]];
                                Movement.walkTo((WorldPoint)iG);
                                0;
                                Time.sleepTicks((int)lIlIIlIllI[0]);
                                0;
                            }
                            if (F.lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iG), lIlIIlIllI[4])) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[29]];
                                String[] stringArray2 = new String[lIlIIlIllI[0]];
                                stringArray2[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIlIIlIlII[lIlIIlIllI[31]]);
                                Time.sleepTicks((int)lIlIIlIllI[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lIlIIlIllI[0]];
                        stringArray3[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[32]];
                        if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (F.lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iH), lIlIIlIllI[8])) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[33]];
                                Movement.walkTo((WorldPoint)iH);
                                0;
                                Time.sleepTicks((int)lIlIIlIllI[0]);
                                0;
                            }
                            if (F.lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iH), lIlIIlIllI[8])) {
                                int[] nArray14 = new int[lIlIIlIllI[0]];
                                nArray14[F.lIlIIlIllI[1]] = lIlIIlIllI[19];
                                String[] stringArray4 = new String[lIlIIlIllI[0]];
                                stringArray4[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIlIIlIllI[0]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray = new String[lIlIIlIllI[0]];
                stringArray[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[35]];
                if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIlIIlIllI[0]];
                    nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[19];
                    if (F.lIIIllIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIlIIlIllI[0]];
                        stringArray5[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[36]];
                        if (F.lIIIllIIIlllI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[37]];
                            if (F.lIIIllIIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIlIIlIllI[0]];
                                stringArray6[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIlIIlIlII[lIlIIlIllI[39]]);
                                Time.sleepTicks((int)lIlIIlIllI[4]);
                                0;
                            }
                            g.a(cy);
                        }
                    }
                }
                String[] stringArray7 = new String[lIlIIlIllI[0]];
                stringArray7[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[40]];
                if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIlIIlIllI[0]];
                    stringArray8[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[41]];
                    if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIlIIlIllI[0]];
                        stringArray9[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[42]];
                        if (F.lIIIllIIIlllI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            llllllllllllllllllllIIlIIllllIII = new WorldPoint(lIlIIlIllI[43], lIlIIlIllI[44], lIlIIlIllI[1]);
                            llllllllllllllllllllIIlIIlllIlll = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[44], lIlIIlIllI[1]);
                            llllllllllllllllllllIIlIIlllIllI = new WorldArea(lIlIIlIllI[21], lIlIIlIllI[45], lIlIIlIllI[14], lIlIIlIllI[8], lIlIIlIllI[1]);
                            if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllllIII) ? 1 : 0) && F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIlll) ? 1 : 0) && F.lIIIllIIIlllI(llllllllllllllllllllIIlIIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[46]];
                                Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllllIII);
                                0;
                                Time.sleepTicks((int)lIlIIlIllI[0]);
                                0;
                            }
                            if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllllIII) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIlIIlIllI[0]];
                                stringArray10[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIlIIlIlII[lIlIIlIllI[48]]);
                                Time.sleepTicks((int)lIlIIlIllI[3]);
                                0;
                            }
                            if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[49]];
                                String[] stringArray11 = new String[lIlIIlIllI[0]];
                                stringArray11[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIlIIlIlII[lIlIIlIllI[51]]);
                                Time.sleepTicks((int)lIlIIlIllI[8]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIlIIlIllI[0]];
                stringArray12[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[52]];
                if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIlIIlIllI[0]];
                    stringArray13[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[53]];
                    if (F.lIIIllIIIlllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        llllllllllllllllllllIIlIIllllIII = new WorldArea(lIlIIlIllI[21], lIlIIlIllI[45], lIlIIlIllI[14], lIlIIlIllI[8], lIlIIlIllI[1]);
                        llllllllllllllllllllIIlIIlllIlll = new WorldArea(lIlIIlIllI[54], lIlIIlIllI[55], lIlIIlIllI[18], lIlIIlIllI[23], lIlIIlIllI[1]);
                        if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIlIIlIllI[0]];
                            stringArray14[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIlIIlIlII[lIlIIlIllI[57]]);
                            Time.sleepTicks((int)lIlIIlIllI[3]);
                            0;
                        }
                        if (F.lIIIllIIIlllI(llllllllllllllllllllIIlIIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && F.lIIIllIIIlllI(iL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[58]];
                            Movement.walkTo((WorldPoint)iI);
                            0;
                            Time.sleepTicks((int)lIlIIlIllI[0]);
                            0;
                        }
                        if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIlllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIlIIlIllI[0]];
                            stringArray15[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIlIIlIlII[lIlIIlIllI[60]]);
                            Time.sleepTicks((int)lIlIIlIllI[4]);
                            0;
                        }
                        if (F.lIIIllIIIllII(iL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint llllllllllllllllllllIIlIIllIlIll;
                            WorldPoint llllllllllllllllllllIIlIIllIllII;
                            WorldPoint llllllllllllllllllllIIlIIllIllIl;
                            llllllllllllllllllllIIlIIlllIllI = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[61], lIlIIlIllI[1]);
                            WorldPoint llllllllllllllllllllIIlIIlllIlIl = new WorldPoint(lIlIIlIllI[62], lIlIIlIllI[63], lIlIIlIllI[1]);
                            WorldPoint llllllllllllllllllllIIlIIlllIlII = new WorldPoint(lIlIIlIllI[64], lIlIIlIllI[65], lIlIIlIllI[1]);
                            WorldPoint llllllllllllllllllllIIlIIlllIIll = new WorldPoint(lIlIIlIllI[43], lIlIIlIllI[66], lIlIIlIllI[1]);
                            WorldPoint llllllllllllllllllllIIlIIlllIIlI = new WorldPoint(lIlIIlIllI[67], lIlIIlIllI[66], lIlIIlIllI[1]);
                            WorldPoint llllllllllllllllllllIIlIIlllIIIl = new WorldPoint(lIlIIlIllI[67], lIlIIlIllI[66], lIlIIlIllI[1]);
                            WorldArea llllllllllllllllllllIIlIIlllIIII = new WorldArea(lIlIIlIllI[68], lIlIIlIllI[69], lIlIIlIllI[20], lIlIIlIllI[23], lIlIIlIllI[1]);
                            WorldArea llllllllllllllllllllIIlIIllIllll = new WorldArea(lIlIIlIllI[70], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[17], lIlIIlIllI[1]);
                            WorldArea llllllllllllllllllllIIlIIllIlllI = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[73], lIlIIlIllI[32], lIlIIlIllI[25], lIlIIlIllI[1]);
                            if (F.lIIIllIIlIlIl(Vars.getBit((int)lIlIIlIllI[74]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[75]))) {
                                if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIllI) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[76]];
                                    Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIllI);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIllI[0]);
                                    0;
                                }
                                if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIllI) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[77]];
                                    String[] stringArray16 = new String[lIlIIlIllI[0]];
                                    stringArray16[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIlIIlIlII[lIlIIlIllI[79]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                            }
                            if (F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[74]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[75]))) {
                                if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIlIl) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[81]];
                                    Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIlIl);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIllI[0]);
                                    0;
                                }
                                if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIlIl) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[82]];
                                    String[] stringArray17 = new String[lIlIIlIllI[0]];
                                    stringArray17[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIlIIlIlII[lIlIIlIllI[83]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                            }
                            if (F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[74]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[80]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[75]))) {
                                if (F.lIIIllIIIlllI(llllllllllllllllllllIIlIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllIl = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[84], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllIl) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[85]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllIl);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllIl) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIlIIlIllI[0]];
                                        stringArray18[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIlIIlIlII[lIlIIlIllI[87]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[88]];
                                    String[] stringArray19 = new String[lIlIIlIllI[0]];
                                    stringArray19[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIlIIlIlII[lIlIIlIllI[90]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                            }
                            if (F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[74]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[80]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0])) {
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllIl = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[91], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllIl) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[92]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllIl);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllIl) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIlIIlIllI[0]];
                                        stringArray20[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIlIIlIlII[lIlIIlIllI[94]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIlllI(llllllllllllllllllllIIlIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIlIl) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[95]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIlIl);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIlIl) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[96]];
                                        String[] stringArray21 = new String[lIlIIlIllI[0]];
                                        stringArray21[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIlIIlIlII[lIlIIlIllI[98]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                            }
                            if (F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[74]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0])) {
                                if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIllI) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[99]];
                                    Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIllI);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIllI[0]);
                                    0;
                                }
                                if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIllI) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[100]];
                                    String[] stringArray22 = new String[lIlIIlIllI[0]];
                                    stringArray22[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIlIIlIlII[lIlIIlIllI[102]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                            }
                            if (F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[74])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[103])) && F.lIIIllIIIlllI(F.cf() ? 1 : 0)) {
                                if (F.lIIIllIIIlllI(llllllllllllllllllllIIlIIllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        llllllllllllllllllllIIlIIllIllIl = new WorldPoint(lIlIIlIllI[104], lIlIIlIllI[84], lIlIIlIllI[1]);
                                        if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllIl) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[105]];
                                            Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllIl);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIllI[0]);
                                            0;
                                        }
                                        if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllIl) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIlIIlIllI[0]];
                                            stringArray23[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIlIIlIlII[lIlIIlIllI[107]]);
                                            Time.sleepTicks((int)lIlIIlIllI[8]);
                                            0;
                                        }
                                    }
                                    if (F.lIIIllIIIllII((llllllllllllllllllllIIlIIllIllIl = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[69], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && F.lIIIllIIIlllI(F.cf() ? 1 : 0)) {
                                        llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[108], lIlIIlIllI[109], lIlIIlIllI[1]);
                                        if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[110]];
                                            Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIllI[0]);
                                            0;
                                        }
                                        if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIlIIlIllI[0]];
                                            stringArray24[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIlIIlIlII[lIlIIlIllI[112]]);
                                            Time.sleepTicks((int)lIlIIlIllI[8]);
                                            0;
                                        }
                                    }
                                    if (F.lIIIllIIIllII((llllllllllllllllllllIIlIIllIllII = new WorldArea(lIlIIlIllI[70], lIlIIlIllI[69], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        llllllllllllllllllllIIlIIllIlIll = new WorldPoint(lIlIIlIllI[67], lIlIIlIllI[113], lIlIIlIllI[1]);
                                        if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIlIll) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[114]];
                                            Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIlIll);
                                            0;
                                            Time.sleepTicks((int)lIlIIlIllI[0]);
                                            0;
                                        }
                                        if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIlIll) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIlIIlIllI[0]];
                                            stringArray25[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIlIIlIlII[lIlIIlIllI[116]]);
                                            Time.sleepTicks((int)lIlIIlIllI[8]);
                                            0;
                                        }
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && F.lIIIllIIIlllI(F.cf() ? 1 : 0)) {
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIIlI) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[117]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIIlI);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIIlI) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[118]];
                                        String[] stringArray26 = new String[lIlIIlIllI[0]];
                                        stringArray26[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIlIIlIlII[lIlIIlIllI[120]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                            }
                            if (F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[74])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[103]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[121]))) {
                                if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIIIl) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[122]];
                                    Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIIIl);
                                    0;
                                    Time.sleepTicks((int)lIlIIlIllI[0]);
                                    0;
                                }
                                if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIIIl) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[123]];
                                    String[] stringArray27 = new String[lIlIIlIllI[0]];
                                    stringArray27[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIlIIlIlII[lIlIIlIllI[125]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                            }
                            if (F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[74])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[103]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[121]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[126]))) {
                                llllllllllllllllllllIIlIIllIllIl = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]);
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[127], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[128]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIlIIlIllI[0]];
                                        stringArray28[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIlIIlIlII[lIlIIlIllI[130]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[131], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[132]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIlIIlIllI[0]];
                                        stringArray29[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIlIIlIlII[lIlIIlIllI[134]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[135]];
                                    String[] stringArray30 = new String[lIlIIlIllI[0]];
                                    stringArray30[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIlIIlIlII[lIlIIlIllI[137]]);
                                    Time.sleepTicks((int)lIlIIlIllI[16]);
                                    0;
                                }
                            }
                            if (F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[74])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[103]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[121]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[126]), lIlIIlIllI[0])) {
                                llllllllllllllllllllIIlIIllIllIl = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]);
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIlllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[138], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[139]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIlIIlIllI[0]];
                                        stringArray31[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIlIIlIlII[lIlIIlIllI[141]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[108], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[142]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIlIIlIllI[0]];
                                        stringArray32[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIlIIlIlII[lIlIIlIllI[144]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIIlI) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[145]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIlllIIlI);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIlllIIlI) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[146]];
                                        String[] stringArray33 = new String[lIlIIlIllI[0]];
                                        stringArray33[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIlIIlIlII[lIlIIlIllI[148]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                            }
                            if (F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[74])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[103])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[121]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[126]), lIlIIlIllI[0])) {
                                llllllllllllllllllllIIlIIllIllIl = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]);
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[127], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[149]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIlIIlIllI[0]];
                                        stringArray34[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIlIIlIlII[lIlIIlIllI[151]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    llllllllllllllllllllIIlIIllIllII = new WorldPoint(lIlIIlIllI[104], lIlIIlIllI[152], lIlIIlIllI[1]);
                                    if (F.lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[153]];
                                        Movement.walkTo((WorldPoint)llllllllllllllllllllIIlIIllIllII);
                                        0;
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                    }
                                    if (F.lIIIllIIIllII(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllllIIlIIllIllII) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIlIIlIllI[0]);
                                        0;
                                        String[] stringArray35 = new String[lIlIIlIllI[0]];
                                        stringArray35[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIlIIlIlII[lIlIIlIllI[155]]);
                                        Time.sleepTicks((int)lIlIIlIllI[8]);
                                        0;
                                    }
                                }
                                if (F.lIIIllIIIllII((llllllllllllllllllllIIlIIllIllII = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[69], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && F.lIIIllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[156]];
                                    Time.sleepTicks((int)lIlIIlIllI[0]);
                                    0;
                                    int[] nArray = new int[lIlIIlIllI[0]];
                                    nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIlIIlIlII[lIlIIlIllI[158]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                                if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIlIIlIllI[0]];
                                    nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIlIIlIlII[lIlIIlIllI[160]]);
                                    Time.sleepTicks((int)lIlIIlIllI[8]);
                                    0;
                                }
                                if (F.lIIIllIIIllII((llllllllllllllllllllIIlIIllIlIll = new WorldArea(lIlIIlIllI[161], lIlIIlIllI[162], lIlIIlIllI[23], lIlIIlIllI[14], lIlIIlIllI[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIlIIlIllI[0]];
                                    stringArray36[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[163]];
                                    if (F.lIIIllIIIlllI(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIlIIlIllI[0]];
                                        stringArray37[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIlIIlIlII[lIlIIlIllI[165]]);
                                        Time.sleepTicks((int)lIlIIlIllI[14]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIlIIlIllI[0]];
                stringArray38[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[166]];
                if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIlIIlIllI[0]];
                    stringArray39[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[167]];
                    if (F.lIIIllIIIllII(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        llllllllllllllllllllIIlIIllllIII = new WorldArea(lIlIIlIllI[161], lIlIIlIllI[162], lIlIIlIllI[23], lIlIIlIllI[14], lIlIIlIllI[1]);
                        if (F.lIIIllIIIllII(llllllllllllllllllllIIlIIllllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIlIIlIllI[0]];
                            nArray[F.lIlIIlIllI[1]] = lIlIIlIllI[159];
                            TileObjects.getNearest((int[])nArray).interact(lIlIIlIlII[lIlIIlIllI[168]]);
                            Time.sleepTicks((int)lIlIIlIllI[14]);
                            0;
                        }
                        if (F.lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[169]];
                            Movement.walkTo((WorldPoint)iJ);
                            0;
                            Time.sleepTicks((int)lIlIIlIllI[0]);
                            0;
                        }
                        if (F.lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                            llllllllllllllllllllIIlIIlllIlll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (F.lIIIllIIIllII(tileObject.getName().contains(lIlIIlIlII[lIlIIlIllI[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIlIIlIllI[0]];
                                    stringArray[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[186]];
                                    if (F.lIIIllIIIllII(tileObject.hasAction(stringArray) ? 1 : 0) && F.lIIIllIIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[184], lIlIIlIllI[3])), lIlIIlIllI[3])) {
                                        n2 = lIlIIlIllI[0];
                                        0;
                                        if (-2 < 0) return n2 != 0;
                                        return ((32 + 1 - -60 + 45 ^ 18 + 72 - 21 + 79) & (0x39 ^ 0x7C ^ (0xD2 ^ 0x89) ^ -1)) != 0;
                                    }
                                }
                                n2 = lIlIIlIllI[1];
                                return n2 != 0;
                            });
                            if (F.lIIIllIIIllll(llllllllllllllllllllIIlIIlllIlll)) {
                                llllllllllllllllllllIIlIIlllIlll.interact(lIlIIlIlII[lIlIIlIllI[170]]);
                                Time.sleepTicks((int)lIlIIlIllI[8]);
                                0;
                            }
                            if (F.lIIIllIIlIllI(llllllllllllllllllllIIlIIlllIlll)) {
                                g.a(lIlIIlIlII[lIlIIlIllI[171]], cy, lIlIIlIllI[0]);
                            }
                        }
                    }
                }
            }
            if (F.lIIIllIIlIlII(e.j(iK), lIlIIlIllI[3])) {
                if (F.lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[172]];
                    Movement.walkTo((WorldPoint)iJ);
                    0;
                    Time.sleepTicks((int)lIlIIlIllI[0]);
                    0;
                }
                if (F.lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                    llllllllllllllllllllIIlIIllllIII = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (F.lIIIllIIIllII(tileObject.getName().contains(lIlIIlIlII[lIlIIlIllI[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIlIIlIllI[0]];
                            stringArray[F.lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[183]];
                            if (F.lIIIllIIIllII(tileObject.hasAction(stringArray) ? 1 : 0) && F.lIIIllIIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[184], lIlIIlIllI[3])), lIlIIlIllI[3])) {
                                n2 = lIlIIlIllI[0];
                                0;
                                if (1 > 0) return n2 != 0;
                                return ((0x20 ^ 0x2E) & ~(0x6C ^ 0x62)) != 0;
                            }
                        }
                        n2 = lIlIIlIllI[1];
                        return n2 != 0;
                    });
                    if (F.lIIIllIIIllll(llllllllllllllllllllIIlIIllllIII)) {
                        llllllllllllllllllllIIlIIllllIII.interact(lIlIIlIlII[lIlIIlIllI[173]]);
                        Time.sleepTicks((int)lIlIIlIllI[8]);
                        0;
                    }
                    if (F.lIIIllIIlIllI(llllllllllllllllllllIIlIIllllIII)) {
                        if (F.lIIIllIIIllIl(dc, lIlIIlIllI[0])) {
                            Z.oi += lIlIIlIllI[0];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIIlIllI[0];
                            Z.oi = lIlIIlIllI[1];
                            dd = lIlIIlIllI[1];
                        }
                        g.a(lIlIIlIlII[lIlIIlIllI[174]], cy, lIlIIlIllI[0]);
                    }
                }
            }
            g.a(cy);
        }
    }

    private static String lIIIllIIIIIlI(String llllllllllllllllllllIIlIIIlllIll, String llllllllllllllllllllIIlIIIllllII) {
        try {
            SecretKeySpec llllllllllllllllllllIIlIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIlIIIllllII.getBytes(StandardCharsets.UTF_8)), lIlIIlIllI[16]), "DES");
            Cipher llllllllllllllllllllIIlIIIllllll = Cipher.getInstance("DES");
            llllllllllllllllllllIIlIIIllllll.init(lIlIIlIllI[3], llllllllllllllllllllIIlIIlIIIIII);
            return new String(llllllllllllllllllllIIlIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIIlIIIlllllI) {
            llllllllllllllllllllIIlIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIllIIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static int lIIIllIIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIllIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIIllIIIlIlI() {
        lIlIIlIllI = new int[198];
        F.lIlIIlIllI[0] = 1;
        F.lIlIIlIllI[1] = (0x85 ^ 0x82) & ~(0xAC ^ 0xAB);
        F.lIlIIlIllI[2] = 0xFFFFFBDB & 0x17AC;
        F.lIlIIlIllI[3] = 2;
        F.lIlIIlIllI[4] = 70 + 70 - 85 + 87 ^ 91 + 33 - 10 + 24;
        F.lIlIIlIllI[5] = -(0x15 ^ 0x3C) & (0xFFFFDF7F & 0x3FEF);
        F.lIlIIlIllI[6] = -(0xFFFFF737 & 0x28E9) & (0xFFFFEDFF & 0x7EBF);
        F.lIlIIlIllI[7] = 0xFFFFFBFF & 0x7B8;
        F.lIlIIlIllI[8] = 3;
        F.lIlIIlIllI[9] = 0xFFFFBDFF & 0x4311;
        F.lIlIIlIllI[10] = 0x17 ^ 0x1D;
        F.lIlIIlIllI[11] = 0xFFFFA95A & 0x57B5;
        F.lIlIIlIllI[12] = 0xFFFFBF71 & 0x71DF;
        F.lIlIIlIllI[13] = -(0xFFFF8FFD & 0x7E07) & (0xFFFFDFFF & 0x2F7F);
        F.lIlIIlIllI[14] = 82 + 61 - 106 + 152 ^ 29 + 68 - 45 + 132;
        F.lIlIIlIllI[15] = 0xF6 ^ 0xC3 ^ (0x73 ^ 0x74);
        F.lIlIIlIllI[16] = 0x2C ^ 0x24;
        F.lIlIIlIllI[17] = 0x52 ^ 0x54;
        F.lIlIIlIllI[18] = 0xBE ^ 0xB9;
        F.lIlIIlIllI[19] = 0xFFFF9977 & 0x679A;
        F.lIlIIlIllI[20] = 2 ^ 0x31 ^ (0x37 ^ 0xD);
        F.lIlIIlIllI[21] = 0xFFFFFC7F & 0xFA4;
        F.lIlIIlIllI[22] = 0xFFFFBD7F & 0x4F9D;
        F.lIlIIlIllI[23] = 111 + 54 - 52 + 14 ^ (0x6F ^ 0x1B);
        F.lIlIIlIllI[24] = 0xB7 ^ 0x9E ^ (0x12 ^ 0x37);
        F.lIlIIlIllI[25] = 0x37 ^ 0x3A;
        F.lIlIIlIllI[26] = 0xE ^ 0;
        F.lIlIIlIllI[27] = 0x76 ^ 0x79;
        F.lIlIIlIllI[28] = 0x1E ^ 0xE;
        F.lIlIIlIllI[29] = 0xD9 ^ 0x87 ^ (0x7C ^ 0x33);
        F.lIlIIlIllI[30] = 0xE ^ 0x30 ^ (0xA6 ^ 0x8A);
        F.lIlIIlIllI[31] = 0x75 ^ 0x66;
        F.lIlIIlIllI[32] = 0x9A ^ 0x8E;
        F.lIlIIlIllI[33] = 0x17 ^ 2;
        F.lIlIIlIllI[34] = 0x8F ^ 0x99;
        F.lIlIIlIllI[35] = 59 + 138 - 118 + 63 ^ 97 + 47 - 99 + 108;
        F.lIlIIlIllI[36] = 0xEB ^ 0x80 ^ (0xD1 ^ 0xA2);
        F.lIlIIlIllI[37] = 0xA6 ^ 0xBF;
        F.lIlIIlIllI[38] = 0x39 ^ 0x23;
        F.lIlIIlIllI[39] = 0x89 ^ 0x92;
        F.lIlIIlIllI[40] = 0xD8 ^ 0xC4;
        F.lIlIIlIllI[41] = 144 + 6 - 124 + 160 ^ 16 + 55 - -2 + 94;
        F.lIlIIlIllI[42] = 0x63 ^ 0x44 ^ (0x7A ^ 0x43);
        F.lIlIIlIllI[43] = -(0xFFFFE19F & 0x7E69) & (0xFFFFEE6F & 0x7DBB);
        F.lIlIIlIllI[44] = 0xFFFFEF77 & 0x1DAF;
        F.lIlIIlIllI[45] = -(0xFFFFB5DB & 0x7A36) & (0xFFFFFF37 & 0x3DFF);
        F.lIlIIlIllI[46] = 0x1E ^ 1;
        F.lIlIIlIllI[47] = 0x59 ^ 0x12 ^ (0x23 ^ 0x48);
        F.lIlIIlIllI[48] = 0x10 ^ 0x31;
        F.lIlIIlIllI[49] = 0x2E ^ 0x12 ^ (0x40 ^ 0x5E);
        F.lIlIIlIllI[50] = 0xAC ^ 0x8F;
        F.lIlIIlIllI[51] = 0x33 ^ 0x7C ^ (0x72 ^ 0x19);
        F.lIlIIlIllI[52] = 0xAA ^ 0x8F;
        F.lIlIIlIllI[53] = 6 ^ 0x20;
        F.lIlIIlIllI[54] = 0xFFFFFE92 & 0xD7F;
        F.lIlIIlIllI[55] = -(0xFFFFD7F7 & 0x68A9) & (0xFFFFFFFB & 0x4DBD);
        F.lIlIIlIllI[56] = 0x22 ^ 0x35 ^ (0x8E ^ 0xBE);
        F.lIlIIlIllI[57] = 0x41 ^ 0x69;
        F.lIlIIlIllI[58] = 0xA1 ^ 0x88;
        F.lIlIIlIllI[59] = 0x73 ^ 0x59;
        F.lIlIIlIllI[60] = 107 + 155 - 218 + 112 ^ 121 + 137 - 96 + 21;
        F.lIlIIlIllI[61] = -(89 + 41 - 116 + 147) & (0xFFFFE6B6 & 0x3FFB);
        F.lIlIIlIllI[62] = 0xFFFF9DFE & 0x6E2D;
        F.lIlIIlIllI[63] = 0xFFFFFEBE & 0x2759;
        F.lIlIIlIllI[64] = 0xFFFFFEBE & 0xD67;
        F.lIlIIlIllI[65] = 0xFFFFEFA9 & 0x3677;
        F.lIlIIlIllI[66] = 0xFFFFEE2D & 0x37F7;
        F.lIlIIlIllI[67] = 0xFFFFCE1B & 0x3DFD;
        F.lIlIIlIllI[68] = -(0xFFFFDFDB & 0x30FF) & (0xFFFFBFFB & 0x5CFF);
        F.lIlIIlIllI[69] = -(0xFFFFD99E & 0x7763) & (0xFFFFFFFF & 0x771F);
        F.lIlIIlIllI[70] = 0xFFFF9C3F & 0x6FD7;
        F.lIlIIlIllI[71] = -(0xFFFFFCBD & 0x13D7) & (0xFFFFF6BF & 0x3FF7);
        F.lIlIIlIllI[72] = 0xFFFFCE9C & 0x3D7F;
        F.lIlIIlIllI[73] = -(0xFFFFD8ED & 0x7FF7) & (0xFFFFFFFF & 0x7EF5);
        F.lIlIIlIllI[74] = 0xFFFFD6FE & 0x2FFD;
        F.lIlIIlIllI[75] = 0xFFFFE6FF & 0x1FFF;
        F.lIlIIlIllI[76] = 0xD3 ^ 0xA9 ^ (0xEE ^ 0xB8);
        F.lIlIIlIllI[77] = 0xAB ^ 0x97 ^ (0xD4 ^ 0xC5);
        F.lIlIIlIllI[78] = 0xD ^ 0x6E ^ (0xE3 ^ 0xAE);
        F.lIlIIlIllI[79] = 0x4A ^ 0x65;
        F.lIlIIlIllI[80] = -(0xFFFFEFB7 & 0x594B) & (0xFFFFCFFF & Short.MAX_VALUE);
        F.lIlIIlIllI[81] = 173 + 124 - 227 + 113 ^ 75 + 28 - 54 + 86;
        F.lIlIIlIllI[82] = 0x64 ^ 0x55;
        F.lIlIIlIllI[83] = 0xEA ^ 0x9F ^ (0x86 ^ 0xC0);
        F.lIlIIlIllI[84] = -(123 + 62 - 140 + 86) & (0xFFFFEF9F & 0x36FF);
        F.lIlIIlIllI[85] = 0x9C ^ 0xA8;
        F.lIlIIlIllI[86] = 0x61 ^ 0xD ^ (0x21 ^ 0x78);
        F.lIlIIlIllI[87] = 0x3E ^ 8;
        F.lIlIIlIllI[88] = 4 ^ 0x33;
        F.lIlIIlIllI[89] = 0x6E ^ 0x56;
        F.lIlIIlIllI[90] = 0x8F ^ 0xB6;
        F.lIlIIlIllI[91] = 0xFFFFF6BF & 0x2F5F;
        F.lIlIIlIllI[92] = 0x54 ^ 0x5E ^ (0x56 ^ 0x66);
        F.lIlIIlIllI[93] = 74 + 121 - 125 + 76 ^ 43 + 119 - 57 + 64;
        F.lIlIIlIllI[94] = 8 ^ 0x34;
        F.lIlIIlIllI[95] = 0x6F ^ 0x27 ^ (2 ^ 0x77);
        F.lIlIIlIllI[96] = 0x1A ^ 0x6A ^ (0x14 ^ 0x5A);
        F.lIlIIlIllI[97] = 0x40 ^ 0x7F;
        F.lIlIIlIllI[98] = 0x39 ^ 0x79;
        F.lIlIIlIllI[99] = 0xFE ^ 0xBF;
        F.lIlIIlIllI[100] = 0x72 ^ 0x45 ^ (0xE7 ^ 0x92);
        F.lIlIIlIllI[101] = 162 + 171 - 292 + 211 ^ 67 + 72 - 91 + 143;
        F.lIlIIlIllI[102] = 0xFE ^ 0xBA;
        F.lIlIIlIllI[103] = -(0xFFFF91FC & 0x7EBF) & (0xFFFFD7FF & 0x3FBB);
        F.lIlIIlIllI[104] = -(0xFFFF92E3 & 0x7FFE) & (0xFFFFFEFF & 0x1FFF);
        F.lIlIIlIllI[105] = 86 + 58 - -53 + 56 ^ 22 + 82 - -76 + 4;
        F.lIlIIlIllI[106] = 1 ^ 0x64 ^ (0x46 ^ 0x65);
        F.lIlIIlIllI[107] = 0x7E ^ 0x1E ^ (0x67 ^ 0x40);
        F.lIlIIlIllI[108] = -(0xFFFFFCED & 0x3373) & (0xFFFFFFFD & 0x3C7F);
        F.lIlIIlIllI[109] = -(0xFFFFBADC & 0x4D7B) & (0xFFFFAE7F & 0x7FF7);
        F.lIlIIlIllI[110] = 0x5D ^ 0x15;
        F.lIlIIlIllI[111] = 0x71 ^ 0x43 ^ (0x17 ^ 0x6C);
        F.lIlIIlIllI[112] = 5 ^ 0x5B ^ (0x7F ^ 0x6B);
        F.lIlIIlIllI[113] = 0xFFFFFFEA & 0x2637;
        F.lIlIIlIllI[114] = 0xE2 ^ 0xA9;
        F.lIlIIlIllI[115] = 8 ^ 0x32 ^ (0xCA ^ 0xBC);
        F.lIlIIlIllI[116] = 0xF9 ^ 0xB4;
        F.lIlIIlIllI[117] = 196 + 39 - 224 + 231 ^ 102 + 55 - 65 + 96;
        F.lIlIIlIllI[118] = 0x13 ^ 0x5C;
        F.lIlIIlIllI[119] = 0x43 ^ 0x13;
        F.lIlIIlIllI[120] = 0x3A ^ 0x4D ^ (0x8A ^ 0xAC);
        F.lIlIIlIllI[121] = 0xFFFFB7CF & 0x4F31;
        F.lIlIIlIllI[122] = 0xA7 ^ 0xB9 ^ (0x5F ^ 0x13);
        F.lIlIIlIllI[123] = 0x28 ^ 0x7B;
        F.lIlIIlIllI[124] = 0x75 ^ 0x4A ^ (0x17 ^ 0x7C);
        F.lIlIIlIllI[125] = 0xE5 ^ 0xB0;
        F.lIlIIlIllI[126] = 0xFFFFBEFF & 0x47FE;
        F.lIlIIlIllI[127] = 0xFFFFAC1F & 0x5FFB;
        F.lIlIIlIllI[128] = 0x60 ^ 0x15 ^ (0xBF ^ 0x9C);
        F.lIlIIlIllI[129] = 0xCE ^ 0x99;
        F.lIlIIlIllI[130] = 0x45 ^ 0x1D;
        F.lIlIIlIllI[131] = 0xFFFFDCBE & 0x2F61;
        F.lIlIIlIllI[132] = 78 + 152 - 123 + 88 ^ 72 + 68 - 50 + 64;
        F.lIlIIlIllI[133] = 0xC ^ 0x7B ^ (0x5E ^ 0x73);
        F.lIlIIlIllI[134] = 0x30 ^ 0x22 ^ (0xCB ^ 0x82);
        F.lIlIIlIllI[135] = 0x73 ^ 0x25 ^ (0x94 ^ 0x9E);
        F.lIlIIlIllI[136] = 139 + 198 - 332 + 215 ^ 21 + 49 - -17 + 42;
        F.lIlIIlIllI[137] = 190 + 148 - 248 + 120 ^ 27 + 138 - 26 + 1;
        F.lIlIIlIllI[138] = -(0xFFFFFFDD & 0x4277) & (0xFFFFFE77 & 0x4FFE);
        F.lIlIIlIllI[139] = 0xFC ^ 0xA3;
        F.lIlIIlIllI[140] = 0xD1 ^ 0xB1;
        F.lIlIIlIllI[141] = 66 + 29 - -74 + 30 ^ 104 + 133 - 221 + 150;
        F.lIlIIlIllI[142] = 0xEB ^ 0x89;
        F.lIlIIlIllI[143] = 0xC1 ^ 0xA2;
        F.lIlIIlIllI[144] = 0xDB ^ 0xBF;
        F.lIlIIlIllI[145] = 0x97 ^ 0xBB ^ (0xD4 ^ 0x9D);
        F.lIlIIlIllI[146] = 0xED ^ 0x8B;
        F.lIlIIlIllI[147] = 0 ^ 0x67;
        F.lIlIIlIllI[148] = 0x7C ^ 0x14;
        F.lIlIIlIllI[149] = 0x1F ^ 0x6C ^ (0x89 ^ 0x93);
        F.lIlIIlIllI[150] = 76 + 188 - 254 + 191 ^ 8 + 63 - -32 + 60;
        F.lIlIIlIllI[151] = 0xFB ^ 0x90;
        F.lIlIIlIllI[152] = -(0xFFFFF5C9 & 0x4A77) & (0xFFFFEE6F & 0x77F4);
        F.lIlIIlIllI[153] = 0xA6 ^ 0x91 ^ (0xE4 ^ 0xBF);
        F.lIlIIlIllI[154] = 168 + 43 - 106 + 67 ^ 54 + 116 - 169 + 192;
        F.lIlIIlIllI[155] = 0x39 ^ 0x57;
        F.lIlIIlIllI[156] = 1 ^ (0xCC ^ 0xA2);
        F.lIlIIlIllI[157] = (0xB5 ^ 0xA5) + (0xE8 ^ 0xBC) - (0xF ^ 0x50) + (137 + 47 - 91 + 47);
        F.lIlIIlIllI[158] = 0xC2 ^ 0xB2;
        F.lIlIIlIllI[159] = 1 + 87 - -9 + 44;
        F.lIlIIlIllI[160] = 0x20 ^ 0x5E ^ (0x2C ^ 0x23);
        F.lIlIIlIllI[161] = 0xFFFFBDB7 & 0x4E59;
        F.lIlIIlIllI[162] = 0xFFFFEFDD & 0x363B;
        F.lIlIIlIllI[163] = 165 + 10 - 174 + 235 ^ 118 + 130 - 135 + 45;
        F.lIlIIlIllI[164] = 0x25 ^ 0x56;
        F.lIlIIlIllI[165] = 0xCB ^ 0x93 ^ (0x81 ^ 0xAD);
        F.lIlIIlIllI[166] = 0xCF ^ 0x81 ^ (0x47 ^ 0x7C);
        F.lIlIIlIllI[167] = 0x5E ^ 0xD ^ (0x8B ^ 0xAE);
        F.lIlIIlIllI[168] = 3 & ~3 ^ (0x5A ^ 0x2D);
        F.lIlIIlIllI[169] = 0x4D ^ 0x35;
        F.lIlIIlIllI[170] = 0x16 ^ 0x6F;
        F.lIlIIlIllI[171] = 0x76 ^ 0xC;
        F.lIlIIlIllI[172] = 0x13 ^ 0x68;
        F.lIlIIlIllI[173] = 0xF6 ^ 0x8A;
        F.lIlIIlIllI[174] = 0x75 ^ 8;
        F.lIlIIlIllI[175] = -(0xFFFFEB97 & 0x17FC) & (0xFFFFF7DF & 0x2FB7);
        F.lIlIIlIllI[176] = 0xFFFFFFEF & 0x2EDC;
        F.lIlIIlIllI[177] = -(0xFFFF9F36 & 0x6ACF) & (0xFFFFFBAF & 0x6FFD);
        F.lIlIIlIllI[178] = -(0xFFFFE3FF & 0x3C53) & (0xFFFFB17E & 0x6FFF);
        F.lIlIIlIllI[179] = -(0xFFFFFB5E & 0x54EB) & (0xFFFFD57F & 0x7FDD);
        F.lIlIIlIllI[180] = 129 + 187 - 135 + 19 ^ 128 + 147 - 188 + 95;
        F.lIlIIlIllI[181] = 87 + 10 - 0 + 30;
        F.lIlIIlIllI[182] = 79 + 23 - -2 + 24;
        F.lIlIIlIllI[183] = (0x24 ^ 0x33) + (0x83 ^ 0xC3) - (0xDE ^ 0xC0) + (0xB ^ 0x43);
        F.lIlIIlIllI[184] = -(0xFFFFE63F & 0x1BD3) & (0xFFFFFFBF & 0xF77);
        F.lIlIIlIllI[185] = (0x7A ^ 0x4F) + (0xCF ^ 0x95) - (0x47 ^ 0x76) + (0x1D ^ 0x39);
        F.lIlIIlIllI[186] = (0x39 ^ 0x5C) + (0x2C ^ 0x6B) - (0xC ^ 0x5D) + (0xBC ^ 0x94);
        F.lIlIIlIllI[187] = 0xFFFF8DFD & 0x7F03;
        F.lIlIIlIllI[188] = 0xFFFFBE6F & 0x4D9F;
        F.lIlIIlIllI[189] = -(0xFFFFEFF7 & 0x705D) & (0xFFFFEFF6 & 0x7D7D);
        F.lIlIIlIllI[190] = -(0xFFFFF3F6 & 0x1ECB) & (0xFFFFBFF9 & 0x5FCF);
        F.lIlIIlIllI[191] = -(0xFFFFDAC9 & 0x65FF) & (0xFFFFEEFE & 0x5DDF);
        F.lIlIIlIllI[192] = -(0xFFFFBA83 & 0x55FD) & (0xFFFFDFFF & 0x3D9F);
        F.lIlIIlIllI[193] = (0x86 ^ 0xAD) + (0xBF ^ 0x95) - -(0x9C ^ 0xB5) + (0x71 ^ 0x77);
        F.lIlIIlIllI[194] = (0x26 ^ 0x4A) + (0x65 ^ 0x62) - (0xE7 ^ 0x95) + (84 + 47 - 20 + 21);
        F.lIlIIlIllI[195] = 5 + 103 - 62 + 88;
        F.lIlIIlIllI[196] = 0xFFFFA6EF & 0x7F1F;
        F.lIlIIlIllI[197] = 2 + (0x5F ^ 0x13) - (0x77 ^ 0x7D) + (0xDB ^ 0x98);
    }

    private static boolean lIIIllIIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public String ae() {
        return lIlIIlIlII[lIlIIlIllI[180]];
    }

    @Override
    public int ad() {
        try {
            F.ce();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (130 + 123 - 195 + 75 ^ 154 + 101 - 113 + 50) & (0xBD ^ 0x8A ^ (0x57 ^ 0x25) ^ -1) & ((157 + 175 - 249 + 107 ^ 124 + 22 - 44 + 72) & (125 + 122 - 142 + 28 ^ 85 + 128 - 147 + 83 ^ -1) ^ -1);
        }
        return lIlIIlIllI[144];
    }

    private static boolean lIIIllIIIllll(Object object) {
        return object != null;
    }

    static boolean cf() {
        int n2;
        if (F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[74])) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[80])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[75]), lIlIIlIllI[0]) && F.lIIIllIIIlllI(Vars.getBit((int)lIlIIlIllI[103])) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[121]), lIlIIlIllI[0]) && F.lIIIllIIlIlII(Vars.getBit((int)lIlIIlIllI[126]), lIlIIlIllI[0])) {
            n2 = lIlIIlIllI[0];
            0;
            if (3 <= 2) {
                return ((0x44 ^ 0x67) & ~(3 ^ 0x20)) != 0;
            }
        } else {
            n2 = lIlIIlIllI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIIllIIlIIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (F.lIIIllIIlIlll(e.j(lIlIIlIllI[47]), lIlIIlIllI[8])) {
            bl = lIlIIlIllI[0];
            0;
            if (3 == -1) {
                return ((0x49 ^ 7 ^ (0xEA ^ 0xAE)) & (0x1D ^ 0x6A ^ (0xE7 ^ 0x9A) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIlIllI[1];
        }
        return bl;
    }
}

