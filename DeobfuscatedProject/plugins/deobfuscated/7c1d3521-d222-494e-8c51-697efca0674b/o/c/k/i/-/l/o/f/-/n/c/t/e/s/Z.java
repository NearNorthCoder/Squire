/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class Z
implements ac {
    static /* synthetic */ int di;
    private static /* synthetic */ String[] llIlIlIIIl;
    public static /* synthetic */ String[] cE;
    public static final /* synthetic */ WorldPoint mE;
    public static final /* synthetic */ WorldPoint mF;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ int[] llIlIlIlll;
    public static final /* synthetic */ WorldPoint mG;
    static /* synthetic */ int cG;
    public static final /* synthetic */ WorldPoint mD;
    public static /* synthetic */ List<d> bv;

    private static boolean lIllIIllIllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            Z.es();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((45 + 86 - 92 + 108 ^ 102 + 55 - -14 + 3) & (14 + 184 - 22 + 13 ^ 30 + 100 - 73 + 71 ^ -1)) >= 2) {
            return (0x23 ^ 0x12 ^ (0xE6 ^ 0x9C)) & (13 + 113 - 38 + 55 ^ 145 + 142 - 187 + 96 ^ -1);
        }
        return llIlIlIlll[53];
    }

    private static boolean lIllIIlllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean an() {
        int[] nArray = new int[llIlIlIlll[1]];
        nArray[Z.llIlIlIlll[0]] = llIlIlIlll[9];
        return Inventory.contains((int[])nArray);
    }

    private static boolean lIllIIlllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlllIIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean ae() {
        return llIlIlIlll[0];
    }

    private static boolean lIllIIlllIIII(int n2) {
        return n2 > 0;
    }

    private static String lIllIIllIIIlI(String llllllllllllllllllIIIlllIllIIlIl, String llllllllllllllllllIIIlllIllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlllIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlllIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlllIllIIlll.init(llIlIlIlll[3], llllllllllllllllllIIIlllIllIlIII);
            return new String(llllllllllllllllllIIIlllIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlllIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlllIllIIllI) {
            llllllllllllllllllIIIlllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static void Q() {
        d llllllllllllllllllIIIllllIIIIIII;
        Object llllllllllllllllllIIIllllIIIIIIl;
        int[] nArray = new int[llIlIlIlll[1]];
        nArray[Z.llIlIlIlll[0]] = llIlIlIlll[48];
        if (Z.lIllIIllIllll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIlIlIlll[48], llIlIlIlll[10], j.cf);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIlIlIlll[1]];
        nArray2[Z.llIlIlIlll[0]] = llIlIlIlll[9];
        if (Z.lIllIIllIllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIIIllllIIIIIIl = new d(llIlIlIlll[9], llIlIlIlll[1], llIlIlIlll[49]);
            bv.add((d)llllllllllllllllllIIIllllIIIIIIl);
            0;
        }
        if (Z.lIllIIllIllll(Bank.contains(llllllllllllllllllIIIllllIIIIIIl = item -> item.getName().toLowerCase().contains(llIlIlIIIl[llIlIlIlll[54]])) ? 1 : 0)) {
            llllllllllllllllllIIIllllIIIIIII = new d(llIlIlIlll[50], llIlIlIlll[10], llIlIlIlll[51]);
            bv.add(llllllllllllllllllIIIllllIIIIIII);
            0;
        }
        int[] nArray3 = new int[llIlIlIlll[1]];
        nArray3[Z.llIlIlIlll[0]] = llIlIlIlll[11];
        if (Z.lIllIIllIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIIllllIIIIIII = new d(llIlIlIlll[11], llIlIlIlll[20], llIlIlIlll[52]);
            bv.add(llllllllllllllllllIIIllllIIIIIII);
            0;
        }
    }

    private static void lIllIIllIlIll() {
        llIlIlIIIl = new String[llIlIlIlll[75]];
        Z.llIlIlIIIl[Z.llIlIlIlll[0]] = Z."Buying items";
        Z.llIlIlIIIl[Z.llIlIlIlll[1]] = Z."Finished buying items, switching back to quest";
        Z.llIlIlIIIl[Z.llIlIlIlll[3]] = Z."Drink";
        Z.llIlIlIIIl[Z.llIlIlIlll[6]] = Z."Nav to bank";
        Z.llIlIlIIIl[Z.llIlIlIlll[7]] = Z."Handling banking";
        Z.llIlIlIIIl[Z.llIlIlIlll[10]] = Z."We are missing quest supplies, switching to BUYING";
        Z.llIlIlIIIl[Z.llIlIlIlll[14]] = Z."Nav to romeo";
        Z.llIlIlIIIl[Z.llIlIlIlll[15]] = Z."Starting quest";
        Z.llIlIlIIIl[Z.llIlIlIlll[13]] = Z."Romeo";
        Z.llIlIlIIIl[Z.llIlIlIlll[16]] = Z."Wear";
        Z.llIlIlIIIl[Z.llIlIlIlll[12]] = Z."Nav to juliet";
        Z.llIlIlIIIl[Z.llIlIlIlll[17]] = Z."Talk to juliet";
        Z.llIlIlIIIl[Z.llIlIlIlll[18]] = Z."Open";
        Z.llIlIlIIIl[Z.llIlIlIlll[19]] = Z."Juliet";
        Z.llIlIlIIIl[Z.llIlIlIlll[21]] = Z."Nav to romeo";
        Z.llIlIlIIIl[Z.llIlIlIlll[22]] = Z."Starting quest";
        Z.llIlIlIIIl[Z.llIlIlIlll[23]] = Z."Romeo";
        Z.llIlIlIIIl[Z.llIlIlIlll[25]] = Z."Nav to father";
        Z.llIlIlIIIl[Z.llIlIlIlll[26]] = Z."talk father";
        Z.llIlIlIIIl[Z.llIlIlIlll[27]] = Z."Father Lawrence";
        Z.llIlIlIIIl[Z.llIlIlIlll[20]] = Z."Nav to potion guy";
        Z.llIlIlIIIl[Z.llIlIlIlll[29]] = Z."talk potions";
        Z.llIlIlIIIl[Z.llIlIlIlll[30]] = Z."Apothecary";
        Z.llIlIlIIIl[Z.llIlIlIlll[31]] = Z."Cadava potion";
        Z.llIlIlIIIl[Z.llIlIlIlll[32]] = Z."Nav to potion guy";
        Z.llIlIlIIIl[Z.llIlIlIlll[33]] = Z."Cadava potion";
        Z.llIlIlIIIl[Z.llIlIlIlll[34]] = Z."talk potions";
        Z.llIlIlIIIl[Z.llIlIlIlll[35]] = Z."Apothecary";
        Z.llIlIlIIIl[Z.llIlIlIlll[36]] = Z."Cadava potion";
        Z.llIlIlIIIl[Z.llIlIlIlll[37]] = Z."Wear";
        Z.llIlIlIIIl[Z.llIlIlIlll[24]] = Z."Nav to juliet";
        Z.llIlIlIIIl[Z.llIlIlIlll[38]] = Z."Talk to juliet";
        Z.llIlIlIIIl[Z.llIlIlIlll[39]] = Z."Open";
        Z.llIlIlIIIl[Z.llIlIlIlll[40]] = Z."Juliet";
        Z.llIlIlIIIl[Z.llIlIlIlll[42]] = Z."Nav to romeo";
        Z.llIlIlIIIl[Z.llIlIlIlll[43]] = Z."Finishing quest";
        Z.llIlIlIIIl[Z.llIlIlIlll[44]] = Z."Romeo";
        Z.llIlIlIIIl[Z.llIlIlIlll[45]] = Z."Nav to bank";
        Z.llIlIlIIIl[Z.llIlIlIlll[46]] = Z."Handling banking";
        Z.llIlIlIIIl[Z.llIlIlIlll[47]] = Z."We are missing quest supplies, switching to BUYING";
        Z.llIlIlIIIl[Z.llIlIlIlll[28]] = Z."Romeo & Juliet quest";
        Z.llIlIlIIIl[Z.llIlIlIlll[54]] = Z."ring of wealth (";
        Z.llIlIlIIIl[Z.llIlIlIlll[55]] = Z."Door";
        Z.llIlIlIIIl[Z.llIlIlIlll[58]] = Z."Open";
        Z.llIlIlIIIl[Z.llIlIlIlll[59]] = Z."Door";
        Z.llIlIlIIIl[Z.llIlIlIlll[60]] = Z."Open";
        Z.llIlIlIIIl[Z.llIlIlIlll[69]] = Z."Yes, I have seen her actually!";
        Z.llIlIlIIIl[Z.llIlIlIlll[70]] = Z."Yes, ok, I'll let her know.";
        Z.llIlIlIIIl[Z.llIlIlIlll[71]] = Z."Ok, thanks.";
        Z.llIlIlIIIl[Z.llIlIlIlll[72]] = Z."Talk about something else.";
        Z.llIlIlIIIl[Z.llIlIlIlll[2]] = Z."Talk about Romeo & Juliet.";
        Z.llIlIlIIIl[Z.llIlIlIlll[73]] = Z."Ok, thanks.";
        Z.llIlIlIIIl[Z.llIlIlIlll[74]] = Z."Yes.";
    }

    @Override
    public String ag() {
        return llIlIlIIIl[llIlIlIlll[28]];
    }

    private static String lIllIIllIIIIl(String llllllllllllllllllIIIlllIlIlIlIl, String llllllllllllllllllIIIlllIlIIllll) {
        llllllllllllllllllIIIlllIlIlIlIl = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIlllIlIlIIll = new StringBuilder();
        char[] llllllllllllllllllIIIlllIlIlIIlI = llllllllllllllllllIIIlllIlIIllll.toCharArray();
        int llllllllllllllllllIIIlllIlIlIIIl = llIlIlIlll[0];
        char[] llllllllllllllllllIIIlllIlIIlIll = llllllllllllllllllIIIlllIlIlIlIl.toCharArray();
        int llllllllllllllllllIIIlllIlIIlIlI = llllllllllllllllllIIIlllIlIIlIll.length;
        int llllllllllllllllllIIIlllIlIIlIIl = llIlIlIlll[0];
        while (Z.lIllIIllIlllI(llllllllllllllllllIIIlllIlIIlIIl, llllllllllllllllllIIIlllIlIIlIlI)) {
            char llllllllllllllllllIIIlllIlIlIllI = llllllllllllllllllIIIlllIlIIlIll[llllllllllllllllllIIIlllIlIIlIIl];
            llllllllllllllllllIIIlllIlIlIIll.append((char)(llllllllllllllllllIIIlllIlIlIllI ^ llllllllllllllllllIIIlllIlIlIIlI[llllllllllllllllllIIIlllIlIlIIIl % llllllllllllllllllIIIlllIlIlIIlI.length]));
            0;
            ++llllllllllllllllllIIIlllIlIlIIIl;
            ++llllllllllllllllllIIIlllIlIIlIIl;
            0;
            if (3 != ((0xD ^ 8) & ~(0x35 ^ 0x30))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIlllIlIlIIll);
    }

    /*
     * WARNING - void declaration
     */
    private static void dA() {
        void llllllllllllllllllIIIllllIIIIlII;
        BankLocation bankLocation = BankLocation.getNearest();
        if (Z.lIllIIlllIIIl(bankLocation) && Z.lIllIIllIllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[45]];
            a.a(bankLocation);
            Time.sleepTicks((int)llIlIlIlll[3]);
            0;
        }
        if (Z.lIllIIlllIIIl(llllllllllllllllllIIIllllIIIIlII) && Z.lIllIIllIllIl(llllllllllllllllllIIIllllIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[46]];
            if (Z.lIllIIllIllll(Bank.isOpen() ? 1 : 0)) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlIlll[8]);
                0;
            }
            if (Z.lIllIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                if (Z.lIllIIlllIIII(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks((int)llIlIlIlll[7]);
                    0;
                }
                if (Z.lIllIIlllIIII(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks((int)llIlIlIlll[3]);
                    0;
                }
                int[] nArray = new int[llIlIlIlll[1]];
                nArray[Z.llIlIlIlll[0]] = llIlIlIlll[9];
                if (Z.lIllIIllIllll(e.c(nArray) ? 1 : 0)) {
                    Z.Q();
                    System.out.println(llIlIlIIIl[llIlIlIlll[47]]);
                    bt = llIlIlIlll[1];
                    return;
                }
                int[] nArray2 = new int[llIlIlIlll[1]];
                nArray2[Z.llIlIlIlll[0]] = llIlIlIlll[9];
                if (Z.lIllIIllIllIl(e.c(nArray2) ? 1 : 0)) {
                    a.a(llIlIlIlll[9], llIlIlIlll[1]);
                    a.b(f.ba, llIlIlIlll[3]);
                    a.a(llIlIlIlll[11], llIlIlIlll[12]);
                    a.b(f.bk, llIlIlIlll[1]);
                }
            }
        }
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (Z.lIllIIlllllIl(e.j(llIlIlIlll[5]), llIlIlIlll[53])) {
            bl = llIlIlIlll[1];
            0;
            if (((0xF1 ^ 0xA6) & ~(0x90 ^ 0xC7)) > 0) {
                return ((0x6F ^ 0x67) & ~(0x2C ^ 0x24)) != 0;
            }
        } else {
            bl = llIlIlIlll[0];
        }
        return bl;
    }

    static {
        Z.lIllIIllIllII();
        Z.lIllIIllIlIll();
        mD = new WorldPoint(llIlIlIlll[61], llIlIlIlll[62], llIlIlIlll[0]);
        mE = new WorldPoint(llIlIlIlll[63], llIlIlIlll[64], llIlIlIlll[1]);
        mF = new WorldPoint(llIlIlIlll[65], llIlIlIlll[66], llIlIlIlll[0]);
        mG = new WorldPoint(llIlIlIlll[67], llIlIlIlll[68], llIlIlIlll[0]);
        String[] stringArray = new String[llIlIlIlll[15]];
        stringArray[Z.llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[69]];
        stringArray[Z.llIlIlIlll[1]] = llIlIlIIIl[llIlIlIlll[70]];
        stringArray[Z.llIlIlIlll[3]] = llIlIlIIIl[llIlIlIlll[71]];
        stringArray[Z.llIlIlIlll[6]] = llIlIlIIIl[llIlIlIlll[72]];
        stringArray[Z.llIlIlIlll[7]] = llIlIlIIIl[llIlIlIlll[2]];
        stringArray[Z.llIlIlIlll[10]] = llIlIlIIIl[llIlIlIlll[73]];
        stringArray[Z.llIlIlIlll[14]] = llIlIlIIIl[llIlIlIlll[74]];
        cE = stringArray;
        bv = new ArrayList<d>();
        cG = llIlIlIlll[0];
    }

    private static boolean lIllIIlllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIllIllII() {
        llIlIlIlll = new int[76];
        Z.llIlIlIlll[0] = (199 + 160 - 209 + 102 ^ 5 + 85 - -59 + 41) & (0xE0 ^ 0xC0 ^ (0x78 ^ 0x1A) ^ -1);
        Z.llIlIlIlll[1] = 1;
        Z.llIlIlIlll[2] = 0x45 ^ 0x77;
        Z.llIlIlIlll[3] = 2;
        Z.llIlIlIlll[4] = 0xFFFF93F7 & 0x6FEB;
        Z.llIlIlIlll[5] = 20 + 99 - 114 + 139;
        Z.llIlIlIlll[6] = 3;
        Z.llIlIlIlll[7] = 16 + 50 - -60 + 66 ^ 171 + 103 - 196 + 118;
        Z.llIlIlIlll[8] = 0xFFFF93EC & 0x7F9B;
        Z.llIlIlIlll[9] = -(0xFFFFF69B & 0x296D) & (0xFFFFB7F9 & 0x6AFF);
        Z.llIlIlIlll[10] = 131 + 100 - 97 + 61 ^ 116 + 5 - 71 + 148;
        Z.llIlIlIlll[11] = -(0xFFFFF91F & 0x46F1) & (0xFFFFDF77 & 0x7FDF);
        Z.llIlIlIlll[12] = 0x2E ^ 0x24;
        Z.llIlIlIlll[13] = 0xCE ^ 0xC6;
        Z.llIlIlIlll[14] = 42 + 115 - 125 + 132 ^ 75 + 55 - 101 + 133;
        Z.llIlIlIlll[15] = 0x8E ^ 0x89;
        Z.llIlIlIlll[16] = 0x47 ^ 0x17 ^ (0x76 ^ 0x2F);
        Z.llIlIlIlll[17] = 0xA5 ^ 0xAE;
        Z.llIlIlIlll[18] = 0x17 ^ 0x1B;
        Z.llIlIlIlll[19] = 0x93 ^ 0x9E;
        Z.llIlIlIlll[20] = 0x44 ^ 0x18 ^ (0x6F ^ 0x27);
        Z.llIlIlIlll[21] = 0xFD ^ 0x95 ^ (0x25 ^ 0x43);
        Z.llIlIlIlll[22] = 0xD6 ^ 0xBF ^ (0x11 ^ 0x77);
        Z.llIlIlIlll[23] = 0x8C ^ 0x9C;
        Z.llIlIlIlll[24] = 0x3D ^ 0x23;
        Z.llIlIlIlll[25] = 0xD2 ^ 0xC3;
        Z.llIlIlIlll[26] = 0xA8 ^ 0x88 ^ (0x55 ^ 0x67);
        Z.llIlIlIlll[27] = 100 + 91 - 120 + 80 ^ 67 + 113 - 72 + 24;
        Z.llIlIlIlll[28] = 46 + 105 - 127 + 133 ^ 64 + 26 - -38 + 53;
        Z.llIlIlIlll[29] = 0x48 ^ 0x5D;
        Z.llIlIlIlll[30] = 97 + 32 - 80 + 103 ^ 1 + 111 - 78 + 108;
        Z.llIlIlIlll[31] = 0x3F ^ 0x28;
        Z.llIlIlIlll[32] = 0xA3 ^ 0xBB;
        Z.llIlIlIlll[33] = 0x6C ^ 0x75;
        Z.llIlIlIlll[34] = 0x5D ^ 0x47;
        Z.llIlIlIlll[35] = 45 + 142 - 44 + 4 ^ 29 + 97 - 73 + 83;
        Z.llIlIlIlll[36] = 0x2F ^ 0x33;
        Z.llIlIlIlll[37] = 82 + 108 - 81 + 79 ^ 22 + 56 - 26 + 109;
        Z.llIlIlIlll[38] = 0x2F ^ 0x30;
        Z.llIlIlIlll[39] = 0xA3 ^ 0x82 ^ 1;
        Z.llIlIlIlll[40] = 0xD ^ 0x71 ^ (0x47 ^ 0x1A);
        Z.llIlIlIlll[41] = 146 + 72 - 193 + 142 ^ 16 + 145 - 30 + 24;
        Z.llIlIlIlll[42] = 0x38 ^ 0x70 ^ (0x63 ^ 9);
        Z.llIlIlIlll[43] = 0x11 ^ 0x32;
        Z.llIlIlIlll[44] = 0x31 ^ 0x38 ^ (0x65 ^ 0x48);
        Z.llIlIlIlll[45] = 0x88 ^ 0xAD;
        Z.llIlIlIlll[46] = 0x63 ^ 0x45;
        Z.llIlIlIlll[47] = 0x4F ^ 0xA ^ (0 ^ 0x62);
        Z.llIlIlIlll[48] = 0xFFFFFF7F & 0x31D1;
        Z.llIlIlIlll[49] = -(0xFFFFE1F6 & 0x7EDB) & (0xFFFFFFFF & 0x77DD);
        Z.llIlIlIlll[50] = 0xFFFFBFCE & 0x6EFD;
        Z.llIlIlIlll[51] = 0xFFFFFDFF & 0x63A8;
        Z.llIlIlIlll[52] = -(0xFFFFFDF1 & 0x6A9F) & (0xFFFFFFFD & 0x6FFE);
        Z.llIlIlIlll[53] = 0xC2 ^ 0xA6;
        Z.llIlIlIlll[54] = 8 + 67 - 73 + 148 ^ 118 + 1 - 94 + 166;
        Z.llIlIlIlll[55] = 0x51 ^ 0x7B;
        Z.llIlIlIlll[56] = 0xFFFFBD56 & 0x4EFF;
        Z.llIlIlIlll[57] = 0xFFFFAF7B & 0x5DE6;
        Z.llIlIlIlll[58] = 4 ^ 3 ^ (0x60 ^ 0x4C);
        Z.llIlIlIlll[59] = 0x6F ^ 0x43;
        Z.llIlIlIlll[60] = 59 + 104 - 28 + 36 ^ 9 + 64 - 67 + 128;
        Z.llIlIlIlll[61] = 0xFFFFEFFD & 0x1C8E;
        Z.llIlIlIlll[62] = 0xFFFFBF61 & 0x4DFE;
        Z.llIlIlIlll[63] = 0xFFFFBDF7 & 0x4E5D;
        Z.llIlIlIlll[64] = -(0xFFFFD3BF & 0x7EC3) & (0xFFFFFFF7 & 0x5FEB);
        Z.llIlIlIlll[65] = -(0xFFFFD55F & 0x7AA1) & (0xFFFFFEBF & 0x5DF7);
        Z.llIlIlIlll[66] = 0xFFFF8DFC & 0x7F9F;
        Z.llIlIlIlll[67] = -(0xFFFF9657 & 0x6BAD) & (0xFFFFBEFF & 0x4F7F);
        Z.llIlIlIlll[68] = -(0xFFFFEABC & 0x5757) & (0xFFFFFF5F & 0x4FFF);
        Z.llIlIlIlll[69] = 0x84 ^ 0xBA ^ (0xB7 ^ 0xA7);
        Z.llIlIlIlll[70] = 0x5E ^ 0x5B ^ (0x73 ^ 0x59);
        Z.llIlIlIlll[71] = 118 + 11 - 4 + 14 ^ 137 + 124 - 131 + 57;
        Z.llIlIlIlll[72] = 0xBB ^ 0x8A;
        Z.llIlIlIlll[73] = 0xB4 ^ 0x87;
        Z.llIlIlIlll[74] = 0x42 ^ 0x76;
        Z.llIlIlIlll[75] = 51 + 142 - 183 + 147 ^ 96 + 149 - 171 + 94;
    }

    private static boolean lIllIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIllIllll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIllIIIll(String llllllllllllllllllIIIlllIlllIIII, String llllllllllllllllllIIIlllIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlllIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlllIlllIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlIlll[13]), "DES");
            Cipher llllllllllllllllllIIIlllIlllIlII = Cipher.getInstance("DES");
            llllllllllllllllllIIIlllIlllIlII.init(llIlIlIlll[3], llllllllllllllllllIIIlllIlllIlIl);
            return new String(llllllllllllllllllIIIlllIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlllIlllIIll) {
            llllllllllllllllllIIIlllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public static void es() {
        block52: {
            BankLocation llllllllllllllllllIIIllllIIIIllI;
            block54: {
                block53: {
                    if (Z.lIllIIllIllIl(bt ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[0]];
                        b.a(bv);
                        if (Z.lIllIIllIlllI(bv.size(), llIlIlIlll[1])) {
                            System.out.println(llIlIlIIIl[llIlIlIlll[1]]);
                            bt = llIlIlIlll[0];
                        }
                    }
                    if (!Z.lIllIIllIllll(bt ? 1 : 0)) break block52;
                    if (Z.lIllIIllIllIl(Inventory.contains((int[])f.ba) ? 1 : 0) && Z.lIllIIllIlllI(Movement.getRunEnergy(), llIlIlIlll[2])) {
                        Inventory.getFirst((int[])f.ba).interact(llIlIlIIIl[llIlIlIlll[3]]);
                        Time.sleepTicks((int)llIlIlIlll[1]);
                        0;
                    }
                    if (Z.lIllIIllIllll(Movement.isRunEnabled() ? 1 : 0) && Z.lIllIIlllIIII(Movement.getRunEnergy())) {
                        Movement.toggleRun();
                    }
                    if (!Z.lIllIIllIllIl(Z.an() ? 1 : 0)) break block53;
                    int[] nArray = new int[llIlIlIlll[1]];
                    nArray[Z.llIlIlIlll[0]] = llIlIlIlll[4];
                    if (!Z.lIllIIlllIIII(Inventory.getCount((int[])nArray))) break block54;
                }
                if (Z.lIllIIllIlllI(e.j(llIlIlIlll[5]), llIlIlIlll[1])) {
                    llllllllllllllllllIIIllllIIIIllI = BankLocation.getNearest();
                    if (Z.lIllIIlllIIIl(llllllllllllllllllIIIllllIIIIllI) && Z.lIllIIllIllll(llllllllllllllllllIIIllllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[6]];
                        a.a(llllllllllllllllllIIIllllIIIIllI);
                        Time.sleepTicks((int)llIlIlIlll[3]);
                        0;
                    }
                    if (Z.lIllIIlllIIIl(llllllllllllllllllIIIllllIIIIllI) && Z.lIllIIllIllIl(llllllllllllllllllIIIllllIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[7]];
                        if (Z.lIllIIllIllll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIlIlll[8]);
                            0;
                        }
                        if (Z.lIllIIllIllIl(Bank.isOpen() ? 1 : 0)) {
                            if (Z.lIllIIlllIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIlIlIlll[7]);
                                0;
                            }
                            if (Z.lIllIIlllIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIlIlIlll[3]);
                                0;
                            }
                            int[] nArray = new int[llIlIlIlll[1]];
                            nArray[Z.llIlIlIlll[0]] = llIlIlIlll[9];
                            if (Z.lIllIIllIllll(e.c(nArray) ? 1 : 0)) {
                                Z.Q();
                                System.out.println(llIlIlIIIl[llIlIlIlll[10]]);
                                bt = llIlIlIlll[1];
                                return;
                            }
                            int[] nArray2 = new int[llIlIlIlll[1]];
                            nArray2[Z.llIlIlIlll[0]] = llIlIlIlll[9];
                            if (Z.lIllIIllIllIl(e.c(nArray2) ? 1 : 0)) {
                                a.a(llIlIlIlll[9], llIlIlIlll[1]);
                                a.b(f.ba, llIlIlIlll[3]);
                                a.a(llIlIlIlll[11], llIlIlIlll[12]);
                                a.b(f.bk, llIlIlIlll[1]);
                            }
                        }
                    }
                }
            }
            if (Z.lIllIIllIllIl(Z.an() ? 1 : 0) && Z.lIllIIllIlllI(e.j(llIlIlIlll[5]), llIlIlIlll[1])) {
                if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[14]];
                    if (Z.lIllIIllIlllI(cG, llIlIlIlll[1])) {
                        e.x();
                        cG += llIlIlIlll[1];
                    }
                    Movement.walkTo((WorldPoint)mD);
                    0;
                    Time.sleepTicks((int)llIlIlIlll[1]);
                    0;
                }
                if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[15]];
                    g.a(llIlIlIIIl[llIlIlIlll[13]], cE);
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[12])) {
                if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                    if (Z.lIllIIllIllIl(Inventory.contains((int[])f.bk) ? 1 : 0) && Z.lIllIIllIllll(Equipment.contains((int[])f.bk) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.bk).interact(llIlIlIIIl[llIlIlIlll[16]]);
                        Time.sleepTicks((int)llIlIlIlll[1]);
                        0;
                    }
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[12]];
                    Movement.walkTo((WorldPoint)mE);
                    0;
                    Time.sleepTicks((int)llIlIlIlll[1]);
                    0;
                }
                if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[17]];
                    llllllllllllllllllIIIllllIIIIllI = TileObjects.getNearest(tileObject -> {
                        int n2;
                        if (Z.lIllIIllIllIl(tileObject.getName().contains(llIlIlIIIl[llIlIlIlll[59]]) ? 1 : 0) && Z.lIllIIlllIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlll[56], llIlIlIlll[57], llIlIlIlll[1])), llIlIlIlll[3])) {
                            String[] stringArray = new String[llIlIlIlll[1]];
                            stringArray[Z.llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[60]];
                            if (Z.lIllIIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                n2 = llIlIlIlll[1];
                                0;
                                if (2 == 2) return n2 != 0;
                                return ((0x66 ^ 0x57) & ~(0xA1 ^ 0x90)) != 0;
                            }
                        }
                        n2 = llIlIlIlll[0];
                        return n2 != 0;
                    });
                    if (Z.lIllIIlllIIIl(llllllllllllllllllIIIllllIIIIllI)) {
                        llllllllllllllllllIIIllllIIIIllI.interact(llIlIlIIIl[llIlIlIlll[18]]);
                        Time.sleepTicks((int)llIlIlIlll[6]);
                        0;
                    }
                    g.a(llIlIlIIIl[llIlIlIlll[19]], cE);
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[20])) {
                if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[21]];
                    Movement.walkTo((WorldPoint)mD);
                    0;
                    Time.sleepTicks((int)llIlIlIlll[1]);
                    0;
                }
                if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[22]];
                    g.a(llIlIlIIIl[llIlIlIlll[23]], cE);
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[24])) {
                if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mF), llIlIlIlll[10])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[25]];
                    Movement.walkTo((WorldPoint)mF);
                    0;
                    Time.sleepTicks((int)llIlIlIlll[1]);
                    0;
                }
                if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mF), llIlIlIlll[10])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[26]];
                    g.a(llIlIlIIIl[llIlIlIlll[27]], cE);
                }
                g.a(cE);
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[28])) {
                if (Z.lIllIIllIllll(Z.an() ? 1 : 0)) {
                    Z.dA();
                }
                if (Z.lIllIIllIllIl(Z.an() ? 1 : 0)) {
                    if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[20]];
                        Movement.walkTo((WorldPoint)mG);
                        0;
                        Time.sleepTicks((int)llIlIlIlll[1]);
                        0;
                    }
                    if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[29]];
                        g.a(llIlIlIIIl[llIlIlIlll[30]], cE);
                    }
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[2])) {
                String[] stringArray = new String[llIlIlIlll[1]];
                stringArray[Z.llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[31]];
                if (Z.lIllIIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0) && Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                    if (Z.lIllIIllIllll(Z.an() ? 1 : 0)) {
                        Z.dA();
                    }
                    if (Z.lIllIIllIllIl(Z.an() ? 1 : 0) && Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[32]];
                        Movement.walkTo((WorldPoint)mG);
                        0;
                        Time.sleepTicks((int)llIlIlIlll[1]);
                        0;
                    }
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[2])) {
                String[] stringArray = new String[llIlIlIlll[1]];
                stringArray[Z.llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[33]];
                if (Z.lIllIIllIllll(Inventory.contains((String[])stringArray) ? 1 : 0) && Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mG), llIlIlIlll[10])) {
                    di = llIlIlIlll[0];
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[34]];
                    g.a(llIlIlIIIl[llIlIlIlll[35]], cE);
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[2])) {
                String[] stringArray = new String[llIlIlIlll[1]];
                stringArray[Z.llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[36]];
                if (Z.lIllIIllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                        if (Z.lIllIIllIllIl(Inventory.contains((int[])f.bk) ? 1 : 0) && Z.lIllIIllIllll(Equipment.contains((int[])f.bk) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.bk).interact(llIlIlIIIl[llIlIlIlll[37]]);
                            Time.sleepTicks((int)llIlIlIlll[1]);
                            0;
                        }
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[24]];
                        Movement.walkTo((WorldPoint)mE);
                        0;
                        Time.sleepTicks((int)llIlIlIlll[1]);
                        0;
                    }
                    if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mE), llIlIlIlll[3])) {
                        AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[38]];
                        llllllllllllllllllIIIllllIIIIllI = TileObjects.getNearest(tileObject -> {
                            int n2;
                            if (Z.lIllIIllIllIl(tileObject.getName().contains(llIlIlIIIl[llIlIlIlll[55]]) ? 1 : 0) && Z.lIllIIlllIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llIlIlIlll[56], llIlIlIlll[57], llIlIlIlll[1])), llIlIlIlll[3])) {
                                String[] stringArray = new String[llIlIlIlll[1]];
                                stringArray[Z.llIlIlIlll[0]] = llIlIlIIIl[llIlIlIlll[58]];
                                if (Z.lIllIIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                                    n2 = llIlIlIlll[1];
                                    0;
                                    if (-3 < 0) return n2 != 0;
                                    return ((0x58 ^ 0x2C ^ (0x52 ^ 0x7A)) & (49 + 21 - 26 + 165 ^ 111 + 116 - 148 + 62 ^ -1)) != 0;
                                }
                            }
                            n2 = llIlIlIlll[0];
                            return n2 != 0;
                        });
                        if (Z.lIllIIlllIIIl(llllllllllllllllllIIIllllIIIIllI)) {
                            llllllllllllllllllIIIllllIIIIllI.interact(llIlIlIIIl[llIlIlIlll[39]]);
                            Time.sleepTicks((int)llIlIlIlll[6]);
                            0;
                        }
                        g.a(llIlIlIIIl[llIlIlIlll[40]], cE);
                    }
                    g.a(cE);
                }
            }
            if (Z.lIllIIlllIlII(e.j(llIlIlIlll[5]), llIlIlIlll[41])) {
                if (Z.lIllIIlllIIlI(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13]) && Z.lIllIIllIllll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[42]];
                    Movement.walkTo((WorldPoint)mD);
                    0;
                    Time.sleepTicks((int)llIlIlIlll[1]);
                    0;
                }
                if (Z.lIllIIlllIIll(Players.getLocal().getWorldLocation().distanceTo(mD), llIlIlIlll[13])) {
                    AccBuilderSotf.c = llIlIlIIIl[llIlIlIlll[43]];
                    if (Z.lIllIIllIlllI(di, llIlIlIlll[1])) {
                        aN.sT += llIlIlIlll[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIlIlIlll[1];
                        aN.sT = llIlIlIlll[0];
                        dj = llIlIlIlll[0];
                    }
                    g.a(llIlIlIIIl[llIlIlIlll[44]], cE);
                    Time.sleepTicks((int)llIlIlIlll[10]);
                    0;
                }
            }
            g.a(cE);
            System.out.println("Setting: " + e.j(llIlIlIlll[5]));
        }
    }
}

