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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
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

public class E
implements S {
    public static /* synthetic */ WorldPoint gV;
    static /* synthetic */ WorldArea ha;
    public static /* synthetic */ WorldPoint gW;
    static /* synthetic */ int gZ;
    public static /* synthetic */ WorldPoint gf;
    private static /* synthetic */ String[] lllllIIIll;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ int[] lllllIIlIl;
    public static /* synthetic */ WorldPoint gX;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ boolean bs;
    static /* synthetic */ int ck;
    public static /* synthetic */ WorldPoint gY;

    private static boolean llIlIIllIIIIl(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIlIIlIIlIlI(String lllllllllllllllllIlIIllIIIlllIIl, String lllllllllllllllllIlIIllIIIllIllI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIllIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIllIIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIllIIIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIllIIIlllIll.init(lllllIIlIl[3], lllllllllllllllllIlIIllIIIllllII);
            return new String(lllllllllllllllllIlIIllIIIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIllIIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIllIIIlllIlI) {
            lllllllllllllllllIlIIllIIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIIllIl() {
        lllllIIIll = new String[lllllIIlIl[197]];
        E.lllllIIIll[E.lllllIIlIl[1]] = E."Finished buying items, switching back to quest";
        E.lllllIIIll[E.lllllIIlIl[0]] = E."Nav to bank";
        E.lllllIIIll[E.lllllIIlIl[3]] = E."Handling banking";
        E.lllllIIIll[E.lllllIIlIl[8]] = E."We are missing quest supplies, switching to BUYING";
        E.lllllIIIll[E.lllllIIlIl[4]] = E."Drink";
        E.lllllIIIll[E.lllllIIlIl[14]] = E."Eat";
        E.lllllIIIll[E.lllllIIlIl[17]] = E."Nav to start";
        E.lllllIIIll[E.lllllIIlIl[18]] = E."Start quest";
        E.lllllIIIll[E.lllllIIlIl[16]] = E."Veronica";
        E.lllllIIIll[E.lllllIIlIl[20]] = E."Key";
        E.lllllIIIll[E.lllllIIlIl[10]] = E."Nav to fish food";
        E.lllllIIIll[E.lllllIIlIl[23]] = E."Can't reach, navigating";
        E.lllllIIIll[E.lllllIIlIl[24]] = E."Taking food";
        E.lllllIIIll[E.lllllIIlIl[25]] = E."Take";
        E.lllllIIIll[E.lllllIIlIl[26]] = E."Making poison fish food";
        E.lllllIIIll[E.lllllIIlIl[27]] = E."Key";
        E.lllllIIIll[E.lllllIIlIl[28]] = E."Nav to compost";
        E.lllllIIIll[E.lllllIIlIl[29]] = E."Digging";
        E.lllllIIIll[E.lllllIIlIl[30]] = E."Compost heap";
        E.lllllIIIll[E.lllllIIlIl[31]] = E."Search";
        E.lllllIIIll[E.lllllIIlIl[32]] = E."Key";
        E.lllllIIIll[E.lllllIIlIl[33]] = E."Nav to fountain";
        E.lllllIIIll[E.lllllIIlIl[34]] = E."Fountain";
        E.lllllIIIll[E.lllllIIlIl[35]] = E."Key";
        E.lllllIIIll[E.lllllIIlIl[36]] = E."Pressure gauge";
        E.lllllIIIll[E.lllllIIlIl[37]] = E."Getting guage";
        E.lllllIIIll[E.lllllIIlIl[38]] = E."Fountain";
        E.lllllIIIll[E.lllllIIlIl[39]] = E."Search";
        E.lllllIIIll[E.lllllIIlIl[40]] = E."Key";
        E.lllllIIIll[E.lllllIIlIl[41]] = E."Pressure gauge";
        E.lllllIIIll[E.lllllIIlIl[42]] = E."Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[46]] = E."Nav to door";
        E.lllllIIIll[E.lllllIIlIl[47]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[48]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[49]] = E."Get tube";
        E.lllllIIIll[E.lllllIIlIl[50]] = E."Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[51]] = E."Take";
        E.lllllIIIll[E.lllllIIlIl[52]] = E."Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[53]] = E."Oil can";
        E.lllllIIIll[E.lllllIIlIl[56]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[57]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[58]] = E."Nav to final room";
        E.lllllIIIll[E.lllllIIlIl[59]] = E."Ladder";
        E.lllllIIIll[E.lllllIIlIl[60]] = E."Climb-down";
        E.lllllIIIll[E.lllllIIlIl[76]] = E."Nav to a";
        E.lllllIIIll[E.lllllIIlIl[77]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[78]] = E."Lever A";
        E.lllllIIIll[E.lllllIIlIl[79]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[81]] = E."Nav to b";
        E.lllllIIIll[E.lllllIIlIl[82]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[15]] = E."Lever B";
        E.lllllIIIll[E.lllllIIlIl[83]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[85]] = E."Nav to d";
        E.lllllIIIll[E.lllllIIlIl[86]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[87]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[88]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[89]] = E."Lever D";
        E.lllllIIIll[E.lllllIIlIl[90]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[92]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[93]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[94]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[95]] = E."Nav to b";
        E.lllllIIIll[E.lllllIIlIl[96]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[97]] = E."Lever B";
        E.lllllIIIll[E.lllllIIlIl[98]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[99]] = E."Nav to a";
        E.lllllIIIll[E.lllllIIlIl[100]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[101]] = E."Lever A";
        E.lllllIIIll[E.lllllIIlIl[102]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[105]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[106]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[107]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[110]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[111]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[112]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[114]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[115]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[116]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[117]] = E."Nav to e";
        E.lllllIIIll[E.lllllIIlIl[118]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[119]] = E."Lever E";
        E.lllllIIIll[E.lllllIIlIl[120]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[122]] = E."Nav to f";
        E.lllllIIIll[E.lllllIIlIl[123]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[124]] = E."Lever F";
        E.lllllIIIll[E.lllllIIlIl[125]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[128]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[129]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[130]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[132]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[133]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[134]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[135]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[136]] = E."Lever C";
        E.lllllIIIll[E.lllllIIlIl[137]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[139]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[140]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[141]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[142]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[143]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[144]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[145]] = E."Nav to e";
        E.lllllIIIll[E.lllllIIlIl[146]] = E."Pull lever";
        E.lllllIIIll[E.lllllIIlIl[147]] = E."Lever E";
        E.lllllIIIll[E.lllllIIlIl[148]] = E."Pull";
        E.lllllIIIll[E.lllllIIlIl[149]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[150]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[151]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[153]] = E."Move to door";
        E.lllllIIIll[E.lllllIIlIl[154]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[155]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[156]] = E."Opening 145";
        E.lllllIIIll[E.lllllIIlIl[158]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[160]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[163]] = E."Oil can";
        E.lllllIIIll[E.lllllIIlIl[164]] = E."Oil can";
        E.lllllIIIll[E.lllllIIlIl[165]] = E."Take";
        E.lllllIIIll[E.lllllIIlIl[166]] = E."Rubber tube";
        E.lllllIIIll[E.lllllIIlIl[167]] = E."Oil can";
        E.lllllIIIll[E.lllllIIlIl[168]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[169]] = E."Nav to professor";
        E.lllllIIIll[E.lllllIIlIl[170]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[171]] = E."Professor Oddenstein";
        E.lllllIIIll[E.lllllIIlIl[172]] = E."Nav to professor";
        E.lllllIIIll[E.lllllIIlIl[173]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[174]] = E."Professor Oddenstein";
        E.lllllIIIll[E.lllllIIlIl[180]] = E."Ernest the Chicken";
        E.lllllIIIll[E.lllllIIlIl[181]] = E."ring of wealth (";
        E.lllllIIIll[E.lllllIIlIl[182]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[183]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[185]] = E."Door";
        E.lllllIIIll[E.lllllIIlIl[186]] = E."Open";
        E.lllllIIIll[E.lllllIIlIl[193]] = E."Yes.";
        E.lllllIIIll[E.lllllIIlIl[194]] = E."I'm looking for a guy called Ernest.";
        E.lllllIIIll[E.lllllIIlIl[195]] = E."I'm glad Veronica didn't actually get engaged to a chicken.";
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
            BankLocation lllllllllllllllllIlIIllIIlllIlII;
            block135: {
                WorldArea lllllllllllllllllIlIIllIIlllIIlI;
                TileItem lllllllllllllllllIlIIllIIlllIIll;
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
                            lllllllllllllllllIlIIllIIlllIlII = BankLocation.getNearest();
                            if (E.llIlIIlIlllll(lllllllllllllllllIlIIllIIlllIlII) && E.llIlIIlIllllI(lllllllllllllllllIlIIllIIlllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[0]];
                                a.a(lllllllllllllllllIlIIllIIlllIlII);
                            }
                            if (E.llIlIIlIlllll(lllllllllllllllllIlIIllIIlllIlII) && E.llIlIIlIlllII(lllllllllllllllllIlIIllIIlllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (E.llIlIIlIllllI(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIIlIl[2]);
                                    0;
                                }
                                if (E.llIlIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[3]];
                                    if (E.llIlIIllIIIII(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllllIIlIl[4]);
                                        0;
                                    }
                                    if (E.llIlIIllIIIII(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllllIIlIl[3]);
                                        0;
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
                            0;
                        }
                        int[] nArray = new int[lllllIIlIl[0]];
                        nArray[E.lllllIIlIl[1]] = lllllIIlIl[13];
                        if (E.llIlIIlIlllII(Inventory.contains((int[])nArray) ? 1 : 0) && E.llIlIIllIIIIl(E.llIlIIlIllIll(e.u(), 50.0))) {
                            int[] nArray3 = new int[lllllIIlIl[0]];
                            nArray3[E.lllllIIlIl[1]] = lllllIIlIl[13];
                            Inventory.getFirst((int[])nArray3).interact(lllllIIIll[lllllIIlIl[14]]);
                            Time.sleepTicks((int)lllllIIlIl[3]);
                            0;
                        }
                        if (E.llIlIIlIlllII(E.aa() ? 1 : 0) && E.llIlIIlIllllI(e.j(gZ))) {
                            if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gf), lllllIIlIl[16])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[17]];
                                Movement.walkTo((WorldPoint)gf);
                                0;
                                Time.sleepTicks((int)lllllIIlIl[0]);
                                0;
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
                                    lllllllllllllllllIlIIllIIlllIlII = new WorldPoint(lllllIIlIl[21], lllllIIlIl[22], lllllIIlIl[0]);
                                    int[] nArray6 = new int[lllllIIlIl[0]];
                                    nArray6[E.lllllIIlIl[1]] = lllllIIlIl[11];
                                    if (E.llIlIIlIllllI(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                        if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIIllIIlllIlII), lllllIIlIl[14])) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[10]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIlII);
                                            0;
                                            Time.sleepTicks((int)lllllIIlIl[0]);
                                            0;
                                        }
                                        if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIIllIIlllIlII), lllllIIlIl[14])) {
                                            int[] nArray7 = new int[lllllIIlIl[0]];
                                            nArray7[E.lllllIIlIl[1]] = lllllIIlIl[11];
                                            lllllllllllllllllIlIIllIIlllIIll = TileItems.getNearest((int[])nArray7);
                                            if (E.llIlIIlIlllll(lllllllllllllllllIlIIllIIlllIIll)) {
                                                if (E.llIlIIlIllllI(Reachable.isInteractable((Locatable)lllllllllllllllllIlIIllIIlllIIll) ? 1 : 0)) {
                                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[23]];
                                                    Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIIll.getWorldLocation());
                                                    0;
                                                    Time.sleepTicks((int)lllllIIlIl[0]);
                                                    0;
                                                }
                                                if (E.llIlIIlIlllII(Reachable.isInteractable((Locatable)lllllllllllllllllIlIIllIIlllIIll) ? 1 : 0)) {
                                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[24]];
                                                    lllllllllllllllllIlIIllIIlllIIll.interact(lllllIIIll[lllllIIlIl[25]]);
                                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                                    0;
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
                            0;
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
                                0;
                                Time.sleepTicks((int)lllllIIlIl[0]);
                                0;
                            }
                            if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gV), lllllIIlIl[4])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[29]];
                                String[] stringArray2 = new String[lllllIIlIl[0]];
                                stringArray2[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[30]];
                                TileObjects.getNearest((String[])stringArray2).interact(lllllIIIll[lllllIIlIl[31]]);
                                Time.sleepTicks((int)lllllIIlIl[20]);
                                0;
                            }
                        }
                        String[] stringArray3 = new String[lllllIIlIl[0]];
                        stringArray3[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[32]];
                        if (E.llIlIIlIlllII(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gW), lllllIIlIl[8])) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[33]];
                                Movement.walkTo((WorldPoint)gW);
                                0;
                                Time.sleepTicks((int)lllllIIlIl[0]);
                                0;
                            }
                            if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gW), lllllIIlIl[8])) {
                                int[] nArray14 = new int[lllllIIlIl[0]];
                                nArray14[E.lllllIIlIl[1]] = lllllIIlIl[19];
                                String[] stringArray4 = new String[lllllIIlIl[0]];
                                stringArray4[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[34]];
                                Inventory.getFirst((int[])nArray14).useOn(TileObjects.getNearest((String[])stringArray4));
                                Time.sleepTicks((int)lllllIIlIl[0]);
                                0;
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
                                0;
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
                            lllllllllllllllllIlIIllIIlllIlII = new WorldPoint(lllllIIlIl[43], lllllIIlIl[44], lllllIIlIl[1]);
                            lllllllllllllllllIlIIllIIlllIIll = new WorldPoint(lllllIIlIl[21], lllllIIlIl[44], lllllIIlIl[1]);
                            lllllllllllllllllIlIIllIIlllIIlI = new WorldArea(lllllIIlIl[21], lllllIIlIl[45], lllllIIlIl[14], lllllIIlIl[8], lllllIIlIl[1]);
                            if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIlII) ? 1 : 0) && E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIll) ? 1 : 0) && E.llIlIIlIllllI(lllllllllllllllllIlIIllIIlllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[46]];
                                Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIlII);
                                0;
                                Time.sleepTicks((int)lllllIIlIl[0]);
                                0;
                            }
                            if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIlII) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllllIIlIl[0]];
                                stringArray10[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[47]];
                                TileObjects.getNearest((String[])stringArray10).interact(lllllIIIll[lllllIIlIl[48]]);
                                Time.sleepTicks((int)lllllIIlIl[3]);
                                0;
                            }
                            if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIlllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[49]];
                                String[] stringArray11 = new String[lllllIIlIl[0]];
                                stringArray11[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[50]];
                                TileItems.getNearest((String[])stringArray11).interact(lllllIIIll[lllllIIlIl[51]]);
                                Time.sleepTicks((int)lllllIIlIl[8]);
                                0;
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
                        lllllllllllllllllIlIIllIIlllIlII = new WorldArea(lllllIIlIl[21], lllllIIlIl[45], lllllIIlIl[14], lllllIIlIl[8], lllllIIlIl[1]);
                        lllllllllllllllllIlIIllIIlllIIll = new WorldArea(lllllIIlIl[54], lllllIIlIl[55], lllllIIlIl[18], lllllIIlIl[23], lllllIIlIl[1]);
                        if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIlllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray14 = new String[lllllIIlIl[0]];
                            stringArray14[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[56]];
                            TileObjects.getNearest((String[])stringArray14).interact(lllllIIIll[lllllIIlIl[57]]);
                            Time.sleepTicks((int)lllllIIlIl[3]);
                            0;
                        }
                        if (E.llIlIIlIllllI(lllllllllllllllllIlIIllIIlllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(ha.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[58]];
                            Movement.walkTo((WorldPoint)gX);
                            0;
                            Time.sleepTicks((int)lllllIIlIl[0]);
                            0;
                        }
                        if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIlllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray15 = new String[lllllIIlIl[0]];
                            stringArray15[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[59]];
                            TileObjects.getNearest((String[])stringArray15).interact(lllllIIIll[lllllIIlIl[60]]);
                            Time.sleepTicks((int)lllllIIlIl[4]);
                            0;
                        }
                        if (E.llIlIIlIlllII(ha.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint lllllllllllllllllIlIIllIIllIIlll;
                            WorldPoint lllllllllllllllllIlIIllIIllIlIII;
                            WorldPoint lllllllllllllllllIlIIllIIllIlIIl;
                            lllllllllllllllllIlIIllIIlllIIlI = new WorldPoint(lllllIIlIl[21], lllllIIlIl[61], lllllIIlIl[1]);
                            WorldPoint lllllllllllllllllIlIIllIIlllIIIl = new WorldPoint(lllllIIlIl[62], lllllIIlIl[63], lllllIIlIl[1]);
                            WorldPoint lllllllllllllllllIlIIllIIlllIIII = new WorldPoint(lllllIIlIl[64], lllllIIlIl[65], lllllIIlIl[1]);
                            WorldPoint lllllllllllllllllIlIIllIIllIllll = new WorldPoint(lllllIIlIl[43], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldPoint lllllllllllllllllIlIIllIIllIlllI = new WorldPoint(lllllIIlIl[67], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldPoint lllllllllllllllllIlIIllIIllIllIl = new WorldPoint(lllllIIlIl[67], lllllIIlIl[66], lllllIIlIl[1]);
                            WorldArea lllllllllllllllllIlIIllIIllIllII = new WorldArea(lllllIIlIl[68], lllllIIlIl[69], lllllIIlIl[20], lllllIIlIl[23], lllllIIlIl[1]);
                            WorldArea lllllllllllllllllIlIIllIIllIlIll = new WorldArea(lllllIIlIl[70], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[17], lllllIIlIl[1]);
                            WorldArea lllllllllllllllllIlIIllIIllIlIlI = new WorldArea(lllllIIlIl[72], lllllIIlIl[73], lllllIIlIl[32], lllllIIlIl[25], lllllIIlIl[1]);
                            if (E.llIlIIllIIlIl(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[75]))) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIlI) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[76]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIIlI);
                                    0;
                                    Time.sleepTicks((int)lllllIIlIl[0]);
                                    0;
                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIlI) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[77]];
                                    String[] stringArray16 = new String[lllllIIlIl[0]];
                                    stringArray16[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[78]];
                                    TileObjects.getNearest((String[])stringArray16).interact(lllllIIIll[lllllIIlIl[79]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[75]))) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIIl) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[81]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIIIl);
                                    0;
                                    Time.sleepTicks((int)lllllIIlIl[0]);
                                    0;
                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIIl) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[82]];
                                    String[] stringArray17 = new String[lllllIIlIl[0]];
                                    stringArray17[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[15]];
                                    TileObjects.getNearest((String[])stringArray17).interact(lllllIIIll[lllllIIlIl[83]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[80]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[75]))) {
                                if (E.llIlIIlIllllI(lllllllllllllllllIlIIllIIllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIIl = new WorldPoint(lllllIIlIl[21], lllllIIlIl[84], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIIl) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[85]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIIl) ? 1 : 0)) {
                                        String[] stringArray18 = new String[lllllIIlIl[0]];
                                        stringArray18[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[86]];
                                        TileObjects.getNearest((String[])stringArray18).interact(lllllIIIll[lllllIIlIl[87]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[88]];
                                    String[] stringArray19 = new String[lllllIIlIl[0]];
                                    stringArray19[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[89]];
                                    TileObjects.getNearest((String[])stringArray19).interact(lllllIIIll[lllllIIlIl[90]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[80]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0])) {
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIIl = new WorldPoint(lllllIIlIl[21], lllllIIlIl[91], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIIl) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[92]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIIl);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIIl) ? 1 : 0)) {
                                        String[] stringArray20 = new String[lllllIIlIl[0]];
                                        stringArray20[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[93]];
                                        TileObjects.getNearest((String[])stringArray20).interact(lllllIIIll[lllllIIlIl[94]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIllllI(lllllllllllllllllIlIIllIIllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIIl) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[95]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIIIl);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIIl) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[96]];
                                        String[] stringArray21 = new String[lllllIIlIl[0]];
                                        stringArray21[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[97]];
                                        TileObjects.getNearest((String[])stringArray21).interact(lllllIIIll[lllllIIlIl[98]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[74]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0])) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIlI) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[99]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIlllIIlI);
                                    0;
                                    Time.sleepTicks((int)lllllIIlIl[0]);
                                    0;
                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIlllIIlI) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[100]];
                                    String[] stringArray22 = new String[lllllIIlIl[0]];
                                    stringArray22[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[101]];
                                    TileObjects.getNearest((String[])stringArray22).interact(lllllIIIll[lllllIIlIl[102]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[103])) && E.llIlIIlIllllI(E.co() ? 1 : 0)) {
                                if (E.llIlIIlIllllI(lllllllllllllllllIlIIllIIllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lllllllllllllllllIlIIllIIllIlIIl = new WorldPoint(lllllIIlIl[104], lllllIIlIl[84], lllllIIlIl[1]);
                                        if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIIl) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[105]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIIl);
                                            0;
                                            Time.sleepTicks((int)lllllIIlIl[0]);
                                            0;
                                        }
                                        if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIIl) ? 1 : 0)) {
                                            String[] stringArray23 = new String[lllllIIlIl[0]];
                                            stringArray23[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[106]];
                                            TileObjects.getNearest((String[])stringArray23).interact(lllllIIIll[lllllIIlIl[107]]);
                                            Time.sleepTicks((int)lllllIIlIl[8]);
                                            0;
                                        }
                                    }
                                    if (E.llIlIIlIlllII((lllllllllllllllllIlIIllIIllIlIIl = new WorldArea(lllllIIlIl[72], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(E.co() ? 1 : 0)) {
                                        lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[108], lllllIIlIl[109], lllllIIlIl[1]);
                                        if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[110]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                            0;
                                            Time.sleepTicks((int)lllllIIlIl[0]);
                                            0;
                                        }
                                        if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                            String[] stringArray24 = new String[lllllIIlIl[0]];
                                            stringArray24[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[111]];
                                            TileObjects.getNearest((String[])stringArray24).interact(lllllIIIll[lllllIIlIl[112]]);
                                            Time.sleepTicks((int)lllllIIlIl[8]);
                                            0;
                                        }
                                    }
                                    if (E.llIlIIlIlllII((lllllllllllllllllIlIIllIIllIlIII = new WorldArea(lllllIIlIl[70], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        lllllllllllllllllIlIIllIIllIIlll = new WorldPoint(lllllIIlIl[67], lllllIIlIl[113], lllllIIlIl[1]);
                                        if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIIlll) ? 1 : 0)) {
                                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[114]];
                                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIIlll);
                                            0;
                                            Time.sleepTicks((int)lllllIIlIl[0]);
                                            0;
                                        }
                                        if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIIlll) ? 1 : 0)) {
                                            String[] stringArray25 = new String[lllllIIlIl[0]];
                                            stringArray25[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[115]];
                                            TileObjects.getNearest((String[])stringArray25).interact(lllllIIIll[lllllIIlIl[116]]);
                                            Time.sleepTicks((int)lllllIIlIl[8]);
                                            0;
                                        }
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(E.co() ? 1 : 0)) {
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlllI) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[117]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlllI);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlllI) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[118]];
                                        String[] stringArray26 = new String[lllllIIlIl[0]];
                                        stringArray26[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[119]];
                                        TileObjects.getNearest((String[])stringArray26).interact(lllllIIIll[lllllIIlIl[120]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[103]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[121]))) {
                                if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIllIl) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[122]];
                                    Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIllIl);
                                    0;
                                    Time.sleepTicks((int)lllllIIlIl[0]);
                                    0;
                                }
                                if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIllIl) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[123]];
                                    String[] stringArray27 = new String[lllllIIlIl[0]];
                                    stringArray27[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[124]];
                                    TileObjects.getNearest((String[])stringArray27).interact(lllllIIIll[lllllIIlIl[125]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[103]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[126]))) {
                                lllllllllllllllllIlIIllIIllIlIIl = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[127], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[128]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        String[] stringArray28 = new String[lllllIIlIl[0]];
                                        stringArray28[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[129]];
                                        TileObjects.getNearest((String[])stringArray28).interact(lllllIIIll[lllllIIlIl[130]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[131], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[132]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        String[] stringArray29 = new String[lllllIIlIl[0]];
                                        stringArray29[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[133]];
                                        TileObjects.getNearest((String[])stringArray29).interact(lllllIIIll[lllllIIlIl[134]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[135]];
                                    String[] stringArray30 = new String[lllllIIlIl[0]];
                                    stringArray30[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[136]];
                                    TileObjects.getNearest((String[])stringArray30).interact(lllllIIIll[lllllIIlIl[137]]);
                                    Time.sleepTicks((int)lllllIIlIl[16]);
                                    0;
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[103]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[126]), lllllIIlIl[0])) {
                                lllllllllllllllllIlIIllIIllIlIIl = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[138], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[139]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        String[] stringArray31 = new String[lllllIIlIl[0]];
                                        stringArray31[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[140]];
                                        TileObjects.getNearest((String[])stringArray31).interact(lllllIIIll[lllllIIlIl[141]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[108], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[142]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        String[] stringArray32 = new String[lllllIIlIl[0]];
                                        stringArray32[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[143]];
                                        TileObjects.getNearest((String[])stringArray32).interact(lllllIIIll[lllllIIlIl[144]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlllI) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[145]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlllI);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlllI) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[146]];
                                        String[] stringArray33 = new String[lllllIIlIl[0]];
                                        stringArray33[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[147]];
                                        TileObjects.getNearest((String[])stringArray33).interact(lllllIIIll[lllllIIlIl[148]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                            }
                            if (E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[74])) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[80])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[75]), lllllIIlIl[0]) && E.llIlIIlIllllI(Vars.getBit((int)lllllIIlIl[103])) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[121]), lllllIIlIl[0]) && E.llIlIIllIIlII(Vars.getBit((int)lllllIIlIl[126]), lllllIIlIl[0])) {
                                lllllllllllllllllIlIIllIIllIlIIl = new WorldArea(lllllIIlIl[72], lllllIIlIl[71], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1]);
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[127], lllllIIlIl[66], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[149]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        String[] stringArray34 = new String[lllllIIlIl[0]];
                                        stringArray34[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[150]];
                                        TileObjects.getNearest((String[])stringArray34).interact(lllllIIIll[lllllIIlIl[151]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    lllllllllllllllllIlIIllIIllIlIII = new WorldPoint(lllllIIlIl[104], lllllIIlIl[152], lllllIIlIl[1]);
                                    if (E.llIlIIlIllllI(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[153]];
                                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIllIIllIlIII);
                                        0;
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                    }
                                    if (E.llIlIIlIlllII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIlIIllIIllIlIII) ? 1 : 0)) {
                                        Time.sleepTicks((int)lllllIIlIl[0]);
                                        0;
                                        String[] stringArray35 = new String[lllllIIlIl[0]];
                                        stringArray35[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[154]];
                                        TileObjects.getNearest((String[])stringArray35).interact(lllllIIIll[lllllIIlIl[155]]);
                                        Time.sleepTicks((int)lllllIIlIl[8]);
                                        0;
                                    }
                                }
                                if (E.llIlIIlIlllII((lllllllllllllllllIlIIllIIllIlIII = new WorldArea(lllllIIlIl[72], lllllIIlIl[69], lllllIIlIl[14], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && E.llIlIIlIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[156]];
                                    Time.sleepTicks((int)lllllIIlIl[0]);
                                    0;
                                    int[] nArray = new int[lllllIIlIl[0]];
                                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[157];
                                    TileObjects.getNearest((int[])nArray).interact(lllllIIIll[lllllIIlIl[158]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                                if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] nArray = new int[lllllIIlIl[0]];
                                    nArray[E.lllllIIlIl[1]] = lllllIIlIl[159];
                                    TileObjects.getNearest((int[])nArray).interact(lllllIIIll[lllllIIlIl[160]]);
                                    Time.sleepTicks((int)lllllIIlIl[8]);
                                    0;
                                }
                                if (E.llIlIIlIlllII((lllllllllllllllllIlIIllIIllIIlll = new WorldArea(lllllIIlIl[161], lllllIIlIl[162], lllllIIlIl[23], lllllIIlIl[14], lllllIIlIl[1])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] stringArray36 = new String[lllllIIlIl[0]];
                                    stringArray36[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[163]];
                                    if (E.llIlIIlIllllI(Inventory.contains((String[])stringArray36) ? 1 : 0)) {
                                        String[] stringArray37 = new String[lllllIIlIl[0]];
                                        stringArray37[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[164]];
                                        TileItems.getNearest((String[])stringArray37).interact(lllllIIIll[lllllIIlIl[165]]);
                                        Time.sleepTicks((int)lllllIIlIl[14]);
                                        0;
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
                        lllllllllllllllllIlIIllIIlllIlII = new WorldArea(lllllIIlIl[161], lllllIIlIl[162], lllllIIlIl[23], lllllIIlIl[14], lllllIIlIl[1]);
                        if (E.llIlIIlIlllII(lllllllllllllllllIlIIllIIlllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] nArray = new int[lllllIIlIl[0]];
                            nArray[E.lllllIIlIl[1]] = lllllIIlIl[159];
                            TileObjects.getNearest((int[])nArray).interact(lllllIIIll[lllllIIlIl[168]]);
                            Time.sleepTicks((int)lllllIIlIl[14]);
                            0;
                        }
                        if (E.llIlIIllIIIlI(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                            AccBuilderTempleTrek.c = lllllIIIll[lllllIIlIl[169]];
                            Movement.walkTo((WorldPoint)gY);
                            0;
                            Time.sleepTicks((int)lllllIIlIl[0]);
                            0;
                        }
                        if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                            lllllllllllllllllIlIIllIIlllIIll = TileObjects.getNearest(tileObject -> {
                                int n2;
                                if (E.llIlIIlIlllII(tileObject.getName().contains(lllllIIIll[lllllIIlIl[185]]) ? 1 : 0)) {
                                    String[] stringArray = new String[lllllIIlIl[0]];
                                    stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[186]];
                                    if (E.llIlIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0) && E.llIlIIllIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIlIl[21], lllllIIlIl[184], lllllIIlIl[3])), lllllIIlIl[3])) {
                                        n2 = lllllIIlIl[0];
                                        0;
                                        if (null == null) return n2 != 0;
                                        return ((0x55 ^ 0xE) & ~(0x61 ^ 0x3A)) != 0;
                                    }
                                }
                                n2 = lllllIIlIl[1];
                                return n2 != 0;
                            });
                            if (E.llIlIIlIlllll(lllllllllllllllllIlIIllIIlllIIll)) {
                                lllllllllllllllllIlIIllIIlllIIll.interact(lllllIIIll[lllllIIlIl[170]]);
                                Time.sleepTicks((int)lllllIIlIl[8]);
                                0;
                            }
                            if (E.llIlIIllIIllI(lllllllllllllllllIlIIllIIlllIIll)) {
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
                    0;
                    Time.sleepTicks((int)lllllIIlIl[0]);
                    0;
                }
                if (E.llIlIIllIIIll(Players.getLocal().getWorldLocation().distanceTo(gY), lllllIIlIl[10])) {
                    lllllllllllllllllIlIIllIIlllIlII = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (E.llIlIIlIlllII(tileObject.getName().contains(lllllIIIll[lllllIIlIl[182]]) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIIlIl[0]];
                            stringArray[E.lllllIIlIl[1]] = lllllIIIll[lllllIIlIl[183]];
                            if (E.llIlIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0) && E.llIlIIllIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lllllIIlIl[21], lllllIIlIl[184], lllllIIlIl[3])), lllllIIlIl[3])) {
                                n2 = lllllIIlIl[0];
                                0;
                                if (3 < (22 + 132 - 121 + 100 ^ 24 + 16 - -72 + 17)) return n2 != 0;
                                return ((0 ^ 0x5E ^ (0x2E ^ 0x4E)) & (0x11 ^ 0x76 ^ (0xD ^ 0x54) ^ -1)) != 0;
                            }
                        }
                        n2 = lllllIIlIl[1];
                        return n2 != 0;
                    });
                    if (E.llIlIIlIlllll(lllllllllllllllllIlIIllIIlllIlII)) {
                        lllllllllllllllllIlIIllIIlllIlII.interact(lllllIIIll[lllllIIlIl[173]]);
                        Time.sleepTicks((int)lllllIIlIl[8]);
                        0;
                    }
                    if (E.llIlIIllIIllI(lllllllllllllllllIlIIllIIlllIlII)) {
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
            d lllllllllllllllllIlIIllIIlIlllll;
            block13: {
                block12: {
                    block11: {
                        Object lllllllllllllllllIlIIllIIllIIIII;
                        int[] nArray = new int[lllllIIlIl[0]];
                        nArray[E.lllllIIlIl[1]] = lllllIIlIl[6];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(lllllIIlIl[6], lllllIIlIl[10], lllllIIlIl[175]);
                            bu.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[lllllIIlIl[0]];
                        nArray2[E.lllllIIlIl[1]] = lllllIIlIl[7];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllIlIIllIIllIIIII = new d(lllllIIlIl[7], lllllIIlIl[0], lllllIIlIl[175]);
                            bu.add((d)lllllllllllllllllIlIIllIIllIIIII);
                            0;
                        }
                        int[] nArray3 = new int[lllllIIlIl[0]];
                        nArray3[E.lllllIIlIl[1]] = lllllIIlIl[9];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllIlIIllIIllIIIII = new d(lllllIIlIl[9], lllllIIlIl[0], lllllIIlIl[175]);
                            bu.add((d)lllllllllllllllllIlIIllIIllIIIII);
                            0;
                        }
                        if (E.llIlIIlIllllI(Bank.contains((Predicate)(lllllllllllllllllIlIIllIIllIIIII = item -> item.getName().toLowerCase().contains(lllllIIIll[lllllIIlIl[181]]))) ? 1 : 0)) {
                            lllllllllllllllllIlIIllIIlIlllll = new d(lllllIIlIl[176], lllllIIlIl[14], lllllIIlIl[177]);
                            bu.add(lllllllllllllllllIlIIllIIlIlllll);
                            0;
                        }
                        int[] nArray4 = new int[lllllIIlIl[0]];
                        nArray4[E.lllllIIlIl[1]] = lllllIIlIl[12];
                        if (E.llIlIIlIllllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllIlIIllIIlIlllll = new d(lllllIIlIl[12], lllllIIlIl[4], i.bp);
                            bu.add(lllllllllllllllllIlIIllIIlIlllll);
                            0;
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
                    lllllllllllllllllIlIIllIIlIlllll = new d(lllllIIlIl[13], lllllIIlIl[10], lllllIIlIl[178]);
                    bu.add(lllllllllllllllllIlIIllIIlIlllll);
                    0;
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
            lllllllllllllllllIlIIllIIlIlllll = new d(lllllIIlIl[5], lllllIIlIl[57], lllllIIlIl[179]);
            bu.add(lllllllllllllllllIlIIllIIlIlllll);
            0;
        }
    }

    private static boolean llIlIIllIIllI(Object object) {
        return object == null;
    }

    private static String llIlIIlIIlIIl(String lllllllllllllllllIlIIllIIlIIlIIl, String lllllllllllllllllIlIIllIIlIIllIl) {
        lllllllllllllllllIlIIllIIlIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIllIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIllIIlIIllII = new StringBuilder();
        char[] lllllllllllllllllIlIIllIIlIIlIll = lllllllllllllllllIlIIllIIlIIllIl.toCharArray();
        int lllllllllllllllllIlIIllIIlIIlIlI = lllllIIlIl[1];
        char[] lllllllllllllllllIlIIllIIlIIIlII = lllllllllllllllllIlIIllIIlIIlIIl.toCharArray();
        int lllllllllllllllllIlIIllIIlIIIIll = lllllllllllllllllIlIIllIIlIIIlII.length;
        int lllllllllllllllllIlIIllIIlIIIIlI = lllllIIlIl[1];
        while (E.llIlIIlIlllIl(lllllllllllllllllIlIIllIIlIIIIlI, lllllllllllllllllIlIIllIIlIIIIll)) {
            char lllllllllllllllllIlIIllIIlIIllll = lllllllllllllllllIlIIllIIlIIIlII[lllllllllllllllllIlIIllIIlIIIIlI];
            lllllllllllllllllIlIIllIIlIIllII.append((char)(lllllllllllllllllIlIIllIIlIIllll ^ lllllllllllllllllIlIIllIIlIIlIll[lllllllllllllllllIlIIllIIlIIlIlI % lllllllllllllllllIlIIllIIlIIlIll.length]));
            0;
            ++lllllllllllllllllIlIIllIIlIIlIlI;
            ++lllllllllllllllllIlIIllIIlIIIIlI;
            0;
            if ((0xC5 ^ 0xA5 ^ (0x2C ^ 0x48)) > 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIllIIlIIllII);
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
            0;
            if (null != null) {
                return ((0x16 ^ 0x4A) & ~(0xED ^ 0xB1)) != 0;
            }
        } else {
            bl = lllllIIlIl[1];
        }
        return bl;
    }

    private static void llIlIIlIllIlI() {
        lllllIIlIl = new int[198];
        E.lllllIIlIl[0] = 1;
        E.lllllIIlIl[1] = (0x25 ^ 0x28) & ~(0xA7 ^ 0xAA);
        E.lllllIIlIl[2] = -(0xFFFFA1F7 & 0x7E19) & (0xFFFFF7DE & 0x3BB9);
        E.lllllIIlIl[3] = 2;
        E.lllllIIlIl[4] = 0x42 ^ 0x46;
        E.lllllIIlIl[5] = -(0xFFFFAB6D & 0x74BB) & (0xFFFFFFFF & 0x3F6F);
        E.lllllIIlIl[6] = 0xFFFFCFBF & 0x7CDF;
        E.lllllIIlIl[7] = 0xFFFFCFBA & 0x33FD;
        E.lllllIIlIl[8] = 3;
        E.lllllIIlIl[9] = 0xFFFF81B3 & 0x7F5D;
        E.lllllIIlIl[10] = 157 + 82 - 140 + 79 ^ 106 + 41 - 95 + 132;
        E.lllllIIlIl[11] = 0xFFFFCD93 & 0x337C;
        E.lllllIIlIl[12] = 0xFFFFB9D9 & 0x7777;
        E.lllllIIlIl[13] = -(0xFFFFA637 & 0x7FC9) & (0xFFFFAFFB & 0x777F);
        E.lllllIIlIl[14] = 0x49 ^ 0x4C;
        E.lllllIIlIl[15] = 83 + 91 - 34 + 26 ^ 25 + 5 - 6 + 124;
        E.lllllIIlIl[16] = 25 + 144 - 85 + 80 ^ 86 + 29 - -40 + 17;
        E.lllllIIlIl[17] = 0x4E ^ 0x48;
        E.lllllIIlIl[18] = 8 ^ 0xF;
        E.lllllIIlIl[19] = -(0xFFFFF3AA & 0x2EDF) & (0xFFFFFB9B & 0x27FF);
        E.lllllIIlIl[20] = 0x87 ^ 0x9A ^ (0x96 ^ 0x82);
        E.lllllIIlIl[21] = -(0xFFFFF77D & 0x399B) & (0xFFFFFFBD & 0x3D7E);
        E.lllllIIlIl[22] = -(0xFFFFFBEB & 0x16F7) & (0xFFFFFFFF & 0x1FFF);
        E.lllllIIlIl[23] = 0x4B ^ 0x79 ^ (0xB3 ^ 0x8A);
        E.lllllIIlIl[24] = (0xDB ^ 0x99) & ~(0xEA ^ 0xA8) ^ (0x45 ^ 0x49);
        E.lllllIIlIl[25] = 0x20 ^ 0x35 ^ (0x6A ^ 0x72);
        E.lllllIIlIl[26] = 0x5A ^ 0x45 ^ (0x10 ^ 1);
        E.lllllIIlIl[27] = 0x37 ^ 0x38;
        E.lllllIIlIl[28] = 0x73 ^ 0x63;
        E.lllllIIlIl[29] = 0x1F ^ 0xE;
        E.lllllIIlIl[30] = 38 + 111 - 41 + 28 ^ 19 + 108 - 15 + 42;
        E.lllllIIlIl[31] = 77 + 52 - 57 + 61 ^ 108 + 54 - 58 + 46;
        E.lllllIIlIl[32] = 0xDD ^ 0xAB ^ (0x23 ^ 0x41);
        E.lllllIIlIl[33] = 0x7F ^ 0x5E ^ (0x37 ^ 3);
        E.lllllIIlIl[34] = 0x2A ^ 0x3A ^ (0xA7 ^ 0xA1);
        E.lllllIIlIl[35] = 0x1F ^ 8;
        E.lllllIIlIl[36] = 153 + 38 - 72 + 104 ^ 197 + 162 - 212 + 52;
        E.lllllIIlIl[37] = 145 + 0 - 0 + 40 ^ 144 + 67 - 125 + 74;
        E.lllllIIlIl[38] = 0xDB ^ 0xC1;
        E.lllllIIlIl[39] = 0x9E ^ 0x85;
        E.lllllIIlIl[40] = 0x3C ^ 0x30 ^ (0x13 ^ 3);
        E.lllllIIlIl[41] = 0x5F ^ 0x42;
        E.lllllIIlIl[42] = 56 + 64 - 28 + 59 ^ 40 + 73 - 23 + 47;
        E.lllllIIlIl[43] = -(0xFFFFC33D & 0x7FDB) & (0xFFFFDFFB & 0x6F3F);
        E.lllllIIlIl[44] = 0xFFFFCF7F & 0x3DA7;
        E.lllllIIlIl[45] = -(0xFFFFF4F7 & 0x1B1A) & (0xFFFFDFB7 & 0x3D7F);
        E.lllllIIlIl[46] = 0xAE ^ 0xB1;
        E.lllllIIlIl[47] = 0x43 ^ 0x7B ^ (0xD ^ 0x15);
        E.lllllIIlIl[48] = 64 + 153 - 52 + 63 ^ 77 + 182 - 100 + 38;
        E.lllllIIlIl[49] = 0x5C ^ 0x7E;
        E.lllllIIlIl[50] = 0x34 ^ 0x17;
        E.lllllIIlIl[51] = 0x32 ^ 0x2E ^ (0x43 ^ 0x7B);
        E.lllllIIlIl[52] = 0xA3 ^ 0x86;
        E.lllllIIlIl[53] = 207 + 139 - 141 + 25 ^ 43 + 168 - 27 + 8;
        E.lllllIIlIl[54] = 0xFFFF8D37 & 0x7EDA;
        E.lllllIIlIl[55] = 0xFFFFEDFB & 0x1F1D;
        E.lllllIIlIl[56] = 30 + 69 - 12 + 41 ^ 102 + 116 - 200 + 149;
        E.lllllIIlIl[57] = 0xBD ^ 0xC0 ^ (0xEE ^ 0xBB);
        E.lllllIIlIl[58] = 0xAC ^ 0x85;
        E.lllllIIlIl[59] = 0x78 ^ 0x36 ^ (0xC0 ^ 0xA4);
        E.lllllIIlIl[60] = 116 + 77 - 180 + 129 ^ 107 + 12 - 19 + 65;
        E.lllllIIlIl[61] = 0xFFFFAFDB & 0x7636;
        E.lllllIIlIl[62] = -(0xFFFFFC9E & 0x73F5) & (0xFFFFFEBF & 0x7DFF);
        E.lllllIIlIl[63] = -(0xFFFF9FCA & 0x78FD) & (0xFFFFFEFF & 0x3FDF);
        E.lllllIIlIl[64] = 0xFFFF8C2F & 0x7FF6;
        E.lllllIIlIl[65] = 0xFFFFBEA1 & 0x677F;
        E.lllllIIlIl[66] = -(0xFFFFA96F & 0x5FDB) & (0xFFFFAFEF & 0x7F7F);
        E.lllllIIlIl[67] = -(0xFFFFE7E7 & 0x5BBF) & (0xFFFFEFBF & 0x5FFF);
        E.lllllIIlIl[68] = 0xFFFFAE61 & 0x5DBF;
        E.lllllIIlIl[69] = 0xFFFFF77F & 0x2E9E;
        E.lllllIIlIl[70] = 0xFFFFEF9F & 0x1C77;
        E.lllllIIlIl[71] = -(0xFFFFFFED & 0x993) & (0xFFFFFFAB & 0x2FF7);
        E.lllllIIlIl[72] = -(0xFFFFCBC3 & 0x75FE) & (0xFFFFCFDF & 0x7DFD);
        E.lllllIIlIl[73] = 0xFFFFA697 & 0x7F79;
        E.lllllIIlIl[74] = -(0xFFFFABDE & 0x7C23) & (0xFFFFEFFD & 0x3EFF);
        E.lllllIIlIl[75] = 0xFFFF9FFF & 0x66FF;
        E.lllllIIlIl[76] = 0x3A ^ 0x16;
        E.lllllIIlIl[77] = 0x5C ^ 0x71;
        E.lllllIIlIl[78] = 0x96 ^ 0xB8;
        E.lllllIIlIl[79] = 0x4F ^ 8 ^ (0x37 ^ 0x5F);
        E.lllllIIlIl[80] = -(0xFFFFE3AF & 0x7D53) & (0xFFFFF7FF & 0x6FFF);
        E.lllllIIlIl[81] = 0x39 ^ 0x71 ^ (0xFC ^ 0x84);
        E.lllllIIlIl[82] = 0xAD ^ 0xC2 ^ (0xE1 ^ 0xBF);
        E.lllllIIlIl[83] = 0xBC ^ 0x8B ^ (0x5A ^ 0x5E);
        E.lllllIIlIl[84] = 0xFFFFE77D & 0x3E9F;
        E.lllllIIlIl[85] = 145 + 114 - 230 + 125 ^ 171 + 76 - 213 + 140;
        E.lllllIIlIl[86] = 0x55 ^ 0x60;
        E.lllllIIlIl[87] = 8 ^ 0x29 ^ (0x99 ^ 0x8E);
        E.lllllIIlIl[88] = 0x4D ^ 0x7A;
        E.lllllIIlIl[89] = 0x49 ^ 0x4C ^ (0x68 ^ 0x55);
        E.lllllIIlIl[90] = 0x96 ^ 0xAF;
        E.lllllIIlIl[91] = 0xFFFFFF1F & 0x26FF;
        E.lllllIIlIl[92] = 0x72 ^ 0x48;
        E.lllllIIlIl[93] = 3 ^ 0xA ^ (0xA5 ^ 0x97);
        E.lllllIIlIl[94] = 7 ^ 0x3B;
        E.lllllIIlIl[95] = 122 + 85 - 106 + 37 ^ 109 + 145 - 142 + 71;
        E.lllllIIlIl[96] = 0x11 ^ 0x2F;
        E.lllllIIlIl[97] = 0x37 ^ 8;
        E.lllllIIlIl[98] = 39 + 65 - 9 + 160 ^ 29 + 165 - 65 + 62;
        E.lllllIIlIl[99] = 0x74 ^ 0x4D ^ (0xC5 ^ 0xBD);
        E.lllllIIlIl[100] = 0x80 ^ 0xA8 ^ (0x3E ^ 0x54);
        E.lllllIIlIl[101] = 0xD8 ^ 0x97 ^ (0xA3 ^ 0xAF);
        E.lllllIIlIl[102] = 0x8B ^ 0xA2 ^ (0x4A ^ 0x27);
        E.lllllIIlIl[103] = 0xFFFF8774 & 0x7F8B;
        E.lllllIIlIl[104] = -(0xFFFFE305 & 0x1DFB) & (0xFFFF8D9E & 0x7F7F);
        E.lllllIIlIl[105] = 0xE5 ^ 0xA0;
        E.lllllIIlIl[106] = 0xF ^ 0x2C ^ (0x2B ^ 0x4E);
        E.lllllIIlIl[107] = 0xD ^ 0x24 ^ (0x4C ^ 0x22);
        E.lllllIIlIl[108] = -(0xFFFFF3F3 & 0x5FCF) & (0xFFFFDFFF & 0x7FDF);
        E.lllllIIlIl[109] = 0xFFFFAFA4 & 0x767B;
        E.lllllIIlIl[110] = 0x37 ^ 0x7F;
        E.lllllIIlIl[111] = 6 ^ 0x17 ^ (0x1A ^ 0x42);
        E.lllllIIlIl[112] = 133 + 110 - 230 + 186 ^ 75 + 19 - -35 + 12;
        E.lllllIIlIl[113] = -(0xFFFFF7F3 & 0x195E) & (0xFFFFFFF7 & 0x377B);
        E.lllllIIlIl[114] = 0xE0 ^ 0xAB;
        E.lllllIIlIl[115] = 0x33 ^ 0x5B ^ (0x22 ^ 6);
        E.lllllIIlIl[116] = 0x7E ^ 0x33;
        E.lllllIIlIl[117] = 0x4F ^ 0x75 ^ (0xB2 ^ 0xC6);
        E.lllllIIlIl[118] = 0x67 ^ 0x28;
        E.lllllIIlIl[119] = 0x6E ^ 0x3E;
        E.lllllIIlIl[120] = 0x7F ^ 0x40 ^ (0xAE ^ 0xC0);
        E.lllllIIlIl[121] = -(0xFFFFF87F & 0xFEF) & (0xFFFFBF6F & 0x4FFF);
        E.lllllIIlIl[122] = 0xD ^ 0xB ^ (0xD ^ 0x59);
        E.lllllIIlIl[123] = 0x17 ^ 0x44;
        E.lllllIIlIl[124] = 0xD4 ^ 0xA4 ^ (0xBB ^ 0x9F);
        E.lllllIIlIl[125] = 9 + 189 - 65 + 64 ^ 40 + 105 - 65 + 64;
        E.lllllIIlIl[126] = -(0xFFFFFE2B & 0x69D6) & (0xFFFFFFFF & 0x6EFF);
        E.lllllIIlIl[127] = -(0xFFFFF357 & 0x6EED) & (0xFFFFEEDF & 0x7F7F);
        E.lllllIIlIl[128] = 0xF0 ^ 0xA6;
        E.lllllIIlIl[129] = 0x6E ^ 0x28 ^ (0x15 ^ 4);
        E.lllllIIlIl[130] = 0x98 ^ 0xC0;
        E.lllllIIlIl[131] = 0xFFFFFC77 & 0xFA8;
        E.lllllIIlIl[132] = 0xE ^ 0x69 ^ (0x3F ^ 1);
        E.lllllIIlIl[133] = 0x16 ^ 0x4C;
        E.lllllIIlIl[134] = 6 ^ 0x5D;
        E.lllllIIlIl[135] = 52 + 70 - -8 + 76 ^ 21 + 119 - 125 + 131;
        E.lllllIIlIl[136] = 0x51 ^ 0x34 ^ (0x45 ^ 0x7D);
        E.lllllIIlIl[137] = 0x10 ^ 0x4E;
        E.lllllIIlIl[138] = -(0xFFFFB73E & 0x7BCF) & (0xFFFFFFFF & 0x3F2F);
        E.lllllIIlIl[139] = 0x73 ^ 0x2C;
        E.lllllIIlIl[140] = 0xDC ^ 0xBC;
        E.lllllIIlIl[141] = 22 + 192 - 180 + 180 ^ 103 + 101 - 99 + 78;
        E.lllllIIlIl[142] = 0xFD ^ 0x9F;
        E.lllllIIlIl[143] = 71 + 157 - 98 + 36 ^ 136 + 136 - 270 + 195;
        E.lllllIIlIl[144] = 227 + 148 - 227 + 89 ^ 93 + 63 - 40 + 21;
        E.lllllIIlIl[145] = 0x59 ^ 0x30 ^ (0x26 ^ 0x2A);
        E.lllllIIlIl[146] = 0xA ^ 0x6C;
        E.lllllIIlIl[147] = 0x15 ^ 0x38 ^ (0x67 ^ 0x2D);
        E.lllllIIlIl[148] = 0xC6 ^ 0x9D ^ (0x59 ^ 0x6A);
        E.lllllIIlIl[149] = 0x44 ^ 0x66 ^ (0x8F ^ 0xC4);
        E.lllllIIlIl[150] = 187 + 193 - 257 + 76 ^ 84 + 144 - 136 + 81;
        E.lllllIIlIl[151] = 0x74 ^ 0x1F;
        E.lllllIIlIl[152] = 0xFFFFAFF4 & 0x762F;
        E.lllllIIlIl[153] = 0x38 ^ 0x54;
        E.lllllIIlIl[154] = 231 + 209 - 253 + 58 ^ 92 + 47 - 49 + 62;
        E.lllllIIlIl[155] = 0xE0 ^ 0x8C ^ 2;
        E.lllllIIlIl[156] = 83 + 113 - 96 + 143 ^ 134 + 70 - 194 + 146;
        E.lllllIIlIl[157] = 123 + 77 - 88 + 33;
        E.lllllIIlIl[158] = 107 + 28 - 28 + 86 ^ 69 + 93 - 135 + 150;
        E.lllllIIlIl[159] = 20 + 137 - 23 + 7;
        E.lllllIIlIl[160] = 0xED ^ 0x9C;
        E.lllllIIlIl[161] = 0xFFFF8DF1 & 0x7E1F;
        E.lllllIIlIl[162] = 0xFFFFBE79 & 0x679F;
        E.lllllIIlIl[163] = 0x72 ^ 0;
        E.lllllIIlIl[164] = 0xB6 ^ 0x85 ^ (0x44 ^ 4);
        E.lllllIIlIl[165] = 0x38 ^ 0x24 ^ (0x61 ^ 9);
        E.lllllIIlIl[166] = 0x27 ^ 0x52;
        E.lllllIIlIl[167] = 0xF3 ^ 0x85;
        E.lllllIIlIl[168] = 45 + 94 - -60 + 35 ^ 65 + 144 - 146 + 94;
        E.lllllIIlIl[169] = 0x14 ^ 0x6C;
        E.lllllIIlIl[170] = 0xCB ^ 0xB2;
        E.lllllIIlIl[171] = 12 + 153 - -32 + 29 ^ 84 + 118 - 152 + 102;
        E.lllllIIlIl[172] = 0xFE ^ 0x85;
        E.lllllIIlIl[173] = 222 + 159 - 319 + 165 ^ 151 + 31 - 170 + 147;
        E.lllllIIlIl[174] = 0xBC ^ 0xC1;
        E.lllllIIlIl[175] = -(0x60 ^ 0x54) & (0xFFFFBE77 & 0x65BF);
        E.lllllIIlIl[176] = -(0xFFFFB12C & 0x4FD7) & (0xFFFFEFEF & 0x3FDF);
        E.lllllIIlIl[177] = 0xFFFFFBFA & 0x65AD;
        E.lllllIIlIl[178] = -(0xFFFFF335 & 0x7CCE) & (0xFFFFFBBF & 0x756F);
        E.lllllIIlIl[179] = 0xFFFFF755 & 0xDBE;
        E.lllllIIlIl[180] = 0x2D ^ 0x53;
        E.lllllIIlIl[181] = 16 + 35 - 38 + 114;
        E.lllllIIlIl[182] = 103 + 77 - 175 + 123;
        E.lllllIIlIl[183] = (0x12 ^ 0x5C) + (0xA3 ^ 0x85) - (0x4C ^ 2) + (0xF6 ^ 0xAD);
        E.lllllIIlIl[184] = -(0xFFFFB1FF & 0x6E4B) & (0xFFFFAD7F & 0x7FEF);
        E.lllllIIlIl[185] = (0x3C ^ 0x11) + ((0x7C ^ 0x34) & ~(0x40 ^ 8)) - (0x4E ^ 0x50) + (0x60 ^ 0x13);
        E.lllllIIlIl[186] = 55 + 15 - 48 + 109;
        E.lllllIIlIl[187] = -(0xFFFFCEFF & 0x739F) & (0xFFFFDF9F & 0x6FFF);
        E.lllllIIlIl[188] = 0xFFFFBFDF & 0x4C2F;
        E.lllllIIlIl[189] = 0xFFFFED77 & 0x1FA8;
        E.lllllIIlIl[190] = 0xFFFFBD49 & 0x4FBE;
        E.lllllIIlIl[191] = 0xFFFF8D7F & 0x7E96;
        E.lllllIIlIl[192] = -(0xFFFFFAEF & 0x6771) & (0xFFFFFF7F & 0x6FFF);
        E.lllllIIlIl[193] = 32 + 119 - 55 + 36;
        E.lllllIIlIl[194] = 44 + 118 - 136 + 107;
        E.lllllIIlIl[195] = 71 + 89 - 109 + 83;
        E.lllllIIlIl[196] = 0xFFFFA63F & 0x7FCF;
        E.lllllIIlIl[197] = (0x2E ^ 0x17) + (0x72 ^ 0x5A) - (0x42 ^ 8) + (0x51 ^ 0x21);
    }

    private static String llIlIIlIIlIll(String lllllllllllllllllIlIIllIIIlIlIlI, String lllllllllllllllllIlIIllIIIlIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIllIIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIllIIIlIlIll.getBytes(StandardCharsets.UTF_8)), lllllIIlIl[16]), "DES");
            Cipher lllllllllllllllllIlIIllIIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIllIIIlIlllI.init(lllllIIlIl[3], lllllllllllllllllIlIIllIIIlIllll);
            return new String(lllllllllllllllllIlIIllIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIllIIIlIllIl) {
            lllllllllllllllllIlIIllIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIllllI(int n2) {
        return n2 == 0;
    }

    @Override
    public int T() {
        try {
            E.cn();
            0;
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
            0;
            if (1 == 2) {
                return ((123 + 115 - 69 + 81 ^ 82 + 162 - 238 + 169) & (122 + 137 - 233 + 169 ^ 37 + 73 - 21 + 61 ^ -1)) != 0;
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
        void lllllllllllllllllIlIIllIIllIIlII;
        int[] nArray = new int[lllllIIlIl[4]];
        nArray[E.lllllIIlIl[1]] = lllllIIlIl[5];
        nArray[E.lllllIIlIl[0]] = lllllIIlIl[6];
        nArray[E.lllllIIlIl[3]] = lllllIIlIl[7];
        nArray[E.lllllIIlIl[8]] = lllllIIlIl[9];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIIllIIllIIIll = lllllIIlIl[1];
        while (E.llIlIIlIlllIl(lllllllllllllllllIlIIllIIllIIIll, ((void)lllllllllllllllllIlIIllIIllIIlII).length)) {
            int[] nArray3 = new int[lllllIIlIl[0]];
            nArray3[E.lllllIIlIl[1]] = lllllllllllllllllIlIIllIIllIIlII[lllllllllllllllllIlIIllIIllIIIll];
            if (E.llIlIIlIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllllIIlIl[1];
            }
            ++lllllllllllllllllIlIIllIIllIIIll;
            0;
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

