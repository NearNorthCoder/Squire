/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.aa;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.ac;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.g;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.k;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.t;
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
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class o
implements S {
    private static /* synthetic */ String[] bQ;
    public static final /* synthetic */ WorldPoint ct;
    public static final /* synthetic */ WorldPoint cu;
    static /* synthetic */ int cw;
    public static final /* synthetic */ WorldPoint cs;
    public static final /* synthetic */ WorldPoint cq;
    public static final /* synthetic */ WorldPoint cp;
    static /* synthetic */ WorldArea cx;
    private static /* synthetic */ String[] lIIIIIIIlIl;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ List<d> bu;
    public static final /* synthetic */ WorldPoint cn;
    public static final /* synthetic */ WorldPoint co;
    public static final /* synthetic */ WorldPoint cv;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int ck;
    private static /* synthetic */ int[] lIIIIIIIlll;
    public static final /* synthetic */ WorldPoint cr;

    private static boolean llIllIllIIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return lIIIIIIIlIl[lIIIIIIIlll[86]];
    }

    private static boolean llIllIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llIllIlIlIIlI(String lllllllllllllllllIlIIIIIIIIlIlII, String lllllllllllllllllIlIIIIIIIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlll[23]), "DES");
            Cipher lllllllllllllllllIlIIIIIIIIlIllI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIIIIIIIlIllI.init(lIIIIIIIlll[5], lllllllllllllllllIlIIIIIIIIlIlll);
            return new String(lllllllllllllllllIlIIIIIIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIIIIIlIlIl) {
            lllllllllllllllllIlIIIIIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIllIIllI(Object object) {
        return object != null;
    }

    private static String llIllIlIlIIII(String lllllllllllllllllIlIIIIIIIIIIlII, String lllllllllllllllllIlIIIIIIIIIIIll) {
        lllllllllllllllllIlIIIIIIIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIIIIIIIIIlI = new StringBuilder();
        char[] lllllllllllllllllIlIIIIIIIIIIIIl = lllllllllllllllllIlIIIIIIIIIIIll.toCharArray();
        int lllllllllllllllllIlIIIIIIIIIIIII = lIIIIIIIlll[1];
        char[] lllllllllllllllllIIllllllllllIlI = lllllllllllllllllIlIIIIIIIIIIlII.toCharArray();
        int lllllllllllllllllIIllllllllllIIl = lllllllllllllllllIIllllllllllIlI.length;
        int lllllllllllllllllIIllllllllllIII = lIIIIIIIlll[1];
        while (o.llIllIllIIIll(lllllllllllllllllIIllllllllllIII, lllllllllllllllllIIllllllllllIIl)) {
            char lllllllllllllllllIlIIIIIIIIIIlIl = lllllllllllllllllIIllllllllllIlI[lllllllllllllllllIIllllllllllIII];
            lllllllllllllllllIlIIIIIIIIIIIlI.append((char)(lllllllllllllllllIlIIIIIIIIIIlIl ^ lllllllllllllllllIlIIIIIIIIIIIIl[lllllllllllllllllIlIIIIIIIIIIIII % lllllllllllllllllIlIIIIIIIIIIIIl.length]));
            0;
            ++lllllllllllllllllIlIIIIIIIIIIIII;
            ++lllllllllllllllllIIllllllllllIII;
            0;
            if (-3 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIIIIIIIIIIlI);
    }

    @Override
    public int T() {
        try {
            o.aD();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x71 ^ 0x2C) & ~(0xF9 ^ 0xA4)) != 0) {
            return (0xD0 ^ 0x95) & ~(0x46 ^ 3);
        }
        return lIIIIIIIlll[85];
    }

    private static boolean llIllIllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIllIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean S() {
        return lIIIIIIIlll[1];
    }

    private static boolean llIllIllIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIllIlIll(Object object) {
        return object == null;
    }

    private static boolean llIllIllIllII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.llIllIllIIIIl();
        o.llIllIllIIIII();
        cn = new WorldPoint(lIIIIIIIlll[91], lIIIIIIIlll[92], lIIIIIIIlll[1]);
        co = new WorldPoint(lIIIIIIIlll[93], lIIIIIIIlll[94], lIIIIIIIlll[1]);
        cp = new WorldPoint(lIIIIIIIlll[95], lIIIIIIIlll[96], lIIIIIIIlll[1]);
        cq = new WorldPoint(lIIIIIIIlll[97], lIIIIIIIlll[98], lIIIIIIIlll[1]);
        cr = new WorldPoint(lIIIIIIIlll[99], lIIIIIIIlll[100], lIIIIIIIlll[1]);
        cs = new WorldPoint(lIIIIIIIlll[101], lIIIIIIIlll[102], lIIIIIIIlll[1]);
        ct = new WorldPoint(lIIIIIIIlll[103], lIIIIIIIlll[104], lIIIIIIIlll[1]);
        cu = new WorldPoint(lIIIIIIIlll[91], lIIIIIIIlll[105], lIIIIIIIlll[1]);
        cv = new WorldPoint(lIIIIIIIlll[106], lIIIIIIIlll[107], lIIIIIIIlll[1]);
        bu = new ArrayList<d>();
        cw = lIIIIIIIlll[30];
        cx = new WorldArea(lIIIIIIIlll[93], lIIIIIIIlll[108], lIIIIIIIlll[26], lIIIIIIIlll[47], lIIIIIIIlll[1]);
        String[] stringArray = new String[lIIIIIIIlll[11]];
        stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[109]];
        stringArray[o.lIIIIIIIlll[0]] = lIIIIIIIlIl[lIIIIIIIlll[110]];
        stringArray[o.lIIIIIIIlll[5]] = lIIIIIIIlIl[lIIIIIIIlll[111]];
        bQ = stringArray;
    }

    private static boolean llIllIllIllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIllIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void lllllllllllllllllIlIIIIIIIllIIlI;
        int[] nArray = new int[lIIIIIIIlll[12]];
        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
        nArray[o.lIIIIIIIlll[0]] = lIIIIIIIlll[7];
        nArray[o.lIIIIIIIlll[5]] = lIIIIIIIlll[10];
        nArray[o.lIIIIIIIlll[11]] = lIIIIIIIlll[14];
        nArray[o.lIIIIIIIlll[6]] = lIIIIIIIlll[15];
        nArray[o.lIIIIIIIlll[16]] = lIIIIIIIlll[17];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIIIIIIIllIIIl = lIIIIIIIlll[1];
        while (o.llIllIllIIIll(lllllllllllllllllIlIIIIIIIllIIIl, ((void)lllllllllllllllllIlIIIIIIIllIIlI).length)) {
            int[] nArray3 = new int[lIIIIIIIlll[0]];
            nArray3[o.lIIIIIIIlll[1]] = lllllllllllllllllIlIIIIIIIllIIlI[lllllllllllllllllIlIIIIIIIllIIIl];
            if (o.llIllIllIIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIIIIIlll[1];
            }
            ++lllllllllllllllllIlIIIIIIIllIIIl;
            0;
            if (-(0x35 ^ 0x30) < 0) continue;
            return ((0x1B ^ 0x78) & ~(0x2A ^ 0x49)) != 0;
        }
        return lIIIIIIIlll[0];
    }

    private static void llIllIllIIIIl() {
        lIIIIIIIlll = new int[113];
        o.lIIIIIIIlll[0] = 1;
        o.lIIIIIIIlll[1] = 3 & (3 ^ -1);
        o.lIIIIIIIlll[2] = 57 + 120 - 25 + 35 ^ 137 + 115 - 188 + 86;
        o.lIIIIIIIlll[3] = 104 + 59 - 25 + 39 ^ 124 + 12 - -45 + 7;
        o.lIIIIIIIlll[4] = -(0xFFFFAD74 & 0x5A9F) & (0xFFFFFBFF & 0x1F9B);
        o.lIIIIIIIlll[5] = 2;
        o.lIIIIIIIlll[6] = 0xA2 ^ 0xA6;
        o.lIIIIIIIlll[7] = -(0xFFFFF7F2 & 0x389F) & (0xFFFFB3FF & 0x7EBF);
        o.lIIIIIIIlll[8] = 0xFFFFB3EE & 0x4FF9;
        o.lIIIIIIIlll[9] = -(0xFFFFF817 & 0x6FE9) & (0xFFFFFAAF & 0x6F7D);
        o.lIIIIIIIlll[10] = -(0xFFFFFC53 & 0x3FED) & (0xFFFFFE6A & 0x3FFF);
        o.lIIIIIIIlll[11] = 3;
        o.lIIIIIIIlll[12] = 0x21 ^ 0x27;
        o.lIIIIIIIlll[13] = 0xFFFF9F5F & 0x7FE7;
        o.lIIIIIIIlll[14] = -(0xFFFFFE83 & 0xFFD) & (0xFFFFFFF7 & 0x3FD9);
        o.lIIIIIIIlll[15] = -(0xFFFFDC17 & 0x67ED) & (0xFFFFC5E7 & 0x7F9D);
        o.lIIIIIIIlll[16] = 0x4B ^ 0x4E;
        o.lIIIIIIIlll[17] = 0xFFFFDD9A & 0x2BE7;
        o.lIIIIIIIlll[18] = 0x62 ^ 0x24 ^ (0x8E ^ 0xC2);
        o.lIIIIIIIlll[19] = -(0xFFFFFDB9 & 0x5E4F) & (0xFFFFDFEF & 0x7FFB);
        o.lIIIIIIIlll[20] = 2 + 94 - 72 + 144 ^ 22 + 19 - -4 + 109;
        o.lIIIIIIIlll[21] = 0x46 ^ 0x5F;
        o.lIIIIIIIlll[22] = 0x81 ^ 0x9C ^ (0x4D ^ 0x57);
        o.lIIIIIIIlll[23] = 19 + 36 - 37 + 122 ^ 11 + 77 - 15 + 59;
        o.lIIIIIIIlll[24] = 0x2C ^ 0x25;
        o.lIIIIIIIlll[25] = 0x76 ^ 0x7D;
        o.lIIIIIIIlll[26] = 0x8D ^ 0x81 ^ (0x3C ^ 0x2B) & ~(0xBB ^ 0xAC);
        o.lIIIIIIIlll[27] = 0x18 ^ 0x30 ^ (0x2C ^ 0xA);
        o.lIIIIIIIlll[28] = 0x3A ^ 0x35;
        o.lIIIIIIIlll[29] = 106 + 91 - 30 + 0 ^ 16 + 105 - 70 + 132;
        o.lIIIIIIIlll[30] = 0x57 ^ 0x46;
        o.lIIIIIIIlll[31] = 0x37 ^ 0x25;
        o.lIIIIIIIlll[32] = 0x1D ^ 0xB ^ (0x48 ^ 0x4D);
        o.lIIIIIIIlll[33] = 0xB7 ^ 0xA3;
        o.lIIIIIIIlll[34] = 0x32 ^ 0x27;
        o.lIIIIIIIlll[35] = 98 + 113 - 184 + 145 ^ 184 + 60 - 206 + 148;
        o.lIIIIIIIlll[36] = 0xA4 ^ 0x84 ^ (0x19 ^ 0x2E);
        o.lIIIIIIIlll[37] = 61 + 99 - 83 + 54 ^ 98 + 18 - 42 + 81;
        o.lIIIIIIIlll[38] = 0x54 ^ 0x4A ^ (0 ^ 0x55);
        o.lIIIIIIIlll[39] = 130 + 86 - 211 + 131 ^ 67 + 8 - -112 + 7;
        o.lIIIIIIIlll[40] = 0x8B ^ 0x8F ^ (0x90 ^ 0x8E);
        o.lIIIIIIIlll[41] = 0x2B ^ 0x30;
        o.lIIIIIIIlll[42] = 0x1F ^ 3;
        o.lIIIIIIIlll[43] = 0xA9 ^ 0x96 ^ (0x41 ^ 0x63);
        o.lIIIIIIIlll[44] = 0x9A ^ 0x84;
        o.lIIIIIIIlll[45] = 0x48 ^ 0x57;
        o.lIIIIIIIlll[46] = 0x58 ^ 0x78;
        o.lIIIIIIIlll[47] = 0xB0 ^ 0x91;
        o.lIIIIIIIlll[48] = 0xBC ^ 0x9E;
        o.lIIIIIIIlll[49] = 42 + 142 - 127 + 129 ^ 71 + 33 - 1 + 50;
        o.lIIIIIIIlll[50] = 0 ^ 0x24;
        o.lIIIIIIIlll[51] = 0xB1 ^ 0x82 ^ (0x21 ^ 0x37);
        o.lIIIIIIIlll[52] = 0xBF ^ 0x99;
        o.lIIIIIIIlll[53] = 0xA3 ^ 0x84;
        o.lIIIIIIIlll[54] = 0x41 ^ 0x5F ^ (0x77 ^ 0x41);
        o.lIIIIIIIlll[55] = 0xB4 ^ 0x9D;
        o.lIIIIIIIlll[56] = 0x19 ^ 0x22 ^ (0x32 ^ 0x23);
        o.lIIIIIIIlll[57] = 0xA5 ^ 0x8E;
        o.lIIIIIIIlll[58] = 119 + 52 - 101 + 90 ^ 37 + 98 - 89 + 94;
        o.lIIIIIIIlll[59] = 0xB7 ^ 0x99;
        o.lIIIIIIIlll[60] = 0x30 ^ 0x1F;
        o.lIIIIIIIlll[61] = 0x70 ^ 0x40;
        o.lIIIIIIIlll[62] = 7 ^ 0x36;
        o.lIIIIIIIlll[63] = 0xA8 ^ 0x82 ^ (0x3E ^ 0x27);
        o.lIIIIIIIlll[64] = 0x1D ^ 0x29;
        o.lIIIIIIIlll[65] = 0x7E ^ 0x19 ^ (0x90 ^ 0xC2);
        o.lIIIIIIIlll[66] = 87 + 87 - 120 + 127 ^ 7 + 34 - -6 + 84;
        o.lIIIIIIIlll[67] = 0x6E ^ 0x2A ^ (0x71 ^ 2);
        o.lIIIIIIIlll[68] = -(0xFFFFEFFF & 0x710E) & (0xFFFFFDFF & 0x6F7D);
        o.lIIIIIIIlll[69] = 0xFFFFDDF7 & 0x2FBB;
        o.lIIIIIIIlll[70] = 2 + (0x7D ^ 0x30) - -(1 ^ 0x45) + 3;
        o.lIIIIIIIlll[71] = 0x17 ^ 0x78 ^ (0xE1 ^ 0xB6);
        o.lIIIIIIIlll[72] = 0x9D ^ 0xA4;
        o.lIIIIIIIlll[73] = 0xFFFF89EA & 0x7F95;
        o.lIIIIIIIlll[74] = -(0xFFFFF579 & 0x7BB7) & (0xFFFFFDFF & 0x7F37);
        o.lIIIIIIIlll[75] = 0x5E ^ 0x31;
        o.lIIIIIIIlll[76] = 0xA3 ^ 0x99;
        o.lIIIIIIIlll[77] = -(0xFFFFF0FF & 0x7F17) & (0xFFFFFFBF & 0x79F7);
        o.lIIIIIIIlll[78] = 0xFFFFADAB & 0x5E55;
        o.lIIIIIIIlll[79] = 0xF9 ^ 0xC2;
        o.lIIIIIIIlll[80] = 0xFFFFAFFC & 0x557B;
        o.lIIIIIIIlll[81] = -(0xFFFFF267 & 0x1D9C) & (0xFFFFBFDF & 0x7EEF);
        o.lIIIIIIIlll[82] = -(0xFFFFD7BE & 0x2A47) & (0xFFFFFFFF & 0x63AD);
        o.lIIIIIIIlll[83] = -(0xFFFFCDB3 & 0x3F7F) & (0xFFFFFFFA & 0x3FFF);
        o.lIIIIIIIlll[84] = -(0xFFFFFA5F & 0x15FC) & (0xFFFFB3FF & 0x5FDF);
        o.lIIIIIIIlll[85] = 0xF0 ^ 0x94;
        o.lIIIIIIIlll[86] = 0x7A ^ 0x46;
        o.lIIIIIIIlll[87] = 0xF0 ^ 0xC2 ^ (3 ^ 0xC);
        o.lIIIIIIIlll[88] = 0x8A ^ 0xB4;
        o.lIIIIIIIlll[89] = 0x61 ^ 0x5E;
        o.lIIIIIIIlll[90] = 0x8A ^ 0x90 ^ (0xF ^ 0x55);
        o.lIIIIIIIlll[91] = 0xFFFFBF47 & 0x4ABF;
        o.lIIIIIIIlll[92] = 0xFFFFEE7E & 0x1DFF;
        o.lIIIIIIIlll[93] = -(0xFFFFD0BB & 0x3FC7) & (0xFFFFBEB3 & 0x5BFE);
        o.lIIIIIIIlll[94] = -(0xFFFFFF2B & 0x33D5) & (0xFFFFFFF7 & 0x3F7D);
        o.lIIIIIIIlll[95] = 0xFFFFAA7D & 0x5FB7;
        o.lIIIIIIIlll[96] = 0xFFFFAFF7 & 0x5C7E;
        o.lIIIIIIIlll[97] = -(0xFFFFDDCF & 0x27F5) & (0xFFFF8FFF & 0x7FFC);
        o.lIIIIIIIlll[98] = 0xFFFFCD7D & 0x3EE7;
        o.lIIIIIIIlll[99] = 0xFFFFAA3F & 0x5FF7;
        o.lIIIIIIIlll[100] = -(0xFFFFB7BA & 0x79DF) & (0xFFFFFDDF & 0x3FFF);
        o.lIIIIIIIlll[101] = 0xFFFFAB5F & 0x5EBA;
        o.lIIIIIIIlll[102] = 0xFFFF8FC6 & 0x7C7D;
        o.lIIIIIIIlll[103] = 0xFFFFCA97 & 0x3F7A;
        o.lIIIIIIIlll[104] = -(0xFFFFFFB9 & 0x50D7) & (0xFFFFFFFE & 0x5CD9);
        o.lIIIIIIIlll[105] = -(0xFFFFF3F1 & 0x3DBF) & (0xFFFFBDF7 & Short.MAX_VALUE);
        o.lIIIIIIIlll[106] = 0xFFFF8BFF & 0x7E3A;
        o.lIIIIIIIlll[107] = -(0xFFFFB1ED & 0x5FB3) & (0xFFFFDFFF & 0x3DFF);
        o.lIIIIIIIlll[108] = 0xFFFFCCDB & 0x3F67;
        o.lIIIIIIIlll[109] = 0xD8 ^ 0xA5 ^ (0x9C ^ 0xA0);
        o.lIIIIIIIlll[110] = 108 + 156 - 200 + 182 ^ 75 + 174 - 134 + 65;
        o.lIIIIIIIlll[111] = 0xAC ^ 0xC5 ^ (0x72 ^ 0x58);
        o.lIIIIIIIlll[112] = 0xF8 ^ 0xBC;
    }

    private static void ae() {
        block35: {
            d lllllllllllllllllIlIIIIIIIlIllIl;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object lllllllllllllllllIlIIIIIIIlIlllI;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIIIIIlll[0]];
                                                                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIIIIIlll[0]];
                                                                nArray2[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIIIIIlll[0]];
                                                                nArray3[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                                                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlll[8])) break block23;
                                                            }
                                                            lllllllllllllllllIlIIIIIIIlIlllI = new d(lIIIIIIIlll[9], lIIIIIIIlll[8], lIIIIIIIlll[18]);
                                                            bu.add((d)lllllllllllllllllIlIIIIIIIlIlllI);
                                                            0;
                                                        }
                                                        int[] nArray = new int[lIIIIIIIlll[0]];
                                                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIIIIIlll[0]];
                                                        nArray4[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIIIIIlll[0]];
                                                        nArray5[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                                        if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray5).getQuantity(), lIIIIIIIlll[8])) break block25;
                                                    }
                                                    lllllllllllllllllIlIIIIIIIlIlllI = new d(lIIIIIIIlll[7], lIIIIIIIlll[8], lIIIIIIIlll[18]);
                                                    bu.add((d)lllllllllllllllllIlIIIIIIIlIlllI);
                                                    0;
                                                }
                                                int[] nArray = new int[lIIIIIIIlll[0]];
                                                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIIIIIlll[0]];
                                                nArray6[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIIIIIlll[0]];
                                                nArray7[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray7).getQuantity(), lIIIIIIIlll[8])) break block27;
                                            }
                                            lllllllllllllllllIlIIIIIIIlIlllI = new d(lIIIIIIIlll[10], lIIIIIIIlll[8], lIIIIIIIlll[18]);
                                            bu.add((d)lllllllllllllllllIlIIIIIIIlIlllI);
                                            0;
                                        }
                                        int[] nArray = new int[lIIIIIIIlll[0]];
                                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIIIIIlll[0]];
                                        nArray8[o.lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIIIIIlll[0]];
                                        nArray9[o.lIIIIIIIlll[1]] = lIIIIIIIlll[15];
                                        if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray9).getQuantity(), lIIIIIIIlll[28])) break block29;
                                    }
                                    lllllllllllllllllIlIIIIIIIlIlllI = new d(lIIIIIIIlll[15], lIIIIIIIlll[33], lIIIIIIIlll[80]);
                                    bu.add((d)lllllllllllllllllIlIIIIIIIlIlllI);
                                    0;
                                }
                                if (o.llIllIllIIlII(Bank.contains((Predicate)(lllllllllllllllllIlIIIIIIIlIlllI = item -> item.getName().toLowerCase().contains(lIIIIIIIlIl[lIIIIIIIlll[87]]))) ? 1 : 0)) {
                                    lllllllllllllllllIlIIIIIIIlIllIl = new d(lIIIIIIIlll[81], lIIIIIIIlll[16], lIIIIIIIlll[82]);
                                    bu.add(lllllllllllllllllIlIIIIIIIlIllIl);
                                    0;
                                }
                                int[] nArray = new int[lIIIIIIIlll[0]];
                                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIIIIIlll[0]];
                                nArray10[o.lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIIIIIlll[0]];
                                nArray11[o.lIIIIIIIlll[1]] = lIIIIIIIlll[14];
                                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray11).getQuantity(), lIIIIIIIlll[6])) break block31;
                            }
                            lllllllllllllllllIlIIIIIIIlIllIl = new d(lIIIIIIIlll[14], lIIIIIIIlll[6], i.bp);
                            bu.add(lllllllllllllllllIlIIIIIIIlIllIl);
                            0;
                        }
                        int[] nArray = new int[lIIIIIIIlll[0]];
                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIIIIIlll[0]];
                        nArray12[o.lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIIIIIlll[0]];
                        nArray13[o.lIIIIIIIlll[1]] = lIIIIIIIlll[17];
                        if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray13).getQuantity(), lIIIIIIIlll[5])) break block33;
                    }
                    lllllllllllllllllIlIIIIIIIlIllIl = new d(lIIIIIIIlll[17], lIIIIIIIlll[11], lIIIIIIIlll[83]);
                    bu.add(lllllllllllllllllIlIIIIIIIlIllIl);
                    0;
                }
                int[] nArray = new int[lIIIIIIIlll[0]];
                nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIIIIIlll[0]];
                nArray14[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (!o.llIllIllIIIlI(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIIIIIlll[0]];
                nArray15[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray15).getQuantity(), lIIIIIIIlll[28])) break block35;
            }
            lllllllllllllllllIlIIIIIIIlIllIl = new d(lIIIIIIIlll[13], lIIIIIIIlll[54], lIIIIIIIlll[84]);
            bu.add(lllllllllllllllllIlIIIIIIIlIllIl);
            0;
        }
    }

    private static boolean llIllIllIIlll(int n2) {
        return n2 > 0;
    }

    private static String llIllIlIlIIIl(String lllllllllllllllllIlIIIIIIIlIIIIl, String lllllllllllllllllIlIIIIIIIIllllI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIIIIIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIIIIIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIIIIIIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIIIIIIlIIIll.init(lIIIIIIIlll[5], lllllllllllllllllIlIIIIIIIlIIlII);
            return new String(lllllllllllllllllIlIIIIIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIIIIIIlIIIlI) {
            lllllllllllllllllIlIIIIIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    public static void aD() {
        block77: {
            block83: {
                block85: {
                    block84: {
                        BankLocation lllllllllllllllllIlIIIIIIIllIlll;
                        block78: {
                            block82: {
                                block80: {
                                    block81: {
                                        block79: {
                                            if (o.llIllIllIIIlI(bs ? 1 : 0)) {
                                                b.a(bu);
                                                if (o.llIllIllIIIll(bu.size(), lIIIIIIIlll[0])) {
                                                    System.out.println(lIIIIIIIlIl[lIIIIIIIlll[1]]);
                                                    bs = lIIIIIIIlll[1];
                                                }
                                            }
                                            if (!o.llIllIllIIlII(bs ? 1 : 0)) break block77;
                                            if (o.llIllIllIIIll(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIlll[2])) {
                                                aa.eA();
                                            }
                                            if (o.llIllIllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIlll[2]) && o.llIllIllIIIll(Skills.getLevel((Skill)Skill.MAGIC), lIIIIIIIlll[3])) {
                                                k.X();
                                            }
                                            if (!o.llIllIllIIlII(o.aa() ? 1 : 0) || !o.llIllIllIIIll(e.j(cw), lIIIIIIIlll[0]) || !o.llIllIllIIlIl(Skills.getLevel((Skill)Skill.PRAYER), lIIIIIIIlll[2]) || !o.llIllIllIIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIIIIIlll[3])) break block78;
                                            lllllllllllllllllIlIIIIIIIllIlll = BankLocation.getNearest();
                                            if (o.llIllIllIIllI(lllllllllllllllllIlIIIIIIIllIlll) && o.llIllIllIIlII(lllllllllllllllllIlIIIIIIIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[0]];
                                                a.a(lllllllllllllllllIlIIIIIIIllIlll);
                                            }
                                            if (!o.llIllIllIIllI(lllllllllllllllllIlIIIIIIIllIlll) || !o.llIllIllIIIlI(lllllllllllllllllIlIIIIIIIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block78;
                                            if (o.llIllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIIIIIlll[4]);
                                                0;
                                            }
                                            if (!o.llIllIllIIIlI(Bank.isOpen() ? 1 : 0)) break block78;
                                            AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[5]];
                                            if (o.llIllIllIIlll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIIIIIlll[6]);
                                                0;
                                            }
                                            if (o.llIllIllIIlll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIIIIIlll[5]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIIIIIIlll[0]];
                                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                            if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                            int[] nArray2 = new int[lIIIIIIIlll[0]];
                                            nArray2[o.lIIIIIIIlll[1]] = lIIIIIIIlll[7];
                                            if (!o.llIllIllIIlIl(Bank.getFirst((int[])nArray2).getQuantity(), lIIIIIIIlll[8])) break block80;
                                        }
                                        int[] nArray = new int[lIIIIIIIlll[0]];
                                        nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                        if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                        int[] nArray3 = new int[lIIIIIIIlll[0]];
                                        nArray3[o.lIIIIIIIlll[1]] = lIIIIIIIlll[9];
                                        if (!o.llIllIllIIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lIIIIIIIlll[8])) break block80;
                                    }
                                    int[] nArray = new int[lIIIIIIIlll[0]];
                                    nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                    if (!o.llIllIllIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                    int[] nArray4 = new int[lIIIIIIIlll[0]];
                                    nArray4[o.lIIIIIIIlll[1]] = lIIIIIIIlll[10];
                                    if (!o.llIllIllIIIll(Bank.getFirst((int[])nArray4).getQuantity(), lIIIIIIIlll[8])) break block82;
                                }
                                o.ae();
                                System.out.println(lIIIIIIIlIl[lIIIIIIIlll[11]]);
                                bs = lIIIIIIIlll[0];
                                return;
                            }
                            int[] nArray = new int[lIIIIIIIlll[12]];
                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            nArray[o.lIIIIIIIlll[0]] = lIIIIIIIlll[7];
                            nArray[o.lIIIIIIIlll[5]] = lIIIIIIIlll[10];
                            nArray[o.lIIIIIIIlll[11]] = lIIIIIIIlll[14];
                            nArray[o.lIIIIIIIlll[6]] = lIIIIIIIlll[15];
                            nArray[o.lIIIIIIIlll[16]] = lIIIIIIIlll[17];
                            if (o.llIllIllIIlII(e.b(nArray) ? 1 : 0)) {
                                o.ae();
                                System.out.println(lIIIIIIIlIl[lIIIIIIIlll[6]]);
                                bs = lIIIIIIIlll[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIIIIIlll[12]];
                            nArray5[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            nArray5[o.lIIIIIIIlll[0]] = lIIIIIIIlll[7];
                            nArray5[o.lIIIIIIIlll[5]] = lIIIIIIIlll[10];
                            nArray5[o.lIIIIIIIlll[11]] = lIIIIIIIlll[14];
                            nArray5[o.lIIIIIIIlll[6]] = lIIIIIIIlll[15];
                            nArray5[o.lIIIIIIIlll[16]] = lIIIIIIIlll[17];
                            if (o.llIllIllIIIlI(e.b(nArray5) ? 1 : 0)) {
                                while (o.llIllIllIIlII(t.bl() ? 1 : 0)) {
                                    t.bj();
                                    Time.sleepTicks((int)lIIIIIIIlll[0]);
                                    0;
                                    0;
                                    if (null == null) continue;
                                    return;
                                }
                                if (o.llIllIllIIlII(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIIIIIlll[12]);
                                    0;
                                }
                                a.a(lIIIIIIIlll[13], lIIIIIIIlll[18]);
                                a.a(lIIIIIIIlll[14], lIIIIIIIlll[11]);
                                a.a(lIIIIIIIlll[7], lIIIIIIIlll[8]);
                                a.a(lIIIIIIIlll[10], lIIIIIIIlll[8]);
                                a.a(lIIIIIIIlll[17], lIIIIIIIlll[11]);
                                a.a(lIIIIIIIlll[15], lIIIIIIIlll[18]);
                                a.a(lIIIIIIIlll[19], lIIIIIIIlll[4]);
                            }
                        }
                        if (o.llIllIllIIIlI(Inventory.contains((int[])f.aU) ? 1 : 0) && o.llIllIllIIIll(Movement.getRunEnergy(), lIIIIIIIlll[20])) {
                            Inventory.getFirst((int[])f.aU).interact(lIIIIIIIlIl[lIIIIIIIlll[16]]);
                            Time.sleepTicks((int)lIIIIIIIlll[0]);
                            0;
                        }
                        if (o.llIllIllIIIll(Prayers.getPoints(), lIIIIIIIlll[21]) && o.llIllIllIIIlI(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aR).interact(lIIIIIIIlIl[lIIIIIIIlll[12]]);
                        }
                        if (o.llIllIllIIIlI(o.aa() ? 1 : 0) && o.llIllIllIIlII(e.j(cw))) {
                            if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[22]];
                                if (o.llIllIllIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cn);
                                0;
                                Time.sleepTicks((int)lIIIIIIIlll[0]);
                                0;
                            }
                            if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                                g.a(lIIIIIIIlIl[lIIIIIIIlll[23]], bQ);
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[0])) {
                            if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(co), lIIIIIIIlll[6]) && o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cp), lIIIIIIIlll[6])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[24]];
                                Movement.walkTo((WorldPoint)co);
                                0;
                                Time.sleepTicks((int)lIIIIIIIlll[0]);
                                0;
                            }
                            if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(co), lIIIIIIIlll[12])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[18]];
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[25]];
                                String[] stringArray2 = new String[lIIIIIIIlll[0]];
                                stringArray2[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[26]];
                                if (o.llIllIllIIIlI(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIIIIIlll[0]];
                                    stringArray3[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[3]];
                                    if (o.llIllIllIIlII(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIIIIIlll[0]];
                                        stringArray4[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIIIIIlIl[lIIIIIIIlll[28]]);
                                        Time.sleepTicks((int)lIIIIIIIlll[6]);
                                        0;
                                    }
                                }
                                String[] stringArray5 = new String[lIIIIIIIlll[0]];
                                stringArray5[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[29]];
                                if (o.llIllIllIIIlI(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIIIIIlll[0]];
                                    stringArray6[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[30]];
                                    String[] stringArray7 = new String[lIIIIIIIlll[0]];
                                    stringArray7[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[31]];
                                    if (o.llIllIllIIIlI(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIIIIIlll[0]];
                                        stringArray8[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIIIIIlIl[lIIIIIIIlll[33]]);
                                        Time.sleepTicks((int)lIIIIIIIlll[5]);
                                        0;
                                    }
                                    String[] stringArray9 = new String[lIIIIIIIlll[0]];
                                    stringArray9[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[34]];
                                    String[] stringArray10 = new String[lIIIIIIIlll[0]];
                                    stringArray10[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[35]];
                                    if (o.llIllIllIIIlI(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIIIIIlll[0]];
                                        stringArray11[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIIIIIlIl[lIIIIIIIlll[37]]);
                                        Time.sleepTicks((int)lIIIIIIIlll[5]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[5])) {
                            int[] nArray = new int[lIIIIIIIlll[0]];
                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[38];
                            if (o.llIllIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIIIIIlll[0]];
                                nArray6[o.lIIIIIIIlll[1]] = lIIIIIIIlll[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIIIIIlIl[lIIIIIIIlll[21]]);
                            }
                            int[] nArray7 = new int[lIIIIIIIlll[0]];
                            nArray7[o.lIIIIIIIlll[1]] = lIIIIIIIlll[39];
                            if (o.llIllIllIIIlI(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIIIIIlll[0]];
                                nArray8[o.lIIIIIIIlll[1]] = lIIIIIIIlll[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIIIIIlIl[lIIIIIIIlll[40]]);
                            }
                            if (o.llIllIllIIlII(cx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cq), lIIIIIIIlll[6])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[41]];
                                    Movement.walkTo((WorldPoint)cq);
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIlll[0]);
                                    0;
                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cq), lIIIIIIIlll[6]) && o.llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0) && o.llIllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIIIIIlll[0]];
                                    stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIlIl[lIIIIIIIlll[43]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);
                                    0;
                                }
                            }
                            if (o.llIllIllIIIlI(cx.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[6])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[44]];
                                    Movement.walkTo((WorldPoint)cr);
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIlll[0]);
                                    0;
                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[6]) && o.llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[45]], bQ);
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[11])) {
                            String[] stringArray = new String[lIIIIIIIlll[0]];
                            stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[46]];
                            if (o.llIllIllIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIIIIIlll[16])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[47]];
                                    Movement.walkTo((WorldPoint)cu);
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIlll[0]);
                                    0;
                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cu), lIIIIIIIlll[16])) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[48]], bQ);
                                }
                            }
                            String[] stringArray12 = new String[lIIIIIIIlll[0]];
                            stringArray12[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[49]];
                            if (o.llIllIllIIIlI(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[50]];
                                if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[16])) {
                                    AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[51]];
                                    Movement.walkTo((WorldPoint)cr);
                                    0;
                                    Time.sleepTicks((int)lIIIIIIIlll[0]);
                                    0;
                                }
                                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[16])) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[52]], bQ);
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[16])) {
                            if (o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cv), lIIIIIIIlll[11])) {
                                AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[53]];
                                Movement.walkTo((WorldPoint)cv);
                                0;
                                Time.sleepTicks((int)lIIIIIIIlll[0]);
                                0;
                            }
                            if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cv), lIIIIIIIlll[11]) && o.llIllIllIIlII(Players.getLocal().isMoving() ? 1 : 0) && o.llIllIllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (o.llIllIllIIIlI(tileObject.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[90]]) ? 1 : 0) && o.llIllIllIlIIl(tileObject.getWorldLocation().distanceTo(cv), lIIIIIIIlll[11])) {
                                        n2 = lIIIIIIIlll[0];
                                        0;
                                        if (null != null) {
                                            return ((0x63 ^ 0x7C) & ~(0xDE ^ 0xC1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIIIIIIlll[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIIIIIlll[5]);
                                0;
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[12])) {
                            if (o.llIllIllIIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (o.llIllIllIIlII(k.ac() ? 1 : 0)) {
                                k.ad();
                            }
                            if (o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[55]];
                                if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIIIIIlll[0]];
                                    stringArray13[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIIIIIlIl[lIIIIIIIlll[57]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);
                                    0;
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[23]) && o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                            g.a(lIIIIIIIlIl[lIIIIIIIlll[58]], bQ);
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[24])) {
                            if (o.llIllIllIIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (o.llIllIllIIlII(k.ac() ? 1 : 0)) {
                                k.ad();
                            }
                            String[] stringArray = new String[lIIIIIIIlll[0]];
                            stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[2]];
                            if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIIIIIlll[0]];
                                stringArray14[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[59]];
                                if (o.llIllIllIlIIl(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIlll[16])) {
                                    g.a(lIIIIIIIlIl[lIIIIIIIlll[60]], bQ);
                                }
                            }
                            if (o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIIIIIlll[0]];
                                stringArray15[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[61]];
                                if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIIIIIlll[0]];
                                    stringArray16[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIIIIIlIl[lIIIIIIIlll[20]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);
                                    0;
                                }
                            }
                        }
                        if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[18])) {
                            if (o.llIllIllIIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (o.llIllIllIIlII(k.ac() ? 1 : 0)) {
                                k.ad();
                            }
                            if (o.llIllIllIlIll(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIIIIIlll[0]];
                                stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[63]];
                                if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIIIIIlll[0]];
                                    stringArray17[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIIIIIlIl[lIIIIIIIlll[65]]);
                                    Time.sleepTicks((int)lIIIIIIIlll[5]);
                                    0;
                                }
                            }
                        }
                        if (o.llIllIllIllII(e.j(cw), lIIIIIIIlll[25]) && !o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[26])) break block83;
                        String[] stringArray = new String[lIIIIIIIlll[0]];
                        stringArray[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[66]];
                        if (o.llIllIllIIllI(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIIIIIlll[0]];
                            nArray[o.lIIIIIIIlll[1]] = lIIIIIIIlll[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIIIIIlIl[lIIIIIIIlll[67]]);
                            Time.sleepTicks((int)lIIIIIIIlll[16]);
                            0;
                        }
                        lllllllllllllllllIlIIIIIIIllIlll = new WorldPoint(lIIIIIIIlll[68], lIIIIIIIlll[69], lIIIIIIIlll[1]);
                        if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(b.I), lIIIIIIIlll[70]) && o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIIIIIIIllIlll), lIIIIIIIlll[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIIlIl[lIIIIIIIlll[71]];
                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIIIIIIIllIlll);
                            0;
                            Time.sleepTicks((int)lIIIIIIIlll[0]);
                            0;
                        }
                        if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIIIIIIIllIlll), lIIIIIIIlll[6]) && !o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cr), lIIIIIIIlll[54])) break block84;
                        if (!o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) break block85;
                        String[] stringArray18 = new String[lIIIIIIIlll[0]];
                        stringArray18[o.lIIIIIIIlll[1]] = lIIIIIIIlIl[lIIIIIIIlll[72]];
                        if (!o.llIllIllIlIll(NPCs.getNearest((String[])stringArray18)) || !o.llIllIllIlIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIIIIIIIllIlll), lIIIIIIIlll[70])) break block85;
                    }
                    WorldArea lllllllllllllllllIlIIIIIIIllIllI = new WorldArea(lIIIIIIIlll[73], lIIIIIIIlll[74], lIIIIIIIlll[43], lIIIIIIIlll[37], lIIIIIIIlll[1]);
                    if (o.llIllIllIIIll(e.j(lIIIIIIIlll[75]), lIIIIIIIlll[24]) && o.llIllIllIIIlI(Equipment.contains(item -> item.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIIIIIlIl[lIIIIIIIlll[88]])).interact(lIIIIIIIlIl[lIIIIIIIlll[76]]);
                        Time.sleepTicks((int)lIIIIIIIlll[12]);
                        0;
                    }
                    if (o.llIllIllIIIlI(lllllllllllllllllIlIIIIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lllllllllllllllllIlIIIIIIIllIlIl = new WorldPoint(lIIIIIIIlll[77], lIIIIIIIlll[78], lIIIIIIIlll[1]);
                        Movement.walkTo((WorldPoint)lllllllllllllllllIlIIIIIIIllIlIl);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlll[0]);
                        0;
                    }
                    if (o.llIllIllIIlII(lllllllllllllllllIlIIIIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cn);
                        0;
                        Time.sleepTicks((int)lIIIIIIIlll[0]);
                        0;
                    }
                }
                if (o.llIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo(cn), lIIIIIIIlll[16])) {
                    g.a(lIIIIIIIlIl[lIIIIIIIlll[79]], bQ);
                }
            }
            if (o.llIllIllIIlll(e.j(cw)) && o.llIllIllIIIll(e.j(cw), lIIIIIIIlll[27])) {
                cl = lIIIIIIIlll[0];
                ck = lIIIIIIIlll[1];
            }
            if (o.llIllIllIlIlI(e.j(cw), lIIIIIIIlll[27]) && o.llIllIllIIIll(ck, lIIIIIIIlll[0]) && o.llIllIllIIIlI(cl ? 1 : 0)) {
                ac.kg += lIIIIIIIlll[0];
                ac.d(AccBuilderTempleTrek.m);
                ck += lIIIIIIIlll[0];
                ac.kg = lIIIIIIIlll[1];
                cl = lIIIIIIIlll[1];
            }
            g.a(bQ);
        }
    }

    private static boolean llIllIllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIllIllIIIII() {
        lIIIIIIIlIl = new String[lIIIIIIIlll[112]];
        o.lIIIIIIIlIl[o.lIIIIIIIlll[1]] = o."Finished buying items, switching back to quest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[0]] = o."Nav to bank";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[5]] = o."Handling banking";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[11]] = o."We are missing runes, switching to BUYING";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[6]] = o."We are missing quest supplies, switching to BUYING";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[16]] = o."Drink";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[12]] = o."Drink";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[22]] = o."Nav to start";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[23]] = o."Lady Servil";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[24]] = o."Nav to armour";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[18]] = o."Getting armour";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[25]] = o."Door";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[26]] = o."Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[3]] = o."Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[27]] = o."Door";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[28]] = o."Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[29]] = o."Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[30]] = o."Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[31]] = o."Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[32]] = o."Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[33]] = o."Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[34]] = o."Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[35]] = o."Search";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[36]] = o."Chest";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[37]] = o."Search";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[21]] = o."Wear";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[40]] = o."Wear";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[41]] = o."Nav to jail";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[42]] = o."Door";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[43]] = o."Open";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[44]] = o."Nav to guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[45]] = o."Head Guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[46]] = o."Khali brew";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[47]] = o."Nav to brew";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[48]] = o."Khazard Barman";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[49]] = o."Khali brew";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[50]] = o."Nav to guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[51]] = o."Nav to guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[52]] = o."Head Guard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[53]] = o."Nav to  sammy";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[54]] = o."Khazard cell keys";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[55]] = o."Khazard Ogre";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[56]] = o."Khazard Ogre";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[57]] = o."Attack";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[58]] = o."Sammy Servil";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[2]] = o."Hengrad";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[59]] = o."Hengrad";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[60]] = o."Hengrad";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[61]] = o."Khazard Scorpion";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[62]] = o."Khazard Scorpion";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[20]] = o."Attack";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[63]] = o."Bouncer";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[64]] = o."Bouncer";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[65]] = o."Attack";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[66]] = o."General Khazard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[67]] = o."Break";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[71]] = o."Nav to start";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[72]] = o."General Khazard";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[76]] = o."Castle Wars";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[79]] = o."Lady Servil";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[86]] = o."Fight Arena";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[87]] = o."ring of wealth (";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[88]] = o."dueling";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[89]] = o."dueling";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[90]] = o."Prison Gate";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[109]] = o."Can I help you?";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[110]] = o."I'd like a Khali Brew please.";
        o.lIIIIIIIlIl[o.lIIIIIIIlll[111]] = o."Yes.";
    }

    @Override
    public boolean V() {
        boolean bl;
        if (!o.llIllIllIllIl(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || o.llIllIllIIlIl(e.j(cw), lIIIIIIIlll[27])) {
            bl = lIIIIIIIlll[0];
            0;
            if (-2 > 0) {
                return ((0x37 ^ 0x6A ^ (0x48 ^ 0x41)) & (0x28 ^ 0x5C ^ (0xB9 ^ 0x99) ^ -1)) != 0;
            }
        } else {
            bl = lIIIIIIIlll[1];
        }
        return bl;
    }
}

