/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Perspective
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.World
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.util.WorldUtil
 *  net.runelite.http.api.worlds.World
 *  net.runelite.http.api.worlds.WorldResult
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.GameThread
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.input.Mouse
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.World;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.o;

public class e {
    static /* synthetic */ WorldArea ag;
    static /* synthetic */ WorldPoint af;
    private static /* synthetic */ int[] llIIlIIIII;
    static final /* synthetic */ WorldArea S;
    public static /* synthetic */ WorldPoint ad;
    public static /* synthetic */ int[] ae;
    private static final /* synthetic */ long V;
    private static final /* synthetic */ int aa;
    private static final /* synthetic */ int[] ac;
    private static final /* synthetic */ int Y;
    private static final /* synthetic */ long U;
    static final /* synthetic */ WorldArea T;
    private static final /* synthetic */ Map<Integer, Integer> W;
    private static final /* synthetic */ int X;
    public static final /* synthetic */ String Q;
    private static /* synthetic */ String[] llIIIlllll;
    private static final /* synthetic */ int Z;
    public static final /* synthetic */ ThreadLocalRandom R;
    private static final /* synthetic */ int ab;

    private static String lIlIlIIIIIIll(String llllllllllllllllllIlIlIIIllIIIII, String llllllllllllllllllIlIlIIIlIlllll) {
        try {
            SecretKeySpec llllllllllllllllllIlIlIIIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIlIIIllIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIlIIIllIIlII.init(llIIlIIIII[9], llllllllllllllllllIlIlIIIllIIlIl);
            return new String(llllllllllllllllllIlIlIIIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIlIIIllIIIll) {
            llllllllllllllllllIlIlIIIllIIIll.printStackTrace();
            return null;
        }
    }

    public static boolean H() {
        int n2;
        if (!e.lIlIlIIIIlIII(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lIlIlIIIIlIII(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(af), llIIlIIIII[78]) || e.lIlIlIIIIlIll(ag.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            n2 = llIIlIIIII[1];
            0;
            if (2 <= ((1 ^ 0x40) & ~(0xE8 ^ 0xA9))) {
                return ((0xE5 ^ 0xAC) & ~(0x4D ^ 4)) != 0;
            }
        } else {
            n2 = llIIlIIIII[2];
        }
        return n2 != 0;
    }

    private static void lIlIlIIIIIlIl() {
        llIIlIIIII = new int[260];
        e.llIIlIIIII[0] = 0x74 ^ 0x12;
        e.llIIlIIIII[1] = 1;
        e.llIIlIIIII[2] = (0xC3 ^ 0x8C) & ~(0x51 ^ 0x1E);
        e.llIIlIIIII[3] = 254 + 78 - 323 + 246;
        e.llIIlIIIII[4] = -(0xFFFFFF57 & 0x7AEB) & (0xFFFFFBFF & 0x7FE7);
        e.llIIlIIIII[5] = 3;
        e.llIIlIIIII[6] = 113 + 30 - 76 + 162;
        e.llIIlIIIII[7] = (0xAF ^ 0xA4) + (0x9D ^ 0x99) - -(78 + 72 - 106 + 83) + (0x59 ^ 0x4D);
        e.llIIlIIIII[8] = 136 + 27 - 35 + 29 + (0x20 ^ 0x6C) - (55 + 36 - -30 + 64) + (90 + 150 - 203 + 146);
        e.llIIlIIIII[9] = 2;
        e.llIIlIIIII[10] = 0xB8 ^ 0x9C ^ (0x3C ^ 0x1C);
        e.llIIlIIIII[11] = 0x63 ^ 0x66;
        e.llIIlIIIII[12] = 30 + 18 - -15 + 79 ^ 36 + 126 - 139 + 113;
        e.llIIlIIIII[13] = 0x3F ^ 0x38;
        e.llIIlIIIII[14] = 0x59 ^ 8 ^ (0xDE ^ 0x87);
        e.llIIlIIIII[15] = 8 ^ 1;
        e.llIIlIIIII[16] = 0xC9 ^ 0x8E ^ (0x8B ^ 0xC6);
        e.llIIlIIIII[17] = 0xB ^ 0;
        e.llIIlIIIII[18] = 9 ^ 0x1D ^ (0xAC ^ 0xB4);
        e.llIIlIIIII[19] = 0x9B ^ 0x96;
        e.llIIlIIIII[20] = 8 ^ 0x61 ^ (0x67 ^ 0);
        e.llIIlIIIII[21] = 0xFFFFF7BF & 0xAD8;
        e.llIIlIIIII[22] = 0x2C ^ 0x31;
        e.llIIlIIIII[23] = 50 + 18 - 65 + 186 ^ 113 + 107 - 211 + 169;
        e.llIIlIIIII[24] = 0x90 ^ 0x97 ^ (0x2D ^ 0x3A);
        e.llIIlIIIII[25] = 0xFFFFAEF3 & 0x5D6C;
        e.llIIlIIIII[26] = -(0xFFFFABCD & 0x743B) & (0xFFFFFDFF & 0x2F5E);
        e.llIIlIIIII[27] = 0x57 ^ 0x6A;
        e.llIIlIIIII[28] = 0x46 ^ 0x6E;
        e.llIIlIIIII[29] = -(0xFFFFD455 & 0x6BAB) & (0xFFFFFFD7 & 0x5F6F);
        e.llIIlIIIII[30] = 0x85 ^ 0x94;
        e.llIIlIIIII[31] = 0xBA ^ 0xA8;
        e.llIIlIIIII[32] = (0xFA ^ 0x93) + (0x18 ^ 0x62) - (127 + 3 - 118 + 131) + (0x14 ^ 0x26);
        e.llIIlIIIII[33] = 0x6E ^ 0x56 ^ (0xAA ^ 0x85);
        e.llIIlIIIII[34] = 0x7C ^ 0x6F;
        e.llIIlIIIII[35] = 0xFFFFB97C & 0x7FEF;
        e.llIIlIIIII[36] = 109 + 15 - -17 + 48 ^ 83 + 88 - 150 + 148;
        e.llIIlIIIII[37] = -(0xFFFFF49F & 0xFE1) & (0xFFFFBFED & 0x7DFF);
        e.llIIlIIIII[38] = 0xC ^ 0x29 ^ (0xCC ^ 0xC0);
        e.llIIlIIIII[39] = 146 + 135 - 191 + 70 ^ 78 + 93 - 104 + 114;
        e.llIIlIIIII[40] = 0x53 ^ 0x2E ^ (0x5D ^ 0x36);
        e.llIIlIIIII[41] = 0x26 ^ 0x52;
        e.llIIlIIIII[42] = 118 + 74 - 164 + 125 ^ 84 + 59 - -33 + 9;
        e.llIIlIIIII[43] = 0x9E ^ 0x86;
        e.llIIlIIIII[44] = 0xD9 ^ 0x86 ^ (0x72 ^ 0x34);
        e.llIIlIIIII[45] = 45 + 122 - 64 + 39 ^ 58 + 113 - 129 + 106;
        e.llIIlIIIII[46] = 0x73 ^ 0x7F ^ (0xD3 ^ 0xC4);
        e.llIIlIIIII[47] = 0x6C ^ 0x70;
        e.llIIlIIIII[48] = 0xFFFFFC3F & 0x5BDD;
        e.llIIlIIIII[49] = 0x6A ^ 0x74;
        e.llIIlIIIII[50] = 0xFFFFDFDD & 0x29BF;
        e.llIIlIIIII[51] = -(0xFFFFFEC9 & 0x737F) & (0xFFFFFFFF & 0x7F7F);
        e.llIIlIIIII[52] = 0xFFFFABFF & 0x5D99;
        e.llIIlIIIII[53] = 0xFFFF9F39 & 0x6DFE;
        e.llIIlIIIII[54] = 1 ^ 0x22;
        e.llIIlIIIII[55] = -(0xFFFFEEAD & 0x375B) & (0xFFFFFF7F & 0x2FFF);
        e.llIIlIIIII[56] = -(0xFFFFFBA9 & 0x34D7) & (0xFFFFBFFF & 0x7DBF);
        e.llIIlIIIII[57] = 0xC9 ^ 0x8E;
        e.llIIlIIIII[58] = 66 + 63 - 53 + 58 + (0x1C ^ 0x7E) - (0x71 ^ 0x16) + (0xAF ^ 0xA1);
        e.llIIlIIIII[59] = -(0xFFFFFB7F & 0x36E3) & (0xFFFFBBFF & 0x7FFE);
        e.llIIlIIIII[60] = -(0xFFFFEB73 & 0x74AF) & (0xFFFFEDFF & 0x7F7B);
        e.llIIlIIIII[61] = 116 + 117 - 187 + 96 ^ 91 + 115 - 134 + 73;
        e.llIIlIIIII[62] = 0xBB ^ 0xA6 ^ (0xFA ^ 0xC6);
        e.llIIlIIIII[63] = 0x2C ^ 0x37 ^ (0x8F ^ 0xB6);
        e.llIIlIIIII[64] = 0xFFFFFD79 & 0xFBF;
        e.llIIlIIIII[65] = -(0xFFFFE775 & 0x5ABB) & (0xFFFFEF7D & 0x5FF7);
        e.llIIlIIIII[66] = 0 ^ 0x69 ^ (0xFE ^ 0xB3);
        e.llIIlIIIII[67] = 23 + 154 - 12 + 1 ^ 105 + 46 - 79 + 59;
        e.llIIlIIIII[68] = 9 ^ 0x7C ^ (0x62 ^ 0x31);
        e.llIIlIIIII[69] = -1;
        e.llIIlIIIII[70] = 86 + 68 - 89 + 107;
        e.llIIlIIIII[71] = -(0xFFFFFFEF & 0x4D9B) & (0xFFFFFFDB & 0x4FFF);
        e.llIIlIIIII[72] = 0x78 ^ 0x6F ^ (0x12 ^ 0x22);
        e.llIIlIIIII[73] = 0x12 ^ 0x38;
        e.llIIlIIIII[74] = 0x75 ^ 0x5E;
        e.llIIlIIIII[75] = 0xAC ^ 0x80;
        e.llIIlIIIII[76] = 0x53 ^ 0x7E;
        e.llIIlIIIII[77] = 125 + 128 - 145 + 23 ^ 5 + 171 - 4 + 1;
        e.llIIlIIIII[78] = 0x24 ^ 0x1D ^ (0x1A ^ 0x11);
        e.llIIlIIIII[79] = (0xAF ^ 0xC7) + (0x64 ^ 0x18) - (103 + 134 - 183 + 91) + (0xE8 ^ 0xAE);
        e.llIIlIIIII[80] = 0x4C ^ 0x7F ^ (0x3B ^ 0x6D);
        e.llIIlIIIII[81] = 0x66 ^ 0x32 ^ (3 ^ 0x78);
        e.llIIlIIIII[82] = 0xFFFFE79E & 0x1FFF;
        e.llIIlIIIII[83] = 0x2C ^ 0x1C;
        e.llIIlIIIII[84] = 0x23 ^ 0x12;
        e.llIIlIIIII[85] = 3 ^ (0x9D ^ 0xAD);
        e.llIIlIIIII[86] = 0xFFFFBFDA & 0x41FF;
        e.llIIlIIIII[87] = 0xFFFFF3BF & 0xE55;
        e.llIIlIIIII[88] = 0xA4 ^ 0xAB ^ (0x9A ^ 0xA1);
        e.llIIlIIIII[89] = 0x24 ^ 0x11;
        e.llIIlIIIII[90] = 0x47 ^ 0x71;
        e.llIIlIIIII[91] = 50 + 88 - 44 + 83 ^ 57 + 11 - -64 + 2;
        e.llIIlIIIII[92] = 120 + 60 - 114 + 89 ^ 66 + 11 - -22 + 64;
        e.llIIlIIIII[93] = 0x9C ^ 0xA5;
        e.llIIlIIIII[94] = 16 + 133 - 20 + 56 ^ 12 + 95 - 99 + 123;
        e.llIIlIIIII[95] = 0xA5 ^ 0x9E;
        e.llIIlIIIII[96] = 0x38 ^ 0x12 ^ (0xF4 ^ 0xBA);
        e.llIIlIIIII[97] = 0x36 ^ 0xA;
        e.llIIlIIIII[98] = 0xB7 ^ 0x82 ^ (0x6E ^ 0x65);
        e.llIIlIIIII[99] = 2 ^ (0xB5 ^ 0x88);
        e.llIIlIIIII[100] = 0xB6 ^ 0xC5 ^ (0x9C ^ 0xAF);
        e.llIIlIIIII[101] = (0xE3 ^ 0x91) + (0x45 ^ 3) - (0x3F ^ 0x72) + (0x1C ^ 0x72);
        e.llIIlIIIII[102] = (0x62 ^ 0xF) + (71 + 122 - 119 + 110) - (157 + 97 - 146 + 58) + (0xE ^ 0x52);
        e.llIIlIIIII[103] = 68 + 151 - 155 + 123 + (7 ^ 0x4A) - (161 + 35 - 100 + 86) + (0x6C ^ 3);
        e.llIIlIIIII[104] = 112 + 124 - 110 + 3 ^ 84 + 88 - 73 + 93;
        e.llIIlIIIII[105] = 0xFFFFBF77 & 0x4CFE;
        e.llIIlIIIII[106] = -1 & (0xFFFFEFFD & 0x1C7F);
        e.llIIlIIIII[107] = -(0xFFFFFF4E & 0x71B3) & (0xFFFFFD7F & Short.MAX_VALUE);
        e.llIIlIIIII[108] = 0xFFFFFCA7 & 0xFDC;
        e.llIIlIIIII[109] = 0xFFFFFDFB & 0xE74;
        e.llIIlIIIII[110] = -(0xFFFFFA89 & 0x777) & (0xFFFF9F6D & 0x6FFF);
        e.llIIlIIIII[111] = 0x66 ^ 0xD;
        e.llIIlIIIII[112] = -(0xFFFFDD67 & 0x6ABA) & (0xFFFFED7B & 0x5BFF);
        e.llIIlIIIII[113] = 0xFFFF8FF6 & 0x713B;
        e.llIIlIIIII[114] = -(0xFFFFDCDB & 0x3F65) & (0xFFFFDFF7 & 0x3D7E);
        e.llIIlIIIII[115] = 0xFFFF91FA & 0x6F65;
        e.llIIlIIIII[116] = 0xFFFFD77B & 0x29E7;
        e.llIIlIIIII[117] = 0xFFFFDD77 & 0x23EC;
        e.llIIlIIIII[118] = 0xFFFF89E7 & 0x777D;
        e.llIIlIIIII[119] = -(0xFFFF8CBE & 0x7FD3) & (0xFFFFDDF7 & 0x2FFF);
        e.llIIlIIIII[120] = 0xFFFFFDB7 & 0x3CA;
        e.llIIlIIIII[121] = -(0xFFFFFFD7 & 0x6E7D) & (0xFFFFFFDF & 0x6FFF);
        e.llIIlIIIII[122] = 0xFFFF91D7 & 0x6FFA;
        e.llIIlIIIII[123] = 0xFFFFC5EF & 0x3BFE;
        e.llIIlIIIII[124] = -(0xFFFFED7B & 0x1A95) & (0xFFFFA9FF & 0x5FFF);
        e.llIIlIIIII[125] = 0xFFFFBDF5 & 0x43FA;
        e.llIIlIIIII[126] = 0xFFFFE2FB & 0x1F1C;
        e.llIIlIIIII[127] = -(0xFFFF8C7A & 0x7FE7) & (0xFFFFAFE5 & 0x5E7F);
        e.llIIlIIIII[128] = -(0xFFFFEDA2 & 0x565F) & (0xFFFFFD3B & 0x47FF);
        e.llIIlIIIII[129] = 0xFFFFE9EF & 0x17FB;
        e.llIIlIIIII[130] = 0xFFFF9DDF & 0x636E;
        e.llIIlIIIII[131] = 0xFFFF95F6 & 0x6B6B;
        e.llIIlIIIII[132] = 0xFFFFE9DF & 0x17FD;
        e.llIIlIIIII[133] = 0xFFFF87DB & 0x7966;
        e.llIIlIIIII[134] = -(0xFFFFFCCF & 0x27F3) & (0xFFFFFFF7 & 0x25FB);
        e.llIIlIIIII[135] = -(0xFFFF9CCD & 0x7FF7) & (0xFFFFBDFF & 0x5FFF);
        e.llIIlIIIII[136] = 0xFFFFCBF3 & 0x357E;
        e.llIIlIIIII[137] = 0xFFFFFDF4 & 0x34F;
        e.llIIlIIIII[138] = 0xFFFFBD45 & 0x43FF;
        e.llIIlIIIII[139] = -(0xFFFFC6B6 & Short.MAX_VALUE) & (0xFFFFC7FD & Short.MAX_VALUE);
        e.llIIlIIIII[140] = 0xFFFFC3FF & 0x3DBD;
        e.llIIlIIIII[141] = -(0xFFFFEE6F & 0x73BB) & (0xFFFFEBFF & 0x77FA);
        e.llIIlIIIII[142] = 0xFFFFE7DE & 0x19FF;
        e.llIIlIIIII[143] = 0xFFFF8FFB & 0x71EE;
        e.llIIlIIIII[144] = 0xFFFFA7FE & 0x59ED;
        e.llIIlIIIII[145] = 0xFFFFCFFB & 0x31FF;
        e.llIIlIIIII[146] = 0xFFFFE25E & 0x1FAB;
        e.llIIlIIIII[147] = 0xFFFFD5DB & 0x2B6E;
        e.llIIlIIIII[148] = -(0xFFFFBF3B & 0x5EED) & (0xFFFFBFFB & 0x5FFD);
        e.llIIlIIIII[149] = -(0xFFFFECB7 & 0x77ED) & (0xFFFFFFF5 & 0x66AE);
        e.llIIlIIIII[150] = 0xFFFFA3EF & 0x5E3F;
        e.llIIlIIIII[151] = 0xFFFF837B & 0x7DFD;
        e.llIIlIIIII[152] = -(0xFFFFFEFF & 0x6F92) & (0xFFFFFFFF & 0x6FDD);
        e.llIIlIIIII[153] = -(0xFFFFFE67 & 0x199F) & (0xFFFF9FFF & 0x79FF);
        e.llIIlIIIII[154] = -(0xFFFFDBBF & 0x76E3) & (0xFFFFF3F7 & 0x5FFB);
        e.llIIlIIIII[155] = -(0xFFFFBFAF & 0x7C7D) & (0xFFFFFF6E & 0x3EBF);
        e.llIIlIIIII[156] = 0xFFFF89EF & 0x7757;
        e.llIIlIIIII[157] = -(0xFFFFE6DE & 0x5D2F) & (0xFFFFEFFF & 0x55ED);
        e.llIIlIIIII[158] = 0xFFFFA9FF & 0x5758;
        e.llIIlIIIII[159] = -(0xFFFFF733 & 0x48ED) & (0xFFFFC3FF & 0x7DFF);
        e.llIIlIIIII[160] = 0xFFFFC7FD & 0x39EF;
        e.llIIlIIIII[161] = 0xFFFFADD6 & 0x537F;
        e.llIIlIIIII[162] = -(0xFFFFD321 & 0x2EDF) & (0xFFFF93BF & 0x6FFE);
        e.llIIlIIIII[163] = 0xFFFFC74C & 0x39F3;
        e.llIIlIIIII[164] = 0xFFFFDBDE & 0x257F;
        e.llIIlIIIII[165] = 0xFFFFDB59 & 0x25E7;
        e.llIIlIIIII[166] = -(0xFFFFF6BB & 0x7FED) & (0xFFFFF7FF & 0x7FFD);
        e.llIIlIIIII[167] = -(0xFFFFFA3E & 0x5FD3) & (0xFFFFDBBF & 0x7FF7);
        e.llIIlIIIII[168] = -(0xFFFFAEF7 & 0x5529) & (0xFFFFFFFF & 0x5EF);
        e.llIIlIIIII[169] = -(0xFFFFDE9B & 0x67ED) & (0xFFFFEFFF & 0x57FE);
        e.llIIlIIIII[170] = -(0xFFFFDE9F & 0x7BE7) & (0xFFFFDBFE & Short.MAX_VALUE);
        e.llIIlIIIII[171] = -(0xFFFFDEA5 & 0x675B) & (0xFFFFFF50 & 0x47FF);
        e.llIIlIIIII[172] = -(0xFFFFFF3F & 0x4AF7) & (0xFFFFDB7F & 0x6FFF);
        e.llIIlIIIII[173] = -(0xFFFFD9B3 & 0x76FD) & (0xFFFFFDFB & 0x53FF);
        e.llIIlIIIII[174] = -(0xFFFFFBD9 & 0x16A7) & (0xFFFFB3DF & 0x5FED);
        e.llIIlIIIII[175] = 0xFFFFC93C & 0x37F3;
        e.llIIlIIIII[176] = 0xFFFFF1FB & 0xF6E;
        e.llIIlIIIII[177] = 0xFFFF99F3 & 0x674F;
        e.llIIlIIIII[178] = 0x65 ^ 0x27;
        e.llIIlIIIII[179] = 0xFFFFC3B3 & 0x3D7F;
        e.llIIlIIIII[180] = 0x7A ^ 0x39;
        e.llIIlIIIII[181] = 0xFFFFF3F7 & 0xD3D;
        e.llIIlIIIII[182] = 162 + 133 - 278 + 190 ^ 82 + 48 - 125 + 134;
        e.llIIlIIIII[183] = 0xFFFFE97F & 0x17B7;
        e.llIIlIIIII[184] = 0x51 ^ 0x14;
        e.llIIlIIIII[185] = -(0xFFFFB48D & 0x7BFB) & (0xFFFFB5FF & 0x7BFF);
        e.llIIlIIIII[186] = 0xD5 ^ 0x90 ^ 3;
        e.llIIlIIIII[187] = -(0xFFFFEAC6 & 0x7F3F) & (0xFFFFEB7F & Short.MAX_VALUE);
        e.llIIlIIIII[188] = -(0xFFFFBFDB & 0x5CE7) & (0xFFFFBFEF & 0x5ED3);
        e.llIIlIIIII[189] = 0x1C ^ 0x54;
        e.llIIlIIIII[190] = -(0xFFFFFE51 & 0x6FFF) & (0xFFFFFFFF & 0x6F7F);
        e.llIIlIIIII[191] = 0xF4 ^ 0xBD;
        e.llIIlIIIII[192] = -(0xFFFFFFEB & 0x5CD5) & (0xFFFFFDFC & 0x5FFB);
        e.llIIlIIIII[193] = 0x79 ^ 0x33;
        e.llIIlIIIII[194] = 0xFFFFAD79 & 0x53BF;
        e.llIIlIIIII[195] = 0xE8 ^ 0xA3;
        e.llIIlIIIII[196] = -(0xFFFFFFCF & 0x64F3) & (0xFFFFEDFF & 0x77FF);
        e.llIIlIIIII[197] = 0x3F ^ 0x73;
        e.llIIlIIIII[198] = -(0xFFFFFD97 & 0x3AED) & (0xFFFFFBDF & 0x3DF7);
        e.llIIlIIIII[199] = 0xAE ^ 0x8A ^ (0x30 ^ 0x59);
        e.llIIlIIIII[200] = 0xFFFFB3F7 & 0x4D5C;
        e.llIIlIIIII[201] = 0x38 ^ 0x76;
        e.llIIlIIIII[202] = 0xFFFFA3DF & 0x5D77;
        e.llIIlIIIII[203] = 174 + 54 - 92 + 89 ^ 61 + 1 - 59 + 171;
        e.llIIlIIIII[204] = -(0xFFFFFCAD & 0x4FD7) & (0xFFFFEDFF & 0x5FDF);
        e.llIIlIIIII[205] = 0xFC ^ 0xAC;
        e.llIIlIIIII[206] = 0xFFFFC5FC & 0x3B5F;
        e.llIIlIIIII[207] = 0x53 ^ 2;
        e.llIIlIIIII[208] = -(0xFFFFBEE5 & 0x7F3B) & (0xFFFFFFFF & 0x3F7F);
        e.llIIlIIIII[209] = 0xAF ^ 0x8F ^ (0xB7 ^ 0xC5);
        e.llIIlIIIII[210] = -(0xFFFFD21D & 0x7FFB) & (0xFFFFD37F & Short.MAX_VALUE);
        e.llIIlIIIII[211] = 0x47 ^ 0x36 ^ (0xB7 ^ 0x95);
        e.llIIlIIIII[212] = -(0xFFFFFD8A & 0x7E77) & (0xFFFFFF6F & 0x7DF9);
        e.llIIlIIIII[213] = 158 + 135 - 220 + 145 ^ 26 + 53 - 48 + 111;
        e.llIIlIIIII[214] = -(0xFFFFB6B7 & 0x6BD9) & (0xFFFFFFFF & 0x23FF);
        e.llIIlIIIII[215] = 0x1E ^ 0x4B;
        e.llIIlIIIII[216] = -(0xFFFFF5B7 & 0x7A58) & (0xFFFFFFFF & 0x717F);
        e.llIIlIIIII[217] = 0x74 ^ 0x49 ^ (0xC1 ^ 0xAA);
        e.llIIlIIIII[218] = 0xFFFFE5E3 & 0x1BFD;
        e.llIIlIIIII[219] = 0x28 ^ 0x39 ^ (0x21 ^ 0x67);
        e.llIIlIIIII[220] = -(0xFFFFDFFE & 0x741F) & (0xFFFFF7FF & 0x5DFF);
        e.llIIlIIIII[221] = 0xF ^ 0x57;
        e.llIIlIIIII[222] = -(0xFFFFFF3F & 0x2CCA) & (0xFFFFEFFD & 0x3DEF);
        e.llIIlIIIII[223] = 0xCA ^ 0x93;
        e.llIIlIIIII[224] = -(0xFFFFBF35 & 0x52DB) & (0xFFFF9BF7 & 0x77FD);
        e.llIIlIIIII[225] = 0x20 ^ 0x1F ^ (0xE6 ^ 0x83);
        e.llIIlIIIII[226] = 0xFFFFF7F7 & 0x9EE;
        e.llIIlIIIII[227] = 0xD3 ^ 0xBE ^ (0x18 ^ 0x2E);
        e.llIIlIIIII[228] = -(0xBE ^ 0xAF) & (0xFFFFC3F7 & 0x3DFF);
        e.llIIlIIIII[229] = 0x17 ^ 0x7B ^ (0x60 ^ 0x50);
        e.llIIlIIIII[230] = -(0xFFFFFD77 & 0x5E9C) & (0xFFFFFDFF & 0x5FFB);
        e.llIIlIIIII[231] = 0xC8 ^ 0x95;
        e.llIIlIIIII[232] = 0xFFFFB7FF & 0x49E9;
        e.llIIlIIIII[233] = 15 + 98 - -3 + 42 ^ 173 + 3 - 31 + 47;
        e.llIIlIIIII[234] = -(0xFFFFFF0B & 0x58F5) & (0xFFFFDBFE & 0x7DFB);
        e.llIIlIIIII[235] = 78 + 179 - 115 + 62 ^ 78 + 63 - 36 + 42;
        e.llIIlIIIII[236] = -(0xFFFFF7DE & 0x7C25) & (0xFFFFFDFF & 0x77FF);
        e.llIIlIIIII[237] = 109 + 57 - 121 + 153 ^ 157 + 120 - 218 + 107;
        e.llIIlIIIII[238] = 0xFFFF8FFD & 0x71FF;
        e.llIIlIIIII[239] = 0x53 ^ 0x44 ^ (0xF0 ^ 0x86);
        e.llIIlIIIII[240] = 0xFFFF87FE & 0x79FF;
        e.llIIlIIIII[241] = 0x35 ^ 0x6D ^ (0x92 ^ 0xA8);
        e.llIIlIIIII[242] = -(0xFFFFEFDD & 0x3223) & (0xFFFFA7FF & 0x7BFF);
        e.llIIlIIIII[243] = 0x1F ^ 0x65 ^ (0x5D ^ 0x44);
        e.llIIlIIIII[244] = 0xFFFF86FD & 0x7B07;
        e.llIIlIIIII[245] = 0xFFFFBB7F & 0x4686;
        e.llIIlIIIII[246] = 0xFFFF96B7 & 0x6B4F;
        e.llIIlIIIII[247] = 0xFFFFAF8B & 0x527C;
        e.llIIlIIIII[248] = 40 + 93 - 24 + 118 ^ 38 + 101 - 40 + 33;
        e.llIIlIIIII[249] = 0xFFFFEA9F & 0x1769;
        e.llIIlIIIII[250] = 0xC2 ^ 0xAA;
        e.llIIlIIIII[251] = -(0xFFFFDDF1 & 0x7BCF) & (0xFFFFFFDF & 0x5BEB);
        e.llIIlIIIII[252] = 0x8B ^ 0xC0 ^ (0x24 ^ 6);
        e.llIIlIIIII[253] = 0xFFFFFFEE & 0x21D;
        e.llIIlIIIII[254] = 0x95 ^ 0xA1 ^ (0x6E ^ 0x30);
        e.llIIlIIIII[255] = -(0xFFFFFF3F & 0x15F1) & (0xFFFFDFFF & 0x373D);
        e.llIIlIIIII[256] = -(0xFFFFD76D & 0x6BB7) & (0xFFFFDFFD & 0x6FAE);
        e.llIIlIIIII[257] = -(0xFFFFF5F9 & 0x7B2F) & (0xFFFFFFBB & 0x7DFF);
        e.llIIlIIIII[258] = 0xFFFFBF9D & 0x4BEF;
        e.llIIlIIIII[259] = -(0xFFFFE66B & 0x3BDF) & (0xFFFFEF6E & 0x3FDF);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(HashMap<Integer, Integer> hashMap, boolean bl, boolean bl2) {
        if (e.lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(ad), llIIlIIIII[10])) {
            int n2;
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[24]];
            WorldArea worldArea = new WorldArea(llIIlIIIII[25], llIIlIIIII[26], llIIlIIIII[27], llIIlIIIII[28], llIIlIIIII[2]);
            int[] nArray = new int[llIIlIIIII[1]];
            nArray[e.llIIlIIIII[2]] = llIIlIIIII[29];
            int n3 = Inventory.contains((int[])nArray);
            if (e.lIlIlIIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                n2 = llIIlIIIII[1];
                0;
                if (3 < 0) {
                    return;
                }
            } else {
                n2 = llIIlIIIII[2];
            }
            if (e.lIlIlIIIIlIll(n3 & n2)) {
                int[] nArray2 = new int[llIIlIIIII[1]];
                nArray2[e.llIIlIIIII[2]] = llIIlIIIII[29];
                Inventory.getFirst((int[])nArray2).interact(llIIIlllll[llIIlIIIII[30]]);
                Time.sleepTicks((int)llIIlIIIII[14]);
                0;
            }
            Movement.walkTo((WorldPoint)ad);
            0;
            Time.sleepTicks((int)llIIlIIIII[1]);
            0;
        }
        if (e.lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(ad), llIIlIIIII[10])) {
            HashMap<Integer, Integer> llllllllllllllllllIlIlIIllIllIIl;
            void llllllllllllllllllIlIlIIllIlIlll;
            void llllllllllllllllllIlIlIIllIllIII;
            if (e.lIlIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                a.a();
            }
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[31]];
            if (e.lIlIlIIIIlIll((int)llllllllllllllllllIlIlIIllIllIII) && e.lIlIlIIIIIllI(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks((int)llIIlIIIII[10]);
                0;
            }
            if (e.lIlIlIIIIlIll((int)llllllllllllllllllIlIlIIllIlIlll) && e.lIlIlIIIIIllI(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks((int)llIIlIIIII[9]);
                0;
            }
            Iterator<Map.Entry<Integer, Integer>> llllllllllllllllllIlIlIIllIlIllI = llllllllllllllllllIlIlIIllIllIIl.entrySet().iterator();
            while (e.lIlIlIIIIlIll(llllllllllllllllllIlIlIIllIlIllI.hasNext() ? 1 : 0)) {
                Map.Entry<Integer, Integer> llllllllllllllllllIlIlIIllIlIlIl = llllllllllllllllllIlIlIIllIlIllI.next();
                int llllllllllllllllllIlIlIIllIlIlII = llllllllllllllllllIlIlIIllIlIlIl.getKey();
                int llllllllllllllllllIlIlIIllIlIIll = llllllllllllllllllIlIlIIllIlIlIl.getValue();
                System.out.println("Key: " + llllllllllllllllllIlIlIIllIlIlII + ", Value: " + llllllllllllllllllIlIlIIllIlIIll);
                a.a(llllllllllllllllllIlIlIIllIlIlII, llllllllllllllllllIlIlIIllIlIIll);
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
                0;
                if (3 >= 0) continue;
                return;
            }
        }
    }

    private static String lIlIlIIIIIIlI(String llllllllllllllllllIlIlIIlIIIIlIl, String llllllllllllllllllIlIlIIlIIIIllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIlIIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIIlIIIIllI.getBytes(StandardCharsets.UTF_8)), llIIlIIIII[14]), "DES");
            Cipher llllllllllllllllllIlIlIIlIIIlIIl = Cipher.getInstance("DES");
            llllllllllllllllllIlIlIIlIIIlIIl.init(llIIlIIIII[9], llllllllllllllllllIlIlIIlIIIlIlI);
            return new String(llllllllllllllllllIlIlIIlIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIlIlIIlIIIlIII) {
            llllllllllllllllllIlIlIIlIIIlIII.printStackTrace();
            return null;
        }
    }

    public static long u() {
        return U + (System.nanoTime() - V) / 1000000L;
    }

    public static void a(WorldPoint worldPoint) {
        if (e.lIlIlIIIIlIII(o.cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (e.lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(o.cB), llIIlIIIII[5])) {
                AccBuilderSotf.c = llIIIlllll[llIIlIIIII[1]];
                Movement.walkTo((WorldPoint)o.cB);
                0;
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
            }
            if (e.lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(o.cB), llIIlIIIII[5])) {
                NPC llllllllllllllllllIlIlIIllllIIII;
                AccBuilderSotf.c = llIIIlllll[llIIlIIIII[9]];
                if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIllllIIII = NPCs.getNearest(nPC -> {
                    String[] stringArray = new String[llIIlIIIII[1]];
                    stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[97]];
                    return nPC.hasAction(stringArray);
                }))) {
                    String[] stringArray = new String[llIIlIIIII[1]];
                    stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[5]];
                    if (e.lIlIlIIIIlIll(llllllllllllllllllIlIlIIllllIIII.hasAction(stringArray) ? 1 : 0)) {
                        llllllllllllllllllIlIlIIllllIIII.interact(llIIIlllll[llIIlIIIII[10]]);
                        Time.sleepTicks((int)llIIlIIIII[5]);
                        0;
                    }
                    String[] stringArray2 = new String[llIIlIIIII[1]];
                    stringArray2[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[11]];
                    if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIllllIIII.hasAction(stringArray2) ? 1 : 0)) {
                        g.b(llIIIlllll[llIIlIIIII[12]], o.cE);
                        Time.sleepTicks((int)llIIlIIIII[1]);
                        0;
                    }
                }
                String[] stringArray = new String[llIIlIIIII[1]];
                stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[13]];
                NPC llllllllllllllllllIlIlIIlllIllll = NPCs.getNearest((String[])stringArray);
                if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIlllIllll)) {
                    String[] stringArray3 = new String[llIIlIIIII[1]];
                    stringArray3[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[14]];
                    if (e.lIlIlIIIIlIll(llllllllllllllllllIlIlIIlllIllll.hasAction(stringArray3) ? 1 : 0)) {
                        llllllllllllllllllIlIlIIlllIllll.interact(llIIIlllll[llIIlIIIII[15]]);
                        Time.sleepTicks((int)llIIlIIIII[5]);
                        0;
                    }
                    String[] stringArray4 = new String[llIIlIIIII[1]];
                    stringArray4[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[16]];
                    if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIlllIllll.hasAction(stringArray4) ? 1 : 0)) {
                        g.b(llIIIlllll[llIIlIIIII[17]], o.cE);
                        Time.sleepTicks((int)llIIlIIIII[1]);
                        0;
                    }
                }
            }
        }
        if (e.lIlIlIIIIlIll(o.cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint llllllllllllllllllIlIlIIllllIIIl;
            Movement.walkTo((WorldPoint)llllllllllllllllllIlIlIIllllIIIl);
            0;
            Time.sleepTicks((int)llIIlIIIII[1]);
            0;
        }
    }

    private static boolean lIlIlIIIIllll(int n2, int n3) {
        return n2 != n3;
    }

    public static void D() {
        World world2 = Worlds.getRandom(world -> {
            int n2;
            if (e.lIlIlIIIIlIll(world.isMembers() ? 1 : 0) && e.lIlIlIIIIlllI(world.getPlayerCount(), llIIlIIIII[82]) && e.lIlIlIIIIllll(world.getId(), Worlds.getCurrentId()) && e.lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[83]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[84]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[78]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[85]]) ? 1 : 0) && e.lIlIlIIIIllll(world.getId(), llIIlIIIII[86]) && e.lIlIlIIIIllll(world.getId(), llIIlIIIII[87]) && e.lIlIlIIIIllll(world.getId(), llIIlIIIII[87]) && e.lIlIlIIIIlIII(world.getActivity().contains(llIIIlllll[llIIlIIIII[88]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().contains(llIIIlllll[llIIlIIIII[89]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().contains(llIIIlllll[llIIlIIIII[90]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[91]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[92]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[93]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[94]]) ? 1 : 0) && e.lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[95]]) ? 1 : 0) && e.lIlIlIIIIllIl(world.getPlayerCount(), llIIlIIIII[96])) {
                n2 = llIIlIIIII[1];
                0;
                if (1 <= -1) {
                    return ((0x29 ^ 0 ^ (0x11 ^ 0xA)) & (0x4A ^ 0x14 ^ (0xA9 ^ 0xC5) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIIII[2];
            }
            return n2 != 0;
        });
        Worlds.hopTo((World)world2);
    }

    public static void G() {
        block9: {
            int llllllllllllllllllIlIlIIlIIllIII = llIIlIIIII[2];
            do {
                String[] stringArray = new String[llIIlIIIII[1]];
                stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[38]];
                if (!e.lIlIlIIIIlIIl(TileObjects.getNearest((String[])stringArray)) || !e.lIlIlIIIIlIII(AccBuilderSotf.d ? 1 : 0)) break block9;
                AccBuilderSotf.c = llIIIlllll[llIIlIIIII[73]];
                String[] stringArray2 = new String[llIIlIIIII[1]];
                stringArray2[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[74]];
                NPC llllllllllllllllllIlIlIIlIIlIlll = NPCs.getNearest((String[])stringArray2);
                if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIlIIllIII)) {
                    if (e.lIlIlIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                        llllllllllllllllllIlIlIIlIIlIlll.interact(llIIIlllll[llIIlIIIII[75]]);
                    }
                    if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                        List llllllllllllllllllIlIlIIlIIlIllI;
                        if (e.lIlIlIIIIlIII(Dialog.canContinueNPC() ? 1 : 0) && e.lIlIlIIIIlIII(Dialog.canContinue() ? 1 : 0) && e.lIlIlIIIIlIII((llllllllllllllllllIlIlIIlIIlIllI = Dialog.getOptions()).isEmpty() ? 1 : 0)) {
                            List llllllllllllllllllIlIlIIlIIlIlIl = llllllllllllllllllIlIlIIlIIlIllI.stream().filter(widget -> {
                                boolean bl;
                                if (e.lIlIlIIIIlIII(widget.getText().contains(llIIIlllll[llIIlIIIII[81]]) ? 1 : 0)) {
                                    bl = llIIlIIIII[1];
                                    0;
                                    if (1 == (0x70 ^ 0x74)) {
                                        return ((0x7A ^ 0x3B) & ~(0x27 ^ 0x66)) != 0;
                                    }
                                } else {
                                    bl = llIIlIIIII[2];
                                }
                                return bl;
                            }).collect(Collectors.toList());
                            if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIlIIlIlIl.isEmpty() ? 1 : 0)) {
                                Mouse.click((int)((Widget)llllllllllllllllllIlIlIIlIIlIlIl.get(llIIlIIIII[2])).getClickPoint().getX(), (int)((Widget)llllllllllllllllllIlIlIIlIIlIlIl.get(llIIlIIIII[2])).getClickPoint().getY(), (boolean)llIIlIIIII[1]);
                                Time.sleepTicks((int)llIIlIIIII[5]);
                                0;
                            }
                            if (e.lIlIlIIIIlIlI(llllllllllllllllllIlIlIIlIIlIlIl.size(), llIIlIIIII[1])) {
                                llllllllllllllllllIlIlIIlIIllIII = llIIlIIIII[1];
                            }
                        }
                        if (!e.lIlIlIIIIlIII(Dialog.canContinueNPC() ? 1 : 0) || e.lIlIlIIIIlIll(Dialog.canContinue() ? 1 : 0)) {
                            Dialog.continueSpace();
                        }
                    }
                }
                if (e.lIlIlIIIIlIll(llllllllllllllllllIlIlIIlIIllIII)) {
                    String[] stringArray3 = new String[llIIlIIIII[1]];
                    stringArray3[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[76]];
                    TileObjects.getNearest((String[])stringArray3).interact(llIIIlllll[llIIlIIIII[77]]);
                    Time.sleepTicks((int)llIIlIIIII[11]);
                    0;
                }
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
                0;
            } while (((0xBF ^ 0xB9 ^ (0x88 ^ 0xAB)) & (122 + 22 - 25 + 31 ^ 10 + 45 - -33 + 91 ^ -1)) == (1 & (1 ^ -1)));
            return;
        }
    }

    public static String h(int n2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String string = numberFormat.format(n2);
        return string;
    }

    public static void C() {
        Widget widget = Widgets.get((int)llIIlIIIII[41], (int)llIIlIIIII[42]);
        if (e.lIlIlIIIIlIIl(widget)) {
            widget.interact(llIIIlllll[llIIlIIIII[33]]);
            Time.sleepTicks((int)llIIlIIIII[1]);
            0;
        }
    }

    private static void lIlIlIIIIIlII() {
        llIIIlllll = new String[llIIlIIIII[178]];
        e.llIIIlllll[e.llIIlIIIII[2]] = e."Equipping gear";
        e.llIIIlllll[e.llIIlIIIII[1]] = e."Nav to veos";
        e.llIIIlllll[e.llIIlIIIII[9]] = e."Handle veos chat";
        e.llIIIlllll[e.llIIlIIIII[5]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[10]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[11]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[12]] = e."Veos";
        e.llIIIlllll[e.llIIlIIIII[13]] = e."Cabin Boy Herbert";
        e.llIIIlllll[e.llIIlIIIII[14]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[15]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[16]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[17]] = e."Cabin Boy Herbert";
        e.llIIIlllll[e.llIIlIIIII[18]] = e."%%0%dd";
        e.llIIIlllll[e.llIIlIIIII[19]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
        e.llIIIlllll[e.llIIlIIIII[20]] = e."line.separator";
        e.llIIIlllll[e.llIIlIIIII[23]] = e."Close";
        e.llIIIlllll[e.llIIlIIIII[24]] = e."Nav to Varrock W bank";
        e.llIIIlllll[e.llIIlIIIII[30]] = e."Break";
        e.llIIIlllll[e.llIIlIIIII[31]] = e."Handling banking";
        e.llIIIlllll[e.llIIlIIIII[34]] = e."Select Warnings";
        e.llIIIlllll[e.llIIlIIIII[36]] = e."Toggle";
        e.llIIIlllll[e.llIIlIIIII[39]] = e."Toggle";
        e.llIIIlllll[e.llIIlIIIII[40]] = e."Close";
        e.llIIIlllll[e.llIIlIIIII[33]] = e."All Settings";
        e.llIIIlllll[e.llIIlIIIII[43]] = e."Wear";
        e.llIIIlllll[e.llIIlIIIII[44]] = e."Wear";
        e.llIIIlllll[e.llIIlIIIII[45]] = e."Wield";
        e.llIIIlllll[e.llIIlIIIII[46]] = e."Wield";
        e.llIIIlllll[e.llIIlIIIII[47]] = e."Equip";
        e.llIIIlllll[e.llIIlIIIII[22]] = e."Equip";
        e.llIIIlllll[e.llIIlIIIII[49]] = e."Give me a PK skull.";
        e.llIIIlllll[e.llIIlIIIII[61]] = e."Nav to outside gate";
        e.llIIIlllll[e.llIIlIIIII[42]] = e."Gate";
        e.llIIIlllll[e.llIIlIIIII[62]] = e."Open";
        e.llIIIlllll[e.llIIlIIIII[63]] = e."Sorry, I'm a bit busy.";
        e.llIIIlllll[e.llIIlIIIII[54]] = e."Nav to stronghold tile";
        e.llIIIlllll[e.llIIlIIIII[66]] = e."POST";
        e.llIIIlllll[e.llIIlIIIII[67]] = e."Content-Type";
        e.llIIIlllll[e.llIIlIIIII[68]] = e."application/json";
        e.llIIIlllll[e.llIIlIIIII[72]] = e."Auto retaliate";
        e.llIIIlllll[e.llIIlIIIII[28]] = e."Auto retaliate";
        e.llIIIlllll[e.llIIlIIIII[38]] = e."Death's Coffer";
        e.llIIIlllll[e.llIIlIIIII[73]] = e."Handling death";
        e.llIIIlllll[e.llIIlIIIII[74]] = e."Death";
        e.llIIIlllll[e.llIIlIIIII[75]] = e."Talk-to";
        e.llIIIlllll[e.llIIlIIIII[76]] = e."Portal";
        e.llIIIlllll[e.llIIlIIIII[77]] = e."Use";
        e.llIIIlllll[e.llIIlIIIII[81]] = e."<str>";
        e.llIIIlllll[e.llIIlIIIII[83]] = e."total";
        e.llIIIlllll[e.llIIlIIIII[84]] = e."PvP";
        e.llIIIlllll[e.llIIlIIIII[78]] = e."PvP";
        e.llIIIlllll[e.llIIlIIIII[85]] = e."High";
        e.llIIIlllll[e.llIIlIIIII[88]] = e."Leagues";
        e.llIIIlllll[e.llIIlIIIII[89]] = e."Beta";
        e.llIIIlllll[e.llIIlIIIII[90]] = e."beta";
        e.llIIIlllll[e.llIIlIIIII[91]] = e."Deadman";
        e.llIIIlllll[e.llIIlIIIII[92]] = e."Deadman";
        e.llIIIlllll[e.llIIlIIIII[93]] = e."Speedrunning";
        e.llIIIlllll[e.llIIlIIIII[94]] = e."total";
        e.llIIIlllll[e.llIIlIIIII[95]] = e."Beta";
        e.llIIIlllll[e.llIIlIIIII[97]] = e."Port Piscarilius";
        e.llIIIlllll[e.llIIlIIIII[27]] = e."continue";
        e.llIIIlllll[e.llIIlIIIII[98]] = e."continue";
        e.llIIIlllll[e.llIIlIIIII[99]] = e."continue";
        e.llIIIlllll[e.llIIlIIIII[100]] = e."continue";
        e.llIIIlllll[e.llIIlIIIII[104]] = e."C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    }

    public static void A() {
        Widget llllllllllllllllllIlIlIIllIIllll;
        if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.lIlIlIIIIlIll(e.z() ? 1 : 0)) {
            if (e.lIlIlIIIIlIII(e.B() ? 1 : 0)) {
                e.C();
            }
            if (e.lIlIlIIIIlIll(e.B() ? 1 : 0)) {
                Widget llllllllllllllllllIlIlIIllIIllIl;
                Widget llllllllllllllllllIlIlIIllIIlllI;
                llllllllllllllllllIlIlIIllIIllll = Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[33], (int)llIIlIIIII[13]);
                if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIllIIllll)) {
                    llllllllllllllllllIlIlIIllIIllll.interact(llIIIlllll[llIIlIIIII[34]]);
                    Time.sleepTicks((int)llIIlIIIII[1]);
                    0;
                }
                if (e.lIlIlIIIIlIII(Vars.getBit((int)llIIlIIIII[35])) && e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIllIIlllI = Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[34], (int)llIIlIIIII[28]))) {
                    if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIllIIlllI.isVisible() ? 1 : 0)) {
                        llllllllllllllllllIlIlIIllIIllIl = Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[36], (int)llIIlIIIII[11]);
                        Mouse.click((int)llllllllllllllllllIlIlIIllIIllIl.getClickPoint().getX(), (int)llllllllllllllllllIlIlIIllIIllIl.getClickPoint().getY(), (boolean)llIIlIIIII[1]);
                        Time.sleepTicks((int)llIIlIIIII[1]);
                        0;
                    }
                    if (e.lIlIlIIIIlIll(llllllllllllllllllIlIlIIllIIlllI.isVisible() ? 1 : 0)) {
                        llllllllllllllllllIlIlIIllIIlllI.interact(llIIIlllll[llIIlIIIII[36]]);
                        Time.sleepTicks((int)llIIlIIIII[1]);
                        0;
                    }
                }
                if (e.lIlIlIIIIlIII(Vars.getBit((int)llIIlIIIII[37])) && e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIllIIlllI = Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[34], (int)llIIlIIIII[38]))) {
                    if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIllIIlllI.isVisible() ? 1 : 0)) {
                        llllllllllllllllllIlIlIIllIIllIl = Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[36], (int)llIIlIIIII[11]);
                        Mouse.click((int)llllllllllllllllllIlIlIIllIIllIl.getClickPoint().getX(), (int)llllllllllllllllllIlIlIIllIIllIl.getClickPoint().getY(), (boolean)llIIlIIIII[1]);
                        Time.sleepTicks((int)llIIlIIIII[1]);
                        0;
                    }
                    if (e.lIlIlIIIIlIll(llllllllllllllllllIlIlIIllIIlllI.isVisible() ? 1 : 0)) {
                        llllllllllllllllllIlIlIIllIIlllI.interact(llIIIlllll[llIIlIIIII[39]]);
                        Time.sleepTicks((int)llIIlIIIII[9]);
                        0;
                    }
                }
            }
        }
        if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIllIIllll = Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[10]))) {
            llllllllllllllllllIlIlIIllIIllll.interact(llIIIlllll[llIIlIIIII[40]]);
            Time.sleepTicks((int)llIIlIIIII[1]);
            0;
        }
    }

    public static void t() {
        List list = Widgets.getAll((int)llIIlIIIII[6], widget -> widget.getText().contains(llIIIlllll[llIIlIIIII[100]]));
        List list2 = Widgets.getAll((int)llIIlIIIII[7], widget -> widget.getText().contains(llIIIlllll[llIIlIIIII[99]]));
        List list3 = Widgets.getAll((int)llIIlIIIII[8], widget -> widget.getText().contains(llIIIlllll[llIIlIIIII[98]]));
        int llllllllllllllllllIlIlIIllllllII = llIIlIIIII[2];
        while (e.lIlIlIIIIIlll(llllllllllllllllllIlIlIIllllllII, ac.length)) {
            Widget llllllllllllllllllIlIlIIlllllIll = Widgets.get((int)ac[llllllllllllllllllIlIlIIllllllII], widget -> widget.getText().contains(llIIIlllll[llIIlIIIII[27]]));
            if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIlllllIll)) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ac[llllllllllllllllllIlIlIIllllllII]);
            }
            ++llllllllllllllllllIlIlIIllllllII;
            0;
            if (1 > 0) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void c(WorldPoint worldPoint) {
        void var7_7;
        void var5_5;
        void var4_4;
        int n2;
        int n3;
        int llllllllllllllllllIlIlIIlIlIIlII;
        void llllllllllllllllllIlIlIIlIlIlIII;
        WorldPoint llllllllllllllllllIlIlIIlIlIlIIl;
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();
        if (e.lIlIlIIIlIIII(player)) {
            return;
        }
        WorldPoint llllllllllllllllllIlIlIIlIlIIllI = llllllllllllllllllIlIlIIlIlIlIIl;
        int llllllllllllllllllIlIlIIlIlIIlIl = llllllllllllllllllIlIlIIlIlIIllI.getX() - llllllllllllllllllIlIlIIlIlIlIII.getBaseX();
        Point llllllllllllllllllIlIlIIlIlIIIll = Perspective.localToCanvas((Client)llllllllllllllllllIlIlIIlIlIlIII, (LocalPoint)LocalPoint.fromScene((int)llllllllllllllllllIlIlIIlIlIIlIl, (int)(llllllllllllllllllIlIlIIlIlIIlII = llllllllllllllllllIlIlIIlIlIIllI.getY() - llllllllllllllllllIlIlIIlIlIlIII.getBaseY())), (int)llllllllllllllllllIlIlIIlIlIlIII.getPlane());
        if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIlIlIIIll)) {
            n3 = llllllllllllllllllIlIlIIlIlIIIll.getX();
            0;
            if (null != null) {
                return;
            }
        } else {
            int llllllllllllllllllIlIlIIlIlIIIlI;
            n3 = llllllllllllllllllIlIlIIlIlIIIlI = llIIlIIIII[69];
        }
        if (e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIlIlIIIll)) {
            n2 = llllllllllllllllllIlIlIIlIlIIIll.getY();
            0;
            if (null != null) {
                return;
            }
        } else {
            n2 = llIIlIIIII[69];
        }
        int n4 = n2;
        client.interact(llIIlIIIII[2], MenuAction.WALK.getId(), (int)var4_4, (int)var5_5, (int)var7_7, n4);
    }

    private static boolean lIlIlIIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    public static String b(long l2) {
        Object[] objectArray = new Object[llIIlIIIII[1]];
        objectArray[e.llIIlIIIII[2]] = llIIlIIIII[9];
        String string = String.format(llIIIlllll[llIIlIIIII[18]], objectArray);
        Object[] objectArray2 = new Object[llIIlIIIII[1]];
        objectArray2[e.llIIlIIIII[2]] = (l2 /= 1000L) % 60L;
        String string2 = String.format(string, objectArray2);
        Object[] objectArray3 = new Object[llIIlIIIII[1]];
        objectArray3[e.llIIlIIIII[2]] = l2 % 3600L / 60L;
        String string3 = String.format(string, objectArray3);
        Object[] objectArray4 = new Object[llIIlIIIII[1]];
        objectArray4[e.llIIlIIIII[2]] = l2 / 3600L;
        String string4 = String.format(string, objectArray4);
        String string5 = string4 + ":" + string3 + ":" + string2;
        return string5;
    }

    public static void a(String llllllllllllllllllIlIlIIlIlllIIl, String llllllllllllllllllIlIlIIlIlllIII) {
        try {
            URL llllllllllllllllllIlIlIIlIllIlll = new URL(llllllllllllllllllIlIlIIlIlllIIl);
            HttpURLConnection llllllllllllllllllIlIlIIlIllIllI = (HttpURLConnection)llllllllllllllllllIlIlIIlIllIlll.openConnection();
            llllllllllllllllllIlIlIIlIllIllI.setRequestMethod(llIIIlllll[llIIlIIIII[66]]);
            llllllllllllllllllIlIlIIlIllIllI.setRequestProperty(llIIIlllll[llIIlIIIII[67]], llIIIlllll[llIIlIIIII[68]]);
            llllllllllllllllllIlIlIIlIllIllI.setDoOutput(llIIlIIIII[1]);
            String llllllllllllllllllIlIlIIlIllIlIl = "{\"content\": \"" + llllllllllllllllllIlIlIIlIlllIII + "\"}";
            DataOutputStream llllllllllllllllllIlIlIIlIllIlII = new DataOutputStream(llllllllllllllllllIlIlIIlIllIllI.getOutputStream());
            llllllllllllllllllIlIlIIlIllIlII.writeBytes(llllllllllllllllllIlIlIIlIllIlIl);
            llllllllllllllllllIlIlIIlIllIlII.flush();
            llllllllllllllllllIlIlIIlIllIlII.close();
            int llllllllllllllllllIlIlIIlIllIIll = llllllllllllllllllIlIlIIlIllIllI.getResponseCode();
            System.out.println("Response Code: " + llllllllllllllllllIlIlIIlIllIIll);
            llllllllllllllllllIlIlIIlIllIllI.disconnect();
            0;
        }
        catch (Exception llllllllllllllllllIlIlIIlIllIlll) {
            llllllllllllllllllIlIlIIlIllIlll.printStackTrace();
        }
        if (null != null) {
            return;
        }
    }

    private static boolean lIlIlIIIIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIIIIlIII(int n2) {
        return n2 == 0;
    }

    public static boolean i(int n2) {
        int[] nArray = new int[llIIlIIIII[1]];
        nArray[e.llIIlIIIII[2]] = n2;
        return Bank.contains((int[])nArray);
    }

    private static boolean lIlIlIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlIIIIIIIl(String llllllllllllllllllIlIlIIIlllIIlI, String llllllllllllllllllIlIlIIIlllIllI) {
        llllllllllllllllllIlIlIIIlllIIlI = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlIlIIIlllIlIl = new StringBuilder();
        char[] llllllllllllllllllIlIlIIIlllIlII = llllllllllllllllllIlIlIIIlllIllI.toCharArray();
        int llllllllllllllllllIlIlIIIlllIIll = llIIlIIIII[2];
        char[] llllllllllllllllllIlIlIIIllIllIl = llllllllllllllllllIlIlIIIlllIIlI.toCharArray();
        int llllllllllllllllllIlIlIIIllIllII = llllllllllllllllllIlIlIIIllIllIl.length;
        int llllllllllllllllllIlIlIIIllIlIll = llIIlIIIII[2];
        while (e.lIlIlIIIIIlll(llllllllllllllllllIlIlIIIllIlIll, llllllllllllllllllIlIlIIIllIllII)) {
            char llllllllllllllllllIlIlIIIllllIII = llllllllllllllllllIlIlIIIllIllIl[llllllllllllllllllIlIlIIIllIlIll];
            llllllllllllllllllIlIlIIIlllIlIl.append((char)(llllllllllllllllllIlIlIIIllllIII ^ llllllllllllllllllIlIlIIIlllIlII[llllllllllllllllllIlIlIIIlllIIll % llllllllllllllllllIlIlIIIlllIlII.length]));
            0;
            ++llllllllllllllllllIlIlIIIlllIIll;
            ++llllllllllllllllllIlIlIIIllIlIll;
            0;
            if (-(80 + 81 - 138 + 153 ^ 125 + 82 - 36 + 10) < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIlIlIIIlllIlIl);
    }

    private static boolean lIlIlIIIIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static int c(int n2, int n3) {
        void llllllllllllllllllIlIlIIllllIllI;
        int llllllllllllllllllIlIlIIllllIlIl;
        int llllllllllllllllllIlIlIIllllIlll;
        int n4 = n3 - n2;
        if (e.lIlIlIIIIlIII(n4)) {
            return llllllllllllllllllIlIlIIllllIlll;
        }
        if (e.lIlIlIIIIlIlI(Math.abs(llllllllllllllllllIlIlIIllllIlIl), llIIlIIIII[1])) {
            int n5;
            if (e.lIlIlIIIIlIll(R.nextBoolean() ? 1 : 0)) {
                n5 = llllllllllllllllllIlIlIIllllIlll;
                0;
                if (1 == 0) {
                    return (0xEF ^ 0xC7 ^ (0x4E ^ 0x50)) & (1 + 150 - 19 + 57 ^ 58 + 1 - -24 + 56 ^ -1);
                }
            } else {
                n5 = llllllllllllllllllIlIlIIllllIllI;
            }
            return n5;
        }
        if (e.lIlIlIIIIllII(llllllllllllllllllIlIlIIllllIlIl)) {
            llllllllllllllllllIlIlIIllllIlIl = llllllllllllllllllIlIlIIllllIlll;
            llllllllllllllllllIlIlIIllllIlll = llllllllllllllllllIlIlIIllllIllI;
            n3 = llllllllllllllllllIlIlIIllllIlIl;
        }
        return n2 + R.nextInt(n3 - n2 + llIIlIIIII[1]);
    }

    private static boolean lIlIlIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static void y() {
        Widget widget = Widgets.get((int)llIIlIIIII[21], (int)llIIlIIIII[22], (int)llIIlIIIII[2]);
        if (e.lIlIlIIIIlIIl(widget)) {
            widget.interact(llIIIlllll[llIIlIIIII[23]]);
            Time.sleepTicks((int)llIIlIIIII[5]);
            0;
        }
    }

    static {
        e.lIlIlIIIIIlIl();
        e.lIlIlIIIIIlII();
        ab = llIIlIIIII[6];
        Y = llIIlIIIII[8];
        Z = llIIlIIIII[101];
        aa = llIIlIIIII[102];
        X = llIIlIIIII[103];
        Q = llIIIlllll[llIIlIIIII[104]];
        R = ThreadLocalRandom.current();
        S = new WorldArea(llIIlIIIII[105], llIIlIIIII[106], llIIlIIIII[78], llIIlIIIII[83], llIIlIIIII[2]);
        T = new WorldArea(llIIlIIIII[107], llIIlIIIII[108], llIIlIIIII[33], llIIlIIIII[49], llIIlIIIII[1]);
        U = System.currentTimeMillis();
        V = System.nanoTime();
        W = new HashMap<Integer, Integer>();
        int[] nArray = new int[llIIlIIIII[11]];
        nArray[e.llIIlIIIII[2]] = llIIlIIIII[103];
        nArray[e.llIIlIIIII[1]] = llIIlIIIII[8];
        nArray[e.llIIlIIIII[9]] = llIIlIIIII[101];
        nArray[e.llIIlIIIII[5]] = llIIlIIIII[102];
        nArray[e.llIIlIIIII[10]] = llIIlIIIII[6];
        ac = nArray;
        ad = new WorldPoint(llIIlIIIII[109], llIIlIIIII[110], llIIlIIIII[2]);
        int[] nArray2 = new int[llIIlIIIII[111]];
        nArray2[e.llIIlIIIII[2]] = llIIlIIIII[112];
        nArray2[e.llIIlIIIII[1]] = llIIlIIIII[113];
        nArray2[e.llIIlIIIII[9]] = llIIlIIIII[114];
        nArray2[e.llIIlIIIII[5]] = llIIlIIIII[115];
        nArray2[e.llIIlIIIII[10]] = llIIlIIIII[116];
        nArray2[e.llIIlIIIII[11]] = llIIlIIIII[117];
        nArray2[e.llIIlIIIII[12]] = llIIlIIIII[118];
        nArray2[e.llIIlIIIII[13]] = llIIlIIIII[119];
        nArray2[e.llIIlIIIII[14]] = llIIlIIIII[120];
        nArray2[e.llIIlIIIII[15]] = llIIlIIIII[121];
        nArray2[e.llIIlIIIII[16]] = llIIlIIIII[122];
        nArray2[e.llIIlIIIII[17]] = llIIlIIIII[123];
        nArray2[e.llIIlIIIII[18]] = llIIlIIIII[124];
        nArray2[e.llIIlIIIII[19]] = llIIlIIIII[125];
        nArray2[e.llIIlIIIII[20]] = llIIlIIIII[126];
        nArray2[e.llIIlIIIII[23]] = llIIlIIIII[127];
        nArray2[e.llIIlIIIII[24]] = llIIlIIIII[128];
        nArray2[e.llIIlIIIII[30]] = llIIlIIIII[129];
        nArray2[e.llIIlIIIII[31]] = llIIlIIIII[130];
        nArray2[e.llIIlIIIII[34]] = llIIlIIIII[131];
        nArray2[e.llIIlIIIII[36]] = llIIlIIIII[132];
        nArray2[e.llIIlIIIII[39]] = llIIlIIIII[133];
        nArray2[e.llIIlIIIII[40]] = llIIlIIIII[134];
        nArray2[e.llIIlIIIII[33]] = llIIlIIIII[135];
        nArray2[e.llIIlIIIII[43]] = llIIlIIIII[136];
        nArray2[e.llIIlIIIII[44]] = llIIlIIIII[137];
        nArray2[e.llIIlIIIII[45]] = llIIlIIIII[138];
        nArray2[e.llIIlIIIII[46]] = llIIlIIIII[139];
        nArray2[e.llIIlIIIII[47]] = llIIlIIIII[140];
        nArray2[e.llIIlIIIII[22]] = llIIlIIIII[141];
        nArray2[e.llIIlIIIII[49]] = llIIlIIIII[142];
        nArray2[e.llIIlIIIII[61]] = llIIlIIIII[143];
        nArray2[e.llIIlIIIII[42]] = llIIlIIIII[144];
        nArray2[e.llIIlIIIII[62]] = llIIlIIIII[145];
        nArray2[e.llIIlIIIII[63]] = llIIlIIIII[146];
        nArray2[e.llIIlIIIII[54]] = llIIlIIIII[147];
        nArray2[e.llIIlIIIII[66]] = llIIlIIIII[148];
        nArray2[e.llIIlIIIII[67]] = llIIlIIIII[149];
        nArray2[e.llIIlIIIII[68]] = llIIlIIIII[150];
        nArray2[e.llIIlIIIII[72]] = llIIlIIIII[151];
        nArray2[e.llIIlIIIII[28]] = llIIlIIIII[152];
        nArray2[e.llIIlIIIII[38]] = llIIlIIIII[153];
        nArray2[e.llIIlIIIII[73]] = llIIlIIIII[154];
        nArray2[e.llIIlIIIII[74]] = llIIlIIIII[155];
        nArray2[e.llIIlIIIII[75]] = llIIlIIIII[156];
        nArray2[e.llIIlIIIII[76]] = llIIlIIIII[157];
        nArray2[e.llIIlIIIII[77]] = llIIlIIIII[158];
        nArray2[e.llIIlIIIII[81]] = llIIlIIIII[159];
        nArray2[e.llIIlIIIII[83]] = llIIlIIIII[160];
        nArray2[e.llIIlIIIII[84]] = llIIlIIIII[161];
        nArray2[e.llIIlIIIII[78]] = llIIlIIIII[162];
        nArray2[e.llIIlIIIII[85]] = llIIlIIIII[163];
        nArray2[e.llIIlIIIII[88]] = llIIlIIIII[164];
        nArray2[e.llIIlIIIII[89]] = llIIlIIIII[165];
        nArray2[e.llIIlIIIII[90]] = llIIlIIIII[166];
        nArray2[e.llIIlIIIII[91]] = llIIlIIIII[167];
        nArray2[e.llIIlIIIII[92]] = llIIlIIIII[168];
        nArray2[e.llIIlIIIII[93]] = llIIlIIIII[169];
        nArray2[e.llIIlIIIII[94]] = llIIlIIIII[170];
        nArray2[e.llIIlIIIII[95]] = llIIlIIIII[171];
        nArray2[e.llIIlIIIII[97]] = llIIlIIIII[172];
        nArray2[e.llIIlIIIII[27]] = llIIlIIIII[173];
        nArray2[e.llIIlIIIII[98]] = llIIlIIIII[174];
        nArray2[e.llIIlIIIII[99]] = llIIlIIIII[175];
        nArray2[e.llIIlIIIII[100]] = llIIlIIIII[176];
        nArray2[e.llIIlIIIII[104]] = llIIlIIIII[177];
        nArray2[e.llIIlIIIII[178]] = llIIlIIIII[179];
        nArray2[e.llIIlIIIII[180]] = llIIlIIIII[181];
        nArray2[e.llIIlIIIII[182]] = llIIlIIIII[183];
        nArray2[e.llIIlIIIII[184]] = llIIlIIIII[185];
        nArray2[e.llIIlIIIII[186]] = llIIlIIIII[187];
        nArray2[e.llIIlIIIII[57]] = llIIlIIIII[188];
        nArray2[e.llIIlIIIII[189]] = llIIlIIIII[190];
        nArray2[e.llIIlIIIII[191]] = llIIlIIIII[192];
        nArray2[e.llIIlIIIII[193]] = llIIlIIIII[194];
        nArray2[e.llIIlIIIII[195]] = llIIlIIIII[196];
        nArray2[e.llIIlIIIII[197]] = llIIlIIIII[198];
        nArray2[e.llIIlIIIII[199]] = llIIlIIIII[200];
        nArray2[e.llIIlIIIII[201]] = llIIlIIIII[202];
        nArray2[e.llIIlIIIII[203]] = llIIlIIIII[204];
        nArray2[e.llIIlIIIII[205]] = llIIlIIIII[206];
        nArray2[e.llIIlIIIII[207]] = llIIlIIIII[208];
        nArray2[e.llIIlIIIII[209]] = llIIlIIIII[210];
        nArray2[e.llIIlIIIII[211]] = llIIlIIIII[212];
        nArray2[e.llIIlIIIII[213]] = llIIlIIIII[214];
        nArray2[e.llIIlIIIII[215]] = llIIlIIIII[216];
        nArray2[e.llIIlIIIII[217]] = llIIlIIIII[218];
        nArray2[e.llIIlIIIII[219]] = llIIlIIIII[220];
        nArray2[e.llIIlIIIII[221]] = llIIlIIIII[222];
        nArray2[e.llIIlIIIII[223]] = llIIlIIIII[224];
        nArray2[e.llIIlIIIII[225]] = llIIlIIIII[226];
        nArray2[e.llIIlIIIII[227]] = llIIlIIIII[228];
        nArray2[e.llIIlIIIII[229]] = llIIlIIIII[230];
        nArray2[e.llIIlIIIII[231]] = llIIlIIIII[232];
        nArray2[e.llIIlIIIII[233]] = llIIlIIIII[234];
        nArray2[e.llIIlIIIII[235]] = llIIlIIIII[236];
        nArray2[e.llIIlIIIII[237]] = llIIlIIIII[238];
        nArray2[e.llIIlIIIII[239]] = llIIlIIIII[240];
        nArray2[e.llIIlIIIII[241]] = llIIlIIIII[242];
        nArray2[e.llIIlIIIII[243]] = llIIlIIIII[244];
        nArray2[e.llIIlIIIII[96]] = llIIlIIIII[245];
        nArray2[e.llIIlIIIII[80]] = llIIlIIIII[246];
        nArray2[e.llIIlIIIII[0]] = llIIlIIIII[247];
        nArray2[e.llIIlIIIII[248]] = llIIlIIIII[249];
        nArray2[e.llIIlIIIII[250]] = llIIlIIIII[251];
        nArray2[e.llIIlIIIII[252]] = llIIlIIIII[253];
        nArray2[e.llIIlIIIII[254]] = llIIlIIIII[255];
        ae = nArray2;
        af = new WorldPoint(llIIlIIIII[256], llIIlIIIII[257], llIIlIIIII[9]);
        ag = new WorldArea(llIIlIIIII[258], llIIlIIIII[259], llIIlIIIII[62], llIIlIIIII[40], llIIlIIIII[2]);
    }

    private static boolean lIlIlIIIIIllI(int n2) {
        return n2 > 0;
    }

    public static boolean s() {
        boolean bl;
        if (e.lIlIlIIIIIllI(e.j(llIIlIIIII[0]))) {
            bl = llIIlIIIII[1];
            0;
            if ((0xBD ^ 0xB9) != (0x99 ^ 0x9D)) {
                return ((0x60 ^ 0x7D) & ~(0x99 ^ 0x84)) != 0;
            }
        } else {
            bl = llIIlIIIII[2];
        }
        return bl;
    }

    private static boolean lIlIlIIIIllII(int n2) {
        return n2 < 0;
    }

    public static void I() {
        if (e.lIlIlIIIIlIII(Widgets.get((int)llIIlIIIII[79]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get((int)llIIlIIIII[79], (int)llIIlIIIII[24]);
            Mouse.click((int)widget.getClickPoint().getX(), (int)widget.getClickPoint().getY(), (boolean)llIIlIIIII[1]);
            Time.sleepTicks((int)llIIlIIIII[5]);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(WorldPoint worldPoint) {
        void llllllllllllllllllIlIlIIllIIIIIl;
        void llllllllllllllllllIlIlIIllIIIIlI;
        void llllllllllllllllllIlIlIIllIIIIll;
        WorldPoint worldPoint2 = new WorldPoint(llIIlIIIII[50], llIIlIIIII[51], llIIlIIIII[2]);
        WorldArea worldArea = new WorldArea(llIIlIIIII[52], llIIlIIIII[53], llIIlIIIII[15], llIIlIIIII[54], llIIlIIIII[2]);
        WorldArea worldArea2 = new WorldArea(llIIlIIIII[55], llIIlIIIII[56], llIIlIIIII[57], llIIlIIIII[58], llIIlIIIII[2]);
        if (e.lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIlIIIII[12]) && e.lIlIlIIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.lIlIlIIIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && e.lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIlIIIII[59], llIIlIIIII[60], llIIlIIIII[1])), llIIlIIIII[36])) {
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[61]];
            if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)llllllllllllllllllIlIlIIllIIIIll);
            0;
            Time.sleepTicks((int)llIIlIIIII[1]);
            0;
        }
        if (e.lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllllllllllllllllIlIlIIllIIIIll), llIIlIIIII[12]) && e.lIlIlIIIIlllI(Players.getLocal().getWorldLocation().getY(), llIIlIIIII[51])) {
            if (e.lIlIlIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[llIIlIIIII[1]];
                stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[42]];
                TileObjects.getNearest((String[])stringArray).interact(llIIIlllll[llIIlIIIII[62]]);
                Time.sleepTicks((int)llIIlIIIII[9]);
                0;
            }
            if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                String[] stringArray = new String[llIIlIIIII[1]];
                stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[63]];
                g.a(stringArray);
            }
        }
        if (e.lIlIlIIIIllIl(Players.getLocal().getWorldLocation().getY(), llIIlIIIII[51]) && (!e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIllIIIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !e.lIlIlIIIIlIII(llllllllllllllllllIlIlIIllIIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || e.lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIlIIIII[59], llIIlIIIII[60], llIIlIIIII[1])), llIIlIIIII[36]))) {
            WorldPoint llllllllllllllllllIlIlIIllIIIlII;
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[54]];
            if (e.lIlIlIIIIlIll(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(llIIlIIIII[50], llIIlIIIII[64], llIIlIIIII[2])) ? 1 : 0)) {
                e.c(new WorldPoint(llIIlIIIII[50], llIIlIIIII[65], llIIlIIIII[2]));
                Time.sleepTicks((int)llIIlIIIII[12]);
                0;
            }
            Movement.walkTo((WorldPoint)llllllllllllllllllIlIlIIllIIIlII);
            0;
            Time.sleepTicks((int)llIIlIIIII[1]);
            0;
        }
    }

    private static boolean lIlIlIIIIlIll(int n2) {
        return n2 != 0;
    }

    public static int j(int n2) {
        return (Integer)GameThread.invokeLater(() -> Static.getClient().getVarpValue(n2));
    }

    public static boolean c(int[] nArray) {
        int[] llllllllllllllllllIlIlIIlllIllII;
        int llllllllllllllllllIlIlIIlllIlIll = llIIlIIIII[2];
        while (e.lIlIlIIIIIlll(llllllllllllllllllIlIlIIlllIlIll, llllllllllllllllllIlIlIIlllIllII.length)) {
            if (e.lIlIlIIIIlIII(e.i(llllllllllllllllllIlIlIIlllIllII[llllllllllllllllllIlIlIIlllIlIll]) ? 1 : 0)) {
                System.out.println("Missing ID: " + llllllllllllllllllIlIlIIlllIllII[llllllllllllllllllIlIlIIlllIlIll]);
                return llIIlIIIII[2];
            }
            ++llllllllllllllllllIlIlIIlllIlIll;
            0;
            if (null == null) continue;
            return ((92 + 113 - 132 + 132 ^ 9 + 11 - -109 + 18) & (0x25 ^ 0x14 ^ (0xDF ^ 0xB0) ^ -1)) != 0;
        }
        return llIIlIIIII[1];
    }

    /*
     * WARNING - void declaration
     */
    public static void k(int n2) {
        if (e.lIlIlIIIIllll(Static.getClient().getWorld(), n2)) {
            void llllllllllllllllllIlIlIIlllIIlII;
            WorldResult worldResult = Static.getWorldService().getWorlds();
            net.runelite.http.api.worlds.World world = worldResult.findWorld(n2);
            if (e.lIlIlIIIlIIII(world)) {
                return;
            }
            if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            World llllllllllllllllllIlIlIIlllIIIll = Static.getClient().createWorld();
            llllllllllllllllllIlIlIIlllIIIll.setActivity(llllllllllllllllllIlIlIIlllIIlII.getActivity());
            llllllllllllllllllIlIlIIlllIIIll.setAddress(llllllllllllllllllIlIlIIlllIIlII.getAddress());
            llllllllllllllllllIlIlIIlllIIIll.setId(llllllllllllllllllIlIlIIlllIIlII.getId());
            llllllllllllllllllIlIlIIlllIIIll.setPlayerCount(llllllllllllllllllIlIlIIlllIIlII.getPlayers());
            llllllllllllllllllIlIlIIlllIIIll.setLocation(llllllllllllllllllIlIlIIlllIIlII.getLocation());
            llllllllllllllllllIlIlIIlllIIIll.setTypes(WorldUtil.toWorldTypes((EnumSet)llllllllllllllllllIlIlIIlllIIlII.getTypes()));
            Worlds.hopTo((World)llllllllllllllllllIlIlIIlllIIIll);
        }
    }

    public static boolean z() {
        boolean bl;
        if (!e.lIlIlIIIIlIll((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(llIIlIIIII[35]))) || e.lIlIlIIIIlIII((Integer)GameThread.invokeLater(() -> Static.getClient().getVarbitValue(llIIlIIIII[37])))) {
            bl = llIIlIIIII[1];
            0;
            if ((0x9B ^ 0x9E) == 0) {
                return ((0x67 ^ 0x40) & ~(0x77 ^ 0x50)) != 0;
            }
        } else {
            bl = llIIlIIIII[2];
        }
        return bl;
    }

    public static long a(long l2) {
        return e.u() - l2;
    }

    public static boolean B() {
        boolean bl;
        if (e.lIlIlIIIIlIIl(Widgets.get((int)llIIlIIIII[32], (int)llIIlIIIII[1]))) {
            bl = llIIlIIIII[1];
            0;
            if (((0x28 ^ 0x1A ^ (0x22 ^ 0x33)) & (26 + 171 - 148 + 134 ^ 10 + 124 - -11 + 3 ^ -1)) >= 2) {
                return ((0x4B ^ 0x2F ^ (0x1F ^ 0x3B)) & (9 + 212 - 178 + 209 ^ 33 + 178 - 159 + 136 ^ -1)) != 0;
            }
        } else {
            bl = llIIlIIIII[2];
        }
        return bl;
    }

    public static void x() {
        if (e.lIlIlIIIIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks((int)llIIlIIIII[10]);
            0;
        }
        if (e.lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (e.lIlIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
            e.D();
        }
    }

    public static int v() {
        int n2 = e.c(llIIlIIIII[2], ae.length - llIIlIIIII[1]);
        return ae[n2];
    }

    public static void E() {
        if (e.lIlIlIIIIlIII(e.j(llIIlIIIII[70]))) {
            Widget llllllllllllllllllIlIlIIlIIlllll;
            if (e.lIlIlIIIIlIII(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
            }
            if (e.lIlIlIIIIlIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIlIIlllll = Widgets.get((int)llIIlIIIII[71], (int)llIIlIIIII[49]))) {
                llllllllllllllllllIlIlIIlIIlllll.interact(llIIIlllll[llIIlIIIII[72]]);
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
            }
        }
    }

    public static void l(int n2) {
        int[] nArray = new int[llIIlIIIII[1]];
        nArray[e.llIIlIIIII[2]] = n2;
        if (e.lIlIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llIIlIIIII[1]];
            nArray2[e.llIIlIIIII[2]] = n2;
            if (e.lIlIlIIIIlIII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int llllllllllllllllllIlIlIIllIIlIIl;
                int[] nArray3 = new int[llIIlIIIII[1]];
                nArray3[e.llIIlIIIII[2]] = n2;
                String[] stringArray = new String[llIIlIIIII[1]];
                stringArray[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[43]];
                if (e.lIlIlIIIIlIll(Inventory.getFirst((int[])nArray3).hasAction(stringArray) ? 1 : 0)) {
                    int[] nArray4 = new int[llIIlIIIII[1]];
                    nArray4[e.llIIlIIIII[2]] = n2;
                    Inventory.getFirst((int[])nArray4).interact(llIIIlllll[llIIlIIIII[44]]);
                }
                int[] nArray5 = new int[llIIlIIIII[1]];
                nArray5[e.llIIlIIIII[2]] = llllllllllllllllllIlIlIIllIIlIIl;
                String[] stringArray2 = new String[llIIlIIIII[1]];
                stringArray2[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[45]];
                if (e.lIlIlIIIIlIll(Inventory.getFirst((int[])nArray5).hasAction(stringArray2) ? 1 : 0)) {
                    int[] nArray6 = new int[llIIlIIIII[1]];
                    nArray6[e.llIIlIIIII[2]] = llllllllllllllllllIlIlIIllIIlIIl;
                    Inventory.getFirst((int[])nArray6).interact(llIIIlllll[llIIlIIIII[46]]);
                }
                int[] nArray7 = new int[llIIlIIIII[1]];
                nArray7[e.llIIlIIIII[2]] = llllllllllllllllllIlIlIIllIIlIIl;
                String[] stringArray3 = new String[llIIlIIIII[1]];
                stringArray3[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[47]];
                if (e.lIlIlIIIIlIll(Inventory.getFirst((int[])nArray7).hasAction(stringArray3) ? 1 : 0)) {
                    int[] nArray8 = new int[llIIlIIIII[1]];
                    nArray8[e.llIIlIIIII[2]] = llllllllllllllllllIlIlIIllIIlIIl;
                    Inventory.getFirst((int[])nArray8).interact(llIIIlllll[llIIlIIIII[22]]);
                }
                if (e.lIlIlIIIIlIlI(llllllllllllllllllIlIlIIllIIlIIl, llIIlIIIII[48])) {
                    Time.sleepTicks((int)llIIlIIIII[5]);
                    0;
                    String[] stringArray4 = new String[llIIlIIIII[1]];
                    stringArray4[e.llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[49]];
                    g.a(stringArray4);
                    Time.sleepTicks((int)llIIlIIIII[1]);
                    0;
                }
            }
        }
    }

    public static void F() {
        if (e.lIlIlIIIIlIlI(e.j(llIIlIIIII[70]), llIIlIIIII[1])) {
            Widget llllllllllllllllllIlIlIIlIIlllIl;
            if (e.lIlIlIIIIlIII(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0)) {
                Tabs.open((Tab)Tab.COMBAT);
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
            }
            if (e.lIlIlIIIIlIll(Tabs.isOpen((Tab)Tab.COMBAT) ? 1 : 0) && e.lIlIlIIIIlIIl(llllllllllllllllllIlIlIIlIIlllIl = Widgets.get((int)llIIlIIIII[71], (int)llIIlIIIII[49]))) {
                llllllllllllllllllIlIlIIlIIlllIl.interact(llIIIlllll[llIIlIIIII[28]]);
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
            }
        }
    }

    public static int J() {
        return e.j(llIIlIIIII[80]);
    }

    public static void b(int[] nArray) {
        int[] llllllllllllllllllIlIlIlIIIIIllI;
        int llllllllllllllllllIlIlIlIIIIIlIl = llIIlIIIII[2];
        while (e.lIlIlIIIIIlll(llllllllllllllllllIlIlIlIIIIIlIl, llllllllllllllllllIlIlIlIIIIIllI.length)) {
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[2]];
            if (e.lIlIlIIIIlIII(llllllllllllllllllIlIlIlIIIIIllI[llllllllllllllllllIlIlIlIIIIIlIl])) {
                0;
                if ((0x39 ^ 0x51 ^ (0x31 ^ 0x5D)) <= 1) {
                    return;
                }
            } else {
                Time.sleepTicks((int)llIIlIIIII[1]);
                0;
                e.l(llllllllllllllllllIlIlIlIIIIIllI[llllllllllllllllllIlIlIlIIIIIlIl]);
                Time.sleep((long)e.c(llIIlIIIII[3], llIIlIIIII[4]));
                0;
            }
            ++llllllllllllllllllIlIlIlIIIIIlIl;
            0;
            if (((0x38 ^ 0x35) & ~(0x9D ^ 0x90)) == 0) continue;
            return;
        }
        Time.sleepTicks((int)e.c(llIIlIIIII[1], llIIlIIIII[5]));
        0;
    }

    public static double w() {
        double d2 = Skills.getBoostedLevel((Skill)Skill.HITPOINTS);
        double d3 = Skills.getLevel((Skill)Skill.HITPOINTS);
        return d2 / d3 * 100.0;
    }

    private static boolean lIlIlIIIlIIII(Object object) {
        return object == null;
    }

    public static void c(String string) {
        FileWriter fileWriter = new FileWriter(llIIIlllll[llIIlIIIII[19]]);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string + System.getProperty(llIIIlllll[llIIlIIIII[20]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}

