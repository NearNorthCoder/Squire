/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class T
implements S {
    private static /* synthetic */ int[] llllIlIlIl;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ int iS;
    static /* synthetic */ WorldArea iX;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ int iT;
    public static /* synthetic */ int iU;
    private static /* synthetic */ String[] llllIlIIll;
    private static /* synthetic */ WorldPoint iY;
    static /* synthetic */ WorldArea iW;
    static /* synthetic */ WorldArea iV;

    @Override
    public boolean V() {
        boolean bl;
        if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[2])) {
            bl = llllIlIlIl[1];
            0;
            if ((0x36 ^ 0x19 ^ (0x7A ^ 0x50)) <= 0) {
                return ((0xA0 ^ 0xBE ^ (0x13 ^ 0x5A)) & (34 + 123 - 122 + 200 ^ 61 + 33 - -10 + 84 ^ -1)) != 0;
            }
        } else {
            bl = llllIlIlIl[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void dt() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[46], llllIlIlIl[47], llllIlIlIl[12], llllIlIlIl[20], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[46], llllIlIlIl[48], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[0]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[46], llllIlIlIl[50], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[1]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[51], llllIlIlIl[52], llllIlIlIl[53], llllIlIlIl[54], llllIlIlIl[3]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[55], llllIlIlIl[56], llllIlIlIl[24], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[57], llllIlIlIl[58], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[0]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[59], llllIlIlIl[60], llllIlIlIl[12], llllIlIlIl[20], llllIlIlIl[0]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[46], llllIlIlIl[47], llllIlIlIl[61], llllIlIlIl[20], llllIlIlIl[0]);
        if (T.llIIlllllllII(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[12]];
            e.a(iY);
            Time.sleepTicks((int)llllIlIlIl[1]);
            0;
        }
        if ((!T.llIIlllllllII(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !T.llIIlllllllII(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || T.llIIllllllIlI(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && T.llIlIIIIIIIIl(Players.getLocal().getAnimation(), llllIlIlIl[62]) && T.llIIlllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            void lllllllllllllllllIlIlIlIllllIlII;
            void lllllllllllllllllIlIlIlIllllIlIl;
            void lllllllllllllllllIlIlIlIllllIllI;
            void lllllllllllllllllIlIlIlIllllIlll;
            void lllllllllllllllllIlIlIlIlllllIII;
            void lllllllllllllllllIlIlIlIlllllIIl;
            void lllllllllllllllllIlIlIlIllllIIll;
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[49]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[63]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[64]]);
                Time.sleepTicks((int)llllIlIlIl[3]);
                0;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlllllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[53]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[65]]);
                Time.sleepTicks((int)llllIlIlIl[3]);
                0;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlllllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[66]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[67]]);
                Time.sleepTicks((int)llllIlIlIl[3]);
                0;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[40]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[61]]);
                Time.sleepTicks((int)llllIlIlIl[2]);
                0;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[69]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[41]]);
                Time.sleepTicks((int)llllIlIlIl[17]);
                0;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[71]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[73]]);
                Time.sleepTicks((int)llllIlIlIl[10]);
                0;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[74]];
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[75]]);
                Time.sleepTicks((int)llllIlIlIl[17]);
                0;
            }
        }
    }

    private static boolean llIIlllllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIllllllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public String U() {
        return llllIlIIll[llllIlIlIl[203]];
    }

    @Override
    public boolean S() {
        return llllIlIlIl[0];
    }

    private static void llIIllllllIIl() {
        llllIlIlIl = new int[239];
        T.llllIlIlIl[0] = (0xFB ^ 0xBE) & ~(0x77 ^ 0x32);
        T.llllIlIlIl[1] = 1;
        T.llllIlIlIl[2] = 0x14 ^ 0x11;
        T.llllIlIlIl[3] = 2;
        T.llllIlIlIl[4] = 0xFFFFBFF7 & 0x4D8F;
        T.llllIlIlIl[5] = 0xFFFFBD85 & 0x4FFF;
        T.llllIlIlIl[6] = 0x6B ^ 0x55;
        T.llllIlIlIl[7] = 238 + 62 - 259 + 200 ^ 110 + 8 - 100 + 176;
        T.llllIlIlIl[8] = -(0xFFFFFFDE & 0x6265) & (0xFFFFFFFF & 0x6FFB);
        T.llllIlIlIl[9] = -(0xFFFFF75C & 0xAE7) & (0xFFFFBFDF & 0x4FFB);
        T.llllIlIlIl[10] = 3;
        T.llllIlIlIl[11] = -(0xFFFFB5C5 & 0x6A7B) & (0xFFFFFFF8 & 0x33CF);
        T.llllIlIlIl[12] = 0x3D ^ 0x37;
        T.llllIlIlIl[13] = 0xFFFF9F77 & 0x7FCF;
        T.llllIlIlIl[14] = 0xFFFFBF68 & 0x5FDF;
        T.llllIlIlIl[15] = 0xFFFFFF79 & 0x1FCF;
        T.llllIlIlIl[16] = -(0xFFFFAE77 & 0x71B9) & (0xFFFFAF7D & 0x7FBF);
        T.llllIlIlIl[17] = 0x24 ^ 0x4C ^ (0xC5 ^ 0xA9);
        T.llllIlIlIl[18] = 0xFFFFEEDF & 0x3FEC;
        T.llllIlIlIl[19] = -(0xFFFFF1E9 & 0x4E9F) & (0xFFFFFBFD & 0x75DB);
        T.llllIlIlIl[20] = 0xA8 ^ 0xAE;
        T.llllIlIlIl[21] = -(0xFFFFEBFE & 0x5423) & (0xFFFFDF7F & 0x7FEB);
        T.llllIlIlIl[22] = 0x1E ^ 0x19;
        T.llllIlIlIl[23] = 0xFFFFF3C1 & 0xDBF;
        T.llllIlIlIl[24] = 0x3A ^ 0x32;
        T.llllIlIlIl[25] = -(0xFFFFFFEF & 0x359) & (0xFFFFDFEF & 0x6FFB);
        T.llllIlIlIl[26] = 0x56 ^ 0x5F;
        T.llllIlIlIl[27] = -(0xFFFFCFEB & 0x3C36) & (0xFFFFFEFF & 0x5FBB);
        T.llllIlIlIl[28] = -(0xFFFFD9EB & 0x6696) & (0xFFFFEEFD & 0x7FD7);
        T.llllIlIlIl[29] = -(0xFFFFE68B & 0x597C) & (0xFFFFEF7F & 0x7ED7);
        T.llllIlIlIl[30] = -(0xFFFFF0B1 & 0x1FFF) & (0xFFFFFEFF & 0x3FFE);
        T.llllIlIlIl[31] = 0xFFFFBE6D & 0x6FDE;
        T.llllIlIlIl[32] = 0xFFFFAF7A & 0x7ED7;
        T.llllIlIlIl[33] = -(0x59 ^ 0x68) & (0xFFFFBFFA & 0x6E7F);
        T.llllIlIlIl[34] = 0xFFFFFEC1 & 0x2FFE;
        T.llllIlIlIl[35] = 189 + 121 - 131 + 67 ^ 5 + 169 - 120 + 120;
        T.llllIlIlIl[36] = -(6 + 77 - -119 + 23) & (0xFFFFEFEF & 0x5FFB);
        T.llllIlIlIl[37] = 0x87 ^ 0xA5 ^ (0x64 ^ 0x6E);
        T.llllIlIlIl[38] = 0x7E ^ 0x71;
        T.llllIlIlIl[39] = 0x44 ^ 0x76;
        T.llllIlIlIl[40] = 0x1E ^ 0xA;
        T.llllIlIlIl[41] = 0xAB ^ 0x81 ^ (0x96 ^ 0xA5);
        T.llllIlIlIl[42] = 0x56 ^ 0x12 ^ (0xCD ^ 0x97);
        T.llllIlIlIl[43] = 0xFFFF872E & 0x79FF;
        T.llllIlIlIl[44] = 81 + 102 - 153 + 161 ^ 24 + 115 - 13 + 5;
        T.llllIlIlIl[45] = 0xFFFFAB7F & 0x55B3;
        T.llllIlIlIl[46] = -(0xFFFFFEFF & 0x7559) & (0xFFFFFFFD & 0x7DFF);
        T.llllIlIlIl[47] = -(0xFFFFF1F9 & 0x1E97) & (0xFFFFBDFF & 0x5FFB);
        T.llllIlIlIl[48] = 0xFFFFBD61 & 0x4FFE;
        T.llllIlIlIl[49] = 5 ^ 0xE;
        T.llllIlIlIl[50] = -(0xFFFFB6E7 & 0x59BB) & (0xFFFFFFFF & 0x1DFF);
        T.llllIlIlIl[51] = 0xFFFFEDF5 & 0x1BAB;
        T.llllIlIlIl[52] = -(0xFFFFDE9B & 0x71ED) & (0xFFFFDDDF & Short.MAX_VALUE);
        T.llllIlIlIl[53] = 0x5A ^ 0x69 ^ (0x23 ^ 0x1E);
        T.llllIlIlIl[54] = 2 ^ 0x14 ^ (0xC7 ^ 0xC3);
        T.llllIlIlIl[55] = -(0xFFFFEFCD & 0x767F) & (0xFFFFEFFF & Short.MAX_VALUE);
        T.llllIlIlIl[56] = -(0xFFFFF73F & 0x5AC4) & (0xFFFFFFDB & 0x5F7F);
        T.llllIlIlIl[57] = 0xFFFFABFE & 0x5DB3;
        T.llllIlIlIl[58] = 0xFFFFFFDD & 0xD7B;
        T.llllIlIlIl[59] = -(0xFFFFA5EF & 0x7E17) & (0xFFFFAFFF & 0x7DB7);
        T.llllIlIlIl[60] = 0xFFFF9D7B & 0x6FE7;
        T.llllIlIlIl[61] = 0xF1 ^ 0xBA ^ (0x66 ^ 0x3B);
        T.llllIlIlIl[62] = -1;
        T.llllIlIlIl[63] = 0x1D ^ 0xA ^ (0x7D ^ 0x66);
        T.llllIlIlIl[64] = 0x67 ^ 0x60 ^ (0x7A ^ 0x70);
        T.llllIlIlIl[65] = 0x6F ^ 0x7F;
        T.llllIlIlIl[66] = 0x79 ^ 0x68;
        T.llllIlIlIl[67] = 0x7C ^ 0x28 ^ (0x17 ^ 0x50);
        T.llllIlIlIl[68] = 0x4A ^ 0x5F;
        T.llllIlIlIl[69] = 0xA4 ^ 0xB3;
        T.llllIlIlIl[70] = 0x49 ^ 0x51;
        T.llllIlIlIl[71] = 0xFF ^ 0xB5 ^ (0x5B ^ 0xB);
        T.llllIlIlIl[72] = 0x43 ^ 0x5E ^ (0xBC ^ 0xBA);
        T.llllIlIlIl[73] = 0x72 ^ 0x2F ^ (0xE7 ^ 0xA6);
        T.llllIlIlIl[74] = 78 + 127 - 129 + 80 ^ 16 + 40 - -69 + 4;
        T.llllIlIlIl[75] = 0x5E ^ 0x41;
        T.llllIlIlIl[76] = 0xFFFFFEFF & 0xD5F;
        T.llllIlIlIl[77] = 0xFFFFAD17 & 0x5FFE;
        T.llllIlIlIl[78] = (0xEE ^ 0xA2) + (0x42 ^ 0x7C) - (0x2C ^ 0x43) + (0x23 ^ 0x4D);
        T.llllIlIlIl[79] = 0xD0 ^ 0x83 ^ (0x65 ^ 0x68);
        T.llllIlIlIl[80] = 0xFFFFFDD3 & 0xEBF;
        T.llllIlIlIl[81] = -(0xFFFFE6FF & 0x790F) & (0xFFFFEF7F & 0x7DDF);
        T.llllIlIlIl[82] = 0xFFFFBCFD & 0x4F8E;
        T.llllIlIlIl[83] = 0xFFFFAEFE & 0x5D7F;
        T.llllIlIlIl[84] = 0xFFFF9F55 & 0x6DFE;
        T.llllIlIlIl[85] = 0xFFFFEDFE & 0x1E77;
        T.llllIlIlIl[86] = 0xFFFFAFF7 & 0x5D5D;
        T.llllIlIlIl[87] = -(0xFFFFF4FF & 0x7B95) & (0xFFFFFFDF & 0x7DFD);
        T.llllIlIlIl[88] = 0xFFFFAC7B & 0x5FEF;
        T.llllIlIlIl[89] = -(0xFFFFF377 & 0x7ECA) & (0xFFFFFFFF & 0x7F77);
        T.llllIlIlIl[90] = -(0xFFFFBAAF & 0x655F) & (0xFFFFBE9F & 0x6DFF);
        T.llllIlIlIl[91] = 0xFFFF9D60 & 0x6FDF;
        T.llllIlIlIl[92] = 0xFFFFEFAE & 0x1CF3;
        T.llllIlIlIl[93] = 0xFFFFBF5F & 0x4DEA;
        T.llllIlIlIl[94] = -(0xFFFFFABE & 0x774F) & (0xFFFFFF5F & Short.MAX_VALUE);
        T.llllIlIlIl[95] = 0x10 ^ 0x47 ^ (0x7E ^ 9);
        T.llllIlIlIl[96] = -(0xFFFFF43E & 0x1BE9) & (0xFFFFFEFF & 0x1DBF);
        T.llllIlIlIl[97] = 0xA1 ^ 0x95 ^ (0x9A ^ 0x8F);
        T.llllIlIlIl[98] = 0xF ^ 0x2D;
        T.llllIlIlIl[99] = 0x25 ^ 0x30 ^ (0x77 ^ 0x41);
        T.llllIlIlIl[100] = 0x19 ^ 0x70 ^ (0x3D ^ 0x70);
        T.llllIlIlIl[101] = 0xBC ^ 0x95 ^ (0x59 ^ 0x55);
        T.llllIlIlIl[102] = 1 + 168 - 25 + 47 ^ 141 + 15 - 132 + 129;
        T.llllIlIlIl[103] = 0xF7 ^ 0x94 ^ (0x75 ^ 0x31);
        T.llllIlIlIl[104] = 0xFFFFBDB5 & 0x637E;
        T.llllIlIlIl[105] = 0x5C ^ 0x75;
        T.llllIlIlIl[106] = 0x64 ^ 0x59 ^ (0x18 ^ 0xF);
        T.llllIlIlIl[107] = 0xA7 ^ 0xA8 ^ (0x2A ^ 0xE);
        T.llllIlIlIl[108] = 0x40 ^ 0x51 ^ (0x8B ^ 0xB6);
        T.llllIlIlIl[109] = 0xBC ^ 0x91;
        T.llllIlIlIl[110] = 0x24 ^ 0x57 ^ (0x69 ^ 0x34);
        T.llllIlIlIl[111] = 0x30 ^ 0x64 ^ (0x43 ^ 0x38);
        T.llllIlIlIl[112] = 0x91 ^ 0xC4 ^ (0xEF ^ 0x8A);
        T.llllIlIlIl[113] = 0xB2 ^ 0xBD ^ (0x8D ^ 0xB3);
        T.llllIlIlIl[114] = 0x8F ^ 0xBB;
        T.llllIlIlIl[115] = -2 & (0xFFFFFBFF & 0x3DF3);
        T.llllIlIlIl[116] = 7 ^ 0x72 ^ (0x45 ^ 5);
        T.llllIlIlIl[117] = 36 + 70 - 98 + 131 ^ 153 + 57 - 132 + 111;
        T.llllIlIlIl[118] = -(0xFFFF8EBB & 0x7345) & (0xFFFFBFFF & 0x7BF3);
        T.llllIlIlIl[119] = 0xBA ^ 0xA5 ^ (0x41 ^ 0x69);
        T.llllIlIlIl[120] = 0x37 ^ 0xF;
        T.llllIlIlIl[121] = -(0xFFFFF2F7 & 0xF0A) & (0xFFFFFBF7 & 0x3FFD);
        T.llllIlIlIl[122] = 0x78 ^ 0xB ^ (0xCA ^ 0x80);
        T.llllIlIlIl[123] = 0x7B ^ 0x50 ^ (0x92 ^ 0x83);
        T.llllIlIlIl[124] = 0x52 ^ 0x69;
        T.llllIlIlIl[125] = -(0xFFFFFF57 & 0x2B9) & (0xFFFF8FFF & 0x7F9F);
        T.llllIlIlIl[126] = -(0xFFFFBBF7 & 0x667D) & (0xFFFFFFFE & 0x2FFF);
        T.llllIlIlIl[127] = 0xFFFFEDBF & 0x1FEE;
        T.llllIlIlIl[128] = 0xFFFFDDF3 & 0x2FAE;
        T.llllIlIlIl[129] = -(0xFFFFFAD1 & 0x253F) & (0xFFFFEDFF & 0x3FB7);
        T.llllIlIlIl[130] = 0xFFFFCFFB & 0x3D9F;
        T.llllIlIlIl[131] = -(0xFFFFC413 & 0x7BFD) & (0xFFFFDFBF & 0x6DF9);
        T.llllIlIlIl[132] = -(0xFFFFB2EE & 0x6F53) & (0xFFFFBFF5 & 0x6FDB);
        T.llllIlIlIl[133] = 0xFFFFAFFB & 0x5DA5;
        T.llllIlIlIl[134] = -(0xFFFFC7F1 & 0x782F) & (0xFFFFEDF3 & 0x5FBF);
        T.llllIlIlIl[135] = -(0xFFFFF7EF & 0x6851) & (0xFFFFEFFD & 0x7DDF);
        T.llllIlIlIl[136] = 0xFFFFCDDF & 0x3FAB;
        T.llllIlIlIl[137] = 0xFFFFFFF6 & 0xDBB;
        T.llllIlIlIl[138] = -(0xFFFFF8EB & 0x375D) & (0xFFFFBDF9 & 0x7FDF);
        T.llllIlIlIl[139] = -(0xFFFFC7F5 & 0x782B) & (0xFFFFEFFE & 0x5DBF);
        T.llllIlIlIl[140] = 0x72 ^ 0x4F;
        T.llllIlIlIl[141] = 0x18 ^ 0x32 ^ (0xA3 ^ 0xB6);
        T.llllIlIlIl[142] = 0xC5 ^ 0x85;
        T.llllIlIlIl[143] = 1 ^ 0x40;
        T.llllIlIlIl[144] = 22 + 38 - -14 + 57 ^ 31 + 125 - 43 + 80;
        T.llllIlIlIl[145] = 0x49 ^ 0xA;
        T.llllIlIlIl[146] = 0xE0 ^ 0xA4;
        T.llllIlIlIl[147] = 141 + 201 - 230 + 124 ^ 28 + 133 - 54 + 62;
        T.llllIlIlIl[148] = 0x1C ^ 0x5A;
        T.llllIlIlIl[149] = 219 + 189 - 188 + 30 ^ 6 + 65 - -47 + 71;
        T.llllIlIlIl[150] = 0x3B ^ 0x74 ^ (0x2C ^ 0x2B);
        T.llllIlIlIl[151] = 0x5B ^ 0x4E ^ (0x4D ^ 0x11);
        T.llllIlIlIl[152] = 0x8D ^ 0xC0 ^ (0x51 ^ 0x56);
        T.llllIlIlIl[153] = 108 + 60 - 14 + 40 ^ 37 + 61 - 35 + 74;
        T.llllIlIlIl[154] = 0x5D ^ 0x11;
        T.llllIlIlIl[155] = 0x6A ^ 0x27;
        T.llllIlIlIl[156] = 115 + 223 - 271 + 173 ^ 132 + 142 - 216 + 132;
        T.llllIlIlIl[157] = 0xE4 ^ 0xAB;
        T.llllIlIlIl[158] = 0xED ^ 0xB4 ^ (0xB2 ^ 0xBB);
        T.llllIlIlIl[159] = 0x1F ^ 0x4E;
        T.llllIlIlIl[160] = 0x46 ^ 0x14;
        T.llllIlIlIl[161] = 0x6C ^ 0x3F;
        T.llllIlIlIl[162] = -1 & (0xFFFF9F7F & 0x6AFF);
        T.llllIlIlIl[163] = 0xFFFFFFFE & 0xD7F;
        T.llllIlIlIl[164] = -(0xFFFFB757 & 0x6CA9) & (0xFFFFAEFF & 0x7F9F);
        T.llllIlIlIl[165] = -(0xFFFFEF5D & 0x54B3) & (0xFFFFFFFF & 0x4E9D);
        T.llllIlIlIl[166] = -(0xFFFFE16D & 0x7EFF) & (0xFFFFFFFF & 0x6AFF);
        T.llllIlIlIl[167] = 0xFFFF9E9D & 0x6BEB;
        T.llllIlIlIl[168] = 0xFFFFDFAF & 0x2AD0;
        T.llllIlIlIl[169] = -(0xFFFFD8EF & 0x7757) & (0xFFFFFFEF & 0x5DD7);
        T.llllIlIlIl[170] = 0xFFFF8ABB & 0x7FED;
        T.llllIlIlIl[171] = 0xFFFFEDE0 & 0x1FBF;
        T.llllIlIlIl[172] = 0xD7 ^ 0x83;
        T.llllIlIlIl[173] = 0x21 ^ 0x48 ^ (0xB5 ^ 0x89);
        T.llllIlIlIl[174] = 0xCF ^ 0x99;
        T.llllIlIlIl[175] = 0xFD ^ 0xAA;
        T.llllIlIlIl[176] = 0x68 ^ 0x73 ^ (0xF8 ^ 0xBA);
        T.llllIlIlIl[177] = 0x50 ^ 0xA;
        T.llllIlIlIl[178] = 0x71 ^ 0x2A;
        T.llllIlIlIl[179] = 0x11 ^ 0x4D;
        T.llllIlIlIl[180] = 0x68 ^ 0x35;
        T.llllIlIlIl[181] = 0xDB ^ 0x84;
        T.llllIlIlIl[182] = 0xB4 ^ 0xA7 ^ (0x44 ^ 0x37);
        T.llllIlIlIl[183] = 0xC6 ^ 0xA7;
        T.llllIlIlIl[184] = 0xC ^ 0x6E;
        T.llllIlIlIl[185] = 1 ^ 0x62;
        T.llllIlIlIl[186] = 0xED ^ 0x9A ^ (0x40 ^ 0x53);
        T.llllIlIlIl[187] = 0x6E ^ 4 ^ (0xBB ^ 0xB4);
        T.llllIlIlIl[188] = 0x5B ^ 0x35 ^ (0x89 ^ 0x81);
        T.llllIlIlIl[189] = 0xFFFF8EFF & 0x7D77;
        T.llllIlIlIl[190] = -(0xFFFFF2A7 & 0x6FFA) & (0xFFFFEFFF & 0x7FF7);
        T.llllIlIlIl[191] = -(0xFFFFFBFF & 0x7682) & (0xFFFFFFFF & 0x7EEF);
        T.llllIlIlIl[192] = -(0xFFFFFE77 & 0x5389) & (0xFFFFDFFB & 0x7F3F);
        T.llllIlIlIl[193] = 0xFFFFBEDB & 0x6F6D;
        T.llllIlIlIl[194] = 0x65 ^ 2;
        T.llllIlIlIl[195] = -(97 + 99 - 129 + 63) & (0xFFFFFDFF & 0x17FD);
        T.llllIlIlIl[196] = -(0xFFFF9ADE & 0x6733) & (0xFFFFFBFB & 0x67BD);
        T.llllIlIlIl[197] = -(0xFFFFFD75 & 0x7AFB) & (0xFFFFFBF6 & 0x7FFD);
        T.llllIlIlIl[198] = -(0xFFFFCCCB & 0x7F75) & (0xFFFFFFF7 & 0x4FFE);
        T.llllIlIlIl[199] = 0xFFFFFFBE & 0x7DF;
        T.llllIlIlIl[200] = -(0xFFFF97DA & 0x6D2F) & (0xFFFFEFFF & 0x37FF);
        T.llllIlIlIl[201] = -(0xFFFFFD5E & 0x43B7) & (0xFFFFEFDF & Short.MAX_VALUE);
        T.llllIlIlIl[202] = -(0xFFFFFE2F & 0xBF1) & (0xFFFFFF7F & 0x6FFE);
        T.llllIlIlIl[203] = 0x60 ^ 0x5B ^ (0x7F ^ 0x2C);
        T.llllIlIlIl[204] = 0x70 ^ 0x19;
        T.llllIlIlIl[205] = 0x7C ^ 0x16;
        T.llllIlIlIl[206] = 0xC ^ 0x67;
        T.llllIlIlIl[207] = 0xF5 ^ 0x95 ^ (5 ^ 9);
        T.llllIlIlIl[208] = 0xB6 ^ 0xA4 ^ 62 + 30 - 76 + 111;
        T.llllIlIlIl[209] = -(0xFFFFC5E1 & 0x3F7F) & (0xFFFFDFEF & 0x2FFF);
        T.llllIlIlIl[210] = 0xFFFF8FEF & 0x7D99;
        T.llllIlIlIl[211] = 0x14 ^ 0x7A;
        T.llllIlIlIl[212] = -(0xFFFFF53D & 0x1AF3) & (0xFFFFFFFD & 0x1DBF);
        T.llllIlIlIl[213] = 0x14 ^ 0x7B;
        T.llllIlIlIl[214] = -(0xFFFFD5AB & 0x7A5D) & (0xFFFFFADF & 0x5FBF);
        T.llllIlIlIl[215] = -(0xFFFFE7DE & 0x382B) & (0xFFFFADBD & 0x7FDF);
        T.llllIlIlIl[216] = 0xD0 ^ 0xB4 ^ (0xA7 ^ 0xB3);
        T.llllIlIlIl[217] = 0xFFFFAFF6 & 0x5A9F;
        T.llllIlIlIl[218] = 0x1D ^ 0x2E ^ (0xF9 ^ 0xBB);
        T.llllIlIlIl[219] = -(0xFFFFF61B & 0x4DFD) & (0xFFFFDFF9 & 0x6EBF);
        T.llllIlIlIl[220] = -(0xFFFFBEEF & 0x7151) & (0xFFFFBDED & 0x7FF7);
        T.llllIlIlIl[221] = 3 ^ 0x46 ^ (0x8E ^ 0xB9);
        T.llllIlIlIl[222] = 0xFFFFEFB7 & 0x1DFE;
        T.llllIlIlIl[223] = 0xFFFFCFFF & 0x3D9C;
        T.llllIlIlIl[224] = 144 + 134 - 158 + 126 ^ 28 + 20 - -52 + 33;
        T.llllIlIlIl[225] = 0xFFFF8FEF & 0x7DBF;
        T.llllIlIlIl[226] = 0x52 ^ 8 ^ (5 ^ 0x2B);
        T.llllIlIlIl[227] = 0xD0 ^ 0x92 ^ (0x2A ^ 0x1D);
        T.llllIlIlIl[228] = -(0xFFFFBE7A & 0x61EF) & (0xFFFFFDFF & 0x2FFF);
        T.llllIlIlIl[229] = 0xFFFFDDEF & 0x2FB4;
        T.llllIlIlIl[230] = 0x2A ^ 0x1E ^ (0xCA ^ 0x88);
        T.llllIlIlIl[231] = 0xFFFFCFEB & 0x3DBF;
        T.llllIlIlIl[232] = 0x15 ^ 0x62;
        T.llllIlIlIl[233] = 0 + 172 - 167 + 188 ^ 131 + 88 - 65 + 31;
        T.llllIlIlIl[234] = 0xFFFFCFB9 & 0x3DF7;
        T.llllIlIlIl[235] = 0xFFFFEDF6 & 0x1BAD;
        T.llllIlIlIl[236] = 0xFFFFFFBA & 0x9EF;
        T.llllIlIlIl[237] = -(0xFFFFE7F5 & 0x589B) & (0xFFFFFFFD & 0x4DFF);
        T.llllIlIlIl[238] = (0x2D ^ 0x23) & ~(0x3A ^ 0x34) ^ (0x3A ^ 0x43);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean dx() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[80], llllIlIlIl[81], llllIlIlIl[69], llllIlIlIl[64], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[82], llllIlIlIl[81], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[83], llllIlIlIl[84], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[10]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[189], llllIlIlIl[190], llllIlIlIl[24], llllIlIlIl[2], llllIlIlIl[1]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[85], llllIlIlIl[87], llllIlIlIl[12], llllIlIlIl[24], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[191], llllIlIlIl[192], llllIlIlIl[73], llllIlIlIl[38], llllIlIlIl[10]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[90], llllIlIlIl[91], llllIlIlIl[66], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[92], llllIlIlIl[93], llllIlIlIl[22], llllIlIlIl[26], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[92], llllIlIlIl[94], llllIlIlIl[12], llllIlIlIl[22], llllIlIlIl[10]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[127], llllIlIlIl[128], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[129], llllIlIlIl[127], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[3]);
        WorldArea worldArea12 = new WorldArea(llllIlIlIl[130], llllIlIlIl[131], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[3]);
        WorldArea worldArea13 = new WorldArea(llllIlIlIl[132], llllIlIlIl[133], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea14 = new WorldArea(llllIlIlIl[134], llllIlIlIl[9], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea15 = new WorldArea(llllIlIlIl[135], llllIlIlIl[136], llllIlIlIl[68], llllIlIlIl[53], llllIlIlIl[10]);
        WorldArea worldArea16 = new WorldArea(llllIlIlIl[137], llllIlIlIl[138], llllIlIlIl[63], llllIlIlIl[64], llllIlIlIl[3]);
        WorldArea worldArea17 = new WorldArea(llllIlIlIl[164], llllIlIlIl[133], llllIlIlIl[64], llllIlIlIl[12], llllIlIlIl[10]);
        WorldArea worldArea18 = new WorldArea(llllIlIlIl[165], llllIlIlIl[139], llllIlIlIl[38], llllIlIlIl[53], llllIlIlIl[3]);
        WorldArea worldArea19 = new WorldArea(llllIlIlIl[166], llllIlIlIl[134], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea20 = new WorldArea(llllIlIlIl[167], llllIlIlIl[136], llllIlIlIl[70], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea21 = new WorldArea(llllIlIlIl[168], llllIlIlIl[169], llllIlIlIl[54], llllIlIlIl[63], llllIlIlIl[3]);
        WorldArea[] worldAreaArray = new WorldArea[llllIlIlIl[68]];
        worldAreaArray[T.llllIlIlIl[0]] = worldArea;
        worldAreaArray[T.llllIlIlIl[1]] = worldArea2;
        worldAreaArray[T.llllIlIlIl[3]] = worldArea3;
        worldAreaArray[T.llllIlIlIl[10]] = worldArea4;
        worldAreaArray[T.llllIlIlIl[17]] = worldArea5;
        worldAreaArray[T.llllIlIlIl[2]] = worldArea6;
        worldAreaArray[T.llllIlIlIl[20]] = worldArea7;
        worldAreaArray[T.llllIlIlIl[22]] = worldArea8;
        worldAreaArray[T.llllIlIlIl[24]] = worldArea9;
        worldAreaArray[T.llllIlIlIl[26]] = worldArea10;
        worldAreaArray[T.llllIlIlIl[12]] = worldArea11;
        worldAreaArray[T.llllIlIlIl[49]] = worldArea12;
        worldAreaArray[T.llllIlIlIl[63]] = worldArea13;
        worldAreaArray[T.llllIlIlIl[64]] = worldArea14;
        worldAreaArray[T.llllIlIlIl[53]] = worldArea15;
        worldAreaArray[T.llllIlIlIl[38]] = worldArea16;
        worldAreaArray[T.llllIlIlIl[65]] = worldArea17;
        worldAreaArray[T.llllIlIlIl[66]] = worldArea18;
        worldAreaArray[T.llllIlIlIl[54]] = worldArea19;
        worldAreaArray[T.llllIlIlIl[67]] = worldArea20;
        worldAreaArray[T.llllIlIlIl[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llllIlIlIl[1]];
        nArray[T.llllIlIlIl[0]] = llllIlIlIl[193];
        if (T.llIIlllllllIl(TileItems.getNearest((int[])nArray))) {
            void lllllllllllllllllIlIlIlIIlllIIlI;
            System.out.println(llllIlIIll[llllIlIlIl[194]]);
            int lllllllllllllllllIlIlIlIIlllIIIl = llllIlIlIl[0];
            while (T.llIIllllllIll(lllllllllllllllllIlIlIlIIlllIIIl, ((void)lllllllllllllllllIlIlIlIIlllIIlI).length)) {
                int[] nArray2 = new int[llllIlIlIl[1]];
                nArray2[T.llllIlIlIl[0]] = llllIlIlIl[193];
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIIlllIIlI[lllllllllllllllllIlIlIlIIlllIIIl].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && T.llIIllllllIlI(lllllllllllllllllIlIlIlIIlllIIlI[lllllllllllllllllIlIlIlIIlllIIIl].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llllIlIlIl[1];
                }
                ++lllllllllllllllllIlIlIlIIlllIIIl;
                0;
                if (null == null) continue;
                return ((0x70 ^ 0x27 ^ (0xFC ^ 0xA5)) & (76 + 6 - -30 + 16 ^ 136 + 48 - 180 + 138 ^ -1)) != 0;
            }
        }
        return llllIlIlIl[0];
    }

    private static void llIIllllIlIIl() {
        llllIlIIll = new String[llllIlIlIl[238]];
        T.llllIlIIll[T.llllIlIlIl[0]] = T."Buying items";
        T.llllIlIIll[T.llllIlIlIl[1]] = T."Finished buying items, switching back to agility";
        T.llllIlIIll[T.llllIlIlIl[3]] = T."Navigating to bank";
        T.llllIlIIll[T.llllIlIlIl[10]] = T."Handling banking";
        T.llllIlIIll[T.llllIlIlIl[17]] = T."We are missing quest supplies, switching to BUYING";
        T.llllIlIIll[T.llllIlIlIl[2]] = T."Vial";
        T.llllIlIIll[T.llllIlIlIl[20]] = T."Vial";
        T.llllIlIIll[T.llllIlIlIl[22]] = T."Drop";
        T.llllIlIIll[T.llllIlIlIl[24]] = T."Drink";
        T.llllIlIIll[T.llllIlIlIl[26]] = T."Eat";
        T.llllIlIIll[T.llllIlIlIl[12]] = T."Nav to gnome course";
        T.llllIlIIll[T.llllIlIlIl[49]] = T."Crossing log";
        T.llllIlIIll[T.llllIlIlIl[63]] = T."Log balance";
        T.llllIlIIll[T.llllIlIlIl[64]] = T."Walk-across";
        T.llllIlIIll[T.llllIlIlIl[53]] = T."Climbing net";
        T.llllIlIIll[T.llllIlIlIl[38]] = T."Obstacle net";
        T.llllIlIIll[T.llllIlIlIl[65]] = T."Climb-over";
        T.llllIlIIll[T.llllIlIlIl[66]] = T."Climbing branch";
        T.llllIlIIll[T.llllIlIlIl[54]] = T."Tree branch";
        T.llllIlIIll[T.llllIlIlIl[67]] = T."Climb";
        T.llllIlIIll[T.llllIlIlIl[40]] = T."Crossing rope";
        T.llllIlIIll[T.llllIlIlIl[68]] = T."Balancing rope";
        T.llllIlIIll[T.llllIlIlIl[61]] = T."Walk-on";
        T.llllIlIIll[T.llllIlIlIl[69]] = T."Climbing down";
        T.llllIlIIll[T.llllIlIlIl[70]] = T."Tree branch";
        T.llllIlIIll[T.llllIlIlIl[41]] = T."Climb-down";
        T.llllIlIIll[T.llllIlIlIl[71]] = T."Climbing net";
        T.llllIlIIll[T.llllIlIlIl[72]] = T."Obstacle net";
        T.llllIlIIll[T.llllIlIlIl[73]] = T."Climb-over";
        T.llllIlIIll[T.llllIlIlIl[74]] = T."Crossing pipe";
        T.llllIlIIll[T.llllIlIlIl[42]] = T."Obstacle pipe";
        T.llllIlIIll[T.llllIlIlIl[75]] = T."Squeeze-through";
        T.llllIlIIll[T.llllIlIlIl[95]] = T."Nav to start";
        T.llllIlIIll[T.llllIlIlIl[97]] = T."Mark of grace";
        T.llllIlIIll[T.llllIlIlIl[98]] = T."Taking mark";
        T.llllIlIIll[T.llllIlIlIl[99]] = T."Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[100]] = T."Take";
        T.llllIlIIll[T.llllIlIlIl[101]] = T."Starting course";
        T.llllIlIIll[T.llllIlIlIl[102]] = T."Rough wall";
        T.llllIlIIll[T.llllIlIlIl[103]] = T."Climb";
        T.llllIlIIll[T.llllIlIlIl[37]] = T."Crossing clothes line";
        T.llllIlIIll[T.llllIlIlIl[105]] = T."Clothes line";
        T.llllIlIIll[T.llllIlIlIl[106]] = T."Cross";
        T.llllIlIIll[T.llllIlIlIl[107]] = T."Leaping";
        T.llllIlIIll[T.llllIlIlIl[108]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[109]] = T."Leap";
        T.llllIlIIll[T.llllIlIlIl[110]] = T."Balancing";
        T.llllIlIIll[T.llllIlIlIl[111]] = T."Wall";
        T.llllIlIIll[T.llllIlIlIl[112]] = T."Balance";
        T.llllIlIIll[T.llllIlIlIl[113]] = T."Jumping gap";
        T.llllIlIIll[T.llllIlIlIl[39]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[7]] = T."Leap";
        T.llllIlIIll[T.llllIlIlIl[114]] = T."Jumping gap 2";
        T.llllIlIIll[T.llllIlIlIl[116]] = T."Leap";
        T.llllIlIIll[T.llllIlIlIl[117]] = T."Jumping gap 3";
        T.llllIlIIll[T.llllIlIlIl[119]] = T."Leap";
        T.llllIlIIll[T.llllIlIlIl[120]] = T."Hurdle roof";
        T.llllIlIIll[T.llllIlIlIl[122]] = T."Hurdle";
        T.llllIlIIll[T.llllIlIlIl[123]] = T."Finishing course";
        T.llllIlIIll[T.llllIlIlIl[124]] = T."Edge";
        T.llllIlIIll[T.llllIlIlIl[44]] = T."Jump-off";
        T.llllIlIIll[T.llllIlIlIl[140]] = T."Nav to canafis course";
        T.llllIlIIll[T.llllIlIlIl[6]] = T."Nav to start";
        T.llllIlIIll[T.llllIlIlIl[141]] = T."Starting course";
        T.llllIlIIll[T.llllIlIlIl[142]] = T."Tall tree";
        T.llllIlIIll[T.llllIlIlIl[143]] = T."Climb";
        T.llllIlIIll[T.llllIlIlIl[144]] = T."Mark of grace";
        T.llllIlIIll[T.llllIlIlIl[145]] = T."Taking mark";
        T.llllIlIIll[T.llllIlIlIl[146]] = T."Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[147]] = T."Take";
        T.llllIlIIll[T.llllIlIlIl[148]] = T."Jumping gap 1";
        T.llllIlIIll[T.llllIlIlIl[149]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[150]] = T."Jumping gap 2";
        T.llllIlIIll[T.llllIlIlIl[151]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[152]] = T."Jumping gap 3";
        T.llllIlIIll[T.llllIlIlIl[153]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[154]] = T."Jumping gap 4";
        T.llllIlIIll[T.llllIlIlIl[155]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[156]] = T."Vaulting";
        T.llllIlIIll[T.llllIlIlIl[157]] = T."Vault";
        T.llllIlIIll[T.llllIlIlIl[158]] = T."Jumping gap 5";
        T.llllIlIIll[T.llllIlIlIl[159]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[160]] = T."Jumping gap 6";
        T.llllIlIIll[T.llllIlIlIl[161]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[172]] = T."Nav to canafis course";
        T.llllIlIIll[T.llllIlIlIl[173]] = T."Nav to start";
        T.llllIlIIll[T.llllIlIlIl[174]] = T."Starting course";
        T.llllIlIIll[T.llllIlIlIl[175]] = T."Wall";
        T.llllIlIIll[T.llllIlIlIl[35]] = T."Climb-up";
        T.llllIlIIll[T.llllIlIlIl[176]] = T."Mark of grace";
        T.llllIlIIll[T.llllIlIlIl[177]] = T."Taking mark";
        T.llllIlIIll[T.llllIlIlIl[178]] = T."Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[179]] = T."Take";
        T.llllIlIIll[T.llllIlIlIl[180]] = T."Jumping gap 1";
        T.llllIlIIll[T.llllIlIlIl[79]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[181]] = T."cross rope";
        T.llllIlIIll[T.llllIlIlIl[182]] = T."Cross";
        T.llllIlIIll[T.llllIlIlIl[183]] = T."Jumping gap 3";
        T.llllIlIIll[T.llllIlIlIl[184]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[185]] = T."Jumping gap 4";
        T.llllIlIIll[T.llllIlIlIl[186]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[187]] = T."Jumping Edge";
        T.llllIlIIll[T.llllIlIlIl[188]] = T."Jump";
        T.llllIlIIll[T.llllIlIlIl[194]] = T."Found mark on ground";
        T.llllIlIIll[T.llllIlIlIl[203]] = T."Agility";
        T.llllIlIIll[T.llllIlIlIl[204]] = T."passage";
        T.llllIlIIll[T.llllIlIlIl[205]] = T."passage";
        T.llllIlIIll[T.llllIlIlIl[206]] = T."passage";
        T.llllIlIIll[T.llllIlIlIl[207]] = T."passage";
        T.llllIlIIll[T.llllIlIlIl[208]] = T."Edge";
        T.llllIlIIll[T.llllIlIlIl[211]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[213]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[216]] = T."Tightrope";
        T.llllIlIIll[T.llllIlIlIl[218]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[221]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[224]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[226]] = T."Pole-vault";
        T.llllIlIIll[T.llllIlIlIl[227]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[230]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[232]] = T."Gap";
        T.llllIlIIll[T.llllIlIlIl[233]] = T."Gap";
    }

    private static String llIIllllIIllI(String lllllllllllllllllIlIlIlIIIIIlIlI, String lllllllllllllllllIlIlIlIIIIIlIIl) {
        lllllllllllllllllIlIlIlIIIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlIlIIIIIllIl = new StringBuilder();
        char[] lllllllllllllllllIlIlIlIIIIIllII = lllllllllllllllllIlIlIlIIIIIlIIl.toCharArray();
        int lllllllllllllllllIlIlIlIIIIIlIll = llllIlIlIl[0];
        char[] lllllllllllllllllIlIlIlIIIIIIlIl = lllllllllllllllllIlIlIlIIIIIlIlI.toCharArray();
        int lllllllllllllllllIlIlIlIIIIIIlII = lllllllllllllllllIlIlIlIIIIIIlIl.length;
        int lllllllllllllllllIlIlIlIIIIIIIll = llllIlIlIl[0];
        while (T.llIIllllllIll(lllllllllllllllllIlIlIlIIIIIIIll, lllllllllllllllllIlIlIlIIIIIIlII)) {
            char lllllllllllllllllIlIlIlIIIIlIIII = lllllllllllllllllIlIlIlIIIIIIlIl[lllllllllllllllllIlIlIlIIIIIIIll];
            lllllllllllllllllIlIlIlIIIIIllIl.append((char)(lllllllllllllllllIlIlIlIIIIlIIII ^ lllllllllllllllllIlIlIlIIIIIllII[lllllllllllllllllIlIlIlIIIIIlIll % lllllllllllllllllIlIlIlIIIIIllII.length]));
            0;
            ++lllllllllllllllllIlIlIlIIIIIlIll;
            ++lllllllllllllllllIlIlIlIIIIIIIll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIlIlIIIIIllIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        if (T.llIlIIIIIIIII(Skills.getBoostedLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
            int n3;
            int[] nArray = new int[llllIlIlIl[1]];
            nArray[T.llllIlIlIl[0]] = llllIlIlIl[13];
            if (T.llIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIlIlIl[1]];
                nArray2[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (T.llIIllllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIlIlIl[1]];
                    nArray3[T.llllIlIlIl[0]] = llllIlIlIl[23];
                    if (!(!T.llIIllllllIlI(Inventory.contains((int[])nArray3) ? 1 : 0) || T.llIIlllllllII(Inventory.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[207]])) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[206]])) ? 1 : 0) || T.llIIlllllllII(Inventory.contains((int[])f.be) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains((int[])f.be) ? 1 : 0))) {
                        n3 = llllIlIlIl[1];
                        0;
                        if (((0x43 ^ 0x4F) & ~(0xB7 ^ 0xBB)) == 0) return n3 != 0;
                        return ((0x13 ^ 0x37) & ~(0x8F ^ 0xAB)) != 0;
                    }
                }
            }
            n3 = llllIlIlIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[llllIlIlIl[1]];
        nArray[T.llllIlIlIl[0]] = llllIlIlIl[13];
        if (T.llIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llllIlIlIl[1]];
            nArray4[T.llllIlIlIl[0]] = llllIlIlIl[15];
            if (T.llIIllllllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llllIlIlIl[1]];
                nArray5[T.llllIlIlIl[0]] = llllIlIlIl[14];
                if (!(!T.llIIllllllIlI(Inventory.contains((int[])nArray5) ? 1 : 0) || T.llIIlllllllII(Inventory.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[205]])) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains(item -> item.getName().contains(llllIlIIll[llllIlIlIl[204]])) ? 1 : 0) || T.llIIlllllllII(Inventory.contains((int[])f.be) ? 1 : 0) && !T.llIIllllllIlI(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (2 > ((178 + 114 - 169 + 122 ^ 7 + 173 - 74 + 89) & (0xA ^ 0x7B ^ (0x87 ^ 0xC0) ^ -1))) return n2 != 0;
                    return ((0x40 ^ 0x44 ^ (0x9D ^ 0xC7)) & (38 + 50 - -58 + 83 ^ 31 + 65 - -49 + 42 ^ -1)) != 0;
                }
            }
        }
        n2 = llllIlIlIl[0];
        return n2 != 0;
    }

    private static boolean llIIlllllllII(int n2) {
        return n2 == 0;
    }

    static {
        T.llIIllllllIIl();
        T.llIIllllIlIIl();
        bu = new ArrayList<d>();
        iS = llllIlIlIl[27];
        iT = llllIlIlIl[23];
        iV = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[0]);
        iW = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[1]);
        iX = new WorldArea(llllIlIlIl[235], llllIlIlIl[52], llllIlIlIl[69], llllIlIlIl[72], llllIlIlIl[3]);
        iY = new WorldPoint(llllIlIlIl[236], llllIlIlIl[237], llllIlIlIl[0]);
    }

    /*
     * WARNING - void declaration
     */
    private static void dv() {
        void lllllllllllllllllIlIlIlIlIllllII;
        void lllllllllllllllllIlIlIlIllIIIlII;
        void lllllllllllllllllIlIlIlIllIIIlIl;
        void lllllllllllllllllIlIlIlIllIIIllI;
        void lllllllllllllllllIlIlIlIllIIIlll;
        WorldArea worldArea = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[125], llllIlIlIl[126], llllIlIlIl[112], llllIlIlIl[107], llllIlIlIl[10]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[127], llllIlIlIl[128], llllIlIlIl[49], llllIlIlIl[12], llllIlIlIl[3]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[129], llllIlIlIl[127], llllIlIlIl[49], llllIlIlIl[24], llllIlIlIl[3]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[130], llllIlIlIl[131], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[3]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[132], llllIlIlIl[133], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[134], llllIlIlIl[9], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[135], llllIlIlIl[136], llllIlIlIl[68], llllIlIlIl[53], llllIlIlIl[10]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[137], llllIlIlIl[138], llllIlIlIl[63], llllIlIlIl[64], llllIlIlIl[3]);
        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[137], llllIlIlIl[139], llllIlIlIl[0]);
        if (T.llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (T.llIIlllllllII(lllllllllllllllllIlIlIlIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(lllllllllllllllllIlIlIlIllIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(lllllllllllllllllIlIlIlIllIIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(lllllllllllllllllIlIlIlIllIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[140]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIlIlIllllII);
            0;
            Time.sleepTicks((int)llllIlIlIl[1]);
            0;
        }
        if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (T.llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIlIlIllllII), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[6]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIlIlIllllII);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIlIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIlIlIllllII), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[141]];
                int lllllllllllllllllIlIlIlIlIlllIll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[143]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIll)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (-1 >= 0) {
                            return ((0x15 ^ 0x36 ^ (0x7B ^ 0x7F)) & (0x54 ^ 0x60 ^ (0xAD ^ 0xBE) ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
        }
        String[] stringArray = new String[llllIlIlIl[1]];
        stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[144]];
        TileItem lllllllllllllllllIlIlIlIlIlllIll = TileItems.getNearest((String[])stringArray);
        if (T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIll) && T.llIIllllllIlI(T.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[145]];
            System.out.println(llllIlIIll[llllIlIlIl[146]]);
            lllllllllllllllllIlIlIlIlIlllIll.interact(llllIlIIll[llllIlIlIl[147]]);
            Time.sleepTicks((int)llllIlIlIl[10]);
            0;
        }
        if (T.llIIlllllllII(T.dx() ? 1 : 0)) {
            void lllllllllllllllllIlIlIlIlIllllIl;
            void lllllllllllllllllIlIlIlIlIlllllI;
            void lllllllllllllllllIlIlIlIlIllllll;
            void lllllllllllllllllIlIlIlIllIIIIII;
            void lllllllllllllllllIlIlIlIllIIIIIl;
            void lllllllllllllllllIlIlIlIllIIIIlI;
            int lllllllllllllllllIlIlIlIlIlllIIl;
            TileObject lllllllllllllllllIlIlIlIlIlllIlI;
            void lllllllllllllllllIlIlIlIllIIIIll;
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[233]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[234], llllIlIlIl[131], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (-1 >= 0) {
                        return ((0xED ^ 0x85 ^ (0x30 ^ 0x54)) & (0xC3 ^ 0x90 ^ (0xD1 ^ 0x8E) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[148]];
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[149]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (-(0x43 ^ 0x47) > 0) {
                            return ((0x2A ^ 0x2C) & ~(0x9A ^ 0x9C)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[232]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[131], llllIlIlIl[225], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (-(0xC3 ^ 0x8C ^ (0x7E ^ 0x35)) > 0) {
                        return ((0xC4 ^ 0x87 ^ (0xBD ^ 0xA3)) & (141 + 145 - 204 + 127 ^ 36 + 75 - -23 + 6 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[150]];
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[151]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (3 == 0) {
                            return ((0x69 ^ 0x53) & ~(0xA7 ^ 0x9D)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[230]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[139], llllIlIlIl[231], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (((0x75 ^ 0x3C) & ~(0xEC ^ 0xA5)) > 0) {
                        return ((0x44 ^ 0x40) & ~(0x51 ^ 0x55)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[152]];
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[153]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (null != null) {
                            return ((0xDC ^ 0x9D ^ (0x96 ^ 0x92)) & (0x49 ^ 0x73 ^ 40 + 69 - -18 + 0 ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[227]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[228], llllIlIlIl[229], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if ((0x40 ^ 0x12 ^ (0x59 ^ 0xF)) <= 2) {
                        return ((7 + 114 - 90 + 104 ^ 94 + 125 - 194 + 166) & (87 + 114 - 91 + 44 ^ 20 + 139 - 14 + 17 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[154]];
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[155]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (null != null) {
                            return ((0xF4 ^ 0xBF) & ~(0x35 ^ 0x7E)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIllllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[226]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[9], llllIlIlIl[130], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (2 < 2) {
                        return ((0x76 ^ 0x57 ^ (0x5E ^ 0x78)) & (16 + 61 - 28 + 89 ^ 124 + 28 - 79 + 68 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[156]];
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[157]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (1 > (0xBC ^ 0xB8)) {
                            return ((0xC ^ 0x50) & ~(0x11 ^ 0x4D)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[224]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[225], llllIlIlIl[215], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if ((0x70 ^ 0x74) < ((0x9B ^ 0x8E) & ~(0x33 ^ 0x26))) {
                        return ((0x3D ^ 0x30) & ~(0xA4 ^ 0xA9)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[158]];
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[159]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (((0x16 ^ 0x71 ^ (0x5C ^ 0x2C)) & (0xF1 ^ 0x9E ^ (0xE7 ^ 0x9F) ^ -1)) < 0) {
                            return ((0xB8 ^ 0xAA ^ (0x6D ^ 0x25)) & (41 + 66 - 68 + 177 ^ 12 + 62 - -32 + 24 ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIllllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlllIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[221]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[222], llllIlIlIl[223], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (1 > (0x94 ^ 0x90)) {
                        return ((3 ^ 0x41) & ~(0xE0 ^ 0xA2)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[160]];
                lllllllllllllllllIlIlIlIlIlllIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlllIlI.interact(llllIlIIll[llllIlIlIl[161]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlllIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if ((4 ^ 0) == (3 & ~3)) {
                            return ((0x29 ^ 0x69) & ~(0x47 ^ 7)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void du() {
        WorldArea worldArea = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[3]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[76], llllIlIlIl[77], llllIlIlIl[78], llllIlIlIl[79], llllIlIlIl[10]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[80], llllIlIlIl[81], llllIlIlIl[69], llllIlIlIl[64], llllIlIlIl[0]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[82], llllIlIlIl[81], llllIlIlIl[12], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[83], llllIlIlIl[84], llllIlIlIl[63], llllIlIlIl[49], llllIlIlIl[10]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[85], llllIlIlIl[86], llllIlIlIl[26], llllIlIlIl[22], llllIlIlIl[1]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[85], llllIlIlIl[87], llllIlIlIl[12], llllIlIlIl[24], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[88], llllIlIlIl[89], llllIlIlIl[75], llllIlIlIl[40], llllIlIlIl[10]);
        WorldArea worldArea10 = new WorldArea(llllIlIlIl[90], llllIlIlIl[91], llllIlIlIl[66], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea11 = new WorldArea(llllIlIlIl[92], llllIlIlIl[93], llllIlIlIl[22], llllIlIlIl[26], llllIlIlIl[10]);
        WorldArea worldArea12 = new WorldArea(llllIlIlIl[92], llllIlIlIl[94], llllIlIlIl[12], llllIlIlIl[22], llllIlIlIl[10]);
        if (T.llIIlllllllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[95]];
            if (T.llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (T.llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llllIlIlIl[96], llllIlIlIl[52], llllIlIlIl[0]));
            0;
            Time.sleepTicks((int)llllIlIlIl[1]);
            0;
        }
        if (T.llIlIIIIIIIIl(Players.getLocal().getAnimation(), llllIlIlIl[62]) && T.llIIlllllllII(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llllIlIlIl[1]];
            stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[97]];
            TileItem lllllllllllllllllIlIlIlIllIllIII = TileItems.getNearest((String[])stringArray);
            if (T.llIIlllllllIl(lllllllllllllllllIlIlIlIllIllIII) && T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[98]];
                System.out.println(llllIlIIll[llllIlIlIl[99]]);
                lllllllllllllllllIlIlIlIllIllIII.interact(llllIlIIll[llllIlIlIl[100]]);
                Time.sleepTicks((int)llllIlIlIl[10]);
                0;
            }
            if (T.llIIlllllllII(T.dx() ? 1 : 0)) {
                void lllllllllllllllllIlIlIlIllIllIIl;
                void lllllllllllllllllIlIlIlIllIllIlI;
                void lllllllllllllllllIlIlIlIllIllIll;
                void lllllllllllllllllIlIlIlIllIlllII;
                void lllllllllllllllllIlIlIlIllIlllIl;
                void lllllllllllllllllIlIlIlIllIllllI;
                void lllllllllllllllllIlIlIlIllIlllll;
                void lllllllllllllllllIlIlIlIlllIIIII;
                int lllllllllllllllllIlIlIlIllIlIlll;
                void lllllllllllllllllIlIlIlIlllIIIIl;
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[101]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llllIlIlIl[1]];
                    stringArray2[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(llllIlIIll[llllIlIlIl[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if ((22 + 45 - -62 + 31 ^ 124 + 68 - 126 + 98) < 1) {
                                return ((1 ^ 0x75 ^ (0xD8 ^ 0x9B)) & (0x4C ^ 0x3F ^ (0x74 ^ 0x30) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlllIIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[37]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llllIlIlIl[1]];
                    stringArray3[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(llllIlIIll[llllIlIlIl[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if (1 == -1) {
                                return ((61 + 42 - -149 + 0 ^ 136 + 47 - 62 + 62) & (0x2F ^ 0 ^ (0xF8 ^ 0x9C) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIlllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[107]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llllIlIlIl[1]];
                    stringArray4[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(llllIlIIll[llllIlIlIl[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if ((0xC0 ^ 0xC5) <= 0) {
                                return ((0xDE ^ 0x85) & ~(0x71 ^ 0x2A)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIllllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[110]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llllIlIlIl[1]];
                    stringArray5[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(llllIlIIll[llllIlIlIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if (2 < 1) {
                                return ((0x9F ^ 0xB9) & ~(0xB ^ 0x2D)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[113]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llllIlIlIl[1]];
                    stringArray6[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(llllIlIIll[llllIlIlIl[7]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if (2 == ((0x4C ^ 0x52) & ~(0x5E ^ 0x40))) {
                                return ((0xA0 ^ 0x9D) & ~(6 ^ 0x3B)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[114]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[115];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIIll[llllIlIlIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if (-1 > 0) {
                                return ((12 + 129 - 19 + 80 ^ 78 + 44 - 105 + 115) & (0x53 ^ 0x19 ^ (0xBC ^ 0xB8) ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[117]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[118];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIIll[llllIlIlIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if (1 < 0) {
                                return (2 & (2 ^ -1)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[120]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[121];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIIll[llllIlIlIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if (-3 >= 0) {
                                return ((0x9B ^ 0x94) & ~(0xA7 ^ 0xA8)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIllIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(T.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[123]];
                    lllllllllllllllllIlIlIlIllIlIlll = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llllIlIlIl[1]];
                    stringArray7[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(llllIlIIll[llllIlIlIl[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIllIlIlll)) {
                            bl = llllIlIlIl[1];
                            0;
                            if ((0x55 ^ 0x51) <= 3) {
                                return ((0x19 ^ 0x47) & ~(0x3D ^ 0x63)) != 0;
                            }
                        } else {
                            bl = llllIlIlIl[0];
                        }
                        return bl;
                    }, (int)llllIlIlIl[104]);
                    0;
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
            }
        }
    }

    private static boolean llIIlllllllll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIllllllllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void dw() {
        void lllllllllllllllllIlIlIlIlIlIIIlI;
        void lllllllllllllllllIlIlIlIlIlIlIII;
        void lllllllllllllllllIlIlIlIlIlIlIIl;
        void lllllllllllllllllIlIlIlIlIlIlIlI;
        void lllllllllllllllllIlIlIlIlIlIlIll;
        WorldArea worldArea = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[3]);
        WorldArea worldArea4 = new WorldArea(llllIlIlIl[162], llllIlIlIl[163], llllIlIlIl[111], llllIlIlIl[111], llllIlIlIl[10]);
        WorldArea worldArea5 = new WorldArea(llllIlIlIl[164], llllIlIlIl[133], llllIlIlIl[64], llllIlIlIl[12], llllIlIlIl[10]);
        WorldArea worldArea6 = new WorldArea(llllIlIlIl[165], llllIlIlIl[139], llllIlIlIl[38], llllIlIlIl[53], llllIlIlIl[3]);
        WorldArea worldArea7 = new WorldArea(llllIlIlIl[166], llllIlIlIl[134], llllIlIlIl[49], llllIlIlIl[26], llllIlIlIl[3]);
        WorldArea worldArea8 = new WorldArea(llllIlIlIl[167], llllIlIlIl[136], llllIlIlIl[70], llllIlIlIl[64], llllIlIlIl[10]);
        WorldArea worldArea9 = new WorldArea(llllIlIlIl[168], llllIlIlIl[169], llllIlIlIl[54], llllIlIlIl[63], llllIlIlIl[3]);
        WorldPoint worldPoint = new WorldPoint(llllIlIlIl[170], llllIlIlIl[171], llllIlIlIl[0]);
        if (T.llIIllllllIlI(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (T.llIIlllllllII(lllllllllllllllllIlIlIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(lllllllllllllllllIlIlIlIlIlIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(lllllllllllllllllIlIlIlIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllII(lllllllllllllllllIlIlIlIlIlIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[172]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIlIlIlIIIlI);
            0;
            Time.sleepTicks((int)llllIlIlIl[1]);
            0;
        }
        if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (T.llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIlIlIlIIIlI), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[173]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIlIlIlIIIlI);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIlIIIIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIlIlIlIIIlI), llllIlIlIl[20])) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[174]];
                int lllllllllllllllllIlIlIlIlIlIIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIIll[llllIlIlIl[35]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIlIIIIl)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (-3 > 0) {
                            return ((0x50 ^ 6) & ~(0x45 ^ 0x13)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
        }
        String[] stringArray = new String[llllIlIlIl[1]];
        stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[176]];
        TileItem lllllllllllllllllIlIlIlIlIlIIIIl = TileItems.getNearest((String[])stringArray);
        if (T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlIIIIl) && T.llIIllllllIlI(T.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[177]];
            System.out.println(llllIlIIll[llllIlIlIl[178]]);
            lllllllllllllllllIlIlIlIlIlIIIIl.interact(llllIlIIll[llllIlIlIl[179]]);
            Time.sleepTicks((int)llllIlIlIl[10]);
            0;
        }
        if (T.llIIlllllllII(T.dx() ? 1 : 0)) {
            void lllllllllllllllllIlIlIlIlIlIIIll;
            void lllllllllllllllllIlIlIlIlIlIIlII;
            void lllllllllllllllllIlIlIlIlIlIIlIl;
            void lllllllllllllllllIlIlIlIlIlIIllI;
            int lllllllllllllllllIlIlIlIlIIlllll;
            TileObject lllllllllllllllllIlIlIlIlIlIIIII;
            void lllllllllllllllllIlIlIlIlIlIIlll;
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[218]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[219], llllIlIlIl[220], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (null != null) {
                        return ((7 ^ 0x21) & ~(0xD ^ 0x2B)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllIlIlIlIlIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[180]];
                lllllllllllllllllIlIlIlIlIlIIIII.interact(llllIlIIll[llllIlIlIl[79]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIIlllll)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (-1 >= 3) {
                            return ((0x84 ^ 0x96) & ~(0x6F ^ 0x7D)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[216]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[217], llllIlIlIl[128], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (3 <= 0) {
                        return ((0x70 ^ 0x48 ^ (0xE2 ^ 0xC7)) & (0xEA ^ 0xC5 ^ (0x6A ^ 0x58) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[181]];
                lllllllllllllllllIlIlIlIlIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlIIIII.interact(llllIlIIll[llllIlIlIl[182]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIIlllll)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (((0xC9 ^ 0x86) & ~(0x68 ^ 0x27)) < 0) {
                            return ((0xBA ^ 0xB7) & ~(0xA4 ^ 0xA9)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[213]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[214], llllIlIlIl[215], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (-2 >= 0) {
                        return ((0xB5 ^ 0xB9) & ~(0x4C ^ 0x40)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[183]];
                lllllllllllllllllIlIlIlIlIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlIIIII.interact(llllIlIIll[llllIlIlIl[184]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIIlllll)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (2 >= (0x2A ^ 0x2E)) {
                            return ((0xE5 ^ 0xAB) & ~(0x27 ^ 0x69)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[211]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[209], llllIlIlIl[212], llllIlIlIl[10])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (((0x71 ^ 0x6B ^ (0xB9 ^ 0x9A)) & (133 + 85 - 103 + 20 ^ 117 + 39 - 100 + 134 ^ -1)) != 0) {
                        return ((3 ^ (0x4D ^ 0x66)) & (0x68 ^ 0x45 ^ (0x6F ^ 0x6A) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[185]];
                lllllllllllllllllIlIlIlIlIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlIIIII.interact(llllIlIIll[llllIlIlIl[186]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIIlllll)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (1 == 3) {
                            return ((0x5C ^ 0x43) & ~(0x9D ^ 0x82)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
            if (T.llIIllllllIlI(T.dx() ? 1 : 0)) {
                return;
            }
            if (T.llIIllllllIlI(lllllllllllllllllIlIlIlIlIlIIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && T.llIIlllllllIl(lllllllllllllllllIlIlIlIlIlIIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (T.llIIllllllIlI(tileObject.getName().contains(llllIlIIll[llllIlIlIl[208]]) ? 1 : 0) && T.llIlIIIIIIIlI(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIlIlIl[209], llllIlIlIl[210], llllIlIlIl[3])), llllIlIlIl[3])) {
                    n2 = llllIlIlIl[1];
                    0;
                    if (null != null) {
                        return ((0x94 ^ 0x90 ^ (0x1D ^ 0x32)) & (0x72 ^ 0x68 ^ (0x47 ^ 0x76) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIlIlIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[187]];
                lllllllllllllllllIlIlIlIlIIlllll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIlIlIlIIIII.interact(llllIlIIll[llllIlIlIl[188]]);
                Time.sleepTicks((int)e.c(llllIlIlIl[1], llllIlIlIl[3]));
                0;
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (T.llIIllllllllI(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIlIlIIlllll)) {
                        bl = llllIlIlIl[1];
                        0;
                        if (2 > 2) {
                            return ((0x5F ^ 0x55 ^ (0x69 ^ 0x4F)) & (36 + 66 - -3 + 64 ^ 130 + 95 - 201 + 109 ^ -1)) != 0;
                        }
                    } else {
                        bl = llllIlIlIl[0];
                    }
                    return bl;
                }, (int)llllIlIlIl[104]);
                0;
                Time.sleepTicks((int)llllIlIlIl[1]);
                0;
            }
        }
    }

    private static boolean llIlIIIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIIIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    public static void ds() {
        if (T.llIIllllllIlI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[0]];
            b.a(bu);
            if (T.llIIllllllIll(bu.size(), llllIlIlIl[1])) {
                System.out.println(llllIlIIll[llllIlIlIl[1]]);
                bs = llllIlIlIl[0];
            }
        }
        if (T.llIIlllllllII(bs ? 1 : 0) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[2])) {
            if (T.llIIlllllllII(T.aa() ? 1 : 0)) {
                BankLocation lllllllllllllllllIlIlIllIIIIIlIl = BankLocation.getNearest();
                if (T.llIIlllllllIl(lllllllllllllllllIlIlIllIIIIIlIl) && T.llIIlllllllII(lllllllllllllllllIlIlIllIIIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[3]];
                    WorldArea lllllllllllllllllIlIlIllIIIIIlII = new WorldArea(llllIlIlIl[4], llllIlIlIl[5], llllIlIlIl[6], llllIlIlIl[7], llllIlIlIl[0]);
                    if (T.llIIllllllIlI(lllllllllllllllllIlIlIllIIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lllllllllllllllllIlIlIllIIIIIIll = new WorldPoint(llllIlIlIl[8], llllIlIlIl[9], llllIlIlIl[0]);
                        if (T.llIIllllllllI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlIlIllIIIIIIll), llllIlIlIl[10])) {
                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIllIIIIIIll);
                            0;
                            Time.sleepTicks((int)llllIlIlIl[1]);
                            0;
                        }
                    }
                    a.a(lllllllllllllllllIlIlIllIIIIIlIl);
                }
                if (T.llIIlllllllIl(lllllllllllllllllIlIlIllIIIIIlIl) && T.llIIllllllIlI(lllllllllllllllllIlIlIllIIIIIlIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIIll[llllIlIlIl[10]];
                    if (T.llIIlllllllII(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIlIlIl[11]);
                        0;
                    }
                    if (T.llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                        if (T.llIIlllllllll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIlIlIl[1]);
                            0;
                        }
                        if (T.llIIlllllllll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIlIlIl[3]);
                            0;
                        }
                    }
                    int[] nArray = new int[llllIlIlIl[12]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[13];
                    nArray[T.llllIlIlIl[1]] = llllIlIlIl[14];
                    nArray[T.llllIlIlIl[3]] = llllIlIlIl[15];
                    nArray[T.llllIlIlIl[10]] = llllIlIlIl[16];
                    nArray[T.llllIlIlIl[17]] = llllIlIlIl[18];
                    nArray[T.llllIlIlIl[2]] = llllIlIlIl[19];
                    nArray[T.llllIlIlIl[20]] = llllIlIlIl[21];
                    nArray[T.llllIlIlIl[22]] = llllIlIlIl[23];
                    nArray[T.llllIlIlIl[24]] = llllIlIlIl[25];
                    nArray[T.llllIlIlIl[26]] = llllIlIlIl[27];
                    if (T.llIIlllllllII(e.b(nArray) ? 1 : 0)) {
                        T.ae();
                        System.out.println(llllIlIIll[llllIlIlIl[17]]);
                        bs = llllIlIlIl[1];
                        return;
                    }
                    int[] nArray2 = new int[llllIlIlIl[12]];
                    nArray2[T.llllIlIlIl[0]] = llllIlIlIl[13];
                    nArray2[T.llllIlIlIl[1]] = llllIlIlIl[14];
                    nArray2[T.llllIlIlIl[3]] = llllIlIlIl[15];
                    nArray2[T.llllIlIlIl[10]] = llllIlIlIl[16];
                    nArray2[T.llllIlIlIl[17]] = llllIlIlIl[18];
                    nArray2[T.llllIlIlIl[2]] = llllIlIlIl[19];
                    nArray2[T.llllIlIlIl[20]] = llllIlIlIl[21];
                    nArray2[T.llllIlIlIl[22]] = llllIlIlIl[23];
                    nArray2[T.llllIlIlIl[24]] = llllIlIlIl[25];
                    nArray2[T.llllIlIlIl[26]] = llllIlIlIl[27];
                    if (T.llIIllllllIlI(e.b(nArray2) ? 1 : 0)) {
                        a.a(llllIlIlIl[28], llllIlIlIl[1]);
                        a.a(llllIlIlIl[29], llllIlIlIl[1]);
                        a.a(llllIlIlIl[30], llllIlIlIl[1]);
                        a.a(llllIlIlIl[31], llllIlIlIl[1]);
                        a.a(llllIlIlIl[32], llllIlIlIl[1]);
                        a.a(llllIlIlIl[33], llllIlIlIl[1]);
                        a.a(llllIlIlIl[34], llllIlIlIl[1]);
                        int[] nArray3 = new int[llllIlIlIl[1]];
                        nArray3[T.llllIlIlIl[0]] = llllIlIlIl[28];
                        if (T.llIIlllllllII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llllIlIlIl[1]];
                            nArray4[T.llllIlIlIl[0]] = llllIlIlIl[28];
                            if (T.llIIlllllllII(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llllIlIlIl[1]];
                                nArray5[T.llllIlIlIl[0]] = llllIlIlIl[28];
                                if (T.llIIlllllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llllIlIlIl[35], llllIlIlIl[1]);
                                }
                            }
                        }
                        a.a(llllIlIlIl[18], llllIlIlIl[1]);
                        e.l(llllIlIlIl[28]);
                        e.l(llllIlIlIl[29]);
                        e.l(llllIlIlIl[30]);
                        e.l(llllIlIlIl[31]);
                        e.l(llllIlIlIl[32]);
                        Time.sleepTicks((int)llllIlIlIl[1]);
                        0;
                        e.l(llllIlIlIl[34]);
                        e.l(llllIlIlIl[36]);
                        e.l(llllIlIlIl[33]);
                        e.l(llllIlIlIl[35]);
                        e.l(llllIlIlIl[18]);
                        Time.sleepTicks((int)llllIlIlIl[10]);
                        0;
                        if (T.llIIlllllllII(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllIlIlIl[20]);
                            0;
                        }
                        if (T.llIIllllllIlI(Bank.isOpen() ? 1 : 0)) {
                            if (T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
                                a.a(llllIlIlIl[13], llllIlIlIl[12]);
                                a.a(llllIlIlIl[14], llllIlIlIl[12]);
                                a.a(llllIlIlIl[21], llllIlIlIl[12]);
                                a.a(llllIlIlIl[15], llllIlIlIl[12]);
                                a.b(f.be, llllIlIlIl[1]);
                                a.a(llllIlIlIl[27], llllIlIlIl[1]);
                                a.a(llllIlIlIl[19], llllIlIlIl[2]);
                                a.a(llllIlIlIl[23], llllIlIlIl[38]);
                            }
                            if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
                                a.a(llllIlIlIl[13], llllIlIlIl[12]);
                                a.a(llllIlIlIl[21], llllIlIlIl[12]);
                                a.a(llllIlIlIl[25], llllIlIlIl[12]);
                                a.b(f.be, llllIlIlIl[1]);
                                a.a(llllIlIlIl[27], llllIlIlIl[1]);
                                a.a(llllIlIlIl[19], llllIlIlIl[24]);
                                a.a(llllIlIlIl[23], llllIlIlIl[12]);
                            }
                        }
                    }
                }
            }
            if (T.llIIllllllIlI(T.aa() ? 1 : 0)) {
                String[] stringArray = new String[llllIlIlIl[1]];
                stringArray[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[2]];
                if (T.llIIllllllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llllIlIlIl[1]];
                    stringArray2[T.llllIlIlIl[0]] = llllIlIIll[llllIlIlIl[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llllIlIIll[llllIlIlIl[22]]);
                }
                if (T.llIIllllllIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && T.llIIllllllIll(Movement.getRunEnergy(), llllIlIlIl[39])) {
                    Inventory.getFirst((int[])f.aU).interact(llllIlIIll[llllIlIlIl[24]]);
                    Time.sleepTicks((int)llllIlIlIl[1]);
                    0;
                }
                if (T.llIIllllllllI(Combat.getMissingHealth(), llllIlIlIl[40])) {
                    int[] nArray = new int[llllIlIlIl[1]];
                    nArray[T.llllIlIlIl[0]] = llllIlIlIl[23];
                    if (T.llIIllllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llllIlIlIl[1]];
                        nArray6[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        Inventory.getFirst((int[])nArray6).interact(llllIlIIll[llllIlIlIl[26]]);
                        Time.sleepTicks((int)llllIlIlIl[3]);
                        0;
                    }
                }
                if (T.llIIllllllllI(Movement.getRunEnergy(), llllIlIlIl[41]) && T.llIIlllllllII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[42])) {
                    T.dt();
                }
                if ((!T.llIlIIIIIIIII(e.j(llllIlIlIl[43]), llllIlIlIl[44]) || T.llIIllllllIll(e.j(llllIlIlIl[45]), llllIlIlIl[2])) && T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[42]) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[44])) {
                    T.du();
                }
                if (T.llIlIIIIIIIII(e.j(llllIlIlIl[43]), llllIlIlIl[44]) && T.llIlIIIIIIIII(e.j(llllIlIlIl[45]), llllIlIlIl[2])) {
                    if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[42]) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37])) {
                        T.du();
                    }
                    if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[37]) && T.llIIllllllIll(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[44])) {
                        T.dv();
                    }
                }
                if (T.llIlIIIIIIIII(Skills.getLevel((Skill)Skill.AGILITY), llllIlIlIl[44])) {
                    T.dw();
                }
            }
        }
    }

    public static void ae() {
        d lllllllllllllllllIlIlIlIIllIllll;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llllIlIlIl[1]];
                        nArray[T.llllIlIlIl[0]] = llllIlIlIl[16];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llllIlIlIl[16], llllIlIlIl[1], llllIlIlIl[195]);
                            bu.add(d2);
                            0;
                        }
                        int[] nArray2 = new int[llllIlIlIl[1]];
                        nArray2[T.llllIlIlIl[0]] = llllIlIlIl[18];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[18], llllIlIlIl[3], llllIlIlIl[196]);
                            bu.add(lllllllllllllllllIlIlIlIIllIllll);
                            0;
                        }
                        int[] nArray3 = new int[llllIlIlIl[1]];
                        nArray3[T.llllIlIlIl[0]] = llllIlIlIl[27];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[27], llllIlIlIl[3], llllIlIlIl[196]);
                            bu.add(lllllllllllllllllIlIlIlIIllIllll);
                            0;
                        }
                        int[] nArray4 = new int[llllIlIlIl[1]];
                        nArray4[T.llllIlIlIl[0]] = llllIlIlIl[13];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[13], llllIlIlIl[12], llllIlIlIl[197]);
                            bu.add(lllllllllllllllllIlIlIlIIllIllll);
                            0;
                        }
                        int[] nArray5 = new int[llllIlIlIl[1]];
                        nArray5[T.llllIlIlIl[0]] = llllIlIlIl[21];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[21], llllIlIlIl[12], llllIlIlIl[198]);
                            bu.add(lllllllllllllllllIlIlIlIIllIllll);
                            0;
                        }
                        int[] nArray6 = new int[llllIlIlIl[1]];
                        nArray6[T.llllIlIlIl[0]] = llllIlIlIl[15];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[15], llllIlIlIl[12], llllIlIlIl[198]);
                            bu.add(lllllllllllllllllIlIlIlIIllIllll);
                            0;
                        }
                        int[] nArray7 = new int[llllIlIlIl[1]];
                        nArray7[T.llllIlIlIl[0]] = llllIlIlIl[14];
                        if (T.llIIlllllllII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[14], llllIlIlIl[12], llllIlIlIl[198]);
                            bu.add(lllllllllllllllllIlIlIlIIllIllll);
                            0;
                        }
                        int[] nArray8 = new int[llllIlIlIl[1]];
                        nArray8[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        if (!T.llIIllllllIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llllIlIlIl[1]];
                        nArray9[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        if (!T.llIIllllllIlI(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llllIlIlIl[1]];
                        nArray10[T.llllIlIlIl[0]] = llllIlIlIl[23];
                        if (!T.llIIllllllIll(Bank.getFirst((int[])nArray10).getQuantity(), llllIlIlIl[12])) break block16;
                    }
                    lllllllllllllllllIlIlIlIIllIllll = new d(iT, llllIlIlIl[44], llllIlIlIl[199]);
                    bu.add(lllllllllllllllllIlIlIlIIllIllll);
                    0;
                }
                int[] nArray = new int[llllIlIlIl[1]];
                nArray[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (!T.llIIllllllIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llllIlIlIl[1]];
                nArray11[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (!T.llIIllllllIlI(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llllIlIlIl[1]];
                nArray12[T.llllIlIlIl[0]] = llllIlIlIl[25];
                if (!T.llIIllllllIll(Bank.getFirst((int[])nArray12).getQuantity(), llllIlIlIl[12])) break block18;
            }
            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[25], llllIlIlIl[12], llllIlIlIl[200]);
            bu.add(lllllllllllllllllIlIlIlIIllIllll);
            0;
        }
        int[] nArray = new int[llllIlIlIl[1]];
        nArray[T.llllIlIlIl[0]] = llllIlIlIl[201];
        if (T.llIIlllllllII(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[201], llllIlIlIl[1], llllIlIlIl[202]);
            bu.add(lllllllllllllllllIlIlIlIIllIllll);
            0;
        }
        int[] nArray13 = new int[llllIlIlIl[1]];
        nArray13[T.llllIlIlIl[0]] = llllIlIlIl[19];
        if (T.llIIlllllllII(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lllllllllllllllllIlIlIlIIllIllll = new d(llllIlIlIl[19], llllIlIlIl[40], i.bp);
            bu.add(lllllllllllllllllIlIlIlIIllIllll);
            0;
        }
    }

    private static String llIIllllIIlll(String lllllllllllllllllIlIlIIllllllIII, String lllllllllllllllllIlIlIIllllllIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIlllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIllllllIIl.getBytes(StandardCharsets.UTF_8)), llllIlIlIl[24]), "DES");
            Cipher lllllllllllllllllIlIlIIlllllllII = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIlllllllII.init(llllIlIlIl[3], lllllllllllllllllIlIlIIlllllllIl);
            return new String(lllllllllllllllllIlIlIIlllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIIllllllIll) {
            lllllllllllllllllIlIlIIllllllIll.printStackTrace();
            return null;
        }
    }

    private static String llIIllllIIlIl(String lllllllllllllllllIlIlIlIIIIlllll, String lllllllllllllllllIlIlIlIIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIlIIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlIlIIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlIlIIIlIIIIl.init(llllIlIlIl[3], lllllllllllllllllIlIlIlIIIlIIIlI);
            return new String(lllllllllllllllllIlIlIlIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIlIIIlIIIII) {
            lllllllllllllllllIlIlIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    @Override
    public int T() {
        try {
            T.ds();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-2 > 0) {
            return (0x9B ^ 0xC5) & ~(0x2F ^ 0x71);
        }
        return llllIlIlIl[186];
    }
}

