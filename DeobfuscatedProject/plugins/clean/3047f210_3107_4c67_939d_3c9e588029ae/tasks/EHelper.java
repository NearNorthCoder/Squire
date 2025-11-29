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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.AHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.ACHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.BHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.DHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.FHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.GHelper;
import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.IHelper;
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

public class EHelper
implements S {
    public static  WorldPoint gV;
    static  WorldArea ha;
    public static  WorldPoint gW;
    static  int gZ;
    public static  WorldPoint gf;
    
    static  String[] bQ;
    static  boolean cl;
    
    public static  WorldPoint gX;
    public static  List<d> bu;
    public static  boolean bs;
    static  int ck;
    public static  WorldPoint gY;

    private static boolean llIlIIllIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlIIlIIllIl() {
        lllllIIIll = new String[lllllIIlIl[197]];
        E.lllllIIIll[E.lllllIIlIl[1]] = "Finished buying items, switching back to quest";
        E.lllllIIIll[E.lllllIIlIl[0]] = "Nav to bank";
        E.lllllIIIll[E.lllllIIlIl[3]] = "Handling banking";
        E.lllllIIIll[E.lllllIIlIl[8]] = "We are missing quest supplies, switching to BUYING";
        E.lllllIIIll[E.lllllIIlIl[4]] = "Drink";
        E.lllllIIIll[E.lllllIIlIl[14]] = "Eat";
        E.lllllIIIll[E.lllllIIlIl[17]] = "Nav to start";
        E.lllllIIIll[E.lllllIIlIl[18]] = "Start quest";
        E.lllllIIIll[E.lllllIIlIl[16]] = "Veronica";
        E.lllllIIIll[E.lllllIIlIl[20]] = "Key";
        E.lllllIIIll[E.lllllIIlIl[10]] = "Nav to fish food";
        E.lllllIIIll[E.lllllIIlIl[23]] = "Can't reach, navigating";
        E.lllllIIIll[E.lllllIIlIl[24]] = "Taking food";
        E.lllllIIIll[E.lllllIIlIl[25]] = "Take";
        E.lllllIIIll[E.lllllIIlIl[26]] = "Making poison fish food";
        E.lllllIIIll[E.lllllIIlIl[27]] = "Key";
        E.lllllIIIll[E.lllllIIlIl[28]] = "Nav to compost";
        E.lllllIIIll[E.lllllIIlIl[29]] = "Digging";
        E.lllllIIIll[E.lllllIIlIl[30]] = "Compost heap";
        E.lllllIIIll[E.lllllIIlIl[31]] = "Search";
        E.lllllIIIll[E.lllllIIlIl[32]] = "Key";
        E.lllllIIIll[E.lllllIIlIl[33]] = "Nav to fountain";
        E.lllllIIIll[E.lllllIIlIl[34]] = "Fountain";
        E.lllllIIIll[E.lllllIIlIl[35]] = "Key";
        E.lllllIIIll[E.lllllIIlIl[36]] = "Pressure gauge";
        E.lllllIIIll[E.lllllIIlIl[37]] = "Getting guage";
        E.lllllIIIll[E.lllllIIlIl[38]] = "Fountain";
        E.lllllIIIll[E.lllllIIlIl[39]] = "Search";
        E.lllllIIIll[E.lllllIIlIl[40]] = "Key";
        E.lllllIIIll[E.lllllIIlIl[41]] = "Pressure gauge";
        E.lllllIIIll[E.lllllIIlIl[42]] = "Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[46]] = "Nav to door";
        E.lllllIIIll[E.lllllIIlIl[47]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[48]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[49]] = "Get tube";
        E.lllllIIIll[E.lllllIIlIl[50]] = "Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[51]] = "Take";
        E.lllllIIIll[E.lllllIIlIl[52]] = "Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[53]] = "Oil can";
        E.lllllIIIll[E.lllllIIlIl[56]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[57]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[58]] = "Nav to final room";
        E.lllllIIIll[E.lllllIIlIl[59]] = "Ladder";
        E.lllllIIIll[E.lllllIIlIl[60]] = "Climb-down";
        E.lllllIIIll[E.lllllIIlIl[76]] = "Nav to a";
        E.lllllIIIll[E.lllllIIlIl[77]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[78]] = "Lever A";
        E.lllllIIIll[E.lllllIIlIl[79]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[81]] = "Nav to b";
        E.lllllIIIll[E.lllllIIlIl[82]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[15]] = "Lever B";
        E.lllllIIIll[E.lllllIIlIl[83]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[85]] = "Nav to d";
        E.lllllIIIll[E.lllllIIlIl[86]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[87]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[88]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[89]] = "Lever D";
        E.lllllIIIll[E.lllllIIlIl[90]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[92]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[93]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[94]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[95]] = "Nav to b";
        E.lllllIIIll[E.lllllIIlIl[96]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[97]] = "Lever B";
        E.lllllIIIll[E.lllllIIlIl[98]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[99]] = "Nav to a";
        E.lllllIIIll[E.lllllIIlIl[100]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[101]] = "Lever A";
        E.lllllIIIll[E.lllllIIlIl[102]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[105]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[106]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[107]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[110]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[111]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[112]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[114]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[115]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[116]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[117]] = "Nav to e";
        E.lllllIIIll[E.lllllIIlIl[118]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[119]] = "Lever E";
        E.lllllIIIll[E.lllllIIlIl[120]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[122]] = "Nav to f";
        E.lllllIIIll[E.lllllIIlIl[123]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[124]] = "Lever F";
        E.lllllIIIll[E.lllllIIlIl[125]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[128]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[129]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[130]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[132]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[133]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[134]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[135]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[136]] = "Lever C";
        E.lllllIIIll[E.lllllIIlIl[137]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[139]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[140]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[141]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[142]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[143]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[144]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[145]] = "Nav to e";
        E.lllllIIIll[E.lllllIIlIl[146]] = "Pull lever";
        E.lllllIIIll[E.lllllIIlIl[147]] = "\\";
        E.lllllIIIll[E.lllllIIlIl[148]] = "Pull";
        E.lllllIIIll[E.lllllIIlIl[149]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[150]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[151]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[153]] = "Move to door";
        E.lllllIIIll[E.lllllIIlIl[154]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[155]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[156]] = "Opening 145";
        E.lllllIIIll[E.lllllIIlIl[158]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[160]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[163]] = "Oil can";
        E.lllllIIIll[E.lllllIIlIl[164]] = "Oil can";
        E.lllllIIIll[E.lllllIIlIl[165]] = "Take";
        E.lllllIIIll[E.lllllIIlIl[166]] = "Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[167]] = "Oil can";
        E.lllllIIIll[E.lllllIIlIl[168]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[169]] = "Nav to professor";
        E.lllllIIIll[E.lllllIIlIl[170]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[171]] = "Professor Oddenstein";
        E.lllllIIIll[E.lllllIIlIl[172]] = "Nav to professor";
        E.lllllIIIll[E.lllllIIlIl[173]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[174]] = "Professor Oddenstein";
        E.lllllIIIll[E.lllllIIlIl[180]] = "Ernest the Chicken";
        E.lllllIIIll[E.lllllIIlIl[181]] = "ring of wealth (";
        E.lllllIIIll[E.lllllIIlIl[182]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[183]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[185]] = "Door";
        E.lllllIIIll[E.lllllIIlIl[186]] = "Open";
        E.lllllIIIll[E.lllllIIlIl[193]] = "Yes.";
        E.lllllIIIll[E.lllllIIlIl[194]] = "I'm looking for a guy called Ernest.";
        E.lllllIIIll[E.lllllIIlIl[195]] = "I'm glad Veronica didn't actually get engaged to a chicken.";
    }

    private static boolean llIlIIlIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIllIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIIllIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIlIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void cn() {
        block134: {
            BankLocation var1;
            block135: {
                WorldArea var2;
                TileItem var3;
                block137: {
                    block136: {
                        if (E.llIlIIlIlllII(bs ? 1 : 0)) {
                            b.a(bu);
                            if (E.llIlIIlIlllIl(bu.size(), lllllIIlIl[0])) {
                                System.out.println(lllllIIIll[lllllIIlIl[1]]);
                                bs = lllllIIlIl[1];
                            }
                        }
                        if (!E.llIlIIlIllllI(bs ? 1 : 0)) break block134;
                        if (E.llIlIIlIllllI(E.aa() ? 1 : 0) && E.llIlIIlIlllIl(e.j(gZ), lllllIIlIl[0])) {
                            var1 = BankLocation.getNearest();
                            if (E.llIlIIlIlllll(var1) && E.llIlIIlIllllI(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[0]];
                                a.a(var1);
                            }
                            if (E.llIlIIlIlllll(var1) && E.llIlIIlIlllII(var1.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (E.llIlIIlIllllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIlIl[2]);

                                }
                                if (E.llIlIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[3]];
                                    if (E.llIlIIllIIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllllIIlIl[4]);

                                    }
                                    if (E.llIlIIllIIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllllIIlIl[3]);

                                    }
                                    int[] nArray = new int[lllllIIlIl[4]];
                                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[5];
                                    nArray[E.lllllIIlIl[0]] = lllllIIlIl[6];
                                    nArray[E.lllllIIlIl[3]] = lllllIIlIl[7];
                                    nArray[E.lllllIIlIl[8]] = lllllIIlIl[9];
                                    if (E.llIlIIlIllllI(e.b(nArray) ? 1 : 0)) {
                                        E.ae();
                                        System.out.println(lllllIIIll[lllllIIlIl[8]]);
                                        bs = lllllIIlIl[0];
                                        return;
                                    }
                                    int[] nArray2 = new int[lllllIIlIl[4]];
                                    nArray2[E.lllllIIlIl[1]] = lllllIIlIl[5];
                                    nArray2[E.lllllIIlIl[0]] = lllllIIlIl[6];
                                    nArray2[E.lllllIIlIl[3]] = lllllIIlIl[7];
                                    nArray2[E.lllllIIlIl[8]] = lllllIIlIl[9];
                                    if (E.llIlIIlIlllII(e.b(nArray2) ? 1 : 0)) {
                                        a.a(lllllIIlIl[5], lllllIIlIl[10]);
                                        a.a(lllllIIlIl[6], lllllIIlIl[10]);
                                        a.a(lllllIIlIl[7], lllllIIlIl[0]);
                                        a.a(lllllIIlIl[11], lllllIIlIl[0]);
                                        a.a(lllllIIlIl[9], lllllIIlIl[0]);
                                        a.a(lllllIIlIl[12], lllllIIlIl[0]);
                                        a.a(lllllIIlIl[13], lllllIIlIl[14]);
                                    }
                                }
                            }
                        }
                        if (E.llIlIIlIlllII(Inventory.contains((int[])f.aU) ? 1 : 0) && E.llIlIIlIlllIl(Movement.getRunEnergy(), lllllIIlIl[15])) {
                            Inventory.getFirst((int[])f.aU).interact(lllllIIIll[lllllIIlIl[4]]);
                            Time.sleepTicks((int)lllllIIlIl[0]);

                        }
                        int[] nArray = new int[lllllIIlIl[0]];
                        nArray[E.lllllIIlIl[1]] = lllllIIlIl[13];
                        if (E.llIlIIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0) && E.llIlIIllIIIIl(E.llIlIIlIllIll(e.u(), 50.0))) {
                            int[] nArray3 = new int[lllllIIlIl[0]];
                            nArray3[E.lllllIIlIl[1]] = lllllIIlIl[13];
                            Inventory.getFirst((int[])nArray3).interact(lllllIIIll[lllllIIlIl[14]]);
                            Time.sleepTicks((int)lllllIIlIl[3]);

                        }
                        if (E.llIlIIlIlllII(E.aa() ? 1 : 0) && E.llIlIIlIllllI(e.j(gZ))) {
                            if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), lllllIIlIl[16])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[17]];
                                Movement.walkTo((WorldPoint)gf);

                                Time.sleepTicks((int)lllllIIlIl[0]);

                            }
                            if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gf), lllllIIlIl[16])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[18]];
                                if (E.llIlIIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                g.a(lllllIIIll[lllllIIlIl[16]], bQ);
                            }
                        }
                        if (!E.llIlIIllIIlII(e.j(gZ), lllllIIlIl[0])) break block135;
                        ck = lllllIIlIl[1];
                        int[] nArray4 = new int[lllllIIlIl[0]];
                        nArray4[E.lllllIIlIl[1]] = lllllIIlIl[11];
                        if (E.llIlIIlIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[lllllIIlIl[0]];
                            nArray5[E.lllllIIlIl[1]] = lllllIIlIl[19];
                            if (E.llIlIIlIllllI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                String[] stringArray = new String[lllllIIlIl[0]];
                                stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[20]];
                                if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                    var1 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[22], lllllIIlIl[0]);
                                    int[] nArray6 = new int[lllllIIlIl[0]];
                                    nArray6[E.lllllIIlIl[1]] = lllllIIlIl[11];
                                    if (E.llIlIIlIllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var1), lllllIIlIl[14])) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[10]];
                                            Movement.walkTo((WorldPoint)var1);

                                            Time.sleepTicks((int)lllllIIlIl[0]);

                                        }
                                        if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var1), lllllIIlIl[14])) {
                                            int[] nArray7 = new int[lllllIIlIl[0]];
                                            nArray7[E.lllllIIlIl[1]] = lllllIIlIl[11];
                                            var3 = TileItems.getNearest((int[])nArray7);
                                            if (E.llIlIIlIlllll(var3)) {
                                                if (E.llIlIIlIllllI(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[23]];
                                                    Movement.walkTo((WorldPoint)var3.getWorldLocation());

                                                    Time.sleepTicks((int)lllllIIlIl[0]);

                                                }
                                                if (E.llIlIIlIlllII(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[24]];
                                                    var3.interact(lllllIIIll[lllllIIlIl[25]]);
                                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int[] nArray8 = new int[lllllIIlIl[0]];
                        nArray8[E.lllllIIlIl[1]] = lllllIIlIl[11];
                        if (!E.llIlIIlIllllI(Inventory.contains((int[])nArray8) ? 1 : 0)) break block136;
                        int[] nArray9 = new int[lllllIIlIl[0]];
                        nArray9[E.lllllIIlIl[1]] = lllllIIlIl[19];
                        if (!E.llIlIIlIlllII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block137;
                    }
                    int[] nArray = new int[lllllIIlIl[0]];
                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[19];
                    if (E.llIlIIlIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray10 = new int[lllllIIlIl[0]];
                        nArray10[E.lllllIIlIl[1]] = lllllIIlIl[11];
                        if (E.llIlIIlIlllII(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[26]];
                            int[] nArray11 = new int[lllllIIlIl[0]];
                            nArray11[E.lllllIIlIl[1]] = lllllIIlIl[11];
                            int[] nArray12 = new int[lllllIIlIl[0]];
                            nArray12[E.lllllIIlIl[1]] = lllllIIlIl[9];
                            Inventory.getFirst((int[])nArray11).useOn(Inventory.getFirst((int[])nArray12));
                            Time.sleepTicks((int)lllllIIlIl[0]);

                        }
                    }
                    int[] nArray13 = new int[lllllIIlIl[0]];
                    nArray13[E.lllllIIlIl[1]] = lllllIIlIl[19];
                    if (E.llIlIIlIlllII(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                        String[] stringArray = new String[lllllIIlIl[0]];
                        stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[27]];
                        if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gV), lllllIIlIl[4])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[28]];
                                Movement.walkTo((WorldPoint)gV);

                                Time.sleepTicks((int)lllllIIlIl[0]);

                            }
                            if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gV), lllllIIlIl[4])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[29]];
                                String[] stringArray2 = new String[lllllIIlIl[0]];
                                stringArray2[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lllllIIIll[lllllIIlIl[31]]);
                                Time.sleepTicks((int)lllllIIlIl[20]);

                            }
                        }
                        String[] stringArray3 = new String[lllllIIlIl[0]];
                        stringArray3[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[32]];
                        if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gW), lllllIIlIl[8])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[33]];
                                Movement.walkTo((WorldPoint)gW);

                                Time.sleepTicks((int)lllllIIlIl[0]);

                            }
                            if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gW), lllllIIlIl[8])) {
                                int[] nArray14 = new int[lllllIIlIl[0]];
                                nArray14[E.lllllIIlIl[1]] = lllllIIlIl[19];
                                String[] stringArray4 = new String[lllllIIlIl[0]];
                                stringArray4[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lllllIIlIl[0]);

                            }
                        }
                    }
                }
                String[] stringArray = new String[lllllIIlIl[0]];
                stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[35]];
                if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    int[] nArray = new int[lllllIIlIl[0]];
                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[19];
                    if (E.llIlIIlIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray5 = new String[lllllIIlIl[0]];
                        stringArray5[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[36]];
                        if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray5) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[37]];
                            if (E.llIlIIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray6 = new String[lllllIIlIl[0]];
                                stringArray6[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[38]];
                                TileObjects.getNearest((String[])stringArray6).interact(lllllIIIll[lllllIIlIl[39]]);
                                Time.sleepTicks((int)lllllIIlIl[4]);

                            }
                            g.a(bQ);
                        }
                    }
                }
                String[] stringArray7 = new String[lllllIIlIl[0]];
                stringArray7[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[40]];
                if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray7) ? 1 : 0)) {
                    String[] stringArray8 = new String[lllllIIlIl[0]];
                    stringArray8[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[41]];
                    if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                        String[] stringArray9 = new String[lllllIIlIl[0]];
                        stringArray9[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[42]];
                        if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                            var1 = new WorldPoint(lllllIIlIl[43], lllllIIlIl[44], lllllIIlIl[1]);
                            var3 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[44], lllllIIlIl[1]);
                            var2 = new WorldArea(lllllIIlIl[21], lllllIIlIl[45], lllllIIlIl[14], lllllIIlIl[8], lllllIIlIl[1]);
                            if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var1) ? 1 : 0) && E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0) && E.llIlIIlIllllI(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[46]];
                                Movement.walkTo((WorldPoint)var1);

                                Time.sleepTicks((int)lllllIIlIl[0]);

                            }
                            if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var1) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllllIIlIl[0]];
                                stringArray10[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lllllIIIll[lllllIIlIl[48]]);
                                Time.sleepTicks((int)lllllIIlIl[3]);

                            }
                            if (E.llIlIIlIlllII(var2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[49]];
                                String[] stringArray11 = new String[lllllIIlIl[0]];
                                stringArray11[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lllllIIIll[lllllIIlIl[51]]);
                                Time.sleepTicks((int)lllllIIlIl[8]);

                            }
                        }
                    }
                }
                String[] stringArray12 = new String[lllllIIlIl[0]];
                stringArray12[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[52]];
                if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lllllIIlIl[0]];
                    stringArray13[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[53]];
                    if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        var1 = new WorldArea(lllllIIlIl[21], lllllIIlIl[45], lllllIIlIl[14], lllllIIlIl[8], lllllIIlIl[1]);
                        var3 = new WorldArea(lllllIIlIl[54], lllllIIlIl[55], lllllIIlIl[18], lllllIIlIl[23], lllllIIlIl[1]);
                        if (E.llIlIIlIlllII(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lllllIIlIl[0]];
                            stringArray14[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lllllIIIll[lllllIIlIl[57]]);
                            Time.sleepTicks((int)lllllIIlIl[3]);

                        }
                        if (E.llIlIIlIllllI(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(ha.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[58]];
                            Movement.walkTo((WorldPoint)gX);

                            Time.sleepTicks((int)lllllIIlIl[0]);

                        }
                        if (E.llIlIIlIlllII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lllllIIlIl[0]];
                            stringArray15[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lllllIIIll[lllllIIlIl[60]]);
                            Time.sleepTicks((int)lllllIIlIl[4]);

                        }
                        if (E.llIlIIlIlllII(ha.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint var4;
                            WorldPoint var5;
                            WorldPoint var6;
                            var2 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[61], lllllIIlIl[1]);
                            WorldPoint var7 = new WorldPoint(lllllIIlIl[62], lllllIIlIl[63], lllllIIlIl[1]);
                            WorldPoint var8 = new WorldPoint(lllllIIlIl[64], lllllIIlIl[65], lllllIIlIl[1]);
                            WorldPoint var9 = new WorldPoint(lllllIIlIl[43], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldPoint var10 = new WorldPoint(lllllIIlIl[67], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldPoint var11 = new WorldPoint(lllllIIlIl[67], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldArea var12 = new WorldArea(lllllIIlIl[68], lllllIIlIl[69], lllllIIlIl[20], lllllIIlIl[23], lllllIIlIl[1]);
                            WorldArea var13 = new WorldArea(lllllIIlIl[70], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[17], lllllIIlIl[1]);
                            WorldArea var14 = new WorldArea(lllllIIlIl[72], lllllIIlIl[73], lllllIIlIl[32], lllllIIlIl[25], lllllIIlIl[1]);
                            if (E.llIlIIllIIlIl(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[75]))) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[76]];
                                    Movement.walkTo((WorldPoint)var2);

                                    Time.sleepTicks((int)lllllIIlIl[0]);

                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[77]];
                                    String[] stringArray16 = new String[lllllIIlIl[0]];
                                    stringArray16[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lllllIIIll[lllllIIlIl[79]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[75]))) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[81]];
                                    Movement.walkTo((WorldPoint)var7);

                                    Time.sleepTicks((int)lllllIIlIl[0]);

                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[82]];
                                    String[] stringArray17 = new String[lllllIIlIl[0]];
                                    stringArray17[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lllllIIIll[lllllIIlIl[83]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[80]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[75]))) {
                                if (E.llIlIIlIllllI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[84], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[85]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lllllIIlIl[0]];
                                        stringArray18[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lllllIIIll[lllllIIlIl[87]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[88]];
                                    String[] stringArray19 = new String[lllllIIlIl[0]];
                                    stringArray19[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lllllIIIll[lllllIIlIl[90]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[80]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0])) {
                                if (E.llIlIIlIlllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var6 = new WorldPoint(lllllIIlIl[21], lllllIIlIl[91], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[92]];
                                        Movement.walkTo((WorldPoint)var6);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lllllIIlIl[0]];
                                        stringArray20[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lllllIIIll[lllllIIlIl[94]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIllllI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[95]];
                                        Movement.walkTo((WorldPoint)var7);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[96]];
                                        String[] stringArray21 = new String[lllllIIlIl[0]];
                                        stringArray21[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lllllIIIll[lllllIIlIl[98]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0])) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[99]];
                                    Movement.walkTo((WorldPoint)var2);

                                    Time.sleepTicks((int)lllllIIlIl[0]);

                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var2) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[100]];
                                    String[] stringArray22 = new String[lllllIIlIl[0]];
                                    stringArray22[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lllllIIIll[lllllIIlIl[102]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[103])) && E.llIlIIlIllllI(E.co() ? 1 : 0)) {
                                if (E.llIlIIlIllllI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (E.llIlIIlIlllII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var6 = new WorldPoint(lllllIIlIl[104], lllllIIlIl[84], lllllIIlIl[1]);
                                        if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[105]];
                                            Movement.walkTo((WorldPoint)var6);

                                            Time.sleepTicks((int)lllllIIlIl[0]);

                                        }
                                        if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lllllIIlIl[0]];
                                            stringArray23[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lllllIIIll[lllllIIlIl[107]]);
                                            Time.sleepTicks((int)lllllIIlIl[8]);

                                        }
                                    }
                                    if (E.llIlIIlIlllII((var6 = new WorldArea(lllllIIlIl[72], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(E.co() ? 1 : 0)) {
                                        var5 = new WorldPoint(lllllIIlIl[108], lllllIIlIl[109], lllllIIlIl[1]);
                                        if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[110]];
                                            Movement.walkTo((WorldPoint)var5);

                                            Time.sleepTicks((int)lllllIIlIl[0]);

                                        }
                                        if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lllllIIlIl[0]];
                                            stringArray24[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lllllIIIll[lllllIIlIl[112]]);
                                            Time.sleepTicks((int)lllllIIlIl[8]);

                                        }
                                    }
                                    if (E.llIlIIlIlllII((var5 = new WorldArea(lllllIIlIl[70], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        var4 = new WorldPoint(lllllIIlIl[67], lllllIIlIl[113], lllllIIlIl[1]);
                                        if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[114]];
                                            Movement.walkTo((WorldPoint)var4);

                                            Time.sleepTicks((int)lllllIIlIl[0]);

                                        }
                                        if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lllllIIlIl[0]];
                                            stringArray25[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lllllIIIll[lllllIIlIl[116]]);
                                            Time.sleepTicks((int)lllllIIlIl[8]);

                                        }
                                    }
                                }
                                if (E.llIlIIlIlllII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(E.co() ? 1 : 0)) {
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[117]];
                                        Movement.walkTo((WorldPoint)var10);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[118]];
                                        String[] stringArray26 = new String[lllllIIlIl[0]];
                                        stringArray26[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lllllIIIll[lllllIIlIl[120]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[103]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[121]))) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[122]];
                                    Movement.walkTo((WorldPoint)var11);

                                    Time.sleepTicks((int)lllllIIlIl[0]);

                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var11) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[123]];
                                    String[] stringArray27 = new String[lllllIIlIl[0]];
                                    stringArray27[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lllllIIIll[lllllIIlIl[125]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[103]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[126]))) {
                                var6 = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (E.llIlIIlIlllII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var5 = new WorldPoint(lllllIIlIl[127], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[128]];
                                        Movement.walkTo((WorldPoint)var5);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lllllIIlIl[0]];
                                        stringArray28[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lllllIIIll[lllllIIlIl[130]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var5 = new WorldPoint(lllllIIlIl[131], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[132]];
                                        Movement.walkTo((WorldPoint)var5);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lllllIIlIl[0]];
                                        stringArray29[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lllllIIIll[lllllIIlIl[134]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[135]];
                                    String[] stringArray30 = new String[lllllIIlIl[0]];
                                    stringArray30[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lllllIIIll[lllllIIlIl[137]]);
                                    Time.sleepTicks((int)lllllIIlIl[16]);

                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[103]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[126]), lllllIIlIl[0])) {
                                var6 = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (E.llIlIIlIlllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var5 = new WorldPoint(lllllIIlIl[138], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[139]];
                                        Movement.walkTo((WorldPoint)var5);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lllllIIlIl[0]];
                                        stringArray31[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lllllIIIll[lllllIIlIl[141]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var5 = new WorldPoint(lllllIIlIl[108], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[142]];
                                        Movement.walkTo((WorldPoint)var5);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lllllIIlIl[0]];
                                        stringArray32[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lllllIIIll[lllllIIlIl[144]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[145]];
                                        Movement.walkTo((WorldPoint)var10);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var10) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[146]];
                                        String[] stringArray33 = new String[lllllIIlIl[0]];
                                        stringArray33[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lllllIIIll[lllllIIlIl[148]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[103])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[126]), lllllIIlIl[0])) {
                                var6 = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (E.llIlIIlIlllII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var5 = new WorldPoint(lllllIIlIl[127], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[149]];
                                        Movement.walkTo((WorldPoint)var5);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lllllIIlIl[0]];
                                        stringArray34[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lllllIIIll[lllllIIlIl[151]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII(var6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    var5 = new WorldPoint(lllllIIlIl[104], lllllIIlIl[152], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[153]];
                                        Movement.walkTo((WorldPoint)var5);

                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)var5) ? 1 : 0)) {
                                        Time.sleepTicks((int)lllllIIlIl[0]);

                                        String[] stringArray35 = new String[lllllIIlIl[0]];
                                        stringArray35[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lllllIIIll[lllllIIlIl[155]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);

                                    }
                                }
                                if (E.llIlIIlIlllII((var5 = new WorldArea(lllllIIlIl[72], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[156]];
                                    Time.sleepTicks((int)lllllIIlIl[0]);

                                    int[] nArray = new int[lllllIIlIl[0]];
                                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[157];
                                    TileObjects.getNearest((int[])nArray).interact(lllllIIIll[lllllIIlIl[158]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                                if (E.llIlIIlIlllII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lllllIIlIl[0]];
                                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[159];
                                    TileObjects.getNearest((int[])nArray).interact(lllllIIIll[lllllIIlIl[160]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);

                                }
                                if (E.llIlIIlIlllII((var4 = new WorldArea(lllllIIlIl[161], lllllIIlIl[162], lllllIIlIl[23], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lllllIIlIl[0]];
                                    stringArray36[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[163]];
                                    if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lllllIIlIl[0]];
                                        stringArray37[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lllllIIIll[lllllIIlIl[165]]);
                                        Time.sleepTicks((int)lllllIIlIl[14]);

                                    }
                                }
                            }
                        }
                    }
                }
                String[] stringArray38 = new String[lllllIIlIl[0]];
                stringArray38[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[166]];
                if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray38) ? 1 : 0)) {
                    String[] stringArray39 = new String[lllllIIlIl[0]];
                    stringArray39[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[167]];
                    if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray39) ? 1 : 0)) {
                        var1 = new WorldArea(lllllIIlIl[161], lllllIIlIl[162], lllllIIlIl[23], lllllIIlIl[14], lllllIIlIl[1]);
                        if (E.llIlIIlIlllII(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lllllIIlIl[0]];
                            nArray[E.lllllIIlIl[1]] = lllllIIlIl[159];
                            TileObjects.getNearest((int[])nArray).interact(lllllIIIll[lllllIIlIl[168]]);
                            Time.sleepTicks((int)lllllIIlIl[14]);

                        }
                        if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[169]];
                            Movement.walkTo((WorldPoint)gY);

                            Time.sleepTicks((int)lllllIIlIl[0]);

                        }
                        if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                            var3 = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (E.llIlIIlIlllII(tileObject.getName().contains(lllllIIIll[lllllIIlIl[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lllllIIlIl[0]];
                                    stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[186]];
                                    if (E.llIlIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0) && E.llIlIIllIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIlIl[21], lllllIIlIl[184], lllllIIlIl[3])), lllllIIlIl[3])) {
                                        n2 = lllllIIlIl[0];

                                        if (null == null) return n2 != 0;
                                        return false;
                                    }
                                }
                                n2 = lllllIIlIl[1];
                                return n2 != 0;
                            });
                            if (E.llIlIIlIlllll(var3)) {
                                var3.interact(lllllIIIll[lllllIIlIl[170]]);
                                Time.sleepTicks((int)lllllIIlIl[8]);

                            }
                            if (E.llIlIIllIIllI(var3)) {
                                g.a(lllllIIIll[lllllIIlIl[171]], bQ, lllllIIlIl[0]);
                            }
                        }
                    }
                }
            }
            if (E.llIlIIllIIlII(e.j(gZ), lllllIIlIl[3])) {
                if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[172]];
                    Movement.walkTo((WorldPoint)gY);

                    Time.sleepTicks((int)lllllIIlIl[0]);

                }
                if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                    var1 = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (E.llIlIIlIlllII(tileObject.getName().contains(lllllIIIll[lllllIIlIl[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIIlIl[0]];
                            stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[183]];
                            if (E.llIlIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0) && E.llIlIIllIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIlIl[21], lllllIIlIl[184], lllllIIlIl[3])), lllllIIlIl[3])) {
                                n2 = lllllIIlIl[0];

                                if (3 < (22 + 132 - 121 + 100 ^ 24 + 16 - -72 + 17)) return n2 != 0;
                                return ((0 ^ 0x5E ^ (0x2E ^ 0x4E)) & (0x11 ^ 0x76 ^ (0xD ^ 0x54) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIIlIl[1];
                        return n2 != 0;
                    });
                    if (E.llIlIIlIlllll(var1)) {
                        var1.interact(lllllIIIll[lllllIIlIl[173]]);
                        Time.sleepTicks((int)lllllIIlIl[8]);

                    }
                    if (E.llIlIIllIIllI(var1)) {
                        if (E.llIlIIlIlllIl(ck, lllllIIlIl[0])) {
                            ac.mW += lllllIIlIl[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllllIIlIl[0];
                            ac.mW = lllllIIlIl[1];
                            cl = lllllIIlIl[1];
                        }
                        g.a(lllllIIIll[lllllIIlIl[174]], bQ, lllllIIlIl[0]);
                    }
                }
            }
            g.a(bQ);
        }
    }

    private static void ae() {
        block14: {
            d var15;
            block13: {
                block12: {
                    block11: {
                        Object var16;
                        int[] nArray = new int[lllllIIlIl[0]];
                        nArray[E.lllllIIlIl[1]] = lllllIIlIl[6];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new DHelper(lllllIIlIl[6], lllllIIlIl[10], lllllIIlIl[175]);
                            bu.add(d2);

                        }
                        int[] nArray2 = new int[lllllIIlIl[0]];
                        nArray2[E.lllllIIlIl[1]] = lllllIIlIl[7];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            var16 = new DHelper(lllllIIlIl[7], lllllIIlIl[0], lllllIIlIl[175]);
                            bu.add((DHelper) ar16);

                        }
                        int[] nArray3 = new int[lllllIIlIl[0]];
                        nArray3[E.lllllIIlIl[1]] = lllllIIlIl[9];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            var16 = new DHelper(lllllIIlIl[9], lllllIIlIl[0], lllllIIlIl[175]);
                            bu.add((DHelper) ar16);

                        }
                        if (E.llIlIIlIllllI(Bank.contains((Predicate)(var16 = item -> item.getName().toLowerCase().contains(lllllIIIll[lllllIIlIl[181]]))) ? 1 : 0)) {
                            var15 = new DHelper(lllllIIlIl[176], lllllIIlIl[14], lllllIIlIl[177]);
                            bu.add(var15);

                        }
                        int[] nArray4 = new int[lllllIIlIl[0]];
                        nArray4[E.lllllIIlIl[1]] = lllllIIlIl[12];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            var15 = new DHelper(lllllIIlIl[12], lllllIIlIl[4], i.bp);
                            bu.add(var15);

                        }
                        int[] nArray5 = new int[lllllIIlIl[0]];
                        nArray5[E.lllllIIlIl[1]] = lllllIIlIl[13];
                        if (!E.llIlIIlIlllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block11;
                        int[] nArray6 = new int[lllllIIlIl[0]];
                        nArray6[E.lllllIIlIl[1]] = lllllIIlIl[13];
                        if (!E.llIlIIlIlllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block12;
                        int[] nArray7 = new int[lllllIIlIl[0]];
                        nArray7[E.lllllIIlIl[1]] = lllllIIlIl[13];
                        if (!E.llIlIIlIlllIl(Bank.getFirst((int[])nArray7).getQuantity(), lllllIIlIl[14])) break block12;
                    }
                    var15 = new DHelper(lllllIIlIl[13], lllllIIlIl[10], lllllIIlIl[178]);
                    bu.add(var15);

                }
                int[] nArray = new int[lllllIIlIl[0]];
                nArray[E.lllllIIlIl[1]] = lllllIIlIl[5];
                if (!E.llIlIIlIlllII(Bank.contains((int[])nArray) ? 1 : 0)) break block13;
                int[] nArray8 = new int[lllllIIlIl[0]];
                nArray8[E.lllllIIlIl[1]] = lllllIIlIl[5];
                if (!E.llIlIIlIlllII(Bank.contains((int[])nArray8) ? 1 : 0)) break block14;
                int[] nArray9 = new int[lllllIIlIl[0]];
                nArray9[E.lllllIIlIl[1]] = lllllIIlIl[5];
                if (!E.llIlIIlIlllIl(Bank.getFirst((int[])nArray9).getQuantity(), lllllIIlIl[27])) break block14;
            }
            var15 = new DHelper(lllllIIlIl[5], lllllIIlIl[57], lllllIIlIl[179]);
            bu.add(var15);

        }
    }

    private static boolean llIlIIllIIllI(Object object) {
        return object == null;
    }

        return String.valueOf(var17);
    }

    static {
        E.llIlIIlIllIlI();
        E.llIlIIlIIllIl();
        bu = new ArrayList<d>();
        gf = new WorldPoint(lllllIIlIl[64], lllllIIlIl[187], lllllIIlIl[1]);
        gV = new WorldPoint(lllllIIlIl[188], lllllIIlIl[189], lllllIIlIl[1]);
        gW = new WorldPoint(lllllIIlIl[161], lllllIIlIl[190], lllllIIlIl[1]);
        gX = new WorldPoint(lllllIIlIl[191], lllllIIlIl[192], lllllIIlIl[1]);
        gY = new WorldPoint(lllllIIlIl[64], lllllIIlIl[45], lllllIIlIl[3]);
        gZ = lllllIIlIl[47];
        String[] stringArray = new String[lllllIIlIl[8]];
        stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[193]];
        stringArray[E.lllllIIlIl[0]] = lllllIIIll[lllllIIlIl[194]];
        stringArray[E.lllllIIlIl[3]] = lllllIIIll[lllllIIlIl[195]];
        bQ = stringArray;
        ha = new WorldArea(lllllIIlIl[188], lllllIIlIl[196], lllllIIlIl[50], lllllIIlIl[40], lllllIIlIl[1]);
    }

    private static boolean llIlIIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (E.llIlIIllIIlll(e.j(lllllIIlIl[47]), lllllIIlIl[8])) {
            bl = lllllIIlIl[0];

            }
        } else {
            bl = lllllIIlIl[1];
        }
        return bl;
    }

    private static boolean llIlIIlIllllI(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            E.cn();

        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x9F ^ 0x9A ^ (0x7F ^ 0x57) & ~(0xAA ^ 0x82)) == 0) {
            return (118 + 105 - 207 + 149 ^ 4 + 89 - 63 + 99) & (108 + 215 - 182 + 86 ^ 3 + 21 - 18 + 193 ^ -1);
        }
        return lllllIIlIl[144];
    }

    static boolean co() {
        int n2;
        if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[103])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[126]), lllllIIlIl[0])) {
            n2 = lllllIIlIl[0];

            if (1 == 2) {
                return false;
            }
        } else {
            n2 = lllllIIlIl[1];
        }
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lllllIIlIl[1];
    }

    private static boolean llIlIIllIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static int llIlIIlIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean llIlIIllIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIlIlllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void var18;
        int[] nArray = new int[lllllIIlIl[4]];
        nArray[E.lllllIIlIl[1]] = lllllIIlIl[5];
        nArray[E.lllllIIlIl[0]] = lllllIIlIl[6];
        nArray[E.lllllIIlIl[3]] = lllllIIlIl[7];
        nArray[E.lllllIIlIl[8]] = lllllIIlIl[9];
        int[] nArray2 = nArray;
        int var19 = lllllIIlIl[1];
        while (E.llIlIIlIlllIl(var19, ((void)var18).length)) {
            int[] nArray3 = new int[lllllIIlIl[0]];
            nArray3[E.lllllIIlIl[1]] = var18[var19];
            if (E.llIlIIlIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllllIIlIl[1];
            }
            ++var19;

            if (-3 < 0) continue;
            return (2 & (2 ^ -1)) != 0;
        }
        return lllllIIlIl[0];
    }

    @Override
    public String U() {
        return lllllIIIll[lllllIIlIl[180]];
    }
}

