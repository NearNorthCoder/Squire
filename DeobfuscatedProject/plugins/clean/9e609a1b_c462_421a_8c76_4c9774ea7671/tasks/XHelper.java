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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.PHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.AHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.BHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.DHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.FHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.GHelper;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.HHelper;
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

public class XHelper
implements M {
    public static  List<d> bA;

    public static  WorldPoint fT;
    static  WorldArea fY;
    static  String[] bW;
    public static  boolean by;
    static  int co;
    static  boolean cp;
    public static  WorldPoint fd;
    static  int fX;
    public static  WorldPoint fW;
    public static  WorldPoint fV;
    public static  WorldPoint fU;

    private static boolean lIlIlIIIIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIIIIllII(int n2) {
        return n2 > 0;
    }

    static {
        x.lIlIlIIIIIIIllI();
        x.lIlIlIIIIIIIlIl();
        bA = new ArrayList<d>();
        fd = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[187], lIIlIIIIllIII[1]);
        fT = new WorldPoint(lIIlIIIIllIII[188], lIIlIIIIllIII[189], lIIlIIIIllIII[1]);
        fU = new WorldPoint(lIIlIIIIllIII[161], lIIlIIIIllIII[190], lIIlIIIIllIII[1]);
        fV = new WorldPoint(lIIlIIIIllIII[191], lIIlIIIIllIII[192], lIIlIIIIllIII[1]);
        fW = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[45], lIIlIIIIllIII[3]);
        fX = lIIlIIIIllIII[47];
        String[] stringArray = new String[lIIlIIIIllIII[8]];
        stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[193]];
        stringArray[x.lIIlIIIIllIII[0]] = lIIlIIIIlIllI[lIIlIIIIllIII[194]];
        stringArray[x.lIIlIIIIllIII[3]] = lIIlIIIIlIllI[lIIlIIIIllIII[195]];
        bW = stringArray;
        fY = new WorldArea(lIIlIIIIllIII[188], lIIlIIIIllIII[196], lIIlIIIIllIII[50], lIIlIIIIllIII[40], lIIlIIIIllIII[1]);
    }

    private static boolean lIlIlIIIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIIIIIIIlIl() {
        lIIlIIIIlIllI = new String[lIIlIIIIllIII[197]];
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[1]] = "Finished buying items, switching back to quest";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[0]] = "Nav to bank";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[3]] = "Handling banking";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[8]] = "We are missing quest supplies, switching to BUYING";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[4]] = "Drink";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[14]] = "Eat";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[17]] = "Nav to start";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[18]] = "Start quest";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[16]] = "Veronica";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[20]] = "Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[10]] = "Nav to fish food";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[23]] = "Can't reach, navigating";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[24]] = "Taking food";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[25]] = "Take";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[26]] = "Making poison fish food";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[27]] = "Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[28]] = "Nav to compost";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[29]] = "Digging";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[30]] = "Compost heap";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[31]] = "Search";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[32]] = "Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[33]] = "Nav to fountain";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[34]] = "Fountain";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[35]] = "Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[36]] = "Pressure gauge";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[37]] = "Getting guage";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[38]] = "Fountain";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[39]] = "Search";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[40]] = "Key";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[41]] = "Pressure gauge";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[42]] = "Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[46]] = "Nav to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[47]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[48]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[49]] = "Get tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[50]] = "Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[51]] = "Take";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[52]] = "Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[53]] = "Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[56]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[57]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[58]] = "Nav to final room";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[59]] = "Ladder";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[60]] = "Climb-down";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[76]] = "Nav to a";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[77]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[78]] = "Lever A";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[79]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[81]] = "Nav to b";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[82]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[15]] = "Lever B";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[83]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[85]] = "Nav to d";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[86]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[87]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[88]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[89]] = "Lever D";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[90]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[92]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[93]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[94]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[95]] = "Nav to b";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[96]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[97]] = "Lever B";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[98]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[99]] = "Nav to a";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[100]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[101]] = "Lever A";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[102]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[105]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[106]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[107]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[110]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[111]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[112]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[114]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[115]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[116]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[117]] = "Nav to e";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[118]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[119]] = "Lever E";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[120]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[122]] = "Nav to f";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[123]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[124]] = "Lever F";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[125]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[128]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[129]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[130]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[132]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[133]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[134]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[135]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[136]] = "Lever C";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[137]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[139]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[140]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[141]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[142]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[143]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[144]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[145]] = "Nav to e";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[146]] = "Pull lever";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[147]] = "Lever E";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[148]] = "Pull";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[149]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[150]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[151]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[153]] = "Move to door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[154]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[155]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[156]] = "Opening 145";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[158]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[160]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[163]] = "Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[164]] = "Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[165]] = "Take";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[166]] = "Rubber tube";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[167]] = "Oil can";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[168]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[169]] = "Nav to professor";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[170]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[171]] = "Professor Oddenstein";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[172]] = "Nav to professor";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[173]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[174]] = "Professor Oddenstein";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[180]] = "Ernest the Chicken";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[181]] = "ring of wealth (";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[182]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[183]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[185]] = "Door";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[186]] = "Open";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[193]] = "Yes.";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[194]] = "I'm looking for a guy called Ernest.";
        x.lIIlIIIIlIllI[x.lIIlIIIIllIII[195]] = "I'm glad Veronica didn't actually get engaged to a chicken.";
    }

        return String.valueOf(var1);
    }

    @Override
    public String Z() {
        return lIIlIIIIlIllI[lIIlIIIIllIII[180]];
    }

    public static void bx() {
        block134: {
            BankLocation var2;
            block135: {
                WorldArea var3;
                TileItem var4;
                block137: {
                    block136: {
                        if (x.lIlIlIIIIIIlIII(by ? 1 : 0)) {
                            b.a(bA);
                            if (x.lIlIlIIIIIIlIIl(bA.size(), lIIlIIIIllIII[0])) {
                                System.out.println(lIIlIIIIlIllI[lIIlIIIIllIII[1]]);
                                by = lIIlIIIIllIII[1];
                            }
                        }
                        if (!x.lIlIlIIIIIIlIlI(by ? 1 : 0)) break block134;
                        if (x.lIlIlIIIIIIlIlI(x.S() ? 1 : 0) && x.lIlIlIIIIIIlIIl(e.j(fX), lIIlIIIIllIII[0])) {
                            var2 = BankLocation.getNearest();
                            if (x.lIlIlIIIIIIlIll(var2) && x.lIlIlIIIIIIlIlI(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[0]];
                                a.a(var2);
                            }
                            if (x.lIlIlIIIIIIlIll(var2) && x.lIlIlIIIIIIlIII(var2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (x.lIlIlIIIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIIIllIII[2]);

                                }
                                if (x.lIlIlIIIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[3]];
                                    if (x.lIlIlIIIIIIllII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lIIlIIIIllIII[4]);

                                    }
                                    if (x.lIlIlIIIIIIllII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lIIlIIIIllIII[3]);

                                    }
                                    int[] nArray = new int[lIIlIIIIllIII[4]];
                                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                                    nArray[x.lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
                                    nArray[x.lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
                                    nArray[x.lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
                                    if (x.lIlIlIIIIIIlIlI(e.b(nArray) ? 1 : 0)) {
                                        x.W();
                                        System.out.println(lIIlIIIIlIllI[lIIlIIIIllIII[8]]);
                                        by = lIIlIIIIllIII[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lIIlIIIIllIII[4]];
                                    nArray2[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                                    nArray2[x.lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
                                    nArray2[x.lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
                                    nArray2[x.lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
                                    if (x.lIlIlIIIIIIlIII(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lIIlIIIIllIII[5], lIIlIIIIllIII[10]);
                                        a.a(lIIlIIIIllIII[6], lIIlIIIIllIII[10]);
                                        a.a(lIIlIIIIllIII[7], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[11], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[9], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[12], lIIlIIIIllIII[0]);
                                        a.a(lIIlIIIIllIII[13], lIIlIIIIllIII[14]);
                                    }
                                }
                            }
                        }
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])f.ba) ? 1 : 0) && x.lIlIlIIIIIIlIIl(Movement.getRunEnergy(), lIIlIIIIllIII[15])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIlIIIIlIllI[lIIlIIIIllIII[4]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                        }
                        int[] nArray = new int[lIIlIIIIllIII[0]];
                        nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0) && x.lIlIlIIIIIIllIl(x.lIlIlIIIIIIIlll(e.v(), 50.0))) {
                            int[] nArray3 = new int[lIIlIIIIllIII[0]];
                            nArray3[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                            Inventory.getFirst((int[])nArray3).interact(lIIlIIIIlIllI[lIIlIIIIllIII[14]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[3]);

                        }
                        if (x.lIlIlIIIIIIlIII(x.S() ? 1 : 0) && x.lIlIlIIIIIIlIlI(e.j(fX))) {
                            if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIllIII[16])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[17]];
                                Movement.walkTo((WorldPoint)fd);

                                Time.sleepTicks((int)lIIlIIIIllIII[0]);

                            }
                            if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fd), lIIlIIIIllIII[16])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[18]];
                                if (x.lIlIlIIIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lIIlIIIIlIllI[lIIlIIIIllIII[16]], bW);
                            }
                        }
                        if (!x.lIlIlIIIIIlIIII(e.j(fX), lIIlIIIIllIII[0])) break block135;
                        co = lIIlIIIIllIII[1];
                        int[] nArray4 = new int[lIIlIIIIllIII[0]];
                        nArray4[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lIIlIIIIllIII[0]];
                            nArray5[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                            if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lIIlIIIIllIII[0]];
                                stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[20]];
                                if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    var2 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[22], lIIlIIIIllIII[0]);
                                    int[] nArray6 = new int[lIIlIIIIllIII[0]];
                                    nArray6[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlIIIIllIII[14])) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[10]];
                                            Movement.walkTo((WorldPoint)var2);

                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                        }
                                        if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlIIIIllIII[14])) {
                                            int[] nArray7 = new int[lIIlIIIIllIII[0]];
                                            nArray7[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                                            var4 = TileItems.getNearest((int[])nArray7);
                                            if (x.lIlIlIIIIIIlIll(var4)) {
                                                if (x.lIlIlIIIIIIlIlI(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
                                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[23]];
                                                    Movement.walkTo((WorldPoint)var4.getWorldLocation());

                                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                                }
                                                if (x.lIlIlIIIIIIlIII(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
                                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[24]];
                                                    var4.interact(lIIlIIIIlIllI[lIIlIIIIllIII[25]]);
                                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lIIlIIIIllIII[0]];
                        nArray8[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        if (!x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lIIlIIIIllIII[0]];
                        nArray9[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                        if (!x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lIIlIIIIllIII[0]];
                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lIIlIIIIllIII[0]];
                        nArray10[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[26]];
                            int[] nArray11 = new int[lIIlIIIIllIII[0]];
                            nArray11[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[11];
                            int[] nArray12 = new int[lIIlIIIIllIII[0]];
                            nArray12[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                        }
                    }
                    int[] nArray13 = new int[lIIlIIIIllIII[0]];
                    nArray13[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (x.lIlIlIIIIIIlIII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIIIllIII[0]];
                        stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[27]];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fT), lIIlIIIIllIII[4])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[28]];
                                Movement.walkTo((WorldPoint)fT);

                                Time.sleepTicks((int)lIIlIIIIllIII[0]);

                            }
                            if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fT), lIIlIIIIllIII[4])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[29]];
                                String[] stringArray2 = new String[lIIlIIIIllIII[0]];
                                stringArray2[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lIIlIIIIlIllI[lIIlIIIIllIII[31]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[20]);

                            }
                        }
                        String[] stringArray3 = new String[lIIlIIIIllIII[0]];
                        stringArray3[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[32]];
                        if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fU), lIIlIIIIllIII[8])) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[33]];
                                Movement.walkTo((WorldPoint)fU);

                                Time.sleepTicks((int)lIIlIIIIllIII[0]);

                            }
                            if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fU), lIIlIIIIllIII[8])) {
                                int[] nArray14 = new int[lIIlIIIIllIII[0]];
                                nArray14[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                                String[] stringArray4 = new String[lIIlIIIIllIII[0]];
                                stringArray4[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lIIlIIIIllIII[0]);

                            }
                        }
                    }
                }
                String[] stringArray = new String[lIIlIIIIllIII[0]];
                stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[35]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lIIlIIIIllIII[0]];
                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[19];
                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIlIIIIllIII[0]];
                        stringArray5[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[36]];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[37]];
                            if (x.lIlIlIIIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lIIlIIIIllIII[0]];
                                stringArray6[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lIIlIIIIlIllI[lIIlIIIIllIII[39]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[4]);

                            }
                            g.a(bW);
                        }
                    }
                }
                String[] stringArray7 = new String[lIIlIIIIllIII[0]];
                stringArray7[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[40]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lIIlIIIIllIII[0]];
                    stringArray8[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[41]];
                    if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lIIlIIIIllIII[0]];
                        stringArray9[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[42]];
                        if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            var2 = new WorldPoint(lIIlIIIIllIII[43], lIIlIIIIllIII[44], lIIlIIIIllIII[1]);
                            var4 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[44], lIIlIIIIllIII[1]);
                            var3 = new WorldArea(lIIlIIIIllIII[21], lIIlIIIIllIII[45], lIIlIIIIllIII[14], lIIlIIIIllIII[8], lIIlIIIIllIII[1]);
                            if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0) && x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) && x.lIlIlIIIIIIlIlI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[46]];
                                Movement.walkTo((WorldPoint)var2);

                                Time.sleepTicks((int)lIIlIIIIllIII[0]);

                            }
                            if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                String[] stringArray10 = new String[lIIlIIIIllIII[0]];
                                stringArray10[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lIIlIIIIlIllI[lIIlIIIIllIII[48]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[3]);

                            }
                            if (x.lIlIlIIIIIIlIII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[49]];
                                String[] stringArray11 = new String[lIIlIIIIllIII[0]];
                                stringArray11[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lIIlIIIIlIllI[lIIlIIIIllIII[51]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[8]);

                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lIIlIIIIllIII[0]];
                stringArray12[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[52]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIlIIIIllIII[0]];
                    stringArray13[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[53]];
                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        var2 = new WorldArea(lIIlIIIIllIII[21], lIIlIIIIllIII[45], lIIlIIIIllIII[14], lIIlIIIIllIII[8], lIIlIIIIllIII[1]);
                        var4 = new WorldArea(lIIlIIIIllIII[54], lIIlIIIIllIII[55], lIIlIIIIllIII[18], lIIlIIIIllIII[23], lIIlIIIIllIII[1]);
                        if (x.lIlIlIIIIIIlIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lIIlIIIIllIII[0]];
                            stringArray14[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lIIlIIIIlIllI[lIIlIIIIllIII[57]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[3]);

                        }
                        if (x.lIlIlIIIIIIlIlI(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[58]];
                            Movement.walkTo((WorldPoint)fV);

                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                        }
                        if (x.lIlIlIIIIIIlIII(var4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lIIlIIIIllIII[0]];
                            stringArray15[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lIIlIIIIlIllI[lIIlIIIIllIII[60]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[4]);

                        }
                        if (x.lIlIlIIIIIIlIII(fY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint var5;
                            WorldPoint var6;
                            WorldPoint var7;
                            var3 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[61], lIIlIIIIllIII[1]);
                            WorldPoint var8 = new WorldPoint(lIIlIIIIllIII[62], lIIlIIIIllIII[63], lIIlIIIIllIII[1]);
                            WorldPoint var9 = new WorldPoint(lIIlIIIIllIII[64], lIIlIIIIllIII[65], lIIlIIIIllIII[1]);
                            WorldPoint var10 = new WorldPoint(lIIlIIIIllIII[43], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldPoint var11 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldPoint var12 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                            WorldArea var13 = new WorldArea(lIIlIIIIllIII[68], lIIlIIIIllIII[69], lIIlIIIIllIII[20], lIIlIIIIllIII[23], lIIlIIIIllIII[1]);
                            WorldArea var14 = new WorldArea(lIIlIIIIllIII[70], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[17], lIIlIIIIllIII[1]);
                            WorldArea var15 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[73], lIIlIIIIllIII[32], lIIlIIIIllIII[25], lIIlIIIIllIII[1]);
                            if (x.lIlIlIIIIIlIIIl(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[75]))) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[76]];
                                    Movement.walkTo((WorldPoint)var3);

                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[77]];
                                    String[] stringArray16 = new String[lIIlIIIIllIII[0]];
                                    stringArray16[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lIIlIIIIlIllI[lIIlIIIIllIII[79]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[75]))) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[81]];
                                    Movement.walkTo((WorldPoint)var8);

                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[82]];
                                    String[] stringArray17 = new String[lIIlIIIIllIII[0]];
                                    stringArray17[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lIIlIIIIlIllI[lIIlIIIIllIII[83]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[80]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[75]))) {
                                if (x.lIlIlIIIIIIlIlI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[84], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[85]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lIIlIIIIllIII[0]];
                                        stringArray18[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lIIlIIIIlIllI[lIIlIIIIllIII[87]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[88]];
                                    String[] stringArray19 = new String[lIIlIIIIllIII[0]];
                                    stringArray19[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lIIlIIIIlIllI[lIIlIIIIllIII[90]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[80]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0])) {
                                if (x.lIlIlIIIIIIlIII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var7 = new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[91], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[92]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lIIlIIIIllIII[0]];
                                        stringArray20[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lIIlIIIIlIllI[lIIlIIIIllIII[94]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIlI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[95]];
                                        Movement.walkTo((WorldPoint)var8);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var8) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[96]];
                                        String[] stringArray21 = new String[lIIlIIIIllIII[0]];
                                        stringArray21[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lIIlIIIIlIllI[lIIlIIIIllIII[98]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                            }
                            if (x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[74]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0])) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[99]];
                                    Movement.walkTo((WorldPoint)var3);

                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[100]];
                                    String[] stringArray22 = new String[lIIlIIIIllIII[0]];
                                    stringArray22[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lIIlIIIIlIllI[lIIlIIIIllIII[102]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[103])) && x.lIlIlIIIIIIlIlI(x.by() ? 1 : 0)) {
                                if (x.lIlIlIIIIIIlIlI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIII(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var7 = new WorldPoint(lIIlIIIIllIII[104], lIIlIIIIllIII[84], lIIlIIIIllIII[1]);
                                        if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[105]];
                                            Movement.walkTo((WorldPoint)var7);

                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                        }
                                        if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lIIlIIIIllIII[0]];
                                            stringArray23[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lIIlIIIIlIllI[lIIlIIIIllIII[107]]);
                                            Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                        }
                                    }
                                    if (x.lIlIlIIIIIIlIII((var7 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(x.by() ? 1 : 0)) {
                                        var6 = new WorldPoint(lIIlIIIIllIII[108], lIIlIIIIllIII[109], lIIlIIIIllIII[1]);
                                        if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[110]];
                                            Movement.walkTo((WorldPoint)var6);

                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                        }
                                        if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lIIlIIIIllIII[0]];
                                            stringArray24[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lIIlIIIIlIllI[lIIlIIIIllIII[112]]);
                                            Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                        }
                                    }
                                    if (x.lIlIlIIIIIIlIII((var6 = new WorldArea(lIIlIIIIllIII[70], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var5 = new WorldPoint(lIIlIIIIllIII[67], lIIlIIIIllIII[113], lIIlIIIIllIII[1]);
                                        if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[114]];
                                            Movement.walkTo((WorldPoint)var5);

                                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                        }
                                        if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lIIlIIIIllIII[0]];
                                            stringArray25[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lIIlIIIIlIllI[lIIlIIIIllIII[116]]);
                                            Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                        }
                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(x.by() ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[117]];
                                        Movement.walkTo((WorldPoint)var11);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[118]];
                                        String[] stringArray26 = new String[lIIlIIIIllIII[0]];
                                        stringArray26[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lIIlIIIIlIllI[lIIlIIIIllIII[120]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[121]))) {
                                if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[122]];
                                    Movement.walkTo((WorldPoint)var12);

                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                }
                                if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[123]];
                                    String[] stringArray27 = new String[lIIlIIIIllIII[0]];
                                    stringArray27[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lIIlIIIIlIllI[lIIlIIIIllIII[125]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[126]))) {
                                var7 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lIIlIIIIllIII[127], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[128]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lIIlIIIIllIII[0]];
                                        stringArray28[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lIIlIIIIlIllI[lIIlIIIIllIII[130]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lIIlIIIIllIII[131], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[132]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lIIlIIIIllIII[0]];
                                        stringArray29[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lIIlIIIIlIllI[lIIlIIIIllIII[134]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[135]];
                                    String[] stringArray30 = new String[lIIlIIIIllIII[0]];
                                    stringArray30[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lIIlIIIIlIllI[lIIlIIIIllIII[137]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[16]);

                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[103]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
                                var7 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (x.lIlIlIIIIIIlIII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lIIlIIIIllIII[138], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[139]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lIIlIIIIllIII[0]];
                                        stringArray31[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lIIlIIIIlIllI[lIIlIIIIllIII[141]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lIIlIIIIllIII[108], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[142]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lIIlIIIIllIII[0]];
                                        stringArray32[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lIIlIIIIlIllI[lIIlIIIIllIII[144]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[145]];
                                        Movement.walkTo((WorldPoint)var11);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[146]];
                                        String[] stringArray33 = new String[lIIlIIIIllIII[0]];
                                        stringArray33[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lIIlIIIIlIllI[lIIlIIIIllIII[148]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                            }
                            if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[103])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
                                var7 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[71], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                                if (x.lIlIlIIIIIIlIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lIIlIIIIllIII[127], lIIlIIIIllIII[66], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[149]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lIIlIIIIllIII[0]];
                                        stringArray34[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lIIlIIIIlIllI[lIIlIIIIllIII[151]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lIIlIIIIllIII[104], lIIlIIIIllIII[152], lIIlIIIIllIII[1]);
                                    if (x.lIlIlIIIIIIlIlI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[153]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    }
                                    if (x.lIlIlIIIIIIlIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                        String[] stringArray35 = new String[lIIlIIIIllIII[0]];
                                        stringArray35[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lIIlIIIIlIllI[lIIlIIIIllIII[155]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                    }
                                }
                                if (x.lIlIlIIIIIIlIII((var6 = new WorldArea(lIIlIIIIllIII[72], lIIlIIIIllIII[69], lIIlIIIIllIII[14], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIlIlIIIIIIlIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[156]];
                                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                                    int[] nArray = new int[lIIlIIIIllIII[0]];
                                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[157];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIIIIlIllI[lIIlIIIIllIII[158]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                                if (x.lIlIlIIIIIIlIII(var15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lIIlIIIIllIII[0]];
                                    nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[159];
                                    TileObjects.getNearest((int[])nArray).interact(lIIlIIIIlIllI[lIIlIIIIllIII[160]]);
                                    Time.sleepTicks((int)lIIlIIIIllIII[8]);

                                }
                                if (x.lIlIlIIIIIIlIII((var5 = new WorldArea(lIIlIIIIllIII[161], lIIlIIIIllIII[162], lIIlIIIIllIII[23], lIIlIIIIllIII[14], lIIlIIIIllIII[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lIIlIIIIllIII[0]];
                                    stringArray36[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[163]];
                                    if (x.lIlIlIIIIIIlIlI(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lIIlIIIIllIII[0]];
                                        stringArray37[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lIIlIIIIlIllI[lIIlIIIIllIII[165]]);
                                        Time.sleepTicks((int)lIIlIIIIllIII[14]);

                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lIIlIIIIllIII[0]];
                stringArray38[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[166]];
                if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lIIlIIIIllIII[0]];
                    stringArray39[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[167]];
                    if (x.lIlIlIIIIIIlIII(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        var2 = new WorldArea(lIIlIIIIllIII[161], lIIlIIIIllIII[162], lIIlIIIIllIII[23], lIIlIIIIllIII[14], lIIlIIIIllIII[1]);
                        if (x.lIlIlIIIIIIlIII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lIIlIIIIllIII[0]];
                            nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[159];
                            TileObjects.getNearest((int[])nArray).interact(lIIlIIIIlIllI[lIIlIIIIllIII[168]]);
                            Time.sleepTicks((int)lIIlIIIIllIII[14]);

                        }
                        if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                            AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[169]];
                            Movement.walkTo((WorldPoint)fW);

                            Time.sleepTicks((int)lIIlIIIIllIII[0]);

                        }
                        if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                            var4 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (x.lIlIlIIIIIIlIII(tileObject.getName().contains(lIIlIIIIlIllI[lIIlIIIIllIII[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lIIlIIIIllIII[0]];
                                    stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[186]];
                                    if (x.lIlIlIIIIIIlIII(tileObject.hasAction(stringArray) ? 1 : 0) && x.lIlIlIIIIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[184], lIIlIIIIllIII[3])), lIIlIIIIllIII[3])) {
                                        n2 = lIIlIIIIllIII[0];

                                        if (-(22 + 58 - 47 + 97 ^ 84 + 12 - 80 + 118) <= 0) return n2 != 0;
                                        return ((0xBB ^ 0xC6 ^ (0xF7 ^ 0xBD)) & (2 ^ (0x3E ^ 0xB) ^ -1)) != 0;
                                    }
                                }
                                n2 = lIIlIIIIllIII[1];
                                return n2 != 0;
                            });
                            if (x.lIlIlIIIIIIlIll(var4)) {
                                var4.interact(lIIlIIIIlIllI[lIIlIIIIllIII[170]]);
                                Time.sleepTicks((int)lIIlIIIIllIII[8]);

                            }
                            if (x.lIlIlIIIIIlIIlI(var4)) {
                                g.a(lIIlIIIIlIllI[lIIlIIIIllIII[171]], bW, lIIlIIIIllIII[0]);
                            }
                        }
                    }
                }
            }
            if (x.lIlIlIIIIIlIIII(e.j(fX), lIIlIIIIllIII[3])) {
                if (x.lIlIlIIIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                    AccBuilderRat.c = lIIlIIIIlIllI[lIIlIIIIllIII[172]];
                    Movement.walkTo((WorldPoint)fW);

                    Time.sleepTicks((int)lIIlIIIIllIII[0]);

                }
                if (x.lIlIlIIIIIIllll(Players.getLocal().getWorldLocation().distanceTo(fW), lIIlIIIIllIII[10])) {
                    var2 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (x.lIlIlIIIIIIlIII(tileObject.getName().contains(lIIlIIIIlIllI[lIIlIIIIllIII[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lIIlIIIIllIII[0]];
                            stringArray[x.lIIlIIIIllIII[1]] = lIIlIIIIlIllI[lIIlIIIIllIII[183]];
                            if (x.lIlIlIIIIIIlIII(tileObject.hasAction(stringArray) ? 1 : 0) && x.lIlIlIIIIIIllll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIlIIIIllIII[21], lIIlIIIIllIII[184], lIIlIIIIllIII[3])), lIIlIIIIllIII[3])) {
                                n2 = lIIlIIIIllIII[0];

                                if (((0x59 ^ 0x4C ^ (0x54 ^ 0x20)) & (0xA3 ^ 0x95 ^ (0xC3 ^ 0x94) ^ -1)) == 0) return n2 != 0;
                                return ((0x1A ^ 0x51 ^ (0x29 ^ 0x3B)) & (0xC ^ 0x4E ^ (0x3F ^ 0x24) ^ -1)) != 0;
                            }
                        }
                        n2 = lIIlIIIIllIII[1];
                        return n2 != 0;
                    });
                    if (x.lIlIlIIIIIIlIll(var2)) {
                        var2.interact(lIIlIIIIlIllI[lIIlIIIIllIII[173]]);
                        Time.sleepTicks((int)lIIlIIIIllIII[8]);

                    }
                    if (x.lIlIlIIIIIlIIlI(var2)) {
                        if (x.lIlIlIIIIIIlIIl(co, lIIlIIIIllIII[0])) {
                            P.ly += lIIlIIIIllIII[0];
                            P.d(AccBuilderRat.m);
                            co += lIIlIIIIllIII[0];
                            P.ly = lIIlIIIIllIII[1];
                            cp = lIIlIIIIllIII[1];
                        }
                        g.a(lIIlIIIIlIllI[lIIlIIIIllIII[174]], bW, lIIlIIIIllIII[0]);
                    }
                }
            }
            g.a(bW);
        }
    }

    private static boolean lIlIlIIIIIIllIl(int n2) {
        return n2 < 0;
    }

    @Override
    public int Y() {
        try {
            x.bx();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= (0xD0 ^ 0xA9 ^ (0x42 ^ 0x3F))) {
            return (0x13 ^ 0xB ^ (0x9D ^ 0xBE)) & (0xF3 ^ 0xB4 ^ (0xE ^ 0x72) ^ -1);
        }
        return lIIlIIIIllIII[144];
    }

    static boolean by() {
        int n2;
        if (x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[74])) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[80])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[75]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIIlIlI(Vars.getBit((int)lIIlIIIIllIII[103])) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[121]), lIIlIIIIllIII[0]) && x.lIlIlIIIIIlIIII(Vars.getBit((int)lIIlIIIIllIII[126]), lIIlIIIIllIII[0])) {
            n2 = lIIlIIIIllIII[0];

        } else {
            n2 = lIIlIIIIllIII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void var16;
        int[] nArray = new int[lIIlIIIIllIII[4]];
        nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
        nArray[x.lIIlIIIIllIII[0]] = lIIlIIIIllIII[6];
        nArray[x.lIIlIIIIllIII[3]] = lIIlIIIIllIII[7];
        nArray[x.lIIlIIIIllIII[8]] = lIIlIIIIllIII[9];
        int[] nArray2 = nArray;
        int var17 = lIIlIIIIllIII[1];
        while (x.lIlIlIIIIIIlIIl(var17, ((void)var16).length)) {
            int[] nArray3 = new int[lIIlIIIIllIII[0]];
            nArray3[x.lIIlIIIIllIII[1]] = var16[var17];
            if (x.lIlIlIIIIIIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIlIIIIllIII[1];
            }
            ++var17;

            if (1 != 0) continue;
            return ((0xA ^ 0x6D ^ (0x61 ^ 0x3D)) & (0xAD ^ 0x96 ^ (0x36 ^ 0x17) & ~(0xE3 ^ 0xC2) ^ -1)) != 0;
        }
        return lIIlIIIIllIII[0];
    }

    private static boolean lIlIlIIIIIlIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static int lIlIlIIIIIIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlIlIIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIIIIIlIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void W() {
        block14: {
            d var18;
            block13: {
                block12: {
                    block11: {
                        Object var19;
                        int[] nArray = new int[lIIlIIIIllIII[0]];
                        nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[6];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lIIlIIIIllIII[6], lIIlIIIIllIII[10], lIIlIIIIllIII[175]);
                            bA.add(d2);

                        }
                        int[] nArray2 = new int[lIIlIIIIllIII[0]];
                        nArray2[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[7];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var19 = new DHelper(lIIlIIIIllIII[7], lIIlIIIIllIII[0], lIIlIIIIllIII[175]);
                            bA.add((DHelper) ar19);

                        }
                        int[] nArray3 = new int[lIIlIIIIllIII[0]];
                        nArray3[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[9];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var19 = new DHelper(lIIlIIIIllIII[9], lIIlIIIIllIII[0], lIIlIIIIllIII[175]);
                            bA.add((DHelper) ar19);

                        }
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((Predicate)(var19 = item -> item.getName().toLowerCase().contains(lIIlIIIIlIllI[lIIlIIIIllIII[181]]))) ? 1 : 0)) {
                            var18 = new DHelper(lIIlIIIIllIII[176], lIIlIIIIllIII[14], lIIlIIIIllIII[177]);
                            bA.add(var18);

                        }
                        int[] nArray4 = new int[lIIlIIIIllIII[0]];
                        nArray4[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[12];
                        if (x.lIlIlIIIIIIlIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var18 = new DHelper(lIIlIIIIllIII[12], lIIlIIIIllIII[4], h.bv);
                            bA.add(var18);

                        }
                        int[] nArray5 = new int[lIIlIIIIllIII[0]];
                        nArray5[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lIIlIIIIllIII[0]];
                        nArray6[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lIIlIIIIllIII[0]];
                        nArray7[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[13];
                        if (!x.lIlIlIIIIIIlIIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIlIIIIllIII[14])) break block12;
                    }
                    var18 = new DHelper(lIIlIIIIllIII[13], lIIlIIIIllIII[10], lIIlIIIIllIII[178]);
                    bA.add(var18);

                }
                int[] nArray = new int[lIIlIIIIllIII[0]];
                nArray[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lIIlIIIIllIII[0]];
                nArray8[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!x.lIlIlIIIIIIlIII(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lIIlIIIIllIII[0]];
                nArray9[x.lIIlIIIIllIII[1]] = lIIlIIIIllIII[5];
                if (!x.lIlIlIIIIIIlIIl(Bank.getFirst((int[])nArray9).getQuantity(), lIIlIIIIllIII[27])) break block14;
            }
            var18 = new DHelper(lIIlIIIIllIII[5], lIIlIIIIllIII[57], lIIlIIIIllIII[179]);
            bA.add(var18);

        }
    }

    @Override
    public boolean X() {
        return lIIlIIIIllIII[1];
    }

    private static boolean lIlIlIIIIIlIIlI(Object object) {
        return object == null;
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (x.lIlIlIIIIIlIIll(e.j(lIIlIIIIllIII[47]), lIIlIIIIllIII[8])) {
            bl = lIIlIIIIllIII[0];

        } else {
            bl = lIIlIIIIllIII[1];
        }
        return bl;
    }

    private static boolean lIlIlIIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIIIIIllll(int n2, int n3) {
        return n2 <= n3;
    }

}

