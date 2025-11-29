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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.E_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.U_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.i;
import gg.squire.account.AccBuilderRogues;
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

public class u_Unknown
implements G {
    public static /* synthetic */ boolean cX;
    public static final /* synthetic */ WorldPoint cU;
    public static final /* synthetic */ WorldPoint cW;
    public static /* synthetic */ int cY;
    public static final /* synthetic */ WorldPoint cS;
    public static final /* synthetic */ WorldPoint cP;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint cQ;
    static /* synthetic */ String[] bR;
    public static final /* synthetic */ WorldPoint cR;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] lIIllIlIIl;
    static /* synthetic */ int ck;
    private static /* synthetic */ String[] lIIllIIIIl;
    static /* synthetic */ ArrayList<Integer> da;
    public static final /* synthetic */ WorldPoint cT;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint cV;
    public static /* synthetic */ int cZ;

    private static boolean lIIIIIlIlIIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aQ() {
        void var16;
        BankLocation bankLocation = BankLocation.getNearest();
        if (u.lIIIIIlIlIIII(bankLocation) && u.lIIIIIlIIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[138]];
            a.a(bankLocation);
        }
        if (u.lIIIIIlIlIIII(var16) && u.lIIIIIlIIllII(var16.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (u.lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlIIl[4]);
                0;
            }
            if (u.lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[139]];
                if (u.lIIIIIlIlIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIllIlIIl[6]);
                    0;
                }
                a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                a.a(lIIllIlIIl[8], lIIllIlIIl[0]);
                a.a(lIIllIlIIl[11], lIIllIlIIl[0]);
                a.a(lIIllIlIIl[12], lIIllIlIIl[3]);
                a.a(lIIllIlIIl[9], lIIllIlIIl[41]);
            }
        }
    }

    private static boolean lIIIIIlIlIIII(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean aR() {
        int n2;
        String[] stringArray = new String[lIIllIlIIl[0]];
        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[140]];
        if (u.lIIIIIlIlIIIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (u.lIIIIIlIlIIIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIllIlIIl[0]];
                nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[11];
                if (u.lIIIIIlIlIIIl(Inventory.getCount((int[])nArray2))) {
                    int[] nArray3 = new int[lIIllIlIIl[0]];
                    nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                    if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIllIlIIl[0];
                        0;
                        if (2 > 0) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIllIlIIl[1];
        return n2 != 0;
    }

    private static boolean lIIIIIlIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIlIIIll(String var7, String var27) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var27.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIllIlIIl[5], var8);
            return new String(var3.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIIllIlIIl[1];
    }

    private static void aN() {
        da.add(lIIllIlIIl[120]);
        0;
        da.add(lIIllIlIIl[121]);
        0;
        da.add(lIIllIlIIl[122]);
        0;
        da.add(lIIllIlIIl[123]);
        0;
        da.add(lIIllIlIIl[124]);
        0;
        da.add(lIIllIlIIl[125]);
        0;
        da.add(lIIllIlIIl[126]);
        0;
        while (u.lIIIIIlIIlllI(da.isEmpty() ? 1 : 0) && u.lIIIIIlIIlllI(da.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[lIIllIlIIl[0]];
            stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[127]];
            if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                0;
                if ((0x62 ^ 0x66) == (0x5C ^ 0x58)) break;
                return;
            }
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = da.get(lIIllIlIIl[1]);
            TileObject var17 = TileObjects.getNearest((int[])nArray);
            if (u.lIIIIIlIlIIII(var17)) {
                String[] stringArray2 = new String[lIIllIlIIl[0]];
                stringArray2[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[128]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIllIlIIl[0]];
                    stringArray3[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[129]];
                    Inventory.getFirst((String[])stringArray3).useOn(var17);
                    Time.sleepTicks((int)lIIllIlIIl[3]);
                    0;
                }
            }
            String[] stringArray4 = new String[lIIllIlIIl[0]];
            stringArray4[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[130]];
            if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                da.remove(lIIllIlIIl[1]);
                0;
                Time.sleepTicks((int)lIIllIlIIl[5]);
                0;
            }
            0;
            if (((0x7C ^ 0x4D) & ~(0x99 ^ 0xA8)) == 0) continue;
            return;
        }
    }

    private static String lIIIIIIlIIIlI(String var4, String var30) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var30.getBytes(StandardCharsets.UTF_8)), lIIllIlIIl[18]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(lIIllIlIIl[5], var19);
            return new String(var24.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIlIlIl(Object object) {
        return object == null;
    }

    @Override
    public int T() {
        try {
            u.aM();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (1 >= (5 ^ 1)) {
            return (0xB9 ^ 0xA0) & ~(0x21 ^ 0x38);
        }
        return lIIllIlIIl[117];
    }

    private static boolean lIIIIIlIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIllIlIIl[0]];
        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[141]];
        if (u.lIIIIIlIlIIIl(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (u.lIIIIIlIlIIIl(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIllIlIIl[0]];
                nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[lIIllIlIIl[0]];
                    nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                    if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        n2 = lIIllIlIIl[0];
                        0;
                        if (null == null) return n2 != 0;
                        return ((125 + 162 - 222 + 100 ^ 145 + 136 - 184 + 56) & (0x56 ^ 0x2A ^ (0xCB ^ 0x8B) ^ -1)) != 0;
                    }
                }
            }
        }
        n2 = lIIllIlIIl[1];
        return n2 != 0;
    }

    private static void lIIIIIlIIlIlI() {
        lIIllIlIIl = new int[186];
        u.lIIllIlIIl[0] = 1;
        u.lIIllIlIIl[1] = (0xC3 ^ 0xC5) & ~(0x56 ^ 0x50);
        u.lIIllIlIIl[2] = 236 + 96 - 80 + 1 ^ 69 + 81 - 4 + 4;
        u.lIIllIlIIl[3] = 0x4E ^ 0x32 ^ (0x2D ^ 0x54);
        u.lIIllIlIIl[4] = 0xFFFFFBBA & 0x17CD;
        u.lIIllIlIIl[5] = 2;
        u.lIIllIlIIl[6] = 0x5C ^ 0x48 ^ (0x5E ^ 0x4E);
        u.lIIllIlIIl[7] = -1 & (0xFFFFBF47 & 0x5FFF);
        u.lIIllIlIIl[8] = -(0x1D ^ 0x5E) & (0xFFFFF7E7 & 0xFDF);
        u.lIIllIlIIl[9] = -(0xBC ^ 0xA8) & (0xFFFFDF37 & 0x3FDB);
        u.lIIllIlIIl[10] = 3;
        u.lIIllIlIIl[11] = -(0xFFFFCBA7 & 0x3E5F) & (0xFFFFBB57 & Short.MAX_VALUE);
        u.lIIllIlIIl[12] = 0xFFFFFB7B & 0x5FF;
        u.lIIllIlIIl[13] = 0xBB ^ 0xB1;
        u.lIIllIlIIl[14] = 0xFFFFCF7F & 0x35B3;
        u.lIIllIlIIl[15] = 0xA4 ^ 0xBA ^ (0x85 ^ 0xA9);
        u.lIIllIlIIl[16] = 0x61 ^ 0x67;
        u.lIIllIlIIl[17] = 27 + 13 - -9 + 116 ^ 104 + 26 - 56 + 88;
        u.lIIllIlIIl[18] = 0xE9 ^ 0xC3 ^ (7 ^ 0x25);
        u.lIIllIlIIl[19] = 0xB3 ^ 0x9C ^ (0xA ^ 0x2C);
        u.lIIllIlIIl[20] = 127 + 116 - 167 + 61 ^ 71 + 21 - 49 + 87;
        u.lIIllIlIIl[21] = 0xA8 ^ 0xA4;
        u.lIIllIlIIl[22] = 0x6F ^ 5 ^ (0xF8 ^ 0x9F);
        u.lIIllIlIIl[23] = 0xC8 ^ 0xC6;
        u.lIIllIlIIl[24] = 0x38 ^ 0x37;
        u.lIIllIlIIl[25] = -(0xFFFFB6A1 & 0x7BFF) & (0xFFFFFFED & 0x3FFF);
        u.lIIllIlIIl[26] = -(0xFFFFFF45 & 0x42FF) & (0xFFFFCFFE & 0x7FF7);
        u.lIIllIlIIl[27] = 0x3B ^ 0x1E ^ (0x60 ^ 0x55);
        u.lIIllIlIIl[28] = 131 + 163 - 140 + 55 ^ 11 + 66 - -23 + 92;
        u.lIIllIlIIl[29] = 0x41 ^ 0x53;
        u.lIIllIlIIl[30] = 0xF2 ^ 0xA8 ^ (0xC ^ 0x45);
        u.lIIllIlIIl[31] = 0x1A ^ 0x6E ^ (0x61 ^ 1);
        u.lIIllIlIIl[32] = 0x81 ^ 0x94;
        u.lIIllIlIIl[33] = 166 + 112 - 226 + 122 ^ 70 + 19 - -43 + 52;
        u.lIIllIlIIl[34] = 57 + 143 - 130 + 103 ^ 27 + 81 - 98 + 176;
        u.lIIllIlIIl[35] = 0xE9 ^ 0x9C ^ (0x34 ^ 0x59);
        u.lIIllIlIIl[36] = 0x5D ^ 0xD ^ (0xE6 ^ 0xAF);
        u.lIIllIlIIl[37] = 0xA8 ^ 0xB2;
        u.lIIllIlIIl[38] = 0x1C ^ 0x58 ^ (0x6B ^ 0x34);
        u.lIIllIlIIl[39] = 0x29 ^ 9 ^ (0x43 ^ 0x7F);
        u.lIIllIlIIl[40] = 0x22 ^ 0x3F;
        u.lIIllIlIIl[41] = 0x3C ^ 0x23 ^ 1;
        u.lIIllIlIIl[42] = 0xA1 ^ 0xBE;
        u.lIIllIlIIl[43] = 105 + 167 - 183 + 84 ^ 133 + 76 - 174 + 106;
        u.lIIllIlIIl[44] = 0xA3 ^ 0x82;
        u.lIIllIlIIl[45] = 0xA1 ^ 0xC2 ^ (0x3C ^ 0x7D);
        u.lIIllIlIIl[46] = 25 + 47 - 21 + 79 ^ 115 + 109 - 80 + 17;
        u.lIIllIlIIl[47] = 0x64 ^ 0x40;
        u.lIIllIlIIl[48] = 0xA7 ^ 0xAD ^ (0x5D ^ 0x72);
        u.lIIllIlIIl[49] = 0x29 ^ 0x78 ^ (0xE8 ^ 0x9F);
        u.lIIllIlIIl[50] = 0xB1 ^ 0x85 ^ (0x34 ^ 0x27);
        u.lIIllIlIIl[51] = 140 + 32 - 49 + 21 ^ 0 + 61 - -53 + 70;
        u.lIIllIlIIl[52] = 0x33 ^ 0x1A;
        u.lIIllIlIIl[53] = 0xB7 ^ 0x9D;
        u.lIIllIlIIl[54] = 0xFFFF9DDF & 0x6FBE;
        u.lIIllIlIIl[55] = 0x8F ^ 0x82 ^ (0xA7 ^ 0x81);
        u.lIIllIlIIl[56] = 82 + 74 - 84 + 56 ^ 145 + 129 - 269 + 167;
        u.lIIllIlIIl[57] = 0xAC ^ 0x9B ^ (0xB2 ^ 0xA8);
        u.lIIllIlIIl[58] = 0xD4 ^ 0xA6 ^ (0x64 ^ 0x38);
        u.lIIllIlIIl[59] = 0x1D ^ 0x32;
        u.lIIllIlIIl[60] = 41 + 111 - 94 + 87 ^ 93 + 8 - 45 + 105;
        u.lIIllIlIIl[61] = 0xB2 ^ 0x83;
        u.lIIllIlIIl[62] = 0x4A ^ 0x79;
        u.lIIllIlIIl[63] = 0xA3 ^ 0x97;
        u.lIIllIlIIl[64] = 0xA4 ^ 0x91;
        u.lIIllIlIIl[65] = 0xFFFF9FFF & 0x6D9D;
        u.lIIllIlIIl[66] = 0x33 ^ 5;
        u.lIIllIlIIl[67] = 0xF3 ^ 0xC4;
        u.lIIllIlIIl[68] = 0x62 ^ 0x4F ^ (0x1D ^ 8);
        u.lIIllIlIIl[69] = 0x4B ^ 0x71 ^ 3;
        u.lIIllIlIIl[70] = 0xA ^ 0x30;
        u.lIIllIlIIl[71] = 0x9C ^ 0xA7;
        u.lIIllIlIIl[72] = 0x24 ^ 0x18;
        u.lIIllIlIIl[73] = 0x3B ^ 6;
        u.lIIllIlIIl[74] = 165 + 82 - 132 + 60 ^ 70 + 100 - 80 + 55;
        u.lIIllIlIIl[75] = 0x82 ^ 0xBD;
        u.lIIllIlIIl[76] = 0x68 ^ 0x40 ^ (0xFC ^ 0x94);
        u.lIIllIlIIl[77] = 4 ^ 0x45;
        u.lIIllIlIIl[78] = 0xB9 ^ 0xC1 ^ (0x7E ^ 0x44);
        u.lIIllIlIIl[79] = 0xF1 ^ 0xAF ^ (0x1B ^ 6);
        u.lIIllIlIIl[80] = 0xE9 ^ 0xAD;
        u.lIIllIlIIl[81] = 0x4B ^ 0xE;
        u.lIIllIlIIl[82] = 0x58 ^ 0x71 ^ (0x25 ^ 0x4A);
        u.lIIllIlIIl[83] = 0x87 ^ 0xC0;
        u.lIIllIlIIl[84] = 0x23 ^ 0x6B;
        u.lIIllIlIIl[85] = 0x82 ^ 0x96 ^ (0x32 ^ 0x6F);
        u.lIIllIlIIl[86] = 0x99 ^ 0x82 ^ (0xD7 ^ 0x86);
        u.lIIllIlIIl[87] = 0x73 ^ 1 ^ (0x20 ^ 0x19);
        u.lIIllIlIIl[88] = 0x45 ^ 9;
        u.lIIllIlIIl[89] = 82 + 78 - 49 + 84 ^ 130 + 141 - 131 + 2;
        u.lIIllIlIIl[90] = 10 + 21 - -23 + 164 ^ 58 + 25 - -57 + 8;
        u.lIIllIlIIl[91] = 196 + 137 - 222 + 142 ^ 56 + 21 - 22 + 123;
        u.lIIllIlIIl[92] = 0x74 ^ 0x28 ^ (0x31 ^ 0x3D);
        u.lIIllIlIIl[93] = 0xFFFF8DDF & 0x7F67;
        u.lIIllIlIIl[94] = -(0xFFFFCDA9 & 0x7B5F) & (0xFFFFFF9F & 0x6FFF);
        u.lIIllIlIIl[95] = 0xFFFFEF7D & 0x1DBE;
        u.lIIllIlIIl[96] = -(0xFFFFE1FB & 0x5E2E) & (0xFFFFDFEF & 0x6DBF);
        u.lIIllIlIIl[97] = 0xFFFFDFB0 & 0x2DFF;
        u.lIIllIlIIl[98] = 0xC7 ^ 0xA6 ^ (0xA5 ^ 0x95);
        u.lIIllIlIIl[99] = 158 + 176 - 306 + 169 ^ 0 + 144 - 74 + 81;
        u.lIIllIlIIl[100] = 0xFB ^ 0xA8;
        u.lIIllIlIIl[101] = 0xD4 ^ 0x9F ^ (0x92 ^ 0x8D);
        u.lIIllIlIIl[102] = 0x7D ^ 0x28;
        u.lIIllIlIIl[103] = 0xC6 ^ 0xB8 ^ (0x93 ^ 0xBB);
        u.lIIllIlIIl[104] = 0xA6 ^ 0x91 ^ (0x70 ^ 0x10);
        u.lIIllIlIIl[105] = 30 + 73 - 97 + 187 ^ 19 + 49 - -71 + 14;
        u.lIIllIlIIl[106] = 1 ^ (0x31 ^ 0x69);
        u.lIIllIlIIl[107] = 0xD6 ^ 0x8C;
        u.lIIllIlIIl[108] = 0x45 ^ 0x6D ^ (0x6C ^ 0x1F);
        u.lIIllIlIIl[109] = 0x5F ^ 3;
        u.lIIllIlIIl[110] = 95 + 73 - 71 + 116 ^ 86 + 39 - 108 + 119;
        u.lIIllIlIIl[111] = 0x38 ^ 0x66;
        u.lIIllIlIIl[112] = 0x35 ^ 0x6A;
        u.lIIllIlIIl[113] = 0x4F ^ 0x2F;
        u.lIIllIlIIl[114] = 0xF3 ^ 0x9B ^ (0x7F ^ 0x76);
        u.lIIllIlIIl[115] = 1 ^ (0x77 ^ 0x14);
        u.lIIllIlIIl[116] = 0x14 ^ 0x77;
        u.lIIllIlIIl[117] = 0x82 ^ 0x8D ^ (0xC5 ^ 0xAE);
        u.lIIllIlIIl[118] = 132 + 60 - 158 + 104 + (0x41 ^ 0x71) - (0x9C ^ 0xB9) + (0xBE ^ 0xBA);
        u.lIIllIlIIl[119] = 0x7A ^ 0x1F;
        u.lIIllIlIIl[120] = 0xFFFFFDFD & 0xFAA;
        u.lIIllIlIIl[121] = 0xFFFFCFBF & 0x3DEA;
        u.lIIllIlIIl[122] = 0xFFFFBDBF & 0x4FE7;
        u.lIIllIlIIl[123] = -(0xFFFFEFDF & 0x7037) & (0xFFFFEDBF & Short.MAX_VALUE);
        u.lIIllIlIIl[124] = -(0xFFFFDF5F & 0x62EA) & (0xFFFFEFFF & 0x5FEF);
        u.lIIllIlIIl[125] = 0xFFFFCFBB & 0x3DEF;
        u.lIIllIlIIl[126] = 0xFFFF9DBD & 0x6FE7;
        u.lIIllIlIIl[127] = 0xB ^ 0x6D;
        u.lIIllIlIIl[128] = 151 + 200 - 350 + 203 ^ 20 + 21 - -45 + 85;
        u.lIIllIlIIl[129] = 0x26 ^ 0xD ^ (0xCF ^ 0x8C);
        u.lIIllIlIIl[130] = 0xF0 ^ 0xC0 ^ (0xFB ^ 0xA2);
        u.lIIllIlIIl[131] = 0xBE ^ 0xB8 ^ (0x69 ^ 5);
        u.lIIllIlIIl[132] = 0x7D ^ 0x14 ^ (0xAC ^ 0xA9);
        u.lIIllIlIIl[133] = 0x53 ^ 0x3E;
        u.lIIllIlIIl[134] = 0x4F ^ 0x21;
        u.lIIllIlIIl[135] = 0x5F ^ 0x30;
        u.lIIllIlIIl[136] = 0xFF ^ 0x8F;
        u.lIIllIlIIl[137] = 0x27 ^ 0x56;
        u.lIIllIlIIl[138] = 0x76 ^ 4;
        u.lIIllIlIIl[139] = 4 ^ 0x77;
        u.lIIllIlIIl[140] = 0x17 ^ 0x63;
        u.lIIllIlIIl[141] = 65 + 96 - -1 + 18 ^ 158 + 21 - 173 + 187;
        u.lIIllIlIIl[142] = -(0xFFFFF217 & 0x5DFE) & (0xFFFFFF3D & 0x73FF);
        u.lIIllIlIIl[143] = -(0xFFFFA746 & 0x7AFB) & (0xFFFFFBFD & 0x276F);
        u.lIIllIlIIl[144] = -(0xFFFFDAB7 & 0x3569) & (0xFFFFBEEF & 0x7FFC);
        u.lIIllIlIIl[145] = 0xFFFFEDBB & 0x73EC;
        u.lIIllIlIIl[146] = -(0xFFFFB93F & 0x56D2) & (0xFFFFDBBF & 0x37D5);
        u.lIIllIlIIl[147] = 0x62 ^ 0x14;
        u.lIIllIlIIl[148] = 0xDE ^ 0x8D ^ (0x17 ^ 0x33);
        u.lIIllIlIIl[149] = 0xFFFFBD97 & 0x4EFE;
        u.lIIllIlIIl[150] = -(0xFFFFB67B & 0x7BEF) & (0xFFFFFFFB & 0x3FFF);
        u.lIIllIlIIl[151] = -(0xFFFFFCF5 & 0x23AB) & (0xFFFFFFEF & 0x2DFF);
        u.lIIllIlIIl[152] = 0xFFFFDFED & 0x2DB3;
        u.lIIllIlIIl[153] = 0xFFFFAFEF & 0x76BE;
        u.lIIllIlIIl[154] = 0xFFFFFFDF & 0x1F6D;
        u.lIIllIlIIl[155] = 0xFFFFFD5F & 0x1BB6;
        u.lIIllIlIIl[156] = -(0xFFFFB52F & 0x7AF9) & (0xFFFFFF7F & 0x3DFF);
        u.lIIllIlIIl[157] = -(0xFFFFF2DC & 0x6FAF) & (0xFFFFEFDF & Short.MAX_VALUE);
        u.lIIllIlIIl[158] = 0xFFFF9DE5 & 0x6FBA;
        u.lIIllIlIIl[159] = 0xFFFFCDDE & 0x3F7F;
        u.lIIllIlIIl[160] = 0xFFFFEFFF & 0x369F;
        u.lIIllIlIIl[161] = -(0xFFFFBB4F & 0x56BB) & (0xFFFFFFFA & 0x1F7F);
        u.lIIllIlIIl[162] = 0xFFFFFFE7 & 0x26BF;
        u.lIIllIlIIl[163] = 0xFFFFCFAF & 0x317E;
        u.lIIllIlIIl[164] = 0xFFFFC733 & 0x39FF;
        u.lIIllIlIIl[165] = 0xE0 ^ 0xA5 ^ (0x5F ^ 0x62);
        u.lIIllIlIIl[166] = 128 + 191 - 164 + 48 ^ 82 + 17 - 97 + 176;
        u.lIIllIlIIl[167] = 0x45 ^ 0x79 ^ (0xCF ^ 0x89);
        u.lIIllIlIIl[168] = 0xC7 ^ 0xBC;
        u.lIIllIlIIl[169] = 0xFD ^ 0x81;
        u.lIIllIlIIl[170] = 143 + 170 - 154 + 30 ^ 175 + 140 - 300 + 177;
        u.lIIllIlIIl[171] = 0x34 ^ 0x4A;
        u.lIIllIlIIl[172] = (0xA3 ^ 0x8B) + (0xA8 ^ 0xAE) - -(0x5E ^ 0x57) + (0x1E ^ 0x56);
        u.lIIllIlIIl[173] = (0xD7 ^ 0xBD) + (0x4B ^ 0x25) - (16 + 108 - 93 + 180) + (0xDF ^ 0xA4);
        u.lIIllIlIIl[174] = (0x58 ^ 0x32) + (52 + 28 - 36 + 84) - (98 + 78 - 129 + 114) + (0x1E ^ 0x26);
        u.lIIllIlIIl[175] = (0xB ^ 0x43) + (0x38 ^ 0x48) - (17 + 17 - -87 + 19) + (0x16 ^ 0x40);
        u.lIIllIlIIl[176] = (0x6B ^ 0x66) + (0xA4 ^ 0xB3) - (0x30 ^ 0x20) + (0xE8 ^ 0x87);
        u.lIIllIlIIl[177] = 31 + 29 - -30 + 42;
        u.lIIllIlIIl[178] = (0x39 ^ 0x29) + (0x4C ^ 0x7F) - (0xA0 ^ 0xA4) + (0x51 ^ 0x17);
        u.lIIllIlIIl[179] = (0x6D ^ 0x67) + (3 ^ 0x43) - (0x4E ^ 0x4B) + (0x15 ^ 0x54);
        u.lIIllIlIIl[180] = (0x46 ^ 0x48) + (0xE4 ^ 0x90) - 3 + (0x71 ^ 0x79);
        u.lIIllIlIIl[181] = (0x51 ^ 0xD) + (0xC7 ^ 0xB3) - (7 ^ 0x6F) + (0x73 ^ 0x53);
        u.lIIllIlIIl[182] = 134 + 15 - 83 + 71;
        u.lIIllIlIIl[183] = 49 + 31 - -44 + 14;
        u.lIIllIlIIl[184] = (0x76 ^ 0x20) + (0xE3 ^ 0x92) - (70 + 156 - 179 + 149) + (132 + 122 - 174 + 56);
        u.lIIllIlIIl[185] = (0x3F ^ 8) + (18 + 93 - 77 + 102) - (3 ^ 0x4B) + (0x6F ^ 0x7A);
    }

    private static boolean lIIIIIlIlIlII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean V() {
        int n2;
        if (u.lIIIIIlIlIllI(e.j(cY), lIIllIlIIl[72]) && u.lIIIIIlIlIllI(e.j(cZ), lIIllIlIIl[3])) {
            n2 = lIIllIlIIl[0];
            0;
            if (2 != 2) {
                return false;
            }
        } else {
            n2 = lIIllIlIIl[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void aP() {
        void var25;
        BankLocation bankLocation = BankLocation.getNearest();
        if (u.lIIIIIlIlIIII(bankLocation) && u.lIIIIIlIIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[136]];
            a.a(bankLocation);
        }
        if (u.lIIIIIlIlIIII(var25) && u.lIIIIIlIIllII(var25.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (u.lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlIIl[4]);
                0;
            }
            if (u.lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[137]];
                if (u.lIIIIIlIlIIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)lIIllIlIIl[6]);
                    0;
                }
                a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                a.a(lIIllIlIIl[11], lIIllIlIIl[0]);
                a.a(lIIllIlIIl[9], lIIllIlIIl[41]);
            }
        }
    }

    private static boolean lIIIIIlIIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlIlIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIIIIlIIIIl(String var9, String var15) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var15.toCharArray();
        int var1 = lIIllIlIIl[1];
        char[] var28 = var9.toCharArray();
        int var10 = var28.length;
        int var18 = lIIllIlIIl[1];
        while (u.lIIIIIlIIllIl(var18, var10)) {
            char var2 = var28[var18];
            var5.append((char)(var2 ^ var6[var1 % var6.length]));
            0;
            ++var1;
            ++var18;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static int lIIIIIlIIlIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        u.lIIIIIlIIlIlI();
        u.lIIIIIlIIlIIl();
        cP = new WorldPoint(lIIllIlIIl[149], lIIllIlIIl[150], lIIllIlIIl[1]);
        cQ = new WorldPoint(lIIllIlIIl[151], lIIllIlIIl[152], lIIllIlIIl[1]);
        cR = new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[153], lIIllIlIIl[1]);
        cS = new WorldPoint(lIIllIlIIl[154], lIIllIlIIl[155], lIIllIlIIl[1]);
        cT = new WorldPoint(lIIllIlIIl[156], lIIllIlIIl[152], lIIllIlIIl[5]);
        cU = new WorldPoint(lIIllIlIIl[157], lIIllIlIIl[158], lIIllIlIIl[1]);
        cV = new WorldPoint(lIIllIlIIl[159], lIIllIlIIl[160], lIIllIlIIl[1]);
        cW = new WorldPoint(lIIllIlIIl[161], lIIllIlIIl[162], lIIllIlIIl[1]);
        bv = new ArrayList<d>();
        cY = lIIllIlIIl[163];
        cZ = lIIllIlIIl[164];
        String[] stringArray = new String[lIIllIlIIl[31]];
        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[165]];
        stringArray[u.lIIllIlIIl[0]] = lIIllIIIIl[lIIllIlIIl[166]];
        stringArray[u.lIIllIlIIl[5]] = lIIllIIIIl[lIIllIlIIl[167]];
        stringArray[u.lIIllIlIIl[10]] = lIIllIIIIl[lIIllIlIIl[168]];
        stringArray[u.lIIllIlIIl[6]] = lIIllIIIIl[lIIllIlIIl[169]];
        stringArray[u.lIIllIlIIl[3]] = lIIllIIIIl[lIIllIlIIl[170]];
        stringArray[u.lIIllIlIIl[16]] = lIIllIIIIl[lIIllIlIIl[171]];
        stringArray[u.lIIllIlIIl[17]] = lIIllIIIIl[lIIllIlIIl[172]];
        stringArray[u.lIIllIlIIl[18]] = lIIllIIIIl[lIIllIlIIl[173]];
        stringArray[u.lIIllIlIIl[19]] = lIIllIIIIl[lIIllIlIIl[174]];
        stringArray[u.lIIllIlIIl[13]] = lIIllIIIIl[lIIllIlIIl[175]];
        stringArray[u.lIIllIlIIl[20]] = lIIllIIIIl[lIIllIlIIl[176]];
        stringArray[u.lIIllIlIIl[21]] = lIIllIIIIl[lIIllIlIIl[177]];
        stringArray[u.lIIllIlIIl[22]] = lIIllIIIIl[lIIllIlIIl[178]];
        stringArray[u.lIIllIlIIl[23]] = lIIllIIIIl[lIIllIlIIl[179]];
        stringArray[u.lIIllIlIIl[24]] = lIIllIIIIl[lIIllIlIIl[180]];
        stringArray[u.lIIllIlIIl[27]] = lIIllIIIIl[lIIllIlIIl[181]];
        stringArray[u.lIIllIlIIl[28]] = lIIllIIIIl[lIIllIlIIl[182]];
        stringArray[u.lIIllIlIIl[29]] = lIIllIIIIl[lIIllIlIIl[183]];
        stringArray[u.lIIllIlIIl[30]] = lIIllIIIIl[lIIllIlIIl[184]];
        bR = stringArray;
        da = new ArrayList();
    }

    /*
     * WARNING - void declaration
     */
    private static void aO() {
        if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
            void var21;
            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[131]];
            WorldArea worldArea = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
            if (u.lIIIIIlIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var14;
                WorldArea worldArea2 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                if (u.lIIIIIlIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                    0;
                    Time.sleepTicks((int)lIIllIlIIl[0]);
                    0;
                }
                if (u.lIIIIIlIIllII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        String[] stringArray = new String[lIIllIlIIl[0]];
                        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[2]];
                        TileObject var23 = TileObjects.getNearest((String[])stringArray);
                        if (u.lIIIIIlIlIIII(var23)) {
                            String[] stringArray2 = new String[lIIllIlIIl[0]];
                            stringArray2[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[132]];
                            if (u.lIIIIIlIIllII(var23.hasAction(stringArray2) ? 1 : 0)) {
                                var23.interact(lIIllIIIIl[lIIllIlIIl[133]]);
                                Time.sleepTicks((int)lIIllIlIIl[10]);
                                0;
                            }
                            String[] stringArray3 = new String[lIIllIlIIl[0]];
                            stringArray3[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[134]];
                            if (u.lIIIIIlIIllII(var23.hasAction(stringArray3) ? 1 : 0)) {
                                var23.interact(lIIllIIIIl[lIIllIlIIl[135]]);
                                Time.sleepTicks((int)lIIllIlIIl[10]);
                                0;
                            }
                        }
                    }
                }
            }
            if (u.lIIIIIlIIllII(var21.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)cW);
                0;
                Time.sleepTicks((int)lIIllIlIIl[0]);
                0;
            }
        }
    }

    private static void lIIIIIlIIlIIl() {
        lIIllIIIIl = new String[lIIllIlIIl[185]];
        u.lIIllIIIIl[u.lIIllIlIIl[1]] = u."Finished buying items, switching back to quest";
        u.lIIllIIIIl[u.lIIllIlIIl[0]] = u."Nav to bank";
        u.lIIllIIIIl[u.lIIllIlIIl[5]] = u."Handling banking";
        u.lIIllIIIIl[u.lIIllIlIIl[10]] = u."We are missing quest supplies, switching to BUYING";
        u.lIIllIIIIl[u.lIIllIlIIl[6]] = u."Drink";
        u.lIIllIIIIl[u.lIIllIlIIl[3]] = u."Eat";
        u.lIIllIIIIl[u.lIIllIlIIl[16]] = u."Nav to start";
        u.lIIllIIIIl[u.lIIllIlIIl[17]] = u."Starting quest";
        u.lIIllIIIIl[u.lIIllIlIIl[18]] = u."King Roald";
        u.lIIllIIIIl[u.lIIllIlIIl[19]] = u."Nav to temple door";
        u.lIIllIIIIl[u.lIIllIlIIl[13]] = u."Interesting door";
        u.lIIllIIIIl[u.lIIllIlIIl[20]] = u."Large door";
        u.lIIllIIIIl[u.lIIllIlIIl[21]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[22]] = u."Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[23]] = u."Nav to doggo";
        u.lIIllIIIIl[u.lIIllIlIIl[24]] = u."Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[27]] = u."Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[28]] = u."Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[29]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[30]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[31]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[32]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[33]] = u."Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[34]] = u."Wield";
        u.lIIllIIIIl[u.lIIllIlIIl[35]] = u."Temple Guardian";
        u.lIIllIIIIl[u.lIIllIlIIl[36]] = u."Attack";
        u.lIIllIIIIl[u.lIIllIlIIl[37]] = u."Monument";
        u.lIIllIIIIl[u.lIIllIlIIl[38]] = u."Break";
        u.lIIllIIIIl[u.lIIllIlIIl[39]] = u."Nav to temple door";
        u.lIIllIIIIl[u.lIIllIlIIl[40]] = u."Interacting door";
        u.lIIllIIIIl[u.lIIllIlIIl[41]] = u."Large door";
        u.lIIllIIIIl[u.lIIllIlIIl[42]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[43]] = u."tell the king";
        u.lIIllIIIIl[u.lIIllIlIIl[44]] = u."Nav to king";
        u.lIIllIIIIl[u.lIIllIlIIl[45]] = u."talk king";
        u.lIIllIIIIl[u.lIIllIlIIl[46]] = u."King Roald";
        u.lIIllIIIIl[u.lIIllIlIIl[47]] = u."Nav to jail";
        u.lIIllIIIIl[u.lIIllIlIIl[48]] = u."Interesting door";
        u.lIIllIIIIl[u.lIIllIlIIl[49]] = u."Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[50]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[51]] = u."Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[52]] = u."Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[53]] = u."Nav to gold key tile";
        u.lIIllIIIIl[u.lIIllIlIIl[55]] = u."Attack";
        u.lIIllIIIIl[u.lIIllIlIIl[56]] = u."Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[57]] = u."Eat";
        u.lIIllIIIIl[u.lIIllIlIIl[58]] = u."Take";
        u.lIIllIIIIl[u.lIIllIlIIl[59]] = u."Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[60]] = u."Nav to statues";
        u.lIIllIIIIl[u.lIIllIlIIl[61]] = u."Finding key";
        u.lIIllIIIIl[u.lIIllIlIIl[15]] = u."Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[62]] = u."Murky water";
        u.lIIllIIIIl[u.lIIllIlIIl[63]] = u."Getting water";
        u.lIIllIIIIl[u.lIIllIlIIl[64]] = u."Bucket";
        u.lIIllIIIIl[u.lIIllIlIIl[66]] = u."Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[67]] = u."Murky water";
        u.lIIllIIIIl[u.lIIllIlIIl[68]] = u."Nav to jail";
        u.lIIllIIIIl[u.lIIllIlIIl[69]] = u."Interesting door";
        u.lIIllIIIIl[u.lIIllIlIIl[70]] = u."Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[71]] = u."Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[72]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[73]] = u."Blessed water";
        u.lIIllIIIIl[u.lIIllIlIIl[74]] = u."Handling chat";
        u.lIIllIIIIl[u.lIIllIlIIl[75]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[76]] = u."Entering cell";
        u.lIIllIIIIl[u.lIIllIlIIl[77]] = u."Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[78]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[79]] = u."Blessed water";
        u.lIIllIIIIl[u.lIIllIlIIl[80]] = u."Coffin";
        u.lIIllIIIIl[u.lIIllIlIIl[81]] = u."Using water on coffin";
        u.lIIllIIIIl[u.lIIllIlIIl[82]] = u."Blessed water";
        u.lIIllIIIIl[u.lIIllIlIIl[83]] = u."Exiting cell";
        u.lIIllIIIIl[u.lIIllIlIIl[84]] = u."Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[85]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[86]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[87]] = u."Handling chat";
        u.lIIllIIIIl[u.lIIllIlIIl[88]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[89]] = u."Entering cell";
        u.lIIllIIIIl[u.lIIllIlIIl[90]] = u."Cell door";
        u.lIIllIIIIl[u.lIIllIlIIl[91]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[92]] = u."Nav to final tile";
        u.lIIllIIIIl[u.lIIllIlIIl[98]] = u."Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[99]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[100]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[101]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[102]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[103]] = u."Handling chat";
        u.lIIllIIIIl[u.lIIllIlIIl[104]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[105]] = u."Pure essence";
        u.lIIllIIIIl[u.lIIllIlIIl[106]] = u."Turning in ess";
        u.lIIllIIIIl[u.lIIllIlIIl[107]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[108]] = u."Pure essence";
        u.lIIllIIIIl[u.lIIllIlIIl[109]] = u."Grabbing more ess";
        u.lIIllIIIIl[u.lIIllIlIIl[110]] = u."Pure essence";
        u.lIIllIIIIl[u.lIIllIlIIl[111]] = u."Nav to final tile";
        u.lIIllIIIIl[u.lIIllIlIIl[112]] = u."Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[113]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[114]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[115]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[116]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[117]] = u."Finish & Unlock morty/start nature";
        u.lIIllIIIIl[u.lIIllIlIIl[119]] = u."Drezel";
        u.lIIllIIIIl[u.lIIllIlIIl[127]] = u."Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[128]] = u."Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[129]] = u."Golden key";
        u.lIIllIIIIl[u.lIIllIlIIl[130]] = u."Iron key";
        u.lIIllIIIIl[u.lIIllIlIIl[131]] = u."Nav to final tile";
        u.lIIllIIIIl[u.lIIllIlIIl[2]] = u."Trapdoor";
        u.lIIllIIIIl[u.lIIllIlIIl[132]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[133]] = u."Open";
        u.lIIllIIIIl[u.lIIllIlIIl[134]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[135]] = u."Climb-down";
        u.lIIllIIIIl[u.lIIllIlIIl[136]] = u."Nav to bank";
        u.lIIllIIIIl[u.lIIllIlIIl[137]] = u."Handling banking";
        u.lIIllIIIIl[u.lIIllIlIIl[138]] = u."Nav to bank";
        u.lIIllIIIIl[u.lIIllIlIIl[139]] = u."Handling banking";
        u.lIIllIIIIl[u.lIIllIlIIl[140]] = u."Bucket";
        u.lIIllIIIIl[u.lIIllIlIIl[141]] = u."Bucket";
        u.lIIllIIIIl[u.lIIllIlIIl[147]] = u."Priest In Peril";
        u.lIIllIIIIl[u.lIIllIlIIl[148]] = u."ring of wealth (";
        u.lIIllIIIIl[u.lIIllIlIIl[165]] = u."I'm looking for a quest!";
        u.lIIllIIIIl[u.lIIllIlIIl[166]] = u."Yes.";
        u.lIIllIIIIl[u.lIIllIlIIl[167]] = u."Ok, let me help then.";
        u.lIIllIIIIl[u.lIIllIlIIl[168]] = u."Yep, now tell me what the problem is.";
        u.lIIllIIIIl[u.lIIllIlIIl[169]] = u."Sure.";
        u.lIIllIIIIl[u.lIIllIlIIl[170]] = u."You're right, we don't.";
        u.lIIllIIIIl[u.lIIllIlIIl[171]] = u."Is there anything else interesting to do around here?";
        u.lIIllIIIIl[u.lIIllIlIIl[172]] = u."Well, what is it, I may be able to help?";
        u.lIIllIIIIl[u.lIIllIlIIl[173]] = u."Yes, I'll go and look for him.";
        u.lIIllIIIIl[u.lIIllIlIIl[174]] = u."Yes, I'm sure.";
        u.lIIllIIIIl[u.lIIllIlIIl[175]] = u."I'll get going.";
        u.lIIllIIIIl[u.lIIllIlIIl[176]] = u."Ok, thanks.";
        u.lIIllIIIIl[u.lIIllIlIIl[177]] = u."I think I've solved the puzzle!";
        u.lIIllIIIIl[u.lIIllIlIIl[178]] = u."How can I help?";
        u.lIIllIIIIl[u.lIIllIlIIl[179]] = u."Roald sent me to check on Drezel.";
        u.lIIllIIIIl[u.lIIllIlIIl[180]] = u."Why is the river such a good defence?";
        u.lIIllIIIIl[u.lIIllIlIIl[181]] = u."You're right, we don't.";
        u.lIIllIIIIl[u.lIIllIlIIl[182]] = u."Yes, of course.";
        u.lIIllIIIIl[u.lIIllIlIIl[183]] = u."Do you know of anything I can do in Morytania?";
        u.lIIllIIIIl[u.lIIllIlIIl[184]] = u."Well, what is it, I may be able to help?";
    }

    public static void aM() {
        if (u.lIIIIIlIIllII(bt ? 1 : 0)) {
            b.a(bv);
            if (u.lIIIIIlIIllIl(bv.size(), lIIllIlIIl[0])) {
                System.out.println(lIIllIIIIl[lIIllIlIIl[1]]);
                bt = lIIllIlIIl[1];
            }
        }
        if (u.lIIIIIlIIlllI(bt ? 1 : 0)) {
            TileObject var20;
            TileObject var26;
            BankLocation var12;
            if (u.lIIIIIlIIllIl(e.j(lIIllIlIIl[2]), lIIllIlIIl[3])) {
                E.ck();
            }
            if (u.lIIIIIlIIlllI(u.aR() ? 1 : 0) && u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[0]) && u.lIIIIIlIIllll(e.j(lIIllIlIIl[2]), lIIllIlIIl[3])) {
                var12 = BankLocation.getNearest();
                if (u.lIIIIIlIlIIII(var12) && u.lIIIIIlIIlllI(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[0]];
                    a.a(var12);
                }
                if (u.lIIIIIlIlIIII(var12) && u.lIIIIIlIIllII(var12.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (u.lIIIIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllIlIIl[4]);
                        0;
                    }
                    if (u.lIIIIIlIIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[5]];
                        if (u.lIIIIIlIlIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIllIlIIl[6]);
                            0;
                        }
                        if (u.lIIIIIlIlIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIllIlIIl[5]);
                            0;
                        }
                        int[] nArray = new int[lIIllIlIIl[3]];
                        nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                        nArray[u.lIIllIlIIl[0]] = lIIllIlIIl[8];
                        nArray[u.lIIllIlIIl[5]] = lIIllIlIIl[9];
                        nArray[u.lIIllIlIIl[10]] = lIIllIlIIl[11];
                        nArray[u.lIIllIlIIl[6]] = lIIllIlIIl[12];
                        if (u.lIIIIIlIIlllI(e.b(nArray) ? 1 : 0)) {
                            u.af();
                            System.out.println(lIIllIIIIl[lIIllIlIIl[10]]);
                            bt = lIIllIlIIl[0];
                            return;
                        }
                        int[] nArray2 = new int[lIIllIlIIl[3]];
                        nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                        nArray2[u.lIIllIlIIl[0]] = lIIllIlIIl[8];
                        nArray2[u.lIIllIlIIl[5]] = lIIllIlIIl[9];
                        nArray2[u.lIIllIlIIl[10]] = lIIllIlIIl[11];
                        nArray2[u.lIIllIlIIl[6]] = lIIllIlIIl[12];
                        if (u.lIIIIIlIIllII(e.b(nArray2) ? 1 : 0)) {
                            a.a(lIIllIlIIl[7], lIIllIlIIl[13]);
                            a.a(lIIllIlIIl[14], lIIllIlIIl[0]);
                            a.a(lIIllIlIIl[8], lIIllIlIIl[0]);
                            a.a(lIIllIlIIl[11], lIIllIlIIl[6]);
                            a.a(lIIllIlIIl[12], lIIllIlIIl[13]);
                        }
                    }
                }
            }
            if (u.lIIIIIlIIllII(Inventory.contains((int[])f.aV) ? 1 : 0) && u.lIIIIIlIIllIl(Movement.getRunEnergy(), lIIllIlIIl[15])) {
                Inventory.getFirst((int[])f.aV).interact(lIIllIIIIl[lIIllIlIIl[6]]);
                Time.sleepTicks((int)lIIllIlIIl[0]);
                0;
            }
            int[] nArray = new int[lIIllIlIIl[0]];
            nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
            if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray) ? 1 : 0) && u.lIIIIIlIlIIlI(u.lIIIIIlIIlIll(e.u(), 60.0))) {
                int[] nArray3 = new int[lIIllIlIIl[0]];
                nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
                Inventory.getFirst((int[])nArray3).interact(lIIllIIIIl[lIIllIlIIl[3]]);
                Time.sleepTicks((int)lIIllIlIIl[0]);
                0;
            }
            if (u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[0]) && u.lIIIIIlIIllII(u.aR() ? 1 : 0)) {
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[16]];
                    if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo((WorldPoint)cP);
                    0;
                    Time.sleepTicks((int)lIIllIlIIl[0]);
                    0;
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[17]];
                    g.a(lIIllIIIIl[lIIllIlIIl[18]], bR);
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[0])) {
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[19]];
                    Movement.walkTo((WorldPoint)cQ);
                    0;
                    Time.sleepTicks((int)lIIllIlIIl[0]);
                    0;
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[13]];
                    if (u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                        String[] stringArray = new String[lIIllIlIIl[0]];
                        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[20]];
                        TileObjects.getNearest((String[])stringArray).interact(lIIllIIIIl[lIIllIlIIl[21]]);
                    }
                    g.a(bR);
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[5])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[22]];
                if (u.lIIIIIlIlIlIl(NPCs.getNearest((String[])stringArray))) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[23]];
                    String[] stringArray2 = new String[lIIllIlIIl[0]];
                    stringArray2[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[24]];
                    var12 = TileObjects.getNearest((String[])stringArray2);
                    if (u.lIIIIIlIlIIII(var12) && u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo((Locatable)var12), lIIllIlIIl[6]) && u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                        g.a(bR);
                    }
                    if (!u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0) || u.lIIIIIlIlIIll(Players.getLocal().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                        Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1]));
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[10]);
                        0;
                    }
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[26], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                    String[] stringArray3 = new String[lIIllIlIIl[0]];
                    stringArray3[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[27]];
                    if (u.lIIIIIlIlIlIl(NPCs.getNearest((String[])stringArray3))) {
                        String[] stringArray4 = new String[lIIllIlIIl[0]];
                        stringArray4[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[28]];
                        var12 = TileObjects.getNearest((String[])stringArray4);
                        if (u.lIIIIIlIlIIII(var12) && u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray5 = new String[lIIllIlIIl[0]];
                            stringArray5[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[29]];
                            if (u.lIIIIIlIIllII(var12.hasAction(stringArray5) ? 1 : 0)) {
                                var12.interact(lIIllIIIIl[lIIllIlIIl[30]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);
                                0;
                            }
                            String[] stringArray6 = new String[lIIllIlIIl[0]];
                            stringArray6[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[31]];
                            if (u.lIIIIIlIIllII(var12.hasAction(stringArray6) ? 1 : 0)) {
                                var12.interact(lIIllIIIIl[lIIllIlIIl[32]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);
                                0;
                            }
                        }
                        g.a(bR);
                    }
                }
                String[] stringArray7 = new String[lIIllIlIIl[0]];
                stringArray7[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[33]];
                if (u.lIIIIIlIlIIII(NPCs.getNearest((String[])stringArray7))) {
                    int[] nArray4 = new int[lIIllIlIIl[0]];
                    nArray4[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                    if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIIllIlIIl[0]];
                        nArray5[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                        if (u.lIIIIIlIIlllI(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIIllIlIIl[0]];
                            nArray6[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                            Inventory.getFirst((int[])nArray6).interact(lIIllIIIIl[lIIllIlIIl[34]]);
                        }
                    }
                    if (u.lIIIIIlIlIlIl(Players.getLocal().getInteracting())) {
                        String[] stringArray8 = new String[lIIllIlIIl[0]];
                        stringArray8[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[35]];
                        NPCs.getNearest((String[])stringArray8).interact(lIIllIIIIl[lIIllIlIIl[36]]);
                        Time.sleepTicks((int)lIIllIlIIl[5]);
                        0;
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[10])) {
                if (u.lIIIIIlIIlllI(cX ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                        String[] stringArray = new String[lIIllIlIIl[0]];
                        stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[37]];
                        if (u.lIIIIIlIlIIII(TileObjects.getNearest((String[])stringArray))) {
                            int[] nArray7 = new int[lIIllIlIIl[0]];
                            nArray7[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                            if (u.lIIIIIlIIllII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIllIlIIl[0]];
                                nArray8[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
                                Inventory.getFirst((int[])nArray8).interact(lIIllIIIIl[lIIllIlIIl[38]]);
                                Time.sleepTicks((int)lIIllIlIIl[3]);
                                0;
                            }
                        }
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[39]];
                        Movement.walkTo((WorldPoint)cQ);
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cQ), lIIllIlIIl[5])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[40]];
                        if (u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIl[0]];
                            stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[41]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIllIIIIl[lIIllIlIIl[42]]);
                        }
                        g.a(bR);
                        if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0) && u.lIIIIIlIIllII(Dialog.getText().contains(lIIllIIIIl[lIIllIlIIl[43]]) ? 1 : 0)) {
                            cX = lIIllIlIIl[0];
                        }
                    }
                }
                if (u.lIIIIIlIIllII(cX ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[44]];
                        Movement.walkTo((WorldPoint)cP);
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cP), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[45]];
                        g.a(lIIllIIIIl[lIIllIlIIl[46]], bR);
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[6])) {
                ck = lIIllIlIIl[1];
                if (u.lIIIIIlIIlllI(u.ab() ? 1 : 0)) {
                    u.aQ();
                }
                if (u.lIIIIIlIIllII(u.ab() ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[47]];
                        if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)cT);
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[48]];
                        if (u.lIIIIIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lIIllIlIIl[0]];
                            stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[49]];
                            TileObjects.getNearest((String[])stringArray).interact(lIIllIIIIl[lIIllIlIIl[50]]);
                        }
                        g.a(bR);
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[3])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[51]];
                if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray9 = new String[lIIllIlIIl[0]];
                    stringArray9[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[52]];
                    if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray9) ? 1 : 0)) {
                        if (!u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), lIIllIlIIl[17]) || u.lIIIIIlIIllII(Players.getLocal().getWorldLocation().getPlane())) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[53]];
                            Movement.walkTo((WorldPoint)cU);
                            0;
                            Time.sleepTicks((int)lIIllIlIIl[0]);
                            0;
                        }
                        if (!u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cU), lIIllIlIIl[17]) || u.lIIIIIlIIlllI(Players.getLocal().getWorldLocation().getPlane())) {
                            if (u.lIIIIIlIlIlIl(Players.getLocal().getInteracting())) {
                                int[] nArray9 = new int[lIIllIlIIl[0]];
                                nArray9[u.lIIllIlIIl[1]] = lIIllIlIIl[54];
                                NPCs.getNearest((int[])nArray9).interact(lIIllIIIIl[lIIllIlIIl[55]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);
                                0;
                            }
                            String[] stringArray10 = new String[lIIllIlIIl[0]];
                            stringArray10[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[56]];
                            var12 = TileItems.getNearest((String[])stringArray10);
                            if (u.lIIIIIlIIllII(Inventory.isFull() ? 1 : 0)) {
                                int[] nArray10 = new int[lIIllIlIIl[0]];
                                nArray10[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
                                Inventory.getFirst((int[])nArray10).interact(lIIllIIIIl[lIIllIlIIl[57]]);
                                Time.sleepTicks((int)lIIllIlIIl[0]);
                                0;
                            }
                            if (u.lIIIIIlIlIIII(var12)) {
                                var12.interact(lIIllIIIIl[lIIllIlIIl[58]]);
                                Time.sleepTicks((int)lIIllIlIIl[5]);
                                0;
                            }
                        }
                    }
                }
                String[] stringArray11 = new String[lIIllIlIIl[0]];
                stringArray11[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[59]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray11) ? 1 : 0)) {
                    if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIIllIlIIl[13])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[60]];
                        Movement.walkTo((WorldPoint)cV);
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                    if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cV), lIIllIlIIl[13])) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[61]];
                        u.aN();
                    }
                }
                String[] stringArray12 = new String[lIIllIlIIl[0]];
                stringArray12[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[15]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                    String[] stringArray13 = new String[lIIllIlIIl[0]];
                    stringArray13[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[62]];
                    if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray13) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[63]];
                        String[] stringArray14 = new String[lIIllIlIIl[0]];
                        stringArray14[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[64]];
                        int[] nArray11 = new int[lIIllIlIIl[0]];
                        nArray11[u.lIIllIlIIl[1]] = lIIllIlIIl[65];
                        Inventory.getFirst((String[])stringArray14).useOn(TileObjects.getNearest((int[])nArray11));
                        Time.sleepTicks((int)lIIllIlIIl[6]);
                        0;
                    }
                }
                String[] stringArray15 = new String[lIIllIlIIl[0]];
                stringArray15[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[66]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray15) ? 1 : 0)) {
                    String[] stringArray16 = new String[lIIllIlIIl[0]];
                    stringArray16[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[67]];
                    if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray16) ? 1 : 0)) {
                        if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[68]];
                            if (u.lIIIIIlIIllII(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)cT);
                            0;
                            Time.sleepTicks((int)lIIllIlIIl[0]);
                            0;
                        }
                        if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIIllIlIIl[10])) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[69]];
                            String[] stringArray17 = new String[lIIllIlIIl[0]];
                            stringArray17[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[70]];
                            String[] stringArray18 = new String[lIIllIlIIl[0]];
                            stringArray18[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[71]];
                            Inventory.getFirst((String[])stringArray17).useOn(TileObjects.getNearest((String[])stringArray18));
                            Time.sleepTicks((int)lIIllIlIIl[10]);
                            0;
                        }
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[16])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[72]];
                var12 = NPCs.getNearest((String[])stringArray);
                String[] stringArray19 = new String[lIIllIlIIl[0]];
                stringArray19[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[73]];
                if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray19) ? 1 : 0) && u.lIIIIIlIlIIII(var12)) {
                    if (u.lIIIIIlIIllII(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[74]];
                        g.a(lIIllIIIIl[lIIllIlIIl[75]], bR);
                    }
                    if (u.lIIIIIlIIlllI(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[76]];
                        String[] stringArray20 = new String[lIIllIlIIl[0]];
                        stringArray20[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[77]];
                        TileObjects.getNearest((String[])stringArray20).interact(lIIllIIIIl[lIIllIlIIl[78]]);
                        Time.sleepTicks((int)lIIllIlIIl[5]);
                        0;
                    }
                }
                String[] stringArray21 = new String[lIIllIlIIl[0]];
                stringArray21[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[79]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray21) ? 1 : 0)) {
                    String[] stringArray22 = new String[lIIllIlIIl[0]];
                    stringArray22[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[80]];
                    var26 = TileObjects.getNearest((String[])stringArray22);
                    if (u.lIIIIIlIlIIII(var26)) {
                        if (u.lIIIIIlIIllII(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[81]];
                            String[] stringArray23 = new String[lIIllIlIIl[0]];
                            stringArray23[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[82]];
                            Inventory.getFirst((String[])stringArray23).useOn(var26);
                            Time.sleepTicks((int)lIIllIlIIl[5]);
                            0;
                        }
                        if (u.lIIIIIlIIlllI(Reachable.isInteractable((Locatable)var26) ? 1 : 0)) {
                            AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[83]];
                            String[] stringArray24 = new String[lIIllIlIIl[0]];
                            stringArray24[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[84]];
                            TileObjects.getNearest((String[])stringArray24).interact(lIIllIIIIl[lIIllIlIIl[85]]);
                            Time.sleepTicks((int)lIIllIlIIl[5]);
                            0;
                        }
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[17])) {
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[86]];
                var12 = NPCs.getNearest((String[])stringArray);
                if (u.lIIIIIlIlIIII(var12)) {
                    if (u.lIIIIIlIIllII(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[87]];
                        g.a(lIIllIIIIl[lIIllIlIIl[88]], bR);
                    }
                    if (u.lIIIIIlIIlllI(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[89]];
                        String[] stringArray25 = new String[lIIllIlIIl[0]];
                        stringArray25[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[90]];
                        TileObjects.getNearest((String[])stringArray25).interact(lIIllIIIIl[lIIllIlIIl[91]]);
                        Time.sleepTicks((int)lIIllIlIIl[5]);
                        0;
                    }
                }
            }
            if (u.lIIIIIlIIllll(e.j(cY), lIIllIlIIl[18])) {
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[92]];
                    var12 = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
                    if (u.lIIIIIlIIlllI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var26 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                        if (u.lIIIIIlIIlllI(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                            0;
                            Time.sleepTicks((int)lIIllIlIIl[0]);
                            0;
                        }
                        if (u.lIIIIIlIIllII(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                                0;
                                Time.sleepTicks((int)lIIllIlIIl[0]);
                                0;
                            }
                            if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                String[] stringArray = new String[lIIllIlIIl[0]];
                                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[98]];
                                var20 = TileObjects.getNearest((String[])stringArray);
                                if (u.lIIIIIlIlIIII(var20)) {
                                    String[] stringArray26 = new String[lIIllIlIIl[0]];
                                    stringArray26[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[99]];
                                    if (u.lIIIIIlIIllII(var20.hasAction(stringArray26) ? 1 : 0)) {
                                        var20.interact(lIIllIIIIl[lIIllIlIIl[100]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);
                                        0;
                                    }
                                    String[] stringArray27 = new String[lIIllIlIIl[0]];
                                    stringArray27[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[101]];
                                    if (u.lIIIIIlIIllII(var20.hasAction(stringArray27) ? 1 : 0)) {
                                        var20.interact(lIIllIIIIl[lIIllIlIIl[102]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (u.lIIIIIlIIllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cW);
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[103]];
                    g.a(lIIllIIIIl[lIIllIlIIl[104]], bR);
                }
            }
            if (u.lIIIIIlIlIllI(e.j(cY), lIIllIlIIl[13]) && u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[72])) {
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    String[] stringArray = new String[lIIllIlIIl[0]];
                    stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[105]];
                    if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[106]];
                        if (u.lIIIIIlIIllIl(ck, lIIllIlIIl[0])) {
                            U.kv += lIIllIlIIl[0];
                            U.o(AccBuilderRogues.m);
                            ck += lIIllIlIIl[0];
                            U.kv = lIIllIlIIl[1];
                            cl = lIIllIlIIl[1];
                        }
                        g.a(lIIllIIIIl[lIIllIlIIl[107]], bR);
                    }
                }
                String[] stringArray = new String[lIIllIlIIl[0]];
                stringArray[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[108]];
                if (u.lIIIIIlIIlllI(Inventory.contains((String[])stringArray) ? 1 : 0) && u.lIIIIIlIIllIl(e.j(cY), lIIllIlIIl[72])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[109]];
                    u.aP();
                }
                String[] stringArray28 = new String[lIIllIlIIl[0]];
                stringArray28[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[110]];
                if (u.lIIIIIlIIllII(Inventory.contains((String[])stringArray28) ? 1 : 0) && u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3]) && u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[111]];
                    var12 = new WorldArea(lIIllIlIIl[93], lIIllIlIIl[94], lIIllIlIIl[60], lIIllIlIIl[43], lIIllIlIIl[1]);
                    if (u.lIIIIIlIIlllI(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        var26 = new WorldArea(lIIllIlIIl[95], lIIllIlIIl[96], lIIllIlIIl[48], lIIllIlIIl[63], lIIllIlIIl[1]);
                        if (u.lIIIIIlIIlllI(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                            0;
                            Time.sleepTicks((int)lIIllIlIIl[0]);
                            0;
                        }
                        if (u.lIIIIIlIIllII(var26.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                Movement.walkTo((WorldPoint)new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1]));
                                0;
                                Time.sleepTicks((int)lIIllIlIIl[0]);
                                0;
                            }
                            if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIllIlIIl[25], lIIllIlIIl[97], lIIllIlIIl[1])), lIIllIlIIl[3])) {
                                String[] stringArray29 = new String[lIIllIlIIl[0]];
                                stringArray29[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[112]];
                                var20 = TileObjects.getNearest((String[])stringArray29);
                                if (u.lIIIIIlIlIIII(var20)) {
                                    String[] stringArray30 = new String[lIIllIlIIl[0]];
                                    stringArray30[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[113]];
                                    if (u.lIIIIIlIIllII(var20.hasAction(stringArray30) ? 1 : 0)) {
                                        var20.interact(lIIllIIIIl[lIIllIlIIl[114]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);
                                        0;
                                    }
                                    String[] stringArray31 = new String[lIIllIlIIl[0]];
                                    stringArray31[u.lIIllIlIIl[1]] = lIIllIIIIl[lIIllIlIIl[115]];
                                    if (u.lIIIIIlIIllII(var20.hasAction(stringArray31) ? 1 : 0)) {
                                        var20.interact(lIIllIIIIl[lIIllIlIIl[116]]);
                                        Time.sleepTicks((int)lIIllIlIIl[10]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (u.lIIIIIlIIllII(var12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cW);
                        0;
                        Time.sleepTicks((int)lIIllIlIIl[0]);
                        0;
                    }
                }
            }
            if (u.lIIIIIlIlIllI(e.j(cY), lIIllIlIIl[72]) && u.lIIIIIlIIllIl(e.j(cZ), lIIllIlIIl[3])) {
                AccBuilderRogues.c = lIIllIIIIl[lIIllIlIIl[117]];
                if (u.lIIIIIlIlIIll(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    u.aO();
                }
                if (u.lIIIIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(cW), lIIllIlIIl[3])) {
                    if (u.lIIIIIlIlIIII(Widgets.get((int)lIIllIlIIl[118], (int)lIIllIlIIl[27]))) {
                        Mouse.click((int)Widgets.get((int)lIIllIlIIl[118], (int)lIIllIlIIl[27]).getClickPoint().getX(), (int)Widgets.get((int)lIIllIlIIl[118], (int)lIIllIlIIl[27]).getClickPoint().getY(), (boolean)lIIllIlIIl[0]);
                        Time.sleepTicks((int)lIIllIlIIl[10]);
                        0;
                    }
                    g.a(lIIllIIIIl[lIIllIlIIl[119]], bR);
                    g.a(bR);
                }
            }
            g.a(bR);
        }
    }

    private static void af() {
        d var29;
        Object var13;
        block10: {
            block9: {
                int[] nArray = new int[lIIllIlIIl[0]];
                nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[14];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    d d2 = new d(lIIllIlIIl[14], lIIllIlIIl[0], lIIllIlIIl[142]);
                    bv.add(d2);
                    0;
                }
                int[] nArray2 = new int[lIIllIlIIl[0]];
                nArray2[u.lIIllIlIIl[1]] = lIIllIlIIl[8];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    var13 = new d(lIIllIlIIl[8], lIIllIlIIl[0], lIIllIlIIl[142]);
                    bv.add((d)var13);
                    0;
                }
                int[] nArray3 = new int[lIIllIlIIl[0]];
                nArray3[u.lIIllIlIIl[1]] = lIIllIlIIl[11];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    var13 = new d(lIIllIlIIl[11], lIIllIlIIl[3], i.bq);
                    bv.add((d)var13);
                    0;
                }
                int[] nArray4 = new int[lIIllIlIIl[0]];
                nArray4[u.lIIllIlIIl[1]] = lIIllIlIIl[12];
                if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    var13 = new d(lIIllIlIIl[12], lIIllIlIIl[41], lIIllIlIIl[143]);
                    bv.add((d)var13);
                    0;
                }
                int[] nArray5 = new int[lIIllIlIIl[0]];
                nArray5[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                if (!u.lIIIIIlIIllII(Bank.contains((int[])nArray5) ? 1 : 0)) break block9;
                int[] nArray6 = new int[lIIllIlIIl[0]];
                nArray6[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                if (!u.lIIIIIlIIllII(Bank.contains((int[])nArray6) ? 1 : 0)) break block10;
                int[] nArray7 = new int[lIIllIlIIl[0]];
                nArray7[u.lIIllIlIIl[1]] = lIIllIlIIl[9];
                if (!u.lIIIIIlIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIllIlIIl[15])) break block10;
            }
            var13 = new d(lIIllIlIIl[9], lIIllIlIIl[15], lIIllIlIIl[107]);
            bv.add((d)var13);
            0;
        }
        if (u.lIIIIIlIIlllI(Bank.contains((Predicate)(var13 = item -> item.getName().toLowerCase().contains(lIIllIIIIl[lIIllIlIIl[148]]))) ? 1 : 0)) {
            var29 = new d(lIIllIlIIl[144], lIIllIlIIl[3], lIIllIlIIl[145]);
            bv.add(var29);
            0;
        }
        int[] nArray = new int[lIIllIlIIl[0]];
        nArray[u.lIIllIlIIl[1]] = lIIllIlIIl[7];
        if (u.lIIIIIlIIlllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            var29 = new d(lIIllIlIIl[7], lIIllIlIIl[51], lIIllIlIIl[146]);
            bv.add(var29);
            0;
        }
    }

    private static boolean lIIIIIlIIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public String U() {
        return lIIllIIIIl[lIIllIlIIl[147]];
    }

    private static boolean lIIIIIlIlIIlI(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIlIIlllI(int n2) {
        return n2 == 0;
    }
}

