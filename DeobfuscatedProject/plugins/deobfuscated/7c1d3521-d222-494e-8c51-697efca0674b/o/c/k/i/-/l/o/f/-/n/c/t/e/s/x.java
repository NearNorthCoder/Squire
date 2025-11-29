/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ab;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class x
implements ac {
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ boolean dB;
    private static /* synthetic */ WorldPoint dI;
    private static /* synthetic */ WorldPoint dL;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ WorldPoint dM;
    private static /* synthetic */ WorldPoint dG;
    private static /* synthetic */ String[] cE;
    public static /* synthetic */ boolean dA;
    public static /* synthetic */ boolean dE;
    private static /* synthetic */ WorldPoint dK;
    public static /* synthetic */ List<d> bv;
    static /* synthetic */ int di;
    private static /* synthetic */ String[] llIIIlllIl;
    public static /* synthetic */ boolean dC;
    public static /* synthetic */ boolean dD;
    static /* synthetic */ int dF;
    private static /* synthetic */ int[] llIIlIIIIl;
    private static /* synthetic */ WorldPoint dH;
    private static /* synthetic */ WorldPoint dJ;

    private static boolean lIlIlIIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public String ag() {
        return llIIIlllIl[llIIlIIIIl[78]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        String[] stringArray = new String[llIIlIIIIl[0]];
        stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[73]];
        if (x.lIlIlIIlIIIlI(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llIIlIIIIl[0]];
            nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
            if (x.lIlIlIIlIIIlI(Inventory.getCount((int[])nArray)) && x.lIlIlIIlIIIlI(Inventory.getCount((int[])f.ba))) {
                int[] nArray2 = new int[llIIlIIIIl[0]];
                nArray2[x.llIIlIIIIl[1]] = llIIlIIIIl[8];
                if (x.lIlIlIIlIIIlI(Inventory.getCount((int[])nArray2))) {
                    n2 = llIIlIIIIl[0];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x91 ^ 0xC2) & ~(0x3C ^ 0x6F)) != 0;
                }
            }
        }
        n2 = llIIlIIIIl[1];
        return n2 != 0;
    }

    private static void Q() {
        d llllllllllllllllllIlIlIIIIlIlIll;
        Object llllllllllllllllllIlIlIIIIlIllII;
        int[] nArray = new int[llIIlIIIIl[0]];
        nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[9];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIlIIIIl[9], llIIlIIIIl[12], llIIlIIIIl[74]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIlIIIIl[0]];
        nArray2[x.llIIlIIIIl[1]] = llIIlIIIIl[11];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIlIlIIIIlIllII = new d(llIIlIIIIl[11], llIIlIIIIl[13], j.cf);
            bv.add((d)llllllllllllllllllIlIlIIIIlIllII);
            0;
        }
        if (x.lIlIlIIIlllIl(Bank.contains(llllllllllllllllllIlIlIIIIlIllII = item -> item.getName().toLowerCase().contains(llIIIlllIl[llIIlIIIIl[80]])) ? 1 : 0)) {
            llllllllllllllllllIlIlIIIIlIlIll = new d(llIIlIIIIl[75], llIIlIIIIl[13], llIIlIIIIl[76]);
            bv.add(llllllllllllllllllIlIlIIIIlIlIll);
            0;
        }
        int[] nArray3 = new int[llIIlIIIIl[0]];
        nArray3[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIlIlIIIIlIlIll = new d(llIIlIIIIl[7], llIIlIIIIl[53], llIIlIIIIl[74]);
            bv.add(llllllllllllllllllIlIlIIIIlIlIll);
            0;
        }
        int[] nArray4 = new int[llIIlIIIIl[0]];
        nArray4[x.llIIlIIIIl[1]] = llIIlIIIIl[8];
        if (x.lIlIlIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIlIlIIIIlIlIll = new d(llIIlIIIIl[8], llIIlIIIIl[12], llIIlIIIIl[74]);
            bv.add(llllllllllllllllllIlIlIIIIlIlIll);
            0;
        }
    }

    @Override
    public int af() {
        try {
            x.bi();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x82 ^ 0xA6) & ~(0x59 ^ 0x7D)) != 0) {
            return (0x52 ^ 0x1B) & ~(0x11 ^ 0x58);
        }
        return llIIlIIIIl[77];
    }

    private static String lIlIIlllIllll(String llllllllllllllllllIlIlIIIIIllllI, String llllllllllllllllllIlIlIIIIIllIII) {
        llllllllllllllllllIlIlIIIIIllllI = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIlIIIIIlllII = new StringBuilder();
        char[] llllllllllllllllllIlIlIIIIIllIll = llllllllllllllllllIlIlIIIIIllIII.toCharArray();
        int llllllllllllllllllIlIlIIIIIllIlI = llIIlIIIIl[1];
        char[] llllllllllllllllllIlIlIIIIIlIlII = llllllllllllllllllIlIlIIIIIllllI.toCharArray();
        int llllllllllllllllllIlIlIIIIIlIIll = llllllllllllllllllIlIlIIIIIlIlII.length;
        int llllllllllllllllllIlIlIIIIIlIIlI = llIIlIIIIl[1];
        while (x.lIlIlIIIllIll(llllllllllllllllllIlIlIIIIIlIIlI, llllllllllllllllllIlIlIIIIIlIIll)) {
            char llllllllllllllllllIlIlIIIIIlllll = llllllllllllllllllIlIlIIIIIlIlII[llllllllllllllllllIlIlIIIIIlIIlI];
            llllllllllllllllllIlIlIIIIIlllII.append((char)(llllllllllllllllllIlIlIIIIIlllll ^ llllllllllllllllllIlIlIIIIIllIll[llllllllllllllllllIlIlIIIIIllIlI % llllllllllllllllllIlIlIIIIIllIll.length]));
            0;
            ++llllllllllllllllllIlIlIIIIIllIlI;
            ++llllllllllllllllllIlIlIIIIIlIIlI;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIlIIIIIlllII);
    }

    private static String lIlIIllllIIII(String llllllllllllllllllIlIlIIIIIIlIIl, String llllllllllllllllllIlIlIIIIIIIllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIlIIIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIlIIIIIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIlIIIIIIlIll.init(llIIlIIIIl[5], llllllllllllllllllIlIlIIIIIIllII);
            return new String(llllllllllllllllllIlIlIIIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIlIIIIIIlIlI) {
            llllllllllllllllllIlIlIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIlIIIIl(Object object) {
        return object != null;
    }

    public static void bj() {
        String[] stringArray = new String[llIIlIIIIl[0]];
        stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[66]];
        if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (x.lIlIlIIlIIIIl(Widgets.get((int)llIIlIIIIl[59]))) {
                Widget llllllllllllllllllIlIlIIIIlIllll;
                AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[67]];
                String[] stringArray2 = new String[llIIlIIIIl[0]];
                stringArray2[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[68]];
                Inventory.getFirst((String[])stringArray2).interact(llIIIlllIl[llIIlIIIIl[69]]);
                Time.sleepTicks((int)llIIlIIIIl[6]);
                0;
                AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[70]];
                Widget widget = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[27]);
                if (x.lIlIlIIlIIIIl(widget)) {
                    widget.interact(llIIIlllIl[llIIlIIIIl[71]]);
                    Time.sleepTicks((int)llIIlIIIIl[0]);
                    0;
                }
                if (x.lIlIlIIlIIIIl(llllllllllllllllllIlIlIIIIlIllll = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[39]))) {
                    llllllllllllllllllIlIlIIIIlIllll.interact(llIIIlllIl[llIIlIIIIl[72]]);
                    Time.sleepTicks((int)llIIlIIIIl[5]);
                    0;
                }
            }
            Time.sleepTicks((int)llIIlIIIIl[0]);
            0;
        }
    }

    private static void lIlIlIIIlIllI() {
        llIIlIIIIl = new int[126];
        x.llIIlIIIIl[0] = 1;
        x.llIIlIIIIl[1] = (0x4A ^ 0x57) & ~(0x32 ^ 0x2F);
        x.llIIlIIIIl[2] = 0x5C ^ 0x62 ^ (0x45 ^ 0x73);
        x.llIIlIIIIl[3] = -(0xFFFFBACF & 0x65FA) & (0xFFFFFBE9 & 0x7EFF);
        x.llIIlIIIIl[4] = -(0xFFFFED76 & 0x7ECF) & (0xFFFFFFEF & 0x7FDD);
        x.llIIlIIIIl[5] = 2;
        x.llIIlIIIIl[6] = 0x97 ^ 0x93;
        x.llIIlIIIIl[7] = -(0xFFFFE4BD & 0x5BD3) & (0xFFFFFFDF & 0x5FF7);
        x.llIIlIIIIl[8] = -(0xFFFFEEAF & 0x31D3) & (0xFFFFFFDF & 0x3FEB);
        x.llIIlIIIIl[9] = -(0xFFFFFFF7 & 0x76CD) & (0xFFFFF7FF & 0x7FFE);
        x.llIIlIIIIl[10] = 3;
        x.llIIlIIIIl[11] = -(0xFFFFDFFF & 0x6CAB) & (0xFFFFFDFB & Short.MAX_VALUE);
        x.llIIlIIIIl[12] = 0x64 ^ 0x41 ^ (0x52 ^ 0x7D);
        x.llIIlIIIIl[13] = 0x41 ^ 0x44;
        x.llIIlIIIIl[14] = 0xFFFFD77B & 0x29FF;
        x.llIIlIIIIl[15] = 0xE ^ 2;
        x.llIIlIIIIl[16] = 0xE8 ^ 0xA9;
        x.llIIlIIIIl[17] = 0x5F ^ 0x59;
        x.llIIlIIIIl[18] = 0x9E ^ 0x87 ^ (0x1C ^ 2);
        x.llIIlIIIIl[19] = 0xFFFFF5FE & 0x1FF5;
        x.llIIlIIIIl[20] = -(0xFFFFFCAD & 0x2B53) & (0xFFFFBFF5 & 0x7DFF);
        x.llIIlIIIIl[21] = -(0xB2 ^ 0xBB) & (0xFFFFBDFE & 0x57FF);
        x.llIIlIIIIl[22] = -(0xFFFFFAEB & 0x671D) & (0xFFFFF7FF & Short.MAX_VALUE);
        x.llIIlIIIIl[23] = -(0xFFFFDB55 & 0x6EAF) & (0xFFFFDFFD & 0x7FFE);
        x.llIIlIIIIl[24] = 0x70 ^ 0x30 ^ (0x54 ^ 0x1D);
        x.llIIlIIIIl[25] = 0x37 ^ 0x3C;
        x.llIIlIIIIl[26] = 0x89 ^ 0x84;
        x.llIIlIIIIl[27] = 0x15 ^ 0x36 ^ (0x19 ^ 0x34);
        x.llIIlIIIIl[28] = 0x74 ^ 0x6D ^ (1 ^ 0x17);
        x.llIIlIIIIl[29] = 0x4E ^ 0x5A ^ (0x76 ^ 0x72);
        x.llIIlIIIIl[30] = 0xA ^ 0x1B;
        x.llIIlIIIIl[31] = 0xC9 ^ 0xA8 ^ (0xD4 ^ 0xA7);
        x.llIIlIIIIl[32] = 0xAC ^ 0x98 ^ (0x7F ^ 0x58);
        x.llIIlIIIIl[33] = 0x88 ^ 0x9C;
        x.llIIlIIIIl[34] = 53 + 172 - 149 + 104 ^ 136 + 90 - 71 + 6;
        x.llIIlIIIIl[35] = 0x32 ^ 0x24;
        x.llIIlIIIIl[36] = 0x1B ^ 0x5E ^ (0xF1 ^ 0xA3);
        x.llIIlIIIIl[37] = 155 + 37 - 80 + 60 ^ 163 + 122 - 183 + 78;
        x.llIIlIIIIl[38] = 0x23 ^ 0x3A;
        x.llIIlIIIIl[39] = 0x21 ^ 0x55 ^ (0xFD ^ 0x93);
        x.llIIlIIIIl[40] = 48 + 120 - 47 + 40 ^ 80 + 169 - 247 + 184;
        x.llIIlIIIIl[41] = 55 + 192 - 49 + 20 ^ 51 + 101 - 55 + 101;
        x.llIIlIIIIl[42] = 0xA1 ^ 0x8F ^ (0x26 ^ 0x15);
        x.llIIlIIIIl[43] = 0x8C ^ 0x92;
        x.llIIlIIIIl[44] = 0x67 ^ 0x78;
        x.llIIlIIIIl[45] = 0x72 ^ 0x1D ^ (0x70 ^ 0x3F);
        x.llIIlIIIIl[46] = 0x26 ^ 7;
        x.llIIlIIIIl[47] = 0x7F ^ 0x37 ^ (0xAA ^ 0xC0);
        x.llIIlIIIIl[48] = 122 + 59 - 93 + 72 ^ 26 + 82 - -12 + 11;
        x.llIIlIIIIl[49] = 0x2F ^ 0xB;
        x.llIIlIIIIl[50] = 8 ^ 0x2D;
        x.llIIlIIIIl[51] = 0x99 ^ 0xBF;
        x.llIIlIIIIl[52] = 18 + 82 - 63 + 115 ^ 68 + 81 - 47 + 89;
        x.llIIlIIIIl[53] = 0x17 ^ 0x60 ^ (0x10 ^ 0x4F);
        x.llIIlIIIIl[54] = 0x68 ^ 0x41;
        x.llIIlIIIIl[55] = 0x53 ^ 0x79;
        x.llIIlIIIIl[56] = 0x21 ^ 0xA;
        x.llIIlIIIIl[57] = 0x57 ^ 0x7B;
        x.llIIlIIIIl[58] = 77 + 54 - -9 + 9 ^ 75 + 47 - 61 + 123;
        x.llIIlIIIIl[59] = 178 + 165 - 265 + 162;
        x.llIIlIIIIl[60] = 0x20 ^ 3 ^ (0x55 ^ 0x58);
        x.llIIlIIIIl[61] = 0x11 ^ 0x3E;
        x.llIIlIIIIl[62] = 0x49 ^ 0xA ^ (0x64 ^ 0x17);
        x.llIIlIIIIl[63] = 0x3E ^ 0xF;
        x.llIIlIIIIl[64] = 0xE ^ 0x19 ^ (0x24 ^ 1);
        x.llIIlIIIIl[65] = 0x37 ^ 4;
        x.llIIlIIIIl[66] = 0x3C ^ 8;
        x.llIIlIIIIl[67] = 0 ^ 0x35;
        x.llIIlIIIIl[68] = 0xE1 ^ 0xB7 ^ (0x7E ^ 0x1E);
        x.llIIlIIIIl[69] = 0xEE ^ 0x8B ^ (0x7D ^ 0x2F);
        x.llIIlIIIIl[70] = 0xB3 ^ 0x8B;
        x.llIIlIIIIl[71] = 0xB9 ^ 0x80;
        x.llIIlIIIIl[72] = 0x6F ^ 0x55;
        x.llIIlIIIIl[73] = 0x89 ^ 0xB2;
        x.llIIlIIIIl[74] = -(0xFFFFEC7B & 0x7FD6) & (0xFFFFEFFF & 0x7FD5);
        x.llIIlIIIIl[75] = 0xFFFFEEEE & 0x3FDD;
        x.llIIlIIIIl[76] = -(0xFFFFC95F & 0x3EE5) & (0xFFFFFBEE & 0x6DFD);
        x.llIIlIIIIl[77] = 25 + 4 - 0 + 136 ^ 189 + 37 - 101 + 68;
        x.llIIlIIIIl[78] = 0x23 ^ 0x1F;
        x.llIIlIIIIl[79] = 0x46 ^ 0x7B;
        x.llIIlIIIIl[80] = 0x9B ^ 0xAA ^ (0x2A ^ 0x25);
        x.llIIlIIIIl[81] = 0xB ^ 0x32 ^ (0x16 ^ 0x10);
        x.llIIlIIIIl[82] = 166 + 90 - 214 + 195 ^ 27 + 105 - 93 + 134;
        x.llIIlIIIIl[83] = 0x5C ^ 0x1E;
        x.llIIlIIIIl[84] = 188 + 30 - 8 + 36 ^ 147 + 173 - 232 + 93;
        x.llIIlIIIIl[85] = 61 + 128 - 39 + 87 ^ 113 + 36 - 23 + 43;
        x.llIIlIIIIl[86] = 0xE3 ^ 0xA6;
        x.llIIlIIIIl[87] = 0xB1 ^ 0x84 ^ (0x3C ^ 0x4F);
        x.llIIlIIIIl[88] = 84 + 113 - 172 + 192 ^ 139 + 70 - 52 + 1;
        x.llIIlIIIIl[89] = 29 + 19 - 18 + 112 ^ 155 + 88 - 172 + 127;
        x.llIIlIIIIl[90] = 0x7F ^ 0x36;
        x.llIIlIIIIl[91] = -(0xFFFFDFBD & 0x78CF) & (0xFFFFDFFD & 0x7FAF);
        x.llIIlIIIIl[92] = -(0xFFFFBEC7 & 0x713A) & (0xFFFFFEEB & 0x3F7F);
        x.llIIlIIIIl[93] = -(0xFFFFFCDD & 0x7B73) & (0xFFFFFFDF & 0x7F7F);
        x.llIIlIIIIl[94] = 0xFFFF9EDF & 0x6FAE;
        x.llIIlIIIIl[95] = 0xFFFF87FF & 0x7EB7;
        x.llIIlIIIIl[96] = 0xFFFFCEAD & 0x3FDF;
        x.llIIlIIIIl[97] = -(0xFFFFBFF1 & 0x51FF) & (0xFFFFFFFF & 0x17FF);
        x.llIIlIIIIl[98] = -(0xFFFFE365 & 0x7DDB) & (0xFFFFEFF5 & 0x7FEF);
        x.llIIlIIIIl[99] = -(0xFFFFEA4E & 0x3FBD) & (0xFFFFEFFB & 0x3FFF);
        x.llIIlIIIIl[100] = 0xFFFFAF0F & 0x5EF7;
        x.llIIlIIIIl[101] = -(0xFFFFFB3E & 0x75C3) & (0xFFFFFFEF & 0x77FF);
        x.llIIlIIIIl[102] = 0xFFFFEFDF & 0x1E24;
        x.llIIlIIIIl[103] = -(0xFFFFF967 & 0x5FDF) & (0xFFFFFFFE & 0x5FF7);
        x.llIIlIIIIl[104] = -(0xFFFFB451 & 0x7BFF) & (0xFFFFBFFB & 0x7F7F);
        x.llIIlIIIIl[105] = 3 ^ 0x49;
        x.llIIlIIIIl[106] = 2 ^ 0x49;
        x.llIIlIIIIl[107] = 0xFE ^ 0xB2;
        x.llIIlIIIIl[108] = 0x32 ^ 4 ^ (0xDA ^ 0xA1);
        x.llIIlIIIIl[109] = 61 + 231 - 271 + 230 ^ 171 + 16 - 144 + 138;
        x.llIIlIIIIl[110] = 0x17 ^ 0x58;
        x.llIIlIIIIl[111] = 0x49 ^ 0x3D ^ (0x3E ^ 0x1A);
        x.llIIlIIIIl[112] = 0x6B ^ 0x6D ^ (0xE5 ^ 0xB2);
        x.llIIlIIIIl[113] = 138 + 39 - 52 + 25 ^ 109 + 166 - 213 + 134;
        x.llIIlIIIIl[114] = 160 + 31 - 58 + 65 ^ 130 + 109 - 139 + 49;
        x.llIIlIIIIl[115] = 0xD7 ^ 0x83;
        x.llIIlIIIIl[116] = 0xF3 ^ 0xA6;
        x.llIIlIIIIl[117] = 0xD2 ^ 0x84;
        x.llIIlIIIIl[118] = 0xE6 ^ 0xB1;
        x.llIIlIIIIl[119] = 1 ^ 0x42 ^ (0x9E ^ 0x85);
        x.llIIlIIIIl[120] = 0xF0 ^ 0xA9;
        x.llIIlIIIIl[121] = 0xD9 ^ 0x83;
        x.llIIlIIIIl[122] = 0x4B ^ 0x10;
        x.llIIlIIIIl[123] = 0xD0 ^ 0x8C;
        x.llIIlIIIIl[124] = 0xB0 ^ 0xA1 ^ (0xCB ^ 0x87);
        x.llIIlIIIIl[125] = 0xE1 ^ 0xBF;
    }

    private static String lIlIIlllIlllI(String llllllllllllllllllIlIIlllllllIlI, String llllllllllllllllllIlIIlllllllIll) {
        try {
            SecretKeySpec llllllllllllllllllIlIIllllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIlllllllIll.getBytes(StandardCharsets.UTF_8)), llIIlIIIIl[2]), "DES");
            Cipher llllllllllllllllllIlIIlllllllllI = Cipher.getInstance("DES");
            llllllllllllllllllIlIIlllllllllI.init(llIIlIIIIl[5], llllllllllllllllllIlIIllllllllll);
            return new String(llllllllllllllllllIlIIlllllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIIllllllllIl) {
            llllllllllllllllllIlIIllllllllIl.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIIlIIIIl[1];
    }

    private static boolean lIlIlIIlIIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ah() {
        int n2;
        if (x.lIlIlIIIlllll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[24])) {
            String[] stringArray = new String[llIIlIIIIl[0]];
            stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[79]];
            if (x.lIlIlIIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llIIlIIIIl[0];
                0;
                if (((106 + 94 - 174 + 202 ^ 136 + 50 - 181 + 165) & (200 + 75 - 121 + 100 ^ 154 + 167 - 249 + 104 ^ -1)) == 0) return n2 != 0;
                return ((46 + 145 - 110 + 97 ^ 20 + 138 - 22 + 10) & (0x22 ^ 0x41 ^ (0x7B ^ 0x38) ^ -1)) != 0;
            }
        }
        n2 = llIIlIIIIl[1];
        return n2 != 0;
    }

    private static void lIlIlIIIlIIIl() {
        llIIIlllIl = new String[llIIlIIIIl[125]];
        x.llIIIlllIl[x.llIIlIIIIl[1]] = x."Finished buying items, switching back to quest";
        x.llIIIlllIl[x.llIIlIIIIl[0]] = x."Nav to bank";
        x.llIIIlllIl[x.llIIlIIIIl[5]] = x."Handling banking";
        x.llIIIlllIl[x.llIIlIIIIl[10]] = x."We are missing quest supplies, switching to BUYING";
        x.llIIIlllIl[x.llIIlIIIIl[6]] = x."Eat";
        x.llIIIlllIl[x.llIIlIIIIl[13]] = x."Drink";
        x.llIIIlllIl[x.llIIlIIIIl[17]] = x."Nav to start";
        x.llIIIlllIl[x.llIIlIIIIl[18]] = x."Starting quest";
        x.llIIIlllIl[x.llIIlIIIIl[2]] = x."Veos";
        x.llIIIlllIl[x.llIIlIIIIl[24]] = x."Enchanted scroll";
        x.llIIIlllIl[x.llIIlIIIIl[12]] = x."Feather";
        x.llIIIlllIl[x.llIIlIIIIl[25]] = x."Enchanted quill";
        x.llIIIlllIl[x.llIIlIIIIl[15]] = x."Enchanted scroll";
        x.llIIIlllIl[x.llIIlIIIIl[26]] = x."Feather";
        x.llIIIlllIl[x.llIIlIIIIl[27]] = x."Enchanted quill";
        x.llIIIlllIl[x.llIIlIIIIl[28]] = x."Nav to pisc tile";
        x.llIIIlllIl[x.llIIlIIIIl[29]] = x."Talking pisc";
        x.llIIIlllIl[x.llIIlIIIIl[30]] = x."Leenz";
        x.llIIIlllIl[x.llIIlIIIIl[31]] = x."Finished pisc";
        x.llIIIlllIl[x.llIIlIIIIl[32]] = x."Nav to arc tile";
        x.llIIIlllIl[x.llIIlIIIIl[33]] = x."Talking arc";
        x.llIIIlllIl[x.llIIlIIIIl[34]] = x."Regath";
        x.llIIIlllIl[x.llIIlIIIIl[35]] = x."Finished arc";
        x.llIIIlllIl[x.llIIlIIIIl[36]] = x."Nav to lova tile";
        x.llIIIlllIl[x.llIIlIIIIl[37]] = x."Talking lova";
        x.llIIIlllIl[x.llIIlIIIIl[38]] = x."Munty";
        x.llIIIlllIl[x.llIIlIIIIl[39]] = x."Finished munty";
        x.llIIIlllIl[x.llIIlIIIIl[40]] = x."Nav to shyzien tile";
        x.llIIIlllIl[x.llIIlIIIIl[41]] = x."Talking shyzien";
        x.llIIIlllIl[x.llIIlIIIIl[42]] = x."Jennifer";
        x.llIIIlllIl[x.llIIlIIIIl[43]] = x."Finished shyzien";
        x.llIIIlllIl[x.llIIlIIIIl[44]] = x."Nav to hosidius tile";
        x.llIIIlllIl[x.llIIlIIIIl[45]] = x."Talking hosidius";
        x.llIIIlllIl[x.llIIlIIIIl[46]] = x."Horace";
        x.llIIIlllIl[x.llIIlIIIIl[47]] = x."Finished hosidius";
        x.llIIIlllIl[x.llIIlIIIIl[48]] = x."Nav to start";
        x.llIIIlllIl[x.llIIlIIIIl[49]] = x."talking veos";
        x.llIIIlllIl[x.llIIlIIIIl[50]] = x."Veos";
        x.llIIIlllIl[x.llIIlIIIIl[51]] = x."Nav to dark altar";
        x.llIIIlllIl[x.llIIlIIIIl[52]] = x."Mysterious orb";
        x.llIIIlllIl[x.llIIlIIIIl[53]] = x."Mysterious orb";
        x.llIIIlllIl[x.llIIlIIIIl[54]] = x."Activate";
        x.llIIIlllIl[x.llIIlIIIIl[55]] = x."Nav to start";
        x.llIIIlllIl[x.llIIlIIIIl[56]] = x."talking veos";
        x.llIIIlllIl[x.llIIlIIIIl[57]] = x."Veos";
        x.llIIIlllIl[x.llIIlIIIIl[58]] = x."Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[60]] = x."Rubbing lamp";
        x.llIIIlllIl[x.llIIlIIIIl[61]] = x."Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[62]] = x."Rub";
        x.llIIIlllIl[x.llIIlIIIIl[63]] = x."Selecting slayer";
        x.llIIIlllIl[x.llIIlIIIIl[64]] = x."Slayer";
        x.llIIIlllIl[x.llIIlIIIIl[65]] = x."Confirm";
        x.llIIIlllIl[x.llIIlIIIIl[66]] = x."Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[67]] = x."Rubbing lamp";
        x.llIIIlllIl[x.llIIlIIIIl[68]] = x."Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[69]] = x."Rub";
        x.llIIIlllIl[x.llIIlIIIIl[70]] = x."Selecting slayer";
        x.llIIIlllIl[x.llIIlIIIIl[71]] = x."Slayer";
        x.llIIIlllIl[x.llIIlIIIIl[72]] = x."Confirm";
        x.llIIIlllIl[x.llIIlIIIIl[73]] = x."Feather";
        x.llIIIlllIl[x.llIIlIIIIl[78]] = x."Client of Kourend";
        x.llIIIlllIl[x.llIIlIIIIl[79]] = x."Antique lamp";
        x.llIIIlllIl[x.llIIlIIIIl[80]] = x."ring of wealth (";
        x.llIIIlllIl[x.llIIlIIIIl[81]] = x."Can I ask you about Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[82]] = x."let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[16]] = x."Let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[83]] = x."Can I ask you about Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[84]] = x."Let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[85]] = x."Can I ask you about Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[86]] = x."Let's trade.";
        x.llIIIlllIl[x.llIIlIIIIl[87]] = x."Can I ask you about Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[88]] = x."I don't need anything.";
        x.llIIIlllIl[x.llIIlIIIIl[89]] = x."Can I ask you about Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[90]] = x."I don't need anything right now.";
        x.llIIIlllIl[x.llIIlIIIIl[105]] = x."Have you got any quests for me?";
        x.llIIIlllIl[x.llIIlIIIIl[106]] = x."Yes.";
        x.llIIIlllIl[x.llIIlIIIIl[107]] = x."yes.";
        x.llIIIlllIl[x.llIIlIIIIl[108]] = x."Can I ask you about Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[109]] = x."Why should I gain favour with Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[110]] = x."Can I ask you about Port Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[111]] = x."Can I ask you about Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[112]] = x."Why should I gain favour with Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[113]] = x."Can I ask you about Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[114]] = x."Why should I gain favour with Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[115]] = x."Can I ask you about Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[116]] = x."Why should I gain favour with Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[117]] = x."Can I ask you about Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[118]] = x."Why should I gain favour with Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[119]] = x."What is there to do in Port Piscarilius?";
        x.llIIIlllIl[x.llIIlIIIIl[120]] = x."What is there to do in Arceuus?";
        x.llIIIlllIl[x.llIIlIIIIl[121]] = x."What is there to do in Lovakengj?";
        x.llIIIlllIl[x.llIIlIIIIl[122]] = x."What is there to do in Shayzien?";
        x.llIIIlllIl[x.llIIlIIIIl[123]] = x."What is there to do in Hosidius?";
        x.llIIIlllIl[x.llIIlIIIIl[124]] = x."Let's talk about your client...";
    }

    private static boolean lIlIlIIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIIlIIIlI(int n2) {
        return n2 > 0;
    }

    static {
        x.lIlIlIIIlIllI();
        x.lIlIlIIIlIIIl();
        bv = new ArrayList<d>();
        dF = llIIlIIIIl[1];
        dG = new WorldPoint(llIIlIIIIl[91], llIIlIIIIl[92], llIIlIIIIl[1]);
        dH = new WorldPoint(llIIlIIIIl[93], llIIlIIIIl[94], llIIlIIIIl[1]);
        dI = new WorldPoint(llIIlIIIIl[95], llIIlIIIIl[96], llIIlIIIIl[1]);
        dJ = new WorldPoint(llIIlIIIIl[97], llIIlIIIIl[98], llIIlIIIIl[1]);
        dK = new WorldPoint(llIIlIIIIl[99], llIIlIIIIl[100], llIIlIIIIl[1]);
        dL = new WorldPoint(llIIlIIIIl[101], llIIlIIIIl[102], llIIlIIIIl[1]);
        dM = new WorldPoint(llIIlIIIIl[103], llIIlIIIIl[104], llIIlIIIIl[1]);
        String[] stringArray = new String[llIIlIIIIl[33]];
        stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[105]];
        stringArray[x.llIIlIIIIl[0]] = llIIIlllIl[llIIlIIIIl[106]];
        stringArray[x.llIIlIIIIl[5]] = llIIIlllIl[llIIlIIIIl[107]];
        stringArray[x.llIIlIIIIl[10]] = llIIIlllIl[llIIlIIIIl[108]];
        stringArray[x.llIIlIIIIl[6]] = llIIIlllIl[llIIlIIIIl[109]];
        stringArray[x.llIIlIIIIl[13]] = llIIIlllIl[llIIlIIIIl[110]];
        stringArray[x.llIIlIIIIl[17]] = llIIIlllIl[llIIlIIIIl[111]];
        stringArray[x.llIIlIIIIl[18]] = llIIIlllIl[llIIlIIIIl[112]];
        stringArray[x.llIIlIIIIl[2]] = llIIIlllIl[llIIlIIIIl[113]];
        stringArray[x.llIIlIIIIl[24]] = llIIIlllIl[llIIlIIIIl[114]];
        stringArray[x.llIIlIIIIl[12]] = llIIIlllIl[llIIlIIIIl[115]];
        stringArray[x.llIIlIIIIl[25]] = llIIIlllIl[llIIlIIIIl[116]];
        stringArray[x.llIIlIIIIl[15]] = llIIIlllIl[llIIlIIIIl[117]];
        stringArray[x.llIIlIIIIl[26]] = llIIIlllIl[llIIlIIIIl[118]];
        stringArray[x.llIIlIIIIl[27]] = llIIIlllIl[llIIlIIIIl[119]];
        stringArray[x.llIIlIIIIl[28]] = llIIIlllIl[llIIlIIIIl[120]];
        stringArray[x.llIIlIIIIl[29]] = llIIIlllIl[llIIlIIIIl[121]];
        stringArray[x.llIIlIIIIl[30]] = llIIIlllIl[llIIlIIIIl[122]];
        stringArray[x.llIIlIIIIl[31]] = llIIIlllIl[llIIlIIIIl[123]];
        stringArray[x.llIIlIIIIl[32]] = llIIIlllIl[llIIlIIIIl[124]];
        cE = stringArray;
    }

    public static void bi() {
        block80: {
            Widget llllllllllllllllllIlIlIIIIllIllI;
            Object llllllllllllllllllIlIlIIIIllIlll;
            block82: {
                block81: {
                    if (x.lIlIlIIIllIII(bt ? 1 : 0)) {
                        b.a(bv);
                        if (x.lIlIlIIIllIll(bv.size(), llIIlIIIIl[0])) {
                            System.out.println(llIIIlllIl[llIIlIIIIl[1]]);
                            bt = llIIlIIIIl[1];
                        }
                    }
                    if (!x.lIlIlIIIlllIl(bt ? 1 : 0)) break block80;
                    if (!x.lIlIlIIIlllll(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) break block81;
                    int[] nArray = new int[llIIlIIIIl[0]];
                    nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[3];
                    if (!x.lIlIlIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                ab.ex();
            }
            if (x.lIlIlIIIlllIl(x.an() ? 1 : 0) && x.lIlIlIIIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0]) && x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] nArray = new int[llIIlIIIIl[0]];
                nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[3];
                if (x.lIlIlIIIlllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    llllllllllllllllllIlIlIIIIllIlll = BankLocation.getNearest();
                    if (x.lIlIlIIlIIIIl(llllllllllllllllllIlIlIIIIllIlll) && x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[0]];
                        a.a((BankLocation)llllllllllllllllllIlIlIIIIllIlll);
                    }
                    if (x.lIlIlIIlIIIIl(llllllllllllllllllIlIlIIIIllIlll) && x.lIlIlIIIllIII(llllllllllllllllllIlIlIIIIllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (x.lIlIlIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIlIIIIl[4]);
                            0;
                        }
                        if (x.lIlIlIIIllIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[5]];
                            if (x.lIlIlIIlIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIlIIIIl[6]);
                                0;
                            }
                            if (x.lIlIlIIlIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIlIIIIl[5]);
                                0;
                            }
                            int[] nArray2 = new int[llIIlIIIIl[6]];
                            nArray2[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
                            nArray2[x.llIIlIIIIl[0]] = llIIlIIIIl[8];
                            nArray2[x.llIIlIIIIl[5]] = llIIlIIIIl[9];
                            nArray2[x.llIIlIIIIl[10]] = llIIlIIIIl[11];
                            if (x.lIlIlIIIlllIl(e.c(nArray2) ? 1 : 0)) {
                                x.Q();
                                System.out.println(llIIIlllIl[llIIlIIIIl[10]]);
                                bt = llIIlIIIIl[0];
                                return;
                            }
                            int[] nArray3 = new int[llIIlIIIIl[6]];
                            nArray3[x.llIIlIIIIl[1]] = llIIlIIIIl[7];
                            nArray3[x.llIIlIIIIl[0]] = llIIlIIIIl[8];
                            nArray3[x.llIIlIIIIl[5]] = llIIlIIIIl[9];
                            nArray3[x.llIIlIIIIl[10]] = llIIlIIIIl[11];
                            if (x.lIlIlIIIllIII(e.c(nArray3) ? 1 : 0)) {
                                a.a(llIIlIIIIl[7], llIIlIIIIl[12]);
                                a.a(llIIlIIIIl[8], llIIlIIIIl[12]);
                                a.a(llIIlIIIIl[9], llIIlIIIIl[0]);
                                a.a(llIIlIIIIl[11], llIIlIIIIl[13]);
                                a.a(llIIlIIIIl[14], llIIlIIIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llIIlIIIIl[0]];
            nArray[x.llIIlIIIIl[1]] = llIIlIIIIl[14];
            if (x.lIlIlIIIllIII(Inventory.contains((int[])nArray) ? 1 : 0) && x.lIlIlIIIlllll(Combat.getMissingHealth(), llIIlIIIIl[15])) {
                int[] nArray4 = new int[llIIlIIIIl[0]];
                nArray4[x.llIIlIIIIl[1]] = llIIlIIIIl[14];
                Inventory.getFirst((int[])nArray4).interact(llIIIlllIl[llIIlIIIIl[6]]);
                Time.sleepTicks((int)llIIlIIIIl[5]);
                0;
            }
            if (x.lIlIlIIIllIII(Inventory.contains((int[])f.ba) ? 1 : 0) && x.lIlIlIIIllIll(Movement.getRunEnergy(), llIIlIIIIl[16])) {
                Inventory.getFirst((int[])f.ba).interact(llIIIlllIl[llIIlIIIIl[13]]);
                Time.sleepTicks((int)llIIlIIIIl[0]);
                0;
            }
            if (x.lIlIlIIIllIll(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0]) && x.lIlIlIIIllIII(x.an() ? 1 : 0) && x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llIIlIIIIl[2])) {
                int[] nArray5 = new int[llIIlIIIIl[0]];
                nArray5[x.llIIlIIIIl[1]] = llIIlIIIIl[3];
                if (x.lIlIlIIIlllIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (x.lIlIlIIIlllIl(Players.getLocal().getWorldLocation().equals((Object)dG) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[17]];
                        if (x.lIlIlIIIllIII(Dialog.isOpen() ? 1 : 0) && x.lIlIlIIIllIll(dF, llIIlIIIIl[5])) {
                            Dialog.close();
                            dF += llIIlIIIIl[0];
                        }
                        e.a(dG);
                    }
                    if (x.lIlIlIIIllIII(Players.getLocal().getWorldLocation().equals((Object)dG) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[18]];
                        g.a(llIIIlllIl[llIIlIIIIl[2]], cE);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llIIlIIIIl[19]));
            System.out.println("5621: " + Vars.getBit((int)llIIlIIIIl[20]));
            System.out.println("5622: " + Vars.getBit((int)llIIlIIIIl[21]));
            System.out.println("5623: " + Vars.getBit((int)llIIlIIIIl[22]));
            System.out.println("5624: " + Vars.getBit((int)llIIlIIIIl[23]));
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[19]), llIIlIIIIl[0])) {
                dA = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[20]), llIIlIIIIl[0])) {
                dB = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[21]), llIIlIIIIl[0])) {
                dC = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[22]), llIIlIIIIl[0])) {
                dD = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)llIIlIIIIl[23]), llIIlIIIIl[0])) {
                dE = llIIlIIIIl[0];
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[0])) {
                int llllllllllllllllllIlIlIIIIllIlIl;
                di = llIIlIIIIl[1];
                if (x.lIlIlIIIlllIl(dA ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIIIIl[0]];
                    stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[24]];
                    if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llIIlIIIIl[0]];
                        stringArray2[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[12]];
                        if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llIIlIIIIl[0]];
                            stringArray3[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[25]];
                            if (x.lIlIlIIIlllIl(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llIIlIIIIl[0]];
                                stringArray4[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[15]];
                                String[] stringArray5 = new String[llIIlIIIIl[0]];
                                stringArray5[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llIIlIIIIl[5]);
                                0;
                            }
                        }
                    }
                    String[] stringArray6 = new String[llIIlIIIIl[0]];
                    stringArray6[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[27]];
                    if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dH), llIIlIIIIl[2])) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[28]];
                            Movement.walkTo((WorldPoint)dH);
                            0;
                            Time.sleepTicks((int)llIIlIIIIl[0]);
                            0;
                        }
                        if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dH), llIIlIIIIl[2])) {
                            AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[29]];
                            g.a(llIIIlllIl[llIIlIIIIl[30]], cE, llIIlIIIIl[0]);
                            Time.sleepTicks((int)llIIlIIIIl[0]);
                            0;
                            llllllllllllllllllIlIlIIIIllIlll = Dialog.getOptions();
                            llllllllllllllllllIlIlIIIIllIllI = new ArrayList();
                            if (x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlll.isEmpty() ? 1 : 0)) {
                                llllllllllllllllllIlIlIIIIllIlIl = llIIlIIIIl[1];
                                while (x.lIlIlIIIllIll(llllllllllllllllllIlIlIIIIllIlIl, llllllllllllllllllIlIlIIIIllIlll.size())) {
                                    llllllllllllllllllIlIlIIIIllIllI.add(((Widget)llllllllllllllllllIlIlIIIIllIlll.get(llllllllllllllllllIlIlIIIIllIlIl)).getText());
                                    0;
                                    ++llllllllllllllllllIlIlIIIIllIlIl;
                                    0;
                                    if (2 == 2) continue;
                                    return;
                                }
                                llllllllllllllllllIlIlIIIIllIlIl = llllllllllllllllllIlIlIIIIllIllI.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[90]])) ? 1 : 0;
                                int n2 = llllllllllllllllllIlIlIIIIllIllI.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[89]]));
                                if (x.lIlIlIIIllIII(llllllllllllllllllIlIlIIIIllIlIl) && x.lIlIlIIIllIII(n2)) {
                                    System.out.println(llIIIlllIl[llIIlIIIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dI), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[32]];
                        Movement.walkTo((WorldPoint)dI);
                        0;
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dI), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[33]];
                        g.a(llIIIlllIl[llIIlIIIIl[34]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                        llllllllllllllllllIlIlIIIIllIlll = Dialog.getOptions();
                        llllllllllllllllllIlIlIIIIllIllI = new ArrayList();
                        if (x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIlIlIIIIllIlIl = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(llllllllllllllllllIlIlIIIIllIlIl, llllllllllllllllllIlIlIIIIllIlll.size())) {
                                llllllllllllllllllIlIlIIIIllIllI.add(((Widget)llllllllllllllllllIlIlIIIIllIlll.get(llllllllllllllllllIlIlIIIIllIlIl)).getText());
                                0;
                                ++llllllllllllllllllIlIlIIIIllIlIl;
                                0;
                                if (2 < (0x91 ^ 0x95)) continue;
                                return;
                            }
                            llllllllllllllllllIlIlIIIIllIlIl = llllllllllllllllllIlIlIIIIllIllI.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[88]])) ? 1 : 0;
                            int n3 = llllllllllllllllllIlIlIIIIllIllI.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[87]]));
                            if (x.lIlIlIIIllIII(llllllllllllllllllIlIlIIIIllIlIl) && x.lIlIlIIIllIII(n3)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[35]]);
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dC ? 1 : 0) && x.lIlIlIIIllIII(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dJ), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[36]];
                        Movement.walkTo((WorldPoint)dJ);
                        0;
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dJ), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[37]];
                        g.a(llIIIlllIl[llIIlIIIIl[38]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                        llllllllllllllllllIlIlIIIIllIlll = Dialog.getOptions();
                        llllllllllllllllllIlIlIIIIllIllI = new ArrayList();
                        if (x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIlIlIIIIllIlIl = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(llllllllllllllllllIlIlIIIIllIlIl, llllllllllllllllllIlIlIIIIllIlll.size())) {
                                llllllllllllllllllIlIlIIIIllIllI.add(((Widget)llllllllllllllllllIlIlIIIIllIlll.get(llllllllllllllllllIlIlIIIIllIlIl)).getText());
                                0;
                                ++llllllllllllllllllIlIlIIIIllIlIl;
                                0;
                                if (3 == 3) continue;
                                return;
                            }
                            llllllllllllllllllIlIlIIIIllIlIl = llllllllllllllllllIlIlIIIIllIllI.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[86]])) ? 1 : 0;
                            int n4 = llllllllllllllllllIlIlIIIIllIllI.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[85]]));
                            if (x.lIlIlIIIllIII(llllllllllllllllllIlIlIIIIllIlIl) && x.lIlIlIIIllIII(n4)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[39]]);
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dD ? 1 : 0) && x.lIlIlIIIllIII(dC ? 1 : 0) && x.lIlIlIIIllIII(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dK), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[40]];
                        Movement.walkTo((WorldPoint)dK);
                        0;
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dK), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[41]];
                        g.a(llIIIlllIl[llIIlIIIIl[42]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                        llllllllllllllllllIlIlIIIIllIlll = Dialog.getOptions();
                        llllllllllllllllllIlIlIIIIllIllI = new ArrayList();
                        if (x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIlIlIIIIllIlIl = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(llllllllllllllllllIlIlIIIIllIlIl, llllllllllllllllllIlIlIIIIllIlll.size())) {
                                llllllllllllllllllIlIlIIIIllIllI.add(((Widget)llllllllllllllllllIlIlIIIIllIlll.get(llllllllllllllllllIlIlIIIIllIlIl)).getText());
                                0;
                                ++llllllllllllllllllIlIlIIIIllIlIl;
                                0;
                                if (2 != 1) continue;
                                return;
                            }
                            llllllllllllllllllIlIlIIIIllIlIl = llllllllllllllllllIlIlIIIIllIllI.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[84]])) ? 1 : 0;
                            int n5 = llllllllllllllllllIlIlIIIIllIllI.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[83]]));
                            if (x.lIlIlIIIllIII(llllllllllllllllllIlIlIIIIllIlIl) && x.lIlIlIIIllIII(n5)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[43]]);
                            }
                        }
                    }
                }
                if (x.lIlIlIIIlllIl(dE ? 1 : 0) && x.lIlIlIIIllIII(dD ? 1 : 0) && x.lIlIlIIIllIII(dC ? 1 : 0) && x.lIlIlIIIllIII(dB ? 1 : 0) && x.lIlIlIIIllIII(dA ? 1 : 0)) {
                    if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dL), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[44]];
                        Movement.walkTo((WorldPoint)dL);
                        0;
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                    }
                    if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dL), llIIlIIIIl[18])) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[45]];
                        g.a(llIIIlllIl[llIIlIIIIl[46]], cE, llIIlIIIIl[0]);
                        Time.sleepTicks((int)llIIlIIIIl[0]);
                        0;
                        llllllllllllllllllIlIlIIIIllIlll = Dialog.getOptions();
                        llllllllllllllllllIlIlIIIIllIllI = new ArrayList();
                        if (x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlll.isEmpty() ? 1 : 0)) {
                            llllllllllllllllllIlIlIIIIllIlIl = llIIlIIIIl[1];
                            while (x.lIlIlIIIllIll(llllllllllllllllllIlIlIIIIllIlIl, llllllllllllllllllIlIlIIIIllIlll.size())) {
                                llllllllllllllllllIlIlIIIIllIllI.add(((Widget)llllllllllllllllllIlIlIIIIllIlll.get(llllllllllllllllllIlIlIIIIllIlIl)).getText());
                                0;
                                ++llllllllllllllllllIlIlIIIIllIlIl;
                                0;
                                if (2 != (0xBB ^ 0x87 ^ (0x62 ^ 0x5A))) continue;
                                return;
                            }
                            llllllllllllllllllIlIlIIIIllIlIl = llllllllllllllllllIlIlIIIIllIllI.stream().anyMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[16]])) ? 1 : 0;
                            int n6 = llllllllllllllllllIlIlIIIIllIllI.stream().anyMatch(string -> string.contains(llIIIlllIl[llIIlIIIIl[82]]));
                            int n7 = llllllllllllllllllIlIlIIIIllIllI.stream().noneMatch(string -> string.equalsIgnoreCase(llIIIlllIl[llIIlIIIIl[81]]));
                            if ((!x.lIlIlIIIlllIl(llllllllllllllllllIlIlIIIIllIlIl) || x.lIlIlIIIllIII(n6)) && x.lIlIlIIIllIII(n7)) {
                                System.out.println(llIIIlllIl[llIIlIIIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[5])) {
                if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[48]];
                    if (x.lIlIlIIIllIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(dG);
                }
                if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[49]];
                    g.a(llIIIlllIl[llIIlIIIIl[50]], cE);
                }
            }
            if (!x.lIlIlIIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[10]) || x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[17])) {
                g.a(cE);
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[6])) {
                if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlIIIIl[6])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[51]];
                    Movement.walkTo((WorldPoint)dM);
                    0;
                    Time.sleepTicks((int)llIIlIIIIl[0]);
                    0;
                }
                if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dM), llIIlIIIIl[6])) {
                    String[] stringArray = new String[llIIlIIIIl[0]];
                    stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[52]];
                    if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llIIlIIIIl[0]];
                        stringArray7[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[53]];
                        Inventory.getFirst((String[])stringArray7).interact(llIIIlllIl[llIIlIIIIl[54]]);
                        Time.sleepTicks((int)llIIlIIIIl[10]);
                        0;
                    }
                }
            }
            if (x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[13])) {
                if (x.lIlIlIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[55]];
                    e.a(dG);
                }
                if (x.lIlIlIIlIIlII(Players.getLocal().getWorldLocation().distanceTo(dG), llIIlIIIIl[5])) {
                    AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[56]];
                    g.a(llIIIlllIl[llIIlIIIIl[57]], cE);
                }
            }
            if (!x.lIlIlIIlIlIlI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[18]) || x.lIlIlIIlIIIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llIIlIIIIl[2])) {
                if (x.lIlIlIIIllIll(di, llIIlIIIIl[0])) {
                    aN.sn += llIIlIIIIl[0];
                    aN.u(AccBuilderSotf.m);
                    di += llIIlIIIIl[0];
                    aN.sn = llIIlIIIIl[1];
                    dj = llIIlIIIIl[1];
                }
                String[] stringArray = new String[llIIlIIIIl[0]];
                stringArray[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[58]];
                if (x.lIlIlIIIllIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (x.lIlIlIIlIIIIl(Widgets.get((int)llIIlIIIIl[59]))) {
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[60]];
                        String[] stringArray8 = new String[llIIlIIIIl[0]];
                        stringArray8[x.llIIlIIIIl[1]] = llIIIlllIl[llIIlIIIIl[61]];
                        Inventory.getFirst((String[])stringArray8).interact(llIIIlllIl[llIIlIIIIl[62]]);
                        Time.sleepTicks((int)llIIlIIIIl[6]);
                        0;
                        AccBuilderSotf.c = llIIIlllIl[llIIlIIIIl[63]];
                        llllllllllllllllllIlIlIIIIllIlll = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[27]);
                        if (x.lIlIlIIlIIIIl(llllllllllllllllllIlIlIIIIllIlll)) {
                            llllllllllllllllllIlIlIIIIllIlll.interact(llIIIlllIl[llIIlIIIIl[64]]);
                            Time.sleepTicks((int)llIIlIIIIl[0]);
                            0;
                        }
                        if (x.lIlIlIIlIIIIl(llllllllllllllllllIlIlIIIIllIllI = Widgets.get((int)llIIlIIIIl[59], (int)llIIlIIIIl[39]))) {
                            llllllllllllllllllIlIlIIIIllIllI.interact(llIIIlllIl[llIIlIIIIl[65]]);
                            Time.sleepTicks((int)llIIlIIIIl[5]);
                            0;
                        }
                    }
                    Time.sleepTicks((int)llIIlIIIIl[0]);
                    0;
                }
            }
        }
    }

    private static boolean lIlIlIIIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlIIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }
}

