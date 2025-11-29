/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
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
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class ap
implements ac {
    private static /* synthetic */ int[] llIIIIlIlI;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ String[] llIIIIlIIl;
    static final /* synthetic */ WorldPoint nD;
    private final /* synthetic */ int nG = 536;
    static final /* synthetic */ WorldPoint nF;
    public static final /* synthetic */ WorldPoint nC;
    public static final /* synthetic */ WorldPoint nB;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint nA;
    static final /* synthetic */ WorldPoint nE;
    public static final /* synthetic */ WorldPoint nz;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block2: {
            block3: {
                int[] nArray = new int[llIIIIlIlI[2]];
                nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIIIIlIlI[2]];
                nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIlIII(Inventory.getFirst((int[])nArray2).getQuantity(), llIIIIlIlI[13])) break block2;
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])f.bf) ? 1 : 0)) break block3;
                if (!ap.lIlIIlIIIIIII(Equipment.contains((int[])f.bf) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIIIIlIlI[2]];
                nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIIIIlIlI[2]];
                nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIIIIlIlI[2];
            "".length();
            if ("  ".length() > " ".length()) return n2 != 0;
            return ((0x13 ^ 0x37) & ~(0xA8 ^ 0x8C)) != 0;
        }
        n2 = llIIIIlIlI[1];
        return n2 != 0;
    }

    private static void lIlIIIllllllI() {
        llIIIIlIIl = new String[llIIIIlIlI[86]];
        ap.llIIIIlIIl[ap.llIIIIlIlI[1]] = ap.lIlIIIllllIll("JBEjOSABRDMkKwsX", "fdZPN");
        ap.llIIIIlIIl[ap.llIIIIlIlI[2]] = ap.lIlIIIlllllII("rmDUCmoLCB3GVppbBnlJAWoIPZZFY7j8/a+YMa35ktjp7xa3lEeoFsxpkFhxBez2", "UAtOz");
        ap.llIIIIlIIl[ap.llIIIIlIlI[4]] = ap.lIlIIIlllllIl("r2nw6czy6RF8jzFnyFcXnc04xSVDk6nJ", "NQgDr");
        ap.llIIIIlIIl[ap.llIIIIlIlI[5]] = ap.lIlIIIlllllII("NoB3bYCAsn/UmG6fVleUBZawoVBAlYLa", "gATWb");
        ap.llIIIIlIIl[ap.llIIIIlIlI[7]] = ap.lIlIIIlllllII("NoZMtKCrI7fzGS+298OfQiNvRLL+lscR/6c+vANK4lpQgXRbYR79YXuobEV4Tq9uc5aXpjzyQfw=", "eiOTw");
        ap.llIIIIlIIl[ap.llIIIIlIlI[14]] = ap.lIlIIIlllllII("BFvCqkTuNQI=", "UuAes");
        ap.llIIIIlIIl[ap.llIIIIlIlI[16]] = ap.lIlIIIlllllIl("5JnbT/dE0k6jupwUWm4Vdg==", "ztjes");
        ap.llIIIIlIIl[ap.llIIIIlIlI[18]] = ap.lIlIIIlllllII("px/Q9lAgLlQ=", "ptxaW");
        ap.llIIIIlIIl[ap.llIIIIlIlI[19]] = ap.lIlIIIlllllII("NnaG9T7TtO/aPRBBp5vX+w==", "WOwCH");
        ap.llIIIIlIIl[ap.llIIIIlIlI[20]] = ap.lIlIIIllllIll("JwwuCkNIEyofChgIPQdPHAhvHwoeAiNTW1lHGBoDDAI9HQobFGE=", "hgOso");
        ap.llIIIIlIIl[ap.llIIIIlIlI[22]] = ap.lIlIIIllllIll("BSwuSDgkbTkEOCo/", "KMXhL");
        ap.llIIIIlIIl[ap.llIIIIlIlI[42]] = ap.lIlIIIlllllII("SOeyWOQzHQy2YaysRcHyow==", "cGYWD");
        ap.llIIIIlIIl[ap.llIIIIlIlI[45]] = ap.lIlIIIllllIll("DB4lHyFvFygEMz0=", "OvDpR");
        ap.llIIIIlIIl[ap.llIIIIlIlI[21]] = ap.lIlIIIllllIll("FBkWKjN4HAsiJA==", "XxdMV");
        ap.llIIIIlIIl[ap.llIIIIlIlI[47]] = ap.lIlIIIlllllII("rfCJZCHS7sw=", "mTrpm");
        ap.llIIIIlIIl[ap.llIIIIlIlI[48]] = ap.lIlIIIllllIll("PQYuBQ==", "rvKkB");
        ap.llIIIIlIIl[ap.llIIIIlIlI[49]] = ap.lIlIIIlllllII("vHcnx0JztRA=", "FOJJd");
        ap.llIIIIlIIl[ap.llIIIIlIlI[50]] = ap.lIlIIIlllllII("YHSt1li+rOlqwkdDcJ7XKw==", "unDCT");
        ap.llIIIIlIIl[ap.llIIIIlIlI[52]] = ap.lIlIIIllllIll("HjkgaQc/eDclBzEq", "PXVIs");
        ap.llIIIIlIIl[ap.llIIIIlIlI[53]] = ap.lIlIIIlllllIl("GicDQ+5aZ+NfkwhFX97w4A==", "wREXA");
        ap.llIIIIlIIl[ap.llIIIIlIlI[15]] = ap.lIlIIIlllllIl("hQtMkVtOKY6th0iYe16U+wWvVgawSp57", "ivsyr");
        ap.llIIIIlIIl[ap.llIIIIlIlI[54]] = ap.lIlIIIlllllII("VypfB1MlVNBqJVRl+3vVFw==", "BDjuP");
        ap.llIIIIlIIl[ap.llIIIIlIlI[55]] = ap.lIlIIIlllllII("sMnX8zMrj8o=", "AJyCk");
        ap.llIIIIlIIl[ap.llIIIIlIlI[56]] = ap.lIlIIIlllllII("mcjN7Z9PUf4=", "KkSwl");
        ap.llIIIIlIIl[ap.llIIIIlIlI[57]] = ap.lIlIIIlllllIl("PmkrdetiKZo=", "rNNES");
        ap.llIIIIlIIl[ap.llIIIIlIlI[58]] = ap.lIlIIIlllllIl("WGUxYJgHzSzOTrlsaeukwQ==", "hzfId");
        ap.llIIIIlIIl[ap.llIIIIlIlI[59]] = ap.lIlIIIlllllII("IrerSTATcY/nljYMUwB3bQ==", "wQbrQ");
        ap.llIIIIlIIl[ap.llIIIIlIlI[60]] = ap.lIlIIIlllllIl("hDEZoFu+yRSzjODGu2y84Q==", "FOBSe");
        ap.llIIIIlIIl[ap.llIIIIlIlI[61]] = ap.lIlIIIlllllII("CgLufw17BbToYYRIO8RtKQ==", "NGirE");
        ap.llIIIIlIIl[ap.llIIIIlIlI[62]] = ap.lIlIIIlllllIl("Opurv7FWxrBU95ImfSPQAQ==", "JDDwr");
        ap.llIIIIlIIl[ap.llIIIIlIlI[63]] = ap.lIlIIIlllllII("Iyz1mlpsL/o=", "piBav");
        ap.llIIIIlIIl[ap.llIIIIlIlI[75]] = ap.lIlIIIlllllIl("Q2W6RRaadV1y5dHRpXDVFg==", "WhwHZ");
        ap.llIIIIlIIl[ap.llIIIIlIlI[76]] = ap.lIlIIIlllllIl("dkOE7Teyh450NOTtIde4jKebbXx9rDKC", "OVmLH");
    }

    private static boolean lIlIIlIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIlIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIlIIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIlllllII(String llllllllllllllllllIllIIllIllIIll, String llllllllllllllllllIllIIllIllIlII) {
        try {
            SecretKeySpec llllllllllllllllllIllIIllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIIllIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIIllIllIlll.init(llIIIIlIlI[4], llllllllllllllllllIllIIllIlllIII);
            return new String(llllllllllllllllllIllIIllIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllIIllIllIllI) {
            llllllllllllllllllIllIIllIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ag() {
        return llIIIIlIIl[llIIIIlIlI[75]];
    }

    private static void lIlIIIlllllll() {
        llIIIIlIlI = new int[87];
        ap.llIIIIlIlI[0] = 0xFFFF8E19 & 0x73FE;
        ap.llIIIIlIlI[1] = (0xD2 ^ 0xC2 ^ (0x9F ^ 0xB5)) & (71 + 58 - -48 + 13 ^ 90 + 49 - 45 + 38 ^ -" ".length());
        ap.llIIIIlIlI[2] = " ".length();
        ap.llIIIIlIlI[3] = 0xBB ^ 0xA0 ^ (0x6F ^ 0x59);
        ap.llIIIIlIlI[4] = "  ".length();
        ap.llIIIIlIlI[5] = "   ".length();
        ap.llIIIIlIlI[6] = -(0xFFFFF9FD & 0x6E57) & (0xFFFFFBFF & 0x7FDC);
        ap.llIIIIlIlI[7] = 0xA6 ^ 0xA2;
        ap.llIIIIlIlI[8] = 0xFFFFDAEF & 0x77BE;
        ap.llIIIIlIlI[9] = -(0xFFFFDA9F & 0x2F6D) & (0xFFFFFB7D & 0x3FDF);
        ap.llIIIIlIlI[10] = 0xFFFFEBE3 & 0x17FF;
        ap.llIIIIlIlI[11] = -(0xFFFFF6CF & 0x5FBA) & (0xFFFFFFEF & 0x7F9D);
        ap.llIIIIlIlI[12] = 64 + 55 - 10 + 68 + (0xA0 ^ 0xAF) - (0xC5 ^ 0xAC) + (0x7B ^ 0xA);
        ap.llIIIIlIlI[13] = 4 ^ 0x36;
        ap.llIIIIlIlI[14] = 0xA5 ^ 0xA0;
        ap.llIIIIlIlI[15] = 0x74 ^ 2 ^ (0x4D ^ 0x2F);
        ap.llIIIIlIlI[16] = 0xB4 ^ 0xB2;
        ap.llIIIIlIlI[17] = -" ".length();
        ap.llIIIIlIlI[18] = 0x9A ^ 0x9D;
        ap.llIIIIlIlI[19] = 0xAA ^ 0xA2;
        ap.llIIIIlIlI[20] = 0x1A ^ 0x13;
        ap.llIIIIlIlI[21] = 79 + 91 - 69 + 83 ^ 132 + 175 - 242 + 116;
        ap.llIIIIlIlI[22] = 0x36 ^ 0x33 ^ (0x6B ^ 0x64);
        ap.llIIIIlIlI[23] = -(0xFFFFE5E3 & 0x5E3F) & (0xFFFFCFFF & 0x7FF6);
        ap.llIIIIlIlI[24] = 0xFFFF9F1A & 0x6FE7;
        ap.llIIIIlIlI[25] = -(0xFFFFFDE3 & 0x523E) & (0xFFFFFFFB & 0x5BF7);
        ap.llIIIIlIlI[26] = -(0x59 ^ 0x5C) & (0xFFFFFEFF & 0xFFF);
        ap.llIIIIlIlI[27] = 0xFFFFDFEF & 0x2BDB;
        ap.llIIIIlIlI[28] = -(0x4C ^ 0x49) & (0xFFFFAFFD & 0x5EFE);
        ap.llIIIIlIlI[29] = -(0xFFFFE51B & 0x5EF5) & (0xFFFFFFD7 & 0x4FFF);
        ap.llIIIIlIlI[30] = -(0xFFFFFF77 & 0x718B) & (0xFFFFFFF7 & Short.MAX_VALUE);
        ap.llIIIIlIlI[31] = 0xFFFFABCE & 0x5FF3;
        ap.llIIIIlIlI[32] = -(0xFFFFD00F & 0x3FFD) & (0xFFFFDEFF & 0x3FFD);
        ap.llIIIIlIlI[33] = 0xFFFFEFBF & 0x1BFD;
        ap.llIIIIlIlI[34] = 0xFFFFDEEF & 0x2FFE;
        ap.llIIIIlIlI[35] = 0xFFFFEBBF & 0x1FF7;
        ap.llIIIIlIlI[36] = 0xFFFFFFEA & 0xEFF;
        ap.llIIIIlIlI[37] = 0xFFFFABEF & 0x5FBF;
        ap.llIIIIlIlI[38] = -(0xFFFFF5FD & 0x1A17) & (0xFFFFDFFF & 0x3EFF);
        ap.llIIIIlIlI[39] = -(0x4B ^ 0x42) & (0xFFFFAFAF & 0x5BFF);
        ap.llIIIIlIlI[40] = -(0xFFFFD466 & 0x2FB9) & (0xFFFF8FFF & 0x7FBF);
        ap.llIIIIlIlI[41] = 0xFFFFDFBA & 0x2BDF;
        ap.llIIIIlIlI[42] = 0x6A ^ 0x61;
        ap.llIIIIlIlI[43] = -(0xFFFFFD25 & 0x36FB) & (0xFFFFBFFB & 0x7FB7);
        ap.llIIIIlIlI[44] = 0xFFFF9FEC & 0x6EFF;
        ap.llIIIIlIlI[45] = 0x14 ^ 0x18;
        ap.llIIIIlIlI[46] = 0xFFFF9FBF & 0x6BCF;
        ap.llIIIIlIlI[47] = 37 + 128 - 97 + 70 ^ 131 + 93 - 150 + 58;
        ap.llIIIIlIlI[48] = " ".length() ^ (0xA1 ^ 0xAF);
        ap.llIIIIlIlI[49] = 0xAB ^ 0xB9 ^ "  ".length();
        ap.llIIIIlIlI[50] = 0x8B ^ 0x97 ^ (0x6B ^ 0x66);
        ap.llIIIIlIlI[51] = -(0xFFFFDDE3 & 0x6EBD) & (0xFFFFCEFD & 0x7FBB);
        ap.llIIIIlIlI[52] = 143 + 58 - 84 + 42 ^ 75 + 38 - -14 + 14;
        ap.llIIIIlIlI[53] = 0x12 ^ 1;
        ap.llIIIIlIlI[54] = 0xA2 ^ 0xB7;
        ap.llIIIIlIlI[55] = 0xB4 ^ 0xA2;
        ap.llIIIIlIlI[56] = 0x5F ^ 0x48;
        ap.llIIIIlIlI[57] = 0x18 ^ 0;
        ap.llIIIIlIlI[58] = 9 ^ 0x10;
        ap.llIIIIlIlI[59] = 0xB5 ^ 0xAF;
        ap.llIIIIlIlI[60] = 0x7B ^ 0x60;
        ap.llIIIIlIlI[61] = 0x46 ^ 0x41 ^ (0x14 ^ 0xF);
        ap.llIIIIlIlI[62] = 105 + 163 - 112 + 16 ^ 139 + 100 - 65 + 3;
        ap.llIIIIlIlI[63] = 0xB5 ^ 0xAB;
        ap.llIIIIlIlI[64] = 0xFFFFEAF1 & 0x1FFE;
        ap.llIIIIlIlI[65] = 0xFFFFAECE & 0x7FFD;
        ap.llIIIIlIlI[66] = 0xFFFFFBAD & 0x65FA;
        ap.llIIIIlIlI[67] = 0xFFFFFFD7 & 0x1F6F;
        ap.llIIIIlIlI[68] = 0x5D ^ 0x75;
        ap.llIIIIlIlI[69] = -(0xFFFFEF1B & 0x1CF7) & (0xFFFFEFF6 & 0x1F9F);
        ap.llIIIIlIlI[70] = 0xFFFFEDDF & 0x43F6E;
        ap.llIIIIlIlI[71] = 9 ^ 0x35;
        ap.llIIIIlIlI[72] = -(0xFFFF95B9 & 0x7E7F) & (0xFFFF9DFF & 0x77FA);
        ap.llIIIIlIlI[73] = -(0xFFFFE5DF & 0x1F37) & (0xFFFFF5FF & 0xFF5E);
        ap.llIIIIlIlI[74] = 0x39 ^ 0x5D;
        ap.llIIIIlIlI[75] = 0x7E ^ 0x16 ^ (0xB5 ^ 0xC2);
        ap.llIIIIlIlI[76] = 0x28 ^ 8;
        ap.llIIIIlIlI[77] = -(0xFFFFD46B & 0x3BB5) & (0xFFFFBFFD & 0x5BF7);
        ap.llIIIIlIlI[78] = -(0x71 ^ 0x10) & (0xFFFFCF64 & 0x3FFF);
        ap.llIIIIlIlI[79] = -(0xFFFF8607 & 0x7DF9) & (0xFFFFEFFF & 0x1FB2);
        ap.llIIIIlIlI[80] = -(0xFFFFD337 & 0x3CCD) & (0xFFFFBEFD & 0x5FEF);
        ap.llIIIIlIlI[81] = -(0xFFFFF6BD & 0x5953) & (0xFFFFFBBF & 0x5FD6);
        ap.llIIIIlIlI[82] = -(0x4C ^ 0x5D) & (0xFFFFAEFF & 0x5FFD);
        ap.llIIIIlIlI[83] = 0xFFFF9BD4 & 0x6FAF;
        ap.llIIIIlIlI[84] = -(0xFFFFF3AB & 0x5EDE) & (0xFFFFDFFF & 0x7E9F);
        ap.llIIIIlIlI[85] = 0xFFFFDFBF & 0x2DE3;
        ap.llIIIIlIlI[86] = 0xF ^ 0x42 ^ (0x70 ^ 0x1C);
    }

    private static int fZ() {
        int n2 = llIIIIlIlI[70];
        if (ap.lIlIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[71]) && ap.lIlIIlIIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) {
            return (n2 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIIIlIlI[72] + llIIIIlIlI[22];
        }
        int n3 = llIIIIlIlI[73];
        return (n3 - Skills.getExperience((Skill)Skill.PRAYER)) / llIIIIlIlI[72] + llIIIIlIlI[63];
    }

    static {
        ap.lIlIIIlllllll();
        ap.lIlIIIllllllI();
        nz = new WorldPoint(llIIIIlIlI[77], llIIIIlIlI[78], llIIIIlIlI[1]);
        nA = new WorldPoint(llIIIIlIlI[79], llIIIIlIlI[80], llIIIIlIlI[1]);
        nB = new WorldPoint(llIIIIlIlI[81], llIIIIlIlI[82], llIIIIlIlI[1]);
        nC = new WorldPoint(llIIIIlIlI[83], llIIIIlIlI[44], llIIIIlIlI[1]);
        nD = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nE = new WorldPoint(llIIIIlIlI[1], llIIIIlIlI[1], llIIIIlIlI[1]);
        nF = new WorldPoint(llIIIIlIlI[84], llIIIIlIlI[85], llIIIIlIlI[1]);
        bv = new ArrayList<d>();
    }

    private static boolean lIlIIlIIIIIll(Object object) {
        return object != null;
    }

    private static String lIlIIIllllIll(String llllllllllllllllllIllIIlllIIIlIl, String llllllllllllllllllIllIIlllIIIlII) {
        llllllllllllllllllIllIIlllIIIlIl = new String(Base64.getDecoder().decode(llllllllllllllllllIllIIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIIlllIIlIII = new StringBuilder();
        char[] llllllllllllllllllIllIIlllIIIlll = llllllllllllllllllIllIIlllIIIlII.toCharArray();
        int llllllllllllllllllIllIIlllIIIllI = llIIIIlIlI[1];
        char[] llllllllllllllllllIllIIlllIIIIII = llllllllllllllllllIllIIlllIIIlIl.toCharArray();
        int llllllllllllllllllIllIIllIllllll = llllllllllllllllllIllIIlllIIIIII.length;
        int llllllllllllllllllIllIIllIlllllI = llIIIIlIlI[1];
        while (ap.lIlIIlIIIIIIl(llllllllllllllllllIllIIllIlllllI, llllllllllllllllllIllIIllIllllll)) {
            char llllllllllllllllllIllIIlllIIlIll = llllllllllllllllllIllIIlllIIIIII[llllllllllllllllllIllIIllIlllllI];
            llllllllllllllllllIllIIlllIIlIII.append((char)(llllllllllllllllllIllIIlllIIlIll ^ llllllllllllllllllIllIIlllIIIlll[llllllllllllllllllIllIIlllIIIllI % llllllllllllllllllIllIIlllIIIlll.length]));
            "".length();
            ++llllllllllllllllllIllIIlllIIIllI;
            ++llllllllllllllllllIllIIllIlllllI;
            "".length();
            if (((0xB8 ^ 0xA7) & ~(0x7D ^ 0x62)) < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIllIIlllIIlIII);
    }

    public ap() {
        this.nG = llIIIIlIlI[0];
    }

    private static boolean lIlIIlIIIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public int af() {
        try {
            ap.fY();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (("   ".length() & ("   ".length() ^ -" ".length())) != 0) {
            return (0x98 ^ 0xAA ^ (0xAD ^ 0xBD)) & (147 + 90 - 181 + 111 ^ 23 + 68 - -20 + 22 ^ -" ".length());
        }
        return llIIIIlIlI[74];
    }

    public static void fY() {
        block44: {
            TileItem llllllllllllllllllIllIIllllIIIlI;
            block45: {
                if (ap.lIlIIlIIIIIII(bt ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[1]];
                    b.a(bv);
                    if (ap.lIlIIlIIIIIIl(bv.size(), llIIIIlIlI[2])) {
                        System.out.println(llIIIIlIIl[llIIIIlIlI[2]]);
                        bt = llIIIIlIlI[1];
                    }
                }
                if (!ap.lIlIIlIIIIIlI(bt ? 1 : 0) || !ap.lIlIIlIIIIIIl(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) break block44;
                if (ap.lIlIIlIIIIIlI(ap.an() ? 1 : 0) && ap.lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                    llllllllllllllllllIllIIllllIIIlI = BankLocation.getNearest();
                    if (ap.lIlIIlIIIIIll(llllllllllllllllllIllIIllllIIIlI) && ap.lIlIIlIIIIIlI(llllllllllllllllllIllIIllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[4]];
                        a.a((BankLocation)llllllllllllllllllIllIIllllIIIlI);
                    }
                    if (ap.lIlIIlIIIIIll(llllllllllllllllllIllIIllllIIIlI) && ap.lIlIIlIIIIIII(llllllllllllllllllIllIIllllIIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[5]];
                        if (ap.lIlIIlIIIIIlI(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlIlI[6]);
                            "".length();
                        }
                        if (ap.lIlIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                            if (ap.lIlIIlIIIIlII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llIIIIlIlI[7]);
                                "".length();
                            }
                            if (ap.lIlIIlIIIIlII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llIIIIlIlI[4]);
                                "".length();
                            }
                            int[] nArray = new int[llIIIIlIlI[5]];
                            nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
                            nArray[ap.llIIIIlIlI[2]] = llIIIIlIlI[0];
                            nArray[ap.llIIIIlIlI[4]] = llIIIIlIlI[9];
                            if (ap.lIlIIlIIIIIlI(e.c(nArray) ? 1 : 0)) {
                                ap.Q();
                                System.out.println(llIIIIlIIl[llIIIIlIlI[7]]);
                                bt = llIIIIlIlI[2];
                                return;
                            }
                            int[] nArray2 = new int[llIIIIlIlI[5]];
                            nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
                            nArray2[ap.llIIIIlIlI[2]] = llIIIIlIlI[0];
                            nArray2[ap.llIIIIlIlI[4]] = llIIIIlIlI[9];
                            if (ap.lIlIIlIIIIIII(e.c(nArray2) ? 1 : 0)) {
                                if (ap.lIlIIlIIIIIlI(Equipment.contains((int[])f.bf) ? 1 : 0)) {
                                    a.b(f.bf, llIIIIlIlI[2]);
                                }
                                a.b(f.ba, llIIIIlIlI[2]);
                                a.a(llIIIIlIlI[10], llIIIIlIlI[11]);
                                a.b(llIIIIlIlI[0], llIIIIlIlI[12]);
                            }
                        }
                    }
                }
                if (ap.lIlIIlIIIIIII(ap.an() ? 1 : 0)) {
                    if (ap.lIlIIlIIIIIII(Inventory.contains((int[])f.ba) ? 1 : 0) && ap.lIlIIlIIIIIIl(Movement.getRunEnergy(), llIIIIlIlI[13])) {
                        Inventory.getFirst((int[])f.ba).interact(llIIIIlIIl[llIIIIlIlI[14]]);
                        Time.sleepTicks((int)llIIIIlIlI[2]);
                        "".length();
                    }
                    if (ap.lIlIIlIIIIIlI(Movement.isRunEnabled() ? 1 : 0) && ap.lIlIIlIIIIlIl(Movement.getRunEnergy(), llIIIIlIlI[15])) {
                        Movement.toggleRun();
                        Time.sleepTicks((int)llIIIIlIlI[14]);
                        "".length();
                    }
                    if (ap.lIlIIlIIIIIIl(Game.getWildyLevel(), llIIIIlIlI[2])) {
                        AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[16]];
                        if (ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        if (ap.lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0) && ap.lIlIIlIIIIIII(Inventory.contains((int[])f.bf) ? 1 : 0) && ap.lIlIIlIIIIllI(Players.getLocal().getAnimation(), llIIIIlIlI[17])) {
                            Inventory.getFirst((int[])f.bf).interact(llIIIIlIIl[llIIIIlIlI[18]]);
                            Time.sleepTicks((int)llIIIIlIlI[4]);
                            "".length();
                        }
                        String[] stringArray = new String[llIIIIlIlI[4]];
                        stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[19]];
                        stringArray[ap.llIIIIlIlI[2]] = llIIIIlIIl[llIIIIlIlI[20]];
                        g.a(stringArray);
                    }
                    if (ap.lIlIIlIIIIlII(Game.getWildyLevel())) {
                        TileObject llllllllllllllllllIllIIllllIIIIl;
                        int[] nArray = new int[llIIIIlIlI[2]];
                        nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            if (ap.lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[22]];
                                TileItem tileItem = new WorldPoint[llIIIIlIlI[21]];
                                tileItem[ap.llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                tileItem[ap.llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                llllllllllllllllllIllIIllllIIIlI = tileItem;
                                Walker.walkAlong(Arrays.asList(llllllllllllllllllIllIIllllIIIlI), new HashMap());
                                "".length();
                                Time.sleepTicks((int)llIIIIlIlI[2]);
                                "".length();
                            }
                            if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[42]];
                                String[] stringArray = new String[llIIIIlIlI[2]];
                                stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[45]];
                                llllllllllllllllllIllIIllllIIIlI = TileObjects.getNearest((String[])stringArray);
                                String[] stringArray2 = new String[llIIIIlIlI[2]];
                                stringArray2[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[21]];
                                llllllllllllllllllIllIIllllIIIIl = TileObjects.getNearest((String[])stringArray2);
                                String[] stringArray3 = new String[llIIIIlIlI[2]];
                                stringArray3[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[47]];
                                if (ap.lIlIIlIIIIIII(llllllllllllllllllIllIIllllIIIIl.hasAction(stringArray3) ? 1 : 0)) {
                                    llllllllllllllllllIllIIllllIIIIl.interact(llIIIIlIIl[llIIIIlIlI[48]]);
                                }
                                if (ap.lIlIIlIIIIIll(llllllllllllllllllIllIIllllIIIlI)) {
                                    String[] stringArray4 = new String[llIIIIlIlI[2]];
                                    stringArray4[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[49]];
                                    if (ap.lIlIIlIIIIIlI(llllllllllllllllllIllIIllllIIIIl.hasAction(stringArray4) ? 1 : 0)) {
                                        int llllllllllllllllllIllIIllllIIIII = Skills.getExperience((Skill)Skill.PRAYER);
                                        int[] nArray3 = new int[llIIIIlIlI[2]];
                                        nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                                        String[] stringArray5 = new String[llIIIIlIlI[2]];
                                        stringArray5[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[50]];
                                        Inventory.getFirst((int[])nArray3).useOn(TileObjects.getNearest((String[])stringArray5));
                                        Time.sleepTicks((int)llIIIIlIlI[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        int[] nArray4 = new int[llIIIIlIlI[2]];
                        nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                        if (ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIIIIlIlI[2]];
                            nArray5[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                            if (ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                                if (ap.lIlIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[52]];
                                    WorldPoint[] worldPointArray = new WorldPoint[llIIIIlIlI[21]];
                                    worldPointArray[ap.llIIIIlIlI[1]] = new WorldPoint(llIIIIlIlI[23], llIIIIlIlI[24], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[2]] = new WorldPoint(llIIIIlIlI[25], llIIIIlIlI[26], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[4]] = new WorldPoint(llIIIIlIlI[27], llIIIIlIlI[28], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[5]] = new WorldPoint(llIIIIlIlI[29], llIIIIlIlI[30], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[7]] = new WorldPoint(llIIIIlIlI[31], llIIIIlIlI[32], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[14]] = new WorldPoint(llIIIIlIlI[33], llIIIIlIlI[34], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[16]] = new WorldPoint(llIIIIlIlI[35], llIIIIlIlI[36], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[18]] = new WorldPoint(llIIIIlIlI[37], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[19]] = new WorldPoint(llIIIIlIlI[39], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[20]] = new WorldPoint(llIIIIlIlI[40], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[22]] = new WorldPoint(llIIIIlIlI[41], llIIIIlIlI[38], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[42]] = new WorldPoint(llIIIIlIlI[43], llIIIIlIlI[44], llIIIIlIlI[1]);
                                    worldPointArray[ap.llIIIIlIlI[45]] = new WorldPoint(llIIIIlIlI[46], llIIIIlIlI[44], llIIIIlIlI[1]);
                                    llllllllllllllllllIllIIllllIIIlI = worldPointArray;
                                    Walker.walkAlong(Arrays.asList(llllllllllllllllllIllIIllllIIIlI), new HashMap());
                                    "".length();
                                    Time.sleepTicks((int)llIIIIlIlI[2]);
                                    "".length();
                                }
                                if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                                    AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[53]];
                                    if (!ap.lIlIIlIIIIIlI(Dialog.canLevelUpContinue() ? 1 : 0) || ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                                        Dialog.close();
                                    }
                                    String[] stringArray = new String[llIIIIlIlI[2]];
                                    stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[15]];
                                    llllllllllllllllllIllIIllllIIIlI = NPCs.getNearest((String[])stringArray);
                                    String[] stringArray6 = new String[llIIIIlIlI[2]];
                                    stringArray6[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[54]];
                                    llllllllllllllllllIllIIllllIIIIl = TileObjects.getNearest((String[])stringArray6);
                                    String[] stringArray7 = new String[llIIIIlIlI[2]];
                                    stringArray7[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[55]];
                                    if (ap.lIlIIlIIIIIII(llllllllllllllllllIllIIllllIIIIl.hasAction(stringArray7) ? 1 : 0)) {
                                        llllllllllllllllllIllIIllllIIIIl.interact(llIIIIlIIl[llIIIIlIlI[56]]);
                                    }
                                    if (ap.lIlIIlIIIIIll(llllllllllllllllllIllIIllllIIIlI)) {
                                        String[] stringArray8 = new String[llIIIIlIlI[2]];
                                        stringArray8[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[57]];
                                        if (ap.lIlIIlIIIIIlI(llllllllllllllllllIllIIllllIIIIl.hasAction(stringArray8) ? 1 : 0)) {
                                            List llllllllllllllllllIllIIllllIIIII;
                                            if (ap.lIlIIlIIIIIlI(Dialog.isOpen() ? 1 : 0)) {
                                                int[] nArray6 = new int[llIIIIlIlI[2]];
                                                nArray6[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                Inventory.getFirst((int[])nArray6).useOn((Actor)llllllllllllllllllIllIIllllIIIlI);
                                                Time.sleepTicks((int)llIIIIlIlI[4]);
                                                "".length();
                                            }
                                            if (ap.lIlIIlIIIIIII(Dialog.isOpen() ? 1 : 0) && ap.lIlIIlIIIIIlI((llllllllllllllllllIllIIllllIIIII = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                                                int llllllllllllllllllIllIIlllIlllll = llIIIIlIlI[1];
                                                while (ap.lIlIIlIIIIIIl(llllllllllllllllllIllIIlllIlllll, llllllllllllllllllIllIIllllIIIII.size())) {
                                                    int[] nArray7 = new int[llIIIIlIlI[2]];
                                                    nArray7[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (ap.lIlIIlIIIIllI(((Item)Inventory.getAll((int[])nArray7).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[2]) && ap.lIlIIlIIIIIII(((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getText().contains(llIIIIlIIl[llIIIIlIlI[58]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);
                                                        "".length();
                                                    }
                                                    int[] nArray8 = new int[llIIIIlIlI[2]];
                                                    nArray8[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                                                    if (ap.lIlIIlIIIIllI(((Item)Inventory.getAll((int[])nArray8).get(llIIIIlIlI[1])).getQuantity(), llIIIIlIlI[14]) && ap.lIlIIlIIIIIII(((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getText().contains(llIIIIlIIl[llIIIIlIlI[59]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);
                                                        "".length();
                                                    }
                                                    if (ap.lIlIIlIIIIIII(((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getText().contains(llIIIIlIIl[llIIIIlIlI[60]]) ? 1 : 0)) {
                                                        Mouse.click((int)((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIllIIllllIIIII.get(llllllllllllllllllIllIIlllIlllll)).getClickPoint().getY(), (boolean)llIIIIlIlI[2]);
                                                        Time.sleepTicks((int)llIIIIlIlI[4]);
                                                        "".length();
                                                    }
                                                    ++llllllllllllllllllIllIIlllIlllll;
                                                    "".length();
                                                    if ("   ".length() != 0) continue;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    e.t();
                                }
                            }
                        }
                    }
                }
                int[] nArray = new int[llIIIIlIlI[2]];
                nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[10];
                if (!ap.lIlIIlIIIIIII(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                int[] nArray9 = new int[llIIIIlIlI[2]];
                nArray9[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray9) ? 1 : 0)) break block44;
                int[] nArray10 = new int[llIIIIlIlI[2]];
                nArray10[ap.llIIIIlIlI[1]] = llIIIIlIlI[51];
                if (!ap.lIlIIlIIIIIlI(Inventory.contains((int[])nArray10) ? 1 : 0)) break block44;
            }
            if (ap.lIlIIlIIIIlll(Players.getLocal().getWorldLocation().distanceTo(nB), llIIIIlIlI[21])) {
                AccBuilderSotf.c = llIIIIlIIl[llIIIIlIlI[61]];
                String[] stringArray = new String[llIIIIlIlI[2]];
                stringArray[ap.llIIIIlIlI[1]] = llIIIIlIIl[llIIIIlIlI[62]];
                llllllllllllllllllIllIIllllIIIlI = TileItems.getNearest((String[])stringArray);
                if (ap.lIlIIlIIIIIll(llllllllllllllllllIllIIllllIIIlI)) {
                    llllllllllllllllllIllIIllllIIIlI.interact(llIIIIlIIl[llIIIIlIlI[63]]);
                }
            }
        }
    }

    private static String lIlIIIlllllIl(String llllllllllllllllllIllIIllIlIIllI, String llllllllllllllllllIllIIllIlIIlll) {
        try {
            SecretKeySpec llllllllllllllllllIllIIllIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), llIIIIlIlI[19]), "DES");
            Cipher llllllllllllllllllIllIIllIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllllllIllIIllIlIlIlI.init(llIIIIlIlI[4], llllllllllllllllllIllIIllIlIlIll);
            return new String(llllllllllllllllllIllIIllIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIllIIllIlIlIIl) {
            llllllllllllllllllIllIIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ap.lIlIIlIIIlIII(Skills.getLevel((Skill)Skill.PRAYER), llIIIIlIlI[3])) {
            bl = llIIIIlIlI[2];
            "".length();
            if (" ".length() == 0) {
                return ((0xBB ^ 0xA8 ^ (0xB4 ^ 0x98)) & (62 + 122 - 21 + 18 ^ 97 + 111 - 164 + 94 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIIIlIlI[1];
        }
        return bl;
    }

    private static boolean lIlIIlIIIIlII(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean ae() {
        return llIIIIlIlI[1];
    }

    private static boolean lIlIIlIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void Q() {
        d llllllllllllllllllIllIIlllIllIll;
        Object llllllllllllllllllIllIIlllIlllII;
        int[] nArray = new int[llIIIIlIlI[2]];
        nArray[ap.llIIIIlIlI[1]] = llIIIIlIlI[9];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIlIlI[9], llIIIIlIlI[14], j.cf);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIIIIlIlI[2]];
        nArray2[ap.llIIIIlIlI[1]] = llIIIIlIlI[0];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIllIIlllIlllII = new d(llIIIIlIlI[0], ap.fZ(), llIIIIlIlI[64]);
            bv.add((d)llllllllllllllllllIllIIlllIlllII);
            "".length();
        }
        int[] nArray3 = new int[llIIIIlIlI[2]];
        nArray3[ap.llIIIIlIlI[1]] = llIIIIlIlI[8];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIllIIlllIlllII = new d(llIIIIlIlI[8], llIIIIlIlI[4], llIIIIlIlI[6]);
            bv.add((d)llllllllllllllllllIllIIlllIlllII);
            "".length();
        }
        if (ap.lIlIIlIIIIIlI(Bank.contains((Predicate)(llllllllllllllllllIllIIlllIlllII = item -> item.getName().toLowerCase().contains(llIIIIlIIl[llIIIIlIlI[76]]))) ? 1 : 0)) {
            llllllllllllllllllIllIIlllIllIll = new d(llIIIIlIlI[65], llIIIIlIlI[14], llIIIIlIlI[66]);
            bv.add(llllllllllllllllllIllIIlllIllIll);
            "".length();
        }
        int[] nArray4 = new int[llIIIIlIlI[2]];
        nArray4[ap.llIIIIlIlI[1]] = llIIIIlIlI[67];
        if (ap.lIlIIlIIIIIlI(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIllIIlllIllIll = new d(llIIIIlIlI[67], llIIIIlIlI[68], llIIIIlIlI[69]);
            bv.add(llllllllllllllllllIllIIlllIllIll);
            "".length();
        }
    }
}

