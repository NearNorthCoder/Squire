/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.A;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.Z;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.j;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
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
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

public class z
implements K {
    static /* synthetic */ WorldPoint cS;
    static /* synthetic */ int dc;
    static /* synthetic */ String[] cy;
    static /* synthetic */ WorldPoint cU;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ boolean dd;
    private static /* synthetic */ String[] lIlIIlllII;
    static /* synthetic */ WorldPoint cR;
    static /* synthetic */ WorldPoint cT;
    static /* synthetic */ int dW;
    private static /* synthetic */ int[] lIlIIllllI;
    public static /* synthetic */ List<d> bp;

    private static boolean lIIIlllIlIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlllIlIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        return lIlIIllllI[6];
    }

    private static boolean lIIIlllIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlllIlIIll(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (z.lIIIlllIllIII(Quests.getState((Quest)Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            bl = lIlIIllllI[5];
            "".length();
            if ((139 + 45 - 159 + 166 ^ 19 + 54 - -60 + 54) <= "   ".length()) {
                return ((121 + 63 - 59 + 66 ^ 81 + 17 - 65 + 102) & (0xE ^ 0x75 ^ (3 ^ 0x40) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIlIIllllI[6];
        }
        return bl;
    }

    static {
        z.lIIIlllIIllII();
        z.lIIIlllIIlIll();
        bp = new ArrayList<d>();
        cR = new WorldPoint(lIlIIllllI[68], lIlIIllllI[69], lIlIIllllI[6]);
        cS = new WorldPoint(lIlIIllllI[70], lIlIIllllI[71], lIlIIllllI[6]);
        cT = new WorldPoint(lIlIIllllI[72], lIlIIllllI[73], lIlIIllllI[6]);
        cU = new WorldPoint(lIlIIllllI[74], lIlIIllllI[75], lIlIIllllI[6]);
        String[] stringArray = new String[lIlIIllllI[1]];
        stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[76]];
        stringArray[z.lIlIIllllI[5]] = lIlIIlllII[lIlIIllllI[42]];
        stringArray[z.lIlIIllllI[8]] = lIlIIlllII[lIlIIllllI[77]];
        cy = stringArray;
        dW = lIlIIllllI[78];
    }

    @Override
    public String ae() {
        return lIlIIlllII[lIlIIllllI[66]];
    }

    private static void lIIIlllIIlIll() {
        lIlIIlllII = new String[lIlIIllllI[79]];
        z.lIlIIlllII[z.lIlIIllllI[6]] = z.lIIIlllIIIlIl("LhsILmLed6p97lvu4wp4ulR4WQ27Ehz2Ccaug+XG+2xLHbiUa01w+epFr3twOfGQ", "FJbWs");
        z.lIlIIlllII[z.lIlIIllllI[5]] = z.lIIIlllIIIllI("FBs0TCE1WiANOzE=", "ZzBlU");
        z.lIlIIlllII[z.lIlIIllllI[8]] = z.lIIIlllIIIllI("HTYsFyk8OSVTJzQ5KRorMg==", "UWBsE");
        z.lIlIIlllII[z.lIlIIllllI[1]] = z.lIIIlllIIIlll("QC85FUNAUPOiJu1QTTsVmO0WY3prdT9fP5FjoCjuTsV2oepw6pQEBDCENc+hdmbPP+b5REq+ztA=", "bDaNV");
        z.lIlIIlllII[z.lIlIIllllI[9]] = z.lIIIlllIIIlll("K24RHMrmP25dQRlQYpuzqm/mhnx3kxDYD8+9Z6KVQIQuPUh71FkUoBI9SGL9fqA6KUF7paoxwEA=", "kBKUn");
        z.lIlIIlllII[z.lIlIIllllI[3]] = z.lIIIlllIIIlll("rWOn7B3yyOw=", "zxpkZ");
        z.lIlIIlllII[z.lIlIIllllI[18]] = z.lIIIlllIIIlIl("uQgTtQuaUPI=", "hTtiD");
        z.lIlIIlllII[z.lIlIIllllI[20]] = z.lIIIlllIIIllI("NwcmVyYWRiIRNlkUPxg/", "yfPwR");
        z.lIlIIlllII[z.lIlIIllllI[21]] = z.lIIIlllIIIlll("tDWARvQw6q8=", "nixHV");
        z.lIlIIlllII[z.lIlIIllllI[23]] = z.lIIIlllIIIlll("LCvDQBe4ex0=", "pAVhT");
        z.lIlIIlllII[z.lIlIIllllI[4]] = z.lIIIlllIIIllI("AyIhJyspOA==", "JLRWN");
        z.lIlIIlllII[z.lIlIIllllI[2]] = z.lIIIlllIIIllI("NwcFbAwWRhUtFBUfUzwNGw==", "yfsLx");
        z.lIlIIlllII[z.lIlIIllllI[29]] = z.lIIIlllIIIlIl("RjUhD9TBmwMrujaMTVbY2Q==", "zjrHr");
        z.lIlIIlllII[z.lIlIIllllI[30]] = z.lIIIlllIIIlIl("xZNjBpYCPGQ=", "DzJXM");
        z.lIlIIlllII[z.lIlIIllllI[31]] = z.lIIIlllIIIlIl("rHGUHopWpHZj3HZS6nNMnXiV+8L+zu7T", "uNvKU");
        z.lIlIIlllII[z.lIlIIllllI[32]] = z.lIIIlllIIIllI("LwIhHBkCQywQFBM=", "gcOxu");
        z.lIlIIlllII[z.lIlIIllllI[33]] = z.lIIIlllIIIlIl("MOX885kA/Wehcm1tkpketg==", "uWjMB");
        z.lIlIIlllII[z.lIlIIllllI[36]] = z.lIIIlllIIIlll("gjuorSklZvzXR9RhH3ZSMdKYbWoWFxRQ", "EDygP");
        z.lIlIIlllII[z.lIlIIllllI[37]] = z.lIIIlllIIIlIl("NS9QGUUggk2LbKQmqvrQ5w==", "wdwBw");
        z.lIlIIlllII[z.lIlIIllllI[38]] = z.lIIIlllIIIllI("JSFNAjwAbykaMRYp", "dOmmP");
        z.lIlIIlllII[z.lIlIIllllI[34]] = z.lIIIlllIIIllI("GBYtLyk=", "JyENB");
        z.lIlIIlllII[z.lIlIIllllI[39]] = z.lIIIlllIIIlIl("E3bN+eKMxd8WZZEQr+qheg==", "twmaq");
        z.lIlIIlllII[z.lIlIIllllI[40]] = z.lIIIlllIIIlIl("D+COjKIg2Wk=", "iWUbt");
        z.lIlIIlllII[z.lIlIIllllI[43]] = z.lIIIlllIIIlll("LJccCuBVC9hfMvJxwogioQ==", "SfKcK");
        z.lIlIIlllII[z.lIlIIllllI[44]] = z.lIIIlllIIIlll("pzp4SlPfxPs=", "wAVcD");
        z.lIlIIlllII[z.lIlIIllllI[45]] = z.lIIIlllIIIllI("GD8MKA==", "OZmZq");
        z.lIlIIlllII[z.lIlIIllllI[47]] = z.lIIIlllIIIllI("IgIYHw==", "vcszr");
        z.lIlIIlllII[z.lIlIIllllI[48]] = z.lIIIlllIIIlll("Py8t6LmPXu4=", "USazS");
        z.lIlIIlllII[z.lIlIIllllI[49]] = z.lIIIlllIIIlll("P57nwxPPsjc78DPGjtXPCA==", "HvRUr");
        z.lIlIIlllII[z.lIlIIllllI[50]] = z.lIIIlllIIIllI("FB8NDw8+SxANCTMCHAAI", "Ukynl");
        z.lIlIIlllII[z.lIlIIllllI[41]] = z.lIIIlllIIIlIl("uCfiVqvuWhMtjaqmUKXlXQ==", "ZrpIn");
        z.lIlIIlllII[z.lIlIIllllI[51]] = z.lIIIlllIIIllI("BgIOEBcs", "Gvzqt");
        z.lIlIIlllII[z.lIlIIllllI[55]] = z.lIIIlllIIIlll("02hx4k9m6EE=", "RZFQn");
        z.lIlIIlllII[z.lIlIIllllI[56]] = z.lIIIlllIIIllI("AAsFchYhSgE0Bm4YHD0P", "NjsRb");
        z.lIlIIlllII[z.lIlIIllllI[57]] = z.lIIIlllIIIlll("fv2rZlVZZcE=", "omGCe");
        z.lIlIIlllII[z.lIlIIllllI[58]] = z.lIIIlllIIIlll("ka5qDtfOodKSOQOBJKAJjw==", "zYuDD");
        z.lIlIIlllII[z.lIlIIllllI[59]] = z.lIIIlllIIIlll("mNgYy3osRzY=", "ifCAe");
        z.lIlIIlllII[z.lIlIIllllI[66]] = z.lIIIlllIIIlIl("/kfQ9b5WF4GIl7o6EDuYzg==", "iVlel");
        z.lIlIIlllII[z.lIlIIllllI[67]] = z.lIIIlllIIIlll("UayqD6UWRCJChXE5cstA5kvbNjpWU+X+", "BPpyB");
        z.lIlIIlllII[z.lIlIIllllI[76]] = z.lIIIlllIIIlll("xJxwtRkqByY=", "jKBWx");
        z.lIlIIlllII[z.lIlIIllllI[42]] = z.lIIIlllIIIlIl("NGzzZRBfy7MsL7GTsJF/15FteqXHNX7h0yoAy76vz57LTxOQ/e5gz6O5EMWK6MyB", "Qbcej");
        z.lIlIIlllII[z.lIlIIllllI[77]] = z.lIIIlllIIIlll("PhcYNl83GI/eCaZ28R//m+R1hGkQEuiE8zJ20ZqdXozuUnKTIazgIHwvSBlo5FPimHK0PSz9sMw=", "rLSkI");
    }

    private static String lIIIlllIIIllI(String llllllllllllllllllllIIIIIllIIIll, String llllllllllllllllllllIIIIIllIIIlI) {
        llllllllllllllllllllIIIIIllIIIll = new String(Base64.getDecoder().decode(llllllllllllllllllllIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIIIIIllIIIIl = new StringBuilder();
        char[] llllllllllllllllllllIIIIIllIIIII = llllllllllllllllllllIIIIIllIIIlI.toCharArray();
        int llllllllllllllllllllIIIIIlIlllll = lIlIIllllI[6];
        char[] llllllllllllllllllllIIIIIlIllIIl = llllllllllllllllllllIIIIIllIIIll.toCharArray();
        int llllllllllllllllllllIIIIIlIllIII = llllllllllllllllllllIIIIIlIllIIl.length;
        int llllllllllllllllllllIIIIIlIlIlll = lIlIIllllI[6];
        while (z.lIIIlllIIllIl(llllllllllllllllllllIIIIIlIlIlll, llllllllllllllllllllIIIIIlIllIII)) {
            char llllllllllllllllllllIIIIIllIIlII = llllllllllllllllllllIIIIIlIllIIl[llllllllllllllllllllIIIIIlIlIlll];
            llllllllllllllllllllIIIIIllIIIIl.append((char)(llllllllllllllllllllIIIIIllIIlII ^ llllllllllllllllllllIIIIIllIIIII[llllllllllllllllllllIIIIIlIlllll % llllllllllllllllllllIIIIIllIIIII.length]));
            "".length();
            ++llllllllllllllllllllIIIIIlIlllll;
            ++llllllllllllllllllllIIIIIlIlIlll;
            "".length();
            if ((94 + 60 - 113 + 88 ^ 22 + 39 - -58 + 14) > "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllllIIIIIllIIIIl);
    }

    private static boolean lIIIlllIlIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIlllIIIlll(String llllllllllllllllllllIIIIIlIIllII, String llllllllllllllllllllIIIIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllllllllIIIIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIIIIlIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIIIIlIlIIII.init(lIlIIllllI[8], llllllllllllllllllllIIIIIlIlIIIl);
            return new String(llllllllllllllllllllIIIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIIIIIlIIllll) {
            llllllllllllllllllllIIIIIlIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlllIIllII() {
        lIlIIllllI = new int[80];
        z.lIlIIllllI[0] = -(0xFFFFDDFE & 0x735B) & (0xFFFFF7FF & 0x5BFF);
        z.lIlIIllllI[1] = "   ".length();
        z.lIlIIllllI[2] = 0x19 ^ 8 ^ (0x83 ^ 0x99);
        z.lIlIIllllI[3] = 0x7C ^ 0x2C ^ (0x93 ^ 0xC6);
        z.lIlIIllllI[4] = 99 + 141 - 232 + 142 ^ 14 + 89 - 46 + 99;
        z.lIlIIllllI[5] = " ".length();
        z.lIlIIllllI[6] = (0xA3 ^ 0x98 ^ (0x57 ^ 0x76)) & (0x6E ^ 0x24 ^ (0x6C ^ 0x3C) ^ -" ".length());
        z.lIlIIllllI[7] = -(0xFFFFFEFF & 0x6975) & (0xFFFFFBFF & 0x7FFC);
        z.lIlIIllllI[8] = "  ".length();
        z.lIlIIllllI[9] = 0x4B ^ 0x4F;
        z.lIlIIllllI[10] = 0xFFFFB7F1 & 0x4F7F;
        z.lIlIIllllI[11] = 0xFFFFB57B & 0x7BD5;
        z.lIlIIllllI[12] = -(0xFFFFEB67 & 0x749F) & (0xFFFFFF6F & 0x7FDF);
        z.lIlIIllllI[13] = -(0xFFFFFCDD & 0x43AB) & (0xFFFFDFCF & Short.MAX_VALUE);
        z.lIlIIllllI[14] = 0xFFFFFFC9 & 0x1F7E;
        z.lIlIIllllI[15] = 0xFFFFCF87 & 0x37FF;
        z.lIlIIllllI[16] = -(0xFFFFE357 & 0x3CEB) & (0xFFFFE7FF & 0x3FCF);
        z.lIlIIllllI[17] = -(0xFFFFE37D & 0x3CEA) & (0xFFFFAFFF & 0x77FF);
        z.lIlIIllllI[18] = 0x2B ^ 0x2D;
        z.lIlIIllllI[19] = -(0xFFFFB7FD & 0x785B) & (0xFFFFB7DB & 0x7FFD);
        z.lIlIIllllI[20] = 0x6C ^ 0x6B;
        z.lIlIIllllI[21] = 0xF2 ^ 0x8E ^ (0x6C ^ 0x18);
        z.lIlIIllllI[22] = 0xFFFF862B & 0x7DF7;
        z.lIlIIllllI[23] = 0x76 ^ 0x7F;
        z.lIlIIllllI[24] = -(0xFFFFFDF5 & 0x6E8F) & (0xFFFFEFFF & 0x7DFF);
        z.lIlIIllllI[25] = -(0xFFFFFB85 & 0x2EFB) & (0xFFFFAFF3 & 0x7FBF);
        z.lIlIIllllI[26] = 0xFFFFFBE7 & 0x7FB;
        z.lIlIIllllI[27] = 0xF6 ^ 0xC4;
        z.lIlIIllllI[28] = 0xFFFFEF6B & 0x17F7;
        z.lIlIIllllI[29] = 72 + 68 - 26 + 89 ^ 157 + 123 - 204 + 123;
        z.lIlIIllllI[30] = 0xE ^ 0x28 ^ (0xE8 ^ 0xC3);
        z.lIlIIllllI[31] = 0xD7 ^ 0xA4 ^ (0xD2 ^ 0xAF);
        z.lIlIIllllI[32] = 0x6D ^ 0x69 ^ (0xA5 ^ 0xAE);
        z.lIlIIllllI[33] = 0x19 ^ 0x3E ^ (0x58 ^ 0x6F);
        z.lIlIIllllI[34] = 0x7C ^ 0x68;
        z.lIlIIllllI[35] = 0xFFFFA7FF & 0x5FBF;
        z.lIlIIllllI[36] = 0xE8 ^ 0x8C ^ (0x53 ^ 0x26);
        z.lIlIIllllI[37] = 0x24 ^ 0x36;
        z.lIlIIllllI[38] = 0x2F ^ 0x3C;
        z.lIlIIllllI[39] = 0x2D ^ 0x38;
        z.lIlIIllllI[40] = 0x93 ^ 0x85;
        z.lIlIIllllI[41] = 0x5C ^ 0x42;
        z.lIlIIllllI[42] = 0xF ^ 0x78 ^ (0x7F ^ 0x20);
        z.lIlIIllllI[43] = 0x91 ^ 0x86;
        z.lIlIIllllI[44] = 0x7C ^ 0x64;
        z.lIlIIllllI[45] = 0xFB ^ 0xB0 ^ (0xC1 ^ 0x93);
        z.lIlIIllllI[46] = -(0xFFFFE4EB & 0x7B3F) & (0xFFFFFF7F & 0x7DFF);
        z.lIlIIllllI[47] = 83 + 93 - 175 + 148 ^ 16 + 90 - 64 + 101;
        z.lIlIIllllI[48] = 0x15 ^ 0x37 ^ (0x74 ^ 0x4D);
        z.lIlIIllllI[49] = 27 + 145 - 111 + 122 ^ 31 + 38 - -3 + 99;
        z.lIlIIllllI[50] = 107 + 91 - 167 + 111 ^ 27 + 144 - 143 + 119;
        z.lIlIIllllI[51] = 63 + 78 - 133 + 119 ^ (0x1A ^ 0x7A);
        z.lIlIIllllI[52] = 0xFFFFBDFE & 0x5F57;
        z.lIlIIllllI[53] = -(0xFFFFF17E & 0x7EC3) & (0xFFFFFFD7 & 0x7CEF);
        z.lIlIIllllI[54] = 0xFFFF8DE1 & 0x7F7E;
        z.lIlIIllllI[55] = 142 + 33 - 126 + 115 ^ 41 + 0 - -4 + 87;
        z.lIlIIllllI[56] = 88 + 35 - 28 + 76 ^ 10 + 83 - -23 + 22;
        z.lIlIIllllI[57] = 0x44 ^ 0x66;
        z.lIlIIllllI[58] = 0xBB ^ 0x98;
        z.lIlIIllllI[59] = 160 + 21 - 80 + 70 ^ 72 + 95 - 146 + 122;
        z.lIlIIllllI[60] = -(0xFFFFE4EA & 0x5BDD) & (0xFFFFEFFF & 0x73EF);
        z.lIlIIllllI[61] = -(0xFFFF9057 & 0x7FBE) & (0xFFFFBFBD & 0x5FF7);
        z.lIlIIllllI[62] = 0xFFFFBF7C & 0x47EF;
        z.lIlIIllllI[63] = -(0xFFFFF373 & 0xD8F) & (0xFFFFFFEE & 0x2FDF);
        z.lIlIIllllI[64] = -(0xFFFF97EF & 0x7E55) & (0xFFFFF7FC & 0x7FEF);
        z.lIlIIllllI[65] = 0x7A ^ 0x74 ^ (0x76 ^ 0x1C);
        z.lIlIIllllI[66] = 7 + 30 - -80 + 16 ^ 77 + 92 - 145 + 136;
        z.lIlIIllllI[67] = 0x6E ^ 0x1C ^ (6 ^ 0x52);
        z.lIlIIllllI[68] = -(0xFFFFD2BB & 0x6F55) & (0xFFFFCFB7 & 0x7EDF);
        z.lIlIIllllI[69] = -(0xFFFFE3A6 & 0x7E7B) & (0xFFFFFEF7 & 0x6FBF);
        z.lIlIIllllI[70] = 0xFFFF9BDF & 0x6FAD;
        z.lIlIIllllI[71] = -(0xFFFFA7CF & 0x7A73) & (0xFFFFFFEF & 0x2F7E);
        z.lIlIIllllI[72] = -(0x4A ^ 0x43) & (0xFFFF8F79 & 0x7BBF);
        z.lIlIIllllI[73] = -(0xFFFF9B8F & 0x7D73) & (0xFFFFFFF7 & 0x3F9F);
        z.lIlIIllllI[74] = 0xFFFFBBF1 & 0x4FCF;
        z.lIlIIllllI[75] = 0xFFFFDFD7 & 0x2DB9;
        z.lIlIIllllI[76] = 0x44 ^ 0x67 ^ (0x99 ^ 0x9D);
        z.lIlIIllllI[77] = 0x8C ^ 0xA5;
        z.lIlIIllllI[78] = 0xFFFFBBA9 & 0x46FF;
        z.lIlIIllllI[79] = 0x7B ^ 0x51;
    }

    private static boolean lIIIlllIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlllIlIIlI(Object object) {
        return object != null;
    }

    @Override
    public int ad() {
        try {
            z.bD();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-"   ".length() >= 0) {
            return (0x36 ^ 0xD) & ~(0x9A ^ 0xA1);
        }
        return lIlIIllllI[65];
    }

    private static boolean lIIIlllIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void O() {
        d llllllllllllllllllllIIIIIlllllIl;
        Object llllllllllllllllllllIIIIIllllllI;
        block27: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        int[] nArray = new int[lIlIIllllI[5]];
                                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                        int[] nArray2 = new int[lIlIIllllI[5]];
                                        nArray2[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block21;
                                        int[] nArray3 = new int[lIlIIllllI[5]];
                                        nArray3[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIllllI[3])) break block21;
                                    }
                                    llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[11], lIlIIllllI[3], j.bZ);
                                    bp.add((d)llllllllllllllllllllIIIIIllllllI);
                                    "".length();
                                }
                                int[] nArray = new int[lIlIIllllI[5]];
                                nArray[z.lIlIIllllI[6]] = lIlIIllllI[25];
                                if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[25], lIlIIllllI[5], lIlIIllllI[60]);
                                    bp.add((d)llllllllllllllllllllIIIIIllllllI);
                                    "".length();
                                }
                                int[] nArray4 = new int[lIlIIllllI[5]];
                                nArray4[z.lIlIIllllI[6]] = lIlIIllllI[22];
                                if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[22], lIlIIllllI[5], lIlIIllllI[60]);
                                    bp.add((d)llllllllllllllllllllIIIIIllllllI);
                                    "".length();
                                }
                                int[] nArray5 = new int[lIlIIllllI[5]];
                                nArray5[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray5) ? 1 : 0)) break block22;
                                int[] nArray6 = new int[lIlIIllllI[5]];
                                nArray6[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray6) ? 1 : 0)) break block23;
                                int[] nArray7 = new int[lIlIIllllI[5]];
                                nArray7[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray7).getQuantity(), lIlIIllllI[9])) break block23;
                            }
                            llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[10], lIlIIllllI[9], lIlIIllllI[61]);
                            bp.add((d)llllllllllllllllllllIIIIIllllllI);
                            "".length();
                        }
                        int[] nArray = new int[lIlIIllllI[5]];
                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[19];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[19], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((d)llllllllllllllllllllIIIIIllllllI);
                            "".length();
                        }
                        int[] nArray8 = new int[lIlIIllllI[5]];
                        nArray8[z.lIlIIllllI[6]] = lIlIIllllI[17];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[17], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((d)llllllllllllllllllllIIIIIllllllI);
                            "".length();
                        }
                        int[] nArray9 = new int[lIlIIllllI[5]];
                        nArray9[z.lIlIIllllI[6]] = lIlIIllllI[15];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                            llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[15], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((d)llllllllllllllllllllIIIIIllllllI);
                            "".length();
                        }
                        int[] nArray10 = new int[lIlIIllllI[5]];
                        nArray10[z.lIlIIllllI[6]] = lIlIIllllI[16];
                        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[16], lIlIIllllI[5], lIlIIllllI[60]);
                            bp.add((d)llllllllllllllllllllIIIIIllllllI);
                            "".length();
                        }
                        int[] nArray11 = new int[lIlIIllllI[5]];
                        nArray11[z.lIlIIllllI[6]] = lIlIIllllI[14];
                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                        int[] nArray12 = new int[lIlIIllllI[5]];
                        nArray12[z.lIlIIllllI[6]] = lIlIIllllI[14];
                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray12) ? 1 : 0)) break block25;
                        int[] nArray13 = new int[lIlIIllllI[5]];
                        nArray13[z.lIlIIllllI[6]] = lIlIIllllI[14];
                        if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray13).getQuantity(), lIlIIllllI[3])) break block25;
                    }
                    llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[14], lIlIIllllI[4], lIlIIllllI[62]);
                    bp.add((d)llllllllllllllllllllIIIIIllllllI);
                    "".length();
                }
                int[] nArray = new int[lIlIIllllI[5]];
                nArray[z.lIlIIllllI[6]] = lIlIIllllI[12];
                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                int[] nArray14 = new int[lIlIIllllI[5]];
                nArray14[z.lIlIIllllI[6]] = lIlIIllllI[12];
                if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray14) ? 1 : 0)) break block27;
                int[] nArray15 = new int[lIlIIllllI[5]];
                nArray15[z.lIlIIllllI[6]] = lIlIIllllI[12];
                if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray15).getQuantity(), lIlIIllllI[4])) break block27;
            }
            llllllllllllllllllllIIIIIllllllI = new d(lIlIIllllI[12], lIlIIllllI[4], lIlIIllllI[62]);
            bp.add((d)llllllllllllllllllllIIIIIllllllI);
            "".length();
        }
        if (z.lIIIlllIlIIIl(Bank.contains((Predicate)(llllllllllllllllllllIIIIIllllllI = item -> item.getName().toLowerCase().contains(lIlIIlllII[lIlIIllllI[67]]))) ? 1 : 0)) {
            llllllllllllllllllllIIIIIlllllIl = new d(lIlIIllllI[63], lIlIIllllI[3], lIlIIllllI[64]);
            bp.add(llllllllllllllllllllIIIIIlllllIl);
            "".length();
        }
        int[] nArray = new int[lIlIIllllI[5]];
        nArray[z.lIlIIllllI[6]] = lIlIIllllI[13];
        if (z.lIIIlllIlIIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            llllllllllllllllllllIIIIIlllllIl = new d(lIlIIllllI[13], lIlIIllllI[42], lIlIIllllI[62]);
            bp.add(llllllllllllllllllllIIIIIlllllIl);
            "".length();
        }
    }

    private static String lIIIlllIIIlIl(String llllllllllllllllllllIIIIIlllIIIl, String llllllllllllllllllllIIIIIlllIIlI) {
        try {
            SecretKeySpec llllllllllllllllllllIIIIIlllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIllllI[21]), "DES");
            Cipher llllllllllllllllllllIIIIIlllIlIl = Cipher.getInstance("DES");
            llllllllllllllllllllIIIIIlllIlIl.init(lIlIIllllI[8], llllllllllllllllllllIIIIIlllIllI);
            return new String(llllllllllllllllllllIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllllIIIIIlllIlII) {
            llllllllllllllllllllIIIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void bD() {
        block50: {
            block58: {
                block57: {
                    BankLocation llllllllllllllllllllIIIIlIIIIIIl;
                    block56: {
                        block51: {
                            block55: {
                                block53: {
                                    block54: {
                                        block52: {
                                            if (z.lIIIlllIIllIl(e.j(lIlIIllllI[0]), lIlIIllllI[1])) {
                                                A.bF();
                                            }
                                            if (z.lIIIlllIIlllI(e.j(lIlIIllllI[0]), lIlIIllllI[1]) && z.lIIIlllIIllIl(e.j(lIlIIllllI[2]), lIlIIllllI[3])) {
                                                w.bi();
                                            }
                                            if (!z.lIIIlllIIlllI(Skills.getLevel((Skill)Skill.COOKING), lIlIIllllI[4]) || !z.lIIIlllIIlllI(e.j(lIlIIllllI[0]), lIlIIllllI[1]) || !z.lIIIlllIIllll(e.j(lIlIIllllI[2]), lIlIIllllI[3])) break block50;
                                            if (z.lIIIlllIlIIII(bn ? 1 : 0)) {
                                                b.a(bp);
                                                if (z.lIIIlllIIllIl(bp.size(), lIlIIllllI[5])) {
                                                    System.out.println(lIlIIlllII[lIlIIllllI[6]]);
                                                    bn = lIlIIllllI[6];
                                                }
                                            }
                                            if (!z.lIIIlllIlIIIl(bn ? 1 : 0)) break block50;
                                            if (!z.lIIIlllIlIIIl(z.al() ? 1 : 0) || !z.lIIIlllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) break block51;
                                            llllllllllllllllllllIIIIlIIIIIIl = BankLocation.getNearest();
                                            if (z.lIIIlllIlIIlI(llllllllllllllllllllIIIIlIIIIIIl) && z.lIIIlllIlIIIl(llllllllllllllllllllIIIIlIIIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[5]];
                                                a.a(llllllllllllllllllllIIIIlIIIIIIl);
                                            }
                                            if (!z.lIIIlllIlIIlI(llllllllllllllllllllIIIIlIIIIIIl) || !z.lIIIlllIlIIII(llllllllllllllllllllIIIIlIIIIIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block51;
                                            if (z.lIIIlllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIllllI[7]);
                                                "".length();
                                            }
                                            if (!z.lIIIlllIlIIII(Bank.isOpen() ? 1 : 0)) break block51;
                                            AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[8]];
                                            if (z.lIIIlllIlIIll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIlIIllllI[9]);
                                                "".length();
                                            }
                                            if (z.lIIIlllIlIIll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIlIIllllI[8]);
                                                "".length();
                                            }
                                            int[] nArray = new int[lIlIIllllI[5]];
                                            nArray[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                            if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block52;
                                            int[] nArray2 = new int[lIlIIllllI[5]];
                                            nArray2[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                            if (!z.lIIIlllIIlllI(Bank.getFirst((int[])nArray2).getQuantity(), lIlIIllllI[9])) break block53;
                                        }
                                        int[] nArray = new int[lIlIIllllI[5]];
                                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block54;
                                        int[] nArray3 = new int[lIlIIllllI[5]];
                                        nArray3[z.lIlIIllllI[6]] = lIlIIllllI[11];
                                        if (!z.lIIIlllIIlllI(Bank.getFirst((int[])nArray3).getQuantity(), lIlIIllllI[3])) break block53;
                                    }
                                    int[] nArray = new int[lIlIIllllI[5]];
                                    nArray[z.lIlIIllllI[6]] = lIlIIllllI[12];
                                    if (!z.lIIIlllIlIIII(Bank.contains((int[])nArray) ? 1 : 0)) break block55;
                                    int[] nArray4 = new int[lIlIIllllI[5]];
                                    nArray4[z.lIlIIllllI[6]] = lIlIIllllI[12];
                                    if (!z.lIIIlllIIllIl(Bank.getFirst((int[])nArray4).getQuantity(), lIlIIllllI[4])) break block55;
                                }
                                z.O();
                                System.out.println(lIlIIlllII[lIlIIllllI[1]]);
                                bn = lIlIIllllI[5];
                                return;
                            }
                            int[] nArray = new int[lIlIIllllI[2]];
                            nArray[z.lIlIIllllI[6]] = lIlIIllllI[13];
                            nArray[z.lIlIIllllI[5]] = lIlIIllllI[14];
                            nArray[z.lIlIIllllI[8]] = lIlIIllllI[12];
                            nArray[z.lIlIIllllI[1]] = lIlIIllllI[15];
                            nArray[z.lIlIIllllI[9]] = lIlIIllllI[16];
                            nArray[z.lIlIIllllI[3]] = lIlIIllllI[17];
                            nArray[z.lIlIIllllI[18]] = lIlIIllllI[19];
                            nArray[z.lIlIIllllI[20]] = lIlIIllllI[10];
                            nArray[z.lIlIIllllI[21]] = lIlIIllllI[22];
                            nArray[z.lIlIIllllI[23]] = lIlIIllllI[24];
                            nArray[z.lIlIIllllI[4]] = lIlIIllllI[25];
                            if (z.lIIIlllIlIIIl(e.b(nArray) ? 1 : 0)) {
                                z.O();
                                System.out.println(lIlIIlllII[lIlIIllllI[9]]);
                                bn = lIlIIllllI[5];
                                return;
                            }
                            int[] nArray5 = new int[lIlIIllllI[2]];
                            nArray5[z.lIlIIllllI[6]] = lIlIIllllI[13];
                            nArray5[z.lIlIIllllI[5]] = lIlIIllllI[14];
                            nArray5[z.lIlIIllllI[8]] = lIlIIllllI[12];
                            nArray5[z.lIlIIllllI[1]] = lIlIIllllI[15];
                            nArray5[z.lIlIIllllI[9]] = lIlIIllllI[16];
                            nArray5[z.lIlIIllllI[3]] = lIlIIllllI[17];
                            nArray5[z.lIlIIllllI[18]] = lIlIIllllI[19];
                            nArray5[z.lIlIIllllI[20]] = lIlIIllllI[10];
                            nArray5[z.lIlIIllllI[21]] = lIlIIllllI[22];
                            nArray5[z.lIlIIllllI[23]] = lIlIIllllI[24];
                            nArray5[z.lIlIIllllI[4]] = lIlIIllllI[25];
                            if (z.lIIIlllIlIIII(e.b(nArray5) ? 1 : 0)) {
                                a.a(lIlIIllllI[13], lIlIIllllI[4]);
                                a.a(lIlIIllllI[14], lIlIIllllI[4]);
                                a.a(lIlIIllllI[12], lIlIIllllI[4]);
                                a.a(lIlIIllllI[15], lIlIIllllI[5]);
                                a.a(lIlIIllllI[16], lIlIIllllI[5]);
                                a.a(lIlIIllllI[17], lIlIIllllI[5]);
                                a.a(lIlIIllllI[19], lIlIIllllI[5]);
                                a.a(lIlIIllllI[10], lIlIIllllI[9]);
                                a.a(lIlIIllllI[22], lIlIIllllI[5]);
                                a.a(lIlIIllllI[25], lIlIIllllI[5]);
                                a.a(lIlIIllllI[24], lIlIIllllI[3]);
                                a.a(lIlIIllllI[11], lIlIIllllI[8]);
                                a.a(lIlIIllllI[26], lIlIIllllI[7]);
                            }
                        }
                        if (z.lIIIlllIlIIII(Inventory.contains((int[])f.aU) ? 1 : 0) && z.lIIIlllIIllIl(Movement.getRunEnergy(), lIlIIllllI[27])) {
                            Inventory.getFirst((int[])f.aU).interact(lIlIIlllII[lIlIIllllI[3]]);
                            Time.sleepTicks((int)lIlIIllllI[5]);
                            "".length();
                        }
                        if (z.lIIIlllIlIIII(z.al() ? 1 : 0) && z.lIIIlllIlIIIl(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
                            if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cR), lIlIIllllI[9])) {
                                String[] stringArray = new String[lIlIIllllI[5]];
                                stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[18]];
                                if (z.lIIIlllIlIlIl(NPCs.getNearest((String[])stringArray))) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[20]];
                                    A.bG();
                                }
                            }
                            String[] stringArray = new String[lIlIIllllI[5]];
                            stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[21]];
                            if (z.lIIIlllIlIIlI(NPCs.getNearest((String[])stringArray))) {
                                if (z.lIIIlllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray2 = new String[lIlIIllllI[5]];
                                    stringArray2[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[23]];
                                    TileObjects.getNearest((String[])stringArray2).interact(lIlIIlllII[lIlIIllllI[4]]);
                                    Time.sleepTicks((int)lIlIIllllI[5]);
                                    "".length();
                                }
                                g.a(cy);
                            }
                        }
                        if (z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[4])) {
                            if (z.lIIIlllIlIllI(Vars.getBit((int)lIlIIllllI[28]), lIlIIllllI[5])) {
                                if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cS), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[2]];
                                    Movement.walkTo((WorldPoint)cS);
                                    "".length();
                                    Time.sleepTicks((int)lIlIIllllI[5]);
                                    "".length();
                                }
                                if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cS), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[29]];
                                    g.a(lIlIIlllII[lIlIIllllI[30]], cy);
                                }
                            }
                            if (z.lIIIlllIIllll(Vars.getBit((int)lIlIIllllI[28]), lIlIIllllI[5])) {
                                int[] nArray = new int[lIlIIllllI[5]];
                                nArray[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                    int[] nArray6 = new int[lIlIIllllI[5]];
                                    nArray6[z.lIlIIllllI[6]] = lIlIIllllI[26];
                                    int[] nArray7 = new int[lIlIIllllI[5]];
                                    nArray7[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                    Inventory.getFirst((int[])nArray6).useOn(Inventory.getFirst((int[])nArray7));
                                    Time.sleepTicks((int)lIlIIllllI[5]);
                                    "".length();
                                }
                                int[] nArray8 = new int[lIlIIllllI[5]];
                                nArray8[z.lIlIIllllI[6]] = lIlIIllllI[10];
                                if (z.lIIIlllIlIIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                                    if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                        AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[31]];
                                        Movement.walkTo((WorldPoint)cT);
                                        "".length();
                                        Time.sleepTicks((int)lIlIIllllI[5]);
                                        "".length();
                                    }
                                    if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                        AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[32]];
                                        g.a(lIlIIlllII[lIlIIllllI[33]], cy);
                                    }
                                }
                            }
                        }
                        if (z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[34])) {
                            if (z.lIIIlllIlIllI(Vars.getBit((int)lIlIIllllI[35]), lIlIIllllI[9])) {
                                dc = lIlIIllllI[6];
                                if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[36]];
                                    Movement.walkTo((WorldPoint)cT);
                                    "".length();
                                    Time.sleepTicks((int)lIlIIllllI[5]);
                                    "".length();
                                }
                                if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cT), lIlIIllllI[20])) {
                                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[37]];
                                    g.a(lIlIIlllII[lIlIIllllI[38]], cy);
                                    g.a(lIlIIlllII[lIlIIllllI[34]], cy);
                                }
                            }
                            if (z.lIIIlllIIllll(Vars.getBit((int)lIlIIllllI[35]), lIlIIllllI[9])) {
                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[39]];
                                g.a(lIlIIlllII[lIlIIllllI[40]], cy);
                            }
                        }
                        if (!z.lIIIlllIlIllI(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[41]) || z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[42])) {
                            AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[43]];
                            g.a(lIlIIlllII[lIlIIllllI[44]], cy);
                        }
                        if (!z.lIIIlllIIllll(Vars.getBit((int)QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIlIIllllI[27])) break block50;
                        int[] nArray = new int[lIlIIllllI[5]];
                        nArray[z.lIlIIllllI[6]] = lIlIIllllI[22];
                        if (z.lIIIlllIlIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray9 = new int[lIlIIllllI[5]];
                            nArray9[z.lIlIIllllI[6]] = lIlIIllllI[22];
                            if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIlIIllllI[5]];
                                nArray10[z.lIlIIllllI[6]] = lIlIIllllI[22];
                                Inventory.getFirst((int[])nArray10).interact(lIlIIlllII[lIlIIllllI[45]]);
                                Time.sleepTicks((int)lIlIIllllI[5]);
                                "".length();
                            }
                        }
                        int[] nArray11 = new int[lIlIIllllI[5]];
                        nArray11[z.lIlIIllllI[6]] = lIlIIllllI[22];
                        if (z.lIIIlllIlIIII(Equipment.contains((int[])nArray11) ? 1 : 0)) {
                            int[] nArray12 = new int[lIlIIllllI[5]];
                            nArray12[z.lIlIIllllI[6]] = lIlIIllllI[46];
                            if (z.lIIIlllIlIIlI(TileItems.getNearest((int[])nArray12))) {
                                int[] nArray13 = new int[lIlIIllllI[5]];
                                nArray13[z.lIlIIllllI[6]] = lIlIIllllI[46];
                                TileItems.getNearest((int[])nArray13).interact(lIlIIlllII[lIlIIllllI[47]]);
                                Time.sleepTicks((int)lIlIIllllI[5]);
                                "".length();
                            }
                        }
                        int[] nArray14 = new int[lIlIIllllI[5]];
                        nArray14[z.lIlIIllllI[6]] = lIlIIllllI[46];
                        if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                            int[] nArray15 = new int[lIlIIllllI[5]];
                            nArray15[z.lIlIIllllI[6]] = lIlIIllllI[25];
                            if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                                int[] nArray16 = new int[lIlIIllllI[5]];
                                nArray16[z.lIlIIllllI[6]] = lIlIIllllI[25];
                                if (z.lIIIlllIlIIIl(Equipment.contains((int[])nArray16) ? 1 : 0)) {
                                    int[] nArray17 = new int[lIlIIllllI[5]];
                                    nArray17[z.lIlIIllllI[6]] = lIlIIllllI[25];
                                    Inventory.getFirst((int[])nArray17).interact(lIlIIlllII[lIlIIllllI[48]]);
                                    Time.sleepTicks((int)lIlIIllllI[5]);
                                    "".length();
                                }
                            }
                            if (z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cU), lIlIIllllI[18])) {
                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[49]];
                                Movement.walkTo((WorldPoint)cU);
                                "".length();
                                Time.sleepTicks((int)lIlIIllllI[5]);
                                "".length();
                            }
                            if (z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo(cU), lIlIIllllI[18])) {
                                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[50]];
                                if (z.lIIIlllIlIlIl(Players.getLocal().getInteracting())) {
                                    String[] stringArray = new String[lIlIIllllI[5]];
                                    stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[41]];
                                    NPCs.getNearest((String[])stringArray).interact(lIlIIlllII[lIlIIllllI[51]]);
                                    Time.sleepTicks((int)lIlIIllllI[1]);
                                    "".length();
                                }
                            }
                        }
                        int[] nArray18 = new int[lIlIIllllI[5]];
                        nArray18[z.lIlIIllllI[6]] = lIlIIllllI[52];
                        if (!z.lIIIlllIlIIII(Inventory.contains((int[])nArray18) ? 1 : 0)) break block50;
                        llllllllllllllllllllIIIIlIIIIIIl = new WorldPoint(lIlIIllllI[53], lIlIIllllI[54], lIlIIllllI[6]);
                        if (!z.lIIIlllIlIlII(Players.getLocal().getWorldLocation().distanceTo(cR), lIlIIllllI[9])) break block56;
                        String[] stringArray = new String[lIlIIllllI[5]];
                        stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[55]];
                        if (!z.lIIIlllIlIIlI(NPCs.getNearest((String[])stringArray))) break block57;
                    }
                    if (!z.lIIIlllIlIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllllIIIIlIIIIIIl), lIlIIllllI[41])) break block58;
                }
                AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[56]];
                A.bG();
            }
            String[] stringArray = new String[lIlIIllllI[5]];
            stringArray[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[57]];
            if (z.lIIIlllIlIIlI(NPCs.getNearest((String[])stringArray))) {
                if (z.lIIIlllIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlllII[lIlIIllllI[58]];
                    if (z.lIIIlllIIllIl(dc, lIlIIllllI[5])) {
                        Z.mK += lIlIIllllI[5];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlIIllllI[5];
                        Z.mK = lIlIIllllI[6];
                        dd = lIlIIllllI[6];
                    }
                    int[] nArray = new int[lIlIIllllI[5]];
                    nArray[z.lIlIIllllI[6]] = lIlIIllllI[52];
                    String[] stringArray3 = new String[lIlIIllllI[5]];
                    stringArray3[z.lIlIIllllI[6]] = lIlIIlllII[lIlIIllllI[59]];
                    Inventory.getFirst((int[])nArray).useOn(TileObjects.getNearest((String[])stringArray3));
                    Time.sleepTicks((int)lIlIIllllI[5]);
                    "".length();
                }
                g.a(cy);
            }
        }
    }

    private static boolean lIIIlllIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean al() {
        int n2;
        int[] nArray = new int[lIlIIllllI[5]];
        nArray[z.lIlIIllllI[6]] = lIlIIllllI[25];
        if (z.lIIIlllIlIIll(Inventory.getCount((int[])nArray))) {
            int[] nArray2 = new int[lIlIIllllI[5]];
            nArray2[z.lIlIIllllI[6]] = lIlIIllllI[16];
            if (z.lIIIlllIlIIll(Inventory.getCount((int[])nArray2))) {
                int[] nArray3 = new int[lIlIIllllI[5]];
                nArray3[z.lIlIIllllI[6]] = lIlIIllllI[17];
                if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    int[] nArray4 = new int[lIlIIllllI[5]];
                    nArray4[z.lIlIIllllI[6]] = lIlIIllllI[19];
                    if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                        int[] nArray5 = new int[lIlIIllllI[5]];
                        nArray5[z.lIlIIllllI[6]] = lIlIIllllI[10];
                        if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                            int[] nArray6 = new int[lIlIIllllI[5]];
                            nArray6[z.lIlIIllllI[6]] = lIlIIllllI[22];
                            if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                                int[] nArray7 = new int[lIlIIllllI[5]];
                                nArray7[z.lIlIIllllI[6]] = lIlIIllllI[26];
                                if (z.lIIIlllIlIIII(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                    n2 = lIlIIllllI[5];
                                    "".length();
                                    if ((0x33 ^ 0x60 ^ (0x11 ^ 0x46)) >= 0) return n2 != 0;
                                    return ((0x39 ^ 0x53 ^ (0x74 ^ 0x4E)) & (0x7D ^ 0xE ^ (9 ^ 0x2A) ^ -" ".length())) != 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        n2 = lIlIIllllI[6];
        return n2 != 0;
    }
}

