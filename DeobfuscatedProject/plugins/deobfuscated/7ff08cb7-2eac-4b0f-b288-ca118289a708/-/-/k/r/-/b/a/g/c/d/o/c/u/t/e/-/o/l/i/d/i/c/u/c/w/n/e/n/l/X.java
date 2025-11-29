/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.as;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.f;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.g;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class X
implements ab {
    private static final /* synthetic */ WorldPoint lF;
    public static /* synthetic */ boolean bv;
    private static final /* synthetic */ WorldPoint lE;
    static /* synthetic */ int cI;
    public static final /* synthetic */ String[] lD;
    public static /* synthetic */ List<d> bx;
    private static final /* synthetic */ WorldPoint lH;
    private static /* synthetic */ String[] lllIlllII;
    static /* synthetic */ boolean dl;
    static /* synthetic */ int dk;
    private static /* synthetic */ int[] lllIlllll;
    private static final /* synthetic */ WorldPoint lG;

    private static void llIIlIllIIIl() {
        lllIlllII = new String[lllIlllll[74]];
        X.lllIlllII[X.lllIlllll[0]] = X."Buying items";
        X.lllIlllII[X.lllIlllll[1]] = X."Finished buying items, switching back to quest";
        X.lllIlllII[X.lllIlllll[3]] = X."Drink";
        X.lllIlllII[X.lllIlllll[5]] = X."Eat";
        X.lllIlllII[X.lllIlllll[7]] = X."Nav to bank";
        X.lllIlllII[X.lllIlllll[8]] = X."Handling banking";
        X.lllIlllII[X.lllIlllll[14]] = X."We are missing quest supplies, switching to BUYING";
        X.lllIlllII[X.lllIlllll[20]] = X."Father Aereck";
        X.lllIlllII[X.lllIlllll[18]] = X."Nav to start";
        X.lllIlllII[X.lllIlllll[21]] = X."Starting quest";
        X.lllIlllII[X.lllIlllll[15]] = X."Father Aereck";
        X.lllIlllII[X.lllIlllll[19]] = X."Nav to necklace guy";
        X.lllIlllII[X.lllIlllll[22]] = X."Interacting npc";
        X.lllIlllII[X.lllIlllll[23]] = X."Door";
        X.lllIlllII[X.lllIlllll[24]] = X."Open";
        X.lllIlllII[X.lllIlllll[25]] = X."Open";
        X.lllIlllII[X.lllIlllll[26]] = X."Father Urhney";
        X.lllIlllII[X.lllIlllll[28]] = X."Wear";
        X.lllIlllII[X.lllIlllll[29]] = X."Nav to coffin";
        X.lllIlllII[X.lllIlllll[30]] = X."Handling coffin";
        X.lllIlllII[X.lllIlllll[31]] = X."Restless ghost";
        X.lllIlllII[X.lllIlllll[32]] = X."Restless ghost";
        X.lllIlllII[X.lllIlllll[33]] = X."Coffin";
        X.lllIlllII[X.lllIlllll[34]] = X."Open";
        X.lllIlllII[X.lllIlllll[35]] = X."Nav to skull";
        X.lllIlllII[X.lllIlllll[36]] = X."Getting skull";
        X.lllIlllII[X.lllIlllll[37]] = X."Altar";
        X.lllIlllII[X.lllIlllll[38]] = X."Search";
        X.lllIlllII[X.lllIlllll[39]] = X."Wear";
        X.lllIlllII[X.lllIlllll[40]] = X."Nav to coffin";
        X.lllIlllII[X.lllIlllll[41]] = X."Handling coffin";
        X.lllIlllII[X.lllIlllll[42]] = X."Coffin";
        X.lllIlllII[X.lllIlllll[43]] = X."Open";
        X.lllIlllII[X.lllIlllll[44]] = X."Open";
        X.lllIlllII[X.lllIlllll[45]] = X."Ghost's skull";
        X.lllIlllII[X.lllIlllll[52]] = X."Restless ghost quest";
        X.lllIlllII[X.lllIlllll[53]] = X."ring of wealth (";
        X.lllIlllII[X.lllIlllll[54]] = X."Ok, I'm up for an adventure.";
        X.lllIlllII[X.lllIlllll[55]] = X."A glass of your finest ale please.";
        X.lllIlllII[X.lllIlllll[56]] = X."Morgan needs your help!";
        X.lllIlllII[X.lllIlllll[57]] = X."Yes.";
        X.lllIlllII[X.lllIlllll[58]] = X."I'm looking for a quest!";
        X.lllIlllII[X.lllIlllll[59]] = X."Ok, let me help then.";
        X.lllIlllII[X.lllIlllll[60]] = X."Father Aereck sent me to talk to you.";
        X.lllIlllII[X.lllIlllll[61]] = X."He's got a ghost haunting his graveyard.";
        X.lllIlllII[X.lllIlllll[62]] = X."Yep, now tell me what the problem is.";
        X.lllIlllII[X.lllIlllll[63]] = X."Sure.";
        X.lllIlllII[X.lllIlllll[64]] = X."I'm wearing an amulet of ghost speak!";
        X.lllIlllII[X.lllIlllll[65]] = X."Yes, I'm sure.";
        X.lllIlllII[X.lllIlllll[66]] = X."How can I help?";
    }

    private static boolean llIIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static String llIIlIlIllIl(String llIIllIlIlIIl, String llIIllIlIIllI) {
        try {
            SecretKeySpec llIIllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIlIIllI.getBytes(StandardCharsets.UTF_8)), lllIlllll[18]), "DES");
            Cipher llIIllIlIlIll = Cipher.getInstance("DES");
            llIIllIlIlIll.init(lllIlllll[3], llIIllIlIllII);
            return new String(llIIllIlIlIll.doFinal(Base64.getDecoder().decode(llIIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIlIlIlI) {
            llIIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIII(int n2) {
        return n2 == 0;
    }

    private static String llIIlIlIllll(String llIIllIllIlII, String llIIllIllIIll) {
        try {
            SecretKeySpec llIIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIlllIII = Cipher.getInstance("Blowfish");
            llIIllIlllIII.init(lllIlllll[3], llIIllIlllIIl);
            return new String(llIIllIlllIII.doFinal(Base64.getDecoder().decode(llIIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllIllIlll) {
            llIIllIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIlI(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        int[] nArray = new int[lllIlllll[1]];
        nArray[X.lllIlllll[0]] = lllIlllll[11];
        if (X.llIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0) && (!X.llIIllIIlIII(Inventory.contains((int[])f.aY) ? 1 : 0) || X.llIIllIIIllI(Equipment.contains((int[])f.aY) ? 1 : 0)) && X.llIIllIIIllI(Inventory.contains((int[])f.bc) ? 1 : 0)) {
            int[] nArray2 = new int[lllIlllll[1]];
            nArray2[X.lllIlllll[0]] = lllIlllll[13];
            if (X.llIIllIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lllIlllll[1]];
                nArray3[X.lllIlllll[0]] = lllIlllll[4];
                if (X.llIIllIIIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    n2 = lllIlllll[1];
                    0;
                    if (((0x2B ^ 2) & ~(0x26 ^ 0xF)) == 0) return n2 != 0;
                    return ((0xFE ^ 0xC0) & ~(0xB5 ^ 0x8B)) != 0;
                }
            }
        }
        n2 = lllIlllll[0];
        return n2 != 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (X.llIIllIlIIII(e.j(lllIlllll[6]), lllIlllll[8])) {
            bl = lllIlllll[1];
            0;
            if (3 <= 0) {
                return ((0xC1 ^ 0x91) & ~(0xD3 ^ 0x83)) != 0;
            }
        } else {
            bl = lllIlllll[0];
        }
        return bl;
    }

    public static void dJ() {
        if (X.llIIllIIIllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIlllII[lllIlllll[0]];
            b.a(bx);
            if (X.llIIllIIIlll(bx.size(), lllIlllll[1])) {
                System.out.println(lllIlllII[lllIlllll[1]]);
                bv = lllIlllll[0];
            }
        }
        if (X.llIIllIIlIII(bv ? 1 : 0)) {
            NPC llIIlllIIIlII;
            BankLocation llIIlllIIIlIl;
            if (X.llIIllIIIllI(Inventory.contains((int[])f.bc) ? 1 : 0) && X.llIIllIIIlll(Movement.getRunEnergy(), lllIlllll[2])) {
                Inventory.getFirst((int[])f.bc).interact(lllIlllII[lllIlllll[3]]);
                Time.sleepTicks((int)lllIlllll[1]);
                0;
            }
            if (X.llIIllIIlIIl(X.llIIllIIIlIl(e.w(), 70.0))) {
                int[] nArray = new int[lllIlllll[1]];
                nArray[X.lllIlllll[0]] = lllIlllll[4];
                if (X.llIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIlllll[1]];
                    nArray2[X.lllIlllll[0]] = lllIlllll[4];
                    Inventory.getFirst((int[])nArray2).interact(lllIlllII[lllIlllll[5]]);
                }
            }
            if (X.llIIllIIlIII(Movement.isRunEnabled() ? 1 : 0) && X.llIIllIIlIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (X.llIIllIIlIII(X.an() ? 1 : 0) && X.llIIllIIIlll(e.j(lllIlllll[6]), lllIlllll[1])) {
                llIIlllIIIlIl = BankLocation.getNearest();
                if (X.llIIllIIlIll(llIIlllIIIlIl) && X.llIIllIIlIII(llIIlllIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[7]];
                    a.a(llIIlllIIIlIl);
                    Time.sleepTicks((int)lllIlllll[3]);
                    0;
                }
                if (X.llIIllIIlIll(llIIlllIIIlIl) && X.llIIllIIIllI(llIIlllIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[8]];
                    if (X.llIIllIIlIII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlllll[9]);
                        0;
                    }
                    if (X.llIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (X.llIIllIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIlllll[7]);
                            0;
                        }
                        if (X.llIIllIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lllIlllll[3]);
                            0;
                        }
                        int[] nArray = new int[lllIlllll[8]];
                        nArray[X.lllIlllll[0]] = lllIlllll[10];
                        nArray[X.lllIlllll[1]] = lllIlllll[11];
                        nArray[X.lllIlllll[3]] = lllIlllll[12];
                        nArray[X.lllIlllll[5]] = lllIlllll[13];
                        nArray[X.lllIlllll[7]] = lllIlllll[4];
                        if (X.llIIllIIlIII(e.d(nArray) ? 1 : 0)) {
                            X.Q();
                            System.out.println(lllIlllII[lllIlllll[14]]);
                            bv = lllIlllll[1];
                            return;
                        }
                        Bank.withdraw((int)lllIlllll[11], (int)lllIlllll[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlllll[1]);
                        0;
                        Bank.withdraw((int)lllIlllll[13], (int)lllIlllll[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlllll[1]);
                        0;
                        Bank.withdraw((int)lllIlllll[10], (int)lllIlllll[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lllIlllll[1]);
                        0;
                        a.b(f.bc, lllIlllll[1]);
                        a.a(lllIlllll[4], lllIlllll[15]);
                        a.b(f.bm, lllIlllll[1]);
                    }
                }
            }
            if (X.llIIllIIIllI(X.an() ? 1 : 0) && X.llIIllIIIlll(e.j(lllIlllll[6]), lllIlllll[1])) {
                llIIlllIIIlIl = new WorldArea(lllIlllll[16], lllIlllll[17], lllIlllll[18], lllIlllll[19], lllIlllll[0]);
                String[] stringArray = new String[lllIlllll[1]];
                stringArray[X.lllIlllll[0]] = lllIlllII[lllIlllll[20]];
                llIIlllIIIlII = NPCs.getNearest((String[])stringArray);
                if (X.llIIllIIllII(llIIlllIIIlII) && X.llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lE), lllIlllll[5]) && X.llIIllIIlIII(AccBuilderGWD.d ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[18]];
                    if (X.llIIllIIIlll(cI, lllIlllll[1])) {
                        e.x();
                        cI += lllIlllll[1];
                    }
                    Movement.walkTo((WorldPoint)lE);
                    0;
                    Time.sleepTicks((int)lllIlllll[1]);
                    0;
                }
                if (X.llIIllIIlIll(llIIlllIIIlII)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[21]];
                    g.a(lllIlllII[lllIlllll[15]], lD, lllIlllll[1]);
                }
            }
            if (X.llIIllIIlllI(e.j(lllIlllll[6]), lllIlllll[1])) {
                if (X.llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lF), lllIlllll[14])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[19]];
                    Movement.walkTo((WorldPoint)lF);
                    0;
                    Time.sleepTicks((int)lllIlllll[1]);
                    0;
                }
                if (X.llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lF), lllIlllll[14])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[22]];
                    String[] stringArray = new String[lllIlllll[1]];
                    stringArray[X.lllIlllll[0]] = lllIlllII[lllIlllll[23]];
                    llIIlllIIIlIl = TileObjects.getNearest((String[])stringArray);
                    if (X.llIIllIIlIll(llIIlllIIIlIl)) {
                        String[] stringArray2 = new String[lllIlllll[1]];
                        stringArray2[X.lllIlllll[0]] = lllIlllII[lllIlllll[24]];
                        if (X.llIIllIIIllI(llIIlllIIIlIl.hasAction(stringArray2) ? 1 : 0)) {
                            llIIlllIIIlIl.interact(lllIlllII[lllIlllll[25]]);
                            Time.sleepTicks((int)lllIlllll[8]);
                            0;
                        }
                    }
                    g.a(lllIlllII[lllIlllll[26]], lD);
                }
            }
            if (X.llIIllIIlllI(e.j(lllIlllll[6]), lllIlllll[3])) {
                if (X.llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    int[] nArray = new int[lllIlllll[1]];
                    nArray[X.lllIlllll[0]] = lllIlllll[27];
                    if (X.llIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lllIlllll[1]];
                        nArray3[X.lllIlllll[0]] = lllIlllll[27];
                        Inventory.getFirst((int[])nArray3).interact(lllIlllII[lllIlllll[28]]);
                        Time.sleepTicks((int)lllIlllll[1]);
                        0;
                    }
                    AccBuilderGWD.c = lllIlllII[lllIlllll[29]];
                    Movement.walkTo((WorldPoint)lG);
                    0;
                    Time.sleepTicks((int)lllIlllll[1]);
                    0;
                }
                if (X.llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[30]];
                    String[] stringArray = new String[lllIlllll[1]];
                    stringArray[X.lllIlllll[0]] = lllIlllII[lllIlllll[31]];
                    llIIlllIIIlIl = NPCs.getNearest((String[])stringArray);
                    if (X.llIIllIIlIll(llIIlllIIIlIl)) {
                        g.a(lllIlllII[lllIlllll[32]], lD);
                    }
                    if (X.llIIllIIllII(llIIlllIIIlIl)) {
                        String[] stringArray3 = new String[lllIlllll[1]];
                        stringArray3[X.lllIlllll[0]] = lllIlllII[lllIlllll[33]];
                        TileObjects.getNearest((String[])stringArray3).interact(lllIlllII[lllIlllll[34]]);
                        Time.sleepTicks((int)lllIlllll[3]);
                        0;
                    }
                }
            }
            if (X.llIIllIIlllI(e.j(lllIlllll[6]), lllIlllll[5])) {
                dk = lllIlllll[0];
                if (X.llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lH), lllIlllll[5])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[35]];
                    Movement.walkTo((WorldPoint)lH);
                    0;
                    Time.sleepTicks((int)lllIlllll[1]);
                    0;
                }
                if (X.llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lH), lllIlllll[5])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[36]];
                    String[] stringArray = new String[lllIlllll[1]];
                    stringArray[X.lllIlllll[0]] = lllIlllII[lllIlllll[37]];
                    llIIlllIIIlIl = TileObjects.getNearest((String[])stringArray);
                    if (X.llIIllIIlIll(llIIlllIIIlIl)) {
                        llIIlllIIIlIl.interact(lllIlllII[lllIlllll[38]]);
                    }
                }
            }
            if (X.llIIllIIlllI(e.j(lllIlllll[6]), lllIlllll[7])) {
                if (X.llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    int[] nArray = new int[lllIlllll[1]];
                    nArray[X.lllIlllll[0]] = lllIlllll[27];
                    if (X.llIIllIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[lllIlllll[1]];
                        nArray4[X.lllIlllll[0]] = lllIlllll[27];
                        Inventory.getFirst((int[])nArray4).interact(lllIlllII[lllIlllll[39]]);
                        Time.sleepTicks((int)lllIlllll[1]);
                        0;
                    }
                    AccBuilderGWD.c = lllIlllII[lllIlllll[40]];
                    Movement.walkTo((WorldPoint)lG);
                    0;
                    Time.sleepTicks((int)lllIlllll[1]);
                    0;
                }
                if (X.llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[41]];
                    String[] stringArray = new String[lllIlllll[1]];
                    stringArray[X.lllIlllll[0]] = lllIlllII[lllIlllll[42]];
                    llIIlllIIIlIl = TileObjects.getNearest((String[])stringArray);
                    if (X.llIIllIIlIll(llIIlllIIIlIl)) {
                        String[] stringArray4 = new String[lllIlllll[1]];
                        stringArray4[X.lllIlllll[0]] = lllIlllII[lllIlllll[43]];
                        if (X.llIIllIIIllI(llIIlllIIIlIl.hasAction(stringArray4) ? 1 : 0)) {
                            llIIlllIIIlIl.interact(lllIlllII[lllIlllll[44]]);
                            Time.sleepTicks((int)lllIlllll[3]);
                            0;
                        }
                        String[] stringArray5 = new String[lllIlllll[1]];
                        stringArray5[X.lllIlllll[0]] = lllIlllII[lllIlllll[45]];
                        llIIlllIIIlII = Inventory.getFirst((String[])stringArray5);
                        if (X.llIIllIIlIll(llIIlllIIIlII)) {
                            if (X.llIIllIIIlll(dk, lllIlllll[1])) {
                                as.pP += lllIlllll[1];
                                as.u(AccBuilderGWD.m);
                                dk += lllIlllll[1];
                                as.pP = lllIlllll[0];
                                dl = lllIlllll[0];
                            }
                            llIIlllIIIlII.useOn((TileObject)llIIlllIIIlIl);
                            Time.sleepTicks((int)lllIlllll[5]);
                            0;
                        }
                    }
                }
                g.a(lD);
            }
            g.a(new String[lllIlllll[0]]);
        }
    }

    private static int llIIllIIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ae() {
        return lllIlllll[0];
    }

    private static String llIIlIlIlllI(String llIIllIIlIlII, String llIIllIIlIIll) {
        llIIllIIlIlII = new String(Base64.getDecoder().decode(llIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIIlIlll = new StringBuilder();
        char[] llIIllIIlIllI = llIIllIIlIIll.toCharArray();
        int llIIllIIlIlIl = lllIlllll[0];
        char[] llIIllIIIllll = llIIllIIlIlII.toCharArray();
        int llIIllIIIlllI = llIIllIIIllll.length;
        int llIIllIIIllIl = lllIlllll[0];
        while (X.llIIllIIIlll(llIIllIIIllIl, llIIllIIIlllI)) {
            char llIIllIIllIlI = llIIllIIIllll[llIIllIIIllIl];
            llIIllIIlIlll.append((char)(llIIllIIllIlI ^ llIIllIIlIllI[llIIllIIlIlIl % llIIllIIlIllI.length]));
            0;
            ++llIIllIIlIlIl;
            ++llIIllIIIllIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llIIllIIlIlll);
    }

    @Override
    public int af() {
        try {
            X.dJ();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (2 + 186 - 155 + 156 ^ 16 + 117 - 3 + 39) & (157 + 37 - 144 + 126 ^ 96 + 70 - 5 + 3 ^ -1);
        }
        return lllIlllll[51];
    }

    private static boolean llIIllIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllIIlIIl(int n2) {
        return n2 < 0;
    }

    static {
        X.llIIllIIIlII();
        X.llIIlIllIIIl();
        String[] stringArray = new String[lllIlllll[23]];
        stringArray[X.lllIlllll[0]] = lllIlllII[lllIlllll[54]];
        stringArray[X.lllIlllll[1]] = lllIlllII[lllIlllll[55]];
        stringArray[X.lllIlllll[3]] = lllIlllII[lllIlllll[56]];
        stringArray[X.lllIlllll[5]] = lllIlllII[lllIlllll[57]];
        stringArray[X.lllIlllll[7]] = lllIlllII[lllIlllll[58]];
        stringArray[X.lllIlllll[8]] = lllIlllII[lllIlllll[59]];
        stringArray[X.lllIlllll[14]] = lllIlllII[lllIlllll[60]];
        stringArray[X.lllIlllll[20]] = lllIlllII[lllIlllll[61]];
        stringArray[X.lllIlllll[18]] = lllIlllII[lllIlllll[62]];
        stringArray[X.lllIlllll[21]] = lllIlllII[lllIlllll[63]];
        stringArray[X.lllIlllll[15]] = lllIlllII[lllIlllll[64]];
        stringArray[X.lllIlllll[19]] = lllIlllII[lllIlllll[65]];
        stringArray[X.lllIlllll[22]] = lllIlllII[lllIlllll[66]];
        lD = stringArray;
        lE = new WorldPoint(lllIlllll[16], lllIlllll[67], lllIlllll[0]);
        lF = new WorldPoint(lllIlllll[68], lllIlllll[69], lllIlllll[0]);
        lG = new WorldPoint(lllIlllll[70], lllIlllll[71], lllIlllll[0]);
        lH = new WorldPoint(lllIlllll[72], lllIlllll[73], lllIlllll[0]);
        bx = new ArrayList<d>();
        cI = lllIlllll[0];
    }

    private static boolean llIIllIIllII(Object object) {
        return object == null;
    }

    private static boolean llIIllIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return lllIlllII[lllIlllll[52]];
    }

    private static boolean llIIllIIlIll(Object object) {
        return object != null;
    }

    private static void Q() {
        d llIIlllIIIIII;
        Object llIIlllIIIIIl;
        int[] nArray = new int[lllIlllll[1]];
        nArray[X.lllIlllll[0]] = lllIlllll[10];
        if (X.llIIllIIlIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lllIlllll[10], lllIlllll[1], lllIlllll[46]);
            bx.add(d2);
            0;
        }
        int[] nArray2 = new int[lllIlllll[1]];
        nArray2[X.lllIlllll[0]] = lllIlllll[4];
        if (X.llIIllIIlIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llIIlllIIIIIl = new d(lllIlllll[4], lllIlllll[15], lllIlllll[47]);
            bx.add((d)llIIlllIIIIIl);
            0;
        }
        if (X.llIIllIIlIII(Bank.contains(llIIlllIIIIIl = item -> item.getName().toLowerCase().contains(lllIlllII[lllIlllll[53]])) ? 1 : 0)) {
            llIIlllIIIIII = new d(lllIlllll[48], lllIlllll[8], lllIlllll[49]);
            bx.add(llIIlllIIIIII);
            0;
        }
        int[] nArray3 = new int[lllIlllll[1]];
        nArray3[X.lllIlllll[0]] = lllIlllll[11];
        if (X.llIIllIIlIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llIIlllIIIIII = new d(lllIlllll[11], lllIlllll[15], lllIlllll[50]);
            bx.add(llIIlllIIIIII);
            0;
        }
        int[] nArray4 = new int[lllIlllll[1]];
        nArray4[X.lllIlllll[0]] = lllIlllll[13];
        if (X.llIIllIIlIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llIIlllIIIIII = new d(lllIlllll[13], lllIlllll[31], lllIlllll[50]);
            bx.add(llIIlllIIIIII);
            0;
        }
        int[] nArray5 = new int[lllIlllll[1]];
        nArray5[X.lllIlllll[0]] = lllIlllll[12];
        if (X.llIIllIIlIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
            llIIlllIIIIII = new d(lllIlllll[12], lllIlllll[8], j.ch);
            bx.add(llIIlllIIIIII);
            0;
        }
    }

    private static boolean llIIllIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIllIIIlII() {
        lllIlllll = new int[75];
        X.lllIlllll[0] = (0xBE ^ 0x81 ^ (0x39 ^ 0x20)) & (53 + 30 - 81 + 177 ^ 98 + 137 - 194 + 108 ^ -1);
        X.lllIlllll[1] = 1;
        X.lllIlllll[2] = 0x34 ^ 0x60 ^ (0x63 ^ 0x71);
        X.lllIlllll[3] = 2;
        X.lllIlllll[4] = -(0xFFFFEFEF & 0x7695) & (0xFFFFE7FF & Short.MAX_VALUE);
        X.lllIlllll[5] = 3;
        X.lllIlllll[6] = 5 ^ 0x6E;
        X.lllIlllll[7] = 0x72 ^ 0x76;
        X.lllIlllll[8] = 0xA ^ 0xF;
        X.lllIlllll[9] = -(0xFFFFF4BF & 0x6B67) & (0xFFFFF3AF & 0x7FFE);
        X.lllIlllll[10] = -(0xFFFFB4EF & 0x5B16) & (0xFFFFFFEF & 0x3EDF);
        X.lllIlllll[11] = -(0xFFFFEED3 & 0x713F) & (0xFFFFFF7A & 0x7FDF);
        X.lllIlllll[12] = -(0xFFFFF255 & 0x4DAF) & (0xFFFFF777 & 0x79DD);
        X.lllIlllll[13] = -(0x96 ^ 0xAF) & (0xFFFFDFFF & 0x3F7F);
        X.lllIlllll[14] = 0x6D ^ 0x6B;
        X.lllIlllll[15] = 0x19 ^ 0x1F ^ (1 ^ 0xD);
        X.lllIlllll[16] = -(0xFFFFF67F & 0x49C6) & (0xFFFFCCED & Short.MAX_VALUE);
        X.lllIlllll[17] = -(0xFFFFD57C & 0x7ABF) & (0xFFFFFFFF & 0x5CBF);
        X.lllIlllll[18] = 0xA5 ^ 0xAD;
        X.lllIlllll[19] = 0xE9 ^ 0xBB ^ (0x63 ^ 0x3A);
        X.lllIlllll[20] = 0xEF ^ 0xB4 ^ (0xD0 ^ 0x8C);
        X.lllIlllll[21] = 0x5E ^ 0x23 ^ (0xE1 ^ 0x95);
        X.lllIlllll[22] = 0xF0 ^ 0xC2 ^ (0x83 ^ 0xBD);
        X.lllIlllll[23] = 0x4C ^ 0x41 ^ (8 ^ 0x52) & ~(0x6F ^ 0x35);
        X.lllIlllll[24] = 0x89 ^ 0x87;
        X.lllIlllll[25] = 0xFA ^ 0xAA ^ (0x7F ^ 0x20);
        X.lllIlllll[26] = 0x28 ^ 0x38;
        X.lllIlllll[27] = 0xFFFFABFA & 0x562D;
        X.lllIlllll[28] = 0x22 ^ 0x76 ^ (0xFA ^ 0xBF);
        X.lllIlllll[29] = 0x3A ^ 0x28;
        X.lllIlllll[30] = 0x70 ^ 0x63;
        X.lllIlllll[31] = 0x84 ^ 0x90;
        X.lllIlllll[32] = 0x9C ^ 0x89;
        X.lllIlllll[33] = 0x6C ^ 0x75 ^ (0xCF ^ 0xC0);
        X.lllIlllll[34] = 27 + 92 - 92 + 108 ^ 82 + 23 - 18 + 57;
        X.lllIlllll[35] = 0xA6 ^ 0xBE;
        X.lllIlllll[36] = 0x33 ^ 0x2A;
        X.lllIlllll[37] = 0x23 ^ 0x39;
        X.lllIlllll[38] = 0x6A ^ 0x48 ^ (0x3F ^ 6);
        X.lllIlllll[39] = 0xC7 ^ 0x92 ^ (0xF2 ^ 0xBB);
        X.lllIlllll[40] = 0x30 ^ 0x2D;
        X.lllIlllll[41] = 0x48 ^ 0x56;
        X.lllIlllll[42] = 0x10 ^ 0x58 ^ (0xEA ^ 0xBD);
        X.lllIlllll[43] = 0xEF ^ 0xB3 ^ (0xE3 ^ 0x9F);
        X.lllIlllll[44] = 0xEE ^ 0x84 ^ (0xC2 ^ 0x89);
        X.lllIlllll[45] = 0xA ^ 0x28;
        X.lllIlllll[46] = 0xFFFFFF5E & 0x3EBD;
        X.lllIlllll[47] = -(0xFFFFB9FD & 0x66E6) & (0xFFFFFFFF & 0x37EF);
        X.lllIlllll[48] = -(0xFFFFB9F3 & 0x573D) & (0xFFFFFFFE & 0x3FFD);
        X.lllIlllll[49] = -(0xFFFF9FBF & 0x7E56) & (0xFFFFFFFF & 0x7FBD);
        X.lllIlllll[50] = 0xFFFFBFEE & 0x477D;
        X.lllIlllll[51] = 165 + 142 - 178 + 86 ^ 47 + 8 - -102 + 22;
        X.lllIlllll[52] = 0x12 ^ 0x31;
        X.lllIlllll[53] = 0x73 ^ 0x57;
        X.lllIlllll[54] = 0x6E ^ 0x7D ^ (0x9C ^ 0xAA);
        X.lllIlllll[55] = 88 + 37 - -33 + 28 ^ 111 + 67 - 90 + 68;
        X.lllIlllll[56] = 169 + 101 - 145 + 59 ^ 65 + 12 - 10 + 92;
        X.lllIlllll[57] = 175 + 151 - 297 + 148 ^ 150 + 23 - 122 + 102;
        X.lllIlllll[58] = 0x83 ^ 0xAA;
        X.lllIlllll[59] = 0xD3 ^ 0xBB ^ (0x2E ^ 0x6C);
        X.lllIlllll[60] = 21 + 125 - 6 + 30 ^ 19 + 13 - 14 + 111;
        X.lllIlllll[61] = 0x5B ^ 0x21 ^ (0x5E ^ 8);
        X.lllIlllll[62] = 0x5E ^ 0x74 ^ (0x13 ^ 0x14);
        X.lllIlllll[63] = 0xEC ^ 0xC2;
        X.lllIlllll[64] = 71 + 44 - 74 + 120 ^ 112 + 10 - -20 + 0;
        X.lllIlllll[65] = 63 + 21 - 77 + 136 ^ 87 + 158 - 188 + 134;
        X.lllIlllll[66] = 69 + 21 - -42 + 15 ^ 7 + 15 - -129 + 11;
        X.lllIlllll[67] = 0xFFFFDDAE & 0x2EDB;
        X.lllIlllll[68] = 0xFFFFDFDB & 0x2C6E;
        X.lllIlllll[69] = -(0xFFFFD145 & 0x7FBF) & (0xFFFFDFFC & 0x7D6F);
        X.lllIlllll[70] = -(0xFFFFFB53 & 0x36AF) & (0xFFFFFEFB & 0x3FB7);
        X.lllIlllll[71] = -(0xFFFFDBB5 & 0x67CB) & (0xFFFFCFFE & 0x7FFB);
        X.lllIlllll[72] = 0xFFFFDE2F & 0x2DFE;
        X.lllIlllll[73] = 0xFFFFA5FF & 0x7F5E;
        X.lllIlllll[74] = 0x7C ^ 0x4E;
    }

    private static boolean llIIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }
}

