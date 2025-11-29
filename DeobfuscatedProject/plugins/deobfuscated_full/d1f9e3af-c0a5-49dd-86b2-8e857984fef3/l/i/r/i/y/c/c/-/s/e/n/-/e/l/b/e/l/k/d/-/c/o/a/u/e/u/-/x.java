/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
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
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.an;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.g;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.i;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class x
implements W {
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea dk;
    public static /* synthetic */ boolean dh;
    public static /* synthetic */ boolean df;
    static /* synthetic */ int cl;
    static /* synthetic */ int dj;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean dg;
    public static /* synthetic */ boolean di;
    public static /* synthetic */ boolean de;
    private static /* synthetic */ int[] lIllIIlIl;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ String[] lIllIIIll;

    private static int lIIlIlIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public int T() {
        try {
            x.aV();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xA1 ^ 0xA5) <= ((0x57 ^ 0x15) & ~(0x53 ^ 0x11))) {
            return (0x4D ^ 0x7C) & ~(0x7A ^ 0x4B);
        }
        return lIllIIlIl[97];
    }

    private static boolean lIIlIllIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIlIllI(String llIlllIIllIllI, String llIlllIIllIlll) {
        try {
            SecretKeySpec llIlllIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllIIlllIlI = Cipher.getInstance("Blowfish");
            llIlllIIlllIlI.init(lIllIIlIl[3], llIlllIIlllIll);
            return new String(llIlllIIlllIlI.doFinal(Base64.getDecoder().decode(llIlllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIIlllIIl) {
            llIlllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIlIlllII() {
        lIllIIIll = new String[lIllIIlIl[112]];
        x.lIllIIIll[x.lIllIIlIl[1]] = x."Finished buying items, switching back to quest";
        x.lIllIIIll[x.lIllIIlIl[0]] = x."Nav to bank";
        x.lIllIIIll[x.lIllIIlIl[3]] = x."Handling banking";
        x.lIllIIIll[x.lIllIIlIl[11]] = x."We are missing quest supplies, switching to BUYING";
        x.lIllIIIll[x.lIllIIlIl[4]] = x."We are missing quest supplies, switching to BUYING";
        x.lIllIIIll[x.lIllIIlIl[12]] = x."Drink";
        x.lIllIIIll[x.lIllIIlIl[17]] = x."Drink";
        x.lIllIIIll[x.lIllIIlIl[18]] = x."Shark";
        x.lIllIIIll[x.lIllIIlIl[19]] = x."Shark";
        x.lIllIIIll[x.lIllIIlIl[20]] = x."Eat";
        x.lIllIIIll[x.lIllIIlIl[6]] = x."Nav to start";
        x.lIllIIIll[x.lIllIIlIl[21]] = x."Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[22]] = x."Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[25]] = x."Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[26]] = x."Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[10]] = x."Turn";
        x.lIllIIIll[x.lIllIIlIl[27]] = x."Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[30]] = x."Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[31]] = x."Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[32]] = x."Turn";
        x.lIllIIIll[x.lIllIIlIl[33]] = x."Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[36]] = x."Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[37]] = x."Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[38]] = x."Turn";
        x.lIllIIIll[x.lIllIIlIl[16]] = x."Turn it to the left.";
        x.lIllIIIll[x.lIllIIlIl[40]] = x."Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[41]] = x."Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[42]] = x."Turn";
        x.lIllIIIll[x.lIllIIlIl[43]] = x."Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[46]] = x."Nav to valve one";
        x.lIllIIIll[x.lIllIIlIl[47]] = x."Sewer valve";
        x.lIllIIIll[x.lIllIIlIl[48]] = x."Turn";
        x.lIllIIIll[x.lIllIIlIl[49]] = x."Turn it to the right.";
        x.lIllIIIll[x.lIllIIlIl[54]] = x."Nav to cave";
        x.lIllIIIll[x.lIllIIlIl[55]] = x."Cave entrance";
        x.lIllIIIll[x.lIllIIlIl[56]] = x."Enter";
        x.lIllIIIll[x.lIllIIlIl[57]] = x."Clivet";
        x.lIllIIIll[x.lIllIIlIl[58]] = x."Clivet";
        x.lIllIIIll[x.lIllIIlIl[61]] = x."Raft";
        x.lIllIIIll[x.lIllIIlIl[62]] = x."Board";
        x.lIllIIIll[x.lIllIIlIl[63]] = x."Cave entrance";
        x.lIllIIIll[x.lIllIIlIl[64]] = x."Enter";
        x.lIllIIIll[x.lIllIIlIl[65]] = x."Hazeel Cultist";
        x.lIllIIIll[x.lIllIIlIl[68]] = x."Nav to fight";
        x.lIllIIIll[x.lIllIIlIl[69]] = x."Alomone";
        x.lIllIIIll[x.lIllIIlIl[70]] = x."Talk-to";
        x.lIllIIIll[x.lIllIIlIl[71]] = x."Attack";
        x.lIllIIIll[x.lIllIIlIl[72]] = x."Alomone";
        x.lIllIIIll[x.lIllIIlIl[73]] = x."Attack";
        x.lIllIIIll[x.lIllIIlIl[74]] = x."Attack";
        x.lIllIIIll[x.lIllIIlIl[15]] = x."Carnillean armour";
        x.lIllIIIll[x.lIllIIlIl[75]] = x."Chest";
        x.lIllIIIll[x.lIllIIlIl[76]] = x."Search";
        x.lIllIIIll[x.lIllIIlIl[77]] = x."Search";
        x.lIllIIIll[x.lIllIIlIl[78]] = x."Carnillean armour";
        x.lIllIIIll[x.lIllIIlIl[79]] = x."Nav to start";
        x.lIllIIIll[x.lIllIIlIl[80]] = x."Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[81]] = x."Ceril Carnillean";
        x.lIllIIIll[x.lIllIIlIl[82]] = x."Butler Jones";
        x.lIllIIIll[x.lIllIIlIl[83]] = x."Staircase";
        x.lIllIIIll[x.lIllIIlIl[84]] = x."Climb-up";
        x.lIllIIIll[x.lIllIIlIl[85]] = x."Cupboard";
        x.lIllIIIll[x.lIllIIlIl[86]] = x."Open";
        x.lIllIIIll[x.lIllIIlIl[87]] = x."Open";
        x.lIllIIIll[x.lIllIIlIl[88]] = x."Search";
        x.lIllIIIll[x.lIllIIlIl[89]] = x."Search";
        x.lIllIIIll[x.lIllIIlIl[90]] = x."Break";
        x.lIllIIIll[x.lIllIIlIl[98]] = x."Hazeel Cult";
        x.lIllIIIll[x.lIllIIlIl[99]] = x."ring of wealth (";
        x.lIllIIIll[x.lIllIIlIl[100]] = x."teleport";
        x.lIllIIIll[x.lIllIIlIl[101]] = x."teleport";
        x.lIllIIIll[x.lIllIIlIl[107]] = x."Yes.";
        x.lIllIIIll[x.lIllIIlIl[108]] = x."What's wrong?";
        x.lIllIIIll[x.lIllIIlIl[109]] = x."Alright, I've made my decision.";
        x.lIllIIIll[x.lIllIIlIl[110]] = x."I won't help you. (side with Ceril)";
        x.lIllIIIll[x.lIllIIlIl[111]] = x."I won't help you.";
    }

    /*
     * WARNING - void declaration
     */
    private static boolean ab() {
        void llIlllIlIIIlll;
        int[] nArray = new int[lIllIIlIl[12]];
        nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
        nArray[x.lIllIIlIl[0]] = lIllIIlIl[5];
        nArray[x.lIllIIlIl[3]] = lIllIIlIl[13];
        nArray[x.lIllIIlIl[11]] = lIllIIlIl[7];
        nArray[x.lIllIIlIl[4]] = lIllIIlIl[14];
        int[] nArray2 = nArray;
        int llIlllIlIIIllI = lIllIIlIl[1];
        while (x.lIIlIllIIIII(llIlllIlIIIllI, ((void)llIlllIlIIIlll).length)) {
            int[] nArray3 = new int[lIllIIlIl[0]];
            nArray3[x.lIllIIlIl[1]] = llIlllIlIIIlll[llIlllIlIIIllI];
            if (x.lIIlIllIIIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIllIIlIl[1];
            }
            ++llIlllIlIIIllI;
            0;
            if (2 > 0) continue;
            return ((104 + 41 - 77 + 174 ^ 109 + 71 - 87 + 92) & (0x52 ^ 0x5E ^ (0x80 ^ 0xC7) ^ -1)) != 0;
        }
        return lIllIIlIl[0];
    }

    private static void lIIlIlIlllIl() {
        lIllIIlIl = new int[113];
        x.lIllIIlIl[0] = 1;
        x.lIllIIlIl[1] = (0xB8 ^ 0xB6) & ~(0xA1 ^ 0xAF);
        x.lIllIIlIl[2] = -(0xFFFFEF37 & 0x5CF9) & (0xFFFFFFBB & 0x5FFC);
        x.lIllIIlIl[3] = 2;
        x.lIllIIlIl[4] = 146 + 45 - 182 + 150 ^ 89 + 119 - 144 + 91;
        x.lIllIIlIl[5] = 0xFFFFFF7B & 0x1FCE;
        x.lIllIIlIl[6] = 0x55 ^ 0x12 ^ (0x53 ^ 0x1E);
        x.lIllIIlIl[7] = -(0xFFFFE69F & 0x1FEF) & (0xFFFFF7FF & 0x3FDF);
        x.lIllIIlIl[8] = -(0xFFFFE9E9 & 0x3677) & (0xFFFFA9FB & 0x7FE6);
        x.lIllIIlIl[9] = -(0xFFFFECBB & 0x33D5) & (0xFFFFBFD7 & Short.MAX_VALUE);
        x.lIllIIlIl[10] = 0x93 ^ 0x9C;
        x.lIllIIlIl[11] = 3;
        x.lIllIIlIl[12] = 0x7E ^ 0x7B;
        x.lIllIIlIl[13] = 0xFFFFBFDB & 0x5F6F;
        x.lIllIIlIl[14] = -(0xFFFFFEFB & 0x69CD) & (0xFFFFEDFB & Short.MAX_VALUE);
        x.lIllIIlIl[15] = 0xAB ^ 0x99;
        x.lIllIIlIl[16] = 0x96 ^ 0x89 ^ (0x59 ^ 0x5E);
        x.lIllIIlIl[17] = 0xA9 ^ 0xAF;
        x.lIllIIlIl[18] = 59 + 27 - 8 + 51 ^ 44 + 8 - 39 + 121;
        x.lIllIIlIl[19] = 0x41 ^ 0x49;
        x.lIllIIlIl[20] = 65 + 60 - 71 + 92 ^ 133 + 113 - 241 + 150;
        x.lIllIIlIl[21] = 0x7D ^ 0x76;
        x.lIllIIlIl[22] = 25 + 86 - 19 + 37 ^ 35 + 30 - -17 + 59;
        x.lIllIIlIl[23] = 0xFFFFFAD7 & 0xF29;
        x.lIllIIlIl[24] = 0xFFFFBFFF & 0x4CAF;
        x.lIllIIlIl[25] = 0x76 ^ 0x7B;
        x.lIllIIlIl[26] = 0x66 ^ 0x68;
        x.lIllIIlIl[27] = 0x27 ^ 0x37;
        x.lIllIIlIl[28] = -(0x6B ^ 0x2A) & (0xFFFFBE5F & 0x4BEB);
        x.lIllIIlIl[29] = -(0xFFFFFE67 & 0x71D9) & (0xFFFFFFFE & 0x7CFF);
        x.lIllIIlIl[30] = 0x87 ^ 0xAD ^ (0x5E ^ 0x65);
        x.lIllIIlIl[31] = 0x46 ^ 0x19 ^ (0x8A ^ 0xC7);
        x.lIllIIlIl[32] = 0x28 ^ 0x3B;
        x.lIllIIlIl[33] = 0xA9 ^ 0xBD;
        x.lIllIIlIl[34] = 0xFFFFDABE & 0x2F59;
        x.lIllIIlIl[35] = 0xFFFF8FBF & 0x7CEE;
        x.lIllIIlIl[36] = 11 + 114 - 111 + 141 ^ 18 + 82 - 55 + 97;
        x.lIllIIlIl[37] = 0x20 ^ 0x61 ^ (0x91 ^ 0xC6);
        x.lIllIIlIl[38] = 14 + 78 - 87 + 142 ^ 68 + 47 - 20 + 37;
        x.lIllIIlIl[39] = 0xFFFFEE75 & 0x1BAF;
        x.lIllIIlIl[40] = 0x3D ^ 0x31 ^ (0x8A ^ 0x9F);
        x.lIllIIlIl[41] = 0x79 ^ 0x63;
        x.lIllIIlIl[42] = 0x5B ^ 0x10 ^ (0xCA ^ 0x9A);
        x.lIllIIlIl[43] = 0x36 ^ 0x2A;
        x.lIllIIlIl[44] = -(0xFFFFEDDD & 0x37AB) & (0xFFFFBFBB & 0x6FFE);
        x.lIllIIlIl[45] = 0xFFFF8DEE & 0x7EBB;
        x.lIllIIlIl[46] = 0x46 ^ 0x11 ^ (0x62 ^ 0x28);
        x.lIllIIlIl[47] = 0xB6 ^ 0xA8;
        x.lIllIIlIl[48] = 0xA4 ^ 0xBB;
        x.lIllIIlIl[49] = 18 + 89 - -17 + 15 ^ 154 + 128 - 258 + 147;
        x.lIllIIlIl[50] = -(0xFFFFDEE7 & 0x35BA) & (0xFFFFDFFD & 0x3EBF);
        x.lIllIIlIl[51] = -(0xFFFFC1F9 & 0x7F5F) & (0xFFFFCDFF & 0x7FFD);
        x.lIllIIlIl[52] = 0xFFFFEF93 & 0x1A6C;
        x.lIllIIlIl[53] = 0xFFFFE7DF & 0x3DEB;
        x.lIllIIlIl[54] = 0xB7 ^ 0x96;
        x.lIllIIlIl[55] = 117 + 38 - 14 + 16 ^ 130 + 165 - 199 + 95;
        x.lIllIIlIl[56] = 0x71 ^ 0x52;
        x.lIllIIlIl[57] = 14 + 78 - 30 + 78 ^ 24 + 33 - -99 + 12;
        x.lIllIIlIl[58] = 0x7D ^ 0x70 ^ (0x7C ^ 0x54);
        x.lIllIIlIl[59] = -(0x44 ^ 0x75) & (0xFFFFDFF7 & 0x2A3F);
        x.lIllIIlIl[60] = 0xFFFFAFD3 & 0x75FD;
        x.lIllIIlIl[61] = 0x62 ^ 4 ^ (8 ^ 0x48);
        x.lIllIIlIl[62] = 0x48 ^ 0x6F;
        x.lIllIIlIl[63] = 0xEF ^ 0xC7;
        x.lIllIIlIl[64] = 0x8F ^ 0xA6;
        x.lIllIIlIl[65] = 0xC ^ 0x1B ^ (0xB5 ^ 0x88);
        x.lIllIIlIl[66] = 0xFFFFCB30 & 0x3EFF;
        x.lIllIIlIl[67] = 0xFFFFF5FF & 0x2FC8;
        x.lIllIIlIl[68] = 0xC3 ^ 0x80 ^ (0x3D ^ 0x55);
        x.lIllIIlIl[69] = 0x16 ^ 0xF ^ (0xB ^ 0x3E);
        x.lIllIIlIl[70] = 0xD2 ^ 0xC2 ^ (0x3E ^ 3);
        x.lIllIIlIl[71] = 5 ^ 0x2B;
        x.lIllIIlIl[72] = 0x37 ^ 0x7A ^ (0xA5 ^ 0xC7);
        x.lIllIIlIl[73] = 9 ^ 0x39;
        x.lIllIIlIl[74] = 0x78 ^ 0x28 ^ (0 ^ 0x61);
        x.lIllIIlIl[75] = 5 ^ 0x36;
        x.lIllIIlIl[76] = 0x9C ^ 0xA8;
        x.lIllIIlIl[77] = 0x52 ^ 0x67;
        x.lIllIIlIl[78] = 0x17 ^ 7 ^ (0x38 ^ 0x1E);
        x.lIllIIlIl[79] = 0xB ^ 0x65 ^ (0xED ^ 0xB4);
        x.lIllIIlIl[80] = 0x8C ^ 0xB4;
        x.lIllIIlIl[81] = 137 + 97 - 106 + 47 ^ 132 + 49 - 98 + 67;
        x.lIllIIlIl[82] = 0x5D ^ 0x61 ^ (0x37 ^ 0x31);
        x.lIllIIlIl[83] = 0x58 ^ 0xC ^ (0x74 ^ 0x1B);
        x.lIllIIlIl[84] = 0x66 ^ 0x1D ^ (1 ^ 0x46);
        x.lIllIIlIl[85] = 0xA4 ^ 0x99;
        x.lIllIIlIl[86] = 152 + 149 - 276 + 138 ^ 133 + 30 - 24 + 18;
        x.lIllIIlIl[87] = 0x5D ^ 0x62;
        x.lIllIIlIl[88] = 11 + 5 - -144 + 82 ^ 161 + 121 - 268 + 164;
        x.lIllIIlIl[89] = 0x58 ^ 0x19;
        x.lIllIIlIl[90] = 0x40 ^ 2;
        x.lIllIIlIl[91] = 0xFFFFDA5F & 0x77BC;
        x.lIllIIlIl[92] = 0xFFFFE7FF & 0x1DAA;
        x.lIllIIlIl[93] = -(0xFFFFBEF3 & 0x797E) & (0xFFFFBFFF & 0x7E7F);
        x.lIllIIlIl[94] = -(0xFFFFF72B & 0x18D5) & (0xFFFFFEFE & 0x3FCD);
        x.lIllIIlIl[95] = 0xFFFFF3BC & 0x6DEB;
        x.lIllIIlIl[96] = 0xFFFFCC74 & 0x73FF;
        x.lIllIIlIl[97] = 0xF ^ 0x6B;
        x.lIllIIlIl[98] = 0x46 ^ 5;
        x.lIllIIlIl[99] = 0x69 ^ 0x2D;
        x.lIllIIlIl[100] = 0xDA ^ 0xB2 ^ (0xEA ^ 0xC7);
        x.lIllIIlIl[101] = 3 ^ 0x45;
        x.lIllIIlIl[102] = -(0xFFFFA5F6 & 0x7E5F) & (0xFFFFEE7D & 0x3FDF);
        x.lIllIIlIl[103] = -(0xFFFFCA23 & 0x75FD) & (0xFFFFCFEF & 0x7CF7);
        x.lIllIIlIl[104] = 77 + 8 - -115 + 23;
        x.lIllIIlIl[105] = -(0xFFFFFEF9 & 0x75FF) & (0xFFFFFFFB & 0x7EFE);
        x.lIllIIlIl[106] = -(0xFFFFF7FB & 0x3B3E) & (0xFFFFBFFF & 0x7FFB);
        x.lIllIIlIl[107] = 0xF4 ^ 0xB3;
        x.lIllIIlIl[108] = 0x9D ^ 0x82 ^ (0xC4 ^ 0x93);
        x.lIllIIlIl[109] = 0x6B ^ 0x22;
        x.lIllIIlIl[110] = 0xEF ^ 0xA5;
        x.lIllIIlIl[111] = 157 + 60 - 213 + 196 ^ 114 + 69 - 96 + 44;
        x.lIllIIlIl[112] = 0xB9 ^ 0xA8 ^ (0x29 ^ 0x74);
    }

    private static void af() {
        block26: {
            d llIlllIlIIIIlI;
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                Object llIlllIlIIIIll;
                                block20: {
                                    block19: {
                                        block18: {
                                            block17: {
                                                int[] nArray = new int[lIllIIlIl[0]];
                                                nArray[x.lIllIIlIl[1]] = lIllIIlIl[14];
                                                if (x.lIIlIllIIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                                    d d2 = new d(lIllIIlIl[14], lIllIIlIl[0], lIllIIlIl[91]);
                                                    bv.add(d2);
                                                    0;
                                                }
                                                int[] nArray2 = new int[lIllIIlIl[0]];
                                                nArray2[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) break block17;
                                                int[] nArray3 = new int[lIllIIlIl[0]];
                                                nArray3[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                int[] nArray4 = new int[lIllIIlIl[0]];
                                                nArray4[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIlIl[6])) break block18;
                                            }
                                            llIlllIlIIIIll = new d(lIllIIlIl[5], lIllIIlIl[6], e.c(lIllIIlIl[92], lIllIIlIl[93]));
                                            bv.add((d)llIlllIlIIIIll);
                                            0;
                                        }
                                        int[] nArray = new int[lIllIIlIl[0]];
                                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[13];
                                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block19;
                                        int[] nArray5 = new int[lIllIIlIl[0]];
                                        nArray5[x.lIllIIlIl[1]] = lIllIIlIl[13];
                                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                        int[] nArray6 = new int[lIllIIlIl[0]];
                                        nArray6[x.lIllIIlIl[1]] = lIllIIlIl[13];
                                        if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray6).getQuantity(), lIllIIlIl[6])) break block20;
                                    }
                                    llIlllIlIIIIll = new d(lIllIIlIl[13], lIllIIlIl[6], e.c(lIllIIlIl[92], lIllIIlIl[93]));
                                    bv.add((d)llIlllIlIIIIll);
                                    0;
                                }
                                if (x.lIIlIllIIIIl(Bank.contains((Predicate)(llIlllIlIIIIll = item -> item.getName().toLowerCase().contains(lIllIIIll[lIllIIlIl[99]]))) ? 1 : 0)) {
                                    llIlllIlIIIIlI = new d(lIllIIlIl[94], lIllIIlIl[12], lIllIIlIl[95]);
                                    bv.add(llIlllIlIIIIlI);
                                    0;
                                }
                                int[] nArray = new int[lIllIIlIl[0]];
                                nArray[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block21;
                                int[] nArray7 = new int[lIllIIlIl[0]];
                                nArray7[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray7) ? 1 : 0)) break block22;
                                int[] nArray8 = new int[lIllIIlIl[0]];
                                nArray8[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray8).getQuantity(), lIllIIlIl[4])) break block22;
                            }
                            llIlllIlIIIIlI = new d(lIllIIlIl[7], lIllIIlIl[4], i.bq);
                            bv.add(llIlllIlIIIIlI);
                            0;
                        }
                        int[] nArray = new int[lIllIIlIl[0]];
                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[8];
                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                        int[] nArray9 = new int[lIllIIlIl[0]];
                        nArray9[x.lIllIIlIl[1]] = lIllIIlIl[8];
                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) break block24;
                        int[] nArray10 = new int[lIllIIlIl[0]];
                        nArray10[x.lIllIIlIl[1]] = lIllIIlIl[8];
                        if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray10).getQuantity(), lIllIIlIl[4])) break block24;
                    }
                    llIlllIlIIIIlI = new d(lIllIIlIl[8], lIllIIlIl[4], lIllIIlIl[96]);
                    bv.add(llIlllIlIIIIlI);
                    0;
                }
                int[] nArray = new int[lIllIIlIl[0]];
                nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                int[] nArray11 = new int[lIllIIlIl[0]];
                nArray11[x.lIllIIlIl[1]] = lIllIIlIl[9];
                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray11) ? 1 : 0)) break block26;
                int[] nArray12 = new int[lIllIIlIl[0]];
                nArray12[x.lIllIIlIl[1]] = lIllIIlIl[9];
                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray12).getQuantity(), lIllIIlIl[10])) break block26;
            }
            llIlllIlIIIIlI = new d(lIllIIlIl[9], lIllIIlIl[63], e.c(lIllIIlIl[92], lIllIIlIl[93]));
            bv.add(llIlllIlIIIIlI);
            0;
        }
    }

    @Override
    public boolean V() {
        int n2;
        if (x.lIIlIllIIlII(e.j(dj), lIllIIlIl[20]) && x.lIIlIllIIIIl(dk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = lIllIIlIl[0];
            0;
            if ((0xB6 ^ 0xAC ^ (0x46 ^ 0x58)) > (0xDC ^ 0xAF ^ (0xF8 ^ 0x8F))) {
                return ((0x27 ^ 0x18 ^ (0xE4 ^ 0x82)) & (70 + 22 - 31 + 147 ^ 113 + 54 - 114 + 84 ^ -1)) != 0;
            }
        } else {
            n2 = lIllIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIllIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String U() {
        return lIllIIIll[lIllIIlIl[98]];
    }

    private static boolean lIIlIllIIIlI(Object object) {
        return object != null;
    }

    private static String lIIlIlIlIlll(String llIlllIIlIIIll, String llIlllIIlIIlll) {
        llIlllIIlIIIll = new String(Base64.getDecoder().decode(llIlllIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIIlIIllI = new StringBuilder();
        char[] llIlllIIlIIlIl = llIlllIIlIIlll.toCharArray();
        int llIlllIIlIIlII = lIllIIlIl[1];
        char[] llIlllIIIllllI = llIlllIIlIIIll.toCharArray();
        int llIlllIIIlllIl = llIlllIIIllllI.length;
        int llIlllIIIlllII = lIllIIlIl[1];
        while (x.lIIlIllIIIII(llIlllIIIlllII, llIlllIIIlllIl)) {
            char llIlllIIlIlIIl = llIlllIIIllllI[llIlllIIIlllII];
            llIlllIIlIIllI.append((char)(llIlllIIlIlIIl ^ llIlllIIlIIlIl[llIlllIIlIIlII % llIlllIIlIIlIl.length]));
            0;
            ++llIlllIIlIIlII;
            ++llIlllIIIlllII;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(llIlllIIlIIllI);
    }

    private static boolean lIIlIllIIlIl(int n2) {
        return n2 < 0;
    }

    private static boolean lIIlIlIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIllIlIIl(Object object) {
        return object == null;
    }

    public static void aV() {
        block89: {
            BankLocation llIlllIlIIllll;
            block96: {
                WorldPoint llIlllIlIIllII;
                block97: {
                    WorldArea llIlllIlIIlllI;
                    block90: {
                        block95: {
                            block92: {
                                block94: {
                                    block93: {
                                        block91: {
                                            if (x.lIIlIlIlllll(bt ? 1 : 0)) {
                                                b.a(bv);
                                                if (x.lIIlIllIIIII(bv.size(), lIllIIlIl[0])) {
                                                    System.out.println(lIllIIIll[lIllIIlIl[1]]);
                                                    bt = lIllIIlIl[1];
                                                }
                                            }
                                            if (!x.lIIlIllIIIIl(bt ? 1 : 0)) break block89;
                                            if (!x.lIIlIllIIIIl(x.ab() ? 1 : 0) || !x.lIIlIllIIIII(e.j(dj), lIllIIlIl[0])) break block90;
                                            llIlllIlIIllll = BankLocation.getNearest();
                                            if (x.lIIlIllIIIlI(llIlllIlIIllll) && x.lIIlIllIIIIl(llIlllIlIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[0]];
                                                a.a(llIlllIlIIllll);
                                            }
                                            if (!x.lIIlIllIIIlI(llIlllIlIIllll) || !x.lIIlIlIlllll(llIlllIlIIllll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block90;
                                            if (x.lIIlIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIlIl[2]);
                                                0;
                                            }
                                            if (!x.lIIlIlIlllll(Bank.isOpen() ? 1 : 0)) break block90;
                                            AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[3]];
                                            if (x.lIIlIllIIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIllIIlIl[4]);
                                                0;
                                            }
                                            if (x.lIIlIllIIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIllIIlIl[3]);
                                                0;
                                            }
                                            int[] nArray = new int[lIllIIlIl[0]];
                                            nArray[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                            if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block91;
                                            int[] nArray2 = new int[lIllIIlIl[0]];
                                            nArray2[x.lIllIIlIl[1]] = lIllIIlIl[5];
                                            if (!x.lIIlIllIIlII(Bank.getFirst((int[])nArray2).getQuantity(), lIllIIlIl[6])) break block92;
                                        }
                                        int[] nArray = new int[lIllIIlIl[0]];
                                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                        if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block93;
                                        int[] nArray3 = new int[lIllIIlIl[0]];
                                        nArray3[x.lIllIIlIl[1]] = lIllIIlIl[7];
                                        if (!x.lIIlIllIIlII(Bank.getFirst((int[])nArray3).getQuantity(), lIllIIlIl[4])) break block92;
                                    }
                                    int[] nArray = new int[lIllIIlIl[0]];
                                    nArray[x.lIllIIlIl[1]] = lIllIIlIl[8];
                                    if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block94;
                                    int[] nArray4 = new int[lIllIIlIl[0]];
                                    nArray4[x.lIllIIlIl[1]] = lIllIIlIl[8];
                                    if (!x.lIIlIllIIlII(Bank.getFirst((int[])nArray4).getQuantity(), lIllIIlIl[4])) break block92;
                                }
                                int[] nArray = new int[lIllIIlIl[0]];
                                nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
                                if (!x.lIIlIlIlllll(Bank.contains((int[])nArray) ? 1 : 0)) break block95;
                                int[] nArray5 = new int[lIllIIlIl[0]];
                                nArray5[x.lIllIIlIl[1]] = lIllIIlIl[9];
                                if (!x.lIIlIllIIIII(Bank.getFirst((int[])nArray5).getQuantity(), lIllIIlIl[10])) break block95;
                            }
                            x.af();
                            System.out.println(lIllIIIll[lIllIIlIl[11]]);
                            bt = lIllIIlIl[0];
                            return;
                        }
                        int[] nArray = new int[lIllIIlIl[12]];
                        nArray[x.lIllIIlIl[1]] = lIllIIlIl[9];
                        nArray[x.lIllIIlIl[0]] = lIllIIlIl[5];
                        nArray[x.lIllIIlIl[3]] = lIllIIlIl[13];
                        nArray[x.lIllIIlIl[11]] = lIllIIlIl[7];
                        nArray[x.lIllIIlIl[4]] = lIllIIlIl[14];
                        if (x.lIIlIllIIIIl(e.b(nArray) ? 1 : 0)) {
                            x.af();
                            System.out.println(lIllIIIll[lIllIIlIl[4]]);
                            bt = lIllIIlIl[0];
                            return;
                        }
                        int[] nArray6 = new int[lIllIIlIl[12]];
                        nArray6[x.lIllIIlIl[1]] = lIllIIlIl[9];
                        nArray6[x.lIllIIlIl[0]] = lIllIIlIl[5];
                        nArray6[x.lIllIIlIl[3]] = lIllIIlIl[13];
                        nArray6[x.lIllIIlIl[11]] = lIllIIlIl[7];
                        nArray6[x.lIllIIlIl[4]] = lIllIIlIl[14];
                        if (x.lIIlIlIlllll(e.b(nArray6) ? 1 : 0)) {
                            a.a(lIllIIlIl[7], lIllIIlIl[4]);
                            a.a(lIllIIlIl[8], lIllIIlIl[3]);
                            a.a(lIllIIlIl[9], lIllIIlIl[6]);
                            a.a(lIllIIlIl[5], lIllIIlIl[6]);
                            a.a(lIllIIlIl[13], lIllIIlIl[6]);
                            a.a(lIllIIlIl[14], lIllIIlIl[0]);
                        }
                    }
                    if (x.lIIlIlIlllll(Inventory.contains((int[])f.aV) ? 1 : 0) && x.lIIlIllIIIII(Movement.getRunEnergy(), lIllIIlIl[15])) {
                        Inventory.getFirst((int[])f.aV).interact(lIllIIIll[lIllIIlIl[12]]);
                        Time.sleepTicks((int)lIllIIlIl[0]);
                        0;
                    }
                    if (x.lIIlIlIlllll(Inventory.contains((int[])f.aS) ? 1 : 0) && x.lIIlIllIIIII(Prayers.getPoints(), lIllIIlIl[16])) {
                        Inventory.getFirst((int[])f.aS).interact(lIllIIIll[lIllIIlIl[17]]);
                    }
                    if (x.lIIlIllIIlIl(x.lIIlIlIllllI(e.u(), 60.0))) {
                        String[] stringArray = new String[lIllIIlIl[0]];
                        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[18]];
                        if (x.lIIlIlIlllll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                            String[] stringArray2 = new String[lIllIIlIl[0]];
                            stringArray2[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[19]];
                            Inventory.getFirst((String[])stringArray2).interact(lIllIIIll[lIllIIlIl[20]]);
                            Time.sleepTicks((int)lIllIIlIl[3]);
                            0;
                        }
                    }
                    if (x.lIIlIlIlllll(x.ab() ? 1 : 0) && x.lIIlIllIIIIl(e.j(dj))) {
                        if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                            AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[6]];
                            if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo((WorldPoint)bX);
                            0;
                            Time.sleepTicks((int)lIllIIlIl[0]);
                            0;
                        }
                        if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                            String[] stringArray = new String[lIllIIlIl[0]];
                            stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[21]];
                            llIlllIlIIllll = NPCs.getNearest((String[])stringArray);
                            if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                                Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                                g.a(lIllIIIll[lIllIIlIl[22]], bR);
                            }
                        }
                    }
                    if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[3])) {
                        if (x.lIIlIllIIIIl(de ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[23], lIllIIlIl[24], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[25]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[26]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[10]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[27]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                    de = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIllIIIIl(df ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[28], lIllIIlIl[29], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[30]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[31]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[32]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[33]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                    df = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIllIIIIl(dg ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[34], lIllIIlIl[35], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[36]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[37]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[38]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[16]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                    dg = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIlIlllll(dg ? 1 : 0) && x.lIIlIllIIIIl(dh ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[39], lIllIIlIl[29], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[40]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[41]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[42]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[43]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                    dh = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIlIlllll(dg ? 1 : 0) && x.lIIlIlIlllll(dh ? 1 : 0) && x.lIIlIllIIIIl(di ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[44], lIllIIlIl[45], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[46]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[3])) {
                                if (x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[47]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[48]]);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                }
                                if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIllIIlIl[0]];
                                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[49]];
                                    g.a(stringArray);
                                    Time.sleepTicks((int)lIllIIlIl[11]);
                                    0;
                                    di = lIllIIlIl[0];
                                }
                            }
                        }
                        if (x.lIIlIlIlllll(de ? 1 : 0) && x.lIIlIlIlllll(df ? 1 : 0) && x.lIIlIlIlllll(dg ? 1 : 0) && x.lIIlIlIlllll(dh ? 1 : 0) && x.lIIlIlIlllll(di ? 1 : 0)) {
                            llIlllIlIIllll = new WorldPoint(lIllIIlIl[50], lIllIIlIl[51], lIllIIlIl[1]);
                            llIlllIlIIlllI = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                            if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[12]) && x.lIIlIllIIIIl(llIlllIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[54]];
                                Movement.walkTo((WorldPoint)llIlllIlIIllll);
                                0;
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIlllIlIIllll), lIllIIlIl[12])) {
                                String[] stringArray = new String[lIllIIlIl[0]];
                                stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[55]];
                                TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[56]]);
                                Time.sleepTicks((int)lIllIIlIl[4]);
                                0;
                            }
                            if (x.lIIlIlIlllll(llIlllIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                g.a(lIllIIIll[lIllIIlIl[57]], bR);
                            }
                        }
                    }
                    if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[11])) {
                        g.a(lIllIIIll[lIllIIlIl[58]], bR);
                    }
                    if (!x.lIIlIllIlIII(e.j(dj), lIllIIlIl[4])) break block96;
                    llIlllIlIIllll = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                    llIlllIlIIlllI = new WorldArea(lIllIIlIl[52], lIllIIlIl[53], lIllIIlIl[27], lIllIIlIl[26], lIllIIlIl[1]);
                    WorldPoint llIlllIlIIllIl = new WorldPoint(lIllIIlIl[50], lIllIIlIl[51], lIllIIlIl[1]);
                    llIlllIlIIllII = new WorldPoint(lIllIIlIl[59], lIllIIlIl[60], lIllIIlIl[1]);
                    if (x.lIIlIlIlllll(llIlllIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIlIl[0]];
                        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[61]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[62]]);
                        Time.sleepTicks((int)lIllIIlIl[11]);
                        0;
                    }
                    if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIllIl), lIllIIlIl[12])) {
                        String[] stringArray = new String[lIllIIlIl[0]];
                        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[63]];
                        TileObjects.getNearest((String[])stringArray).interact(lIllIIIll[lIllIIlIl[64]]);
                        Time.sleepTicks((int)lIllIIlIl[4]);
                        0;
                    }
                    if (!x.lIIlIllIIIIl(llIlllIlIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block97;
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[65]];
                    if (!x.lIIlIllIIIlI(NPCs.getNearest((String[])stringArray))) break block96;
                }
                WorldPoint llIlllIlIIlIll = new WorldPoint(lIllIIlIl[66], lIllIIlIl[67], lIllIIlIl[1]);
                if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIlIll), lIllIIlIl[12]) && x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIllII), lIllIIlIl[6])) {
                    AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[68]];
                    Movement.walkTo((WorldPoint)llIlllIlIIlIll);
                    0;
                    Time.sleepTicks((int)lIllIIlIl[0]);
                    0;
                }
                if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(llIlllIlIIlIll), lIllIIlIl[12])) {
                    if (x.lIIlIllIIlII(Skills.getLevel((Skill)Skill.PRAYER), lIllIIlIl[68]) && x.lIIlIllIIIll(Prayers.getPoints()) && x.lIIlIllIIIIl(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                        Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                    }
                    e.l(lIllIIlIl[14]);
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[69]];
                    NPC llIlllIlIIlIlI = NPCs.getNearest((String[])stringArray);
                    if (x.lIIlIllIIIlI(llIlllIlIIlIlI)) {
                        String[] stringArray3 = new String[lIllIIlIl[0]];
                        stringArray3[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[70]];
                        if (x.lIIlIlIlllll(llIlllIlIIlIlI.hasAction(stringArray3) ? 1 : 0)) {
                            String[] stringArray4 = new String[lIllIIlIl[0]];
                            stringArray4[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[71]];
                            if (x.lIIlIllIIIIl(llIlllIlIIlIlI.hasAction(stringArray4) ? 1 : 0)) {
                                g.a(lIllIIIll[lIllIIlIl[72]], bR);
                            }
                        }
                    }
                    if (x.lIIlIllIIIlI(llIlllIlIIlIlI)) {
                        String[] stringArray5 = new String[lIllIIlIl[0]];
                        stringArray5[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[73]];
                        if (x.lIIlIlIlllll(llIlllIlIIlIlI.hasAction(stringArray5) ? 1 : 0) && x.lIIlIllIlIIl(Players.getLocal().getInteracting())) {
                            llIlllIlIIlIlI.interact(lIllIIIll[lIllIIlIl[74]]);
                            Time.sleepTicks((int)lIllIIlIl[3]);
                            0;
                        }
                    }
                }
            }
            if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[17])) {
                if (x.lIIlIlIlllll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                }
                String[] stringArray = new String[lIllIIlIl[0]];
                stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[15]];
                if (x.lIIlIllIIIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray6 = new String[lIllIIlIl[0]];
                    stringArray6[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[75]];
                    llIlllIlIIllll = TileObjects.getNearest((String[])stringArray6);
                    if (x.lIIlIllIIIlI(llIlllIlIIllll)) {
                        String[] stringArray7 = new String[lIllIIlIl[0]];
                        stringArray7[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[76]];
                        if (x.lIIlIlIlllll(llIlllIlIIllll.hasAction(stringArray7) ? 1 : 0)) {
                            llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[77]]);
                            Time.sleepTicks((int)lIllIIlIl[12]);
                            0;
                        }
                    }
                }
                String[] stringArray8 = new String[lIllIIlIl[0]];
                stringArray8[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[78]];
                if (x.lIIlIlIlllll(Inventory.contains((String[])stringArray8) ? 1 : 0)) {
                    if (x.lIIlIllIIllI(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                        AccBuilderEasyClues.c = lIllIIIll[lIllIIlIl[79]];
                        if (x.lIIlIlIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo((WorldPoint)bX);
                        0;
                        Time.sleepTicks((int)lIllIIlIl[0]);
                        0;
                    }
                    if (x.lIIlIllIIlll(Players.getLocal().getWorldLocation().distanceTo(bX), lIllIIlIl[19])) {
                        String[] stringArray9 = new String[lIllIIlIl[0]];
                        stringArray9[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[80]];
                        llIlllIlIIllll = NPCs.getNearest((String[])stringArray9);
                        if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());
                            0;
                            Time.sleepTicks((int)lIllIIlIl[0]);
                            0;
                        }
                        if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            g.a(lIllIIIll[lIllIIlIl[81]], bR);
                        }
                    }
                }
            }
            if (x.lIIlIllIlIII(e.j(dj), lIllIIlIl[18])) {
                if (x.lIIlIllIIIIl(Players.getLocal().getWorldLocation().getPlane()) && x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[82]];
                    if (x.lIIlIllIIIlI(NPCs.getNearest((String[])stringArray))) {
                        String[] stringArray10 = new String[lIllIIlIl[0]];
                        stringArray10[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[83]];
                        llIlllIlIIllll = TileObjects.getNearest((String[])stringArray10);
                        if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());
                            0;
                            Time.sleepTicks((int)lIllIIlIl[0]);
                            0;
                        }
                        if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[84]]);
                        }
                    }
                }
                if (x.lIIlIllIlIII(Players.getLocal().getWorldLocation().getPlane(), lIllIIlIl[0])) {
                    if (x.lIIlIllIIIII(cl, lIllIIlIl[0])) {
                        an.mX += lIllIIlIl[0];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIllIIlIl[0];
                        an.mX = lIllIIlIl[1];
                    }
                    String[] stringArray = new String[lIllIIlIl[0]];
                    stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[85]];
                    llIlllIlIIllll = TileObjects.getNearest((String[])stringArray);
                    if (x.lIIlIllIIIlI(llIlllIlIIllll)) {
                        if (x.lIIlIllIIIIl(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0)) {
                            Movement.walkTo((WorldPoint)llIlllIlIIllll.getWorldLocation());
                            0;
                            Time.sleepTicks((int)lIllIIlIl[0]);
                            0;
                        }
                        if (x.lIIlIlIlllll(Reachable.isInteractable((Locatable)llIlllIlIIllll) ? 1 : 0) && x.lIIlIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] stringArray11 = new String[lIllIIlIl[0]];
                            stringArray11[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[86]];
                            if (x.lIIlIlIlllll(llIlllIlIIllll.hasAction(stringArray11) ? 1 : 0)) {
                                llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[87]]);
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                            String[] stringArray12 = new String[lIllIIlIl[0]];
                            stringArray12[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[88]];
                            if (x.lIIlIlIlllll(llIlllIlIIllll.hasAction(stringArray12) ? 1 : 0)) {
                                llIlllIlIIllll.interact(lIllIIIll[lIllIIlIl[89]]);
                                Time.sleepTicks((int)lIllIIlIl[0]);
                                0;
                            }
                        }
                    }
                }
            }
            if (x.lIIlIllIIlII(e.j(dj), lIllIIlIl[20]) && x.lIIlIlIlllll(dk.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && x.lIIlIlIlllll(Inventory.contains(item -> item.getName().contains(lIllIIIll[lIllIIlIl[101]])) ? 1 : 0)) {
                Inventory.getFirst(item -> item.getName().contains(lIllIIIll[lIllIIlIl[100]])).interact(lIllIIIll[lIllIIlIl[90]]);
                Time.sleepTicks((int)e.c(lIllIIlIl[17], lIllIIlIl[19]));
                0;
            }
            g.a(bR);
        }
    }

    private static String lIIlIlIllIII(String llIlllIIIlIIll, String llIlllIIIlIIII) {
        try {
            SecretKeySpec llIlllIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlllIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIllIIlIl[19]), "DES");
            Cipher llIlllIIIlIlIl = Cipher.getInstance("DES");
            llIlllIIIlIlIl.init(lIllIIlIl[3], llIlllIIIlIllI);
            return new String(llIlllIIIlIlIl.doFinal(Base64.getDecoder().decode(llIlllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllIIIlIlII) {
            llIlllIIIlIlII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIllIIlIl[1];
    }

    private static boolean lIIlIllIIIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIlIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        x.lIIlIlIlllIl();
        x.lIIlIlIlllII();
        bv = new ArrayList<d>();
        bX = new WorldPoint(lIllIIlIl[102], lIllIIlIl[103], lIllIIlIl[1]);
        dj = lIllIIlIl[104];
        dk = new WorldArea(lIllIIlIl[105], lIllIIlIl[106], lIllIIlIl[27], lIllIIlIl[21], lIllIIlIl[1]);
        String[] stringArray = new String[lIllIIlIl[12]];
        stringArray[x.lIllIIlIl[1]] = lIllIIIll[lIllIIlIl[107]];
        stringArray[x.lIllIIlIl[0]] = lIllIIIll[lIllIIlIl[108]];
        stringArray[x.lIllIIlIl[3]] = lIllIIIll[lIllIIlIl[109]];
        stringArray[x.lIllIIlIl[11]] = lIllIIIll[lIllIIlIl[110]];
        stringArray[x.lIllIIlIl[4]] = lIllIIIll[lIllIIlIl[111]];
        bR = stringArray;
    }
}

