/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.D;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
import gg.squire.account.AccBuilderBarrows;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class t
implements F {
    static /* synthetic */ ArrayList<Integer> cY;
    public static final /* synthetic */ WorldPoint cO;
    public static final /* synthetic */ WorldPoint cU;
    public static /* synthetic */ List<d> bB;
    public static final /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ int cX;
    public static final /* synthetic */ WorldPoint cT;
    public static final /* synthetic */ WorldPoint cP;
    public static /* synthetic */ boolean cV;
    private static /* synthetic */ String[] llllIIII;
    public static final /* synthetic */ WorldPoint cS;
    private static /* synthetic */ int[] llllIlII;
    public static final /* synthetic */ WorldPoint cN;
    static /* synthetic */ int ci;
    public static /* synthetic */ int cW;
    public static final /* synthetic */ WorldPoint cR;
    static /* synthetic */ String[] bX;
    static /* synthetic */ boolean cj;

    private static int llIIlIlIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public String V() {
        return llllIIII[llllIlII[147]];
    }

    private static boolean llIIlIllIlI(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[llllIlII[0]];
        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[141]];
        if (t.llIIlIlIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = llllIlII[12];
            if (t.llIIlIlIllI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llllIlII[0]];
                nArray2[t.llllIlII[1]] = llllIlII[7];
                if (t.llIIlIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIlII[0]];
                    nArray3[t.llllIlII[1]] = llllIlII[9];
                    if (t.llIIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llllIlII[0];
                        0;
                        if (-1 < 1) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llllIlII[1];
        return n2 != 0;
    }

    private static String llIIIllIIlI(String lIIllIllIIIllII, String lIIllIllIIIlIll) {
        try {
            SecretKeySpec lIIllIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIllIIIlIll.getBytes(StandardCharsets.UTF_8)), llllIlII[18]), "DES");
            Cipher lIIllIllIIIlllI = Cipher.getInstance("DES");
            lIIllIllIIIlllI.init(llllIlII[5], lIIllIllIIIllll);
            return new String(lIIllIllIIIlllI.doFinal(Base64.getDecoder().decode(lIIllIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIllIIIllIl) {
            lIIllIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void aL() {
        cY.add(llllIlII[120]);
        0;
        cY.add(llllIlII[121]);
        0;
        cY.add(llllIlII[122]);
        0;
        cY.add(llllIlII[123]);
        0;
        cY.add(llllIlII[124]);
        0;
        cY.add(llllIlII[125]);
        0;
        cY.add(llllIlII[126]);
        0;
        while (t.llIIlIlIIll(cY.isEmpty() ? 1 : 0) && t.llIIlIlIIll(cY.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llllIlII[0]];
            stringArray[t.llllIlII[1]] = llllIIII[llllIlII[127]];
            if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                0;
                if ((0x1A ^ 0x3F ^ (0x1E ^ 0x3F)) != 0) break;
                return;
            }
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = cY.get(llllIlII[1]);
            TileObject lIIllIllIllllII = TileObjects.getNearest((int[])nArray);
            if (t.llIIlIlIlIl(lIIllIllIllllII)) {
                String[] stringArray2 = new String[llllIlII[0]];
                stringArray2[t.llllIlII[1]] = llllIIII[llllIlII[128]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llllIlII[0]];
                    stringArray3[t.llllIlII[1]] = llllIIII[llllIlII[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(lIIllIllIllllII);
                    Time.sleepTicks((int)llllIlII[3]);
                    0;
                }
            }
            String[] stringArray4 = new String[llllIlII[0]];
            stringArray4[t.llllIlII[1]] = llllIIII[llllIlII[130]];
            if (t.llIIlIlIIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                cY.remove(llllIlII[1]);
                0;
                Time.sleepTicks((int)llllIlII[5]);
                0;
            }
            0;
            
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aN() {
        void lIIllIllIllIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (t.llIIlIlIlIl(bankLocation) && t.llIIlIlIIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIII[llllIlII[136]];
            a.a(bankLocation);
        }
        if (t.llIIlIlIlIl(lIIllIllIllIlII) && t.llIIlIlIIIl(lIIllIllIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (t.llIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlII[4]);
                0;
            }
            if (t.llIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = llllIIII[llllIlII[137]];
                if (t.llIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlII[6]);
                    0;
                }
                a.a(llllIlII[7], llllIlII[13]);
                a.a(llllIlII[11], llllIlII[0]);
                a.a(llllIlII[9], llllIlII[41]);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void aM() {
        if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
            void lIIllIllIlllIII;
            AccBuilderBarrows.c = llllIIII[llllIlII[131]];
            WorldArea worldArea = new WorldArea(llllIlII[93], llllIlII[94], llllIlII[60], llllIlII[43], llllIlII[1]);
            if (t.llIIlIlIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lIIllIllIllIlll;
                WorldArea worldArea2 = new WorldArea(llllIlII[95], llllIlII[96], llllIlII[48], llllIlII[63], llllIlII[1]);
                if (t.llIIlIlIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));
                    0;
                    Time.sleepTicks((int)llllIlII[0]);
                    0;
                }
                if (t.llIIlIlIIIl(lIIllIllIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                        String[] stringArray = new String[llllIlII[0]];
                        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[2]];
                        TileObject lIIllIllIllIllI = TileObjects.getNearest((String[])stringArray);
                        if (t.llIIlIlIlIl(lIIllIllIllIllI)) {
                            String[] stringArray2 = new String[llllIlII[0]];
                            stringArray2[t.llllIlII[1]] = llllIIII[llllIlII[132]];
                            if (t.llIIlIlIIIl(lIIllIllIllIllI.hasAction(stringArray2) ? 1 : 0)) {
                                lIIllIllIllIllI.interact(llllIIII[llllIlII[133]]);
                                Time.sleepTicks((int)llllIlII[10]);
                                0;
                            }
                            String[] stringArray3 = new String[llllIlII[0]];
                            stringArray3[t.llllIlII[1]] = llllIIII[llllIlII[134]];
                            if (t.llIIlIlIIIl(lIIllIllIllIllI.hasAction(stringArray3) ? 1 : 0)) {
                                lIIllIllIllIllI.interact(llllIIII[llllIlII[135]]);
                                Time.sleepTicks((int)llllIlII[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (t.llIIlIlIIIl(lIIllIllIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)cU);
                0;
                Time.sleepTicks((int)llllIlII[0]);
                0;
            }
        }
    }

    private static boolean llIIlIlIllI(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aP() {
        int n2;
        String[] stringArray = new String[llllIlII[0]];
        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[140]];
        if (t.llIIlIlIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = llllIlII[12];
            if (t.llIIlIlIllI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llllIlII[0]];
                nArray2[t.llllIlII[1]] = llllIlII[11];
                if (t.llIIlIlIllI(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[llllIlII[0]];
                    nArray3[t.llllIlII[1]] = llllIlII[7];
                    if (t.llIIlIlIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llllIlII[0];
                        0;
                        if (1 < (0x27 ^ 0x23)) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llllIlII[1];
        return n2 != 0;
    }

    private static String llIIIllIIll(String lIIllIllIlIIIIl, String lIIllIllIIllIll) {
        lIIllIllIlIIIIl = new String(Base64.getDecoder().decode(lIIllIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIllIIlllll = new StringBuilder();
        char[] lIIllIllIIllllI = lIIllIllIIllIll.toCharArray();
        int lIIllIllIIlllIl = llllIlII[1];
        char[] lIIllIllIIlIlll = lIIllIllIlIIIIl.toCharArray();
        int lIIllIllIIlIllI = lIIllIllIIlIlll.length;
        int lIIllIllIIlIlIl = llllIlII[1];
        while (t.llIIlIlIIlI(lIIllIllIIlIlIl, lIIllIllIIlIllI)) {
            char lIIllIllIlIIIlI = lIIllIllIIlIlll[lIIllIllIIlIlIl];
            lIIllIllIIlllll.append((char)(lIIllIllIlIIIlI ^ lIIllIllIIllllI[lIIllIllIIlllIl % lIIllIllIIllllI.length]));
            0;
            ++lIIllIllIIlllIl;
            ++lIIllIllIIlIlIl;
            0;
            if (3 > 1) continue;
            return null;
        }
        return String.valueOf(lIIllIllIIlllll);
    }

    @Override
    public int U() {
        try {
            t.aK();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 == 0) {
            return (0xAF ^ 0xA0 ^ (0xFF ^ 0xA6)) & (138 + 140 - 85 + 38 ^ 21 + 156 - 131 + 131 ^ -1);
        }
        return llllIlII[117];
    }

    private static boolean llIIlIlIIll(int n2) {
        return n2 == 0;
    }

    private static String llIIIllIIIl(String lIIllIlIlllllIl, String lIIllIlIlllllII) {
        try {
            SecretKeySpec lIIllIllIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIlIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIllIIIIIIl = Cipher.getInstance("Blowfish");
            lIIllIllIIIIIIl.init(llllIlII[5], lIIllIllIIIIIlI);
            return new String(lIIllIllIIIIIIl.doFinal(Base64.getDecoder().decode(lIIllIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIllIIIIIII) {
            lIIllIllIIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    public static void aK() {
        if (t.llIIlIlIIIl(bz ? 1 : 0)) {
            b.a(bB);
            if (t.llIIlIlIIlI(bB.size(), llllIlII[0])) {
                System.out.println(llllIIII[llllIlII[1]]);
                bz = llllIlII[1];
            }
        }
        if (t.llIIlIlIIll(bz ? 1 : 0)) {
            TileObject lIIllIllIlllllI;
            TileObject lIIllIllIllllll;
            BankLocation lIIllIlllIIIIII;
            if (t.llIIlIlIIlI(e.j(llllIlII[2]), llllIlII[3])) {
                D.ci();
            }
            if (t.llIIlIlIIll(t.aP() ? 1 : 0) && t.llIIlIlIIlI(e.j(cW), llllIlII[0]) && t.llIIlIlIlII(e.j(llllIlII[2]), llllIlII[3])) {
                lIIllIlllIIIIII = BankLocation.getNearest();
                if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIlIIll(lIIllIlllIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[0]];
                    a.a(lIIllIlllIIIIII);
                }
                if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIlIIIl(lIIllIlllIIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (t.llIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlII[4]);
                        0;
                    }
                    if (t.llIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[5]];
                        if (t.llIIlIlIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIlII[6]);
                            0;
                        }
                        if (t.llIIlIlIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIlII[5]);
                            0;
                        }
                        int[] nArray = new int[llllIlII[3]];
                        nArray[t.llllIlII[1]] = llllIlII[7];
                        nArray[t.llllIlII[0]] = llllIlII[8];
                        nArray[t.llllIlII[5]] = llllIlII[9];
                        nArray[t.llllIlII[10]] = llllIlII[11];
                        nArray[t.llllIlII[6]] = llllIlII[12];
                        if (t.llIIlIlIIll(e.b(nArray) ? 1 : 0)) {
                            t.ag();
                            System.out.println(llllIIII[llllIlII[10]]);
                            bz = llllIlII[0];
                            return;
                        }
                        int[] nArray2 = new int[llllIlII[3]];
                        nArray2[t.llllIlII[1]] = llllIlII[7];
                        nArray2[t.llllIlII[0]] = llllIlII[8];
                        nArray2[t.llllIlII[5]] = llllIlII[9];
                        nArray2[t.llllIlII[10]] = llllIlII[11];
                        nArray2[t.llllIlII[6]] = llllIlII[12];
                        if (t.llIIlIlIIIl(e.b(nArray2) ? 1 : 0)) {
                            a.a(llllIlII[7], llllIlII[13]);
                            a.a(llllIlII[14], llllIlII[0]);
                            a.a(llllIlII[8], llllIlII[0]);
                            a.a(llllIlII[11], llllIlII[6]);
                            a.a(llllIlII[12], llllIlII[13]);
                        }
                    }
                }
            }
            if (t.llIIlIlIIIl(Inventory.contains((int[])f.bb) ? 1 : 0) && t.llIIlIlIIlI(Movement.getRunEnergy(), llllIlII[15])) {
                Inventory.getFirst((int[])f.bb).interact(llllIIII[llllIlII[6]]);
                Time.sleepTicks((int)llllIlII[0]);
                0;
            }
            int[] nArray = new int[llllIlII[0]];
            nArray[t.llllIlII[1]] = llllIlII[12];
            if (t.llIIlIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && t.llIIlIlIlll(t.llIIlIlIIII(e.v(), 60.0))) {
                int[] nArray3 = new int[llllIlII[0]];
                nArray3[t.llllIlII[1]] = llllIlII[12];
                Inventory.getFirst((int[])nArray3).interact(llllIIII[llllIlII[3]]);
                Time.sleepTicks((int)llllIlII[0]);
                0;
            }
            if (t.llIIlIlIIlI(e.j(cW), llllIlII[0]) && t.llIIlIlIIIl(t.aP() ? 1 : 0)) {
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[16]];
                    if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cN);
                    0;
                    Time.sleepTicks((int)llllIlII[0]);
                    0;
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[17]];
                    g.a(llllIIII[llllIlII[18]], bX);
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[0])) {
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[19]];
                    Movement.walkTo((WorldPoint)cO);
                    0;
                    Time.sleepTicks((int)llllIlII[0]);
                    0;
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[13]];
                    if (t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llllIlII[0]];
                        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[20]];
                        TileObjects.getNearest((String[])stringArray).interact(llllIIII[llllIlII[21]]);
                    }
                    g.a(bX);
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[5])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[22]];
                if (t.llIIlIllIlI(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[23]];
                    String[] stringArray2 = new String[llllIlII[0]];
                    stringArray2[t.llllIlII[1]] = llllIIII[llllIlII[24]];
                    lIIllIlllIIIIII = TileObjects.getNearest((String[])stringArray2);
                    if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo((Locatable)lIIllIlllIIIIII), llllIlII[6]) && t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bX);
                    }
                    if (!t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0) || t.llIIlIllIII(Players.getLocal().distanceTo(new WorldPoint(llllIlII[25], llllIlII[26], llllIlII[1])), llllIlII[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[26], llllIlII[1]));
                        0;
                        Time.sleepTicks((int)llllIlII[10]);
                        0;
                    }
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[26], llllIlII[1])), llllIlII[3])) {
                    String[] stringArray3 = new String[llllIlII[0]];
                    stringArray3[t.llllIlII[1]] = llllIIII[llllIlII[27]];
                    if (t.llIIlIllIlI(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[llllIlII[0]];
                        stringArray4[t.llllIlII[1]] = llllIIII[llllIlII[28]];
                        lIIllIlllIIIIII = TileObjects.getNearest((String[])stringArray4);
                        if (t.llIIlIlIlIl(lIIllIlllIIIIII) && t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[llllIlII[0]];
                            stringArray5[t.llllIlII[1]] = llllIIII[llllIlII[29]];
                            if (t.llIIlIlIIIl(lIIllIlllIIIIII.hasAction(stringArray5) ? 1 : 0)) {
                                lIIllIlllIIIIII.interact(llllIIII[llllIlII[30]]);
                                Time.sleepTicks((int)llllIlII[5]);
                                0;
                            }
                            String[] stringArray6 = new String[llllIlII[0]];
                            stringArray6[t.llllIlII[1]] = llllIIII[llllIlII[31]];
                            if (t.llIIlIlIIIl(lIIllIlllIIIIII.hasAction(stringArray6) ? 1 : 0)) {
                                lIIllIlllIIIIII.interact(llllIIII[llllIlII[32]]);
                                Time.sleepTicks((int)llllIlII[5]);
                                0;
                            }
                        }
                        g.a(bX);
                    }
                }
                String[] stringArray7 = new String[llllIlII[0]];
                stringArray7[t.llllIlII[1]] = llllIIII[llllIlII[33]];
                if (t.llIIlIlIlIl(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[llllIlII[0]];
                    nArray4[t.llllIlII[1]] = llllIlII[14];
                    if (t.llIIlIlIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llllIlII[0]];
                        nArray5[t.llllIlII[1]] = llllIlII[14];
                        if (t.llIIlIlIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llllIlII[0]];
                            nArray6[t.llllIlII[1]] = llllIlII[14];
                            Inventory.getFirst((int[])nArray6).interact(llllIIII[llllIlII[34]]);
                        }
                    }
                    if (t.llIIlIllIlI(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[llllIlII[0]];
                        stringArray8[t.llllIlII[1]] = llllIIII[llllIlII[35]];
                        NPCs.getNearest((String[])stringArray8).interact(llllIIII[llllIlII[36]]);
                        Time.sleepTicks((int)llllIlII[5]);
                        0;
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[10])) {
                if (t.llIIlIlIIll(cV ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                        String[] stringArray = new String[llllIlII[0]];
                        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[37]];
                        if (t.llIIlIlIlIl(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[llllIlII[0]];
                            nArray7[t.llllIlII[1]] = llllIlII[7];
                            if (t.llIIlIlIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllIlII[0]];
                                nArray8[t.llllIlII[1]] = llllIlII[7];
                                Inventory.getFirst((int[])nArray8).interact(llllIIII[llllIlII[38]]);
                                Time.sleepTicks((int)llllIlII[3]);
                                0;
                            }
                        }
                        AccBuilderBarrows.c = llllIIII[llllIlII[39]];
                        Movement.walkTo((WorldPoint)cO);
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cO), llllIlII[5])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[40]];
                        if (t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llllIlII[0]];
                            stringArray[t.llllIlII[1]] = llllIIII[llllIlII[41]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIIII[llllIlII[42]]);
                        }
                        g.a(bX);
                        if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0) && t.llIIlIlIIIl(Dialog.getText().contains(llllIIII[llllIlII[43]]) ? 1 : 0)) {
                            cV = llllIlII[0];
                        }
                    }
                }
                if (t.llIIlIlIIIl(cV ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[44]];
                        Movement.walkTo((WorldPoint)cN);
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cN), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[45]];
                        g.a(llllIIII[llllIlII[46]], bX);
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[6])) {
                ci = llllIlII[1];
                if (t.llIIlIlIIll(t.ac() ? 1 : 0)) {
                    t.aO();
                }
                if (t.llIIlIlIIIl(t.ac() ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[47]];
                        if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cR);
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[48]];
                        if (t.llIIlIlIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llllIlII[0]];
                            stringArray[t.llllIlII[1]] = llllIIII[llllIlII[49]];
                            TileObjects.getNearest((String[])stringArray).interact(llllIIII[llllIlII[50]]);
                        }
                        g.a(bX);
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[3])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[51]];
                if (t.llIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llllIlII[0]];
                    stringArray9[t.llllIlII[1]] = llllIIII[llllIlII[52]];
                    if (t.llIIlIlIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cS), llllIlII[17]) || t.llIIlIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[53]];
                            Movement.walkTo((WorldPoint)cS);
                            0;
                            Time.sleepTicks((int)llllIlII[0]);
                            0;
                        }
                        if (!t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cS), llllIlII[17]) || t.llIIlIlIIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (t.llIIlIllIlI(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[llllIlII[0]];
                                nArray9[t.llllIlII[1]] = llllIlII[54];
                                NPCs.getNearest((int[])nArray9).interact(llllIIII[llllIlII[55]]);
                                Time.sleepTicks((int)llllIlII[5]);
                                0;
                            }
                            String[] stringArray10 = new String[llllIlII[0]];
                            stringArray10[t.llllIlII[1]] = llllIIII[llllIlII[56]];
                            lIIllIlllIIIIII = TileItems.getNearest((String[])stringArray10);
                            if (t.llIIlIlIIIl(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[llllIlII[0]];
                                nArray10[t.llllIlII[1]] = llllIlII[12];
                                Inventory.getFirst((int[])nArray10).interact(llllIIII[llllIlII[57]]);
                                Time.sleepTicks((int)llllIlII[0]);
                                0;
                            }
                            if (t.llIIlIlIlIl(lIIllIlllIIIIII)) {
                                lIIllIlllIIIIII.interact(llllIIII[llllIlII[58]]);
                                Time.sleepTicks((int)llllIlII[5]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray11 = new String[llllIlII[0]];
                stringArray11[t.llllIlII[1]] = llllIIII[llllIlII[59]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cT), llllIlII[13])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[60]];
                        Movement.walkTo((WorldPoint)cT);
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                    if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cT), llllIlII[13])) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[61]];
                        t.aL();
                    }
                }
                String[] stringArray12 = new String[llllIlII[0]];
                stringArray12[t.llllIlII[1]] = llllIIII[llllIlII[15]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[llllIlII[0]];
                    stringArray13[t.llllIlII[1]] = llllIIII[llllIlII[62]];
                    if (t.llIIlIlIIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[63]];
                        String[] stringArray14 = new String[llllIlII[0]];
                        stringArray14[t.llllIlII[1]] = llllIIII[llllIlII[64]];
                        int[] nArray11 = new int[llllIlII[0]];
                        nArray11[t.llllIlII[1]] = llllIlII[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)llllIlII[6]);
                        0;
                    }
                }
                String[] stringArray15 = new String[llllIlII[0]];
                stringArray15[t.llllIlII[1]] = llllIIII[llllIlII[66]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[llllIlII[0]];
                    stringArray16[t.llllIlII[1]] = llllIIII[llllIlII[67]];
                    if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[68]];
                            if (t.llIIlIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cR);
                            0;
                            Time.sleepTicks((int)llllIlII[0]);
                            0;
                        }
                        if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cR), llllIlII[10])) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[69]];
                            String[] stringArray17 = new String[llllIlII[0]];
                            stringArray17[t.llllIlII[1]] = llllIIII[llllIlII[70]];
                            String[] stringArray18 = new String[llllIlII[0]];
                            stringArray18[t.llllIlII[1]] = llllIIII[llllIlII[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)llllIlII[10]);
                            0;
                        }
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[16])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[72]];
                lIIllIlllIIIIII = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[llllIlII[0]];
                stringArray19[t.llllIlII[1]] = llllIIII[llllIlII[73]];
                if (t.llIIlIlIIll(Inventory.contains((String[])stringArray19) ? 1 : 0) && t.llIIlIlIlIl(lIIllIlllIIIIII)) {
                    if (t.llIIlIlIIIl(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[74]];
                        g.a(llllIIII[llllIlII[75]], bX);
                    }
                    if (t.llIIlIlIIll(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[76]];
                        String[] stringArray20 = new String[llllIlII[0]];
                        stringArray20[t.llllIlII[1]] = llllIIII[llllIlII[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(llllIIII[llllIlII[78]]);
                        Time.sleepTicks((int)llllIlII[5]);
                        0;
                    }
                }
                String[] stringArray21 = new String[llllIlII[0]];
                stringArray21[t.llllIlII[1]] = llllIIII[llllIlII[79]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[llllIlII[0]];
                    stringArray22[t.llllIlII[1]] = llllIIII[llllIlII[80]];
                    lIIllIllIllllll = TileObjects.getNearest((String[])stringArray22);
                    if (t.llIIlIlIlIl(lIIllIllIllllll)) {
                        if (t.llIIlIlIIIl(Reachable.isInteractable((Locatable)lIIllIllIllllll) ? 1 : 0)) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[81]];
                            String[] stringArray23 = new String[llllIlII[0]];
                            stringArray23[t.llllIlII[1]] = llllIIII[llllIlII[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(lIIllIllIllllll);
                            Time.sleepTicks((int)llllIlII[5]);
                            0;
                        }
                        if (t.llIIlIlIIll(Reachable.isInteractable((Locatable)lIIllIllIllllll) ? 1 : 0)) {
                            AccBuilderBarrows.c = llllIIII[llllIlII[83]];
                            String[] stringArray24 = new String[llllIlII[0]];
                            stringArray24[t.llllIlII[1]] = llllIIII[llllIlII[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(llllIIII[llllIlII[85]]);
                            Time.sleepTicks((int)llllIlII[5]);
                            0;
                        }
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[17])) {
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[86]];
                lIIllIlllIIIIII = NPCs.getNearest((String[])stringArray);
                if (t.llIIlIlIlIl(lIIllIlllIIIIII)) {
                    if (t.llIIlIlIIIl(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[87]];
                        g.a(llllIIII[llllIlII[88]], bX);
                    }
                    if (t.llIIlIlIIll(Reachable.isInteractable((Locatable)lIIllIlllIIIIII) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[89]];
                        String[] stringArray25 = new String[llllIlII[0]];
                        stringArray25[t.llllIlII[1]] = llllIIII[llllIlII[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(llllIIII[llllIlII[91]]);
                        Time.sleepTicks((int)llllIlII[5]);
                        0;
                    }
                }
            }
            if (t.llIIlIlIlII(e.j(cW), llllIlII[18])) {
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[92]];
                    lIIllIlllIIIIII = new WorldArea(llllIlII[93], llllIlII[94], llllIlII[60], llllIlII[43], llllIlII[1]);
                    if (t.llIIlIlIIll(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIIllIllIllllll = new WorldArea(llllIlII[95], llllIlII[96], llllIlII[48], llllIlII[63], llllIlII[1]);
                        if (t.llIIlIlIIll(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));
                            0;
                            Time.sleepTicks((int)llllIlII[0]);
                            0;
                        }
                        if (t.llIIlIlIIIl(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));
                                0;
                                Time.sleepTicks((int)llllIlII[0]);
                                0;
                            }
                            if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                String[] stringArray = new String[llllIlII[0]];
                                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[98]];
                                lIIllIllIlllllI = TileObjects.getNearest((String[])stringArray);
                                if (t.llIIlIlIlIl(lIIllIllIlllllI)) {
                                    String[] stringArray26 = new String[llllIlII[0]];
                                    stringArray26[t.llllIlII[1]] = llllIIII[llllIlII[99]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray26) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[100]]);
                                        Time.sleepTicks((int)llllIlII[10]);
                                        0;
                                    }
                                    String[] stringArray27 = new String[llllIlII[0]];
                                    stringArray27[t.llllIlII[1]] = llllIIII[llllIlII[101]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray27) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[102]]);
                                        Time.sleepTicks((int)llllIlII[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (t.llIIlIlIIIl(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cU);
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[103]];
                    g.a(llllIIII[llllIlII[104]], bX);
                }
            }
            if (t.llIIlIllIll(e.j(cW), llllIlII[13]) && t.llIIlIlIIlI(e.j(cW), llllIlII[72])) {
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    String[] stringArray = new String[llllIlII[0]];
                    stringArray[t.llllIlII[1]] = llllIIII[llllIlII[105]];
                    if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllIIII[llllIlII[106]];
                        if (t.llIIlIlIIlI(ci, llllIlII[0])) {
                            Q.kc += llllIlII[0];
                            Q.o(AccBuilderBarrows.m);
                            ci += llllIlII[0];
                            Q.kc = llllIlII[1];
                            cj = llllIlII[1];
                        }
                        g.a(llllIIII[llllIlII[107]], bX);
                    }
                }
                String[] stringArray = new String[llllIlII[0]];
                stringArray[t.llllIlII[1]] = llllIIII[llllIlII[108]];
                if (t.llIIlIlIIll(Inventory.contains((String[])stringArray) ? 1 : 0) && t.llIIlIlIIlI(e.j(cW), llllIlII[72])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[109]];
                    t.aN();
                }
                String[] stringArray28 = new String[llllIlII[0]];
                stringArray28[t.llllIlII[1]] = llllIIII[llllIlII[110]];
                if (t.llIIlIlIIIl(Inventory.contains((String[])stringArray28) ? 1 : 0) && t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3]) && t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    AccBuilderBarrows.c = llllIIII[llllIlII[111]];
                    lIIllIlllIIIIII = new WorldArea(llllIlII[93], llllIlII[94], llllIlII[60], llllIlII[43], llllIlII[1]);
                    if (t.llIIlIlIIll(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lIIllIllIllllll = new WorldArea(llllIlII[95], llllIlII[96], llllIlII[48], llllIlII[63], llllIlII[1]);
                        if (t.llIIlIlIIll(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));
                            0;
                            Time.sleepTicks((int)llllIlII[0]);
                            0;
                        }
                        if (t.llIIlIlIIIl(lIIllIllIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1]));
                                0;
                                Time.sleepTicks((int)llllIlII[0]);
                                0;
                            }
                            if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllIlII[25], llllIlII[97], llllIlII[1])), llllIlII[3])) {
                                String[] stringArray29 = new String[llllIlII[0]];
                                stringArray29[t.llllIlII[1]] = llllIIII[llllIlII[112]];
                                lIIllIllIlllllI = TileObjects.getNearest((String[])stringArray29);
                                if (t.llIIlIlIlIl(lIIllIllIlllllI)) {
                                    String[] stringArray30 = new String[llllIlII[0]];
                                    stringArray30[t.llllIlII[1]] = llllIIII[llllIlII[113]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray30) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[114]]);
                                        Time.sleepTicks((int)llllIlII[10]);
                                        0;
                                    }
                                    String[] stringArray31 = new String[llllIlII[0]];
                                    stringArray31[t.llllIlII[1]] = llllIIII[llllIlII[115]];
                                    if (t.llIIlIlIIIl(lIIllIllIlllllI.hasAction(stringArray31) ? 1 : 0)) {
                                        lIIllIllIlllllI.interact(llllIIII[llllIlII[116]]);
                                        Time.sleepTicks((int)llllIlII[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (t.llIIlIlIIIl(lIIllIlllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cU);
                        0;
                        Time.sleepTicks((int)llllIlII[0]);
                        0;
                    }
                }
            }
            if (t.llIIlIllIll(e.j(cW), llllIlII[72]) && t.llIIlIlIIlI(e.j(cX), llllIlII[3])) {
                AccBuilderBarrows.c = llllIIII[llllIlII[117]];
                if (t.llIIlIllIII(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    t.aM();
                }
                if (t.llIIlIllIIl(Players.getLocal().getWorldLocation().distanceTo(cU), llllIlII[3])) {
                    if (t.llIIlIlIlIl(Widgets.get((int)llllIlII[118], (int)llllIlII[27]))) {
                        Mouse.click((int)Widgets.get((int)llllIlII[118], (int)llllIlII[27]).getClickPoint().getX(), (int)Widgets.get((int)llllIlII[118], (int)llllIlII[27]).getClickPoint().getY(), (boolean)llllIlII[0]);
                        Time.sleepTicks((int)llllIlII[10]);
                        0;
                    }
                    g.a(llllIIII[llllIlII[119]], bX);
                    g.a(bX);
                }
            }
            g.a(bX);
        }
    }

    private static boolean llIIlIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return llllIlII[1];
    }

    @Override
    public boolean W() {
        int n2;
        if (t.llIIlIllIll(e.j(cW), llllIlII[72]) && t.llIIlIllIll(e.j(cX), llllIlII[3])) {
            n2 = llllIlII[0];
            0;
            if (-(0x8B ^ 0x8E) >= 0) {
                return false;
            }
        } else {
            n2 = llllIlII[1];
        }
        return n2 != 0;
    }

    private static boolean llIIlIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        t.llIIlIIllll();
        t.llIIlIIlllI();
        cN = new WorldPoint(llllIlII[149], llllIlII[150], llllIlII[1]);
        cO = new WorldPoint(llllIlII[151], llllIlII[152], llllIlII[1]);
        cP = new WorldPoint(llllIlII[25], llllIlII[153], llllIlII[1]);
        cQ = new WorldPoint(llllIlII[154], llllIlII[155], llllIlII[1]);
        cR = new WorldPoint(llllIlII[156], llllIlII[152], llllIlII[5]);
        cS = new WorldPoint(llllIlII[157], llllIlII[158], llllIlII[1]);
        cT = new WorldPoint(llllIlII[159], llllIlII[160], llllIlII[1]);
        cU = new WorldPoint(llllIlII[161], llllIlII[162], llllIlII[1]);
        bB = new ArrayList<d>();
        cW = llllIlII[163];
        cX = llllIlII[164];
        String[] stringArray = new String[llllIlII[31]];
        stringArray[t.llllIlII[1]] = llllIIII[llllIlII[165]];
        stringArray[t.llllIlII[0]] = llllIIII[llllIlII[166]];
        stringArray[t.llllIlII[5]] = llllIIII[llllIlII[167]];
        stringArray[t.llllIlII[10]] = llllIIII[llllIlII[168]];
        stringArray[t.llllIlII[6]] = llllIIII[llllIlII[169]];
        stringArray[t.llllIlII[3]] = llllIIII[llllIlII[170]];
        stringArray[t.llllIlII[16]] = llllIIII[llllIlII[171]];
        stringArray[t.llllIlII[17]] = llllIIII[llllIlII[172]];
        stringArray[t.llllIlII[18]] = llllIIII[llllIlII[173]];
        stringArray[t.llllIlII[19]] = llllIIII[llllIlII[174]];
        stringArray[t.llllIlII[13]] = llllIIII[llllIlII[175]];
        stringArray[t.llllIlII[20]] = llllIIII[llllIlII[176]];
        stringArray[t.llllIlII[21]] = llllIIII[llllIlII[177]];
        stringArray[t.llllIlII[22]] = llllIIII[llllIlII[178]];
        stringArray[t.llllIlII[23]] = llllIIII[llllIlII[179]];
        stringArray[t.llllIlII[24]] = llllIIII[llllIlII[180]];
        stringArray[t.llllIlII[27]] = llllIIII[llllIlII[181]];
        stringArray[t.llllIlII[28]] = llllIIII[llllIlII[182]];
        stringArray[t.llllIlII[29]] = llllIIII[llllIlII[183]];
        stringArray[t.llllIlII[30]] = llllIIII[llllIlII[184]];
        bX = stringArray;
        cY = new ArrayList();
    }

    private static void ag() {
        d lIIllIllIlIlllI;
        Object lIIllIllIlIllll;
        block10: {
            block9: {
                int[] nArray = new int[llllIlII[0]];
                nArray[t.llllIlII[1]] = llllIlII[14];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llllIlII[14], llllIlII[0], llllIlII[142]);
                    bB.add(d2);
                    0;
                }
                int[] nArray2 = new int[llllIlII[0]];
                nArray2[t.llllIlII[1]] = llllIlII[8];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lIIllIllIlIllll = new d(llllIlII[8], llllIlII[0], llllIlII[142]);
                    bB.add((d)lIIllIllIlIllll);
                    0;
                }
                int[] nArray3 = new int[llllIlII[0]];
                nArray3[t.llllIlII[1]] = llllIlII[11];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lIIllIllIlIllll = new d(llllIlII[11], llllIlII[3], i.bw);
                    bB.add((d)lIIllIllIlIllll);
                    0;
                }
                int[] nArray4 = new int[llllIlII[0]];
                nArray4[t.llllIlII[1]] = llllIlII[12];
                if (t.llIIlIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lIIllIllIlIllll = new d(llllIlII[12], llllIlII[41], llllIlII[143]);
                    bB.add((d)lIIllIllIlIllll);
                    0;
                }
                int[] nArray5 = new int[llllIlII[0]];
                nArray5[t.llllIlII[1]] = llllIlII[9];
                if (!t.llIIlIlIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llllIlII[0]];
                nArray6[t.llllIlII[1]] = llllIlII[9];
                if (!t.llIIlIlIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llllIlII[0]];
                nArray7[t.llllIlII[1]] = llllIlII[9];
                if (!t.llIIlIlIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llllIlII[15])) break block10;
            }
            lIIllIllIlIllll = new d(llllIlII[9], llllIlII[15], llllIlII[107]);
            bB.add((d)lIIllIllIlIllll);
            0;
        }
        if (t.llIIlIlIIll(Bank.contains((Predicate)(lIIllIllIlIllll = item -> item.getName().toLowerCase().contains(llllIIII[llllIlII[148]]))) ? 1 : 0)) {
            lIIllIllIlIlllI = new d(llllIlII[144], llllIlII[3], llllIlII[145]);
            bB.add(lIIllIllIlIlllI);
            0;
        }
        int[] nArray = new int[llllIlII[0]];
        nArray[t.llllIlII[1]] = llllIlII[7];
        if (t.llIIlIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIllIllIlIlllI = new d(llllIlII[7], llllIlII[51], llllIlII[146]);
            bB.add(lIIllIllIlIlllI);
            0;
        }
    }

    private static boolean llIIlIlIlIl(Object object) {
        return object != null;
    }

    private static void llIIlIIllll() {
        llllIlII = new int[186];
        t.llllIlII[0] = 1;
        t.llllIlII[1] = (3 ^ 0x17 ^ (0x16 ^ 0x54)) & (0x39 ^ 0x31 ^ (0xCA ^ 0x94) ^ -1);
        t.llllIlII[2] = 0x84 ^ 0xBE ^ (0x66 ^ 0x37);
        t.llllIlII[3] = 0xB9 ^ 0xBC;
        t.llllIlII[4] = -(0xFFFFDA51 & 0x65FF) & (0xFFFFFFFF & 0x53D8);
        t.llllIlII[5] = 2;
        t.llllIlII[6] = 0x7C ^ 0x68 ^ (0x10 ^ 0);
        t.llllIlII[7] = 0xFFFFDF7F & 0x3FC7;
        t.llllIlII[8] = -(0xFFFFDCFB & 0x3B5F) & (0xFFFF9FFF & 0x7FDF);
        t.llllIlII[9] = -(0x2E ^ 0x21) & (0xFFFFDFDF & 0x3F2E);
        t.llllIlII[10] = 3;
        t.llllIlII[11] = -(0xFFFFD7EF & 0x6CBF) & (0xFFFFFFFF & 0x75FF);
        t.llllIlII[12] = -(0xFFFFFC7D & 0x7B87) & (0xFFFFFBFF & 0x7D7F);
        t.llllIlII[13] = 66 + 47 - 105 + 146 ^ 31 + 25 - -3 + 85;
        t.llllIlII[14] = 0xFFFFDD3F & 0x27F3;
        t.llllIlII[15] = 23 + 108 - 103 + 121 ^ 152 + 65 - 168 + 118;
        t.llllIlII[16] = 68 + 141 - 67 + 5 ^ 72 + 145 - 98 + 30;
        t.llllIlII[17] = 30 + 5 - 23 + 156 ^ 50 + 136 - 111 + 100;
        t.llllIlII[18] = 0x99 ^ 0x91;
        t.llllIlII[19] = 0x24 ^ 0x2D;
        t.llllIlII[20] = 0x7A ^ 0x71;
        t.llllIlII[21] = 19 + 4 - -19 + 124 ^ 115 + 143 - 220 + 132;
        t.llllIlII[22] = 0x47 ^ 0x4A;
        t.llllIlII[23] = 0x21 ^ 0x3D ^ (0x61 ^ 0x73);
        t.llllIlII[24] = 0x58 ^ 0x57;
        t.llllIlII[25] = -(0x7F ^ 0x4C) & (0xFFFFADFF & 0x5F7F);
        t.llllIlII[26] = 0xFFFFDDFF & 0x2FB2;
        t.llllIlII[27] = 0x86 ^ 0x96;
        t.llllIlII[28] = 121 + 9 - 67 + 92 ^ 81 + 44 - -1 + 12;
        t.llllIlII[29] = 9 ^ 0x1B;
        t.llllIlII[30] = 0x41 ^ 7 ^ (2 ^ 0x57);
        t.llllIlII[31] = 0x22 ^ 0x36;
        t.llllIlII[32] = 0x48 ^ 0x5D;
        t.llllIlII[33] = 3 ^ (0x22 ^ 0x37);
        t.llllIlII[34] = 0x64 ^ 0x2E ^ (0xF0 ^ 0xAD);
        t.llllIlII[35] = 0x1E ^ 6;
        t.llllIlII[36] = 0x5C ^ 0x45;
        t.llllIlII[37] = 0xA6 ^ 0xBC;
        t.llllIlII[38] = 95 + 64 - 22 + 3 ^ 21 + 127 - 128 + 131;
        t.llllIlII[39] = 0xD ^ 0x11;
        t.llllIlII[40] = 15 + 109 - 15 + 37 ^ 19 + 130 - 10 + 4;
        t.llllIlII[41] = 0x22 ^ 0x3C;
        t.llllIlII[42] = 0xAC ^ 0xB3;
        t.llllIlII[43] = 0x27 ^ 7;
        t.llllIlII[44] = 122 + 83 - 112 + 52 ^ 61 + 119 - 77 + 73;
        t.llllIlII[45] = 0x7E ^ 0x5C;
        t.llllIlII[46] = 0x35 ^ 0x16;
        t.llllIlII[47] = 0xB ^ 0x2F;
        t.llllIlII[48] = 0x16 ^ 2 ^ (0x78 ^ 0x49);
        t.llllIlII[49] = 0x5D ^ 0x56 ^ (0x5C ^ 0x71);
        t.llllIlII[50] = 67 + 62 - 72 + 170 ^ 144 + 171 - 171 + 52;
        t.llllIlII[51] = 0x3B ^ 0x5F ^ (9 ^ 0x45);
        t.llllIlII[52] = 0x4D ^ 0x64;
        t.llllIlII[53] = 0x47 ^ 0x39 ^ (0x56 ^ 2);
        t.llllIlII[54] = -(0xFFFFEABA & 0x7767) & (0xFFFFEFBF & Short.MAX_VALUE);
        t.llllIlII[55] = 0x8B ^ 0xA0;
        t.llllIlII[56] = 0x78 ^ 0x54;
        t.llllIlII[57] = 0x38 ^ 0x31 ^ (0x6D ^ 0x49);
        t.llllIlII[58] = 0x36 ^ 0x18;
        t.llllIlII[59] = 0x87 ^ 0xA8;
        t.llllIlII[60] = 85 + 26 - 53 + 189 ^ 91 + 139 - 223 + 192;
        t.llllIlII[61] = 0x86 ^ 0xB7;
        t.llllIlII[62] = 0x94 ^ 0xA7;
        t.llllIlII[63] = 0x1A ^ 3 ^ (0x67 ^ 0x4A);
        t.llllIlII[64] = 0xCC ^ 0xA3 ^ (0x26 ^ 0x7C);
        t.llllIlII[65] = 0xFFFFDFBD & 0x2DDF;
        t.llllIlII[66] = 0x9E ^ 0xA8;
        t.llllIlII[67] = 91 + 141 - 208 + 160 ^ 116 + 3 - 38 + 62;
        t.llllIlII[68] = 0x11 ^ 0x77 ^ (0x64 ^ 0x3A);
        t.llllIlII[69] = 0x4C ^ 0x75;
        t.llllIlII[70] = 0x2E ^ 0x14;
        t.llllIlII[71] = 172 + 179 - 186 + 26 ^ 5 + 78 - 77 + 126;
        t.llllIlII[72] = 90 + 107 - 174 + 145 ^ 80 + 95 - 55 + 28;
        t.llllIlII[73] = 0x63 ^ 0x5E;
        t.llllIlII[74] = 57 + 16 - -6 + 65 ^ 171 + 95 - 187 + 95;
        t.llllIlII[75] = 0x1E ^ 8 ^ (0x8F ^ 0xA6);
        t.llllIlII[76] = 0x50 ^ 0x10;
        t.llllIlII[77] = 0x47 ^ 6;
        t.llllIlII[78] = 0xB6 ^ 0xC7 ^ (0xBD ^ 0x8E);
        t.llllIlII[79] = 7 ^ 0x76 ^ (0x2E ^ 0x1C);
        t.llllIlII[80] = 0xD ^ 0x49;
        t.llllIlII[81] = 0x6B ^ 0x19 ^ (0xBE ^ 0x89);
        t.llllIlII[82] = 0xF2 ^ 0xB4;
        t.llllIlII[83] = 0xE6 ^ 0xA1;
        t.llllIlII[84] = 0xB4 ^ 0xAC ^ (0xE5 ^ 0xB5);
        t.llllIlII[85] = 0x69 ^ 0x20;
        t.llllIlII[86] = 0x23 ^ 0x69;
        t.llllIlII[87] = 0xF7 ^ 0xBC;
        t.llllIlII[88] = 0xEA ^ 0x99 ^ (0x95 ^ 0xAA);
        t.llllIlII[89] = 0xC9 ^ 0x84;
        t.llllIlII[90] = 0x28 ^ 0x66;
        t.llllIlII[91] = 0x5E ^ 0x11;
        t.llllIlII[92] = 0x4F ^ 0x1F;
        t.llllIlII[93] = -(0xFFFFF3AF & 0x5ED1) & (0xFFFFFFCF & 0x5FF7);
        t.llllIlII[94] = -(0xFFFFEBFF & 0x5D49) & (0xFFFFEFDF & Short.MAX_VALUE);
        t.llllIlII[95] = -(0xFFFFF0CD & 0x7FF3) & (0xFFFFFFFE & 0x7DFD);
        t.llllIlII[96] = 0xFFFFADB6 & 0x5FCF;
        t.llllIlII[97] = 0xFFFFDFB3 & 0x2DFC;
        t.llllIlII[98] = 0xA9 ^ 0xB8 ^ (0x43 ^ 3);
        t.llllIlII[99] = 0xA5 ^ 0xB3 ^ (0x77 ^ 0x33);
        t.llllIlII[100] = 0x39 ^ 0x79 ^ (0x3B ^ 0x28);
        t.llllIlII[101] = 0x23 ^ 0x77;
        t.llllIlII[102] = 0x4C ^ 0x58 ^ (0x46 ^ 7);
        t.llllIlII[103] = 196 + 125 - 100 + 20 ^ 104 + 119 - 150 + 94;
        t.llllIlII[104] = 0xCD ^ 0x8C ^ (0xB5 ^ 0xA3);
        t.llllIlII[105] = 176 + 76 - 214 + 166 ^ 12 + 141 - 17 + 12;
        t.llllIlII[106] = 62 + 76 - -51 + 25 ^ 119 + 80 - 107 + 51;
        t.llllIlII[107] = 0x77 ^ 0x2D;
        t.llllIlII[108] = 3 ^ 0x26 ^ (0x51 ^ 0x2F);
        t.llllIlII[109] = 198 + 85 - 220 + 172 ^ 40 + 58 - 44 + 129;
        t.llllIlII[110] = 0x8E ^ 0xC6 ^ (1 ^ 0x14);
        t.llllIlII[111] = 53 + 38 - 59 + 160 ^ 92 + 7 - -47 + 12;
        t.llllIlII[112] = 0xF0 ^ 0xAF;
        t.llllIlII[113] = 0xAC ^ 0x90 ^ (0x3E ^ 0x62);
        t.llllIlII[114] = 0x50 ^ 0x31;
        t.llllIlII[115] = 0x57 ^ 0x35;
        t.llllIlII[116] = 0x30 ^ 0x53;
        t.llllIlII[117] = 0x36 ^ 0x52;
        t.llllIlII[118] = (0xE ^ 0x1F) + (0x88 ^ 0x9C) - -(0x12 ^ 0xD) + (0xEA ^ 0xBF);
        t.llllIlII[119] = 0xC9 ^ 0xAC;
        t.llllIlII[120] = 0xFFFF8FF8 & 0x7DAF;
        t.llllIlII[121] = 0xFFFF9FEF & 0x6DBA;
        t.llllIlII[122] = -(0xFFFFF1F3 & 0x7E5D) & (0xFFFFFDFF & 0x7FF7);
        t.llllIlII[123] = -(0xFFFFE3FF & 0x3E43) & (0xFFFFEFFF & 0x3FEB);
        t.llllIlII[124] = 0xFFFFCDE7 & 0x3FBE;
        t.llllIlII[125] = -(0xFFFFF7E5 & 0x7A5B) & (0xFFFFFFFB & 0x7FEF);
        t.llllIlII[126] = 0xFFFFCDBD & 0x3FE7;
        t.llllIlII[127] = 20 + 210 - 192 + 182 ^ 155 + 105 - 194 + 120;
        t.llllIlII[128] = 0x28 ^ 0x77 ^ (9 ^ 0x31);
        t.llllIlII[129] = 0xBD ^ 0x90 ^ (0x30 ^ 0x75);
        t.llllIlII[130] = 0x23 ^ 0x4A;
        t.llllIlII[131] = 23 + 232 - 64 + 55 ^ 148 + 55 - 191 + 144;
        t.llllIlII[132] = 15 + 123 - 49 + 119 ^ 109 + 44 - -17 + 18;
        t.llllIlII[133] = 0xEA ^ 0x87;
        t.llllIlII[134] = 0xC3 ^ 0xAD;
        t.llllIlII[135] = 0xC3 ^ 0xAC;
        t.llllIlII[136] = 126 + 69 - 16 + 38 ^ 58 + 166 - 75 + 20;
        t.llllIlII[137] = 0xA4 ^ 0xB1 ^ (0xF3 ^ 0x97);
        t.llllIlII[138] = 0x7C ^ 0xE;
        t.llllIlII[139] = 0x49 ^ 0x3A;
        t.llllIlII[140] = 162 + 27 - 19 + 30 ^ 54 + 37 - -78 + 19;
        t.llllIlII[141] = 0xF ^ 0x74 ^ (0x52 ^ 0x5C);
        t.llllIlII[142] = -(0xFFFFF5BF & 0x5AD5) & (0xFFFFFBFC & 0x77BF);
        t.llllIlII[143] = -(0xFFFFFF45 & 0x5EFB) & (0xFFFFDF6D & 0x7FFE);
        t.llllIlII[144] = 0xFFFFBFFE & 0x6ECD;
        t.llllIlII[145] = -(0xFFFF8E5F & 0x7DB5) & (0xFFFFEDBE & 0x7FFD);
        t.llllIlII[146] = 0xFFFFAFDD & 0x53A6;
        t.llllIlII[147] = 0xC2 ^ 0x88 ^ (0x3A ^ 6);
        t.llllIlII[148] = 0x6B ^ 0x1C;
        t.llllIlII[149] = 0xFFFFDCDE & 0x2FB7;
        t.llllIlII[150] = -(0xFFFFDF7F & 0x72CF) & (0xFFFFFFDF & 0x5FFF);
        t.llllIlII[151] = 0xFFFFCD4F & 0x3FFF;
        t.llllIlII[152] = 0xFFFFFDB9 & 0xFE7;
        t.llllIlII[153] = -(0xFFFFDCDE & 0x6B63) & (0xFFFFFEFF & 0x6FEF);
        t.llllIlII[154] = 0xFFFFBF7F & 0x5FCD;
        t.llllIlII[155] = -(0xFFFFF7F3 & 0x2EEE) & (0xFFFFBFF7 & Short.MAX_VALUE);
        t.llllIlII[156] = 0xFFFF9D57 & 0x6FFF;
        t.llllIlII[157] = 0xFFFF8D74 & 0x7FDF;
        t.llllIlII[158] = -(0xFFFFFB77 & 0x16CB) & (0xFFFFDFEA & 0x3FF7);
        t.llllIlII[159] = 0xFFFFEFDF & 0x1D7E;
        t.llllIlII[160] = 0xFFFFEEBF & 0x37DF;
        t.llllIlII[161] = 0xFFFF8F7B & 0x7DF4;
        t.llllIlII[162] = 0xFFFFAEF7 & 0x77AF;
        t.llllIlII[163] = 0xFFFFF5FF & 0xB2E;
        t.llllIlII[164] = 0xFFFF87B3 & 0x797F;
        t.llllIlII[165] = 0x45 ^ 4 ^ (0xAB ^ 0x92);
        t.llllIlII[166] = 67 + 84 - 75 + 125 ^ 109 + 55 - 104 + 116;
        t.llllIlII[167] = 51 + 153 - -43 + 7 ^ 25 + 8 - -74 + 25;
        t.llllIlII[168] = 0x3F ^ 0x44;
        t.llllIlII[169] = 0x66 ^ 0x1A;
        t.llllIlII[170] = 0x86 ^ 0x98 ^ (0x1B ^ 0x78);
        t.llllIlII[171] = 0xE ^ 0x70;
        t.llllIlII[172] = (0x36 ^ 0x68) + (0xAF ^ 0xAA) - (0x33 ^ 0x3D) + (0x4D ^ 0x67);
        t.llllIlII[173] = (0x83 ^ 0x85) + (0x3B ^ 0x75) - (0x44 ^ 0x70) + (0xA ^ 0x6A);
        t.llllIlII[174] = (0x52 ^ 0x44) + (0xC4 ^ 0x80) - (0x79 ^ 0x66) + (0x11 ^ 0x57);
        t.llllIlII[175] = (0xA6 ^ 0xBC) + (0x4F ^ 0x17) - (0xEA ^ 0xA2) + (0xE3 ^ 0xBB);
        t.llllIlII[176] = 4 + 115 - 20 + 32;
        t.llllIlII[177] = 116 + 80 - 174 + 110;
        t.llllIlII[178] = (0xFF ^ 0x94) + (0x15 ^ 3) - (0x9F ^ 0x9B) + (2 ^ 0xA);
        t.llllIlII[179] = 69 + 100 - 60 + 25;
        t.llllIlII[180] = (0xF1 ^ 0x93) + (0xB8 ^ 0xB6) - (0x49 ^ 0x56) + (0x8E ^ 0xB8);
        t.llllIlII[181] = 86 + 69 - 116 + 97;
        t.llllIlII[182] = 67 + 16 - 44 + 98;
        t.llllIlII[183] = (0x4A ^ 0xF) + (0x7E ^ 0x4D) - (0x15 ^ 7) + (0x6E ^ 0x4A);
        t.llllIlII[184] = (0x6E ^ 7) + 2 - -(0x9E ^ 0x84) + (0x4B ^ 0x4D);
        t.llllIlII[185] = 61 + 39 - 59 + 88 + (0x52 ^ 4) - (0xEC ^ 0x8C) + (0x67 ^ 0x72);
    }

    private static boolean llIIlIlIlll(int n2) {
        return n2 < 0;
    }

    private static boolean llIIlIllIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void aO() {
        void lIIllIllIllIIlI;
        BankLocation bankLocation = BankLocation.getNearest();
        if (t.llIIlIlIlIl(bankLocation) && t.llIIlIlIIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llllIIII[llllIlII[138]];
            a.a(bankLocation);
        }
        if (t.llIIlIlIlIl(lIIllIllIllIIlI) && t.llIIlIlIIIl(lIIllIllIllIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (t.llIIlIlIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlII[4]);
                0;
            }
            if (t.llIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = llllIIII[llllIlII[139]];
                if (t.llIIlIlIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llllIlII[6]);
                    0;
                }
                a.a(llllIlII[7], llllIlII[13]);
                a.a(llllIlII[8], llllIlII[0]);
                a.a(llllIlII[11], llllIlII[0]);
                a.a(llllIlII[12], llllIlII[3]);
                a.a(llllIlII[9], llllIlII[41]);
            }
        }
    }

    private static void llIIlIIlllI() {
        llllIIII = new String[llllIlII[185]];
        t.llllIIII[t.llllIlII[1]] = t."Finished buying items, switching back to quest";
        t.llllIIII[t.llllIlII[0]] = t."Nav to bank";
        t.llllIIII[t.llllIlII[5]] = t."Handling banking";
        t.llllIIII[t.llllIlII[10]] = t."We are missing quest supplies, switching to BUYING";
        t.llllIIII[t.llllIlII[6]] = t."Drink";
        t.llllIIII[t.llllIlII[3]] = t."Eat";
        t.llllIIII[t.llllIlII[16]] = t."Nav to start";
        t.llllIIII[t.llllIlII[17]] = t."Starting quest";
        t.llllIIII[t.llllIlII[18]] = t."King Roald";
        t.llllIIII[t.llllIlII[19]] = t."Nav to temple door";
        t.llllIIII[t.llllIlII[13]] = t."Interesting door";
        t.llllIIII[t.llllIlII[20]] = t."Large door";
        t.llllIIII[t.llllIlII[21]] = t."Open";
        t.llllIIII[t.llllIlII[22]] = t."Temple Guardian";
        t.llllIIII[t.llllIlII[23]] = t."Nav to doggo";
        t.llllIIII[t.llllIlII[24]] = t."Trapdoor";
        t.llllIIII[t.llllIlII[27]] = t."Temple Guardian";
        t.llllIIII[t.llllIlII[28]] = t."Trapdoor";
        t.llllIIII[t.llllIlII[29]] = t."Open";
        t.llllIIII[t.llllIlII[30]] = t."Open";
        t.llllIIII[t.llllIlII[31]] = t."Climb-down";
        t.llllIIII[t.llllIlII[32]] = t."Climb-down";
        t.llllIIII[t.llllIlII[33]] = t."Temple Guardian";
        t.llllIIII[t.llllIlII[34]] = t."Wield";
        t.llllIIII[t.llllIlII[35]] = t."Temple Guardian";
        t.llllIIII[t.llllIlII[36]] = t."Attack";
        t.llllIIII[t.llllIlII[37]] = t."Monument";
        t.llllIIII[t.llllIlII[38]] = t."Break";
        t.llllIIII[t.llllIlII[39]] = t."Nav to temple door";
        t.llllIIII[t.llllIlII[40]] = t."Interacting door";
        t.llllIIII[t.llllIlII[41]] = t."Large door";
        t.llllIIII[t.llllIlII[42]] = t."Open";
        t.llllIIII[t.llllIlII[43]] = t."tell the king";
        t.llllIIII[t.llllIlII[44]] = t."Nav to king";
        t.llllIIII[t.llllIlII[45]] = t."talk king";
        t.llllIIII[t.llllIlII[46]] = t."King Roald";
        t.llllIIII[t.llllIlII[47]] = t."Nav to jail";
        t.llllIIII[t.llllIlII[48]] = t."Interesting door";
        t.llllIIII[t.llllIlII[49]] = t."Cell door";
        t.llllIIII[t.llllIlII[50]] = t."Open";
        t.llllIIII[t.llllIlII[51]] = t."Golden key";
        t.llllIIII[t.llllIlII[52]] = t."Iron key";
        t.llllIIII[t.llllIlII[53]] = t."Nav to gold key tile";
        t.llllIIII[t.llllIlII[55]] = t."Attack";
        t.llllIIII[t.llllIlII[56]] = t."Golden key";
        t.llllIIII[t.llllIlII[57]] = t."Eat";
        t.llllIIII[t.llllIlII[58]] = t."Take";
        t.llllIIII[t.llllIlII[59]] = t."Golden key";
        t.llllIIII[t.llllIlII[60]] = t."Nav to statues";
        t.llllIIII[t.llllIlII[61]] = t."Finding key";
        t.llllIIII[t.llllIlII[15]] = t."Iron key";
        t.llllIIII[t.llllIlII[62]] = t."Murky water";
        t.llllIIII[t.llllIlII[63]] = t."Getting water";
        t.llllIIII[t.llllIlII[64]] = t."Bucket";
        t.llllIIII[t.llllIlII[66]] = t."Iron key";
        t.llllIIII[t.llllIlII[67]] = t."Murky water";
        t.llllIIII[t.llllIlII[68]] = t."Nav to jail";
        t.llllIIII[t.llllIlII[69]] = t."Interesting door";
        t.llllIIII[t.llllIlII[70]] = t."Iron key";
        t.llllIIII[t.llllIlII[71]] = t."Cell door";
        t.llllIIII[t.llllIlII[72]] = t."Drezel";
        t.llllIIII[t.llllIlII[73]] = t."Blessed water";
        t.llllIIII[t.llllIlII[74]] = t."Handling chat";
        t.llllIIII[t.llllIlII[75]] = t."Drezel";
        t.llllIIII[t.llllIlII[76]] = t."Entering cell";
        t.llllIIII[t.llllIlII[77]] = t."Cell door";
        t.llllIIII[t.llllIlII[78]] = t."Open";
        t.llllIIII[t.llllIlII[79]] = t."Blessed water";
        t.llllIIII[t.llllIlII[80]] = t."Coffin";
        t.llllIIII[t.llllIlII[81]] = t."Using water on coffin";
        t.llllIIII[t.llllIlII[82]] = t."Blessed water";
        t.llllIIII[t.llllIlII[83]] = t."Exiting cell";
        t.llllIIII[t.llllIlII[84]] = t."Cell door";
        t.llllIIII[t.llllIlII[85]] = t."Open";
        t.llllIIII[t.llllIlII[86]] = t."Drezel";
        t.llllIIII[t.llllIlII[87]] = t."Handling chat";
        t.llllIIII[t.llllIlII[88]] = t."Drezel";
        t.llllIIII[t.llllIlII[89]] = t."Entering cell";
        t.llllIIII[t.llllIlII[90]] = t."Cell door";
        t.llllIIII[t.llllIlII[91]] = t."Open";
        t.llllIIII[t.llllIlII[92]] = t."Nav to final tile";
        t.llllIIII[t.llllIlII[98]] = t."Trapdoor";
        t.llllIIII[t.llllIlII[99]] = t."Open";
        t.llllIIII[t.llllIlII[100]] = t."Open";
        t.llllIIII[t.llllIlII[101]] = t."Climb-down";
        t.llllIIII[t.llllIlII[102]] = t."Climb-down";
        t.llllIIII[t.llllIlII[103]] = t."Handling chat";
        t.llllIIII[t.llllIlII[104]] = t."Drezel";
        t.llllIIII[t.llllIlII[105]] = t."Pure essence";
        t.llllIIII[t.llllIlII[106]] = t."Turning in ess";
        t.llllIIII[t.llllIlII[107]] = t."Drezel";
        t.llllIIII[t.llllIlII[108]] = t."Pure essence";
        t.llllIIII[t.llllIlII[109]] = t."Grabbing more ess";
        t.llllIIII[t.llllIlII[110]] = t."Pure essence";
        t.llllIIII[t.llllIlII[111]] = t."Nav to final tile";
        t.llllIIII[t.llllIlII[112]] = t."Trapdoor";
        t.llllIIII[t.llllIlII[113]] = t."Open";
        t.llllIIII[t.llllIlII[114]] = t."Open";
        t.llllIIII[t.llllIlII[115]] = t."Climb-down";
        t.llllIIII[t.llllIlII[116]] = t."Climb-down";
        t.llllIIII[t.llllIlII[117]] = t."Finish & Unlock morty/start nature";
        t.llllIIII[t.llllIlII[119]] = t."Drezel";
        t.llllIIII[t.llllIlII[127]] = t."Iron key";
        t.llllIIII[t.llllIlII[128]] = t."Golden key";
        t.llllIIII[t.llllIlII[129]] = t."Golden key";
        t.llllIIII[t.llllIlII[130]] = t."Iron key";
        t.llllIIII[t.llllIlII[131]] = t."Nav to final tile";
        t.llllIIII[t.llllIlII[2]] = t."Trapdoor";
        t.llllIIII[t.llllIlII[132]] = t."Open";
        t.llllIIII[t.llllIlII[133]] = t."Open";
        t.llllIIII[t.llllIlII[134]] = t."Climb-down";
        t.llllIIII[t.llllIlII[135]] = t."Climb-down";
        t.llllIIII[t.llllIlII[136]] = t."Nav to bank";
        t.llllIIII[t.llllIlII[137]] = t."Handling banking";
        t.llllIIII[t.llllIlII[138]] = t."Nav to bank";
        t.llllIIII[t.llllIlII[139]] = t."Handling banking";
        t.llllIIII[t.llllIlII[140]] = t."Bucket";
        t.llllIIII[t.llllIlII[141]] = t."Bucket";
        t.llllIIII[t.llllIlII[147]] = t."Priest In Peril";
        t.llllIIII[t.llllIlII[148]] = t."ring of wealth (";
        t.llllIIII[t.llllIlII[165]] = t."I'm looking for a quest!";
        t.llllIIII[t.llllIlII[166]] = t."Yes.";
        t.llllIIII[t.llllIlII[167]] = t."Ok, let me help then.";
        t.llllIIII[t.llllIlII[168]] = t."Yep, now tell me what the problem is.";
        t.llllIIII[t.llllIlII[169]] = t."Sure.";
        t.llllIIII[t.llllIlII[170]] = t."You're right, we don't.";
        t.llllIIII[t.llllIlII[171]] = t."Is there anything else interesting to do around here?";
        t.llllIIII[t.llllIlII[172]] = t."Well, what is it, I may be able to help?";
        t.llllIIII[t.llllIlII[173]] = t."Yes, I'll go and look for him.";
        t.llllIIII[t.llllIlII[174]] = t."Yes, I'm sure.";
        t.llllIIII[t.llllIlII[175]] = t."I'll get going.";
        t.llllIIII[t.llllIlII[176]] = t."Ok, thanks.";
        t.llllIIII[t.llllIlII[177]] = t."I think I've solved the puzzle!";
        t.llllIIII[t.llllIlII[178]] = t."How can I help?";
        t.llllIIII[t.llllIlII[179]] = t."Roald sent me to check on Drezel.";
        t.llllIIII[t.llllIlII[180]] = t."Why is the river such a good defence?";
        t.llllIIII[t.llllIlII[181]] = t."You're right, we don't.";
        t.llllIIII[t.llllIlII[182]] = t."Yes, of course.";
        t.llllIIII[t.llllIlII[183]] = t."Do you know of anything I can do in Morytania?";
        t.llllIIII[t.llllIlII[184]] = t."Well, what is it, I may be able to help?";
    }
}

