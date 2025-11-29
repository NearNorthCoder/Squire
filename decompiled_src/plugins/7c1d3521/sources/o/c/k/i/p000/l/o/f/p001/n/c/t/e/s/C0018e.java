package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/e.class */
public class C0018e {
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

    private static String lIlIlIIIIIIll(String llllllllllllllllllIlIlIIIllIIIlI, String llllllllllllllllllIlIlIIIllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIlIIIllIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIlIIIllIIlII.init(llIIlIIIII[9], secretKeySpec);
            return new String(llllllllllllllllllIlIlIIIllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIIIllIIIll) {
            llllllllllllllllllIlIlIIIllIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public static boolean H() {
        if (lIlIlIIIIlIII(S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIlIII(T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(af), llIIlIIIII[78]) && !lIlIlIIIIlIll(ag.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return llIIlIIIII[2];
        }
        ?? r0 = llIIlIIIII[1];
        "".length();
        return "  ".length() <= ((1 ^ 64) & ((232 ^ 169) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static void lIlIlIIIIIlIl() {
        llIIlIIIII = new int[260];
        llIIlIIIII[0] = 116 ^ 18;
        llIIlIIIII[1] = " ".length();
        llIIlIIIII[2] = (195 ^ 140) & ((81 ^ 30) ^ (-1));
        llIIlIIIII[3] = ((254 + 78) - 323) + 246;
        llIIlIIIII[4] = (-((-169) & 31467)) & (-1025) & 32743;
        llIIlIIIII[5] = "   ".length();
        llIIlIIIII[6] = ((113 + 30) - 76) + 162;
        llIIlIIIII[7] = (((175 ^ 164) + (157 ^ 153)) - (-(((78 + 72) - 106) + 83))) + (89 ^ 77);
        llIIlIIIII[8] = (((((136 + 27) - 35) + 29) + (32 ^ 108)) - (((55 + 36) - (-30)) + 64)) + ((90 + 150) - 203) + 146;
        llIIlIIIII[9] = "  ".length();
        llIIlIIIII[10] = (184 ^ 156) ^ (60 ^ 28);
        llIIlIIIII[11] = 99 ^ 102;
        llIIlIIIII[12] = (((30 + 18) - (-15)) + 79) ^ (((36 + 126) - 139) + 113);
        llIIlIIIII[13] = 63 ^ 56;
        llIIlIIIII[14] = (89 ^ 8) ^ (222 ^ 135);
        llIIlIIIII[15] = 8 ^ 1;
        llIIlIIIII[16] = (201 ^ 142) ^ (139 ^ 198);
        llIIlIIIII[17] = 11 ^ 0;
        llIIlIIIII[18] = (9 ^ 29) ^ (172 ^ 180);
        llIIlIIIII[19] = 155 ^ 150;
        llIIlIIIII[20] = (8 ^ 97) ^ (103 ^ 0);
        llIIlIIIII[21] = (-2113) & 2776;
        llIIlIIIII[22] = 44 ^ 49;
        llIIlIIIII[23] = (((50 + 18) - 65) + 186) ^ (((113 + 107) - 211) + 169);
        llIIlIIIII[24] = (144 ^ 151) ^ (45 ^ 58);
        llIIlIIIII[25] = (-20749) & 23916;
        llIIlIIIII[26] = (-((-21555) & 29755)) & (-513) & 12126;
        llIIlIIIII[27] = 87 ^ 106;
        llIIlIIIII[28] = 70 ^ 110;
        llIIlIIIII[29] = (-((-11179) & 27563)) & (-41) & 24431;
        llIIlIIIII[30] = 133 ^ 148;
        llIIlIIIII[31] = 186 ^ 168;
        llIIlIIIII[32] = (((250 ^ 147) + (24 ^ 98)) - (((127 + 3) - 118) + 131)) + (20 ^ 38);
        llIIlIIIII[33] = (110 ^ 86) ^ (170 ^ 133);
        llIIlIIIII[34] = 124 ^ 111;
        llIIlIIIII[35] = (-18052) & 32751;
        llIIlIIIII[36] = (((109 + 15) - (-17)) + 48) ^ (((83 + 88) - 150) + 148);
        llIIlIIIII[37] = (-((-2913) & 4065)) & (-16403) & 32255;
        llIIlIIIII[38] = (12 ^ 41) ^ (204 ^ 192);
        llIIlIIIII[39] = (((146 + 135) - 191) + 70) ^ (((78 + 93) - 104) + 114);
        llIIlIIIII[40] = (83 ^ 46) ^ (93 ^ 54);
        llIIlIIIII[41] = 38 ^ 82;
        llIIlIIIII[42] = (((118 + 74) - 164) + 125) ^ (((84 + 59) - (-33)) + 9);
        llIIlIIIII[43] = 158 ^ 134;
        llIIlIIIII[44] = (217 ^ 134) ^ (114 ^ 52);
        llIIlIIIII[45] = (((45 + 122) - 64) + 39) ^ (((58 + 113) - 129) + 106);
        llIIlIIIII[46] = (115 ^ 127) ^ (211 ^ 196);
        llIIlIIIII[47] = 108 ^ 112;
        llIIlIIIII[48] = (-961) & 23517;
        llIIlIIIII[49] = 106 ^ 116;
        llIIlIIIII[50] = (-8227) & 10687;
        llIIlIIIII[51] = (-((-311) & 29567)) & (-1) & 32639;
        llIIlIIIII[52] = (-21505) & 23961;
        llIIlIIIII[53] = (-24775) & 28158;
        llIIlIIIII[54] = 1 ^ 34;
        llIIlIIIII[55] = (-((-4435) & 14171)) & (-129) & 12287;
        llIIlIIIII[56] = (-((-1111) & 13527)) & (-16385) & 32191;
        llIIlIIIII[57] = 201 ^ 142;
        llIIlIIIII[58] = (((((66 + 63) - 53) + 58) + (28 ^ 126)) - (113 ^ 22)) + (175 ^ 161);
        llIIlIIIII[59] = (-((-1153) & 14051)) & (-17409) & 32766;
        llIIlIIIII[60] = (-((-5261) & 29871)) & (-4609) & 32635;
        llIIlIIIII[61] = (((116 + 117) - 187) + 96) ^ (((91 + 115) - 134) + 73);
        llIIlIIIII[62] = (187 ^ 166) ^ (250 ^ 198);
        llIIlIIIII[63] = (44 ^ 55) ^ (143 ^ 182);
        llIIlIIIII[64] = (-647) & 4031;
        llIIlIIIII[65] = (-((-6283) & 23227)) & (-4227) & 24567;
        llIIlIIIII[66] = (0 ^ 105) ^ (254 ^ 179);
        llIIlIIIII[67] = (((23 + 154) - 12) + 1) ^ (((105 + 46) - 79) + 59);
        llIIlIIIII[68] = (9 ^ 124) ^ (98 ^ 49);
        llIIlIIIII[69] = -" ".length();
        llIIlIIIII[70] = ((86 + 68) - 89) + 107;
        llIIlIIIII[71] = (-((-17) & 19867)) & (-37) & 20479;
        llIIlIIIII[72] = (120 ^ 111) ^ (18 ^ 34);
        llIIlIIIII[73] = 18 ^ 56;
        llIIlIIIII[74] = 117 ^ 94;
        llIIlIIIII[75] = 172 ^ 128;
        llIIlIIIII[76] = 83 ^ 126;
        llIIlIIIII[77] = (((125 + 128) - 145) + 23) ^ (((5 + 171) - 4) + 1);
        llIIlIIIII[78] = (36 ^ 29) ^ (26 ^ 17);
        llIIlIIIII[79] = (((175 ^ 199) + (100 ^ 24)) - (((103 + 134) - 183) + 91)) + (232 ^ 174);
        llIIlIIIII[80] = (76 ^ 127) ^ (59 ^ 109);
        llIIlIIIII[81] = (102 ^ 50) ^ (3 ^ 120);
        llIIlIIIII[82] = (-6242) & 8191;
        llIIlIIIII[83] = 44 ^ 28;
        llIIlIIIII[84] = 35 ^ 18;
        llIIlIIIII[85] = "   ".length() ^ (157 ^ 173);
        llIIlIIIII[86] = (-16422) & 16895;
        llIIlIIIII[87] = (-3137) & 3669;
        llIIlIIIII[88] = (164 ^ 171) ^ (154 ^ 161);
        llIIlIIIII[89] = 36 ^ 17;
        llIIlIIIII[90] = 71 ^ 113;
        llIIlIIIII[91] = (((50 + 88) - 44) + 83) ^ (((57 + 11) - (-64)) + 2);
        llIIlIIIII[92] = (((120 + 60) - 114) + 89) ^ (((66 + 11) - (-22)) + 64);
        llIIlIIIII[93] = 156 ^ 165;
        llIIlIIIII[94] = (((16 + 133) - 20) + 56) ^ (((12 + 95) - 99) + 123);
        llIIlIIIII[95] = 165 ^ 158;
        llIIlIIIII[96] = (56 ^ 18) ^ (244 ^ 186);
        llIIlIIIII[97] = 54 ^ 10;
        llIIlIIIII[98] = (183 ^ 130) ^ (110 ^ 101);
        llIIlIIIII[99] = "  ".length() ^ (181 ^ 136);
        llIIlIIIII[100] = (182 ^ 197) ^ (156 ^ 175);
        llIIlIIIII[101] = (((227 ^ 145) + (69 ^ 3)) - (63 ^ 114)) + (28 ^ 114);
        llIIlIIIII[102] = (((98 ^ 15) + (((71 + 122) - 119) + 110)) - (((157 + 97) - 146) + 58)) + (14 ^ 82);
        llIIlIIIII[103] = (((((68 + 151) - 155) + 123) + (7 ^ 74)) - (((161 + 35) - 100) + 86)) + (108 ^ 3);
        llIIlIIIII[104] = (((112 + 124) - 110) + 3) ^ (((84 + 88) - 73) + 93);
        llIIlIIIII[105] = (-16521) & 19710;
        llIIlIIIII[106] = (-" ".length()) & (-4099) & 7295;
        llIIlIIIII[107] = (-((-178) & 29107)) & (-641) & 32767;
        llIIlIIIII[108] = (-857) & 4060;
        llIIlIIIII[109] = (-517) & 3700;
        llIIlIIIII[110] = (-((-1399) & 1911)) & (-24723) & 28671;
        llIIlIIIII[111] = 102 ^ 13;
        llIIlIIIII[112] = (-((-8857) & 27322)) & (-4741) & 23551;
        llIIlIIIII[113] = (-28682) & 28987;
        llIIlIIIII[114] = (-((-8997) & 16229)) & (-8201) & 15742;
        llIIlIIIII[115] = (-28166) & 28517;
        llIIlIIIII[116] = (-10373) & 10727;
        llIIlIIIII[117] = (-8841) & 9196;
        llIIlIIIII[118] = (-30233) & 30589;
        llIIlIIIII[119] = (-((-29506) & 32723)) & (-8713) & 12287;
        llIIlIIIII[120] = (-585) & 970;
        llIIlIIIII[121] = (-((-41) & 28285)) & (-33) & 28671;
        llIIlIIIII[122] = (-28201) & 28666;
        llIIlIIIII[123] = (-14865) & 15358;
        llIIlIIIII[124] = (-((-4741) & 6805)) & (-22017) & 24575;
        llIIlIIIII[125] = (-16907) & 17402;
        llIIlIIIII[126] = (-7429) & 7964;
        llIIlIIIII[127] = (-((-29574) & 32743)) & (-20507) & 24191;
        llIIlIIIII[128] = (-((-4702) & 22111)) & (-709) & 18431;
        llIIlIIIII[129] = (-5649) & 6139;
        llIIlIIIII[130] = (-25121) & 25454;
        llIIlIIIII[131] = (-27146) & 27499;
        llIIlIIIII[132] = (-5665) & 6141;
        llIIlIIIII[133] = (-30757) & 31078;
        llIIlIIIII[134] = (-((-817) & 10227)) & (-9) & 9723;
        llIIlIIIII[135] = (-((-25395) & 32759)) & (-16897) & 24575;
        llIIlIIIII[136] = (-13325) & 13694;
        llIIlIIIII[137] = (-524) & 847;
        llIIlIIIII[138] = (-17083) & 17407;
        llIIlIIIII[139] = (-((-14666) & 32767)) & (-14339) & 32767;
        llIIlIIIII[140] = (-15361) & 15805;
        llIIlIIIII[141] = (-((-4497) & 29627)) & (-5121) & 30714;
        llIIlIIIII[142] = (-6178) & 6655;
        llIIlIIIII[143] = (-28677) & 29166;
        llIIlIIIII[144] = (-22530) & 23021;
        llIIlIIIII[145] = (-12293) & 12799;
        llIIlIIIII[146] = (-7586) & 8107;
        llIIlIIIII[147] = (-10789) & 11118;
        llIIlIIIII[148] = (-((-16581) & 24301)) & (-16389) & 24573;
        llIIlIIIII[149] = (-((-4937) & 30701)) & (-11) & 26286;
        llIIlIIIII[150] = (-23569) & 24127;
        llIIlIIIII[151] = (-31877) & 32253;
        llIIlIIIII[152] = (-((-257) & 28562)) & (-1) & 28637;
        llIIlIIIII[153] = (-((-409) & 6559)) & (-24577) & 31231;
        llIIlIIIII[154] = (-((-9281) & 30435)) & (-3081) & 24571;
        llIIlIIIII[155] = (-((-16465) & 31869)) & (-146) & 16063;
        llIIlIIIII[156] = (-30225) & 30551;
        llIIlIIIII[157] = (-((-6434) & 23855)) & (-4097) & 21997;
        llIIlIIIII[158] = (-22017) & 22360;
        llIIlIIIII[159] = (-((-2253) & 18669)) & (-15361) & 32255;
        llIIlIIIII[160] = (-14339) & 14831;
        llIIlIIIII[161] = (-21034) & 21375;
        llIIlIIIII[162] = (-((-11487) & 11999)) & (-27713) & 28670;
        llIIlIIIII[163] = (-14516) & 14835;
        llIIlIIIII[164] = (-9250) & 9599;
        llIIlIIIII[165] = (-9383) & 9703;
        llIIlIIIII[166] = (-((-2373) & 32749)) & (-2049) & 32765;
        llIIlIIIII[167] = (-((-1474) & 24531)) & (-9281) & 32759;
        llIIlIIIII[168] = (-((-20745) & 21801)) & (-1) & 1519;
        llIIlIIIII[169] = (-((-8549) & 26605)) & (-4097) & 22526;
        llIIlIIIII[170] = (-((-8545) & 31719)) & (-9218) & 32767;
        llIIlIIIII[171] = (-((-8539) & 26459)) & (-176) & 18431;
        llIIlIIIII[172] = (-((-193) & 19191)) & (-9345) & 28671;
        llIIlIIIII[173] = (-((-9805) & 30461)) & (-517) & 21503;
        llIIlIIIII[174] = (-((-1063) & 5799)) & (-19489) & 24557;
        llIIlIIIII[175] = (-14020) & 14323;
        llIIlIIIII[176] = (-3589) & 3950;
        llIIlIIIII[177] = (-26125) & 26447;
        llIIlIIIII[178] = 101 ^ 39;
        llIIlIIIII[179] = (-15437) & 15743;
        llIIlIIIII[180] = 122 ^ 57;
        llIIlIIIII[181] = (-3081) & 3389;
        llIIlIIIII[182] = (((162 + 133) - 278) + 190) ^ (((82 + 48) - 125) + 134);
        llIIlIIIII[183] = (-5761) & 6071;
        llIIlIIIII[184] = 81 ^ 20;
        llIIlIIIII[185] = (-((-19315) & 31739)) & (-18945) & 31743;
        llIIlIIIII[186] = (213 ^ 144) ^ "   ".length();
        llIIlIIIII[187] = (-((-5434) & 32575)) & (-5249) & 32767;
        llIIlIIIII[188] = (-((-16421) & 23783)) & (-16401) & 24275;
        llIIlIIIII[189] = 28 ^ 84;
        llIIlIIIII[190] = (-((-431) & 28671)) & (-1) & 28543;
        llIIlIIIII[191] = 244 ^ 189;
        llIIlIIIII[192] = (-((-21) & 23765)) & (-516) & 24571;
        llIIlIIIII[193] = 121 ^ 51;
        llIIlIIIII[194] = (-21127) & 21439;
        llIIlIIIII[195] = 232 ^ 163;
        llIIlIIIII[196] = (-((-49) & 25843)) & (-4609) & 30719;
        llIIlIIIII[197] = 63 ^ 115;
        llIIlIIIII[198] = (-((-617) & 15085)) & (-1057) & 15863;
        llIIlIIIII[199] = (174 ^ 138) ^ (48 ^ 89);
        llIIlIIIII[200] = (-19465) & 19804;
        llIIlIIIII[201] = 56 ^ 118;
        llIIlIIIII[202] = (-23585) & 23927;
        llIIlIIIII[203] = (((174 + 54) - 92) + 89) ^ (((61 + 1) - 59) + 171);
        llIIlIIIII[204] = (-((-851) & 20439)) & (-4609) & 24543;
        llIIlIIIII[205] = 252 ^ 172;
        llIIlIIIII[206] = (-14852) & 15199;
        llIIlIIIII[207] = 83 ^ 2;
        llIIlIIIII[208] = (-((-16667) & 32571)) & (-1) & 16255;
        llIIlIIIII[209] = (175 ^ 143) ^ (183 ^ 197);
        llIIlIIIII[210] = (-((-11747) & 32763)) & (-11393) & 32767;
        llIIlIIIII[211] = (71 ^ 54) ^ (183 ^ 149);
        llIIlIIIII[212] = (-((-630) & 32375)) & (-145) & 32249;
        llIIlIIIII[213] = (((158 + 135) - 220) + 145) ^ (((26 + 53) - 48) + 111);
        llIIlIIIII[214] = (-((-18761) & 27609)) & (-1) & 9215;
        llIIlIIIII[215] = 30 ^ 75;
        llIIlIIIII[216] = (-((-2633) & 31320)) & (-1) & 29055;
        llIIlIIIII[217] = (116 ^ 73) ^ (193 ^ 170);
        llIIlIIIII[218] = (-6685) & 7165;
        llIIlIIIII[219] = (40 ^ 57) ^ (33 ^ 103);
        llIIlIIIII[220] = (-((-8194) & 29727)) & (-2049) & 24063;
        llIIlIIIII[221] = 15 ^ 87;
        llIIlIIIII[222] = (-((-193) & 11466)) & (-4099) & 15855;
        llIIlIIIII[223] = 202 ^ 147;
        llIIlIIIII[224] = (-((-16587) & 21211)) & (-25609) & 30717;
        llIIlIIIII[225] = (32 ^ 31) ^ (230 ^ 131);
        llIIlIIIII[226] = (-2057) & 2542;
        llIIlIIIII[227] = (211 ^ 190) ^ (24 ^ 46);
        llIIlIIIII[228] = (-(190 ^ 175)) & (-15369) & 15871;
        llIIlIIIII[229] = (23 ^ 123) ^ (96 ^ 80);
        llIIlIIIII[230] = (-((-649) & 24220)) & (-513) & 24571;
        llIIlIIIII[231] = 200 ^ 149;
        llIIlIIIII[232] = (-18433) & 18921;
        llIIlIIIII[233] = (((15 + 98) - (-3)) + 42) ^ (((173 + 3) - 31) + 47);
        llIIlIIIII[234] = (-((-245) & 22773)) & (-9218) & 32251;
        llIIlIIIII[235] = (((78 + 179) - 115) + 62) ^ (((78 + 63) - 36) + 42);
        llIIlIIIII[236] = (-((-2082) & 31781)) & (-513) & 30719;
        llIIlIIIII[237] = (((109 + 57) - 121) + 153) ^ (((157 + 120) - 218) + 107);
        llIIlIIIII[238] = (-28675) & 29183;
        llIIlIIIII[239] = (83 ^ 68) ^ (240 ^ 134);
        llIIlIIIII[240] = (-30722) & 31231;
        llIIlIIIII[241] = (53 ^ 109) ^ (146 ^ 168);
        llIIlIIIII[242] = (-((-4131) & 12835)) & (-22529) & 31743;
        llIIlIIIII[243] = (31 ^ 101) ^ (93 ^ 68);
        llIIlIIIII[244] = (-30979) & 31495;
        llIIlIIIII[245] = (-17537) & 18054;
        llIIlIIIII[246] = (-26953) & 27471;
        llIIlIIIII[247] = (-20597) & 21116;
        llIIlIIIII[248] = (((40 + 93) - 24) + 118) ^ (((38 + 101) - 40) + 33);
        llIIlIIIII[249] = (-5473) & 5993;
        llIIlIIIII[250] = 194 ^ 170;
        llIIlIIIII[251] = (-((-8719) & 31695)) & (-33) & 23531;
        llIIlIIIII[252] = (139 ^ 192) ^ (36 ^ 6);
        llIIlIIIII[253] = (-18) & 541;
        llIIlIIIII[254] = (149 ^ 161) ^ (110 ^ 48);
        llIIlIIIII[255] = (-((-193) & 5617)) & (-8193) & 14141;
        llIIlIIIII[256] = (-((-10387) & 27575)) & (-8195) & 28590;
        llIIlIIIII[257] = (-((-2567) & 31535)) & (-69) & 32255;
        llIIlIIIII[258] = (-16483) & 19439;
        llIIlIIIII[259] = (-((-6549) & 15327)) & (-4242) & 16351;
    }

    public static void a(HashMap<Integer, Integer> hashMap, boolean z, boolean z2) {
        int i;
        if (lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(ad), llIIlIIIII[10])) {
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[24]];
            WorldArea worldArea = new WorldArea(llIIlIIIII[25], llIIlIIIII[26], llIIlIIIII[27], llIIlIIIII[28], llIIlIIIII[2]);
            int[] iArr = new int[llIIlIIIII[1]];
            iArr[llIIlIIIII[2]] = llIIlIIIII[29];
            boolean contains = Inventory.contains(iArr);
            if (lIlIlIIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                i = llIIlIIIII[1];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            } else {
                i = llIIlIIIII[2];
            }
            if (lIlIlIIIIlIll((contains ? 1 : 0) & i)) {
                int[] iArr2 = new int[llIIlIIIII[1]];
                iArr2[llIIlIIIII[2]] = llIIlIIIII[29];
                Inventory.getFirst(iArr2).interact(llIIIlllll[llIIlIIIII[30]]);
                Time.sleepTicks(llIIlIIIII[14]);
                "".length();
            }
            Movement.walkTo(ad);
            "".length();
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
        }
        if (lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(ad), llIIlIIIII[10])) {
            if (lIlIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
            }
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[31]];
            if (lIlIlIIIIlIll(z ? 1 : 0) && lIlIlIIIIIllI(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(llIIlIIIII[10]);
                "".length();
            }
            if (lIlIlIIIIlIll(z2 ? 1 : 0) && lIlIlIIIIIllI(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(llIIlIIIII[9]);
                "".length();
            }
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                int llllllllllllllllllIlIlIIllIlIIll = entry.getValue().intValue();
                System.out.println("Key: " + intValue + ", Value: " + llllllllllllllllllIlIlIIllIlIIll);
                C0000a.a(intValue, llllllllllllllllllIlIlIIllIlIIll);
                Time.sleepTicks(llIIlIIIII[1]);
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
        }
    }

    private static String lIlIlIIIIIIlI(String llllllllllllllllllIlIlIIlIIIIlll, String llllllllllllllllllIlIlIIlIIIIllI) {
        try {
            SecretKeySpec llllllllllllllllllIlIlIIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIlIIlIIIIllI.getBytes(StandardCharsets.UTF_8)), llIIlIIIII[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIII[9], llllllllllllllllllIlIlIIlIIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIlIIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIlIIlIIIlIII) {
            llllllllllllllllllIlIlIIlIIIlIII.printStackTrace();
            return null;
        }
    }

    public static long u() {
        return U + ((System.nanoTime() - V) / 1000000);
    }

    public static void a(WorldPoint worldPoint) {
        if (lIlIlIIIIlIII(C0028o.cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(C0028o.cB), llIIlIIIII[5])) {
                AccBuilderSotf.c = llIIIlllll[llIIlIIIII[1]];
                Movement.walkTo(C0028o.cB);
                "".length();
                Time.sleepTicks(llIIlIIIII[1]);
                "".length();
            }
            if (lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(C0028o.cB), llIIlIIIII[5])) {
                AccBuilderSotf.c = llIIIlllll[llIIlIIIII[9]];
                if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                NPC nearest = NPCs.getNearest(npc -> {
                    String[] strArr = new String[llIIlIIIII[1]];
                    strArr[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[97]];
                    return npc.hasAction(strArr);
                });
                if (lIlIlIIIIlIIl(nearest)) {
                    String[] strArr = new String[llIIlIIIII[1]];
                    strArr[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[5]];
                    if (lIlIlIIIIlIll(nearest.hasAction(strArr) ? 1 : 0)) {
                        nearest.interact(llIIIlllll[llIIlIIIII[10]]);
                        Time.sleepTicks(llIIlIIIII[5]);
                        "".length();
                    }
                    String[] strArr2 = new String[llIIlIIIII[1]];
                    strArr2[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[11]];
                    if (lIlIlIIIIlIII(nearest.hasAction(strArr2) ? 1 : 0)) {
                        C0020g.b(llIIIlllll[llIIlIIIII[12]], C0028o.cE);
                        Time.sleepTicks(llIIlIIIII[1]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[llIIlIIIII[1]];
                strArr3[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[13]];
                NPC nearest2 = NPCs.getNearest(strArr3);
                if (lIlIlIIIIlIIl(nearest2)) {
                    String[] strArr4 = new String[llIIlIIIII[1]];
                    strArr4[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[14]];
                    if (lIlIlIIIIlIll(nearest2.hasAction(strArr4) ? 1 : 0)) {
                        nearest2.interact(llIIIlllll[llIIlIIIII[15]]);
                        Time.sleepTicks(llIIlIIIII[5]);
                        "".length();
                    }
                    String[] strArr5 = new String[llIIlIIIII[1]];
                    strArr5[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[16]];
                    if (lIlIlIIIIlIII(nearest2.hasAction(strArr5) ? 1 : 0)) {
                        C0020g.b(llIIIlllll[llIIlIIIII[17]], C0028o.cE);
                        Time.sleepTicks(llIIlIIIII[1]);
                        "".length();
                    }
                }
            }
        }
        if (lIlIlIIIIlIll(C0028o.cF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
        }
    }

    private static boolean lIlIlIIIIllll(int i, int i2) {
        return i != i2;
    }

    public static void D() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIlIlIIIIlIll(world.isMembers() ? 1 : 0) && lIlIlIIIIlllI(world.getPlayerCount(), llIIlIIIII[82]) && lIlIlIIIIllll(world.getId(), Worlds.getCurrentId()) && lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[83]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[84]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[78]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[85]]) ? 1 : 0) && lIlIlIIIIllll(world.getId(), llIIlIIIII[86]) && lIlIlIIIIllll(world.getId(), llIIlIIIII[87]) && lIlIlIIIIllll(world.getId(), llIIlIIIII[87]) && lIlIlIIIIlIII(world.getActivity().contains(llIIIlllll[llIIlIIIII[88]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().contains(llIIIlllll[llIIlIIIII[89]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().contains(llIIIlllll[llIIlIIIII[90]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[91]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[92]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[93]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().endsWith(llIIIlllll[llIIlIIIII[94]]) ? 1 : 0) && lIlIlIIIIlIII(world.getActivity().startsWith(llIIIlllll[llIIlIIIII[95]]) ? 1 : 0) && lIlIlIIIIllIl(world.getPlayerCount(), llIIlIIIII[96])) {
                ?? r0 = llIIlIIIII[1];
                "".length();
                return " ".length() <= (-" ".length()) ? ((41 ^ 0) ^ (17 ^ 10)) & (((74 ^ 20) ^ (169 ^ 197)) ^ (-" ".length())) : r0;
            }
            return llIIlIIIII[2];
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    public static void G() {
        int i = llIIlIIIII[2];
        do {
            String[] strArr = new String[llIIlIIIII[1]];
            strArr[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[38]];
            if (!lIlIlIIIIlIIl(TileObjects.getNearest(strArr)) || !lIlIlIIIIlIII(AccBuilderSotf.d ? 1 : 0)) {
                return;
            }
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[73]];
            String[] strArr2 = new String[llIIlIIIII[1]];
            strArr2[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[74]];
            NPC nearest = NPCs.getNearest(strArr2);
            if (lIlIlIIIIlIII(i)) {
                if (lIlIlIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                    nearest.interact(llIIIlllll[llIIlIIIII[75]]);
                }
                if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                    if (lIlIlIIIIlIII(Dialog.canContinueNPC() ? 1 : 0) && lIlIlIIIIlIII(Dialog.canContinue() ? 1 : 0)) {
                        List options = Dialog.getOptions();
                        if (lIlIlIIIIlIII(options.isEmpty() ? 1 : 0)) {
                            List list = (List) options.stream().filter(widget -> {
                                if (lIlIlIIIIlIII(widget.getText().contains(llIIIlllll[llIIlIIIII[81]]) ? 1 : 0)) {
                                    ?? r0 = llIIlIIIII[1];
                                    "".length();
                                    return " ".length() == (112 ^ 116) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIIlIIIII[2];
                            }).collect(Collectors.toList());
                            if (lIlIlIIIIlIII(list.isEmpty() ? 1 : 0)) {
                                Mouse.click(((Widget) list.get(llIIlIIIII[2])).getClickPoint().getX(), ((Widget) list.get(llIIlIIIII[2])).getClickPoint().getY(), (boolean) llIIlIIIII[1]);
                                Time.sleepTicks(llIIlIIIII[5]);
                                "".length();
                            }
                            if (lIlIlIIIIlIlI(list.size(), llIIlIIIII[1])) {
                                i = llIIlIIIII[1];
                            }
                        }
                    }
                    if (!lIlIlIIIIlIII(Dialog.canContinueNPC() ? 1 : 0) || lIlIlIIIIlIll(Dialog.canContinue() ? 1 : 0)) {
                        Dialog.continueSpace();
                    }
                }
            }
            if (lIlIlIIIIlIll(i)) {
                String[] strArr3 = new String[llIIlIIIII[1]];
                strArr3[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[76]];
                TileObjects.getNearest(strArr3).interact(llIIIlllll[llIIlIIIII[77]]);
                Time.sleepTicks(llIIlIIIII[11]);
                "".length();
            }
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
            "".length();
        } while ((((191 ^ 185) ^ (136 ^ 171)) & (((((122 + 22) - 25) + 31) ^ (((10 + 45) - (-33)) + 91)) ^ (-" ".length()))) == (" ".length() & (" ".length() ^ (-" ".length()))));
    }

    public static String h(int i) {
        return NumberFormat.getNumberInstance(Locale.US).format(i);
    }

    public static void C() {
        Widget widget = Widgets.get(llIIlIIIII[41], llIIlIIIII[42]);
        if (lIlIlIIIIlIIl(widget)) {
            widget.interact(llIIIlllll[llIIlIIIII[33]]);
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
        }
    }

    private static void lIlIlIIIIIlII() {
        llIIIlllll = new String[llIIlIIIII[178]];
        llIIIlllll[llIIlIIIII[2]] = lIlIlIIIIIIIl("DRMmBxs4Cz0JSy8HMhw=", "HbSnk");
        llIIIlllll[llIIlIIIII[1]] = lIlIlIIIIIIIl("DBg/bh8tWT8rBDE=", "ByINk");
        llIIIlllll[llIIlIIIII[9]] = lIlIlIIIIIIlI("2UByrVE0lQHorhKWH8hDAKogUAPK+Q69", "jQDUd");
        llIIIlllll[llIIlIIIII[5]] = lIlIlIIIIIIIl("OgQiHXQ6AiMKNRgCPAAhGQ==", "jkPiT");
        llIIIlllll[llIIlIIIII[10]] = lIlIlIIIIIIIl("PTUUIHM9MxU3Mh8zCj0mHg==", "mZfTS");
        llIIIlllll[llIIlIIIII[11]] = lIlIlIIIIIIIl("HQo1IlYdDDQ1Fz8MKz8DPg==", "MeGVv");
        llIIIlllll[llIIlIIIII[12]] = lIlIlIIIIIIIl("PRA7JA==", "kuTWL");
        llIIIlllll[llIIlIIIII[13]] = lIlIlIIIIIIlI("rQrdParFQfQSm2/k60+tchBFtHiraer7", "FnnIA");
        llIIIlllll[llIIlIIIII[14]] = lIlIlIIIIIIIl("GC41Nk8YKDQhDjooKysaOw==", "HAGBo");
        llIIIlllll[llIIlIIIII[15]] = lIlIlIIIIIIIl("BysYJUIHLRkyAyUtBjgXJA==", "WDjQb");
        llIIIlllll[llIIlIIIII[16]] = lIlIlIIIIIIIl("GQAZE1QZBhgEFTsGBw4BOg==", "Iokgt");
        llIIIlllll[llIIlIIIII[17]] = lIlIlIIIIIIlI("rR+63QVIR/uoRsA8Y7S0Ihkd6cfhLJtN", "yttfz");
        llIIIlllll[llIIlIIIII[18]] = lIlIlIIIIIIIl("bXdRdyUs", "HRaRA");
        llIIIlllll[llIIlIIIII[19]] = lIlIlIIIIIIll("bCnxc2H1fBRjapLyXI5RcsQiah8kxVuKU1SRlpSmM6BVxPWEsA4+HpadRwBgrnKe3Ea0XBQvetw=", "QPiOt");
        llIIIlllll[llIIlIIIII[20]] = lIlIlIIIIIIll("NLg/cORlgwWP3OHSf0vYfg==", "TxsyT");
        llIIIlllll[llIIlIIIII[23]] = lIlIlIIIIIIIl("MDkpHhE=", "sUFmt");
        llIIIlllll[llIIlIIIII[24]] = lIlIlIIIIIIlI("B0iZRF7/S5yHMp1shxKzzyuAq7aqCyte", "yNVZG");
        llIIIlllll[llIIlIIIII[30]] = lIlIlIIIIIIll("tqrAxv52hrw=", "oOdwp");
        llIIIlllll[llIIlIIIII[31]] = lIlIlIIIIIIlI("rQ0aoB00ys+SWuid323V/XJoGtUg8k8m", "UmJII");
        llIIIlllll[llIIlIIIII[34]] = lIlIlIIIIIIlI("U2IbaQZNkOmos4d3U8JTcw==", "TZcZB");
        llIIIlllll[llIIlIIIII[36]] = lIlIlIIIIIIll("aqjDzcJgg+M=", "UpePa");
        llIIIlllll[llIIlIIIII[39]] = lIlIlIIIIIIIl("JT4iNAIU", "qQESn");
        llIIIlllll[llIIlIIIII[40]] = lIlIlIIIIIIlI("T2OWIktRTMk=", "cSMGr");
        llIIIlllll[llIIlIIIII[33]] = lIlIlIIIIIIlI("E9gpoNx8L43O+lTlYMVGog==", "AjxNQ");
        llIIIlllll[llIIlIIIII[43]] = lIlIlIIIIIIIl("JQI4EA==", "rgYbo");
        llIIIlllll[llIIlIIIII[44]] = lIlIlIIIIIIll("k0/iLCCSnAU=", "mWSsH");
        llIIIlllll[llIIlIIIII[45]] = lIlIlIIIIIIll("pDRZH2uNIPc=", "KEysy");
        llIIIlllll[llIIlIIIII[46]] = lIlIlIIIIIIll("xHxyXLbnsdg=", "qyHfT");
        llIIIlllll[llIIlIIIII[47]] = lIlIlIIIIIIll("zL+qeP2vbwU=", "TdDYt");
        llIIIlllll[llIIlIIIII[22]] = lIlIlIIIIIIIl("PT8XASg=", "xNbhX");
        llIIIlllll[llIIlIIIII[49]] = lIlIlIIIIIIIl("AxkPH3gpFVkbeBQ7WQkzMRwVVA==", "DpyzX");
        llIIIlllll[llIIlIIIII[61]] = lIlIlIIIIIIll("TBYK8ovKJcR6mjHuydquHTpe5mec8zH9", "tUJTi");
        llIIIlllll[llIIlIIIII[42]] = lIlIlIIIIIIIl("PRcbKA==", "zvoMT");
        llIIIlllll[llIIlIIIII[62]] = lIlIlIIIIIIIl("BDw1Hg==", "KLPpp");
        llIIIlllll[llIIlIIIII[63]] = lIlIlIIIIIIlI("q2jQYRlUiz87XNvtdMHth14J2zRYkztx", "IBSqf");
        llIIIlllll[llIIlIIIII[54]] = lIlIlIIIIIIlI("k0AQ1k0bKiu+HIrUq67tjRYYxRXfOVPy", "Nozcf");
        llIIIlllll[llIIlIIIII[66]] = lIlIlIIIIIIlI("7f0LtB+Do48=", "tWMtZ");
        llIIIlllll[llIIlIIIII[67]] = lIlIlIIIIIIll("uE8ftVzo0BY7B3qc8DDqrA==", "myVsO");
        llIIIlllll[llIIlIIIII[68]] = lIlIlIIIIIIll("yXNYkb8Dpi49EPEvlYHn1EX+RMMOUNy5", "wJAUq");
        llIIIlllll[llIIlIIIII[72]] = lIlIlIIIIIIll("27pp69PTyan5N1WnpNYYzQ==", "sorZc");
        llIIIlllll[llIIlIIIII[28]] = lIlIlIIIIIIll("0sLj2y9pDD6A5nFLMgr8Lg==", "SpeMY");
        llIIIlllll[llIIlIIIII[38]] = lIlIlIIIIIIlI("RU2pBT+TKjCajl+mLN07WA==", "gKEHj");
        llIIIlllll[llIIlIIIII[73]] = lIlIlIIIIIIll("gxbOqGFFz2P3xrlOWngLiQ==", "aPNKs");
        llIIIlllll[llIIlIIIII[74]] = lIlIlIIIIIIll("5rtEs94VMMg=", "JUIEX");
        llIIIlllll[llIIlIIIII[75]] = lIlIlIIIIIIIl("HQAIJVw9Dg==", "IadNq");
        llIIIlllll[llIIlIIIII[76]] = lIlIlIIIIIIll("OO+/9TOYgl8=", "IUWQi");
        llIIIlllll[llIIlIIIII[77]] = lIlIlIIIIIIll("I2K6oPqsX8s=", "wXEKZ");
        llIIIlllll[llIIlIIIII[81]] = lIlIlIIIIIIlI("MM1vcxPNMR8=", "Gkmux");
        llIIIlllll[llIIlIIIII[83]] = lIlIlIIIIIIll("p06zWuMq7SE=", "JmhsF");
        llIIIlllll[llIIlIIIII[84]] = lIlIlIIIIIIll("hMr5eYEuLjw=", "jSsPF");
        llIIIlllll[llIIlIIIII[78]] = lIlIlIIIIIIlI("MZ1nRREZsFE=", "dGRvO");
        llIIIlllll[llIIlIIIII[85]] = lIlIlIIIIIIll("oy6J2rYsGow=", "sEOHT");
        llIIIlllll[llIIlIIIII[88]] = lIlIlIIIIIIIl("KDMxARkBJQ==", "dVPfl");
        llIIIlllll[llIIlIIIII[89]] = lIlIlIIIIIIIl("KS8SMQ==", "kJfPT");
        llIIIlllll[llIIlIIIII[90]] = lIlIlIIIIIIlI("IexEDyQcl28=", "lAJLc");
        llIIIlllll[llIIlIIIII[91]] = lIlIlIIIIIIIl("KTACEiIMOw==", "mUcvO");
        llIIIlllll[llIIlIIIII[92]] = lIlIlIIIIIIlI("OHpSQjY59mY=", "aaBTT");
        llIIIlllll[llIIlIIIII[93]] = lIlIlIIIIIIlI("AialEU0f09uVNPHBeYHLVw==", "ePEor");
        llIIIlllll[llIIlIIIII[94]] = lIlIlIIIIIIlI("QSwectulrtg=", "NXLHD");
        llIIIlllll[llIIlIIIII[95]] = lIlIlIIIIIIIl("NRcHDA==", "wrsml");
        llIIIlllll[llIIlIIIII[97]] = lIlIlIIIIIIlI("qkDri8JR7h16ciXcA05xvbRu/GlbpHHx", "ZldeN");
        llIIIlllll[llIIlIIIII[27]] = lIlIlIIIIIIIl("ICYZIC0tPBI=", "CIwTD");
        llIIIlllll[llIIlIIIII[98]] = lIlIlIIIIIIlI("ed5wkaDptnSxjN9gh9/nfA==", "QTNqF");
        llIIIlllll[llIIlIIIII[99]] = lIlIlIIIIIIlI("Zuive74JdTiJ+sE0O4WtyA==", "iVvfI");
        llIIIlllll[llIIlIIIII[100]] = lIlIlIIIIIIll("noiAr4W89n3lnBas4B+2vA==", "pZwZP");
        llIIIlllll[llIIlIIIII[104]] = lIlIlIIIIIIlI("La0LtL8e+Ru/fJaqFPORSbr/YwkUwkc1y2Z/J+xU1cvTXDoSd/MtTWcoGXsF0KjhY5OxR294FL4=", "rACMV");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public static void A() {
        if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIlIIIIlIll(z() ? 1 : 0)) {
            if (lIlIlIIIIlIII(B() ? 1 : 0)) {
                C();
            }
            if (lIlIlIIIIlIll(B() ? 1 : 0)) {
                Widget widget = Widgets.get(llIIlIIIII[32], llIIlIIIII[33], llIIlIIIII[13]);
                if (lIlIlIIIIlIIl(widget)) {
                    widget.interact(llIIIlllll[llIIlIIIII[34]]);
                    Time.sleepTicks(llIIlIIIII[1]);
                    "".length();
                }
                if (lIlIlIIIIlIII(Vars.getBit(llIIlIIIII[35]))) {
                    Widget widget2 = Widgets.get(llIIlIIIII[32], llIIlIIIII[34], llIIlIIIII[28]);
                    if (lIlIlIIIIlIIl(widget2)) {
                        if (lIlIlIIIIlIII(widget2.isVisible() ? 1 : 0)) {
                            Widget widget3 = Widgets.get(llIIlIIIII[32], llIIlIIIII[36], llIIlIIIII[11]);
                            Mouse.click(widget3.getClickPoint().getX(), widget3.getClickPoint().getY(), (boolean) llIIlIIIII[1]);
                            Time.sleepTicks(llIIlIIIII[1]);
                            "".length();
                        }
                        if (lIlIlIIIIlIll(widget2.isVisible() ? 1 : 0)) {
                            widget2.interact(llIIIlllll[llIIlIIIII[36]]);
                            Time.sleepTicks(llIIlIIIII[1]);
                            "".length();
                        }
                    }
                }
                if (lIlIlIIIIlIII(Vars.getBit(llIIlIIIII[37]))) {
                    Widget widget4 = Widgets.get(llIIlIIIII[32], llIIlIIIII[34], llIIlIIIII[38]);
                    if (lIlIlIIIIlIIl(widget4)) {
                        if (lIlIlIIIIlIII(widget4.isVisible() ? 1 : 0)) {
                            Widget widget5 = Widgets.get(llIIlIIIII[32], llIIlIIIII[36], llIIlIIIII[11]);
                            Mouse.click(widget5.getClickPoint().getX(), widget5.getClickPoint().getY(), (boolean) llIIlIIIII[1]);
                            Time.sleepTicks(llIIlIIIII[1]);
                            "".length();
                        }
                        if (lIlIlIIIIlIll(widget4.isVisible() ? 1 : 0)) {
                            widget4.interact(llIIIlllll[llIIlIIIII[39]]);
                            Time.sleepTicks(llIIlIIIII[9]);
                            "".length();
                        }
                    }
                }
            }
        }
        Widget widget6 = Widgets.get(llIIlIIIII[32], llIIlIIIII[10]);
        if (lIlIlIIIIlIIl(widget6)) {
            widget6.interact(llIIIlllll[llIIlIIIII[40]]);
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
        }
    }

    public static void t() {
        Widgets.getAll(llIIlIIIII[6], widget -> {
            return widget.getText().contains(llIIIlllll[llIIlIIIII[100]]);
        });
        Widgets.getAll(llIIlIIIII[7], widget2 -> {
            return widget2.getText().contains(llIIIlllll[llIIlIIIII[99]]);
        });
        Widgets.getAll(llIIlIIIII[8], widget3 -> {
            return widget3.getText().contains(llIIIlllll[llIIlIIIII[98]]);
        });
        int llllllllllllllllllIlIlIIllllllII = llIIlIIIII[2];
        while (lIlIlIIIIIlll(llllllllllllllllllIlIlIIllllllII, ac.length)) {
            if (lIlIlIIIIlIIl(Widgets.get(ac[llllllllllllllllllIlIlIIllllllII], widget4 -> {
                return widget4.getText().contains(llIIIlllll[llIIlIIIII[27]]);
            }))) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + ac[llllllllllllllllllIlIlIIllllllII]);
            }
            llllllllllllllllllIlIlIIllllllII++;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
    }

    public static void c(WorldPoint worldPoint) {
        int i;
        int i2;
        Client client = Static.getClient();
        if (lIlIlIIIlIIII(client.getLocalPlayer())) {
            return;
        }
        int x = worldPoint.getX() - client.getBaseX();
        int llllllllllllllllllIlIlIIlIlIIlII = worldPoint.getY() - client.getBaseY();
        Point localToCanvas = Perspective.localToCanvas(client, LocalPoint.fromScene(x, llllllllllllllllllIlIlIIlIlIIlII), client.getPlane());
        if (lIlIlIIIIlIIl(localToCanvas)) {
            i = localToCanvas.getX();
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            i = llIIlIIIII[69];
        }
        int i3 = i;
        if (lIlIlIIIIlIIl(localToCanvas)) {
            i2 = localToCanvas.getY();
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            i2 = llIIlIIIII[69];
        }
        client.interact(llIIlIIIII[2], MenuAction.WALK.getId(), x, llllllllllllllllllIlIlIIlIlIIlII, i3, i2);
    }

    private static boolean lIlIlIIIIllIl(int i, int i2) {
        return i > i2;
    }

    public static String b(long j) {
        String str = llIIIlllll[llIIlIIIII[18]];
        Object[] objArr = new Object[llIIlIIIII[1]];
        objArr[llIIlIIIII[2]] = Integer.valueOf(llIIlIIIII[9]);
        String format = String.format(str, objArr);
        long j2 = j / 1000;
        Object[] objArr2 = new Object[llIIlIIIII[1]];
        objArr2[llIIlIIIII[2]] = Long.valueOf(j2 % 60);
        String format2 = String.format(format, objArr2);
        Object[] objArr3 = new Object[llIIlIIIII[1]];
        objArr3[llIIlIIIII[2]] = Long.valueOf((j2 % 3600) / 60);
        String format3 = String.format(format, objArr3);
        Object[] objArr4 = new Object[llIIlIIIII[1]];
        objArr4[llIIlIIIII[2]] = Long.valueOf(j2 / 3600);
        return String.format(format, objArr4) + ":" + format3 + ":" + format2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public static void a(String llllllllllllllllllIlIlIIlIlllIIl, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(llllllllllllllllllIlIlIIlIlllIIl).openConnection();
            httpURLConnection.setRequestMethod(llIIIlllll[llIIlIIIII[66]]);
            httpURLConnection.setRequestProperty(llIIIlllll[llIIlIIIII[67]], llIIIlllll[llIIlIIIII[68]]);
            httpURLConnection.setDoOutput(llIIlIIIII[1]);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("{\"content\": \"" + str + "\"}");
            dataOutputStream.flush();
            dataOutputStream.close();
            float llllllllllllllllllIlIlIIlIllIIll = httpURLConnection.getResponseCode();
            System.out.println("Response Code: " + llllllllllllllllllIlIlIIlIllIIll);
            httpURLConnection.disconnect();
            "".length();
            if (0 != 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean lIlIlIIIIlllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIIIIlIII(int i) {
        return i == 0;
    }

    public static boolean i(int i) {
        int[] iArr = new int[llIIlIIIII[1]];
        iArr[llIIlIIIII[2]] = i;
        return Bank.contains(iArr);
    }

    private static boolean lIlIlIIIIlIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlIIIIIIIl(String llllllllllllllllllIlIlIIIlllIlll, String llllllllllllllllllIlIlIIIlllIllI) {
        String llllllllllllllllllIlIlIIIlllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlIlIIIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIlIlIIIlllIllI.toCharArray();
        int llllllllllllllllllIlIlIIIlllIIll = llIIlIIIII[2];
        char[] charArray2 = llllllllllllllllllIlIlIIIlllIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIII[2];
        while (lIlIlIIIIIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIlIlIIIlllIIll % charArray.length]));
            "".length();
            llllllllllllllllllIlIlIIIlllIIll++;
            i++;
            "".length();
            if ((-((((80 + 81) - 138) + 153) ^ (((125 + 82) - 36) + 10))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIIIIlIIl(Object obj) {
        return obj != null;
    }

    public static int c(int i, int i2) {
        int i3 = i2 - i;
        if (lIlIlIIIIlIII(i3)) {
            return i;
        }
        if (lIlIlIIIIlIlI(Math.abs(i3), llIIlIIIII[1])) {
            if (lIlIlIIIIlIll(R.nextBoolean() ? 1 : 0)) {
                "".length();
                return " ".length() == 0 ? ((239 ^ 199) ^ (78 ^ 80)) & (((((1 + 150) - 19) + 57) ^ (((58 + 1) - (-24)) + 56)) ^ (-" ".length())) : i;
            }
            return i2;
        }
        if (lIlIlIIIIllII(i3)) {
            i = i2;
            i2 = i;
        }
        return i + R.nextInt((i2 - i) + llIIlIIIII[1]);
    }

    private static boolean lIlIlIIIIIlll(int i, int i2) {
        return i < i2;
    }

    public static void y() {
        Widget widget = Widgets.get(llIIlIIIII[21], llIIlIIIII[22], llIIlIIIII[2]);
        if (lIlIlIIIIlIIl(widget)) {
            widget.interact(llIIIlllll[llIIlIIIII[23]]);
            Time.sleepTicks(llIIlIIIII[5]);
            "".length();
        }
    }

    static {
        lIlIlIIIIIlIl();
        lIlIlIIIIIlII();
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
        W = new HashMap();
        int[] iArr = new int[llIIlIIIII[11]];
        iArr[llIIlIIIII[2]] = llIIlIIIII[103];
        iArr[llIIlIIIII[1]] = llIIlIIIII[8];
        iArr[llIIlIIIII[9]] = llIIlIIIII[101];
        iArr[llIIlIIIII[5]] = llIIlIIIII[102];
        iArr[llIIlIIIII[10]] = llIIlIIIII[6];
        ac = iArr;
        ad = new WorldPoint(llIIlIIIII[109], llIIlIIIII[110], llIIlIIIII[2]);
        int[] iArr2 = new int[llIIlIIIII[111]];
        iArr2[llIIlIIIII[2]] = llIIlIIIII[112];
        iArr2[llIIlIIIII[1]] = llIIlIIIII[113];
        iArr2[llIIlIIIII[9]] = llIIlIIIII[114];
        iArr2[llIIlIIIII[5]] = llIIlIIIII[115];
        iArr2[llIIlIIIII[10]] = llIIlIIIII[116];
        iArr2[llIIlIIIII[11]] = llIIlIIIII[117];
        iArr2[llIIlIIIII[12]] = llIIlIIIII[118];
        iArr2[llIIlIIIII[13]] = llIIlIIIII[119];
        iArr2[llIIlIIIII[14]] = llIIlIIIII[120];
        iArr2[llIIlIIIII[15]] = llIIlIIIII[121];
        iArr2[llIIlIIIII[16]] = llIIlIIIII[122];
        iArr2[llIIlIIIII[17]] = llIIlIIIII[123];
        iArr2[llIIlIIIII[18]] = llIIlIIIII[124];
        iArr2[llIIlIIIII[19]] = llIIlIIIII[125];
        iArr2[llIIlIIIII[20]] = llIIlIIIII[126];
        iArr2[llIIlIIIII[23]] = llIIlIIIII[127];
        iArr2[llIIlIIIII[24]] = llIIlIIIII[128];
        iArr2[llIIlIIIII[30]] = llIIlIIIII[129];
        iArr2[llIIlIIIII[31]] = llIIlIIIII[130];
        iArr2[llIIlIIIII[34]] = llIIlIIIII[131];
        iArr2[llIIlIIIII[36]] = llIIlIIIII[132];
        iArr2[llIIlIIIII[39]] = llIIlIIIII[133];
        iArr2[llIIlIIIII[40]] = llIIlIIIII[134];
        iArr2[llIIlIIIII[33]] = llIIlIIIII[135];
        iArr2[llIIlIIIII[43]] = llIIlIIIII[136];
        iArr2[llIIlIIIII[44]] = llIIlIIIII[137];
        iArr2[llIIlIIIII[45]] = llIIlIIIII[138];
        iArr2[llIIlIIIII[46]] = llIIlIIIII[139];
        iArr2[llIIlIIIII[47]] = llIIlIIIII[140];
        iArr2[llIIlIIIII[22]] = llIIlIIIII[141];
        iArr2[llIIlIIIII[49]] = llIIlIIIII[142];
        iArr2[llIIlIIIII[61]] = llIIlIIIII[143];
        iArr2[llIIlIIIII[42]] = llIIlIIIII[144];
        iArr2[llIIlIIIII[62]] = llIIlIIIII[145];
        iArr2[llIIlIIIII[63]] = llIIlIIIII[146];
        iArr2[llIIlIIIII[54]] = llIIlIIIII[147];
        iArr2[llIIlIIIII[66]] = llIIlIIIII[148];
        iArr2[llIIlIIIII[67]] = llIIlIIIII[149];
        iArr2[llIIlIIIII[68]] = llIIlIIIII[150];
        iArr2[llIIlIIIII[72]] = llIIlIIIII[151];
        iArr2[llIIlIIIII[28]] = llIIlIIIII[152];
        iArr2[llIIlIIIII[38]] = llIIlIIIII[153];
        iArr2[llIIlIIIII[73]] = llIIlIIIII[154];
        iArr2[llIIlIIIII[74]] = llIIlIIIII[155];
        iArr2[llIIlIIIII[75]] = llIIlIIIII[156];
        iArr2[llIIlIIIII[76]] = llIIlIIIII[157];
        iArr2[llIIlIIIII[77]] = llIIlIIIII[158];
        iArr2[llIIlIIIII[81]] = llIIlIIIII[159];
        iArr2[llIIlIIIII[83]] = llIIlIIIII[160];
        iArr2[llIIlIIIII[84]] = llIIlIIIII[161];
        iArr2[llIIlIIIII[78]] = llIIlIIIII[162];
        iArr2[llIIlIIIII[85]] = llIIlIIIII[163];
        iArr2[llIIlIIIII[88]] = llIIlIIIII[164];
        iArr2[llIIlIIIII[89]] = llIIlIIIII[165];
        iArr2[llIIlIIIII[90]] = llIIlIIIII[166];
        iArr2[llIIlIIIII[91]] = llIIlIIIII[167];
        iArr2[llIIlIIIII[92]] = llIIlIIIII[168];
        iArr2[llIIlIIIII[93]] = llIIlIIIII[169];
        iArr2[llIIlIIIII[94]] = llIIlIIIII[170];
        iArr2[llIIlIIIII[95]] = llIIlIIIII[171];
        iArr2[llIIlIIIII[97]] = llIIlIIIII[172];
        iArr2[llIIlIIIII[27]] = llIIlIIIII[173];
        iArr2[llIIlIIIII[98]] = llIIlIIIII[174];
        iArr2[llIIlIIIII[99]] = llIIlIIIII[175];
        iArr2[llIIlIIIII[100]] = llIIlIIIII[176];
        iArr2[llIIlIIIII[104]] = llIIlIIIII[177];
        iArr2[llIIlIIIII[178]] = llIIlIIIII[179];
        iArr2[llIIlIIIII[180]] = llIIlIIIII[181];
        iArr2[llIIlIIIII[182]] = llIIlIIIII[183];
        iArr2[llIIlIIIII[184]] = llIIlIIIII[185];
        iArr2[llIIlIIIII[186]] = llIIlIIIII[187];
        iArr2[llIIlIIIII[57]] = llIIlIIIII[188];
        iArr2[llIIlIIIII[189]] = llIIlIIIII[190];
        iArr2[llIIlIIIII[191]] = llIIlIIIII[192];
        iArr2[llIIlIIIII[193]] = llIIlIIIII[194];
        iArr2[llIIlIIIII[195]] = llIIlIIIII[196];
        iArr2[llIIlIIIII[197]] = llIIlIIIII[198];
        iArr2[llIIlIIIII[199]] = llIIlIIIII[200];
        iArr2[llIIlIIIII[201]] = llIIlIIIII[202];
        iArr2[llIIlIIIII[203]] = llIIlIIIII[204];
        iArr2[llIIlIIIII[205]] = llIIlIIIII[206];
        iArr2[llIIlIIIII[207]] = llIIlIIIII[208];
        iArr2[llIIlIIIII[209]] = llIIlIIIII[210];
        iArr2[llIIlIIIII[211]] = llIIlIIIII[212];
        iArr2[llIIlIIIII[213]] = llIIlIIIII[214];
        iArr2[llIIlIIIII[215]] = llIIlIIIII[216];
        iArr2[llIIlIIIII[217]] = llIIlIIIII[218];
        iArr2[llIIlIIIII[219]] = llIIlIIIII[220];
        iArr2[llIIlIIIII[221]] = llIIlIIIII[222];
        iArr2[llIIlIIIII[223]] = llIIlIIIII[224];
        iArr2[llIIlIIIII[225]] = llIIlIIIII[226];
        iArr2[llIIlIIIII[227]] = llIIlIIIII[228];
        iArr2[llIIlIIIII[229]] = llIIlIIIII[230];
        iArr2[llIIlIIIII[231]] = llIIlIIIII[232];
        iArr2[llIIlIIIII[233]] = llIIlIIIII[234];
        iArr2[llIIlIIIII[235]] = llIIlIIIII[236];
        iArr2[llIIlIIIII[237]] = llIIlIIIII[238];
        iArr2[llIIlIIIII[239]] = llIIlIIIII[240];
        iArr2[llIIlIIIII[241]] = llIIlIIIII[242];
        iArr2[llIIlIIIII[243]] = llIIlIIIII[244];
        iArr2[llIIlIIIII[96]] = llIIlIIIII[245];
        iArr2[llIIlIIIII[80]] = llIIlIIIII[246];
        iArr2[llIIlIIIII[0]] = llIIlIIIII[247];
        iArr2[llIIlIIIII[248]] = llIIlIIIII[249];
        iArr2[llIIlIIIII[250]] = llIIlIIIII[251];
        iArr2[llIIlIIIII[252]] = llIIlIIIII[253];
        iArr2[llIIlIIIII[254]] = llIIlIIIII[255];
        ae = iArr2;
        af = new WorldPoint(llIIlIIIII[256], llIIlIIIII[257], llIIlIIIII[9]);
        ag = new WorldArea(llIIlIIIII[258], llIIlIIIII[259], llIIlIIIII[62], llIIlIIIII[40], llIIlIIIII[2]);
    }

    private static boolean lIlIlIIIIIllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean s() {
        if (lIlIlIIIIIllI(j(llIIlIIIII[0]))) {
            ?? r0 = llIIlIIIII[1];
            "".length();
            return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIIIII[2];
    }

    private static boolean lIlIlIIIIllII(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public static void I() {
        if (lIlIlIIIIlIII(Widgets.get(llIIlIIIII[79]).isEmpty() ? 1 : 0)) {
            Widget widget = Widgets.get(llIIlIIIII[79], llIIlIIIII[24]);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIIlIIIII[1]);
            Time.sleepTicks(llIIlIIIII[5]);
            "".length();
        }
    }

    public static void b(WorldPoint worldPoint) {
        WorldPoint worldPoint2 = new WorldPoint(llIIlIIIII[50], llIIlIIIII[51], llIIlIIIII[2]);
        WorldArea worldArea = new WorldArea(llIIlIIIII[52], llIIlIIIII[53], llIIlIIIII[15], llIIlIIIII[54], llIIlIIIII[2]);
        WorldArea worldArea2 = new WorldArea(llIIlIIIII[55], llIIlIIIII[56], llIIlIIIII[57], llIIlIIIII[58], llIIlIIIII[2]);
        if (lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIlIIIII[12]) && lIlIlIIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIllIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIlIIIII[59], llIIlIIIII[60], llIIlIIIII[1])), llIIlIIIII[36])) {
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[61]];
            if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(worldPoint2);
            "".length();
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
        }
        if (lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIlIIIII[12]) && lIlIlIIIIlllI(Players.getLocal().getWorldLocation().getY(), llIIlIIIII[51])) {
            if (lIlIlIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr = new String[llIIlIIIII[1]];
                strArr[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[42]];
                TileObjects.getNearest(strArr).interact(llIIIlllll[llIIlIIIII[62]]);
                Time.sleepTicks(llIIlIIIII[9]);
                "".length();
            }
            if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                String[] strArr2 = new String[llIIlIIIII[1]];
                strArr2[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[63]];
                C0020g.a(strArr2);
            }
        }
        if (lIlIlIIIIllIl(Players.getLocal().getWorldLocation().getY(), llIIlIIIII[51])) {
            if (lIlIlIIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIlIIIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIlIlIIIIlllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIIlIIIII[59], llIIlIIIII[60], llIIlIIIII[1])), llIIlIIIII[36])) {
                return;
            }
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[54]];
            if (lIlIlIIIIlIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(llIIlIIIII[50], llIIlIIIII[64], llIIlIIIII[2])) ? 1 : 0)) {
                c(new WorldPoint(llIIlIIIII[50], llIIlIIIII[65], llIIlIIIII[2]));
                Time.sleepTicks(llIIlIIIII[12]);
                "".length();
            }
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llIIlIIIII[1]);
            "".length();
        }
    }

    private static boolean lIlIlIIIIlIll(int i) {
        return i != 0;
    }

    public static int j(int i) {
        return ((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarpValue(i));
        })).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean c(int[] iArr) {
        int i = llIIlIIIII[2];
        while (lIlIlIIIIIlll(i, iArr.length)) {
            if (lIlIlIIIIlIII(i(iArr[i]) ? 1 : 0)) {
                System.out.println("Missing ID: " + iArr[i]);
                return llIIlIIIII[2];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((((92 + 113) - 132) + 132) ^ (((9 + 11) - (-109)) + 18)) & (((37 ^ 20) ^ (223 ^ 176)) ^ (-" ".length()));
            }
        }
        return llIIlIIIII[1];
    }

    public static void k(int i) {
        if (lIlIlIIIIllll(Static.getClient().getWorld(), i)) {
            World findWorld = Static.getWorldService().getWorlds().findWorld(i);
            if (lIlIlIIIlIIII(findWorld)) {
                return;
            }
            if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            net.runelite.api.World createWorld = Static.getClient().createWorld();
            createWorld.setActivity(findWorld.getActivity());
            createWorld.setAddress(findWorld.getAddress());
            createWorld.setId(findWorld.getId());
            createWorld.setPlayerCount(findWorld.getPlayers());
            createWorld.setLocation(findWorld.getLocation());
            createWorld.setTypes(WorldUtil.toWorldTypes(findWorld.getTypes()));
            Worlds.hopTo(createWorld);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean z() {
        if (!lIlIlIIIIlIll(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(llIIlIIIII[35]));
        })).intValue()) || lIlIlIIIIlIII(((Integer) GameThread.invokeLater(() -> {
            return Integer.valueOf(Static.getClient().getVarbitValue(llIIlIIIII[37]));
        })).intValue())) {
            ?? r0 = llIIlIIIII[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIlIIIII[2];
    }

    public static long a(long j) {
        return u() - j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public static boolean B() {
        if (lIlIlIIIIlIIl(Widgets.get(llIIlIIIII[32], llIIlIIIII[1]))) {
            ?? r0 = llIIlIIIII[1];
            "".length();
            return (((40 ^ 26) ^ (34 ^ 51)) & (((((26 + 171) - 148) + 134) ^ (((10 + 124) - (-11)) + 3)) ^ (-" ".length()))) >= "  ".length() ? ((75 ^ 47) ^ (31 ^ 59)) & (((((9 + 212) - 178) + 209) ^ (((33 + 178) - 159) + 136)) ^ (-" ".length())) : r0;
        }
        return llIIlIIIII[2];
    }

    public static void x() {
        if (lIlIlIIIIlIll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
            Time.sleepTicks(llIIlIIIII[10]);
            "".length();
        }
        if (lIlIlIIIIlIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
            D();
        }
    }

    public static int v() {
        return ae[c(llIIlIIIII[2], ae.length - llIIlIIIII[1])];
    }

    public static void E() {
        if (lIlIlIIIIlIII(j(llIIlIIIII[70]))) {
            if (lIlIlIIIIlIII(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(llIIlIIIII[1]);
                "".length();
            }
            if (lIlIlIIIIlIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(llIIlIIIII[71], llIIlIIIII[49]);
                if (lIlIlIIIIlIIl(widget)) {
                    widget.interact(llIIIlllll[llIIlIIIII[72]]);
                    Time.sleepTicks(llIIlIIIII[1]);
                    "".length();
                }
            }
        }
    }

    public static void l(int i) {
        int[] iArr = new int[llIIlIIIII[1]];
        iArr[llIIlIIIII[2]] = i;
        if (lIlIlIIIIlIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIIIII[1]];
            iArr2[llIIlIIIII[2]] = i;
            if (lIlIlIIIIlIII(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIlIIIII[1]];
                iArr3[llIIlIIIII[2]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[llIIlIIIII[1]];
                strArr[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[43]];
                if (lIlIlIIIIlIll(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIlIIIII[1]];
                    iArr4[llIIlIIIII[2]] = i;
                    Inventory.getFirst(iArr4).interact(llIIIlllll[llIIlIIIII[44]]);
                }
                int[] iArr5 = new int[llIIlIIIII[1]];
                iArr5[llIIlIIIII[2]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[llIIlIIIII[1]];
                strArr2[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[45]];
                if (lIlIlIIIIlIll(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIlIIIII[1]];
                    iArr6[llIIlIIIII[2]] = i;
                    Inventory.getFirst(iArr6).interact(llIIIlllll[llIIlIIIII[46]]);
                }
                int[] iArr7 = new int[llIIlIIIII[1]];
                iArr7[llIIlIIIII[2]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[llIIlIIIII[1]];
                strArr3[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[47]];
                if (lIlIlIIIIlIll(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[llIIlIIIII[1]];
                    iArr8[llIIlIIIII[2]] = i;
                    Inventory.getFirst(iArr8).interact(llIIIlllll[llIIlIIIII[22]]);
                }
                if (lIlIlIIIIlIlI(i, llIIlIIIII[48])) {
                    Time.sleepTicks(llIIlIIIII[5]);
                    "".length();
                    String[] strArr4 = new String[llIIlIIIII[1]];
                    strArr4[llIIlIIIII[2]] = llIIIlllll[llIIlIIIII[49]];
                    C0020g.a(strArr4);
                    Time.sleepTicks(llIIlIIIII[1]);
                    "".length();
                }
            }
        }
    }

    public static void F() {
        if (lIlIlIIIIlIlI(j(llIIlIIIII[70]), llIIlIIIII[1])) {
            if (lIlIlIIIIlIII(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(llIIlIIIII[1]);
                "".length();
            }
            if (lIlIlIIIIlIll(Tabs.isOpen(Tab.COMBAT) ? 1 : 0)) {
                Widget widget = Widgets.get(llIIlIIIII[71], llIIlIIIII[49]);
                if (lIlIlIIIIlIIl(widget)) {
                    widget.interact(llIIIlllll[llIIlIIIII[28]]);
                    Time.sleepTicks(llIIlIIIII[1]);
                    "".length();
                }
            }
        }
    }

    public static int J() {
        return j(llIIlIIIII[80]);
    }

    public static void b(int[] iArr) {
        int i = llIIlIIIII[2];
        while (lIlIlIIIIIlll(i, iArr.length)) {
            AccBuilderSotf.c = llIIIlllll[llIIlIIIII[2]];
            if (lIlIlIIIIlIII(iArr[i])) {
                "".length();
                if (((57 ^ 81) ^ (49 ^ 93)) <= " ".length()) {
                    return;
                }
            } else {
                Time.sleepTicks(llIIlIIIII[1]);
                "".length();
                l(iArr[i]);
                Time.sleep(c(llIIlIIIII[3], llIIlIIIII[4]));
                "".length();
            }
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
        Time.sleepTicks(c(llIIlIIIII[1], llIIlIIIII[5]));
        "".length();
    }

    public static double w() {
        return (Skills.getBoostedLevel(Skill.HITPOINTS) / Skills.getLevel(Skill.HITPOINTS)) * 100.0d;
    }

    private static boolean lIlIlIIIlIIII(Object obj) {
        return obj == null;
    }

    public static void c(String str) {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(llIIIlllll[llIIlIIIII[19]]));
        bufferedWriter.write(str + System.getProperty(llIIIlllll[llIIlIIIII[20]]));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
