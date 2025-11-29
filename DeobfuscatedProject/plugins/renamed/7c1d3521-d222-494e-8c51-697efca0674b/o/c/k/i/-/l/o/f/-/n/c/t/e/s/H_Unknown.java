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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.Y_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class H_Unknown
implements ac {
    static /* synthetic */ ArrayList<Integer> gb;
    public static /* synthetic */ List<d> bv;
    public static final /* synthetic */ WorldPoint fW;
    public static final /* synthetic */ WorldPoint fT;
    public static final /* synthetic */ WorldPoint fY;
    static /* synthetic */ String[] cE;
    public static final /* synthetic */ WorldPoint fV;
    public static final /* synthetic */ WorldPoint fS;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint fU;
    public static final /* synthetic */ WorldPoint fX;
    private static /* synthetic */ String[] llIllllIll;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int fJ;
    public static final /* synthetic */ WorldPoint fZ;
    public static /* synthetic */ int fK;
    private static /* synthetic */ int[] llIlllllII;
    public static /* synthetic */ boolean ga;
    static /* synthetic */ boolean dj;

    @Override
    public boolean ah() {
        int n2;
        if (H.lIlllIllllIll(e.j(fJ), llIlllllII[72]) && H.lIlllIllllIll(e.j(fK), llIlllllII[3])) {
            n2 = llIlllllII[0];
            0;
            if ((1 & (1 ^ -1)) >= 2) {
                return ((76 + 164 - 84 + 11 ^ 125 + 87 - 122 + 72) & (0x81 ^ 0xC5 ^ (0x2F ^ 0x6E) ^ -1)) != 0;
            }
        } else {
            n2 = llIlllllII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void bN() {
        void var16;
        BankLocation bankLocation = BankLocation.getNearest();
        if (H.lIlllIlllIlIl(bankLocation) && H.lIlllIlllIIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIll[llIlllllII[138]];
            a.a(bankLocation);
        }
        if (H.lIlllIlllIlIl(var16) && H.lIlllIlllIIIl(var16.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (H.lIlllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllllII[4]);
                0;
            }
            if (H.lIlllIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIll[llIlllllII[139]];
                if (H.lIlllIlllIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIlllllII[6]);
                    0;
                }
                a.a(llIlllllII[7], llIlllllII[13]);
                a.a(llIlllllII[8], llIlllllII[0]);
                a.a(llIlllllII[11], llIlllllII[0]);
                a.a(llIlllllII[12], llIlllllII[3]);
                a.a(llIlllllII[9], llIlllllII[41]);
            }
        }
    }

    private static String lIlllIllIllII(String var4, String var9) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(llIlllllII[5], var17);
            return new String(var22.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean ae() {
        return llIlllllII[1];
    }

    private static int lIlllIlllIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    private static void bM() {
        void var15;
        BankLocation bankLocation = BankLocation.getNearest();
        if (H.lIlllIlllIlIl(bankLocation) && H.lIlllIlllIIll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIllllIll[llIlllllII[136]];
            a.a(bankLocation);
        }
        if (H.lIlllIlllIlIl(var15) && H.lIlllIlllIIIl(var15.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (H.lIlllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllllII[4]);
                0;
            }
            if (H.lIlllIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIllllIll[llIlllllII[137]];
                if (H.lIlllIlllIllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIlllllII[6]);
                    0;
                }
                a.a(llIlllllII[7], llIlllllII[13]);
                a.a(llIlllllII[11], llIlllllII[0]);
                a.a(llIlllllII[9], llIlllllII[41]);
            }
        }
    }

    private static boolean lIlllIlllIlIl(Object object) {
        return object != null;
    }

    private static void Q() {
        d var14;
        Object var2;
        block10: {
            block9: {
                int[] nArray = new int[llIlllllII[0]];
                nArray[H.llIlllllII[1]] = llIlllllII[14];
                if (H.lIlllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(llIlllllII[14], llIlllllII[0], llIlllllII[142]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[llIlllllII[0]];
                nArray2[H.llIlllllII[1]] = llIlllllII[8];
                if (H.lIlllIlllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var2 = new d(llIlllllII[8], llIlllllII[0], llIlllllII[142]);
                    bv.add((d)var2);
                    0;
                }
                int[] nArray3 = new int[llIlllllII[0]];
                nArray3[H.llIlllllII[1]] = llIlllllII[11];
                if (H.lIlllIlllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var2 = new d(llIlllllII[11], llIlllllII[3], j.cf);
                    bv.add((d)var2);
                    0;
                }
                int[] nArray4 = new int[llIlllllII[0]];
                nArray4[H.llIlllllII[1]] = llIlllllII[12];
                if (H.lIlllIlllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var2 = new d(llIlllllII[12], llIlllllII[41], llIlllllII[143]);
                    bv.add((d)var2);
                    0;
                }
                int[] nArray5 = new int[llIlllllII[0]];
                nArray5[H.llIlllllII[1]] = llIlllllII[9];
                if (!H.lIlllIlllIIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[llIlllllII[0]];
                nArray6[H.llIlllllII[1]] = llIlllllII[9];
                if (!H.lIlllIlllIIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[llIlllllII[0]];
                nArray7[H.llIlllllII[1]] = llIlllllII[9];
                if (!H.lIlllIlllIIlI(Bank.getFirst((int[])nArray7).getQuantity(), llIlllllII[15])) break block10;
            }
            var2 = new d(llIlllllII[9], llIlllllII[15], llIlllllII[107]);
            bv.add((d)var2);
            0;
        }
        if (H.lIlllIlllIIll(Bank.contains((Predicate)(var2 = item -> item.getName().toLowerCase().contains(llIllllIll[llIlllllII[148]]))) ? 1 : 0)) {
            var14 = new d(llIlllllII[144], llIlllllII[3], llIlllllII[145]);
            bv.add(var14);
            0;
        }
        int[] nArray = new int[llIlllllII[0]];
        nArray[H.llIlllllII[1]] = llIlllllII[7];
        if (H.lIlllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var14 = new d(llIlllllII[7], llIlllllII[51], llIlllllII[146]);
            bv.add(var14);
            0;
        }
    }

    private static boolean lIlllIllllIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        H.lIlllIllIllll();
        H.lIlllIllIlllI();
        fS = new WorldPoint(llIlllllII[149], llIlllllII[150], llIlllllII[1]);
        fT = new WorldPoint(llIlllllII[151], llIlllllII[152], llIlllllII[1]);
        fU = new WorldPoint(llIlllllII[25], llIlllllII[153], llIlllllII[1]);
        fV = new WorldPoint(llIlllllII[154], llIlllllII[155], llIlllllII[1]);
        fW = new WorldPoint(llIlllllII[156], llIlllllII[152], llIlllllII[5]);
        fX = new WorldPoint(llIlllllII[157], llIlllllII[158], llIlllllII[1]);
        fY = new WorldPoint(llIlllllII[159], llIlllllII[160], llIlllllII[1]);
        fZ = new WorldPoint(llIlllllII[161], llIlllllII[162], llIlllllII[1]);
        bv = new ArrayList<d>();
        fJ = llIlllllII[163];
        fK = llIlllllII[164];
        String[] stringArray = new String[llIlllllII[31]];
        stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[165]];
        stringArray[H.llIlllllII[0]] = llIllllIll[llIlllllII[166]];
        stringArray[H.llIlllllII[5]] = llIllllIll[llIlllllII[167]];
        stringArray[H.llIlllllII[10]] = llIllllIll[llIlllllII[168]];
        stringArray[H.llIlllllII[6]] = llIllllIll[llIlllllII[169]];
        stringArray[H.llIlllllII[3]] = llIllllIll[llIlllllII[170]];
        stringArray[H.llIlllllII[16]] = llIllllIll[llIlllllII[171]];
        stringArray[H.llIlllllII[17]] = llIllllIll[llIlllllII[172]];
        stringArray[H.llIlllllII[18]] = llIllllIll[llIlllllII[173]];
        stringArray[H.llIlllllII[19]] = llIllllIll[llIlllllII[174]];
        stringArray[H.llIlllllII[13]] = llIllllIll[llIlllllII[175]];
        stringArray[H.llIlllllII[20]] = llIllllIll[llIlllllII[176]];
        stringArray[H.llIlllllII[21]] = llIllllIll[llIlllllII[177]];
        stringArray[H.llIlllllII[22]] = llIllllIll[llIlllllII[178]];
        stringArray[H.llIlllllII[23]] = llIllllIll[llIlllllII[179]];
        stringArray[H.llIlllllII[24]] = llIllllIll[llIlllllII[180]];
        stringArray[H.llIlllllII[27]] = llIllllIll[llIlllllII[181]];
        stringArray[H.llIlllllII[28]] = llIllllIll[llIlllllII[182]];
        stringArray[H.llIlllllII[29]] = llIllllIll[llIlllllII[183]];
        stringArray[H.llIlllllII[30]] = llIllllIll[llIlllllII[184]];
        cE = stringArray;
        gb = new ArrayList();
    }

    private static boolean lIlllIlllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIllllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public int af() {
        try {
            H.cf();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (3 < 0) {
            return (198 + 195 - 231 + 51 ^ 127 + 100 - 181 + 92) & (0xDF ^ 0x83 ^ 3 ^ -1);
        }
        return llIlllllII[117];
    }

    private static String lIlllIllIllIl(String var8, String var1) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llIlllllII[18]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIlllllII[5], var28);
            return new String(var11.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void ch() {
        if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
            void var29;
            AccBuilderSotf.c = llIllllIll[llIlllllII[131]];
            WorldArea worldArea = new WorldArea(llIlllllII[93], llIlllllII[94], llIlllllII[60], llIlllllII[43], llIlllllII[1]);
            if (H.lIlllIlllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var27;
                WorldArea worldArea2 = new WorldArea(llIlllllII[95], llIlllllII[96], llIlllllII[48], llIlllllII[63], llIlllllII[1]);
                if (H.lIlllIlllIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                    0;
                    Time.sleepTicks((int)llIlllllII[0]);
                    0;
                }
                if (H.lIlllIlllIIIl(var27.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                    if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                        String[] stringArray = new String[llIlllllII[0]];
                        stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[2]];
                        TileObject var13 = TileObjects.getNearest((String[])stringArray);
                        if (H.lIlllIlllIlIl(var13)) {
                            String[] stringArray2 = new String[llIlllllII[0]];
                            stringArray2[H.llIlllllII[1]] = llIllllIll[llIlllllII[132]];
                            if (H.lIlllIlllIIIl(var13.hasAction(stringArray2) ? 1 : 0)) {
                                var13.interact(llIllllIll[llIlllllII[133]]);
                                Time.sleepTicks((int)llIlllllII[10]);
                                0;
                            }
                            String[] stringArray3 = new String[llIlllllII[0]];
                            stringArray3[H.llIlllllII[1]] = llIllllIll[llIlllllII[134]];
                            if (H.lIlllIlllIIIl(var13.hasAction(stringArray3) ? 1 : 0)) {
                                var13.interact(llIllllIll[llIlllllII[135]]);
                                Time.sleepTicks((int)llIlllllII[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (H.lIlllIlllIIIl(var29.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)fZ);
                0;
                Time.sleepTicks((int)llIlllllII[0]);
                0;
            }
        }
    }

    private static boolean lIlllIllllIlI(Object object) {
        return object == null;
    }

    private static String lIlllIllIlIll(String var21, String var24) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var19 = var24.toCharArray();
        int var6 = llIlllllII[1];
        char[] var12 = var21.toCharArray();
        int var7 = var12.length;
        int var23 = llIlllllII[1];
        while (H.lIlllIlllIIlI(var23, var7)) {
            char var20 = var12[var23];
            var25.append((char)(var20 ^ var19[var6 % var19.length]));
            0;
            ++var6;
            ++var23;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIlllllII[0]];
        stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[141]];
        if (H.lIlllIlllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIlllllII[0]];
            nArray[H.llIlllllII[1]] = llIlllllII[12];
            if (H.lIlllIlllIllI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlllllII[0]];
                nArray2[H.llIlllllII[1]] = llIlllllII[7];
                if (H.lIlllIlllIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIlllllII[0]];
                    nArray3[H.llIlllllII[1]] = llIlllllII[9];
                    if (H.lIlllIlllIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llIlllllII[0];
                        0;
                        if (2 >= 1) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llIlllllII[1];
        return n2 != 0;
    }

    private static boolean lIlllIlllIlII(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String ag() {
        return llIllllIll[llIlllllII[147]];
    }

    private static boolean lIlllIlllIIIl(int n2) {
        return n2 != 0;
    }

    public static void cf() {
        if (H.lIlllIlllIIIl(bt ? 1 : 0)) {
            b.a(bv);
            if (H.lIlllIlllIIlI(bv.size(), llIlllllII[0])) {
                System.out.println(llIllllIll[llIlllllII[1]]);
                bt = llIlllllII[1];
            }
        }
        if (H.lIlllIlllIIll(bt ? 1 : 0)) {
            TileObject var5;
            TileObject var3;
            BankLocation var10;
            if (H.lIlllIlllIIlI(e.j(llIlllllII[2]), llIlllllII[3])) {
                Y.eq();
            }
            if (H.lIlllIlllIIll(H.ci() ? 1 : 0) && H.lIlllIlllIIlI(e.j(fJ), llIlllllII[0]) && H.lIlllIlllIlII(e.j(llIlllllII[2]), llIlllllII[3])) {
                var10 = BankLocation.getNearest();
                if (H.lIlllIlllIlIl(var10) && H.lIlllIlllIIll(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[0]];
                    a.a(var10);
                }
                if (H.lIlllIlllIlIl(var10) && H.lIlllIlllIIIl(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (H.lIlllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIlllllII[4]);
                        0;
                    }
                    if (H.lIlllIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[5]];
                        if (H.lIlllIlllIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIlllllII[6]);
                            0;
                        }
                        if (H.lIlllIlllIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIlllllII[5]);
                            0;
                        }
                        int[] nArray = new int[llIlllllII[3]];
                        nArray[H.llIlllllII[1]] = llIlllllII[7];
                        nArray[H.llIlllllII[0]] = llIlllllII[8];
                        nArray[H.llIlllllII[5]] = llIlllllII[9];
                        nArray[H.llIlllllII[10]] = llIlllllII[11];
                        nArray[H.llIlllllII[6]] = llIlllllII[12];
                        if (H.lIlllIlllIIll(e.c(nArray) ? 1 : 0)) {
                            H.Q();
                            System.out.println(llIllllIll[llIlllllII[10]]);
                            bt = llIlllllII[0];
                            return;
                        }
                        int[] nArray2 = new int[llIlllllII[3]];
                        nArray2[H.llIlllllII[1]] = llIlllllII[7];
                        nArray2[H.llIlllllII[0]] = llIlllllII[8];
                        nArray2[H.llIlllllII[5]] = llIlllllII[9];
                        nArray2[H.llIlllllII[10]] = llIlllllII[11];
                        nArray2[H.llIlllllII[6]] = llIlllllII[12];
                        if (H.lIlllIlllIIIl(e.c(nArray2) ? 1 : 0)) {
                            a.a(llIlllllII[7], llIlllllII[13]);
                            a.a(llIlllllII[14], llIlllllII[0]);
                            a.a(llIlllllII[8], llIlllllII[0]);
                            a.a(llIlllllII[11], llIlllllII[6]);
                            a.a(llIlllllII[12], llIlllllII[13]);
                        }
                    }
                }
            }
            if (H.lIlllIlllIIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && H.lIlllIlllIIlI(Movement.getRunEnergy(), llIlllllII[15])) {
                Inventory.getFirst((int[])f.ba).interact(llIllllIll[llIlllllII[6]]);
                Time.sleepTicks((int)llIlllllII[0]);
                0;
            }
            int[] nArray = new int[llIlllllII[0]];
            nArray[H.llIlllllII[1]] = llIlllllII[12];
            if (H.lIlllIlllIIIl(Inventory.contains((int[])nArray) ? 1 : 0) && H.lIlllIlllIlll(H.lIlllIlllIIII(e.w(), 60.0))) {
                int[] nArray3 = new int[llIlllllII[0]];
                nArray3[H.llIlllllII[1]] = llIlllllII[12];
                Inventory.getFirst((int[])nArray3).interact(llIllllIll[llIlllllII[3]]);
                Time.sleepTicks((int)llIlllllII[0]);
                0;
            }
            if (H.lIlllIlllIIlI(e.j(fJ), llIlllllII[0]) && H.lIlllIlllIIIl(H.ci() ? 1 : 0)) {
                if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[16]];
                    if (H.lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)fS);
                    0;
                    Time.sleepTicks((int)llIlllllII[0]);
                    0;
                }
                if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[17]];
                    g.a(llIllllIll[llIlllllII[18]], cE);
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[0])) {
                if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[19]];
                    Movement.walkTo((WorldPoint)fT);
                    0;
                    Time.sleepTicks((int)llIlllllII[0]);
                    0;
                }
                if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[13]];
                    if (H.lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[llIlllllII[0]];
                        stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[20]];
                        TileObjects.getNearest((String[])stringArray).interact(llIllllIll[llIlllllII[21]]);
                    }
                    g.a(cE);
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[5])) {
                String[] stringArray = new String[llIlllllII[0]];
                stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[22]];
                if (H.lIlllIllllIlI(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[23]];
                    String[] stringArray2 = new String[llIlllllII[0]];
                    stringArray2[H.llIlllllII[1]] = llIllllIll[llIlllllII[24]];
                    var10 = TileObjects.getNearest((String[])stringArray2);
                    if (H.lIlllIlllIlIl(var10) && H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo((Locatable)var10), llIlllllII[6]) && H.lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                        g.a(cE);
                    }
                    if (!H.lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0) || H.lIlllIllllIII(Players.getLocal().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[26], llIlllllII[1])), llIlllllII[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[26], llIlllllII[1]));
                        0;
                        Time.sleepTicks((int)llIlllllII[10]);
                        0;
                    }
                }
                if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[26], llIlllllII[1])), llIlllllII[3])) {
                    String[] stringArray3 = new String[llIlllllII[0]];
                    stringArray3[H.llIlllllII[1]] = llIllllIll[llIlllllII[27]];
                    if (H.lIlllIllllIlI(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[llIlllllII[0]];
                        stringArray4[H.llIlllllII[1]] = llIllllIll[llIlllllII[28]];
                        var10 = TileObjects.getNearest((String[])stringArray4);
                        if (H.lIlllIlllIlIl(var10) && H.lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[llIlllllII[0]];
                            stringArray5[H.llIlllllII[1]] = llIllllIll[llIlllllII[29]];
                            if (H.lIlllIlllIIIl(var10.hasAction(stringArray5) ? 1 : 0)) {
                                var10.interact(llIllllIll[llIlllllII[30]]);
                                Time.sleepTicks((int)llIlllllII[5]);
                                0;
                            }
                            String[] stringArray6 = new String[llIlllllII[0]];
                            stringArray6[H.llIlllllII[1]] = llIllllIll[llIlllllII[31]];
                            if (H.lIlllIlllIIIl(var10.hasAction(stringArray6) ? 1 : 0)) {
                                var10.interact(llIllllIll[llIlllllII[32]]);
                                Time.sleepTicks((int)llIlllllII[5]);
                                0;
                            }
                        }
                        g.a(cE);
                    }
                }
                String[] stringArray7 = new String[llIlllllII[0]];
                stringArray7[H.llIlllllII[1]] = llIllllIll[llIlllllII[33]];
                if (H.lIlllIlllIlIl(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[llIlllllII[0]];
                    nArray4[H.llIlllllII[1]] = llIlllllII[14];
                    if (H.lIlllIlllIIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[llIlllllII[0]];
                        nArray5[H.llIlllllII[1]] = llIlllllII[14];
                        if (H.lIlllIlllIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[llIlllllII[0]];
                            nArray6[H.llIlllllII[1]] = llIlllllII[14];
                            Inventory.getFirst((int[])nArray6).interact(llIllllIll[llIlllllII[34]]);
                        }
                    }
                    if (H.lIlllIllllIlI(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[llIlllllII[0]];
                        stringArray8[H.llIlllllII[1]] = llIllllIll[llIlllllII[35]];
                        NPCs.getNearest((String[])stringArray8).interact(llIllllIll[llIlllllII[36]]);
                        Time.sleepTicks((int)llIlllllII[5]);
                        0;
                    }
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[10])) {
                if (H.lIlllIlllIIll(ga ? 1 : 0)) {
                    if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                        String[] stringArray = new String[llIlllllII[0]];
                        stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[37]];
                        if (H.lIlllIlllIlIl(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[llIlllllII[0]];
                            nArray7[H.llIlllllII[1]] = llIlllllII[7];
                            if (H.lIlllIlllIIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llIlllllII[0]];
                                nArray8[H.llIlllllII[1]] = llIlllllII[7];
                                Inventory.getFirst((int[])nArray8).interact(llIllllIll[llIlllllII[38]]);
                                Time.sleepTicks((int)llIlllllII[3]);
                                0;
                            }
                        }
                        AccBuilderSotf.c = llIllllIll[llIlllllII[39]];
                        Movement.walkTo((WorldPoint)fT);
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                    if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fT), llIlllllII[5])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[40]];
                        if (H.lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIlllllII[0]];
                            stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[41]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllllIll[llIlllllII[42]]);
                        }
                        g.a(cE);
                        if (H.lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0) && H.lIlllIlllIIIl(Dialog.getText().contains(llIllllIll[llIlllllII[43]]) ? 1 : 0)) {
                            ga = llIlllllII[0];
                        }
                    }
                }
                if (H.lIlllIlllIIIl(ga ? 1 : 0)) {
                    if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[44]];
                        Movement.walkTo((WorldPoint)fS);
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                    if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fS), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[45]];
                        g.a(llIllllIll[llIlllllII[46]], cE);
                    }
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[6])) {
                di = llIlllllII[1];
                if (H.lIlllIlllIIll(H.an() ? 1 : 0)) {
                    H.bN();
                }
                if (H.lIlllIlllIIIl(H.an() ? 1 : 0)) {
                    if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[47]];
                        if (H.lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)fW);
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                    if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[48]];
                        if (H.lIlllIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[llIlllllII[0]];
                            stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[49]];
                            TileObjects.getNearest((String[])stringArray).interact(llIllllIll[llIlllllII[50]]);
                        }
                        g.a(cE);
                    }
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[3])) {
                String[] stringArray = new String[llIlllllII[0]];
                stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[51]];
                if (H.lIlllIlllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[llIlllllII[0]];
                    stringArray9[H.llIlllllII[1]] = llIllllIll[llIlllllII[52]];
                    if (H.lIlllIlllIIll(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fX), llIlllllII[17]) || H.lIlllIlllIIIl(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[53]];
                            Movement.walkTo((WorldPoint)fX);
                            0;
                            Time.sleepTicks((int)llIlllllII[0]);
                            0;
                        }
                        if (!H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fX), llIlllllII[17]) || H.lIlllIlllIIll(Players.getLocal().getWorldLocation().getPlane())) {
                            if (H.lIlllIllllIlI(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[llIlllllII[0]];
                                nArray9[H.llIlllllII[1]] = llIlllllII[54];
                                NPCs.getNearest((int[])nArray9).interact(llIllllIll[llIlllllII[55]]);
                                Time.sleepTicks((int)llIlllllII[5]);
                                0;
                            }
                            String[] stringArray10 = new String[llIlllllII[0]];
                            stringArray10[H.llIlllllII[1]] = llIllllIll[llIlllllII[56]];
                            var10 = TileItems.getNearest((String[])stringArray10);
                            if (H.lIlllIlllIIIl(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[llIlllllII[0]];
                                nArray10[H.llIlllllII[1]] = llIlllllII[12];
                                Inventory.getFirst((int[])nArray10).interact(llIllllIll[llIlllllII[57]]);
                                Time.sleepTicks((int)llIlllllII[0]);
                                0;
                            }
                            if (H.lIlllIlllIlIl(var10)) {
                                var10.interact(llIllllIll[llIlllllII[58]]);
                                Time.sleepTicks((int)llIlllllII[5]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray11 = new String[llIlllllII[0]];
                stringArray11[H.llIlllllII[1]] = llIllllIll[llIlllllII[59]];
                if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fY), llIlllllII[13])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[60]];
                        Movement.walkTo((WorldPoint)fY);
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                    if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fY), llIlllllII[13])) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[61]];
                        H.cg();
                    }
                }
                String[] stringArray12 = new String[llIlllllII[0]];
                stringArray12[H.llIlllllII[1]] = llIllllIll[llIlllllII[15]];
                if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[llIlllllII[0]];
                    stringArray13[H.llIlllllII[1]] = llIllllIll[llIlllllII[62]];
                    if (H.lIlllIlllIIll(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[63]];
                        String[] stringArray14 = new String[llIlllllII[0]];
                        stringArray14[H.llIlllllII[1]] = llIllllIll[llIlllllII[64]];
                        int[] nArray11 = new int[llIlllllII[0]];
                        nArray11[H.llIlllllII[1]] = llIlllllII[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)llIlllllII[6]);
                        0;
                    }
                }
                String[] stringArray15 = new String[llIlllllII[0]];
                stringArray15[H.llIlllllII[1]] = llIllllIll[llIlllllII[66]];
                if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[llIlllllII[0]];
                    stringArray16[H.llIlllllII[1]] = llIllllIll[llIlllllII[67]];
                    if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[68]];
                            if (H.lIlllIlllIIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)fW);
                            0;
                            Time.sleepTicks((int)llIlllllII[0]);
                            0;
                        }
                        if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fW), llIlllllII[10])) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[69]];
                            String[] stringArray17 = new String[llIlllllII[0]];
                            stringArray17[H.llIlllllII[1]] = llIllllIll[llIlllllII[70]];
                            String[] stringArray18 = new String[llIlllllII[0]];
                            stringArray18[H.llIlllllII[1]] = llIllllIll[llIlllllII[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)llIlllllII[10]);
                            0;
                        }
                    }
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[16])) {
                String[] stringArray = new String[llIlllllII[0]];
                stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[72]];
                var10 = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[llIlllllII[0]];
                stringArray19[H.llIlllllII[1]] = llIllllIll[llIlllllII[73]];
                if (H.lIlllIlllIIll(Inventory.contains((String[])stringArray19) ? 1 : 0) && H.lIlllIlllIlIl(var10)) {
                    if (H.lIlllIlllIIIl(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[74]];
                        g.a(llIllllIll[llIlllllII[75]], cE);
                    }
                    if (H.lIlllIlllIIll(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[76]];
                        String[] stringArray20 = new String[llIlllllII[0]];
                        stringArray20[H.llIlllllII[1]] = llIllllIll[llIlllllII[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(llIllllIll[llIlllllII[78]]);
                        Time.sleepTicks((int)llIlllllII[5]);
                        0;
                    }
                }
                String[] stringArray21 = new String[llIlllllII[0]];
                stringArray21[H.llIlllllII[1]] = llIllllIll[llIlllllII[79]];
                if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[llIlllllII[0]];
                    stringArray22[H.llIlllllII[1]] = llIllllIll[llIlllllII[80]];
                    var3 = TileObjects.getNearest((String[])stringArray22);
                    if (H.lIlllIlllIlIl(var3)) {
                        if (H.lIlllIlllIIIl(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[81]];
                            String[] stringArray23 = new String[llIlllllII[0]];
                            stringArray23[H.llIlllllII[1]] = llIllllIll[llIlllllII[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(var3);
                            Time.sleepTicks((int)llIlllllII[5]);
                            0;
                        }
                        if (H.lIlllIlllIIll(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
                            AccBuilderSotf.c = llIllllIll[llIlllllII[83]];
                            String[] stringArray24 = new String[llIlllllII[0]];
                            stringArray24[H.llIlllllII[1]] = llIllllIll[llIlllllII[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(llIllllIll[llIlllllII[85]]);
                            Time.sleepTicks((int)llIlllllII[5]);
                            0;
                        }
                    }
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[17])) {
                String[] stringArray = new String[llIlllllII[0]];
                stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[86]];
                var10 = NPCs.getNearest((String[])stringArray);
                if (H.lIlllIlllIlIl(var10)) {
                    if (H.lIlllIlllIIIl(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[87]];
                        g.a(llIllllIll[llIlllllII[88]], cE);
                    }
                    if (H.lIlllIlllIIll(Reachable.isInteractable((Locatable)var10) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[89]];
                        String[] stringArray25 = new String[llIlllllII[0]];
                        stringArray25[H.llIlllllII[1]] = llIllllIll[llIlllllII[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(llIllllIll[llIlllllII[91]]);
                        Time.sleepTicks((int)llIlllllII[5]);
                        0;
                    }
                }
            }
            if (H.lIlllIlllIlII(e.j(fJ), llIlllllII[18])) {
                if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[92]];
                    var10 = new WorldArea(llIlllllII[93], llIlllllII[94], llIlllllII[60], llIlllllII[43], llIlllllII[1]);
                    if (H.lIlllIlllIIll(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var3 = new WorldArea(llIlllllII[95], llIlllllII[96], llIlllllII[48], llIlllllII[63], llIlllllII[1]);
                        if (H.lIlllIlllIIll(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                            0;
                            Time.sleepTicks((int)llIlllllII[0]);
                            0;
                        }
                        if (H.lIlllIlllIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                                0;
                                Time.sleepTicks((int)llIlllllII[0]);
                                0;
                            }
                            if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                String[] stringArray = new String[llIlllllII[0]];
                                stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[98]];
                                var5 = TileObjects.getNearest((String[])stringArray);
                                if (H.lIlllIlllIlIl(var5)) {
                                    String[] stringArray26 = new String[llIlllllII[0]];
                                    stringArray26[H.llIlllllII[1]] = llIllllIll[llIlllllII[99]];
                                    if (H.lIlllIlllIIIl(var5.hasAction(stringArray26) ? 1 : 0)) {
                                        var5.interact(llIllllIll[llIlllllII[100]]);
                                        Time.sleepTicks((int)llIlllllII[10]);
                                        0;
                                    }
                                    String[] stringArray27 = new String[llIlllllII[0]];
                                    stringArray27[H.llIlllllII[1]] = llIllllIll[llIlllllII[101]];
                                    if (H.lIlllIlllIIIl(var5.hasAction(stringArray27) ? 1 : 0)) {
                                        var5.interact(llIllllIll[llIlllllII[102]]);
                                        Time.sleepTicks((int)llIlllllII[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (H.lIlllIlllIIIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)fZ);
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                }
                if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[103]];
                    g.a(llIllllIll[llIlllllII[104]], cE);
                }
            }
            if (H.lIlllIllllIll(e.j(fJ), llIlllllII[13]) && H.lIlllIlllIIlI(e.j(fJ), llIlllllII[72])) {
                if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    String[] stringArray = new String[llIlllllII[0]];
                    stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[105]];
                    if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderSotf.c = llIllllIll[llIlllllII[106]];
                        if (H.lIlllIlllIIlI(di, llIlllllII[0])) {
                            aN.qG += llIlllllII[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIlllllII[0];
                            aN.qG = llIlllllII[1];
                            dj = llIlllllII[1];
                        }
                        g.a(llIllllIll[llIlllllII[107]], cE);
                    }
                }
                String[] stringArray = new String[llIlllllII[0]];
                stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[108]];
                if (H.lIlllIlllIIll(Inventory.contains((String[])stringArray) ? 1 : 0) && H.lIlllIlllIIlI(e.j(fJ), llIlllllII[72])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[109]];
                    H.bM();
                }
                String[] stringArray28 = new String[llIlllllII[0]];
                stringArray28[H.llIlllllII[1]] = llIllllIll[llIlllllII[110]];
                if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray28) ? 1 : 0) && H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3]) && H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    AccBuilderSotf.c = llIllllIll[llIlllllII[111]];
                    var10 = new WorldArea(llIlllllII[93], llIlllllII[94], llIlllllII[60], llIlllllII[43], llIlllllII[1]);
                    if (H.lIlllIlllIIll(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var3 = new WorldArea(llIlllllII[95], llIlllllII[96], llIlllllII[48], llIlllllII[63], llIlllllII[1]);
                        if (H.lIlllIlllIIll(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                            0;
                            Time.sleepTicks((int)llIlllllII[0]);
                            0;
                        }
                        if (H.lIlllIlllIIIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1]));
                                0;
                                Time.sleepTicks((int)llIlllllII[0]);
                                0;
                            }
                            if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIlllllII[25], llIlllllII[97], llIlllllII[1])), llIlllllII[3])) {
                                String[] stringArray29 = new String[llIlllllII[0]];
                                stringArray29[H.llIlllllII[1]] = llIllllIll[llIlllllII[112]];
                                var5 = TileObjects.getNearest((String[])stringArray29);
                                if (H.lIlllIlllIlIl(var5)) {
                                    String[] stringArray30 = new String[llIlllllII[0]];
                                    stringArray30[H.llIlllllII[1]] = llIllllIll[llIlllllII[113]];
                                    if (H.lIlllIlllIIIl(var5.hasAction(stringArray30) ? 1 : 0)) {
                                        var5.interact(llIllllIll[llIlllllII[114]]);
                                        Time.sleepTicks((int)llIlllllII[10]);
                                        0;
                                    }
                                    String[] stringArray31 = new String[llIlllllII[0]];
                                    stringArray31[H.llIlllllII[1]] = llIllllIll[llIlllllII[115]];
                                    if (H.lIlllIlllIIIl(var5.hasAction(stringArray31) ? 1 : 0)) {
                                        var5.interact(llIllllIll[llIlllllII[116]]);
                                        Time.sleepTicks((int)llIlllllII[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (H.lIlllIlllIIIl(var10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)fZ);
                        0;
                        Time.sleepTicks((int)llIlllllII[0]);
                        0;
                    }
                }
            }
            if (H.lIlllIllllIll(e.j(fJ), llIlllllII[72]) && H.lIlllIlllIIlI(e.j(fK), llIlllllII[3])) {
                AccBuilderSotf.c = llIllllIll[llIlllllII[117]];
                if (H.lIlllIllllIII(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    H.ch();
                }
                if (H.lIlllIllllIIl(Players.getLocal().getWorldLocation().distanceTo(fZ), llIlllllII[3])) {
                    if (H.lIlllIlllIlIl(Widgets.get((int)llIlllllII[118], (int)llIlllllII[27]))) {
                        Mouse.click((int)Widgets.get((int)llIlllllII[118], (int)llIlllllII[27]).getClickPoint().getX(), (int)Widgets.get((int)llIlllllII[118], (int)llIlllllII[27]).getClickPoint().getY(), (boolean)llIlllllII[0]);
                        Time.sleepTicks((int)llIlllllII[10]);
                        0;
                    }
                    g.a(llIllllIll[llIlllllII[119]], cE);
                    g.a(cE);
                }
            }
            g.a(cE);
        }
    }

    private static void cg() {
        gb.add(llIlllllII[120]);
        0;
        gb.add(llIlllllII[121]);
        0;
        gb.add(llIlllllII[122]);
        0;
        gb.add(llIlllllII[123]);
        0;
        gb.add(llIlllllII[124]);
        0;
        gb.add(llIlllllII[125]);
        0;
        gb.add(llIlllllII[126]);
        0;
        while (H.lIlllIlllIIll(gb.isEmpty() ? 1 : 0) && H.lIlllIlllIIll(gb.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llIlllllII[0]];
            stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[127]];
            if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                0;
                if (2 > 0) break;
                return;
            }
            int[] nArray = new int[llIlllllII[0]];
            nArray[H.llIlllllII[1]] = gb.get(llIlllllII[1]);
            TileObject var30 = TileObjects.getNearest((int[])nArray);
            if (H.lIlllIlllIlIl(var30)) {
                String[] stringArray2 = new String[llIlllllII[0]];
                stringArray2[H.llIlllllII[1]] = llIllllIll[llIlllllII[128]];
                if (H.lIlllIlllIIIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIlllllII[0]];
                    stringArray3[H.llIlllllII[1]] = llIllllIll[llIlllllII[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(var30);
                    Time.sleepTicks((int)llIlllllII[3]);
                    0;
                }
            }
            String[] stringArray4 = new String[llIlllllII[0]];
            stringArray4[H.llIlllllII[1]] = llIllllIll[llIlllllII[130]];
            if (H.lIlllIlllIIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                gb.remove(llIlllllII[1]);
                0;
                Time.sleepTicks((int)llIlllllII[5]);
                0;
            }
            0;
            
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ci() {
        int n2;
        String[] stringArray = new String[llIlllllII[0]];
        stringArray[H.llIlllllII[1]] = llIllllIll[llIlllllII[140]];
        if (H.lIlllIlllIllI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIlllllII[0]];
            nArray[H.llIlllllII[1]] = llIlllllII[12];
            if (H.lIlllIlllIllI(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[llIlllllII[0]];
                nArray2[H.llIlllllII[1]] = llIlllllII[11];
                if (H.lIlllIlllIllI(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[llIlllllII[0]];
                    nArray3[H.llIlllllII[1]] = llIlllllII[7];
                    if (H.lIlllIlllIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = llIlllllII[0];
                        0;
                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = llIlllllII[1];
        return n2 != 0;
    }

    private static boolean lIlllIlllIlll(int n2) {
        return n2 < 0;
    }

    private static void lIlllIllIlllI() {
        llIllllIll = new String[llIlllllII[185]];
        H.llIllllIll[H.llIlllllII[1]] = H."Finished buying items, switching back to quest";
        H.llIllllIll[H.llIlllllII[0]] = H."Nav to bank";
        H.llIllllIll[H.llIlllllII[5]] = H."Handling banking";
        H.llIllllIll[H.llIlllllII[10]] = H."We are missing quest supplies, switching to BUYING";
        H.llIllllIll[H.llIlllllII[6]] = H."Drink";
        H.llIllllIll[H.llIlllllII[3]] = H."Eat";
        H.llIllllIll[H.llIlllllII[16]] = H."Nav to start";
        H.llIllllIll[H.llIlllllII[17]] = H."Starting quest";
        H.llIllllIll[H.llIlllllII[18]] = H."King Roald";
        H.llIllllIll[H.llIlllllII[19]] = H."Nav to temple door";
        H.llIllllIll[H.llIlllllII[13]] = H."Interesting door";
        H.llIllllIll[H.llIlllllII[20]] = H."Large door";
        H.llIllllIll[H.llIlllllII[21]] = H."Open";
        H.llIllllIll[H.llIlllllII[22]] = H."Temple Guardian";
        H.llIllllIll[H.llIlllllII[23]] = H."Nav to doggo";
        H.llIllllIll[H.llIlllllII[24]] = H."Trapdoor";
        H.llIllllIll[H.llIlllllII[27]] = H."Temple Guardian";
        H.llIllllIll[H.llIlllllII[28]] = H."Trapdoor";
        H.llIllllIll[H.llIlllllII[29]] = H."Open";
        H.llIllllIll[H.llIlllllII[30]] = H."Open";
        H.llIllllIll[H.llIlllllII[31]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[32]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[33]] = H."Temple Guardian";
        H.llIllllIll[H.llIlllllII[34]] = H."Wield";
        H.llIllllIll[H.llIlllllII[35]] = H."Temple Guardian";
        H.llIllllIll[H.llIlllllII[36]] = H."Attack";
        H.llIllllIll[H.llIlllllII[37]] = H."Monument";
        H.llIllllIll[H.llIlllllII[38]] = H."Break";
        H.llIllllIll[H.llIlllllII[39]] = H."Nav to temple door";
        H.llIllllIll[H.llIlllllII[40]] = H."Interacting door";
        H.llIllllIll[H.llIlllllII[41]] = H."Large door";
        H.llIllllIll[H.llIlllllII[42]] = H."Open";
        H.llIllllIll[H.llIlllllII[43]] = H."tell the king";
        H.llIllllIll[H.llIlllllII[44]] = H."Nav to king";
        H.llIllllIll[H.llIlllllII[45]] = H."talk king";
        H.llIllllIll[H.llIlllllII[46]] = H."King Roald";
        H.llIllllIll[H.llIlllllII[47]] = H."Nav to jail";
        H.llIllllIll[H.llIlllllII[48]] = H."Interesting door";
        H.llIllllIll[H.llIlllllII[49]] = H."Cell door";
        H.llIllllIll[H.llIlllllII[50]] = H."Open";
        H.llIllllIll[H.llIlllllII[51]] = H."Golden key";
        H.llIllllIll[H.llIlllllII[52]] = H."Iron key";
        H.llIllllIll[H.llIlllllII[53]] = H."Nav to gold key tile";
        H.llIllllIll[H.llIlllllII[55]] = H."Attack";
        H.llIllllIll[H.llIlllllII[56]] = H."Golden key";
        H.llIllllIll[H.llIlllllII[57]] = H."Eat";
        H.llIllllIll[H.llIlllllII[58]] = H."Take";
        H.llIllllIll[H.llIlllllII[59]] = H."Golden key";
        H.llIllllIll[H.llIlllllII[60]] = H."Nav to statues";
        H.llIllllIll[H.llIlllllII[61]] = H."Finding key";
        H.llIllllIll[H.llIlllllII[15]] = H."Iron key";
        H.llIllllIll[H.llIlllllII[62]] = H."Murky water";
        H.llIllllIll[H.llIlllllII[63]] = H."Getting water";
        H.llIllllIll[H.llIlllllII[64]] = H."Bucket";
        H.llIllllIll[H.llIlllllII[66]] = H."Iron key";
        H.llIllllIll[H.llIlllllII[67]] = H."Murky water";
        H.llIllllIll[H.llIlllllII[68]] = H."Nav to jail";
        H.llIllllIll[H.llIlllllII[69]] = H."Interesting door";
        H.llIllllIll[H.llIlllllII[70]] = H."Iron key";
        H.llIllllIll[H.llIlllllII[71]] = H."Cell door";
        H.llIllllIll[H.llIlllllII[72]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[73]] = H."Blessed water";
        H.llIllllIll[H.llIlllllII[74]] = H."Handling chat";
        H.llIllllIll[H.llIlllllII[75]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[76]] = H."Entering cell";
        H.llIllllIll[H.llIlllllII[77]] = H."Cell door";
        H.llIllllIll[H.llIlllllII[78]] = H."Open";
        H.llIllllIll[H.llIlllllII[79]] = H."Blessed water";
        H.llIllllIll[H.llIlllllII[80]] = H."Coffin";
        H.llIllllIll[H.llIlllllII[81]] = H."Using water on coffin";
        H.llIllllIll[H.llIlllllII[82]] = H."Blessed water";
        H.llIllllIll[H.llIlllllII[83]] = H."Exiting cell";
        H.llIllllIll[H.llIlllllII[84]] = H."Cell door";
        H.llIllllIll[H.llIlllllII[85]] = H."Open";
        H.llIllllIll[H.llIlllllII[86]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[87]] = H."Handling chat";
        H.llIllllIll[H.llIlllllII[88]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[89]] = H."Entering cell";
        H.llIllllIll[H.llIlllllII[90]] = H."Cell door";
        H.llIllllIll[H.llIlllllII[91]] = H."Open";
        H.llIllllIll[H.llIlllllII[92]] = H."Nav to final tile";
        H.llIllllIll[H.llIlllllII[98]] = H."Trapdoor";
        H.llIllllIll[H.llIlllllII[99]] = H."Open";
        H.llIllllIll[H.llIlllllII[100]] = H."Open";
        H.llIllllIll[H.llIlllllII[101]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[102]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[103]] = H."Handling chat";
        H.llIllllIll[H.llIlllllII[104]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[105]] = H."Pure essence";
        H.llIllllIll[H.llIlllllII[106]] = H."Turning in ess";
        H.llIllllIll[H.llIlllllII[107]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[108]] = H."Pure essence";
        H.llIllllIll[H.llIlllllII[109]] = H."Grabbing more ess";
        H.llIllllIll[H.llIlllllII[110]] = H."Pure essence";
        H.llIllllIll[H.llIlllllII[111]] = H."Nav to final tile";
        H.llIllllIll[H.llIlllllII[112]] = H."Trapdoor";
        H.llIllllIll[H.llIlllllII[113]] = H."Open";
        H.llIllllIll[H.llIlllllII[114]] = H."Open";
        H.llIllllIll[H.llIlllllII[115]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[116]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[117]] = H."Finish & Unlock morty/start nature";
        H.llIllllIll[H.llIlllllII[119]] = H."Drezel";
        H.llIllllIll[H.llIlllllII[127]] = H."Iron key";
        H.llIllllIll[H.llIlllllII[128]] = H."Golden key";
        H.llIllllIll[H.llIlllllII[129]] = H."Golden key";
        H.llIllllIll[H.llIlllllII[130]] = H."Iron key";
        H.llIllllIll[H.llIlllllII[131]] = H."Nav to final tile";
        H.llIllllIll[H.llIlllllII[2]] = H."Trapdoor";
        H.llIllllIll[H.llIlllllII[132]] = H."Open";
        H.llIllllIll[H.llIlllllII[133]] = H."Open";
        H.llIllllIll[H.llIlllllII[134]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[135]] = H."Climb-down";
        H.llIllllIll[H.llIlllllII[136]] = H."Nav to bank";
        H.llIllllIll[H.llIlllllII[137]] = H."Handling banking";
        H.llIllllIll[H.llIlllllII[138]] = H."Nav to bank";
        H.llIllllIll[H.llIlllllII[139]] = H."Handling banking";
        H.llIllllIll[H.llIlllllII[140]] = H."Bucket";
        H.llIllllIll[H.llIlllllII[141]] = H."Bucket";
        H.llIllllIll[H.llIlllllII[147]] = H."Priest In Peril";
        H.llIllllIll[H.llIlllllII[148]] = H."ring of wealth (";
        H.llIllllIll[H.llIlllllII[165]] = H."I'm looking for a quest!";
        H.llIllllIll[H.llIlllllII[166]] = H."Yes.";
        H.llIllllIll[H.llIlllllII[167]] = H."Ok, let me help then.";
        H.llIllllIll[H.llIlllllII[168]] = H."Yep, now tell me what the problem is.";
        H.llIllllIll[H.llIlllllII[169]] = H."Sure.";
        H.llIllllIll[H.llIlllllII[170]] = H."You're right, we don't.";
        H.llIllllIll[H.llIlllllII[171]] = H."Is there anything else interesting to do around here?";
        H.llIllllIll[H.llIlllllII[172]] = H."Well, what is it, I may be able to help?";
        H.llIllllIll[H.llIlllllII[173]] = H."Yes, I'll go and look for him.";
        H.llIllllIll[H.llIlllllII[174]] = H."Yes, I'm sure.";
        H.llIllllIll[H.llIlllllII[175]] = H."I'll get going.";
        H.llIllllIll[H.llIlllllII[176]] = H."Ok, thanks.";
        H.llIllllIll[H.llIlllllII[177]] = H."I think I've solved the puzzle!";
        H.llIllllIll[H.llIlllllII[178]] = H."How can I help?";
        H.llIllllIll[H.llIlllllII[179]] = H."Roald sent me to check on Drezel.";
        H.llIllllIll[H.llIlllllII[180]] = H."Why is the river such a good defence?";
        H.llIllllIll[H.llIlllllII[181]] = H."You're right, we don't.";
        H.llIllllIll[H.llIlllllII[182]] = H."Yes, of course.";
        H.llIllllIll[H.llIlllllII[183]] = H."Do you know of anything I can do in Morytania?";
        H.llIllllIll[H.llIlllllII[184]] = H."Well, what is it, I may be able to help?";
    }

    private static void lIlllIllIllll() {
        llIlllllII = new int[186];
        H.llIlllllII[0] = 1;
        H.llIlllllII[1] = (0xD6 ^ 0x98) & ~(0x88 ^ 0xC6);
        H.llIlllllII[2] = 0x79 ^ 0xD ^ (0x1F ^ 0);
        H.llIlllllII[3] = 6 + 23 - -101 + 19 ^ 42 + 130 - 75 + 47;
        H.llIlllllII[4] = 0xFFFFB7EB & 0x5B9C;
        H.llIlllllII[5] = 2;
        H.llIlllllII[6] = 0x2D ^ 0x29;
        H.llIlllllII[7] = 0xFFFFFFD7 & 0x1F6F;
        H.llIlllllII[8] = 0xFFFF87FF & 0x7F85;
        H.llIlllllII[9] = 0xFFFFBF8E & 0x5F71;
        H.llIlllllII[10] = 3;
        H.llIlllllII[11] = -(0xFFFFEFEF & 0x5497) & (0xFFFFFDDF & 0x77F7);
        H.llIlllllII[12] = -(0xFFFF9AAF & 0x7555) & (0xFFFFB57F & 0x5BFF);
        H.llIlllllII[13] = 0x3F ^ 0x35;
        H.llIlllllII[14] = -(186 + 172 - 209 + 52) & (0xFFFFF5FB & 0xFFF);
        H.llIlllllII[15] = 0x6A ^ 0x27 ^ 115 + 37 - 86 + 61;
        H.llIlllllII[16] = 0x72 ^ 0x74;
        H.llIlllllII[17] = 0 + 29 - -54 + 50 ^ 73 + 34 - 84 + 107;
        H.llIlllllII[18] = 0x67 ^ 0x6F;
        H.llIlllllII[19] = 0x95 ^ 0x9C;
        H.llIlllllII[20] = 7 ^ 0xC;
        H.llIlllllII[21] = 0x24 ^ 0x28;
        H.llIlllllII[22] = 4 + 137 - -13 + 6 ^ 108 + 62 - 134 + 137;
        H.llIlllllII[23] = 0xD4 ^ 0xA5 ^ 56 + 92 - 67 + 46;
        H.llIlllllII[24] = 65 + 126 - 166 + 142 ^ 48 + 43 - 9 + 86;
        H.llIlllllII[25] = -(0xFFFFEA7F & 0x55B1) & (0xFFFFFD7D & 0x4FFF);
        H.llIlllllII[26] = 0xFFFFBFFF & 0x4DB2;
        H.llIlllllII[27] = 0x36 ^ 0xD ^ (0xBE ^ 0x95);
        H.llIlllllII[28] = 171 + 177 - 278 + 111 ^ 146 + 157 - 302 + 163;
        H.llIlllllII[29] = 0xDA ^ 0x87 ^ (0xFA ^ 0xB5);
        H.llIlllllII[30] = 0xCF ^ 0xA8 ^ (0x7B ^ 0xF);
        H.llIlllllII[31] = 0x69 ^ 0x6C ^ (0xB9 ^ 0xA8);
        H.llIlllllII[32] = 0xC7 ^ 0x8A ^ (0x77 ^ 0x2F);
        H.llIlllllII[33] = 0x3A ^ 0x5C ^ (0xC3 ^ 0xB3);
        H.llIlllllII[34] = 0x42 ^ 0x55;
        H.llIlllllII[35] = 0x3F ^ 0x27;
        H.llIlllllII[36] = 0x7C ^ 0x65;
        H.llIlllllII[37] = 0x2B ^ 0x31;
        H.llIlllllII[38] = 0xFA ^ 0xB7 ^ (0xDF ^ 0x89);
        H.llIlllllII[39] = 0xC5 ^ 0xBB ^ (0xA5 ^ 0xC7);
        H.llIlllllII[40] = 0xB9 ^ 0xA4;
        H.llIlllllII[41] = 0x52 ^ 0x31 ^ (0x20 ^ 0x5D);
        H.llIlllllII[42] = 0x7C ^ 0x63;
        H.llIlllllII[43] = 0x77 ^ 0x57;
        H.llIlllllII[44] = 0xAE ^ 0xBD ^ (0x69 ^ 0x5B);
        H.llIlllllII[45] = 142 + 53 - 182 + 149 ^ 60 + 61 - 17 + 24;
        H.llIlllllII[46] = 3 ^ 0x20 ^ (0x66 ^ 0x33) & ~(0xEC ^ 0xB9);
        H.llIlllllII[47] = 0x35 ^ 0x4C ^ (0xC5 ^ 0x98);
        H.llIlllllII[48] = 43 + 54 - 11 + 74 ^ 74 + 69 - 43 + 33;
        H.llIlllllII[49] = 32 + 92 - 45 + 90 ^ 11 + 79 - -12 + 41;
        H.llIlllllII[50] = 145 + 107 - 207 + 107 ^ 165 + 106 - 133 + 53;
        H.llIlllllII[51] = 37 + 88 - 6 + 24 ^ 15 + 57 - -65 + 30;
        H.llIlllllII[52] = 94 + 119 - 201 + 140 ^ 27 + 140 - 132 + 142;
        H.llIlllllII[53] = 157 + 160 - 107 + 28 ^ 157 + 128 - 189 + 100;
        H.llIlllllII[54] = 0xFFFFBFDF & 0x4DBE;
        H.llIlllllII[55] = 0xEF ^ 0xC4;
        H.llIlllllII[56] = 0x7C ^ 0x50;
        H.llIlllllII[57] = 146 + 104 - 233 + 161 ^ 50 + 87 - 7 + 29;
        H.llIlllllII[58] = 0xF5 ^ 0xA5 ^ (0x58 ^ 0x26);
        H.llIlllllII[59] = 119 + 152 - 219 + 112 ^ 103 + 1 - 51 + 86;
        H.llIlllllII[60] = 0x54 ^ 0xF ^ (0x27 ^ 0x4C);
        H.llIlllllII[61] = 0x53 ^ 0x66 ^ (0xC5 ^ 0xC1);
        H.llIlllllII[62] = 57 + 108 - 34 + 60 ^ 15 + 109 - 8 + 24;
        H.llIlllllII[63] = 0x6B ^ 0x77 ^ (0x34 ^ 0x1C);
        H.llIlllllII[64] = 152 + 56 - 91 + 49 ^ 121 + 139 - 245 + 132;
        H.llIlllllII[65] = 0xFFFFCFBF & 0x3DDD;
        H.llIlllllII[66] = 0x80 ^ 0xB6;
        H.llIlllllII[67] = 0x84 ^ 0x94 ^ (0x42 ^ 0x65);
        H.llIlllllII[68] = 0x8C ^ 0xB4;
        H.llIlllllII[69] = 0x78 ^ 0x6B ^ (0x9E ^ 0xB4);
        H.llIlllllII[70] = 0x55 ^ 0x1A ^ (0x70 ^ 5);
        H.llIlllllII[71] = 69 + 145 - 146 + 116 ^ 30 + 111 - 123 + 113;
        H.llIlllllII[72] = 0x33 ^ 0xF;
        H.llIlllllII[73] = 0x40 ^ 0x7D;
        H.llIlllllII[74] = 0x9F ^ 0xA1;
        H.llIlllllII[75] = 0x40 ^ 0x2E ^ (0x4B ^ 0x1A);
        H.llIlllllII[76] = 47 + 25 - 5 + 156 ^ 125 + 151 - 182 + 65;
        H.llIlllllII[77] = 0x69 ^ 2 ^ (0x73 ^ 0x59);
        H.llIlllllII[78] = 0x4E ^ 0xC;
        H.llIlllllII[79] = 8 ^ 0x75 ^ (0x6F ^ 0x51);
        H.llIlllllII[80] = 0xF9 ^ 0xB4 ^ (0x47 ^ 0x4E);
        H.llIlllllII[81] = 0x49 ^ 0xC;
        H.llIlllllII[82] = 0x21 ^ 0x74 ^ (0x5F ^ 0x4C);
        H.llIlllllII[83] = 0x40 ^ 7;
        H.llIlllllII[84] = 0x7B ^ 0x33;
        H.llIlllllII[85] = 0xE9 ^ 0xA0;
        H.llIlllllII[86] = 0x6D ^ 0x27;
        H.llIlllllII[87] = 0x29 ^ 0x48 ^ (0x66 ^ 0x4C);
        H.llIlllllII[88] = 28 + 68 - -6 + 127 ^ 6 + 104 - 106 + 165;
        H.llIlllllII[89] = 53 + 2 - -79 + 96 ^ 59 + 135 - 63 + 40;
        H.llIlllllII[90] = 0x32 ^ 0x7C;
        H.llIlllllII[91] = 0x75 ^ 0x5A ^ (0xD ^ 0x6D);
        H.llIlllllII[92] = 0xD6 ^ 0x86;
        H.llIlllllII[93] = -(0xFFFFFFBF & 0x20F1) & (0xFFFFEFF7 & 0x3DFF);
        H.llIlllllII[94] = 0xFFFFF7D7 & 0x2EBF;
        H.llIlllllII[95] = -(0xFFFFDBC5 & 0x36FB) & (0xFFFFDFFD & 0x3FFE);
        H.llIlllllII[96] = -(7 ^ 0x5D) & (0xFFFFDFFF & 0x2DDF);
        H.llIlllllII[97] = 0xFFFFDFB6 & 0x2DF9;
        H.llIlllllII[98] = 0x77 ^ 0x2D ^ (0x3E ^ 0x35);
        H.llIlllllII[99] = 0xA6 ^ 0xC0 ^ (0x8D ^ 0xB9);
        H.llIlllllII[100] = 0xFE ^ 0xAD;
        H.llIlllllII[101] = 0x44 ^ 0x10;
        H.llIlllllII[102] = 0xC2 ^ 0x97;
        H.llIlllllII[103] = 0x76 ^ 0x45 ^ (0x24 ^ 0x41);
        H.llIlllllII[104] = 0xA ^ 0x45 ^ (0x24 ^ 0x3C);
        H.llIlllllII[105] = 63 + 33 - -37 + 113 ^ 56 + 126 - 58 + 50;
        H.llIlllllII[106] = 7 + 84 - -22 + 85 ^ 14 + 53 - 40 + 132;
        H.llIlllllII[107] = 191 + 184 - 302 + 119 ^ 67 + 95 - 32 + 24;
        H.llIlllllII[108] = 0xD1 ^ 0xAF ^ (0x67 ^ 0x42);
        H.llIlllllII[109] = 0x5C ^ 0;
        H.llIlllllII[110] = 96 + 133 - 182 + 174 ^ 49 + 103 - 142 + 118;
        H.llIlllllII[111] = 0x33 ^ 0x6D;
        H.llIlllllII[112] = 0x15 ^ 0x37 ^ (0x52 ^ 0x2F);
        H.llIlllllII[113] = 0xE5 ^ 0xC2 ^ (0x82 ^ 0xC5);
        H.llIlllllII[114] = 0xD3 ^ 0xB5 ^ (0x3C ^ 0x3B);
        H.llIlllllII[115] = 0xBB ^ 0x9F ^ (0xF3 ^ 0xB5);
        H.llIlllllII[116] = 0x20 ^ 0x43;
        H.llIlllllII[117] = 0x58 ^ 0x3C;
        H.llIlllllII[118] = (0x13 ^ 0x2D) + (58 + 121 - 149 + 121) - (42 + 123 - 28 + 64) + (134 + 34 - 47 + 20);
        H.llIlllllII[119] = 0x6A ^ 0x25 ^ (0xE8 ^ 0xC2);
        H.llIlllllII[120] = -(0xFFFFF3FF & 0x5E57) & (0xFFFFFFFE & 0x5FFF);
        H.llIlllllII[121] = 0xFFFFCDAA & 0x3FFF;
        H.llIlllllII[122] = 0xFFFFBFA7 & 0x4DFF;
        H.llIlllllII[123] = 0xFFFF8FB9 & 0x7DEF;
        H.llIlllllII[124] = -(0xFFFFA677 & 0x7BD9) & (0xFFFFBFFF & 0x6FF6);
        H.llIlllllII[125] = 0xFFFFCDBF & 0x3FEB;
        H.llIlllllII[126] = 0xFFFFDDB5 & 0x2FEF;
        H.llIlllllII[127] = 0xFD ^ 0x9B;
        H.llIlllllII[128] = 0x16 ^ 0x42 ^ (0xF2 ^ 0xC1);
        H.llIlllllII[129] = 8 ^ 0x60;
        H.llIlllllII[130] = 0xC2 ^ 0xAB;
        H.llIlllllII[131] = 0xE1 ^ 0x8B;
        H.llIlllllII[132] = 0x4A ^ 0x66 ^ (0x79 ^ 0x39);
        H.llIlllllII[133] = 0x29 ^ 0x44;
        H.llIlllllII[134] = 0 ^ 0x19 ^ (0x61 ^ 0x16);
        H.llIlllllII[135] = 33 + 16 - -46 + 77 ^ 63 + 100 - -20 + 12;
        H.llIlllllII[136] = 0xC9 ^ 0xB9;
        H.llIlllllII[137] = 0xFA ^ 0x8B;
        H.llIlllllII[138] = 0x84 ^ 0xB8 ^ (0x51 ^ 0x1F);
        H.llIlllllII[139] = 0xC7 ^ 0xB4;
        H.llIlllllII[140] = 0x46 ^ 0x32;
        H.llIlllllII[141] = 0x1A ^ 0x6F;
        H.llIlllllII[142] = -(0xFFFFBAD7 & 0x4D7F) & (0xFFFFAF7E & 0x7BFF);
        H.llIlllllII[143] = -(0xFFFF96FB & 0x7D56) & (0xFFFFDD7F & 0x37FD);
        H.llIlllllII[144] = -(0xFFFFF1B2 & 0x1F7F) & (0xFFFFBFFD & Short.MAX_VALUE);
        H.llIlllllII[145] = 0xFFFFFFFA & 0x61AD;
        H.llIlllllII[146] = -(0xFFFFF6DE & 0x7D3D) & (0xFFFFFFDF & 0x77BF);
        H.llIlllllII[147] = 0x26 ^ 0x50;
        H.llIlllllII[148] = 0x22 ^ 0x43 ^ (8 ^ 0x1E);
        H.llIlllllII[149] = 0xFFFFEFB7 & 0x1CDE;
        H.llIlllllII[150] = 0xFFFF8DFF & 0x7F91;
        H.llIlllllII[151] = 0xFFFFAD7F & 0x5FCF;
        H.llIlllllII[152] = -(0xFFFFFF5F & 0x72BF) & (0xFFFFFFFF & 0x7FBF);
        H.llIlllllII[153] = 0xFFFFF6BF & 0x2FEE;
        H.llIlllllII[154] = 0xFFFFFF6D & 0x1FDF;
        H.llIlllllII[155] = 0xFFFFDDBE & 0x3B57;
        H.llIlllllII[156] = -(0xFFFFF1AF & 0x7EF9) & (0xFFFFFDFF & Short.MAX_VALUE);
        H.llIlllllII[157] = -(0xFFFFD494 & 0x6B6F) & (0xFFFFCF7F & 0x7DD7);
        H.llIlllllII[158] = -(0xFFFFE2FB & 0x3D1F) & (0xFFFFADBB & 0x7FFE);
        H.llIlllllII[159] = -(0xFFFFB2F9 & 0x6D87) & (0xFFFFFFFF & 0x2DDE);
        H.llIlllllII[160] = -(0x20 ^ 0x41) & (0xFFFFB7FF & 0x6EFF);
        H.llIlllllII[161] = 0xFFFFED71 & 0x1FFE;
        H.llIlllllII[162] = 0xFFFFB7EF & 0x6EB7;
        H.llIlllllII[163] = -(0xFFFFF7C2 & 0x5EFF) & (0xFFFFD7EF & Short.MAX_VALUE);
        H.llIlllllII[164] = 0xFFFF83FB & 0x7D37;
        H.llIlllllII[165] = 0x1A ^ 0x1E ^ (0x64 ^ 0x18);
        H.llIlllllII[166] = 0xDD ^ 0xA4;
        H.llIlllllII[167] = 82 + 189 - 215 + 167 ^ 159 + 47 - 85 + 44;
        H.llIlllllII[168] = 0xCA ^ 0xB1;
        H.llIlllllII[169] = 0x30 ^ 0x12 ^ (0x3F ^ 0x61);
        H.llIlllllII[170] = 0x4E ^ 0x33;
        H.llIlllllII[171] = 0x75 ^ 0xB;
        H.llIlllllII[172] = (2 ^ 0x62) + (0x58 ^ 0x6A) - (0xBF ^ 0xA8) + (0x5C ^ 0x58);
        H.llIlllllII[173] = 98 + 98 - 97 + 29;
        H.llIlllllII[174] = 100 + 18 - 73 + 84;
        H.llIlllllII[175] = 88 + 36 - 105 + 111;
        H.llIlllllII[176] = (0xBB ^ 0x9F) + (0xC4 ^ 0x8E) - (0x66 ^ 0x70) + (0x6A ^ 0x41);
        H.llIlllllII[177] = 63 + 21 - 50 + 98;
        H.llIlllllII[178] = 92 + 123 - 208 + 126;
        H.llIlllllII[179] = (0x6F ^ 0x45) + (0x4A ^ 0x3C) - (0xD3 ^ 0x8E) + (0x19 ^ 0x5A);
        H.llIlllllII[180] = 0 + 49 - -10 + 69 + (0x7D ^ 0x74) - (2 ^ 0x56) + (6 ^ 0x54);
        H.llIlllllII[181] = (0x86 ^ 0x8D) + (0xA ^ 0x44) - -(0x31 ^ 0x35) + (0x4F ^ 0x64);
        H.llIlllllII[182] = (0xFF ^ 0x9F) + 3 - (0x6B ^ 0x35) + (65 + 56 - 72 + 83);
        H.llIlllllII[183] = (0x79 ^ 0x73) + (0x68 ^ 0x1C) - (0x39 ^ 0x7F) + (0x5C ^ 0xE);
        H.llIlllllII[184] = 106 + 74 - 63 + 15 + (0x61 ^ 0x28) - (0x86 ^ 0xC4) + ((0xAB ^ 0xB9) & ~(0x4C ^ 0x5E));
        H.llIlllllII[185] = 88 + 103 - 83 + 32;
    }

    private static boolean lIlllIlllIllI(int n2) {
        return n2 > 0;
    }
}

