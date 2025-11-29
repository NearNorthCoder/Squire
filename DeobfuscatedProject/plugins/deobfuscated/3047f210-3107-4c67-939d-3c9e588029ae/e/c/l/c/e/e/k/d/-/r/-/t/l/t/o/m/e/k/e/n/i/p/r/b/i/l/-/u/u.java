/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
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
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.v;
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
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class u
implements S {
    public static final /* synthetic */ WorldPoint dE;
    public static final /* synthetic */ WorldPoint dv;
    public static /* synthetic */ boolean bs;
    public static /* synthetic */ String[] bQ;
    public static final /* synthetic */ WorldPoint dB;
    static /* synthetic */ boolean cl;
    public static final /* synthetic */ WorldPoint dy;
    private static /* synthetic */ int[] lllllIlIll;
    public static final /* synthetic */ WorldPoint dC;
    static /* synthetic */ WorldArea dG;
    public static final /* synthetic */ WorldPoint dD;
    public static final /* synthetic */ WorldPoint dA;
    static /* synthetic */ int dF;
    public static /* synthetic */ List<d> bu;
    public static final /* synthetic */ WorldPoint dz;
    static /* synthetic */ WorldArea dH;
    public static final /* synthetic */ WorldPoint dw;
    private static /* synthetic */ String[] lllllIlIII;
    public static final /* synthetic */ WorldPoint dx;
    static /* synthetic */ int ck;

    private static boolean llIlIlIIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIlIIllIII(Object object) {
        return object != null;
    }

    private static boolean llIlIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIlIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlIlIIlIIIl() {
        lllllIlIII = new String[lllllIlIll[140]];
        u.lllllIlIII[u.lllllIlIll[1]] = u."Finished buying items, switching back to quest";
        u.lllllIlIII[u.lllllIlIll[0]] = u."Drop";
        u.lllllIlIII[u.lllllIlIll[3]] = u."Nav to bank";
        u.lllllIlIII[u.lllllIlIll[5]] = u."Handling banking";
        u.lllllIlIII[u.lllllIlIll[6]] = u."We are missing runes, switching to BUYING";
        u.lllllIlIII[u.lllllIlIll[15]] = u."We are missing quest supplies, switching to BUYING";
        u.lllllIlIII[u.lllllIlIll[12]] = u."Drink";
        u.lllllIlIII[u.lllllIlIll[16]] = u."Eat";
        u.lllllIlIII[u.lllllIlIll[19]] = u."King Bolren";
        u.lllllIlIII[u.lllllIlIll[25]] = u."Nav to commander";
        u.lllllIlIII[u.lllllIlIll[20]] = u."Commander Montai";
        u.lllllIlIII[u.lllllIlIll[27]] = u."Nav to tracker";
        u.lllllIlIII[u.lllllIlIll[28]] = u."Door";
        u.lllllIlIII[u.lllllIlIll[23]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[29]] = u."Door";
        u.lllllIlIII[u.lllllIlIll[30]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[31]] = u."Door";
        u.lllllIlIII[u.lllllIlIll[32]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[33]] = u."Tracker gnome 2";
        u.lllllIlIII[u.lllllIlIll[35]] = u."Nav to tracker";
        u.lllllIlIII[u.lllllIlIll[36]] = u."Tracker gnome 1";
        u.lllllIlIII[u.lllllIlIll[38]] = u."Nav to tracker";
        u.lllllIlIII[u.lllllIlIll[39]] = u."Tracker gnome 3";
        u.lllllIlIII[u.lllllIlIll[40]] = u."Nav to ballista";
        u.lllllIlIII[u.lllllIlIll[41]] = u."Firing";
        u.lllllIlIII[u.lllllIlIll[42]] = u."Ballista";
        u.lllllIlIII[u.lllllIlIll[43]] = u."Fire";
        u.lllllIlIII[u.lllllIlIll[45]] = u."0001";
        u.lllllIlIII[u.lllllIlIll[46]] = u."0002";
        u.lllllIlIII[u.lllllIlIll[47]] = u."0003";
        u.lllllIlIII[u.lllllIlIll[48]] = u."0004";
        u.lllllIlIII[u.lllllIlIll[55]] = u."Nav to crumble";
        u.lllllIlIII[u.lllllIlIll[56]] = u."Crumbled wall";
        u.lllllIlIII[u.lllllIlIll[57]] = u."Climb-over";
        u.lllllIlIII[u.lllllIlIll[60]] = u."Door";
        u.lllllIlIII[u.lllllIlIll[61]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[62]] = u."Door";
        u.lllllIlIII[u.lllllIlIll[63]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[64]] = u."Door";
        u.lllllIlIII[u.lllllIlIll[65]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[66]] = u."Ladder";
        u.lllllIlIII[u.lllllIlIll[67]] = u."Climb-up";
        u.lllllIlIII[u.lllllIlIll[68]] = u."Ladder";
        u.lllllIlIII[u.lllllIlIll[69]] = u."Climb-up";
        u.lllllIlIII[u.lllllIlIll[70]] = u."Grab orb";
        u.lllllIlIII[u.lllllIlIll[2]] = u."Closed chest";
        u.lllllIlIII[u.lllllIlIll[71]] = u."Closed chest";
        u.lllllIlIII[u.lllllIlIll[72]] = u."Open";
        u.lllllIlIII[u.lllllIlIll[73]] = u."Open chest";
        u.lllllIlIII[u.lllllIlIll[74]] = u."Open chest";
        u.lllllIlIII[u.lllllIlIll[24]] = u."Search";
        u.lllllIlIII[u.lllllIlIll[75]] = u."King Bolren";
        u.lllllIlIII[u.lllllIlIll[76]] = u."Travel to final fight";
        u.lllllIlIII[u.lllllIlIll[77]] = u."Khazard warlord";
        u.lllllIlIII[u.lllllIlIll[78]] = u."Attack";
        u.lllllIlIII[u.lllllIlIll[79]] = u."Khazard warlord";
        u.lllllIlIII[u.lllllIlIll[80]] = u."Attack";
        u.lllllIlIII[u.lllllIlIll[81]] = u."Handle fight";
        u.lllllIlIII[u.lllllIlIll[82]] = u."Drink";
        u.lllllIlIII[u.lllllIlIll[83]] = u."Orbs of protection";
        u.lllllIlIII[u.lllllIlIll[84]] = u."Taking orbs";
        u.lllllIlIII[u.lllllIlIll[85]] = u."Orbs of protection";
        u.lllllIlIII[u.lllllIlIll[86]] = u."Take";
        u.lllllIlIII[u.lllllIlIll[87]] = u."Orbs of protection";
        u.lllllIlIII[u.lllllIlIll[88]] = u."King Bolren";
        u.lllllIlIII[u.lllllIlIll[89]] = u."Nav to start";
        u.lllllIlIII[u.lllllIlIll[100]] = u."Castle Wars";
        u.lllllIlIII[u.lllllIlIll[101]] = u."Loose Railing";
        u.lllllIlIII[u.lllllIlIll[102]] = u."Squeeze-through";
        u.lllllIlIII[u.lllllIlIll[109]] = u."Tree Gnome Village";
        u.lllllIlIII[u.lllllIlIll[110]] = u."ring of wealth (";
        u.lllllIlIII[u.lllllIlIll[111]] = u."trooper";
        u.lllllIlIII[u.lllllIlIll[130]] = u."Can I help at all?";
        u.lllllIlIII[u.lllllIlIll[131]] = u."I would be glad to help.";
        u.lllllIlIII[u.lllllIlIll[132]] = u."Ok, I'll gather some wood.";
        u.lllllIlIII[u.lllllIlIll[133]] = u."I'll try my best.";
        u.lllllIlIII[u.lllllIlIll[134]] = u."I will find the warlord and bring back the orbs.";
        u.lllllIlIII[u.lllllIlIll[135]] = u."Yes.";
    }

    static {
        u.llIlIlIIlIIlI();
        u.llIlIlIIlIIIl();
        dv = new WorldPoint(lllllIlIll[112], lllllIlIll[113], lllllIlIll[1]);
        dw = new WorldPoint(lllllIlIll[114], lllllIlIll[115], lllllIlIll[1]);
        dx = new WorldPoint(lllllIlIll[116], lllllIlIll[117], lllllIlIll[1]);
        dy = new WorldPoint(lllllIlIll[118], lllllIlIll[119], lllllIlIll[1]);
        dz = new WorldPoint(lllllIlIll[120], lllllIlIll[121], lllllIlIll[1]);
        dA = new WorldPoint(lllllIlIll[122], lllllIlIll[123], lllllIlIll[1]);
        dB = new WorldPoint(lllllIlIll[124], lllllIlIll[125], lllllIlIll[1]);
        dC = new WorldPoint(lllllIlIll[124], lllllIlIll[126], lllllIlIll[1]);
        dD = new WorldPoint(lllllIlIll[127], lllllIlIll[54], lllllIlIll[1]);
        dE = new WorldPoint(lllllIlIll[128], lllllIlIll[129], lllllIlIll[1]);
        bu = new ArrayList<d>();
        String[] stringArray = new String[lllllIlIll[12]];
        stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[130]];
        stringArray[u.lllllIlIll[0]] = lllllIlIII[lllllIlIll[131]];
        stringArray[u.lllllIlIll[3]] = lllllIlIII[lllllIlIll[132]];
        stringArray[u.lllllIlIll[5]] = lllllIlIII[lllllIlIll[133]];
        stringArray[u.lllllIlIll[6]] = lllllIlIII[lllllIlIll[134]];
        stringArray[u.lllllIlIll[15]] = lllllIlIII[lllllIlIll[135]];
        bQ = stringArray;
        dF = lllllIlIll[136];
        dG = new WorldArea(lllllIlIll[137], lllllIlIll[113], lllllIlIll[20], lllllIlIll[12], lllllIlIll[1]);
        dH = new WorldArea(lllllIlIll[138], lllllIlIll[139], lllllIlIll[48], lllllIlIll[30], lllllIlIll[1]);
    }

    @Override
    public boolean V() {
        boolean bl;
        if (u.llIlIlIIlIlll(e.j(dF), lllllIlIll[25])) {
            bl = lllllIlIll[0];
            0;
            if (null != null) {
                return ((0xE3 ^ 0xA2) & ~(0 ^ 0x41)) != 0;
            }
        } else {
            bl = lllllIlIll[1];
        }
        return bl;
    }

    @Override
    public int T() {
        try {
            u.bt();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (null != null) {
            return (124 + 128 - 76 + 20 ^ 36 + 134 - 167 + 152) & (0xF0 ^ 0xC4 ^ (0x4A ^ 0x21) ^ -1);
        }
        return lllllIlIll[108];
    }

    private static boolean llIlIlIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIlIIlllllIl(String lllllllllllllllllIlIIlIIllIIlIlI, String lllllllllllllllllIlIIlIIllIIIlII) {
        lllllllllllllllllIlIIlIIllIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIlIIllIIlIII = new StringBuilder();
        char[] lllllllllllllllllIlIIlIIllIIIlll = lllllllllllllllllIlIIlIIllIIIlII.toCharArray();
        int lllllllllllllllllIlIIlIIllIIIllI = lllllIlIll[1];
        char[] lllllllllllllllllIlIIlIIllIIIIII = lllllllllllllllllIlIIlIIllIIlIlI.toCharArray();
        int lllllllllllllllllIlIIlIIlIllllll = lllllllllllllllllIlIIlIIllIIIIII.length;
        int lllllllllllllllllIlIIlIIlIlllllI = lllllIlIll[1];
        while (u.llIlIlIIlIlIl(lllllllllllllllllIlIIlIIlIlllllI, lllllllllllllllllIlIIlIIlIllllll)) {
            char lllllllllllllllllIlIIlIIllIIlIll = lllllllllllllllllIlIIlIIllIIIIII[lllllllllllllllllIlIIlIIlIlllllI];
            lllllllllllllllllIlIIlIIllIIlIII.append((char)(lllllllllllllllllIlIIlIIllIIlIll ^ lllllllllllllllllIlIIlIIllIIIlll[lllllllllllllllllIlIIlIIllIIIllI % lllllllllllllllllIlIIlIIllIIIlll.length]));
            0;
            ++lllllllllllllllllIlIIlIIllIIIllI;
            ++lllllllllllllllllIlIIlIIlIlllllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIIlIIllIIlIII);
    }

    @Override
    public boolean S() {
        return lllllIlIll[1];
    }

    private static boolean llIlIlIIllIlI(int n2) {
        return n2 < 0;
    }

    private static void llIlIlIIlIIlI() {
        lllllIlIll = new int[141];
        u.lllllIlIll[0] = 1;
        u.lllllIlIll[1] = (0x4B ^ 2 ^ 1) & (0x43 ^ 0x6B ^ (1 ^ 0x61) ^ -1);
        u.lllllIlIll[2] = 0x45 ^ 0x71 ^ (0x37 ^ 0x2E);
        u.lllllIlIll[3] = 2;
        u.lllllIlIll[4] = 0xFFFFB3C9 & 0x5FBE;
        u.lllllIlIll[5] = 3;
        u.lllllIlIll[6] = 0x7B ^ 0x7F;
        u.lllllIlIll[7] = 0xFFFFCE7F & 0x33AE;
        u.lllllIlIll[8] = -(0xFFFFF357 & 0x4CBF) & (0xFFFFE3FF & 0x5FFE);
        u.lllllIlIll[9] = 0xFFFFEB7F & 0x16AD;
        u.lllllIlIll[10] = 0xFFFFC32B & 0x3EFE;
        u.lllllIlIll[11] = -(0xFFFFF399 & 0x6C77) & (0xFFFFE7F7 & 0x7DFF);
        u.lllllIlIll[12] = 0x35 ^ 0x33;
        u.lllllIlIll[13] = -(0xFFFFF9BB & 0x6665) & (0xFFFFFFE7 & 0x7F7F);
        u.lllllIlIll[14] = 0xFFFFC9B6 & 0x3FCB;
        u.lllllIlIll[15] = 0xC6 ^ 0xC3;
        u.lllllIlIll[16] = 0xBC ^ 0x9E ^ (0x21 ^ 4);
        u.lllllIlIll[17] = 0xFFFFB3FD & 0x7D53;
        u.lllllIlIll[18] = -(0xFFFFCEFD & 0x7987) & (0xFFFFFFFF & 0x49FF);
        u.lllllIlIll[19] = 0x49 ^ 0x2E ^ (0x77 ^ 0x18);
        u.lllllIlIll[20] = 0x11 ^ 0x1B;
        u.lllllIlIll[21] = 0xFFFFEBF6 & 0x15FD;
        u.lllllIlIll[22] = 0xFFFFD5DF & 0x2FFC;
        u.lllllIlIll[23] = 151 + 52 - 67 + 27 ^ 89 + 17 - 22 + 90;
        u.lllllIlIll[24] = 0x57 ^ 0x2A ^ (0x17 ^ 0x58);
        u.lllllIlIll[25] = 0xAF ^ 0xA6;
        u.lllllIlIll[26] = 0xFFFFFFFC & 0x25B;
        u.lllllIlIll[27] = 8 ^ 0x3C ^ (0x2B ^ 0x14);
        u.lllllIlIll[28] = 0x6D ^ 0x61;
        u.lllllIlIll[29] = 4 ^ 0xA;
        u.lllllIlIll[30] = 39 + 61 - -43 + 37 ^ 56 + 98 - -9 + 24;
        u.lllllIlIll[31] = 0x58 ^ 0x48;
        u.lllllIlIll[32] = 7 ^ 0x16;
        u.lllllIlIll[33] = 0x62 ^ 0x70;
        u.lllllIlIll[34] = -(0xFFFFFBA9 & 0x75DF) & (0xFFFFF3FF & 0x7FDF);
        u.lllllIlIll[35] = 0x56 ^ 0x45;
        u.lllllIlIll[36] = 0xF2 ^ 0xA8 ^ (0xE0 ^ 0xAE);
        u.lllllIlIll[37] = -(0xFFFFFBEF & 0x7CB5) & (0xFFFFFBFF & 0x7EFD);
        u.lllllIlIll[38] = 0x55 ^ 0x5F ^ (0x2E ^ 0x31);
        u.lllllIlIll[39] = 4 ^ 0x12;
        u.lllllIlIll[40] = 0x47 ^ 0x1A ^ (0xE6 ^ 0xAC);
        u.lllllIlIll[41] = 0x1C ^ 4;
        u.lllllIlIll[42] = 3 + 31 - -82 + 11 ^ (0x55 ^ 0x33);
        u.lllllIlIll[43] = 0x2B ^ 0x31;
        u.lllllIlIll[44] = 0xFFFFFBFE & 0x65B;
        u.lllllIlIll[45] = 0x7D ^ 0x66;
        u.lllllIlIll[46] = 118 + 128 - 108 + 9 ^ 27 + 87 - -22 + 7;
        u.lllllIlIll[47] = 0x8B ^ 0xBD ^ (4 ^ 0x2F);
        u.lllllIlIll[48] = 0x8D ^ 0x87 ^ (0x68 ^ 0x7C);
        u.lllllIlIll[49] = -(0xFFFFC4BF & 0x7F75) & (0xFFFFCFFF & 0x7DFD);
        u.lllllIlIll[50] = -(0xFFFFD12E & 0x7FDB) & (0xFFFFFFFF & 0x5DBF);
        u.lllllIlIll[51] = 0xFFFFCBCC & 0x3DF7;
        u.lllllIlIll[52] = -(0xFFFFD2FF & 0x3F0D) & (0xFFFF9FFF & 0x7EBF);
        u.lllllIlIll[53] = 0xFFFFA9DF & 0x5FE6;
        u.lllllIlIll[54] = 0xFFFF8EBD & 0x7DF7;
        u.lllllIlIll[55] = 0x86 ^ 0x99;
        u.lllllIlIll[56] = 5 ^ 0x25;
        u.lllllIlIll[57] = 155 + 16 - 44 + 63 ^ 134 + 41 - 73 + 57;
        u.lllllIlIll[58] = 0xFFFFADEB & 0x5BDF;
        u.lllllIlIll[59] = -(0xFFFFF3DB & 0x5E67) & (0xFFFFFFFB & 0x5EFF);
        u.lllllIlIll[60] = 0x3D ^ 0x77 ^ (0xC5 ^ 0xAD);
        u.lllllIlIll[61] = 0x9A ^ 0x97 ^ (0x9E ^ 0xB0);
        u.lllllIlIll[62] = 72 + 121 - 165 + 118 ^ 65 + 142 - 45 + 20;
        u.lllllIlIll[63] = 0x4F ^ 0xB ^ (0x1B ^ 0x7A);
        u.lllllIlIll[64] = 134 + 123 - 243 + 145 ^ 135 + 161 - 170 + 59;
        u.lllllIlIll[65] = 0x98 ^ 0xBF;
        u.lllllIlIll[66] = 0x50 ^ 0xF ^ (0x4A ^ 0x3D);
        u.lllllIlIll[67] = 0xB9 ^ 0x90;
        u.lllllIlIll[68] = 0xA3 ^ 0xB1 ^ (0xA5 ^ 0x9D);
        u.lllllIlIll[69] = 0x6E ^ 0x2A ^ (0x47 ^ 0x28);
        u.lllllIlIll[70] = 0x4D ^ 0x61;
        u.lllllIlIll[71] = 0xBB ^ 0x80 ^ (0x58 ^ 0x4D);
        u.lllllIlIll[72] = 0x6D ^ 0x42;
        u.lllllIlIll[73] = 0x5B ^ 0x6B;
        u.lllllIlIll[74] = 0x49 ^ 0x25 ^ (0x17 ^ 0x4A);
        u.lllllIlIll[75] = 0x75 ^ 0x46;
        u.lllllIlIll[76] = 0xBA ^ 0xC0 ^ (5 ^ 0x4B);
        u.lllllIlIll[77] = 0x35 ^ 0x75 ^ (0x6F ^ 0x1A);
        u.lllllIlIll[78] = 0x91 ^ 0xA7;
        u.lllllIlIll[79] = 0x39 ^ 0xE;
        u.lllllIlIll[80] = 0x78 ^ 0x40;
        u.lllllIlIll[81] = 0x88 ^ 0x91 ^ (0x8C ^ 0xAC);
        u.lllllIlIll[82] = 0xA3 ^ 0x99;
        u.lllllIlIll[83] = 64 + 62 - 95 + 111 ^ 169 + 3 - 62 + 71;
        u.lllllIlIll[84] = 0x46 ^ 0x7A;
        u.lllllIlIll[85] = 0x4B ^ 0x6E ^ (0x91 ^ 0x89);
        u.lllllIlIll[86] = 165 + 46 - 173 + 135 ^ 35 + 111 - 115 + 116;
        u.lllllIlIll[87] = 27 + 140 - 75 + 58 ^ 14 + 140 - 38 + 53;
        u.lllllIlIll[88] = 65 + 231 - 114 + 54 ^ 88 + 20 - 20 + 84;
        u.lllllIlIll[89] = 0x11 ^ 0x50;
        u.lllllIlIll[90] = 0xFFFFEDE7 & 0x1B7A;
        u.lllllIlIll[91] = -(0xFFFFFC58 & 0x77AF) & (0xFFFFFFFF & 0x7FF7);
        u.lllllIlIll[92] = (8 ^ 0x1A) + (71 + 148 - 151 + 151) - (0x64 ^ 0x12) + (0xD6 ^ 0xB9);
        u.lllllIlIll[93] = 80 + 97 - 94 + 67 + (0x97 ^ 0x90) - (0x3D ^ 0xB) + (0x26 ^ 0x15);
        u.lllllIlIll[94] = -(0xFFFFFF75 & 0x509F) & (0xFFFFFDF7 & 0x5BFF);
        u.lllllIlIll[95] = -(0xFFFFDEDD & 0x232F) & (0xFFFF8F5F & 0x7EFF);
        u.lllllIlIll[96] = 0xFFFF9FFF & 0x69D7;
        u.lllllIlIll[97] = -(0xFFFFB2E7 & 0x6F3A) & (0xFFFFEEFF & 0x3F73);
        u.lllllIlIll[98] = 0xFFFFB9FA & 0x4FD7;
        u.lllllIlIll[99] = -(0xFFFFD4BE & 0x7BED) & (0xFFFFDFFF & 0x7CFF);
        u.lllllIlIll[100] = 3 ^ 0x5A ^ (0xA3 ^ 0xB8);
        u.lllllIlIll[101] = 0xAA ^ 0xC3 ^ (5 ^ 0x2F);
        u.lllllIlIll[102] = 0x80 ^ 0xC4;
        u.lllllIlIll[103] = (0x70 ^ 0x4B) + (0x4D ^ 9) - (0xF9 ^ 0x80) + (152 + 163 - 172 + 51);
        u.lllllIlIll[104] = 0xFFFFEFFD & 0x3ECE;
        u.lllllIlIll[105] = -(0xFFFFFAF7 & 0xD4A) & (0xFFFFEBFB & 0x7DED);
        u.lllllIlIll[106] = 0xFFFFFA9A & 0x3FFD;
        u.lllllIlIll[107] = -(0xFFFFEF39 & 0x34C7) & (0xFFFFB7F7 & 0x6F8C);
        u.lllllIlIll[108] = 0xB5 ^ 0x83 ^ (0x4D ^ 0x1F);
        u.lllllIlIll[109] = 0x57 ^ 0x12;
        u.lllllIlIll[110] = 4 ^ 0x42;
        u.lllllIlIll[111] = 0xD6 ^ 0x91;
        u.lllllIlIll[112] = 0xFFFFBDEB & 0x4BFF;
        u.lllllIlIll[113] = -(0xFFFFB9BD & 0x4743) & (0xFFFFFFDF & 0xD7F);
        u.lllllIlIll[114] = -(0xFFFFFFED & 0x2437) & (0xFFFFAFFD & 0x7DFE);
        u.lllllIlIll[115] = -(0xFFFFF1FD & 0x7F7B) & (0xFFFFFDFF & Short.MAX_VALUE);
        u.lllllIlIll[116] = 0xFFFFBBDD & 0x4DFE;
        u.lllllIlIll[117] = 0xFFFFDDFC & 0x2EBB;
        u.lllllIlIll[118] = -(0xFFFFF302 & 0x4EFF) & (0xFFFFFFDF & 0x4BFF);
        u.lllllIlIll[119] = 0xFFFFEEF7 & 0x1DBC;
        u.lllllIlIll[120] = -(0xFFFFFFBD & 0x367F) & (0xFFFFBFFF & Short.MAX_VALUE);
        u.lllllIlIll[121] = 0xFFFFEEBF & 0x1DFC;
        u.lllllIlIll[122] = -(0xFFFFF63B & 0x3DEF) & (0xFFFFFFEA & 0x3DFF);
        u.lllllIlIll[123] = -(0xFFFFF35E & 0x2EE5) & (0xFFFFBEE7 & 0x6FFF);
        u.lllllIlIll[124] = -(0xFFFF9E23 & 0x75FE) & (0xFFFFFFEF & 0x1DFF);
        u.lllllIlIll[125] = 0xFFFFFFA9 & 0xCDF;
        u.lllllIlIll[126] = -(0xFFFFDD59 & 0x73EF) & (0xFFFFDFFF & 0x7DFA);
        u.lllllIlIll[127] = -(0xFFFFB771 & 0x4EAF) & (0xFFFFBFE7 & 0x4FFF);
        u.lllllIlIll[128] = -(0xFFFFD846 & 0x37FF) & (0xFFFFFDDF & 0x1BFF);
        u.lllllIlIll[129] = -(0xFFFFC857 & 0x77BA) & (0xFFFFDCF3 & 0x6FFF);
        u.lllllIlIll[130] = 91 + 173 - 127 + 61 ^ 141 + 129 - 177 + 49;
        u.lllllIlIll[131] = 0x48 ^ 0x46 ^ (0xCC ^ 0x8B);
        u.lllllIlIll[132] = 52 + 36 - -125 + 41 ^ 117 + 29 - 98 + 132;
        u.lllllIlIll[133] = 0xD4 ^ 0x9F;
        u.lllllIlIll[134] = 0x8B ^ 0xC7;
        u.lllllIlIll[135] = 0x34 ^ 0x46 ^ (0xFF ^ 0xC0);
        u.lllllIlIll[136] = 0xC ^ 0x63;
        u.lllllIlIll[137] = 0xFFFFBDEF & 0x4BFA;
        u.lllllIlIll[138] = -(0xFFFFE7E7 & 0x7E3F) & (0xFFFFFFF7 & 0x6FFF);
        u.lllllIlIll[139] = -(0xFFFFF597 & 0x6A6F) & (0xFFFFEDDF & 0x7E7F);
        u.lllllIlIll[140] = 0x5D ^ 0x79 ^ (0x70 ^ 0x1A);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean aa() {
        void lllllllllllllllllIlIIlIIllIllllI;
        int[] nArray = new int[lllllIlIll[5]];
        nArray[u.lllllIlIll[1]] = lllllIlIll[13];
        nArray[u.lllllIlIll[0]] = lllllIlIll[11];
        nArray[u.lllllIlIll[3]] = lllllIlIll[14];
        int[] nArray2 = nArray;
        int lllllllllllllllllIlIIlIIllIlllIl = lllllIlIll[1];
        while (u.llIlIlIIlIlIl(lllllllllllllllllIlIIlIIllIlllIl, ((void)lllllllllllllllllIlIIlIIllIllllI).length)) {
            int[] nArray3 = new int[lllllIlIll[0]];
            nArray3[u.lllllIlIll[1]] = lllllllllllllllllIlIIlIIllIllllI[lllllllllllllllllIlIIlIIllIlllIl];
            if (u.llIlIlIIlIllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lllllIlIll[1];
            }
            ++lllllllllllllllllIlIIlIIllIlllIl;
            0;
            if (3 >= -1) continue;
            return ((0x69 ^ 0x51) & ~(0xF9 ^ 0xC1)) != 0;
        }
        return lllllIlIll[0];
    }

    private static boolean llIlIlIIllIIl(int n2) {
        return n2 > 0;
    }

    private static String llIlIIlllllll(String lllllllllllllllllIlIIlIIlIllIIll, String lllllllllllllllllIlIIlIIlIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIIlIIlIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIIlIIlIllIlll.init(lllllIlIll[3], lllllllllllllllllIlIIlIIlIlllIII);
            return new String(lllllllllllllllllIlIIlIIlIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIlIIlIllIllI) {
            lllllllllllllllllIlIIlIIlIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIlIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static int llIlIlIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String llIlIIllllllI(String lllllllllllllllllIlIIlIIlIlIlIII, String lllllllllllllllllIlIIlIIlIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIlIIlIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIlIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), lllllIlIll[19]), "DES");
            Cipher lllllllllllllllllIlIIlIIlIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllllIlIIlIIlIlIlIlI.init(lllllIlIll[3], lllllllllllllllllIlIIlIIlIlIlIll);
            return new String(lllllllllllllllllIlIIlIIlIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIlIIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIIlIIlIlIlIIl) {
            lllllllllllllllllIlIIlIIlIlIlIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void bu() {
        if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dv), lllllIlIll[3])) {
            void lllllllllllllllllIlIIlIIlllIIIIl;
            void lllllllllllllllllIlIIlIIlllIIIlI;
            void lllllllllllllllllIlIIlIIlllIIlII;
            AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[89]];
            WorldArea worldArea = new WorldArea(lllllIlIll[90], lllllIlIll[91], lllllIlIll[92], lllllIlIll[93], lllllIlIll[1]);
            WorldPoint worldPoint = new WorldPoint(lllllIlIll[94], lllllIlIll[95], lllllIlIll[1]);
            WorldArea worldArea2 = new WorldArea(lllllIlIll[96], lllllIlIll[97], lllllIlIll[35], lllllIlIll[6], lllllIlIll[1]);
            WorldArea worldArea3 = new WorldArea(lllllIlIll[98], lllllIlIll[99], lllllIlIll[19], lllllIlIll[15], lllllIlIll[1]);
            if (u.llIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Equipment.getFirst((int[])f.aM).interact(lllllIlIII[lllllIlIll[100]]);
                Time.sleepTicks((int)lllllIlIll[15]);
                0;
            }
            if (u.llIlIlIIlIllI(v.eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)v.eX);
                0;
            }
            if (u.llIlIlIIlIlII(v.eW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Walker.stepAlong(List.of(v.eb));
                0;
                Time.sleepTicks((int)lllllIlIll[0]);
                0;
            }
            if (!u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] stringArray = new String[lllllIlIll[0]];
                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[101]];
                TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[102]]);
                Time.sleepTicks((int)lllllIlIll[6]);
                0;
            }
            if ((!u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.llIlIlIIlIlII(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dv), lllllIlIll[3])) {
                Movement.walkTo((WorldPoint)dv);
                0;
                Time.sleepTicks((int)lllllIlIll[0]);
                0;
            }
        }
    }

    public static void bt() {
        block82: {
            Object lllllllllllllllllIlIIlIIlllIllII;
            BankLocation lllllllllllllllllIlIIlIIlllIllIl2;
            block83: {
                block88: {
                    block85: {
                        block87: {
                            block86: {
                                block84: {
                                    if (u.llIlIlIIlIlII(bs ? 1 : 0)) {
                                        b.a(bu);
                                        if (u.llIlIlIIlIlIl(bu.size(), lllllIlIll[0])) {
                                            System.out.println(lllllIlIII[lllllIlIll[1]]);
                                            bs = lllllIlIll[1];
                                        }
                                    }
                                    if (!u.llIlIlIIlIllI(bs ? 1 : 0)) break block82;
                                    if (u.llIlIlIIlIlIl(Skills.getLevel((Skill)Skill.PRAYER), lllllIlIll[2])) {
                                        aa.eA();
                                    }
                                    if (u.llIlIlIIlIlll(Skills.getLevel((Skill)Skill.PRAYER), lllllIlIll[2]) && u.llIlIlIIlIlII(Inventory.contains((int[])f.aZ) ? 1 : 0)) {
                                        Inventory.getFirst((int[])f.aZ).interact(lllllIlIII[lllllIlIll[0]]);
                                    }
                                    if (!u.llIlIlIIlIllI(u.aa() ? 1 : 0) || !u.llIlIlIIlIlIl(e.j(dF), lllllIlIll[0]) || !u.llIlIlIIlIlll(Skills.getLevel((Skill)Skill.PRAYER), lllllIlIll[2])) break block83;
                                    lllllllllllllllllIlIIlIIlllIllIl2 = BankLocation.getNearest();
                                    if (u.llIlIlIIllIII(lllllllllllllllllIlIIlIIlllIllIl2) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[3]];
                                        a.a(lllllllllllllllllIlIIlIIlllIllIl2);
                                    }
                                    if (!u.llIlIlIIllIII(lllllllllllllllllIlIIlIIlllIllIl2) || !u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIllIl2.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block83;
                                    if (u.llIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllllIlIll[4]);
                                        0;
                                    }
                                    if (!u.llIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) break block83;
                                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[5]];
                                    if (u.llIlIlIIllIIl(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)lllllIlIll[6]);
                                        0;
                                    }
                                    if (u.llIlIlIIllIIl(Equipment.getAll().size())) {
                                        Bank.depositEquipment();
                                        Time.sleepTicks((int)lllllIlIll[3]);
                                        0;
                                    }
                                    int[] nArray = new int[lllllIlIll[0]];
                                    nArray[u.lllllIlIll[1]] = lllllIlIll[7];
                                    if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block84;
                                    int[] nArray2 = new int[lllllIlIll[0]];
                                    nArray2[u.lllllIlIll[1]] = lllllIlIll[7];
                                    if (!u.llIlIlIIlIlll(Bank.getFirst((int[])nArray2).getQuantity(), lllllIlIll[8])) break block85;
                                }
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[9];
                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block86;
                                int[] nArray3 = new int[lllllIlIll[0]];
                                nArray3[u.lllllIlIll[1]] = lllllIlIll[9];
                                if (!u.llIlIlIIlIlll(Bank.getFirst((int[])nArray3).getQuantity(), lllllIlIll[8])) break block85;
                            }
                            int[] nArray = new int[lllllIlIll[0]];
                            nArray[u.lllllIlIll[1]] = lllllIlIll[10];
                            if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block87;
                            int[] nArray4 = new int[lllllIlIll[0]];
                            nArray4[u.lllllIlIll[1]] = lllllIlIll[10];
                            if (!u.llIlIlIIlIlll(Bank.getFirst((int[])nArray4).getQuantity(), lllllIlIll[8])) break block85;
                        }
                        int[] nArray = new int[lllllIlIll[0]];
                        nArray[u.lllllIlIll[1]] = lllllIlIll[11];
                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block88;
                        int[] nArray5 = new int[lllllIlIll[0]];
                        nArray5[u.lllllIlIll[1]] = lllllIlIll[11];
                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray5).getQuantity(), lllllIlIll[12])) break block88;
                    }
                    u.ae();
                    System.out.println(lllllIlIII[lllllIlIll[6]]);
                    bs = lllllIlIll[0];
                    return;
                }
                int[] nArray = new int[lllllIlIll[12]];
                nArray[u.lllllIlIll[1]] = lllllIlIll[13];
                nArray[u.lllllIlIll[0]] = lllllIlIll[11];
                nArray[u.lllllIlIll[3]] = lllllIlIll[14];
                nArray[u.lllllIlIll[5]] = lllllIlIll[10];
                nArray[u.lllllIlIll[6]] = lllllIlIll[9];
                nArray[u.lllllIlIll[15]] = lllllIlIll[7];
                if (u.llIlIlIIlIllI(e.b(nArray) ? 1 : 0)) {
                    u.ae();
                    System.out.println(lllllIlIII[lllllIlIll[15]]);
                    bs = lllllIlIll[0];
                    return;
                }
                while (u.llIlIlIIlIllI(t.bl() ? 1 : 0)) {
                    t.bj();
                    Time.sleepTicks((int)lllllIlIll[0]);
                    0;
                    0;
                    if (((0x1C ^ 0x10) & ~(0x72 ^ 0x7E)) == 0) continue;
                    return;
                }
                if (u.llIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepTicks((int)lllllIlIll[12]);
                    0;
                }
                int[] nArray6 = new int[lllllIlIll[16]];
                nArray6[u.lllllIlIll[1]] = lllllIlIll[13];
                nArray6[u.lllllIlIll[0]] = lllllIlIll[11];
                nArray6[u.lllllIlIll[3]] = lllllIlIll[14];
                nArray6[u.lllllIlIll[5]] = lllllIlIll[17];
                nArray6[u.lllllIlIll[6]] = lllllIlIll[10];
                nArray6[u.lllllIlIll[15]] = lllllIlIll[9];
                nArray6[u.lllllIlIll[12]] = lllllIlIll[7];
                if (u.llIlIlIIlIlII(e.b(nArray6) ? 1 : 0)) {
                    a.a(lllllIlIll[17], lllllIlIll[6]);
                    a.b(f.aM, lllllIlIll[0]);
                    a.a(lllllIlIll[11], lllllIlIll[12]);
                    a.a(lllllIlIll[18], lllllIlIll[19]);
                    a.a(lllllIlIll[14], lllllIlIll[5]);
                    a.a(lllllIlIll[13], lllllIlIll[20]);
                    int[] nArray7 = new int[lllllIlIll[0]];
                    nArray7[u.lllllIlIll[1]] = lllllIlIll[7];
                    if (u.llIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lllllIlIll[0]];
                        nArray8[u.lllllIlIll[1]] = lllllIlIll[7];
                        if (u.llIlIlIIlIlIl(Inventory.getCount((int[])nArray8), lllllIlIll[0])) {
                            Bank.withdraw((int)lllllIlIll[7], (int)lllllIlIll[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllllIlIll[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[7];
                                if (u.llIlIlIIllIIl(Inventory.getCount((int[])nArray))) {
                                    bl = lllllIlIll[0];
                                    0;
                                    if (((0x7A ^ 0x61) & ~(9 ^ 0x12)) > 0) {
                                        return ((0x36 ^ 0x67) & ~(0x7C ^ 0x2D)) != 0;
                                    }
                                } else {
                                    bl = lllllIlIll[1];
                                }
                                return bl;
                            }, (int)lllllIlIll[4]);
                            0;
                        }
                    }
                    int[] nArray9 = new int[lllllIlIll[0]];
                    nArray9[u.lllllIlIll[1]] = lllllIlIll[10];
                    if (u.llIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        int[] nArray10 = new int[lllllIlIll[0]];
                        nArray10[u.lllllIlIll[1]] = lllllIlIll[10];
                        if (u.llIlIlIIlIlIl(Inventory.getCount((int[])nArray10), lllllIlIll[0])) {
                            Bank.withdraw((int)lllllIlIll[10], (int)lllllIlIll[22], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lllllIlIll[0]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (u.llIlIlIIllIIl(Inventory.getCount((int[])nArray))) {
                                    bl = lllllIlIll[0];
                                    0;
                                    if ((0x80 ^ 0x84) < 0) {
                                        return ((0x4B ^ 0x73) & ~(0x9D ^ 0xA5)) != 0;
                                    }
                                } else {
                                    bl = lllllIlIll[1];
                                }
                                return bl;
                            }, (int)lllllIlIll[4]);
                            0;
                        }
                    }
                    if (u.llIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lllllIlIll[23])) {
                        a.a(lllllIlIll[9], lllllIlIll[21]);
                    }
                }
            }
            if (u.llIlIlIIlIlII(Inventory.contains((int[])f.aU) ? 1 : 0) && u.llIlIlIIlIlIl(Movement.getRunEnergy(), lllllIlIll[24])) {
                Inventory.getFirst((int[])f.aU).interact(lllllIlIII[lllllIlIll[12]]);
                Time.sleepTicks((int)lllllIlIll[0]);
                0;
            }
            if (u.llIlIlIIllIlI(u.llIlIlIIlIIll(e.u(), 50.0))) {
                int[] nArray = new int[lllllIlIll[0]];
                nArray[u.lllllIlIll[1]] = lllllIlIll[18];
                if (u.llIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray11 = new int[lllllIlIll[0]];
                    nArray11[u.lllllIlIll[1]] = lllllIlIll[18];
                    Inventory.getFirst((int[])nArray11).interact(lllllIlIII[lllllIlIll[16]]);
                    Time.sleepTicks((int)lllllIlIll[0]);
                    0;
                }
            }
            if (u.llIlIlIIlIlII(u.aa() ? 1 : 0) && u.llIlIlIIlIlIl(e.j(dF), lllllIlIll[0])) {
                if (u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    u.bu();
                }
                if (u.llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllllIlIII[lllllIlIll[19]], bQ);
                }
            }
            if ((!u.llIlIlIIllIll(e.j(dF), lllllIlIll[0]) || !u.llIlIlIIllIll(e.j(dF), lllllIlIll[3]) || u.llIlIlIIlllII(e.j(dF), lllllIlIll[5])) && u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(dH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dw), lllllIlIll[19]) && u.llIlIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[25]];
                    Movement.walkTo((WorldPoint)dw);
                    0;
                    Time.sleepTicks((int)lllllIlIll[0]);
                    0;
                }
                if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dw), lllllIlIll[19])) {
                    g.a(lllllIlIII[lllllIlIll[20]], bQ);
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[6])) {
                ck = lllllIlIll[1];
                if (u.llIlIlIIlIllI(Vars.getBit((int)lllllIlIll[26]))) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dy), lllllIlIll[6])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[27]];
                        Movement.walkTo((WorldPoint)dy);
                        0;
                        Time.sleepTicks((int)lllllIlIll[0]);
                        0;
                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dy), lllllIlIll[6])) {
                        String[] stringArray = new String[lllllIlIll[0]];
                        stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[28]];
                        String[] stringArray2 = new String[lllllIlIll[0]];
                        stringArray2[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[23]];
                        if (u.llIlIlIIlIlII(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[lllllIlIll[0]];
                            stringArray3[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[29]];
                            TileObjects.getNearest((String[])stringArray3).interact(lllllIlIII[lllllIlIll[30]]);
                            Time.sleepTicks((int)lllllIlIll[5]);
                            0;
                        }
                        String[] stringArray4 = new String[lllllIlIll[0]];
                        stringArray4[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[31]];
                        String[] stringArray5 = new String[lllllIlIll[0]];
                        stringArray5[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[32]];
                        if (u.llIlIlIIlIllI(TileObjects.getNearest((String[])stringArray4).hasAction(stringArray5) ? 1 : 0)) {
                            g.a(lllllIlIII[lllllIlIll[33]], bQ);
                        }
                    }
                }
                if (u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[26]), lllllIlIll[0]) && u.llIlIlIIlIllI(Vars.getBit((int)lllllIlIll[34]))) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dz), lllllIlIll[12])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[35]];
                        Movement.walkTo((WorldPoint)dz);
                        0;
                        Time.sleepTicks((int)lllllIlIll[0]);
                        0;
                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dz), lllllIlIll[12])) {
                        g.a(lllllIlIII[lllllIlIll[36]], bQ);
                    }
                }
                if (u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[26]), lllllIlIll[0]) && u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[34]), lllllIlIll[0]) && u.llIlIlIIlIllI(Vars.getBit((int)lllllIlIll[37]))) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dA), lllllIlIll[12])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[38]];
                        Movement.walkTo((WorldPoint)dA);
                        0;
                        Time.sleepTicks((int)lllllIlIll[0]);
                        0;
                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dA), lllllIlIll[12])) {
                        g.a(lllllIlIII[lllllIlIll[39]], bQ);
                    }
                }
                if (u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[26]), lllllIlIll[0]) && u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[34]), lllllIlIll[0]) && u.llIlIlIIlllII(Vars.getBit((int)lllllIlIll[37]), lllllIlIll[0])) {
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dB), lllllIlIll[3])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[40]];
                        Movement.walkTo((WorldPoint)dB);
                        0;
                        Time.sleepTicks((int)lllllIlIll[0]);
                        0;
                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dB), lllllIlIll[3])) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[41]];
                        if (u.llIlIlIIlIllI(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray = new String[lllllIlIll[0]];
                            stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[42]];
                            TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[43]]);
                            Time.sleepTicks((int)lllllIlIll[5]);
                            0;
                        }
                        int lllllllllllllllllIlIIlIIlllIllIl2 = Vars.getBit((int)lllllIlIll[44]);
                        lllllllllllllllllIlIIlIIlllIllII = Dialog.getOptions();
                        if (u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllII.isEmpty() ? 1 : 0)) {
                            System.out.println("Selecting " + lllllllllllllllllIlIIlIIlllIllIl2);
                            if (u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2)) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[45]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (u.llIlIlIIlllII(lllllllllllllllllIlIIlIIlllIllIl2, lllllIlIll[0])) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[46]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (u.llIlIlIIlllII(lllllllllllllllllIlIIlIIlllIllIl2, lllllIlIll[3])) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[47]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            if (u.llIlIlIIlllII(lllllllllllllllllIlIIlIIlllIllIl2, lllllIlIll[5])) {
                                String[] stringArray = new String[lllllIlIll[0]];
                                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[48]];
                                Dialog.chooseOption((String[])stringArray);
                                0;
                            }
                            Time.sleepTicks((int)lllllIlIll[3]);
                            0;
                        }
                    }
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[15])) {
                lllllllllllllllllIlIIlIIlllIllIl2 = new WorldArea(lllllIlIll[49], lllllIlIll[50], lllllIlIll[16], lllllIlIll[15], lllllIlIll[1]);
                if (u.llIlIlIIlIllI(Players.getLocal().getWorldLocation().getPlane())) {
                    lllllllllllllllllIlIIlIIlllIllII = new WorldArea(lllllIlIll[51], lllllIlIll[50], lllllIlIll[28], lllllIlIll[12], lllllIlIll[1]);
                    WorldArea lllllllllllllllllIlIIlIIlllIlIll = new WorldArea(lllllIlIll[51], lllllIlIll[52], lllllIlIll[6], lllllIlIll[15], lllllIlIll[1]);
                    WorldArea lllllllllllllllllIlIIlIIlllIlIlI = new WorldArea(lllllIlIll[53], lllllIlIll[54], lllllIlIll[6], lllllIlIll[3], lllllIlIll[1]);
                    WorldArea lllllllllllllllllIlIIlIIlllIlIIl = new WorldArea(lllllIlIll[53], lllllIlIll[52], lllllIlIll[5], lllllIlIll[5], lllllIlIll[1]);
                    if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dC), lllllIlIll[3]) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[55]];
                        Movement.walkTo((WorldPoint)dC);
                        0;
                        Time.sleepTicks((int)lllllIlIll[0]);
                        0;
                    }
                    if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dC), lllllIlIll[3]) && u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lllllIlIll[0]];
                        stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[56]];
                        TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[57]]);
                        Time.sleepTicks((int)lllllIlIll[3]);
                        0;
                    }
                    if (u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIllIl2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1])), lllllIlIll[3])) {
                            Movement.walkTo((WorldPoint)new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1]));
                            0;
                            Time.sleepTicks((int)lllllIlIll[0]);
                            0;
                        }
                        if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllllIlIll[58], lllllIlIll[59], lllllIlIll[1])), lllllIlIll[3])) {
                            String[] stringArray = new String[lllllIlIll[0]];
                            stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[60]];
                            String[] stringArray6 = new String[lllllIlIll[0]];
                            stringArray6[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[61]];
                            if (u.llIlIlIIlIlII(TileObjects.getNearest((String[])stringArray).hasAction(stringArray6) ? 1 : 0)) {
                                String[] stringArray7 = new String[lllllIlIll[0]];
                                stringArray7[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[62]];
                                TileObjects.getNearest((String[])stringArray7).interact(lllllIlIII[lllllIlIll[63]]);
                                Time.sleepTicks((int)lllllIlIll[3]);
                                0;
                            }
                            String[] stringArray8 = new String[lllllIlIll[0]];
                            stringArray8[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[64]];
                            String[] stringArray9 = new String[lllllIlIll[0]];
                            stringArray9[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[65]];
                            if (u.llIlIlIIlIllI(TileObjects.getNearest((String[])stringArray8).hasAction(stringArray9) ? 1 : 0)) {
                                String[] stringArray10 = new String[lllllIlIll[0]];
                                stringArray10[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[66]];
                                TileObjects.getNearest((String[])stringArray10).interact(lllllIlIII[lllllIlIll[67]]);
                                Time.sleepTicks((int)lllllIlIll[15]);
                                0;
                            }
                        }
                        if (!u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] stringArray = new String[lllllIlIll[0]];
                            stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[68]];
                            TileObjects.getNearest((String[])stringArray).interact(lllllIlIII[lllllIlIll[69]]);
                            Time.sleepTicks((int)lllllIlIll[15]);
                            0;
                        }
                    }
                }
                if (u.llIlIlIIlllII(Players.getLocal().getWorldLocation().getPlane(), lllllIlIll[0])) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[70]];
                    String[] stringArray = new String[lllllIlIll[0]];
                    stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[2]];
                    if (u.llIlIlIIllIII(TileObjects.getNearest((String[])stringArray))) {
                        String[] stringArray11 = new String[lllllIlIll[0]];
                        stringArray11[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[71]];
                        TileObjects.getNearest((String[])stringArray11).interact(lllllIlIII[lllllIlIll[72]]);
                        Time.sleepTicks((int)lllllIlIll[15]);
                        0;
                    }
                    String[] stringArray12 = new String[lllllIlIll[0]];
                    stringArray12[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[73]];
                    if (u.llIlIlIIllIII(TileObjects.getNearest((String[])stringArray12))) {
                        String[] stringArray13 = new String[lllllIlIll[0]];
                        stringArray13[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[74]];
                        TileObjects.getNearest((String[])stringArray13).interact(lllllIlIII[lllllIlIll[24]]);
                        Time.sleepTicks((int)lllllIlIll[3]);
                        0;
                    }
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[12])) {
                if (u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    u.bu();
                }
                if (u.llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    g.a(lllllIlIII[lllllIlIll[75]], bQ);
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[16])) {
                if (u.llIlIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(dE), lllllIlIll[25])) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[76]];
                    Movement.walkTo((WorldPoint)dE);
                    0;
                    Time.sleepTicks((int)lllllIlIll[3]);
                    0;
                }
                if (u.llIlIlIIllllI(Players.getLocal().getWorldLocation().distanceTo(dE), lllllIlIll[25])) {
                    if (u.llIlIlIIlIllI(k.ac() ? 1 : 0)) {
                        k.ad();
                    }
                    String[] stringArray = new String[lllllIlIll[0]];
                    stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[77]];
                    lllllllllllllllllIlIIlIIlllIllIl2 = NPCs.getNearest((String[])stringArray);
                    lllllllllllllllllIlIIlIIlllIllII = NPCs.getNearest(nPC -> {
                        int n2;
                        if (u.llIlIlIIlIlII(nPC.getName().contains(lllllIlIII[lllllIlIll[111]]) ? 1 : 0) && u.llIlIlIlIIIII(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lllllIlIll[0];
                            0;
                            if (((0xD5 ^ 0xC3) & ~(0x26 ^ 0x30)) > 0) {
                                return ((0x62 ^ 0x41) & ~(9 ^ 0x2A)) != 0;
                            }
                        } else {
                            n2 = lllllIlIll[1];
                        }
                        return n2 != 0;
                    });
                    if (u.llIlIlIIllIII(lllllllllllllllllIlIIlIIlllIllIl2) && u.llIlIlIIlllll(lllllllllllllllllIlIIlIIlllIllII)) {
                        String[] stringArray14 = new String[lllllIlIll[0]];
                        stringArray14[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[78]];
                        if (u.llIlIlIIlIllI(lllllllllllllllllIlIIlIIlllIllIl2.hasAction(stringArray14) ? 1 : 0)) {
                            g.a(lllllIlIII[lllllIlIll[79]], bQ);
                        }
                        String[] stringArray15 = new String[lllllIlIll[0]];
                        stringArray15[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[80]];
                        if (u.llIlIlIIlIlII(lllllllllllllllllIlIIlIIlllIllIl2.hasAction(stringArray15) ? 1 : 0) && u.llIlIlIIlllll(Players.getLocal().getInteracting())) {
                            AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[81]];
                            if (u.llIlIlIIlIllI(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                        }
                    }
                    if (u.llIlIlIIlIlIl(Prayers.getPoints(), lllllIlIll[40]) && u.llIlIlIIlIlII(Inventory.contains((int[])f.aR) ? 1 : 0)) {
                        Inventory.getFirst((int[])f.aR).interact(lllllIlIII[lllllIlIll[82]]);
                        Time.sleepTicks((int)lllllIlIll[0]);
                        0;
                    }
                    g.a(bQ);
                }
            }
            if (u.llIlIlIIlllII(e.j(dF), lllllIlIll[19])) {
                String[] stringArray = new String[lllllIlIll[0]];
                stringArray[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[83]];
                if (u.llIlIlIIlIllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIlIII[lllllIlIll[84]];
                    String[] stringArray16 = new String[lllllIlIll[0]];
                    stringArray16[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[85]];
                    TileItems.getNearest((String[])stringArray16).interact(lllllIlIII[lllllIlIll[86]]);
                    Time.sleepTicks((int)lllllIlIll[6]);
                    0;
                }
                String[] stringArray17 = new String[lllllIlIll[0]];
                stringArray17[u.lllllIlIll[1]] = lllllIlIII[lllllIlIll[87]];
                if (u.llIlIlIIlIlII(Inventory.contains((String[])stringArray17) ? 1 : 0)) {
                    if (u.llIlIlIIlIlII(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    if (u.llIlIlIIlIllI(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        u.bu();
                    }
                    if (u.llIlIlIIlIlII(dG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (u.llIlIlIIlIlIl(ck, lllllIlIll[0])) {
                            ac.kf += lllllIlIll[0];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllllIlIll[0];
                            ac.kf = lllllIlIll[1];
                            cl = lllllIlIll[1];
                        }
                        g.a(lllllIlIII[lllllIlIll[88]], bQ);
                    }
                }
            }
            g.a(bQ);
        }
    }

    private static boolean llIlIlIIlllll(Object object) {
        return object == null;
    }

    private static boolean llIlIlIlIIIII(Object object, Object object2) {
        return object == object2;
    }

    private static void ae() {
        block33: {
            d lllllllllllllllllIlIIlIIllIllIIl;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            block28: {
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                Object lllllllllllllllllIlIIlIIllIllIlI;
                                                block23: {
                                                    block22: {
                                                        int[] nArray = new int[lllllIlIll[0]];
                                                        nArray[u.lllllIlIll[1]] = lllllIlIll[11];
                                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                        int[] nArray2 = new int[lllllIlIll[0]];
                                                        nArray2[u.lllllIlIll[1]] = lllllIlIll[11];
                                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                        int[] nArray3 = new int[lllllIlIll[0]];
                                                        nArray3[u.lllllIlIll[1]] = lllllIlIll[11];
                                                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray3).getQuantity(), lllllIlIll[12])) break block23;
                                                    }
                                                    lllllllllllllllllIlIIlIIllIllIlI = new d(lllllIlIll[11], lllllIlIll[12], lllllIlIll[103]);
                                                    bu.add((d)lllllllllllllllllIlIIlIIllIllIlI);
                                                    0;
                                                }
                                                if (u.llIlIlIIlIllI(Bank.contains((Predicate)(lllllllllllllllllIlIIlIIllIllIlI = item -> item.getName().toLowerCase().contains(lllllIlIII[lllllIlIll[110]]))) ? 1 : 0)) {
                                                    lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[104], lllllIlIll[15], lllllIlIll[105]);
                                                    bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                                                    0;
                                                }
                                                int[] nArray = new int[lllllIlIll[0]];
                                                nArray[u.lllllIlIll[1]] = lllllIlIll[14];
                                                if (u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    int[] nArray4 = new int[lllllIlIll[0]];
                                                    nArray4[u.lllllIlIll[1]] = lllllIlIll[14];
                                                    if (u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray4).getQuantity(), lllllIlIll[6])) {
                                                        int[] nArray5 = new int[lllllIlIll[0]];
                                                        nArray5[u.lllllIlIll[1]] = lllllIlIll[14];
                                                        lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[14], lllllIlIll[6] - Bank.getFirst((int[])nArray5).getQuantity(), lllllIlIll[106]);
                                                        bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                                                        0;
                                                    }
                                                }
                                                int[] nArray6 = new int[lllllIlIll[0]];
                                                nArray6[u.lllllIlIll[1]] = lllllIlIll[9];
                                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray6) ? 1 : 0)) break block24;
                                                int[] nArray7 = new int[lllllIlIll[0]];
                                                nArray7[u.lllllIlIll[1]] = lllllIlIll[9];
                                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) break block25;
                                                int[] nArray8 = new int[lllllIlIll[0]];
                                                nArray8[u.lllllIlIll[1]] = lllllIlIll[9];
                                                if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray8).getQuantity(), lllllIlIll[8])) break block25;
                                            }
                                            lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[9], lllllIlIll[8], lllllIlIll[20]);
                                            bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                                            0;
                                        }
                                        int[] nArray = new int[lllllIlIll[0]];
                                        nArray[u.lllllIlIll[1]] = lllllIlIll[7];
                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                        int[] nArray9 = new int[lllllIlIll[0]];
                                        nArray9[u.lllllIlIll[1]] = lllllIlIll[7];
                                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block27;
                                        int[] nArray10 = new int[lllllIlIll[0]];
                                        nArray10[u.lllllIlIll[1]] = lllllIlIll[7];
                                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray10).getQuantity(), lllllIlIll[8])) break block27;
                                    }
                                    lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[7], lllllIlIll[8], lllllIlIll[20]);
                                    bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                                    0;
                                }
                                int[] nArray = new int[lllllIlIll[0]];
                                nArray[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                int[] nArray11 = new int[lllllIlIll[0]];
                                nArray11[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray11) ? 1 : 0)) break block29;
                                int[] nArray12 = new int[lllllIlIll[0]];
                                nArray12[u.lllllIlIll[1]] = lllllIlIll[10];
                                if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray12).getQuantity(), lllllIlIll[8])) break block29;
                            }
                            lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[10], lllllIlIll[8], lllllIlIll[20]);
                            bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                            0;
                        }
                        int[] nArray = new int[lllllIlIll[0]];
                        nArray[u.lllllIlIll[1]] = lllllIlIll[14];
                        if (u.llIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[14], lllllIlIll[6], lllllIlIll[106]);
                            bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                            0;
                        }
                        int[] nArray13 = new int[lllllIlIll[0]];
                        nArray13[u.lllllIlIll[1]] = lllllIlIll[17];
                        if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) break block30;
                        int[] nArray14 = new int[lllllIlIll[0]];
                        nArray14[u.lllllIlIll[1]] = lllllIlIll[17];
                        if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray14).getQuantity(), lllllIlIll[6])) break block31;
                    }
                    lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[17], lllllIlIll[6], i.bp);
                    bu.add(lllllllllllllllllIlIIlIIllIllIIl);
                    0;
                }
                int[] nArray = new int[lllllIlIll[0]];
                nArray[u.lllllIlIll[1]] = lllllIlIll[13];
                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                int[] nArray15 = new int[lllllIlIll[0]];
                nArray15[u.lllllIlIll[1]] = lllllIlIll[13];
                if (!u.llIlIlIIlIlII(Bank.contains((int[])nArray15) ? 1 : 0)) break block33;
                int[] nArray16 = new int[lllllIlIll[0]];
                nArray16[u.lllllIlIll[1]] = lllllIlIll[13];
                if (!u.llIlIlIIlIlIl(Bank.getFirst((int[])nArray16).getQuantity(), lllllIlIll[30])) break block33;
            }
            lllllllllllllllllIlIIlIIllIllIIl = new d(lllllIlIll[13], lllllIlIll[66], lllllIlIll[107]);
            bu.add(lllllllllllllllllIlIIlIIllIllIIl);
            0;
        }
    }

    @Override
    public String U() {
        return lllllIlIII[lllllIlIll[109]];
    }
}

