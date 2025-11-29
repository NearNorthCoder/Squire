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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.I;
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

public class x
implements K {
    static /* synthetic */ boolean dd;
    public static final /* synthetic */ WorldPoint dK;
    private static /* synthetic */ String[] lIllIIIlII;
    public static final /* synthetic */ WorldPoint dM;
    public static /* synthetic */ int dR;
    public static final /* synthetic */ WorldPoint dL;
    private static /* synthetic */ int[] lIllIIIllI;
    public static final /* synthetic */ WorldPoint dN;
    public static final /* synthetic */ WorldPoint dH;
    static /* synthetic */ ArrayList<Integer> dS;
    public static /* synthetic */ int dQ;
    public static final /* synthetic */ WorldPoint dO;
    public static final /* synthetic */ WorldPoint dJ;
    static /* synthetic */ int dc;
    static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldPoint dI;
    public static /* synthetic */ boolean dP;
    public static /* synthetic */ List<d> bp;

    private static boolean lIIlIllIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void O() {
        d lllllllllllllllllllIIlIIllIlllIl;
        Object lllllllllllllllllllIIlIIllIllllI;
        block10: {
            block9: {
                int[] nArray = new int[lIllIIIllI[0]];
                nArray[x.lIllIIIllI[1]] = lIllIIIllI[14];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIllIIIllI[14], lIllIIIllI[0], lIllIIIllI[142]);
                    bp.add(d2);
                    "".length();
                }
                int[] nArray2 = new int[lIllIIIllI[0]];
                nArray2[x.lIllIIIllI[1]] = lIllIIIllI[8];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllllllIIlIIllIllllI = new d(lIllIIIllI[8], lIllIIIllI[0], lIllIIIllI[142]);
                    bp.add((d)lllllllllllllllllllIIlIIllIllllI);
                    "".length();
                }
                int[] nArray3 = new int[lIllIIIllI[0]];
                nArray3[x.lIllIIIllI[1]] = lIllIIIllI[11];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    lllllllllllllllllllIIlIIllIllllI = new d(lIllIIIllI[11], lIllIIIllI[3], j.bZ);
                    bp.add((d)lllllllllllllllllllIIlIIllIllllI);
                    "".length();
                }
                int[] nArray4 = new int[lIllIIIllI[0]];
                nArray4[x.lIllIIIllI[1]] = lIllIIIllI[12];
                if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    lllllllllllllllllllIIlIIllIllllI = new d(lIllIIIllI[12], lIllIIIllI[41], lIllIIIllI[143]);
                    bp.add((d)lllllllllllllllllllIIlIIllIllllI);
                    "".length();
                }
                int[] nArray5 = new int[lIllIIIllI[0]];
                nArray5[x.lIllIIIllI[1]] = lIllIIIllI[9];
                if (!x.lIIlIllIIllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIllIIIllI[0]];
                nArray6[x.lIllIIIllI[1]] = lIllIIIllI[9];
                if (!x.lIIlIllIIllll(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIllIIIllI[0]];
                nArray7[x.lIllIIIllI[1]] = lIllIIIllI[9];
                if (!x.lIIlIllIlIIII(Bank.getFirst((int[])nArray7).getQuantity(), lIllIIIllI[15])) break block10;
            }
            lllllllllllllllllllIIlIIllIllllI = new d(lIllIIIllI[9], lIllIIIllI[15], lIllIIIllI[107]);
            bp.add((d)lllllllllllllllllllIIlIIllIllllI);
            "".length();
        }
        if (x.lIIlIllIlIIIl(Bank.contains((Predicate)(lllllllllllllllllllIIlIIllIllllI = item -> item.getName().toLowerCase().contains(lIllIIIlII[lIllIIIllI[148]]))) ? 1 : 0)) {
            lllllllllllllllllllIIlIIllIlllIl = new d(lIllIIIllI[144], lIllIIIllI[3], lIllIIIllI[145]);
            bp.add(lllllllllllllllllllIIlIIllIlllIl);
            "".length();
        }
        int[] nArray = new int[lIllIIIllI[0]];
        nArray[x.lIllIIIllI[1]] = lIllIIIllI[7];
        if (x.lIIlIllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllllIIlIIllIlllIl = new d(lIllIIIllI[7], lIllIIIllI[51], lIllIIIllI[146]);
            bp.add(lllllllllllllllllllIIlIIllIlllIl);
            "".length();
        }
    }

    private static boolean lIIlIllIlIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIllIIllll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIlIllllII(String lllllllllllllllllllIIlIIllIIIllI, String lllllllllllllllllllIIlIIllIIIIll) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIIllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIllIIIIll.getBytes(StandardCharsets.UTF_8)), lIllIIIllI[18]), "DES");
            Cipher lllllllllllllllllllIIlIIllIIlIII = Cipher.getInstance("DES");
            lllllllllllllllllllIIlIIllIIlIII.init(lIllIIIllI[5], lllllllllllllllllllIIlIIllIIlIIl);
            return new String(lllllllllllllllllllIIlIIllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIlIIllIIIlll) {
            lllllllllllllllllllIIlIIllIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlIIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ac() {
        return lIllIIIllI[1];
    }

    static {
        x.lIIlIllIIllIl();
        x.lIIlIllIIllII();
        dH = new WorldPoint(lIllIIIllI[149], lIllIIIllI[150], lIllIIIllI[1]);
        dI = new WorldPoint(lIllIIIllI[151], lIllIIIllI[152], lIllIIIllI[1]);
        dJ = new WorldPoint(lIllIIIllI[25], lIllIIIllI[153], lIllIIIllI[1]);
        dK = new WorldPoint(lIllIIIllI[154], lIllIIIllI[155], lIllIIIllI[1]);
        dL = new WorldPoint(lIllIIIllI[156], lIllIIIllI[152], lIllIIIllI[5]);
        dM = new WorldPoint(lIllIIIllI[157], lIllIIIllI[158], lIllIIIllI[1]);
        dN = new WorldPoint(lIllIIIllI[159], lIllIIIllI[160], lIllIIIllI[1]);
        dO = new WorldPoint(lIllIIIllI[161], lIllIIIllI[162], lIllIIIllI[1]);
        bp = new ArrayList<d>();
        dQ = lIllIIIllI[163];
        dR = lIllIIIllI[164];
        String[] stringArray = new String[lIllIIIllI[31]];
        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[165]];
        stringArray[x.lIllIIIllI[0]] = lIllIIIlII[lIllIIIllI[166]];
        stringArray[x.lIllIIIllI[5]] = lIllIIIlII[lIllIIIllI[167]];
        stringArray[x.lIllIIIllI[10]] = lIllIIIlII[lIllIIIllI[168]];
        stringArray[x.lIllIIIllI[6]] = lIllIIIlII[lIllIIIllI[169]];
        stringArray[x.lIllIIIllI[3]] = lIllIIIlII[lIllIIIllI[170]];
        stringArray[x.lIllIIIllI[16]] = lIllIIIlII[lIllIIIllI[171]];
        stringArray[x.lIllIIIllI[17]] = lIllIIIlII[lIllIIIllI[172]];
        stringArray[x.lIllIIIllI[18]] = lIllIIIlII[lIllIIIllI[173]];
        stringArray[x.lIllIIIllI[19]] = lIllIIIlII[lIllIIIllI[174]];
        stringArray[x.lIllIIIllI[13]] = lIllIIIlII[lIllIIIllI[175]];
        stringArray[x.lIllIIIllI[20]] = lIllIIIlII[lIllIIIllI[176]];
        stringArray[x.lIllIIIllI[21]] = lIllIIIlII[lIllIIIllI[177]];
        stringArray[x.lIllIIIllI[22]] = lIllIIIlII[lIllIIIllI[178]];
        stringArray[x.lIllIIIllI[23]] = lIllIIIlII[lIllIIIllI[179]];
        stringArray[x.lIllIIIllI[24]] = lIllIIIlII[lIllIIIllI[180]];
        stringArray[x.lIllIIIllI[27]] = lIllIIIlII[lIllIIIllI[181]];
        stringArray[x.lIllIIIllI[28]] = lIllIIIlII[lIllIIIllI[182]];
        stringArray[x.lIllIIIllI[29]] = lIllIIIlII[lIllIIIllI[183]];
        stringArray[x.lIllIIIllI[30]] = lIllIIIlII[lIllIIIllI[184]];
        cy = stringArray;
        dS = new ArrayList();
    }

    private static boolean lIIlIllIlIIll(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        String[] stringArray = new String[lIllIIIllI[0]];
        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[141]];
        if (x.lIIlIllIlIlII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = lIllIIIllI[12];
            if (x.lIIlIllIlIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIllIIIllI[0]];
                nArray2[x.lIllIIIllI[1]] = lIllIIIllI[7];
                if (x.lIIlIllIIllll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIllIIIllI[0]];
                    nArray3[x.lIllIIIllI[1]] = lIllIIIllI[9];
                    if (x.lIIlIllIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIllIIIllI[0];
                        "".length();
                        if (" ".length() > 0) return n2 != 0;
                        return ((12 + 104 - 41 + 59 ^ 45 + 89 - 72 + 81) & (153 + 1 - 36 + 43 ^ 32 + 120 - 53 + 69 ^ -" ".length())) != 0;
                    }
                }
            }
        }
        n2 = lIllIIIllI[1];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bm() {
        if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
            void lllllllllllllllllllIIlIIlllIIlll;
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[131]];
            WorldArea worldArea = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
            if (x.lIIlIllIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lllllllllllllllllllIIlIIlllIIllI;
                WorldArea worldArea2 = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                if (x.lIIlIllIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                    "".length();
                    Time.sleepTicks((int)lIllIIIllI[0]);
                    "".length();
                }
                if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                        String[] stringArray = new String[lIllIIIllI[0]];
                        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[2]];
                        TileObject lllllllllllllllllllIIlIIlllIIlIl = TileObjects.getNearest((String[])stringArray);
                        if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIIlIl)) {
                            String[] stringArray2 = new String[lIllIIIllI[0]];
                            stringArray2[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[132]];
                            if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIIlIl.hasAction(stringArray2) ? 1 : 0)) {
                                lllllllllllllllllllIIlIIlllIIlIl.interact(lIllIIIlII[lIllIIIllI[133]]);
                                Time.sleepTicks((int)lIllIIIllI[10]);
                                "".length();
                            }
                            String[] stringArray3 = new String[lIllIIIllI[0]];
                            stringArray3[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[134]];
                            if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIIlIl.hasAction(stringArray3) ? 1 : 0)) {
                                lllllllllllllllllllIIlIIlllIIlIl.interact(lIllIIIlII[lIllIIIllI[135]]);
                                Time.sleepTicks((int)lIllIIIllI[10]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)dO);
                "".length();
                Time.sleepTicks((int)lIllIIIllI[0]);
                "".length();
            }
        }
    }

    private static boolean lIIlIllIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIllIlIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIllIllIII(Object object) {
        return object == null;
    }

    public static void bk() {
        if (x.lIIlIllIIllll(bn ? 1 : 0)) {
            b.a(bp);
            if (x.lIIlIllIlIIII(bp.size(), lIllIIIllI[0])) {
                System.out.println(lIllIIIlII[lIllIIIllI[1]]);
                bn = lIllIIIllI[1];
            }
        }
        if (x.lIIlIllIlIIIl(bn ? 1 : 0)) {
            TileObject lllllllllllllllllllIIlIIlllIllIl;
            TileObject lllllllllllllllllllIIlIIlllIlllI;
            BankLocation lllllllllllllllllllIIlIIlllIllll;
            if (x.lIIlIllIlIIII(e.j(lIllIIIllI[2]), lIllIIIllI[3])) {
                I.cJ();
            }
            if (x.lIIlIllIlIIIl(x.bp() ? 1 : 0) && x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[0]) && x.lIIlIllIlIIlI(e.j(lIllIIIllI[2]), lIllIIIllI[3])) {
                lllllllllllllllllllIIlIIlllIllll = BankLocation.getNearest();
                if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll) && x.lIIlIllIlIIIl(lllllllllllllllllllIIlIIlllIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[0]];
                    a.a(lllllllllllllllllllIIlIIlllIllll);
                }
                if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll) && x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (x.lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIllI[4]);
                        "".length();
                    }
                    if (x.lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[5]];
                        if (x.lIIlIllIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIIIllI[6]);
                            "".length();
                        }
                        if (x.lIIlIllIlIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIIIllI[5]);
                            "".length();
                        }
                        int[] nArray = new int[lIllIIIllI[3]];
                        nArray[x.lIllIIIllI[1]] = lIllIIIllI[7];
                        nArray[x.lIllIIIllI[0]] = lIllIIIllI[8];
                        nArray[x.lIllIIIllI[5]] = lIllIIIllI[9];
                        nArray[x.lIllIIIllI[10]] = lIllIIIllI[11];
                        nArray[x.lIllIIIllI[6]] = lIllIIIllI[12];
                        if (x.lIIlIllIlIIIl(e.b(nArray) ? 1 : 0)) {
                            x.O();
                            System.out.println(lIllIIIlII[lIllIIIllI[10]]);
                            bn = lIllIIIllI[0];
                            return;
                        }
                        int[] nArray2 = new int[lIllIIIllI[3]];
                        nArray2[x.lIllIIIllI[1]] = lIllIIIllI[7];
                        nArray2[x.lIllIIIllI[0]] = lIllIIIllI[8];
                        nArray2[x.lIllIIIllI[5]] = lIllIIIllI[9];
                        nArray2[x.lIllIIIllI[10]] = lIllIIIllI[11];
                        nArray2[x.lIllIIIllI[6]] = lIllIIIllI[12];
                        if (x.lIIlIllIIllll(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIllIIIllI[7], lIllIIIllI[13]);
                            a.a(lIllIIIllI[14], lIllIIIllI[0]);
                            a.a(lIllIIIllI[8], lIllIIIllI[0]);
                            a.a(lIllIIIllI[11], lIllIIIllI[6]);
                            a.a(lIllIIIllI[12], lIllIIIllI[13]);
                        }
                    }
                }
            }
            if (x.lIIlIllIIllll(Inventory.contains((int[])f.aU) ? 1 : 0) && x.lIIlIllIlIIII(Movement.getRunEnergy(), lIllIIIllI[15])) {
                Inventory.getFirst((int[])f.aU).interact(lIllIIIlII[lIllIIIllI[6]]);
                Time.sleepTicks((int)lIllIIIllI[0]);
                "".length();
            }
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = lIllIIIllI[12];
            if (x.lIIlIllIIllll(Inventory.contains((int[])nArray) ? 1 : 0) && x.lIIlIllIlIlIl(x.lIIlIllIIlllI(e.u(), 60.0))) {
                int[] nArray3 = new int[lIllIIIllI[0]];
                nArray3[x.lIllIIIllI[1]] = lIllIIIllI[12];
                Inventory.getFirst((int[])nArray3).interact(lIllIIIlII[lIllIIIllI[3]]);
                Time.sleepTicks((int)lIllIIIllI[0]);
                "".length();
            }
            if (x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[0]) && x.lIIlIllIIllll(x.bp() ? 1 : 0)) {
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[16]];
                    if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)dH);
                    "".length();
                    Time.sleepTicks((int)lIllIIIllI[0]);
                    "".length();
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[17]];
                    g.a(lIllIIIlII[lIllIIIllI[18]], cy);
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[0])) {
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[19]];
                    Movement.walkTo((WorldPoint)dI);
                    "".length();
                    Time.sleepTicks((int)lIllIIIllI[0]);
                    "".length();
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[13]];
                    if (x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIllI[0]];
                        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIIlII[lIllIIIllI[21]]);
                    }
                    g.a(cy);
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[5])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[22]];
                if (x.lIIlIllIllIII(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[23]];
                    String[] stringArray2 = new String[lIllIIIllI[0]];
                    stringArray2[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[24]];
                    lllllllllllllllllllIIlIIlllIllll = TileObjects.getNearest((String[])stringArray2);
                    if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll) && x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo((Locatable)lllllllllllllllllllIIlIIlllIllll), lIllIIIllI[6]) && x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                        g.a(cy);
                    }
                    if (!x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0) || x.lIIlIllIlIllI(Players.getLocal().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1])), lIllIIIllI[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1]));
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[10]);
                        "".length();
                    }
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[26], lIllIIIllI[1])), lIllIIIllI[3])) {
                    String[] stringArray3 = new String[lIllIIIllI[0]];
                    stringArray3[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[27]];
                    if (x.lIIlIllIllIII(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIllIIIllI[0]];
                        stringArray4[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[28]];
                        lllllllllllllllllllIIlIIlllIllll = TileObjects.getNearest((String[])stringArray4);
                        if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll) && x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIllIIIllI[0]];
                            stringArray5[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[29]];
                            if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllll.hasAction(stringArray5) ? 1 : 0)) {
                                lllllllllllllllllllIIlIIlllIllll.interact(lIllIIIlII[lIllIIIllI[30]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);
                                "".length();
                            }
                            String[] stringArray6 = new String[lIllIIIllI[0]];
                            stringArray6[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[31]];
                            if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllll.hasAction(stringArray6) ? 1 : 0)) {
                                lllllllllllllllllllIIlIIlllIllll.interact(lIllIIIlII[lIllIIIllI[32]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);
                                "".length();
                            }
                        }
                        g.a(cy);
                    }
                }
                String[] stringArray7 = new String[lIllIIIllI[0]];
                stringArray7[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[33]];
                if (x.lIIlIllIlIIll(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[lIllIIIllI[0]];
                    nArray4[x.lIllIIIllI[1]] = lIllIIIllI[14];
                    if (x.lIIlIllIIllll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIllIIIllI[0]];
                        nArray5[x.lIllIIIllI[1]] = lIllIIIllI[14];
                        if (x.lIIlIllIlIIIl(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIllIIIllI[0]];
                            nArray6[x.lIllIIIllI[1]] = lIllIIIllI[14];
                            Inventory.getFirst((int[])nArray6).interact(lIllIIIlII[lIllIIIllI[34]]);
                        }
                    }
                    if (x.lIIlIllIllIII(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[lIllIIIllI[0]];
                        stringArray8[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[35]];
                        NPCs.getNearest((String[])stringArray8).interact(lIllIIIlII[lIllIIIllI[36]]);
                        Time.sleepTicks((int)lIllIIIllI[5]);
                        "".length();
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[10])) {
                if (x.lIIlIllIlIIIl(dP ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                        String[] stringArray = new String[lIllIIIllI[0]];
                        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[37]];
                        if (x.lIIlIllIlIIll(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[lIllIIIllI[0]];
                            nArray7[x.lIllIIIllI[1]] = lIllIIIllI[7];
                            if (x.lIIlIllIIllll(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIllIIIllI[0]];
                                nArray8[x.lIllIIIllI[1]] = lIllIIIllI[7];
                                Inventory.getFirst((int[])nArray8).interact(lIllIIIlII[lIllIIIllI[38]]);
                                Time.sleepTicks((int)lIllIIIllI[3]);
                                "".length();
                            }
                        }
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[39]];
                        Movement.walkTo((WorldPoint)dI);
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dI), lIllIIIllI[5])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[40]];
                        if (x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIIllI[0]];
                            stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[41]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIIIlII[lIllIIIllI[42]]);
                        }
                        g.a(cy);
                        if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0) && x.lIIlIllIIllll(Dialog.getText().contains(lIllIIIlII[lIllIIIllI[43]]) ? 1 : 0)) {
                            dP = lIllIIIllI[0];
                        }
                    }
                }
                if (x.lIIlIllIIllll(dP ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[44]];
                        Movement.walkTo((WorldPoint)dH);
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dH), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[45]];
                        g.a(lIllIIIlII[lIllIIIllI[46]], cy);
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[6])) {
                dc = lIllIIIllI[1];
                if (x.lIIlIllIlIIIl(x.al() ? 1 : 0)) {
                    x.bo();
                }
                if (x.lIIlIllIIllll(x.al() ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[47]];
                        if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)dL);
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[48]];
                        if (x.lIIlIllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIllIIIllI[0]];
                            stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[49]];
                            TileObjects.getNearest((String[])stringArray).interact(lIllIIIlII[lIllIIIllI[50]]);
                        }
                        g.a(cy);
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[3])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[51]];
                if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[lIllIIIllI[0]];
                    stringArray9[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[52]];
                    if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dM), lIllIIIllI[17]) || x.lIIlIllIIllll(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[53]];
                            Movement.walkTo((WorldPoint)dM);
                            "".length();
                            Time.sleepTicks((int)lIllIIIllI[0]);
                            "".length();
                        }
                        if (!x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dM), lIllIIIllI[17]) || x.lIIlIllIlIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            if (x.lIIlIllIllIII(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIllIIIllI[0]];
                                nArray9[x.lIllIIIllI[1]] = lIllIIIllI[54];
                                NPCs.getNearest((int[])nArray9).interact(lIllIIIlII[lIllIIIllI[55]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);
                                "".length();
                            }
                            String[] stringArray10 = new String[lIllIIIllI[0]];
                            stringArray10[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[56]];
                            lllllllllllllllllllIIlIIlllIllll = TileItems.getNearest((String[])stringArray10);
                            if (x.lIIlIllIIllll(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIllIIIllI[0]];
                                nArray10[x.lIllIIIllI[1]] = lIllIIIllI[12];
                                Inventory.getFirst((int[])nArray10).interact(lIllIIIlII[lIllIIIllI[57]]);
                                Time.sleepTicks((int)lIllIIIllI[0]);
                                "".length();
                            }
                            if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll)) {
                                lllllllllllllllllllIIlIIlllIllll.interact(lIllIIIlII[lIllIIIllI[58]]);
                                Time.sleepTicks((int)lIllIIIllI[5]);
                                "".length();
                            }
                        }
                    }
                }
                String[] stringArray11 = new String[lIllIIIllI[0]];
                stringArray11[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[59]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIIllI[13])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[60]];
                        Movement.walkTo((WorldPoint)dN);
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                    if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dN), lIllIIIllI[13])) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[61]];
                        x.bl();
                    }
                }
                String[] stringArray12 = new String[lIllIIIllI[0]];
                stringArray12[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[15]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIllIIIllI[0]];
                    stringArray13[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[62]];
                    if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[63]];
                        String[] stringArray14 = new String[lIllIIIllI[0]];
                        stringArray14[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[64]];
                        int[] nArray11 = new int[lIllIIIllI[0]];
                        nArray11[x.lIllIIIllI[1]] = lIllIIIllI[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)lIllIIIllI[6]);
                        "".length();
                    }
                }
                String[] stringArray15 = new String[lIllIIIllI[0]];
                stringArray15[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[66]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[lIllIIIllI[0]];
                    stringArray16[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[67]];
                    if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[68]];
                            if (x.lIIlIllIIllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)dL);
                            "".length();
                            Time.sleepTicks((int)lIllIIIllI[0]);
                            "".length();
                        }
                        if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dL), lIllIIIllI[10])) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[69]];
                            String[] stringArray17 = new String[lIllIIIllI[0]];
                            stringArray17[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[70]];
                            String[] stringArray18 = new String[lIllIIIllI[0]];
                            stringArray18[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIllIIIllI[10]);
                            "".length();
                        }
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[16])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[72]];
                lllllllllllllllllllIIlIIlllIllll = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIllIIIllI[0]];
                stringArray19[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[73]];
                if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray19) ? 1 : 0) && x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll)) {
                    if (x.lIIlIllIIllll(Reachable.isInteractable((Locatable)lllllllllllllllllllIIlIIlllIllll) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[74]];
                        g.a(lIllIIIlII[lIllIIIllI[75]], cy);
                    }
                    if (x.lIIlIllIlIIIl(Reachable.isInteractable((Locatable)lllllllllllllllllllIIlIIlllIllll) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[76]];
                        String[] stringArray20 = new String[lIllIIIllI[0]];
                        stringArray20[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIllIIIlII[lIllIIIllI[78]]);
                        Time.sleepTicks((int)lIllIIIllI[5]);
                        "".length();
                    }
                }
                String[] stringArray21 = new String[lIllIIIllI[0]];
                stringArray21[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[79]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIllIIIllI[0]];
                    stringArray22[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[80]];
                    lllllllllllllllllllIIlIIlllIlllI = TileObjects.getNearest((String[])stringArray22);
                    if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIlllI)) {
                        if (x.lIIlIllIIllll(Reachable.isInteractable((Locatable)lllllllllllllllllllIIlIIlllIlllI) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[81]];
                            String[] stringArray23 = new String[lIllIIIllI[0]];
                            stringArray23[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(lllllllllllllllllllIIlIIlllIlllI);
                            Time.sleepTicks((int)lIllIIIllI[5]);
                            "".length();
                        }
                        if (x.lIIlIllIlIIIl(Reachable.isInteractable((Locatable)lllllllllllllllllllIIlIIlllIlllI) ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[83]];
                            String[] stringArray24 = new String[lIllIIIllI[0]];
                            stringArray24[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIllIIIlII[lIllIIIllI[85]]);
                            Time.sleepTicks((int)lIllIIIllI[5]);
                            "".length();
                        }
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[17])) {
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[86]];
                lllllllllllllllllllIIlIIlllIllll = NPCs.getNearest((String[])stringArray);
                if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllll)) {
                    if (x.lIIlIllIIllll(Reachable.isInteractable((Locatable)lllllllllllllllllllIIlIIlllIllll) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[87]];
                        g.a(lIllIIIlII[lIllIIIllI[88]], cy);
                    }
                    if (x.lIIlIllIlIIIl(Reachable.isInteractable((Locatable)lllllllllllllllllllIIlIIlllIllll) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[89]];
                        String[] stringArray25 = new String[lIllIIIllI[0]];
                        stringArray25[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIllIIIlII[lIllIIIllI[91]]);
                        Time.sleepTicks((int)lIllIIIllI[5]);
                        "".length();
                    }
                }
            }
            if (x.lIIlIllIlIIlI(e.j(dQ), lIllIIIllI[18])) {
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[92]];
                    lllllllllllllllllllIIlIIlllIllll = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
                    if (x.lIIlIllIlIIIl(lllllllllllllllllllIIlIIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lllllllllllllllllllIIlIIlllIlllI = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                        if (x.lIIlIllIlIIIl(lllllllllllllllllllIIlIIlllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                            "".length();
                            Time.sleepTicks((int)lIllIIIllI[0]);
                            "".length();
                        }
                        if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                                "".length();
                                Time.sleepTicks((int)lIllIIIllI[0]);
                                "".length();
                            }
                            if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                String[] stringArray = new String[lIllIIIllI[0]];
                                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[98]];
                                lllllllllllllllllllIIlIIlllIllIl = TileObjects.getNearest((String[])stringArray);
                                if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllIl)) {
                                    String[] stringArray26 = new String[lIllIIIllI[0]];
                                    stringArray26[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[99]];
                                    if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllIl.hasAction(stringArray26) ? 1 : 0)) {
                                        lllllllllllllllllllIIlIIlllIllIl.interact(lIllIIIlII[lIllIIIllI[100]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);
                                        "".length();
                                    }
                                    String[] stringArray27 = new String[lIllIIIllI[0]];
                                    stringArray27[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[101]];
                                    if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllIl.hasAction(stringArray27) ? 1 : 0)) {
                                        lllllllllllllllllllIIlIIlllIllIl.interact(lIllIIIlII[lIllIIIllI[102]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dO);
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[103]];
                    g.a(lIllIIIlII[lIllIIIllI[104]], cy);
                }
            }
            if (x.lIIlIllIllIIl(e.j(dQ), lIllIIIllI[13]) && x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[72])) {
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    String[] stringArray = new String[lIllIIIllI[0]];
                    stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[105]];
                    if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[106]];
                        if (x.lIIlIllIlIIII(dc, lIllIIIllI[0])) {
                            Z.lN += lIllIIIllI[0];
                            Z.p(AccBuilderShamans.m);
                            dc += lIllIIIllI[0];
                            Z.lN = lIllIIIllI[1];
                            dd = lIllIIIllI[1];
                        }
                        g.a(lIllIIIlII[lIllIIIllI[107]], cy);
                    }
                }
                String[] stringArray = new String[lIllIIIllI[0]];
                stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[108]];
                if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && x.lIIlIllIlIIII(e.j(dQ), lIllIIIllI[72])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[109]];
                    x.bn();
                }
                String[] stringArray28 = new String[lIllIIIllI[0]];
                stringArray28[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[110]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray28) ? 1 : 0) && x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3]) && x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[111]];
                    lllllllllllllllllllIIlIIlllIllll = new WorldArea(lIllIIIllI[93], lIllIIIllI[94], lIllIIIllI[60], lIllIIIllI[43], lIllIIIllI[1]);
                    if (x.lIIlIllIlIIIl(lllllllllllllllllllIIlIIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        lllllllllllllllllllIIlIIlllIlllI = new WorldArea(lIllIIIllI[95], lIllIIIllI[96], lIllIIIllI[48], lIllIIIllI[63], lIllIIIllI[1]);
                        if (x.lIIlIllIlIIIl(lllllllllllllllllllIIlIIlllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                            "".length();
                            Time.sleepTicks((int)lIllIIIllI[0]);
                            "".length();
                        }
                        if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1]));
                                "".length();
                                Time.sleepTicks((int)lIllIIIllI[0]);
                                "".length();
                            }
                            if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIllIIIllI[25], lIllIIIllI[97], lIllIIIllI[1])), lIllIIIllI[3])) {
                                String[] stringArray29 = new String[lIllIIIllI[0]];
                                stringArray29[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[112]];
                                lllllllllllllllllllIIlIIlllIllIl = TileObjects.getNearest((String[])stringArray29);
                                if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIllIl)) {
                                    String[] stringArray30 = new String[lIllIIIllI[0]];
                                    stringArray30[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[113]];
                                    if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllIl.hasAction(stringArray30) ? 1 : 0)) {
                                        lllllllllllllllllllIIlIIlllIllIl.interact(lIllIIIlII[lIllIIIllI[114]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);
                                        "".length();
                                    }
                                    String[] stringArray31 = new String[lIllIIIllI[0]];
                                    stringArray31[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[115]];
                                    if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllIl.hasAction(stringArray31) ? 1 : 0)) {
                                        lllllllllllllllllllIIlIIlllIllIl.interact(lIllIIIlII[lIllIIIllI[116]]);
                                        Time.sleepTicks((int)lIllIIIllI[10]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    if (x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)dO);
                        "".length();
                        Time.sleepTicks((int)lIllIIIllI[0]);
                        "".length();
                    }
                }
            }
            if (x.lIIlIllIllIIl(e.j(dQ), lIllIIIllI[72]) && x.lIIlIllIlIIII(e.j(dR), lIllIIIllI[3])) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[117]];
                if (x.lIIlIllIlIllI(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    x.bm();
                }
                if (x.lIIlIllIlIlll(Players.getLocal().getWorldLocation().distanceTo(dO), lIllIIIllI[3])) {
                    if (x.lIIlIllIlIIll(Widgets.get((int)lIllIIIllI[118], (int)lIllIIIllI[27]))) {
                        Mouse.click((int)Widgets.get((int)lIllIIIllI[118], (int)lIllIIIllI[27]).getClickPoint().getX(), (int)Widgets.get((int)lIllIIIllI[118], (int)lIllIIIllI[27]).getClickPoint().getY(), (boolean)lIllIIIllI[0]);
                        Time.sleepTicks((int)lIllIIIllI[10]);
                        "".length();
                    }
                    g.a(lIllIIIlII[lIllIIIllI[119]], cy);
                    g.a(cy);
                }
            }
            g.a(cy);
        }
    }

    private static String lIIlIlIlllllI(String lllllllllllllllllllIIlIIllIlIIIl, String lllllllllllllllllllIIlIIllIlIIII) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIIllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIlIIllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIlIIllIlIlIl.init(lIllIIIllI[5], lllllllllllllllllllIIlIIllIlIllI);
            return new String(lllllllllllllllllllIIlIIllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIlIIllIlIlII) {
            lllllllllllllllllllIIlIIllIlIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIIllII() {
        lIllIIIlII = new String[lIllIIIllI[185]];
        x.lIllIIIlII[x.lIllIIIllI[1]] = x.lIIlIlIllllII("yXcOqAmqWEgX3tqdf3Oug9iFYdGwVXbUAakx47dPhWn/1g5vpkMoC5p5+kHdoBvJ", "EmBOC");
        x.lIllIIIlII[x.lIllIIIllI[0]] = x.lIIlIlIllllIl("LSA6RjUMYS4HLwg=", "cALfA");
        x.lIllIIIlII[x.lIllIIIllI[5]] = x.lIIlIlIlllllI("VNR1vrayFPPB9t4o2uAAiZ2AbhmKag5u", "qyfhg");
        x.lIllIIIlII[x.lIllIIIllI[10]] = x.lIIlIlIllllIl("ASJUGRYzZxkRFyUuGh9EJzIRCxB2NAEIFDouEQtIdjQDERA1Lx0WA3YzG1gmAx49NiM=", "VGtxd");
        x.lIllIIIlII[x.lIllIIIllI[6]] = x.lIIlIlIllllII("kYKHNxgTGHs=", "GBygv");
        x.lIllIIIlII[x.lIllIIIllI[3]] = x.lIIlIlIllllII("mGHtqgssY6s=", "JvWLc");
        x.lIllIIIlII[x.lIllIIIllI[16]] = x.lIIlIlIllllII("3v1GutT6ItURnIW6a+RL/g==", "CkfVQ");
        x.lIllIIIlII[x.lIllIIIllI[17]] = x.lIIlIlIllllIl("PBooFy4GAC5FKxoLOhE=", "onIeZ");
        x.lIllIIIlII[x.lIllIIIllI[18]] = x.lIIlIlIllllIl("BCI4IFodJDcrHg==", "OKVGz");
        x.lIllIIIlII[x.lIllIIIllI[19]] = x.lIIlIlIllllII("BPHvEa/FS825Rs+Mn/G/InwMEhoLeddh", "vqFUO");
        x.lIllIIIlII[x.lIllIIIllI[13]] = x.lIIlIlIllllIl("KCUhEiAEOCEePAZrMRg9Ew==", "aKUwR");
        x.lIllIIIlII[x.lIllIIIllI[20]] = x.lIIlIlIllllIl("ACAiLDJsJT8kJQ==", "LAPKW");
        x.lIllIIIlII[x.lIllIIIllI[21]] = x.lIIlIlIllllIl("GCcHOA==", "WWbVC");
        x.lIllIIIlII[x.lIllIIIllI[22]] = x.lIIlIlIllllIl("IT0PEQoQeCUUBwc8CwAI", "uXbaf");
        x.lIllIIIlII[x.lIllIIIllI[23]] = x.lIIlIlIllllIl("HisbUAQ/agkfFzcl", "PJmpp");
        x.lIllIIIlII[x.lIllIIIllI[24]] = x.lIIlIlIllllIl("OTgyPQsCJSE=", "mJSMo");
        x.lIllIIIlII[x.lIllIIIllI[27]] = x.lIIlIlIllllII("x+obScj/HwG3oJYbwZTNYQ==", "wEgxt");
        x.lIllIIIlII[x.lIllIIIllI[28]] = x.lIIlIlIllllIl("ODgZGzQDJQo=", "lJxkP");
        x.lIllIIIlII[x.lIllIIIllI[29]] = x.lIIlIlIllllII("OCqooWN2FlA=", "ozVrS");
        x.lIllIIIlII[x.lIllIIIllI[30]] = x.lIIlIlIllllII("dDo1gLv+vnI=", "UNdWx");
        x.lIllIIIlII[x.lIllIIIllI[31]] = x.lIIlIlIlllllI("u8ojvrs2U5uKByhrmd7ShQ==", "zhqDj");
        x.lIllIIIlII[x.lIllIIIllI[32]] = x.lIIlIlIllllII("wjf63oT7aCyYXJBZa/M93w==", "mqIfh");
        x.lIllIIIlII[x.lIllIIIllI[33]] = x.lIIlIlIllllIl("MBQMPykBUSY6JBYVCC4r", "dqaOE");
        x.lIllIIIlII[x.lIllIIIllI[34]] = x.lIIlIlIlllllI("OrNoPgN6OIA=", "ZDaho");
        x.lIllIIIlII[x.lIllIIIllI[35]] = x.lIIlIlIllllII("8c8A737EhE/jylbf5p57dw==", "WARsG");
        x.lIllIIIlII[x.lIllIIIllI[36]] = x.lIIlIlIllllIl("AxkgLQ0p", "BmTLn");
        x.lIllIIIlII[x.lIllIIIllI[37]] = x.lIIlIlIllllII("09p3wrKnEi42F9YIWVSz1Q==", "FYKjc");
        x.lIllIIIlII[x.lIllIIIllI[38]] = x.lIIlIlIllllII("r7i46m6EPu4=", "YIbsB");
        x.lIllIIIlII[x.lIllIIIllI[39]] = x.lIIlIlIllllIl("Bxc8aT8mVj4sJjkaL2kvJhk4", "IvJIK");
        x.lIllIIIlII[x.lIllIIIllI[40]] = x.lIIlIlIllllIl("MTYhFR0ZOyEZAR94MR8ACg==", "xXUpo");
        x.lIllIIIlII[x.lIllIIIllI[41]] = x.lIIlIlIllllIl("CjEIMDNmNBU4JA==", "FPzWV");
        x.lIllIIIlII[x.lIllIIIllI[42]] = x.lIIlIlIllllII("jbUvB7Jbnoc=", "KIVgg");
        x.lIllIIIlII[x.lIllIIIllI[43]] = x.lIIlIlIllllII("W+zjjIIr/4tqql6kOeI0xg==", "BQEYQ");
        x.lIllIIIlII[x.lIllIIIllI[44]] = x.lIIlIlIlllllI("OHNKUod9YmBVaHY1EVSV0A==", "LYveE");
        x.lIllIIIlII[x.lIllIIIllI[45]] = x.lIIlIlIllllII("cQhwC+MQaczyX8Iu6XF7fA==", "upoyx");
        x.lIllIIIlII[x.lIllIIIllI[46]] = x.lIIlIlIlllllI("Z1g4WWIeSFoWVLzVLmI77w==", "ZPEHk");
        x.lIllIIIlII[x.lIllIIIllI[47]] = x.lIIlIlIlllllI("OvLCwOrwmNQ5hjzX7W4PuQ==", "LkCHe");
        x.lIllIIIlII[x.lIllIIIllI[48]] = x.lIIlIlIllllIl("CgAEKTomHQQlJiROFCMnMQ==", "CnpLH");
        x.lIllIIIlII[x.lIllIIIllI[49]] = x.lIIlIlIllllIl("MSovBnMWICwY", "rOCjS");
        x.lIllIIIlII[x.lIllIIIllI[50]] = x.lIIlIlIllllII("OPi6mGoWZNY=", "TLrGY");
        x.lIllIIIlII[x.lIllIIIllI[51]] = x.lIIlIlIllllIl("NBsVITUdVBIgKQ==", "styEP");
        x.lIllIIIlII[x.lIllIIIllI[52]] = x.lIIlIlIllllIl("HzspKGk9LD8=", "VIFFI");
        x.lIllIIIlII[x.lIllIIIllI[53]] = x.lIIlIlIlllllI("hrk6IPaoYK6C65OtsAvNTTiiWgsaZjYs", "RDNEb");
        x.lIllIIIlII[x.lIllIIIllI[55]] = x.lIIlIlIlllllI("REapjxREZmA=", "bRIJs");
        x.lIllIIIlII[x.lIllIIIllI[56]] = x.lIIlIlIlllllI("sZbIzvUgB2cnTqvzBzDzPg==", "XsLOP");
        x.lIllIIIlII[x.lIllIIIllI[57]] = x.lIIlIlIlllllI("dvA1qFIdsHM=", "gVLVl");
        x.lIllIIIlII[x.lIllIIIllI[58]] = x.lIIlIlIlllllI("jPmkYLN/KUE=", "fHTAr");
        x.lIllIIIlII[x.lIllIIIllI[59]] = x.lIIlIlIllllIl("EQ4tKAE4QSopHQ==", "VaALd");
        x.lIllIIIlII[x.lIllIIIllI[60]] = x.lIIlIlIllllII("twDDKork3DV7GmnSzhle8Q==", "OAlxL");
        x.lIllIIIlII[x.lIllIIIllI[61]] = x.lIIlIlIllllII("yDmT0EXJ/KDsIY1ILDEq2w==", "KhrOD");
        x.lIllIIIlII[x.lIllIIIllI[15]] = x.lIIlIlIllllIl("Cj8fB3IoKAk=", "CMpiR");
        x.lIllIIIlII[x.lIllIIIllI[62]] = x.lIIlIlIlllllI("0eRHnEAFl8/u9GXQw7ujQw==", "nYFPd");
        x.lIllIIIlII[x.lIllIIIllI[63]] = x.lIIlIlIllllIl("MwQnPgsaBnM9AwAEIQ==", "taSJb");
        x.lIllIIIlII[x.lIllIIIllI[64]] = x.lIIlIlIllllII("uutIpEq+H2k=", "UoCDD");
        x.lIllIIIlII[x.lIllIIIllI[66]] = x.lIIlIlIllllIl("AxkYKE0hDg4=", "JkwFm");
        x.lIllIIIlII[x.lIllIIIllI[67]] = x.lIIlIlIllllII("yXRlONv10q608wY0Jt9X3A==", "stwHP");
        x.lIllIIIlII[x.lIllIIIllI[68]] = x.lIIlIlIllllII("tkZJ3BIdLii1Rh7reSeuVw==", "BUJSj");
        x.lIllIIIlII[x.lIllIIIllI[69]] = x.lIIlIlIlllllI("/rA97f4V7MYdvoPAJd+++41rcCoVruTx", "CkZof");
        x.lIllIIIlII[x.lIllIIIllI[70]] = x.lIIlIlIllllII("qCgBNkcmhyl0KHf2iA1xCA==", "hxbXk");
        x.lIllIIIlII[x.lIllIIIllI[71]] = x.lIIlIlIllllIl("OwMOGkwcCQ0E", "xfbvl");
        x.lIllIIIlII[x.lIllIIIllI[72]] = x.lIIlIlIllllII("91foRZKwxwA=", "ouOCk");
        x.lIllIIIlII[x.lIllIIIllI[73]] = x.lIIlIlIllllIl("FgEMJgQxCUkiFiAIGw==", "TmiUw");
        x.lIllIIIlII[x.lIllIIIllI[74]] = x.lIIlIlIllllIl("PAsNLzQdBARrOxwLFw==", "tjcKX");
        x.lIllIIIlII[x.lIllIIIllI[75]] = x.lIIlIlIlllllI("CJ8N3gavFqI=", "jjZtc");
        x.lIllIIIlII[x.lIllIIIllI[76]] = x.lIIlIlIllllII("R6Hw5GVR4uFPMSk8FWMaLw==", "YsoPH");
        x.lIllIIIlII[x.lIllIIIllI[77]] = x.lIIlIlIllllIl("EywaAEw0Jhke", "PIvll");
        x.lIllIIIlII[x.lIllIIIllI[78]] = x.lIIlIlIllllIl("LjMgAQ==", "aCEoj");
        x.lIllIIIlII[x.lIllIIIllI[79]] = x.lIIlIlIllllII("DfCINbNEfEtAmqFETJSZqg==", "zpRwo");
        x.lIllIIIlII[x.lIllIIIllI[80]] = x.lIIlIlIllllIl("KRwzIxkE", "jsUEp");
        x.lIllIIIlII[x.lIllIIIllI[81]] = x.lIIlIlIllllII("5xo+WocC+SFAwdMP3jUv7/5rdEh0bO58", "dZigJ");
        x.lIllIIIlII[x.lIllIIIllI[82]] = x.lIIlIlIllllIl("CgMwPgotC3U6GDwKJw==", "HoUMy");
        x.lIllIIIlII[x.lIllIIIllI[83]] = x.lIIlIlIllllII("Dz+CNvVwDHLanwjlvKaykQ==", "jdNjw");
        x.lIllIIIlII[x.lIllIIIllI[84]] = x.lIIlIlIlllllI("7e7NEKQ3eq02lMG7ANLeNA==", "KPmTT");
        x.lIllIIIlII[x.lIllIIIllI[85]] = x.lIIlIlIllllII("GkGwkKR6rcc=", "frwsX");
        x.lIllIIIlII[x.lIllIIIllI[86]] = x.lIIlIlIllllII("hKxMSeZcvI0=", "XeWCD");
        x.lIllIIIlII[x.lIllIIIllI[87]] = x.lIIlIlIlllllI("VLiI6wApEFdrtD0cQNppZg==", "pAPBi");
        x.lIllIIIlII[x.lIllIIIllI[88]] = x.lIIlIlIllllIl("ISMqCz0J", "eQOqX");
        x.lIllIIIlII[x.lIllIIIllI[89]] = x.lIIlIlIlllllI("dB0EnVmGQtwlP79yRxfG0A==", "mQISH");
        x.lIllIIIlII[x.lIllIIIllI[90]] = x.lIIlIlIllllII("HviM9Ftt3xXk+TNR3jJsag==", "MWxRD");
        x.lIllIIIlII[x.lIllIIIllI[91]] = x.lIIlIlIllllII("fiOh6CVJyN0=", "uheXU");
        x.lIllIIIlII[x.lIllIIIllI[92]] = x.lIIlIlIlllllI("NHa5VdP+x2/qS3yDHVOsqXIBo2MKO2Jn", "tixQh");
        x.lIllIIIlII[x.lIllIIIllI[98]] = x.lIIlIlIllllIl("IzoPARwYJxw=", "wHnqx");
        x.lIllIIIlII[x.lIllIIIllI[99]] = x.lIIlIlIlllllI("hFWq2vtN3Qo=", "Yqhcn");
        x.lIllIIIlII[x.lIllIIIllI[100]] = x.lIIlIlIlllllI("NaQvtTLcYmk=", "dqbuz");
        x.lIllIIIlII[x.lIllIIIllI[101]] = x.lIIlIlIllllII("onCq62Mlv8IVQ2sWg4+Rog==", "RXXjw");
        x.lIllIIIlII[x.lIllIIIllI[102]] = x.lIIlIlIllllIl("NiY/JixYLjk8IA==", "uJVKN");
        x.lIllIIIlII[x.lIllIIIllI[103]] = x.lIIlIlIllllIl("MSkiFSUQJitRKhEpOA==", "yHLqI");
        x.lIllIIIlII[x.lIllIIIllI[104]] = x.lIIlIlIlllllI("SLBq95HEQuc=", "xIoTV");
        x.lIllIIIlII[x.lIllIIIllI[105]] = x.lIIlIlIlllllI("KNwh3msWagrz5g28Mq2Ong==", "TGSXe");
        x.lIllIIIlII[x.lIllIIIllI[106]] = x.lIIlIlIlllllI("NPE5rAnep8tFwuKJpmp8jA==", "HmiFS");
        x.lIllIIIlII[x.lIllIIIllI[107]] = x.lIIlIlIllllII("v2OpX7z8Ni0=", "zsFjZ");
        x.lIllIIIlII[x.lIllIIIllI[108]] = x.lIIlIlIllllII("9hY3B1wjCH/rSF3fEwwUxQ==", "bfKgR");
        x.lIllIIIlII[x.lIllIIIllI[109]] = x.lIIlIlIlllllI("BOFcJ+iks1qDAL3zbIHbE9StqUUwWKdY", "TkUSD");
        x.lIllIIIlII[x.lIllIIIllI[110]] = x.lIIlIlIlllllI("EkNUIARI2gpzV7c90wi24w==", "WqXLl");
        x.lIllIIIlII[x.lIllIIIllI[111]] = x.lIIlIlIllllIl("AgMuTyAjQj4GOi0OeBs9IAc=", "LbXoT");
        x.lIllIIIlII[x.lIllIIIllI[112]] = x.lIIlIlIllllII("b1TYxeU2dUnS82THmS3MTA==", "RnvBf");
        x.lIllIIIlII[x.lIllIIIllI[113]] = x.lIIlIlIllllIl("PRMRHw==", "rctqs");
        x.lIllIIIlII[x.lIllIIIllI[114]] = x.lIIlIlIllllIl("NjogLw==", "yJEAS");
        x.lIllIIIlII[x.lIllIIIllI[115]] = x.lIIlIlIlllllI("krZuCqHgeWXqtSAUZpVtuQ==", "wpSzO");
        x.lIllIIIlII[x.lIllIIIllI[116]] = x.lIIlIlIllllIl("FiIYFRF4Kh4PHQ==", "UNqxs");
        x.lIllIIIlII[x.lIllIIIllI[117]] = x.lIIlIlIllllII("mZC0KG6QrYKEZ0BZjhb9ncyylmfJ6LAEQX7+A8e/TFI7nrIS9XWuBg==", "DaIdJ");
        x.lIllIIIlII[x.lIllIIIllI[119]] = x.lIIlIlIllllIl("FDYtHyo8", "PDHeO");
        x.lIllIIIlII[x.lIllIIIllI[127]] = x.lIIlIlIllllIl("CjE5BkYoJi8=", "CCVhf");
        x.lIllIIIlII[x.lIllIIIllI[128]] = x.lIIlIlIllllIl("NS0eLBYcYhktCg==", "rBrHs");
        x.lIllIIIlII[x.lIllIIIllI[129]] = x.lIIlIlIllllII("1eGPJ/iFIxaQQ+0JhX3g8g==", "RqRgF");
        x.lIllIIIlII[x.lIllIIIllI[130]] = x.lIIlIlIllllII("V6qvI6Ho3uJhDuavzucnGA==", "XQdoQ");
        x.lIllIIIlII[x.lIllIIIllI[131]] = x.lIIlIlIllllII("kfBWwPJaQhNW4WhbrnmV82EYhkh20408", "aRzVV");
        x.lIllIIIlII[x.lIllIIIllI[2]] = x.lIIlIlIllllIl("IjkKCDwZJBk=", "vKkxX");
        x.lIllIIIlII[x.lIllIIIllI[132]] = x.lIIlIlIllllIl("LjMJBA==", "aCljj");
        x.lIllIIIlII[x.lIllIIIllI[133]] = x.lIIlIlIllllII("7bXJ6UQ29t0=", "oQltc");
        x.lIllIIIlII[x.lIllIIIllI[134]] = x.lIIlIlIlllllI("YOmjljGZx2rUA0kBBgAu4w==", "EjDFi");
        x.lIllIIIlII[x.lIllIIIllI[135]] = x.lIIlIlIllllIl("FSgqPBJ7ICwmHg==", "VDCQp");
        x.lIllIIIlII[x.lIllIIIllI[136]] = x.lIIlIlIllllIl("PgUaUDMfRA4RKRs=", "pdlpG");
        x.lIllIIIlII[x.lIllIIIllI[137]] = x.lIIlIlIlllllI("ynJ1jp1E+t1EoWuebQLwnDVA9Ka1w+Mp", "lruti");
        x.lIllIIIlII[x.lIllIIIllI[138]] = x.lIIlIlIlllllI("9kxSF0iCPlPyxq1kJREtnQ==", "btYpI");
        x.lIllIIIlII[x.lIllIIIllI[139]] = x.lIIlIlIllllII("oseyQM18UWA4Cp78jW5aNvGMJZUHZ7f4", "jxhfZ");
        x.lIllIIIlII[x.lIllIIIllI[140]] = x.lIIlIlIllllII("tfUztS5L/gE=", "CflNN");
        x.lIllIIIlII[x.lIllIIIllI[141]] = x.lIIlIlIllllII("jbQ7qscbKDg=", "faKEE");
        x.lIllIIIlII[x.lIllIIIllI[147]] = x.lIIlIlIllllII("LGVac+XBoU9HjV61z/j7cg==", "OQgAC");
        x.lIllIIIlII[x.lIllIIIllI[148]] = x.lIIlIlIllllII("jz88oK6O2iQ+NxK1hK1xjJNAw0kz54ZF", "aXrJB");
        x.lIllIIIlII[x.lIllIIIllI[165]] = x.lIIlIlIllllII("LSjsMrA7niSvp+3dxRldOB0kOfDxdLcSA0jZ7MOWWYw=", "sQmmv");
        x.lIllIIIlII[x.lIllIIIllI[166]] = x.lIIlIlIlllllI("JUPHQMEDu/o=", "QNpVJ");
        x.lIllIIIlII[x.lIllIIIllI[167]] = x.lIIlIlIllllII("6yMjhf/ekAUf+powDwuf84reW2B1+i/9", "addIR");
        x.lIllIIIlII[x.lIllIIIllI[168]] = x.lIIlIlIllllIl("DCMfeng7KRh2LDAqA3Y1MGYYPjkhZhs+PXU2HTk6OSMCdjEmaA==", "UFoVX");
        x.lIllIIIlII[x.lIllIIIllI[169]] = x.lIIlIlIlllllI("VSAkfrTElvQ=", "suASy");
        x.lIllIIIlII[x.lIllIIIllI[170]] = x.lIIlIlIlllllI("+gE/XYaCr3Ey2xhuZA2X1vq6A7BsL2LE", "mhWLY");
        x.lIllIIIlII[x.lIllIIIllI[171]] = x.lIIlIlIllllII("bMBdz7uTlBh6TxAuBgKtLhDVmTmY1TMzEokRcxslN4AA44RhfyDu3FQIr+oIbDNIeAAJhuWIzqA=", "BVMgO");
        x.lIllIIIlII[x.lIllIIIllI[172]] = x.lIIlIlIllllII("JrFcES2hiUD/vuuLAzRtgaFhCS6ynYhlo1bMw2TOI8bTEjGluZ4XYEZLMJwc3jDy", "UzTag");
        x.lIllIIIlII[x.lIllIIIllI[173]] = x.lIIlIlIllllII("Ya5u81Yy6eWx8JzUK5wWJhMB4AG9/DhO9XYqxZcSEsE=", "emQiT");
        x.lIllIIIlII[x.lIllIIIllI[174]] = x.lIIlIlIllllII("AhwY+zgTUlEIISVjMh/HkQ==", "aeIDv");
        x.lIllIIIlII[x.lIllIIIllI[175]] = x.lIIlIlIllllII("evsqvFOANn8/gOS5mESoXQ==", "YedTs");
        x.lIllIIIlII[x.lIllIIIllI[176]] = x.lIIlIlIllllII("WE9qsxdMltO9KpbBknbPgw==", "beOkG");
        x.lIllIIIlII[x.lIllIIIllI[177]] = x.lIIlIlIllllIl("EEoxMRo3AWUQVC8PZSocNRwgPVMtAiB5AywQPzUWeA==", "YjEYs");
        x.lIllIIIlII[x.lIllIIIllI[178]] = x.lIIlIlIllllIl("OSkGdgYQKFEfRRkjHSZa", "qFqVe");
        x.lIllIIIlII[x.lIllIIIllI[179]] = x.lIIlIlIlllllI("IfkMtbeJoqjGnynd29uI+DiE6A1iBjp0M5j6LRI1xHwBJPtG3Qs8xg==", "vknPF");
        x.lIllIIIlII[x.lIllIIIllI[180]] = x.lIIlIlIllllIl("IzE4cgsHeTU6B1QrKCQHBnkyJwEceSByBRs2JXIGET8kPAERZg==", "tYARb");
        x.lIllIIIlII[x.lIllIIIllI[181]] = x.lIIlIlIlllllI("+tEkF6sTuahOTpiXYEOY5Ex7wOK6sCKu", "ibKIO");
        x.lIllIIIlII[x.lIllIIIllI[182]] = x.lIIlIlIlllllI("6lGjxKGu/PRYMXm/qwDCHw==", "dnPpl");
        x.lIllIIIlII[x.lIllIIIllI[183]] = x.lIIlIlIlllllI("dfbz91Y33rmqbdAylaU31K01JAQ3tR5V399nKxQZ4kKXKgXK8SeoJ7DZjHkUZZ2q", "fciVy");
        x.lIllIIIlII[x.lIllIIIllI[184]] = x.lIIlIlIllllII("ay2BGw+bfYqtVhYsKiqnJvr9H9DuwICqdcdxV9e7pIRm6ZoWcpypnuRv9N6k771/", "vLQsU");
    }

    @Override
    public boolean af() {
        int n2;
        if (x.lIIlIllIllIIl(e.j(dQ), lIllIIIllI[72]) && x.lIIlIllIllIIl(e.j(dR), lIllIIIllI[3])) {
            n2 = lIllIIIllI[0];
            "".length();
            if ((0x64 ^ 0x60) < 0) {
                return ((0x18 ^ 0x78) & ~(0x7B ^ 0x1B)) != 0;
            }
        } else {
            n2 = lIllIIIllI[1];
        }
        return n2 != 0;
    }

    private static String lIIlIlIllllIl(String lllllllllllllllllllIIlIIlIllIllI, String lllllllllllllllllllIIlIIlIllIIII) {
        lllllllllllllllllllIIlIIlIllIllI = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIIlIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIlIIlIllIlII = new StringBuilder();
        char[] lllllllllllllllllllIIlIIlIllIIll = lllllllllllllllllllIIlIIlIllIIII.toCharArray();
        int lllllllllllllllllllIIlIIlIllIIlI = lIllIIIllI[1];
        char[] lllllllllllllllllllIIlIIlIlIllII = lllllllllllllllllllIIlIIlIllIllI.toCharArray();
        int lllllllllllllllllllIIlIIlIlIlIll = lllllllllllllllllllIIlIIlIlIllII.length;
        int lllllllllllllllllllIIlIIlIlIlIlI = lIllIIIllI[1];
        while (x.lIIlIllIlIIII(lllllllllllllllllllIIlIIlIlIlIlI, lllllllllllllllllllIIlIIlIlIlIll)) {
            char lllllllllllllllllllIIlIIlIllIlll = lllllllllllllllllllIIlIIlIlIllII[lllllllllllllllllllIIlIIlIlIlIlI];
            lllllllllllllllllllIIlIIlIllIlII.append((char)(lllllllllllllllllllIIlIIlIllIlll ^ lllllllllllllllllllIIlIIlIllIIll[lllllllllllllllllllIIlIIlIllIIlI % lllllllllllllllllllIIlIIlIllIIll.length]));
            "".length();
            ++lllllllllllllllllllIIlIIlIllIIlI;
            ++lllllllllllllllllllIIlIIlIlIlIlI;
            "".length();
            if (((0xA3 ^ 0x8B) & ~(0x56 ^ 0x7E)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIlIIlIllIlII);
    }

    private static void lIIlIllIIllIl() {
        lIllIIIllI = new int[186];
        x.lIllIIIllI[0] = " ".length();
        x.lIllIIIllI[1] = (155 + 143 - 241 + 187 ^ 17 + 160 - 36 + 33) & (" ".length() ^ (0x2B ^ 0x70) ^ -" ".length());
        x.lIllIIIllI[2] = 0x66 ^ 0xD;
        x.lIllIIIllI[3] = 0xC7 ^ 0xC2;
        x.lIllIIIllI[4] = 0xFFFFBFFE & 0x5389;
        x.lIllIIIllI[5] = "  ".length();
        x.lIllIIIllI[6] = 113 + 35 - 24 + 41 ^ 66 + 16 - -2 + 77;
        x.lIllIIIllI[7] = -(0xFFFFE8BB & 0x57E5) & (0xFFFFDFF7 & 0x7FEF);
        x.lIllIIIllI[8] = -(0xFFFFF88F & 0x6F71) & (0xFFFFEF97 & 0x7FED);
        x.lIllIIIllI[9] = -(0xFFFFE0F5 & 0x5F7F) & (0xFFFFFF75 & 0x5FFE);
        x.lIllIIIllI[10] = "   ".length();
        x.lIllIIIllI[11] = -(0xFFFFDDAF & 0x2A53) & (0xFFFFBDF7 & 0x7B5B);
        x.lIllIIIllI[12] = -(0xFFFFEE85 & 0x7D7F) & (0xFFFFFF7F & 0x6DFF);
        x.lIllIIIllI[13] = 0xAE ^ 0xA4;
        x.lIllIIIllI[14] = 0xFFFF8D77 & 0x77BB;
        x.lIllIIIllI[15] = 0x13 ^ 0x21;
        x.lIllIIIllI[16] = 80 + 142 - 102 + 79 ^ 180 + 143 - 130 + 0;
        x.lIllIIIllI[17] = 0x81 ^ 0x86;
        x.lIllIIIllI[18] = 8 ^ 0;
        x.lIllIIIllI[19] = 0x4F ^ 0x2D ^ (0xCE ^ 0xA5);
        x.lIllIIIllI[20] = 0x57 ^ 0x5C;
        x.lIllIIIllI[21] = 0xC9 ^ 0xC5;
        x.lIllIIIllI[22] = 29 + 91 - 57 + 64 ^ (0xF0 ^ 0x82);
        x.lIllIIIllI[23] = 0x44 ^ 0x4A;
        x.lIllIIIllI[24] = 0x11 ^ 0x1E;
        x.lIllIIIllI[25] = 0xFFFFEF5F & 0x1DED;
        x.lIllIIIllI[26] = 0xFFFFCFB2 & 0x3DFF;
        x.lIllIIIllI[27] = 0x35 ^ 0x25;
        x.lIllIIIllI[28] = 0x21 ^ 0x30;
        x.lIllIIIllI[29] = 0x2B ^ 0x39;
        x.lIllIIIllI[30] = 5 ^ 0x16;
        x.lIllIIIllI[31] = 0x7A ^ 0x6E;
        x.lIllIIIllI[32] = 5 + 93 - 15 + 62 ^ 55 + 66 - 105 + 116;
        x.lIllIIIllI[33] = 0x47 ^ 0x2E ^ 123 + 122 - 149 + 31;
        x.lIllIIIllI[34] = 0x7D ^ 0x3A ^ (0x4F ^ 0x1F);
        x.lIllIIIllI[35] = 0xE ^ 0x16;
        x.lIllIIIllI[36] = 0xB9 ^ 0x81 ^ (0x44 ^ 0x65);
        x.lIllIIIllI[37] = 0xB4 ^ 0xAE;
        x.lIllIIIllI[38] = 0x57 ^ 0x48 ^ (0x28 ^ 0x2C);
        x.lIllIIIllI[39] = 0x12 ^ 0xE;
        x.lIllIIIllI[40] = 125 + 84 - 143 + 64 ^ 43 + 90 - 66 + 92;
        x.lIllIIIllI[41] = 0xC8 ^ 0xA1 ^ (0xD5 ^ 0xA2);
        x.lIllIIIllI[42] = 0x59 ^ 0x46;
        x.lIllIIIllI[43] = 0x7D ^ 0x16 ^ (0x67 ^ 0x2C);
        x.lIllIIIllI[44] = 0x7B ^ 0x5A;
        x.lIllIIIllI[45] = 0x56 ^ 0x74;
        x.lIllIIIllI[46] = 0x46 ^ 0x5F ^ (0x1B ^ 0x21);
        x.lIllIIIllI[47] = 0x41 ^ 0x65;
        x.lIllIIIllI[48] = 0xAE ^ 0x8B;
        x.lIllIIIllI[49] = 129 + 34 - 139 + 130 ^ 88 + 86 - 27 + 41;
        x.lIllIIIllI[50] = 0x8B ^ 0xAC;
        x.lIllIIIllI[51] = 179 + 159 - 200 + 99 ^ 101 + 104 - 134 + 126;
        x.lIllIIIllI[52] = 0x40 ^ 0x69;
        x.lIllIIIllI[53] = 57 + 131 - 119 + 64 ^ 73 + 81 - 17 + 38;
        x.lIllIIIllI[54] = -(0xFFFFB73D & 0x5AE3) & (0xFFFF9FBE & Short.MAX_VALUE);
        x.lIllIIIllI[55] = 0x1D ^ 0x36;
        x.lIllIIIllI[56] = 0x9C ^ 0xB2 ^ "  ".length();
        x.lIllIIIllI[57] = 0x39 ^ 0 ^ (0x4B ^ 0x5F);
        x.lIllIIIllI[58] = 0x70 ^ 7 ^ (0xED ^ 0xB4);
        x.lIllIIIllI[59] = 0x5B ^ 0x74;
        x.lIllIIIllI[60] = 0x9E ^ 0xAE;
        x.lIllIIIllI[61] = 0x98 ^ 0xA9;
        x.lIllIIIllI[62] = 0x16 ^ 0x25;
        x.lIllIIIllI[63] = 0x4D ^ 0x79;
        x.lIllIIIllI[64] = 0x66 ^ 0x2E ^ (0x3F ^ 0x42);
        x.lIllIIIllI[65] = -(0xFFFFFEE5 & 0x717B) & (0xFFFFFDFD & Short.MAX_VALUE);
        x.lIllIIIllI[66] = 0xBE ^ 0xA5 ^ (0x77 ^ 0x5A);
        x.lIllIIIllI[67] = 0xF0 ^ 0xC7;
        x.lIllIIIllI[68] = 0x6D ^ 0x55;
        x.lIllIIIllI[69] = 0xB1 ^ 0x88;
        x.lIllIIIllI[70] = 0x2B ^ 0x11;
        x.lIllIIIllI[71] = 0xE9 ^ 0x86 ^ (0xC6 ^ 0x92);
        x.lIllIIIllI[72] = 0x78 ^ 0x44;
        x.lIllIIIllI[73] = 0xAA ^ 0x97;
        x.lIllIIIllI[74] = 0x4F ^ 0xC ^ (0x54 ^ 0x29);
        x.lIllIIIllI[75] = 0x59 ^ 0x66;
        x.lIllIIIllI[76] = (0x35 ^ 0x23) & ~(0x92 ^ 0x84) ^ (0xE2 ^ 0xA2);
        x.lIllIIIllI[77] = 0xC0 ^ 0x81;
        x.lIllIIIllI[78] = 180 + 13 - 140 + 142 ^ 81 + 75 - 56 + 29;
        x.lIllIIIllI[79] = 0xD9 ^ 0x9A;
        x.lIllIIIllI[80] = 0xD0 ^ 0x94;
        x.lIllIIIllI[81] = 0x73 ^ 0x36;
        x.lIllIIIllI[82] = 0xB9 ^ 0x8C ^ (0x28 ^ 0x5B);
        x.lIllIIIllI[83] = 0xFF ^ 0xB8;
        x.lIllIIIllI[84] = 37 + 135 - 148 + 116 ^ 161 + 188 - 331 + 178;
        x.lIllIIIllI[85] = 0xA6 ^ 0xBD ^ (0x4B ^ 0x19);
        x.lIllIIIllI[86] = 0xE2 ^ 0xA8;
        x.lIllIIIllI[87] = 90 + 49 - 116 + 113 ^ 143 + 74 - 154 + 132;
        x.lIllIIIllI[88] = 0xCA ^ 0x99 ^ (0xB0 ^ 0xAF);
        x.lIllIIIllI[89] = 0xD ^ 0x40;
        x.lIllIIIllI[90] = 0x6F ^ 0x21;
        x.lIllIIIllI[91] = 0x46 ^ 0x65 ^ (0x74 ^ 0x18);
        x.lIllIIIllI[92] = 0x79 ^ 0x29;
        x.lIllIIIllI[93] = 0xFFFF9F77 & 0x6DCF;
        x.lIllIIIllI[94] = 0xFFFFB6D7 & 0x6FBF;
        x.lIllIIIllI[95] = -(0xFFFFB6B7 & 0x5B4C) & (0xFFFF9FBF & 0x7F7F);
        x.lIllIIIllI[96] = -(0xFFFFB4B9 & 0x5B57) & (0xFFFFDFB6 & 0x3DDF);
        x.lIllIIIllI[97] = 0xFFFFCDB8 & 0x3FF7;
        x.lIllIIIllI[98] = 0x47 ^ 0x3F ^ (0x7F ^ 0x56);
        x.lIllIIIllI[99] = 36 + 238 - 130 + 106 ^ 55 + 27 - 15 + 101;
        x.lIllIIIllI[100] = 0xD3 ^ 0xC3 ^ (0x32 ^ 0x71);
        x.lIllIIIllI[101] = 114 + 23 - -1 + 93 ^ 6 + 153 - 112 + 132;
        x.lIllIIIllI[102] = 4 ^ 0x1D ^ (0x40 ^ 0xC);
        x.lIllIIIllI[103] = 160 + 129 - 205 + 125 ^ 68 + 107 - 113 + 73;
        x.lIllIIIllI[104] = 0x56 ^ 0x74 ^ (0x74 ^ 1);
        x.lIllIIIllI[105] = 0xE4 ^ 0xBC;
        x.lIllIIIllI[106] = 0x99 ^ 0x93 ^ (0 ^ 0x53);
        x.lIllIIIllI[107] = 0x48 ^ 0x12;
        x.lIllIIIllI[108] = 0xF8 ^ 0xBC ^ (0x73 ^ 0x6C);
        x.lIllIIIllI[109] = 0xF0 ^ 0xAC;
        x.lIllIIIllI[110] = 0xD7 ^ 0x8A;
        x.lIllIIIllI[111] = 0x58 ^ 6;
        x.lIllIIIllI[112] = 0xA ^ 0x46 ^ (0x65 ^ 0x76);
        x.lIllIIIllI[113] = 0xEE ^ 0x92 ^ (0x82 ^ 0x9E);
        x.lIllIIIllI[114] = 0xCF ^ 0xAE;
        x.lIllIIIllI[115] = 0x16 ^ 0x75 ^ " ".length();
        x.lIllIIIllI[116] = 0x76 ^ 0x15;
        x.lIllIIIllI[117] = 0x79 ^ 0x1D;
        x.lIllIIIllI[118] = 97 + 36 - 71 + 91;
        x.lIllIIIllI[119] = 52 + 133 - 76 + 58 ^ 68 + 161 - 98 + 63;
        x.lIllIIIllI[120] = 0xFFFF8DE9 & 0x7FBE;
        x.lIllIIIllI[121] = 0xFFFFCFEE & 0x3DBB;
        x.lIllIIIllI[122] = -(0xFFFFB291 & 0x7F6F) & (0xFFFFFFA7 & 0x3FFF);
        x.lIllIIIllI[123] = 0xFFFFBDAD & 0x4FFB;
        x.lIllIIIllI[124] = 0xFFFFEFA7 & 0x1DFE;
        x.lIllIIIllI[125] = 0xFFFFBDFF & 0x4FAB;
        x.lIllIIIllI[126] = -(0xFFFFDE7F & 0x73C3) & (0xFFFFDFFF & 0x7FE7);
        x.lIllIIIllI[127] = 0x4B ^ 0x2D;
        x.lIllIIIllI[128] = 49 + 178 - 63 + 49 ^ 85 + 53 - 58 + 98;
        x.lIllIIIllI[129] = 0x6E ^ 6;
        x.lIllIIIllI[130] = 0x62 ^ 0x43 ^ (0x1A ^ 0x52);
        x.lIllIIIllI[131] = 0xF3 ^ 0xC3 ^ (0xE4 ^ 0xBE);
        x.lIllIIIllI[132] = 148 + 118 - 264 + 230 ^ 68 + 41 - 84 + 107;
        x.lIllIIIllI[133] = 0x10 ^ 0x7D;
        x.lIllIIIllI[134] = 0x3A ^ 0x54;
        x.lIllIIIllI[135] = 0xE6 ^ 0x89;
        x.lIllIIIllI[136] = 0xE1 ^ 0x91;
        x.lIllIIIllI[137] = 50 + 5 - -3 + 141 ^ 29 + 178 - 201 + 176;
        x.lIllIIIllI[138] = 0xD3 ^ 0xA1;
        x.lIllIIIllI[139] = 0x21 ^ 0x52;
        x.lIllIIIllI[140] = 0xE2 ^ 0x96;
        x.lIllIIIllI[141] = " ".length() ^ (0x56 ^ 0x22);
        x.lIllIIIllI[142] = -(0xFFFF98DB & 0x7FFC) & (0xFFFFBBFF & Short.MAX_VALUE);
        x.lIllIIIllI[143] = -(0xFFFFFEF7 & 0x6389) & (0xFFFFEBFC & 0x77AF);
        x.lIllIIIllI[144] = 0xFFFFAEEE & 0x7FDD;
        x.lIllIIIllI[145] = 0xFFFFE7BB & 0x79EC;
        x.lIllIIIllI[146] = -(0xFFFFF5EB & 0x5E76) & (0xFFFFF7FD & 0x5FE7);
        x.lIllIIIllI[147] = 0xC ^ 0x7A;
        x.lIllIIIllI[148] = 0x7E ^ 9;
        x.lIllIIIllI[149] = 0xFFFFFEF7 & 0xD9E;
        x.lIllIIIllI[150] = 0xFFFFDFDD & 0x2DB3;
        x.lIllIIIllI[151] = 0xFFFFAFDF & 0x5D6F;
        x.lIllIIIllI[152] = 0xFFFFEFBB & 0x1DE5;
        x.lIllIIIllI[153] = -(0xFFFFF1C7 & 0x1F3A) & (0xFFFFFFBF & 0x37EF);
        x.lIllIIIllI[154] = -(0xFFFFBFFF & 0x6093) & (0xFFFFBFFF & 0x7FDF);
        x.lIllIIIllI[155] = -(0xFFFFEFED & 0x76FB) & (0xFFFFFFFE & Short.MAX_VALUE);
        x.lIllIIIllI[156] = 0xFFFFCDFF & 0x3F57;
        x.lIllIIIllI[157] = 0xFFFFCFF6 & 0x3D5D;
        x.lIllIIIllI[158] = 0xFFFF9FF3 & 0x6DAC;
        x.lIllIIIllI[159] = -(0xFFFF96AE & 0x6BF3) & (0xFFFFDFFF & 0x2FFF);
        x.lIllIIIllI[160] = 0xFFFFBFBF & 0x66DF;
        x.lIllIIIllI[161] = -(0xFFFFF387 & 0x5C79) & (0xFFFFFD7D & 0x5FF2);
        x.lIllIIIllI[162] = 0xFFFFE6E7 & 0x3FBF;
        x.lIllIIIllI[163] = 0xFFFFA56F & 0x5BBE;
        x.lIllIIIllI[164] = 0xFFFFA33B & 0x5DF7;
        x.lIllIIIllI[165] = 0x68 ^ 0x20 ^ (0x9B ^ 0xAB);
        x.lIllIIIllI[166] = 0x6D ^ 0x14;
        x.lIllIIIllI[167] = 116 + 170 - 168 + 81 ^ 40 + 37 - -103 + 9;
        x.lIllIIIllI[168] = 0x66 ^ 0x1D;
        x.lIllIIIllI[169] = 0x72 ^ 0xE;
        x.lIllIIIllI[170] = 0x27 ^ 0x5A ^ (0xD8 ^ 0x8F) & ~(0xF2 ^ 0xA5);
        x.lIllIIIllI[171] = 0xBB ^ 0xC5;
        x.lIllIIIllI[172] = (0xC0 ^ 0x89) + (0xE5 ^ 0xC2) - (0x7C ^ 0x42) + (0xED ^ 0xA0);
        x.lIllIIIllI[173] = 106 + 104 - 114 + 32;
        x.lIllIIIllI[174] = 108 + 95 - 78 + 4;
        x.lIllIIIllI[175] = 119 + 2 - 13 + 22;
        x.lIllIIIllI[176] = 130 + 88 - 99 + 12;
        x.lIllIIIllI[177] = 96 + 49 - 86 + 73;
        x.lIllIIIllI[178] = 25 + 12 - -69 + 27;
        x.lIllIIIllI[179] = 98 + 45 - 26 + 17;
        x.lIllIIIllI[180] = (0xDC ^ 0xB6) + (0x13 ^ 8) - (119 + 38 - 59 + 31) + (29 + 5 - -79 + 18);
        x.lIllIIIllI[181] = (0xDD ^ 0x9E) + (0xE9 ^ 0x9E) - (0x17 ^ 0x21) + (0x7C ^ 0x78);
        x.lIllIIIllI[182] = (0xFA ^ 0x8E) + (0x34 ^ 0x60) - (133 + 91 - 58 + 5) + (0xCA ^ 0xA6);
        x.lIllIIIllI[183] = 67 + 70 - 100 + 101;
        x.lIllIIIllI[184] = 9 + 12 - -101 + 9 + (0x25 ^ 1) - (0x58 ^ 0x68) + (0x58 ^ 0x4C);
        x.lIllIIIllI[185] = (0x68 ^ 0x61) + (0x66 ^ 0) - (0x71 ^ 0x53) + (0x7A ^ 0x45);
    }

    /*
     * WARNING - void declaration
     */
    private static void bo() {
        void lllllllllllllllllllIIlIIlllIIIIl;
        BankLocation bankLocation = BankLocation.getNearest();
        if (x.lIIlIllIlIIll(bankLocation) && x.lIIlIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[138]];
            a.a(bankLocation);
        }
        if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIIIIl) && x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (x.lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIllI[4]);
                "".length();
            }
            if (x.lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[139]];
                if (x.lIIlIllIlIlII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIllIIIllI[6]);
                    "".length();
                }
                a.a(lIllIIIllI[7], lIllIIIllI[13]);
                a.a(lIllIIIllI[8], lIllIIIllI[0]);
                a.a(lIllIIIllI[11], lIllIIIllI[0]);
                a.a(lIllIIIllI[12], lIllIIIllI[3]);
                a.a(lIllIIIllI[9], lIllIIIllI[41]);
            }
        }
    }

    private static boolean lIIlIllIlIlII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bp() {
        int n2;
        String[] stringArray = new String[lIllIIIllI[0]];
        stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[140]];
        if (x.lIIlIllIlIlII(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = lIllIIIllI[12];
            if (x.lIIlIllIlIlII(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIllIIIllI[0]];
                nArray2[x.lIllIIIllI[1]] = lIllIIIllI[11];
                if (x.lIIlIllIlIlII(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[lIllIIIllI[0]];
                    nArray3[x.lIllIIIllI[1]] = lIllIIIllI[7];
                    if (x.lIIlIllIIllll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIllIIIllI[0];
                        "".length();
                        if (-(0xBE ^ 0xB4 ^ (0xBD ^ 0xB3)) <= 0) return n2 != 0;
                        return ((11 + 171 - 163 + 215 ^ 161 + 49 - 173 + 125) & (0xB0 ^ 0xBF ^ (0x51 ^ 0x16) ^ -" ".length())) != 0;
                    }
                }
            }
        }
        n2 = lIllIIIllI[1];
        return n2 != 0;
    }

    private static int lIIlIllIIlllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static void bn() {
        void lllllllllllllllllllIIlIIlllIIIll;
        BankLocation bankLocation = BankLocation.getNearest();
        if (x.lIIlIllIlIIll(bankLocation) && x.lIIlIllIlIIIl(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[136]];
            a.a(bankLocation);
        }
        if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIIIll) && x.lIIlIllIIllll(lllllllllllllllllllIIlIIlllIIIll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (x.lIIlIllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIllI[4]);
                "".length();
            }
            if (x.lIIlIllIIllll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIlII[lIllIIIllI[137]];
                if (x.lIIlIllIlIlII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIllIIIllI[6]);
                    "".length();
                }
                a.a(lIllIIIllI[7], lIllIIIllI[13]);
                a.a(lIllIIIllI[11], lIllIIIllI[0]);
                a.a(lIllIIIllI[9], lIllIIIllI[41]);
            }
        }
    }

    private static void bl() {
        dS.add(lIllIIIllI[120]);
        "".length();
        dS.add(lIllIIIllI[121]);
        "".length();
        dS.add(lIllIIIllI[122]);
        "".length();
        dS.add(lIllIIIllI[123]);
        "".length();
        dS.add(lIllIIIllI[124]);
        "".length();
        dS.add(lIllIIIllI[125]);
        "".length();
        dS.add(lIllIIIllI[126]);
        "".length();
        while (x.lIIlIllIlIIIl(dS.isEmpty() ? 1 : 0) && x.lIIlIllIlIIIl(dS.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIllIIIllI[0]];
            stringArray[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[127]];
            if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                "".length();
                if ("  ".length() != "   ".length()) break;
                return;
            }
            int[] nArray = new int[lIllIIIllI[0]];
            nArray[x.lIllIIIllI[1]] = dS.get(lIllIIIllI[1]);
            TileObject lllllllllllllllllllIIlIIlllIlIll = TileObjects.getNearest((int[])nArray);
            if (x.lIIlIllIlIIll(lllllllllllllllllllIIlIIlllIlIll)) {
                String[] stringArray2 = new String[lIllIIIllI[0]];
                stringArray2[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[128]];
                if (x.lIIlIllIIllll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIllIIIllI[0]];
                    stringArray3[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(lllllllllllllllllllIIlIIlllIlIll);
                    Time.sleepTicks((int)lIllIIIllI[3]);
                    "".length();
                }
            }
            String[] stringArray4 = new String[lIllIIIllI[0]];
            stringArray4[x.lIllIIIllI[1]] = lIllIIIlII[lIllIIIllI[130]];
            if (x.lIIlIllIlIIIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                dS.remove(lIllIIIllI[1]);
                "".length();
                Time.sleepTicks((int)lIllIIIllI[5]);
                "".length();
            }
            "".length();
            if ("  ".length() > 0) continue;
            return;
        }
    }

    private static boolean lIIlIllIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public String ae() {
        return lIllIIIlII[lIllIIIllI[147]];
    }

    @Override
    public int ad() {
        try {
            x.bk();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() > (0 ^ 0x19 ^ (0x93 ^ 0x8E))) {
            return (37 + 40 - -105 + 12 ^ 80 + 79 - 86 + 66) & (0x6F ^ 0x2D ^ (0xAD ^ 0xA6) ^ -" ".length());
        }
        return lIllIIIllI[117];
    }
}

