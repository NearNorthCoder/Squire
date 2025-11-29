package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.e  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/e.class */
public class e {
    private static /* synthetic */ int[] ll;
    public static /* synthetic */ boolean G;
    private static /* synthetic */ String[] l;
    public static /* synthetic */ List<j> H;

    private static void lIlII() {
        ll = new int[231];
        ll[0] = (192 ^ 137) & ((237 ^ 164) ^ (-1));
        ll[1] = " ".length();
        ll[2] = (162 ^ 188) ^ (127 ^ 113);
        ll[3] = "  ".length();
        ll[4] = "   ".length();
        ll[5] = (((66 + 62) - 126) + 180) ^ (((167 + 72) - 216) + 155);
        ll[6] = 48 ^ 53;
        ll[7] = (((65 + 57) - 43) + 60) ^ (((1 + 71) - (-68)) + 1);
        ll[8] = 169 ^ 174;
        ll[9] = (163 ^ 150) ^ (164 ^ 153);
        ll[10] = 22 ^ 31;
        ll[11] = (162 ^ 198) ^ (73 ^ 39);
        ll[12] = 99 ^ 104;
        ll[13] = 21 ^ 25;
        ll[14] = (8 ^ 60) ^ (142 ^ 183);
        ll[15] = (98 ^ 10) ^ (230 ^ 128);
        ll[16] = (248 ^ 169) ^ (49 ^ 111);
        ll[17] = (-20881) & 24029;
        ll[18] = (-((-25731) & 31886)) & (-1) & 15807;
        ll[19] = (-((-655) & 28399)) & (-6) & 32749;
        ll[20] = (-24633) & 32639;
        ll[21] = (-((-1124) & 9467)) & (-16385) & 32735;
        ll[22] = (-21906) & 22459;
        ll[23] = (-23) & 1022;
        ll[24] = (-25665) & 26227;
        ll[25] = 231 ^ 131;
        ll[26] = (-14481) & 15036;
        ll[27] = (-((-8741) & 16375)) & (-16385) & 24575;
        ll[28] = 29 ^ 47;
        ll[29] = (((63 + 113) - 155) + 122) ^ (((151 + 66) - 135) + 76);
        ll[30] = 140 ^ 158;
        ll[31] = 59 ^ 40;
        ll[32] = (((59 + 74) - 48) + 124) ^ (((122 + 129) - 199) + 145);
        ll[33] = (-9219) & 11770;
        ll[34] = (-((-5409) & 13606)) & (-20481) & 31231;
        ll[35] = (-21505) & 24060;
        ll[36] = (-17409) & 19966;
        ll[37] = (-(198 ^ 143)) & (-25639) & 28270;
        ll[38] = (-20934) & 23495;
        ll[39] = 25 ^ 12;
        ll[40] = 5 ^ 19;
        ll[41] = (-8210) & 16219;
        ll[42] = (-(((90 + 50) - 21) + 16)) & (-8241) & 16383;
        ll[43] = (-24709) & 32719;
        ll[44] = (-19485) & 20479;
        ll[45] = (-((-1041) & 7415)) & (-16385) & 32758;
        ll[46] = (-8194) & 9145;
        ll[47] = (-((-16413) & 32029)) & (-69) & 16239;
        ll[48] = (-((-26914) & 31011)) & (-2049) & 16351;
        ll[49] = (-10297) & 10936;
        ll[50] = (-2595) & 6894;
        ll[51] = (-26633) & 32157;
        ll[52] = 63 ^ 40;
        ll[53] = (189 ^ 166) ^ "   ".length();
        ll[54] = (-((-11082) & 31563)) & (-41) & 30719;
        ll[55] = (-17665) & 18318;
        ll[56] = (-6149) & 6991;
        ll[57] = (187 ^ 133) ^ (150 ^ 177);
        ll[58] = (((110 + 37) - 144) + 138) ^ (((136 + 17) - 26) + 24);
        ll[59] = (-((-26037) & 30141)) & (-18) & 14303;
        ll[60] = (-((-5921) & 30511)) & (-2689) & 28415;
        ll[61] = (-((-4609) & 21377)) & (-2049) & 20455;
        ll[62] = (-((-13789) & 30175)) & (-12305) & 29695;
        ll[63] = (((2 + 130) - 125) + 125) ^ (((136 + 64) - 44) + 3);
        ll[64] = 41 ^ 53;
        ll[65] = (-6160) & 16367;
        ll[66] = (-((-3217) & 28347)) & (-2129) & 28415;
        ll[67] = (-((-11549) & 32061)) & (-385) & 22015;
        ll[68] = (-((-17441) & 24035)) & (-24577) & 32251;
        ll[69] = 221 ^ 192;
        ll[70] = 189 ^ 163;
        ll[71] = (-((-8578) & 14723)) & (-49) & 16383;
        ll[72] = (-27649) & 28667;
        ll[73] = (-((-327) & 11135)) & (-1) & 11903;
        ll[74] = (-29228) & 30651;
        ll[75] = (113 ^ 74) ^ (38 ^ 2);
        ll[76] = 175 ^ 143;
        ll[77] = (-6178) & 16357;
        ll[78] = (-8201) & 9405;
        ll[79] = (-((-2187) & 27023)) & (-4097) & 30567;
        ll[80] = (-((-241) & 7159)) & (-8305) & 16375;
        ll[81] = (82 ^ 17) ^ (208 ^ 178);
        ll[82] = 92 ^ 126;
        ll[83] = (-115) & 12278;
        ll[84] = (-((-19729) & 24339)) & (-16385) & 22267;
        ll[85] = (-21385) & 22509;
        ll[86] = (-((-9269) & 30589)) & (-8193) & 30703;
        ll[87] = (((96 + 114) - 149) + 83) ^ (((47 + 80) - 51) + 103);
        ll[88] = 22 ^ 50;
        ll[89] = (-((-9873) & 16019)) & (-5) & 16382;
        ll[90] = (-((-1053) & 1853)) & (-14353) & 16253;
        ll[91] = (-((-1) & 23297)) & (-79) & 24543;
        ll[92] = 164 ^ 129;
        ll[93] = 71 ^ 97;
        ll[94] = (-20481) & 30696;
        ll[95] = (-2945) & 4077;
        ll[96] = (-2253) & 3327;
        ll[97] = (-((-5231) & 23807)) & (-4101) & 24055;
        ll[98] = 188 ^ 155;
        ll[99] = (46 ^ 91) ^ (90 ^ 7);
        ll[100] = (-((-11833) & 15931)) & (-8193) & 32123;
        ll[101] = (-19041) & 24567;
        ll[102] = (-9) & 1391;
        ll[103] = 132 ^ 173;
        ll[104] = 52 ^ 30;
        ll[105] = (-2097) & 12284;
        ll[106] = (-((-769) & 31573)) & (-513) & 32383;
        ll[107] = (-((-5065) & 24537)) & (-8227) & 28543;
        ll[108] = (-14686) & 16381;
        ll[109] = 85 ^ 126;
        ll[110] = (41 ^ 76) ^ (227 ^ 170);
        ll[111] = (-6146) & 16359;
        ll[112] = (-((-14857) & 31327)) & (-2177) & 20479;
        ll[113] = (-11332) & 11979;
        ll[114] = (-14513) & 15865;
        ll[115] = (235 ^ 185) ^ (((97 + 101) - 112) + 41);
        ll[116] = 31 ^ 49;
        ll[117] = (-18441) & 28666;
        ll[118] = (-20833) & 21999;
        ll[119] = (-((-2693) & 24487)) & (-10385) & 32755;
        ll[120] = (-((-18235) & 20415)) & (-17) & 3519;
        ll[121] = " ".length() ^ (148 ^ 186);
        ll[122] = (66 ^ 23) ^ (95 ^ 58);
        ll[123] = (-((-2305) & 6440)) & (-2065) & 16383;
        ll[124] = (-((-24725) & 27575)) & (-133) & 4079;
        ll[125] = (-25233) & 26527;
        ll[126] = (20 ^ 16) ^ (87 ^ 98);
        ll[127] = (-((-9602) & 13799)) & (-9) & 16367;
        ll[128] = (-18469) & 19829;
        ll[129] = (-((-17511) & 19559)) & (-12305) & 15993;
        ll[130] = (103 ^ 38) ^ (127 ^ 13);
        ll[131] = 170 ^ 158;
        ll[132] = (-"   ".length()) & (-4114) & 14335;
        ll[133] = (-((-7329) & 23970)) & (-6145) & 24479;
        ll[134] = (-22561) & 23663;
        ll[135] = (((75 + 21) - (-23)) + 67) ^ (((127 + 122) - 117) + 11);
        ll[136] = 5 ^ 51;
        ll[137] = (-17) & 10234;
        ll[138] = (-((-25394) & 32639)) & (-24577) & 32479;
        ll[139] = (-((-5635) & 24387)) & (-8234) & 27627;
        ll[140] = (((141 + 17) - 78) + 90) ^ (((95 + 150) - 116) + 28);
        ll[141] = 189 ^ 133;
        ll[142] = (-((-26492) & 32639)) & (-16417) & 32759;
        ll[143] = (-10529) & 11643;
        ll[144] = (-21269) & 22423;
        ll[145] = 183 ^ 142;
        ll[146] = (((198 + 99) - 190) + 148) ^ (((166 + 54) - 160) + 137);
        ll[147] = (-18449) & 28670;
        ll[148] = (-16793) & 17851;
        ll[149] = 105 ^ 82;
        ll[150] = 62 ^ 2;
        ll[151] = (-6) & 10215;
        ll[152] = (-5301) & 5879;
        ll[153] = (-((-16773) & 21477)) & (-18433) & 24443;
        ll[154] = (-((-16591) & 28623)) & (-16425) & 32766;
        ll[155] = 37 ^ 24;
        ll[156] = 114 ^ 76;
        ll[157] = (-18434) & 28637;
        ll[158] = (-29825) & 30462;
        ll[159] = (-((-16563) & 28923)) & (-19073) & 32767;
        ll[160] = (((111 + 121) - 122) + 17) ^ (83 ^ 19);
        ll[161] = 56 ^ 120;
        ll[162] = (-(161 ^ 128)) & (-18438) & 28669;
        ll[163] = (-28699) & 30335;
        ll[164] = (-((-12301) & 28845)) & (-12297) & 29679;
        ll[165] = 37 ^ 100;
        ll[166] = 5 ^ 71;
        ll[167] = (-18433) & 28662;
        ll[168] = (-27521) & 28651;
        ll[169] = (-((-1923) & 32691)) & (-641) & 32759;
        ll[170] = 112 ^ 51;
        ll[171] = (((246 + 155) - 294) + 140) ^ (((86 + 25) - (-62)) + 6);
        ll[172] = (-((-25796) & 29903)) & (-18433) & 32767;
        ll[173] = (-16396) & 17023;
        ll[174] = 218 ^ 159;
        ll[175] = 67 ^ 5;
        ll[176] = (-((-5153) & 23597)) & (-1) & 28638;
        ll[177] = (-((-17681) & 23897)) & (-8705) & 15981;
        ll[178] = (242 ^ 131) ^ (179 ^ 133);
        ll[179] = (((149 + 163) - 139) + 36) ^ (((56 + 127) - 53) + 23);
        ll[180] = (-4136) & 14327;
        ll[181] = (-16965) & 18047;
        ll[182] = (-((-545) & 14886)) & (-129) & 16125;
        ll[183] = 46 ^ 103;
        ll[184] = (52 ^ 41) ^ (74 ^ 29);
        ll[185] = (-((-10521) & 31005)) & (-33) & 30718;
        ll[186] = (-((-1141) & 30206)) & (-1) & 30719;
        ll[187] = (-28969) & 30205;
        ll[188] = (104 ^ 123) ^ (252 ^ 164);
        ll[189] = 125 ^ 49;
        ll[190] = (-12937) & 32767;
        ll[191] = (-((-689) & 30395)) & (-2049) & 32767;
        ll[192] = (-9218) & 9853;
        ll[193] = (-((-4435) & 29555)) & (-3) & 30655;
        ll[194] = (((35 + 90) - (-34)) + 82) ^ (((2 + 109) - 67) + 144);
        ll[195] = (119 ^ 51) ^ (147 ^ 153);
        ll[196] = (-((-1025) & 7221)) & (-2) & 16383;
        ll[197] = (-22531) & 23799;
        ll[198] = (-((-79) & 25551)) & (-4105) & 30717;
        ll[199] = (((175 + 213) - 349) + 181) ^ (((53 + 38) - 39) + 95);
        ll[200] = (243 ^ 166) ^ (20 ^ 17);
        ll[201] = (-3108) & 28607;
        ll[202] = (-(((141 + 45) - 129) + 90)) & (-1025) & 28670;
        ll[203] = (-18945) & 24444;
        ll[204] = (-((-5241) & 13946)) & (-16545) & 32749;
        ll[205] = (-258) & 12237;
        ll[206] = (-(41 ^ 33)) & (-5121) & 30127;
        ll[207] = (-((-6882) & 16379)) & (-18497) & 28543;
        ll[208] = (-30738) & 31387;
        ll[209] = (-29754) & 30653;
        ll[210] = (-20993) & 22442;
        ll[211] = (-((-6037) & 30647)) & (-65) & 28527;
        ll[212] = (-((-4657) & 31283)) & (-1026) & 28671;
        ll[213] = (-5862) & 8181;
        ll[214] = (-5633) & 8182;
        ll[215] = (-((-2135) & 19575)) & (-649) & 30713;
        ll[216] = (-19973) & 32599;
        ll[217] = (-((-2181) & 20101)) & (-171) & 30719;
        ll[218] = (-1665) & 14295;
        ll[219] = (-16465) & 30964;
        ll[220] = 205 ^ 156;
        ll[221] = 35 ^ 113;
        ll[222] = 51 ^ 96;
        ll[223] = 45 ^ 121;
        ll[224] = 206 ^ 155;
        ll[225] = (((44 + 56) - (-5)) + 43) ^ (((55 + 2) - (-85)) + 52);
        ll[226] = (((21 + 109) - 67) + 189) ^ (((69 + 162) - 187) + 127);
        ll[227] = (((154 + 125) - 125) + 87) ^ (((96 + 5) - 28) + 96);
        ll[228] = (128 ^ 155) ^ (58 ^ 120);
        ll[229] = (((26 + 9) - (-96)) + 91) ^ (((130 + 103) - 160) + 59);
        ll[230] = 247 ^ 172;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    public static void w() {
        if (llIIl(G ? 1 : 0) && llIlI(Clues.e ? 1 : 0)) {
            Clues.f0c = l[ll[0]];
            h.a(H);
            if (llIll(H.size(), ll[1])) {
                System.out.println(l[ll[1]]);
                G = ll[0];
                return;
            }
        }
        if (llIlI(G ? 1 : 0)) {
            BankLocation[] bankLocationArr = new BankLocation[ll[2]];
            bankLocationArr[ll[0]] = BankLocation.VARROCK_WEST_BANK;
            bankLocationArr[ll[1]] = BankLocation.AL_KHARID_BANK;
            bankLocationArr[ll[3]] = BankLocation.CANIFIS_BANK;
            bankLocationArr[ll[4]] = BankLocation.VARROCK_EAST_BANK;
            bankLocationArr[ll[5]] = BankLocation.GRAND_EXCHANGE_BANK;
            bankLocationArr[ll[6]] = BankLocation.FALADOR_EAST_BANK;
            bankLocationArr[ll[7]] = BankLocation.FALADOR_WEST_BANK;
            bankLocationArr[ll[8]] = BankLocation.LUMBRIDGE_BANK;
            bankLocationArr[ll[9]] = BankLocation.ARDOUGNE_NORTH_BANK;
            bankLocationArr[ll[10]] = BankLocation.ARDOUGNE_SOUTH_BANK;
            bankLocationArr[ll[11]] = BankLocation.CASTLE_WARS_BANK;
            bankLocationArr[ll[12]] = BankLocation.CATHERBY_BANK;
            bankLocationArr[ll[13]] = BankLocation.DRAYNOR_BANK;
            bankLocationArr[ll[14]] = BankLocation.EDGEVILLE_BANK;
            bankLocationArr[ll[15]] = BankLocation.FEROX_ENCLAVE_BANK;
            bankLocationArr[ll[16]] = BankLocation.HOSIDIUS_BANK;
            BankLocation nearestFrom = BankLocation.getNearestFrom(bankLocationArr);
            if (llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlI(A() ? 1 : 0)) {
                WorldPoint worldPoint = new WorldPoint(ll[17], ll[18], ll[0]);
                if (lllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), ll[5])) {
                    Clues.f0c = l[ll[3]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(ll[1]);
                    "".length();
                }
                if (lllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), ll[5])) {
                    Clues.f0c = l[ll[4]];
                    String[] strArr = new String[ll[1]];
                    strArr[ll[0]] = l[ll[5]];
                    TileObjects.getNearest(strArr).interact(l[ll[6]]);
                    Time.sleepTicks(ll[5]);
                    "".length();
                }
            }
            if (((llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIlI(A() ? 1 : 0)) || llIlI(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llllI(nearestFrom) && llIlI(nearestFrom.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.f0c = l[ll[7]];
                g.a(nearestFrom);
            }
            if (llllI(nearestFrom) && llIIl(nearestFrom.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIlI(Bank.isOpen() ? 1 : 0)) {
                    g.G();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, ll[19]);
                    "".length();
                }
                if (llIIl(Bank.isOpen() ? 1 : 0)) {
                    Clues.f0c = l[ll[8]];
                    if (lllll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(ll[5]);
                        "".length();
                    }
                    if (lllll(Equipment.getAll().size())) {
                    }
                    if (llIlI(z() ? 1 : 0)) {
                        if (llIIl(Clues.e ? 1 : 0)) {
                            System.out.println(l[ll[9]]);
                            Clues.d = ll[1];
                            return;
                        }
                        B();
                        System.out.println(l[ll[10]]);
                        G = ll[1];
                    } else if (llIIl(z() ? 1 : 0)) {
                        Clues.g = ll[0];
                        Clues.j = ll[0];
                        if (llIIl(Clues.h ? 1 : 0)) {
                            g.b(m.bM, ll[3]);
                        }
                        if (llIlI(Clues.e ? 1 : 0)) {
                            g.a(ll[20], ll[11]);
                            g.a(ll[21], ll[11]);
                        }
                        if (llIIl(Clues.e ? 1 : 0)) {
                            g.a(ll[22], ll[23]);
                            g.a(ll[24], ll[25]);
                            g.a(ll[26], ll[23]);
                            g.a(ll[27], ll[23]);
                        }
                        if (llIll(Skills.getLevel(Skill.THIEVING), ll[28])) {
                            g.a(Clues.k, ll[9]);
                        }
                        if (lIIIII(Skills.getLevel(Skill.THIEVING), ll[28])) {
                            g.a(Clues.k, ll[5]);
                        }
                        Bank.withdraw(item -> {
                            if (llIIl(item.getName().contains(l[ll[228]]) ? 1 : 0) && llIIl(item.getName().contains(l[ll[229]]) ? 1 : 0)) {
                                ?? r0 = ll[1];
                                "".length();
                                return 0 != 0 ? ((29 ^ 34) ^ (211 ^ 142)) & (((51 ^ 125) ^ (60 ^ 16)) ^ (-" ".length())) : r0;
                            }
                            return ll[0];
                        }, ll[1], Bank.WithdrawMode.ITEM);
                        Time.sleepTicks(k.c(ll[4], ll[6]));
                        "".length();
                    }
                }
            }
        }
    }

    private static void lll() {
        l = new String[ll[230]];
        l[ll[0]] = lI("OCtMEKmHgxTVcC8IRgiecw==", "Zdahy");
        l[ll[1]] = lI("Er9DNFAiviGm5+iWyMn7ajX3j1HyByhKsIoj8ntBpzePV8udz2o/uO01bp7KHWp0", "gWJry");
        l[ll[3]] = ll("5WatkqJxO4hyKaDy7kO0y8FM0c1onK8lqNj7/u6HXho=", "cgiIg");
        l[ll[4]] = lI("0ITE8kwKIpN6RJDLo0Y10PvJvk1Pu3Iy", "xQEPg");
        l[ll[5]] = lIl("OxshFjUF", "wzErP");
        l[ll[6]] = lI("r+bfeZpkadgH1BEsrK47sQ==", "hqxQO");
        l[ll[7]] = lIl("Czs7RQIqei8EGC4=", "EZMev");
        l[ll[8]] = lI("EP3yhQ3deMLeFbqo2QeBfCjjvHaTZjmI", "KYXYk");
        l[ll[9]] = ll("JAMQJr4FvDnO+zqHYzFgMJSryqWZ9pr7lWubngoRNKDuRnQvOWw7kGywOajQxNGbxW35ozvG0jITSMkQheyJMaNA8RNdhvIQ", "RemqQ");
        l[ll[10]] = lI("/kb+Lj3SqgR945eLzrJzu65Xp441Aks5FJ0qioK/fO+JAcnEO6OwDJBvHpl3i9d5qQU2cYTtK88=", "BiHNn");
        l[ll[11]] = lIl("FBsOLB4xTh4xFTsd", "VnwEp");
        l[ll[12]] = lIl("LAM8GgcCDzZTFh8TOx0TRkohBB0eCToaGg1KMBIXAUomHFQJBicWBw==", "jjRst");
        l[ll[13]] = lIl("AgoucDcjSzQxJygOKnAsOR94PyVsAzk9", "LkXPC");
        l[ll[14]] = lI("2N2dHiUOtjSBfAnPNhM97BXjsRliiXz5", "IfXWf");
        l[ll[15]] = lIl("LQoyLzQT", "akVKQ");
        l[ll[16]] = lI("nuMpSNO7RmqUUf0KAxAYnQ==", "AIHUp");
        l[ll[2]] = lI("64NdtTvI6wRDi2i0eYPmPw==", "hnbbF");
        l[ll[29]] = lI("MwNypZSovl/GnlujKeR93dM5XRxyI9h9", "WNfkG");
        l[ll[30]] = lI("lCV6S1KXHFXbzjXQ6eii4jAc9l9egQC9ggNaTUDNlN42pKKD0mGjFwWMetgBlfe+bzpwf9sHPw/kCQ0vI2bNnBeHFXWdAUZYaMFkeeq7/YE=", "NbGdz");
        l[ll[31]] = lIl("NBBNIzcGVQArNhAcAyVlABkYJ2UQAB0yKQoQHm5lEAIENiYLHAMlZRcaTQAQOjwjBQ==", "cumBE");
        l[ll[32]] = ll("cgTbY1Ee/HgC1Un22ZajT5VVa41H9wfJkEv1EGeUxl4SquRKoRhHs7fbLnVcO6Jl", "HWHaH");
        l[ll[39]] = lIl("JiRXBxcUYRoPFgIoGQFFADQSFRFRMgIWFR0oEhVJUTIADxESKR4IAlE1GEYnJBg+KCI=", "qAwfe");
        l[ll[40]] = lIl("LyNhMTYdZiw5NwsvLzdkHDMkPC0WIWEjMQg2LTkhC2phIzMRMiI4LRYhYSQrWAQUCQ02AQ==", "xFAPD");
        l[ll[52]] = lI("sjM+BepfE2dCsQND5SXNb2UtnqOR1i/s5ZqeEd/d3pGdFACZBZB2Dg==", "GmYRy");
        l[ll[53]] = ll("x1IdlM/cKhBX0N/59SH2E0082uF5ism31CFqJe1lxYgW093HltEtZ30V9Ygrv46/", "QYCeI");
        l[ll[57]] = lI("RERjqu6M5fMKK2otE26tZ0Hc/q59MO9Q8aVztCMSeRtXg0wI1IGKSA==", "znqgy");
        l[ll[58]] = lI("KlmseY2sVt3RWRzqx4IJkH6n8So1i+G++DislZewWrz1G1bQvqqCHVAhKfXmwGZo", "wfKti");
        l[ll[63]] = ll("QLd+tAAmlMRPFgt0V7rpaqOnnUsC5KMbApqlGS5Zr3kb/uGFTv580Q==", "PYAlY");
        l[ll[64]] = lI("l/9DeEYQztU7OlDP4gSyQXKFFFikDBHr73KYSjCSNGzrnCqeYPg0mIJpW3a3JoO8", "xjbLF");
        l[ll[69]] = lI("0bnEUY4E4Zapng8rKM9nDuoCpaKoHccLhcfMhtloLdB5BqmJ6lQfew==", "PJeIR");
        l[ll[70]] = ll("q5P8RxCFq8+cRQmz5QoPCuN93KMrd3NJGieURAgbaPf9lxsBWK69MYoShd00T2sm", "wgzGE");
        l[ll[75]] = ll("Z8XbMU2oTfULfIyMnDbKkw/4hfqgjr/PrHdnLBn/QtwXmIUwoluugw==", "kqXfa");
        l[ll[76]] = ll("vIQ8OPXbOLP4qQjMMWrkVLzd8QW261yFnNkEke+A/tVmyI02z1cNDUEG1qFCiYpB", "qMGhP");
        l[ll[81]] = ll("JlAX4HDSNVgARbqhGJX74+9iG77LJbht4cFKWBg6wdZ/vSYPjJNiRw==", "eqYGY");
        l[ll[82]] = ll("zjr9Q+5gfzFiHXk2BtLhKwIrAHndZLJ1HeLpB0ldVAg3AfUH8ZnH8dI7SWQgpEtU", "lwGPG");
        l[ll[87]] = lI("eI/RWXUhcDUSc9ucziyAfbmQeyd1c60WZfZmzc6whE06efa1Tycv7Q==", "yZfTD");
        l[ll[88]] = ll("I2wzBfyb9yvsfSDb44bKV+8nBkR/LU5SqGMh7FK4+x+c/V1FRRyTyfBQrZqEZO7I", "SgaEN");
        l[ll[92]] = ll("pG+j3D5s8U/+nDnDYqYYhnJjHnJ/XpyINe25h0siXiGZwAQLmVSEFg==", "qoQGH");
        l[ll[93]] = lIl("Ahx4DyAwWTUHISYQNglyJgwoHj48HCtCciYOMRoxPRA2CXIhFngsBwwwFik=", "UyXnR");
        l[ll[98]] = ll("8/mnm5aGCXhSgKninbIAQSzCbUaMECVVKVWL+s+ni5diUk38X1cX9w==", "kBpBH");
        l[ll[99]] = ll("ObuVfqweErkyOWyCNlx8ykn+XULWeu28dsoBEM0pM4LwyHM8+E127w8aHpVHM8NX", "fCZnc");
        l[ll[103]] = lI("VZR6QYSdKdzCnqxyDb2IOhxOwhWsiNqiV4yIhE4hqgpNKaLve7Dc0g==", "QpnVt");
        l[ll[104]] = lIl("HBxFIzAuWQgrMTgQCyViOAwVMi4iHBZuYjgODDYhIxALJWI/FkUAFxIwKwU=", "KyeBB");
        l[ll[109]] = ll("kQS9xBqu/3LJNWGI5yfQ7X64p1e8Tp2C+17m1U0w9od5CKCYFcVBXQ==", "sPztk");
        l[ll[110]] = lIl("IxNzGAgRVj4QCQcfPR5aBwMjCRYdEyBVWgcBOg0ZHB89HloAGXM7Ly0/HT4=", "tvSyz");
        l[ll[115]] = lIl("CwQ/PjkoCmwuPDMIbCg9KRkpbTkyCCE+fGYIIik5KApsPjM0BDw5", "FmLMP");
        l[ll[116]] = lIl("HTZjOzUvcy4zNDk6LT1nOSYzKisjNjB2ZzkkKi4kIjotPWc+PGMYEhMaDR0=", "JSCZG");
        l[ll[121]] = lIl("NBkgFBgXF3MEHQwVcwIcFgQ2RxgNFT4UXVkVPQMYFxdzFBILGSMT", "ypSgq");
        l[ll[122]] = ll("644UdpzenpttKqNIObhR2MCi1O2BTQfPgPrQQA7yp2Chvc3EFOE5MQ+RsYgpdFfC", "vkjis");
        l[ll[126]] = ll("WvT5sbg0sQYsUotZ1QcIVRmYFdTRabdRvdDT2ub6Zm9EnqWG0zFRjA==", "FVjng");
        l[ll[28]] = ll("J4n8NVpQ7xLezm5SdtYBWOvUj1rLnrQ8LG8Y64Tg2h0/iLhU36NtjAG2A1bogv3m", "VKUDL");
        l[ll[130]] = lIl("ISQ/GAgCKmwIDRkobA4MAzkpSwgYKCEYTUwoIg8IAipsGAIeJDwf", "lMLka");
        l[ll[131]] = lI("wGPHDOKAzLkUNI/3w1YFlRLE2VlYctqZJOR1b12sClNPK6KF0qeu6xuov9/pxPzE", "vOhKM");
        l[ll[135]] = lI("GjazLMwp/4XBPTKGgvtIpPzYIpOmBNLM37UmO0MUm/RejBE7MLgi5Q==", "CBjYO");
        l[ll[136]] = lIl("Lwt5Jj8dTjQuPgsHNyBtCxspNyERCyprbQsZMDMuEAc3IG0MAXkFGCEnFwA=", "xnYGM");
        l[ll[140]] = lIl("OgEqOzAZD3krNQINeS00GBw8aDADDTQ7dVcNNywwGQ95OzoFASk8", "whYHY");
        l[ll[141]] = ll("0abGZeZsY8q6DBurC95nbKyGldiqshGeJ2kirZHHIRF43oFg2HOrHuJCotQwZi0i", "kmtGC");
        l[ll[145]] = lI("wBcArRMb+YToCGb3rvJlIR9jXBM3kicAuC/824BLLECQlkY9pc+UfA==", "UoUjV");
        l[ll[146]] = ll("+nUR3OeUEuhk34NSfUCcY5tLTPnRets0NL8/hgcHf8s79hMHBM40xVUQ7HQy62ay", "dUeDu");
        l[ll[149]] = lIl("DgI6HTEtDGkNNDYOaQs1LB8sTjE3DiQddGMOJwoxLQxpHTsxAjka", "CkInX");
        l[ll[150]] = lI("KKSJxkDa+llyBJN+Lqz9GqgVtaOcFPi7sE19Sk71EaHo8z7/+U/Vibv3EDeZ+9ZC", "LETxC");
        l[ll[155]] = ll("w1HQZKLB96LI6uCRpQHRGJeE5vPUgIdZjZdktus3OWZ24TZaS1FEgQ==", "StHcS");
        l[ll[156]] = lI("10vdK+WzvCfrJw7k+tf2L9htq74LzdUlCk9bDwSONSW5fqGQFVQTPvvDAbffl7Jk", "LoVCm");
        l[ll[160]] = lIl("FR8bGAE2EUgIBC0TSA4FNwINSwEsEwUYRHgTBg8BNhFIGAsqHxgf", "Xvhkh");
        l[ll[161]] = lIl("Bw14OTA1SDUxMSMBNj9iIx0oKC45DSt0YiMfMSwhOAE2P2IkB3gaFwkhFh8=", "PhXXB");
        l[ll[165]] = lI("ZWx2cbhJ2lgOPxBbN2+W929u1jCgcv3V54SaTCCNoZc6AojiNXr7Ug==", "bbpSr");
        l[ll[166]] = ll("hPhDiaK6yOAt8+SGAAqWVMXvzcPkqHWJcZmEipEwi/Z7V0G8pZWPjVCumh+OMroF", "MeFxg");
        l[ll[170]] = lI("OChT7tUjjrWjgZ5lUDzwBVDZ5w2+TAFV6bAHl0NtL23ch03PHVN4Iw==", "Zlfwd");
        l[ll[171]] = lIl("HiRWDScsYRsFJjooGAt1OjQGHDkgJAVAdTo2Hxg2ISgYC3U9LlYuABAIOCs=", "IAvlU");
        l[ll[174]] = ll("JJtXCfSs+qRy/QNNoEC5Uh1ApcLX7ysm5XCNDL6JZ97AnYDgl8F2og==", "IUqBx");
        l[ll[175]] = ll("k63LwRE/PzSC7CT4jRvufsCrFbU/kyWNvOXAqp0U2tMiQtmpH9VrSntjWIboelkX", "AAkfJ");
        l[ll[178]] = lIl("Jz0KOAsEM1koDh8xWS4PBSAcawseMRQ4TkoxFy8LBDNZOAEYPQk/", "jTyKb");
        l[ll[179]] = lIl("FihDDx0kbQ4HHDIkDQlPMjgTHgMoKBBCTzI6ChoMKSQNCU81IkMsOhgELSk=", "AMcno");
        l[ll[183]] = ll("34TcUFhluURaN/i0l9q+sS8CvVnzMyP49OhTlhSDvE9Oo3IFPtAvqA==", "qmbqb");
        l[ll[184]] = lI("HMS1vAMiXLi8FQLJ1RiHbI3//NftNmg6jb2QpgQWEgO1G7bAZnmV+h75TdI7L311", "NBVVi");
        l[ll[188]] = lIl("BicqJDElKXk0ND4reTI1JDo8dzE/KzQkdGsrNzMxJSl5JDs5Jykj", "KNYWX");
        l[ll[189]] = ll("G3CYmRCVLS8HA24cIPj8sC8bWECV2fhu26nLOgBh7ZDOzFf2nikwYYdTIcCNStR8", "hhpOF");
        l[ll[194]] = lI("flQ2wZbgbTs9aOyw2+pj8A504QewmznPGgDWyaII8tUJPyUUATd+hg==", "QucAc");
        l[ll[195]] = ll("0gvk12lcuDDXEc5EY25v1NrZanXAR4dsV7EiHNMkZUUSK/rLAtUvwB80F/cET4yU", "rAEBw");
        l[ll[199]] = ll("JJXwbA99RbZnxI5UFjXSo2sRbrTtIibxrMsvZVrlZfLGMie90uH/ng==", "OrIeX");
        l[ll[200]] = ll("Zj4M0Q6hSQLbARaUeYv52w5MAKYQP52euhW1+oZz5eelqhsYJLvsGqb3FPLmiQWi", "dxrsI");
        l[ll[220]] = lIl("IgAiKyUfFQ==", "qtCFL");
        l[ll[221]] = ll("tFqQ8tjLxjE=", "Oscam");
        l[ll[222]] = lI("er5EtdXc/iE=", "kMLTd");
        l[ll[223]] = lIl("EQAKL0EMD0Q/BAIFECBBSw==", "cidHa");
        l[ll[224]] = ll("5AS+kYSvZw9HW3GuEoWTsA==", "uwZHi");
        l[ll[225]] = ll("kvMsGEJf61U=", "JMQHn");
        l[ll[226]] = lI("hY4+nIWqybw=", "cARgA");
        l[ll[227]] = ll("f/vCc+FiF5E=", "yXzfR");
        l[ll[228]] = lI("c7Z0Ro7txftzzJRburcPkg==", "mECbm");
        l[ll[229]] = lI("2yyAsww7qJc=", "mOcHJ");
    }

    private static boolean llIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[24];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[27];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d1, code lost:
        if (llIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[21];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[24];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010b, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0128, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012b, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[47];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0145, code lost:
        if (llIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0148, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[42];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0162, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0165, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[24];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017f, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0182, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019c, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019f, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[47];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01b9, code lost:
        if (llIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01bc, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[43];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d6, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d9, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[24];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01f3, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f6, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0210, code lost:
        if (llIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0213, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[41];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x022d, code lost:
        if (llIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0230, code lost:
        r0 = new int[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[3]];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0]] = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[46];
        r0[c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1]] = net.unethicalite.plugins.logout.Clues.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0254, code lost:
        if (llIIl(c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.k.c(r0) ? 1 : 0) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0257, code lost:
        r0 = c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[1];
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0263, code lost:
        if (0 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0277, code lost:
        return (true ^ true) & ((true ^ true) ^ true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x027d, code lost:
        return c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
        if (llIlI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean y() {
        if (!llIIl(Clues.e ? 1 : 0)) {
            int[] iArr = new int[ll[8]];
            iArr[ll[0]] = ll[20];
            iArr[ll[1]] = ll[41];
            iArr[ll[3]] = ll[43];
            iArr[ll[4]] = ll[42];
            iArr[ll[5]] = ll[21];
            iArr[ll[6]] = ll[46];
            iArr[ll[7]] = Clues.k;
            return k.c(iArr);
        }
        int[] iArr2 = new int[ll[1]];
        iArr2[ll[0]] = ll[24];
        if (llIIl(Bank.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[ll[1]];
            iArr3[ll[0]] = ll[26];
            if (llIIl(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[ll[1]];
                iArr4[ll[0]] = ll[22];
            }
        }
        int[] iArr5 = new int[ll[1]];
        iArr5[ll[0]] = ll[20];
    }

    static boolean z() {
        if (!llIIl(Clues.e ? 1 : 0)) {
            int[] iArr = new int[ll[4]];
            iArr[ll[0]] = ll[20];
            iArr[ll[1]] = ll[21];
            iArr[ll[3]] = Clues.k;
            return k.c(iArr);
        }
        int[] iArr2 = new int[ll[7]];
        iArr2[ll[0]] = ll[24];
        iArr2[ll[1]] = ll[26];
        iArr2[ll[3]] = ll[27];
        iArr2[ll[4]] = ll[47];
        iArr2[ll[5]] = ll[47];
        iArr2[ll[6]] = Clues.k;
        return k.c(iArr2);
    }

    private static boolean llIlI(int i) {
        return i == 0;
    }

    static {
        lIlII();
        lll();
        H = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0096, code lost:
        if (lIIIII(net.unethicalite.api.items.Inventory.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[4]) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A() {
        int[] iArr = new int[ll[1]];
        iArr[ll[0]] = ll[20];
        if (llIlI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[ll[1]];
            iArr2[ll[0]] = ll[24];
            if (llIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[ll[1]];
                iArr3[ll[0]] = ll[22];
                if (llIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[ll[1]];
                    iArr4[ll[0]] = ll[26];
                    if (llIIl(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[ll[1]];
                        iArr5[ll[0]] = ll[26];
                    }
                }
            }
            return ll[0];
        }
        ?? r0 = ll[1];
        "".length();
        return "  ".length() >= ((20 ^ 125) ^ (116 ^ 25)) ? ((((126 + 94) - 185) + 116) ^ (((105 + 61) - (-3)) + 12)) & (((((30 + 83) - 96) + 142) ^ (((181 + 97) - 163) + 74)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:329:0x1f54, code lost:
        if (llIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[16]) != false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x1fe5, code lost:
        if (llIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[70]) != false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x2286, code lost:
        if (llIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[70]) != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x2310, code lost:
        if (llIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[70]) != false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x23a4, code lost:
        if (llIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[70]) != false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x242e, code lost:
        if (llIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002.e.ll[70]) != false) goto L409;
     */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1fa5  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x2027  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x205f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x2096  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x216e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x2246  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x22d0  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x2364  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x23ee  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x2464  */
    /* JADX WARN: Removed duplicated region for block: B:413:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void B() {
        int[] iArr;
        List all;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[ll[1]];
        iArr7[ll[0]] = ll[196];
        if (llIIl(Inventory.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[ll[1]];
            iArr8[ll[0]] = ll[96];
            if (llIlI(Bank.contains(iArr8) ? 1 : 0)) {
                H.add(new j(ll[96], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr9 = new int[ll[1]];
            iArr9[ll[0]] = ll[197];
            if (llIlI(Bank.contains(iArr9) ? 1 : 0)) {
                H.add(new j(ll[197], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr10 = new int[ll[1]];
            iArr10[ll[0]] = ll[198];
            if (llIlI(Bank.contains(iArr10) ? 1 : 0)) {
                H.add(new j(ll[198], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr11 = new int[ll[1]];
        iArr11[ll[0]] = ll[190];
        if (llIIl(Inventory.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[ll[1]];
            iArr12[ll[0]] = ll[191];
            if (llIlI(Bank.contains(iArr12) ? 1 : 0)) {
                H.add(new j(ll[191], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr13 = new int[ll[1]];
            iArr13[ll[0]] = ll[192];
            if (llIlI(Bank.contains(iArr13) ? 1 : 0)) {
                H.add(new j(ll[192], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr14 = new int[ll[1]];
            iArr14[ll[0]] = ll[193];
            if (llIlI(Bank.contains(iArr14) ? 1 : 0)) {
                H.add(new j(ll[193], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr15 = new int[ll[1]];
        iArr15[ll[0]] = ll[185];
        if (llIIl(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[ll[1]];
            iArr16[ll[0]] = ll[186];
            if (llIlI(Bank.contains(iArr16) ? 1 : 0)) {
                H.add(new j(ll[186], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr17 = new int[ll[1]];
            iArr17[ll[0]] = ll[79];
            if (llIlI(Bank.contains(iArr17) ? 1 : 0)) {
                H.add(new j(ll[79], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr18 = new int[ll[1]];
            iArr18[ll[0]] = ll[187];
            if (llIlI(Bank.contains(iArr18) ? 1 : 0)) {
                H.add(new j(ll[187], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr19 = new int[ll[1]];
        iArr19[ll[0]] = ll[180];
        if (llIIl(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[ll[1]];
            iArr20[ll[0]] = ll[91];
            if (llIlI(Bank.contains(iArr20) ? 1 : 0)) {
                H.add(new j(ll[91], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr21 = new int[ll[1]];
            iArr21[ll[0]] = ll[181];
            if (llIlI(Bank.contains(iArr21) ? 1 : 0)) {
                H.add(new j(ll[181], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr22 = new int[ll[1]];
            iArr22[ll[0]] = ll[182];
            if (llIlI(Bank.contains(iArr22) ? 1 : 0)) {
                H.add(new j(ll[182], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr23 = new int[ll[1]];
        iArr23[ll[0]] = ll[176];
        if (llIIl(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[ll[1]];
            iArr24[ll[0]] = ll[112];
            if (llIlI(Bank.contains(iArr24) ? 1 : 0)) {
                H.add(new j(ll[112], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr25 = new int[ll[1]];
            iArr25[ll[0]] = ll[177];
            if (llIlI(Bank.contains(iArr25) ? 1 : 0)) {
                H.add(new j(ll[177], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr26 = new int[ll[1]];
            iArr26[ll[0]] = ll[148];
            if (llIlI(Bank.contains(iArr26) ? 1 : 0)) {
                H.add(new j(ll[148], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr27 = new int[ll[1]];
        iArr27[ll[0]] = ll[172];
        if (llIIl(Inventory.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[ll[1]];
            iArr28[ll[0]] = ll[62];
            if (llIlI(Bank.contains(iArr28) ? 1 : 0)) {
                H.add(new j(ll[62], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr29 = new int[ll[1]];
            iArr29[ll[0]] = ll[173];
            if (llIlI(Bank.contains(iArr29) ? 1 : 0)) {
                H.add(new j(ll[173], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr30 = new int[ll[1]];
            iArr30[ll[0]] = ll[148];
            if (llIlI(Bank.contains(iArr30) ? 1 : 0)) {
                H.add(new j(ll[148], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr31 = new int[ll[1]];
        iArr31[ll[0]] = ll[167];
        if (llIIl(Inventory.contains(iArr31) ? 1 : 0)) {
            int[] iArr32 = new int[ll[1]];
            iArr32[ll[0]] = ll[168];
            if (llIlI(Bank.contains(iArr32) ? 1 : 0)) {
                H.add(new j(ll[168], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr33 = new int[ll[1]];
            iArr33[ll[0]] = ll[73];
            if (llIlI(Bank.contains(iArr33) ? 1 : 0)) {
                H.add(new j(ll[73], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr34 = new int[ll[1]];
            iArr34[ll[0]] = ll[73];
            if (llIlI(Bank.contains(iArr34) ? 1 : 0)) {
                H.add(new j(ll[73], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr35 = new int[ll[1]];
        iArr35[ll[0]] = ll[162];
        if (llIIl(Inventory.contains(iArr35) ? 1 : 0)) {
            int[] iArr36 = new int[ll[1]];
            iArr36[ll[0]] = ll[90];
            if (llIlI(Bank.contains(iArr36) ? 1 : 0)) {
                H.add(new j(ll[90], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr37 = new int[ll[1]];
            iArr37[ll[0]] = ll[163];
            if (llIlI(Bank.contains(iArr37) ? 1 : 0)) {
                H.add(new j(ll[163], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr38 = new int[ll[1]];
            iArr38[ll[0]] = ll[164];
            if (llIlI(Bank.contains(iArr38) ? 1 : 0)) {
                H.add(new j(ll[164], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr39 = new int[ll[1]];
        iArr39[ll[0]] = ll[157];
        if (llIIl(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[ll[1]];
            iArr40[ll[0]] = ll[158];
            if (llIlI(Bank.contains(iArr40) ? 1 : 0)) {
                H.add(new j(ll[158], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr41 = new int[ll[1]];
            iArr41[ll[0]] = ll[50];
            if (llIlI(Bank.contains(iArr41) ? 1 : 0)) {
                H.add(new j(ll[50], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr42 = new int[ll[1]];
            iArr42[ll[0]] = ll[159];
            if (llIlI(Bank.contains(iArr42) ? 1 : 0)) {
                H.add(new j(ll[159], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr43 = new int[ll[1]];
        iArr43[ll[0]] = ll[151];
        if (llIIl(Inventory.contains(iArr43) ? 1 : 0)) {
            int[] iArr44 = new int[ll[1]];
            iArr44[ll[0]] = ll[152];
            if (llIlI(Bank.contains(iArr44) ? 1 : 0)) {
                H.add(new j(ll[152], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr45 = new int[ll[1]];
            iArr45[ll[0]] = ll[153];
            if (llIlI(Bank.contains(iArr45) ? 1 : 0)) {
                H.add(new j(ll[153], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr46 = new int[ll[1]];
            iArr46[ll[0]] = ll[154];
            if (llIlI(Bank.contains(iArr46) ? 1 : 0)) {
                H.add(new j(ll[154], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr47 = new int[ll[1]];
        iArr47[ll[0]] = ll[147];
        if (llIIl(Inventory.contains(iArr47) ? 1 : 0)) {
            int[] iArr48 = new int[ll[1]];
            iArr48[ll[0]] = ll[143];
            if (llIlI(Bank.contains(iArr48) ? 1 : 0)) {
                H.add(new j(ll[143], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr49 = new int[ll[1]];
            iArr49[ll[0]] = ll[91];
            if (llIlI(Bank.contains(iArr49) ? 1 : 0)) {
                H.add(new j(ll[91], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr50 = new int[ll[1]];
            iArr50[ll[0]] = ll[148];
            if (llIlI(Bank.contains(iArr50) ? 1 : 0)) {
                H.add(new j(ll[148], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr51 = new int[ll[1]];
        iArr51[ll[0]] = ll[142];
        if (llIIl(Inventory.contains(iArr51) ? 1 : 0)) {
            int[] iArr52 = new int[ll[1]];
            iArr52[ll[0]] = ll[143];
            if (llIlI(Bank.contains(iArr52) ? 1 : 0)) {
                H.add(new j(ll[143], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr53 = new int[ll[1]];
            iArr53[ll[0]] = ll[124];
            if (llIlI(Bank.contains(iArr53) ? 1 : 0)) {
                H.add(new j(ll[124], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr54 = new int[ll[1]];
            iArr54[ll[0]] = ll[144];
            if (llIlI(Bank.contains(iArr54) ? 1 : 0)) {
                H.add(new j(ll[144], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr55 = new int[ll[1]];
        iArr55[ll[0]] = ll[137];
        if (llIIl(Inventory.contains(iArr55) ? 1 : 0)) {
            int[] iArr56 = new int[ll[1]];
            iArr56[ll[0]] = ll[138];
            if (llIlI(Bank.contains(iArr56) ? 1 : 0)) {
                H.add(new j(ll[138], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr57 = new int[ll[1]];
            iArr57[ll[0]] = ll[139];
            if (llIlI(Bank.contains(iArr57) ? 1 : 0)) {
                H.add(new j(ll[139], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr58 = new int[ll[1]];
            iArr58[ll[0]] = ll[73];
            if (llIlI(Bank.contains(iArr58) ? 1 : 0)) {
                H.add(new j(ll[73], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr59 = new int[ll[1]];
        iArr59[ll[0]] = ll[127];
        if (llIIl(Inventory.contains(iArr59) ? 1 : 0)) {
            int[] iArr60 = new int[ll[1]];
            iArr60[ll[0]] = ll[128];
            if (llIlI(Bank.contains(iArr60) ? 1 : 0)) {
                H.add(new j(ll[128], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr61 = new int[ll[1]];
            iArr61[ll[0]] = ll[91];
            if (llIlI(Bank.contains(iArr61) ? 1 : 0)) {
                H.add(new j(ll[91], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr62 = new int[ll[1]];
            iArr62[ll[0]] = ll[129];
            if (llIlI(Bank.contains(iArr62) ? 1 : 0)) {
                H.add(new j(ll[129], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr63 = new int[ll[1]];
        iArr63[ll[0]] = ll[123];
        if (llIIl(Inventory.contains(iArr63) ? 1 : 0)) {
            int[] iArr64 = new int[ll[1]];
            iArr64[ll[0]] = ll[124];
            if (llIlI(Bank.contains(iArr64) ? 1 : 0)) {
                H.add(new j(ll[124], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr65 = new int[ll[1]];
            iArr65[ll[0]] = ll[86];
            if (llIlI(Bank.contains(iArr65) ? 1 : 0)) {
                H.add(new j(ll[86], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr66 = new int[ll[1]];
            iArr66[ll[0]] = ll[125];
            if (llIlI(Bank.contains(iArr66) ? 1 : 0)) {
                H.add(new j(ll[125], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr67 = new int[ll[1]];
        iArr67[ll[0]] = ll[117];
        if (llIIl(Inventory.contains(iArr67) ? 1 : 0)) {
            int[] iArr68 = new int[ll[1]];
            iArr68[ll[0]] = ll[118];
            if (llIlI(Bank.contains(iArr68) ? 1 : 0)) {
                H.add(new j(ll[118], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr69 = new int[ll[1]];
            iArr69[ll[0]] = ll[119];
            if (llIlI(Bank.contains(iArr69) ? 1 : 0)) {
                H.add(new j(ll[119], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr70 = new int[ll[1]];
            iArr70[ll[0]] = ll[120];
            if (llIlI(Bank.contains(iArr70) ? 1 : 0)) {
                H.add(new j(ll[120], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr71 = new int[ll[1]];
        iArr71[ll[0]] = ll[111];
        if (llIIl(Inventory.contains(iArr71) ? 1 : 0)) {
            int[] iArr72 = new int[ll[1]];
            iArr72[ll[0]] = ll[112];
            if (llIlI(Bank.contains(iArr72) ? 1 : 0)) {
                H.add(new j(ll[112], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr73 = new int[ll[1]];
            iArr73[ll[0]] = ll[113];
            if (llIlI(Bank.contains(iArr73) ? 1 : 0)) {
                H.add(new j(ll[113], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr74 = new int[ll[1]];
            iArr74[ll[0]] = ll[114];
            if (llIlI(Bank.contains(iArr74) ? 1 : 0)) {
                H.add(new j(ll[114], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr75 = new int[ll[1]];
        iArr75[ll[0]] = ll[105];
        if (llIIl(Inventory.contains(iArr75) ? 1 : 0)) {
            int[] iArr76 = new int[ll[1]];
            iArr76[ll[0]] = ll[106];
            if (llIlI(Bank.contains(iArr76) ? 1 : 0)) {
                H.add(new j(ll[106], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr77 = new int[ll[1]];
            iArr77[ll[0]] = ll[107];
            if (llIlI(Bank.contains(iArr77) ? 1 : 0)) {
                H.add(new j(ll[107], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr78 = new int[ll[1]];
            iArr78[ll[0]] = ll[108];
            if (llIlI(Bank.contains(iArr78) ? 1 : 0)) {
                H.add(new j(ll[108], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr79 = new int[ll[1]];
        iArr79[ll[0]] = ll[94];
        if (llIIl(Inventory.contains(iArr79) ? 1 : 0)) {
            int[] iArr80 = new int[ll[1]];
            iArr80[ll[0]] = ll[95];
            if (llIlI(Bank.contains(iArr80) ? 1 : 0)) {
                H.add(new j(ll[95], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr81 = new int[ll[1]];
            iArr81[ll[0]] = ll[96];
            if (llIlI(Bank.contains(iArr81) ? 1 : 0)) {
                H.add(new j(ll[96], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr82 = new int[ll[1]];
            iArr82[ll[0]] = ll[97];
            if (llIlI(Bank.contains(iArr82) ? 1 : 0)) {
                H.add(new j(ll[97], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr83 = new int[ll[1]];
        iArr83[ll[0]] = ll[89];
        if (llIIl(Inventory.contains(iArr83) ? 1 : 0)) {
            int[] iArr84 = new int[ll[1]];
            iArr84[ll[0]] = ll[90];
            if (llIlI(Bank.contains(iArr84) ? 1 : 0)) {
                H.add(new j(ll[90], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr85 = new int[ll[1]];
            iArr85[ll[0]] = ll[73];
            if (llIlI(Bank.contains(iArr85) ? 1 : 0)) {
                H.add(new j(ll[73], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr86 = new int[ll[1]];
            iArr86[ll[0]] = ll[91];
            if (llIlI(Bank.contains(iArr86) ? 1 : 0)) {
                H.add(new j(ll[91], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr87 = new int[ll[1]];
        iArr87[ll[0]] = ll[83];
        if (llIIl(Inventory.contains(iArr87) ? 1 : 0)) {
            int[] iArr88 = new int[ll[1]];
            iArr88[ll[0]] = ll[84];
            if (llIlI(Bank.contains(iArr88) ? 1 : 0)) {
                H.add(new j(ll[84], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr89 = new int[ll[1]];
            iArr89[ll[0]] = ll[85];
            if (llIlI(Bank.contains(iArr89) ? 1 : 0)) {
                H.add(new j(ll[85], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr90 = new int[ll[1]];
            iArr90[ll[0]] = ll[86];
            if (llIlI(Bank.contains(iArr90) ? 1 : 0)) {
                H.add(new j(ll[86], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr91 = new int[ll[1]];
        iArr91[ll[0]] = ll[100];
        if (llIIl(Inventory.contains(iArr91) ? 1 : 0)) {
            int[] iArr92 = new int[ll[1]];
            iArr92[ll[0]] = ll[101];
            if (llIlI(Bank.contains(iArr92) ? 1 : 0)) {
                H.add(new j(ll[101], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr93 = new int[ll[1]];
            iArr93[ll[0]] = ll[102];
            if (llIlI(Bank.contains(iArr93) ? 1 : 0)) {
                H.add(new j(ll[102], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr94 = new int[ll[1]];
        iArr94[ll[0]] = ll[77];
        if (llIIl(Inventory.contains(iArr94) ? 1 : 0)) {
            int[] iArr95 = new int[ll[1]];
            iArr95[ll[0]] = ll[78];
            if (llIlI(Bank.contains(iArr95) ? 1 : 0)) {
                H.add(new j(ll[78], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr96 = new int[ll[1]];
            iArr96[ll[0]] = ll[79];
            if (llIlI(Bank.contains(iArr96) ? 1 : 0)) {
                H.add(new j(ll[79], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr97 = new int[ll[1]];
            iArr97[ll[0]] = ll[80];
            if (llIlI(Bank.contains(iArr97) ? 1 : 0)) {
                H.add(new j(ll[80], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr98 = new int[ll[1]];
        iArr98[ll[0]] = ll[71];
        if (llIIl(Inventory.contains(iArr98) ? 1 : 0)) {
            int[] iArr99 = new int[ll[1]];
            iArr99[ll[0]] = ll[72];
            if (llIlI(Bank.contains(iArr99) ? 1 : 0)) {
                H.add(new j(ll[72], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr100 = new int[ll[1]];
            iArr100[ll[0]] = ll[73];
            if (llIlI(Bank.contains(iArr100) ? 1 : 0)) {
                H.add(new j(ll[73], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr101 = new int[ll[1]];
            iArr101[ll[0]] = ll[74];
            if (llIlI(Bank.contains(iArr101) ? 1 : 0)) {
                H.add(new j(ll[74], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr102 = new int[ll[1]];
        iArr102[ll[0]] = ll[65];
        if (llIIl(Inventory.contains(iArr102) ? 1 : 0)) {
            int[] iArr103 = new int[ll[1]];
            iArr103[ll[0]] = ll[66];
            if (llIlI(Bank.contains(iArr103) ? 1 : 0)) {
                H.add(new j(ll[66], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr104 = new int[ll[1]];
            iArr104[ll[0]] = ll[67];
            if (llIlI(Bank.contains(iArr104) ? 1 : 0)) {
                H.add(new j(ll[67], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr105 = new int[ll[1]];
            iArr105[ll[0]] = ll[68];
            if (llIlI(Bank.contains(iArr105) ? 1 : 0)) {
                H.add(new j(ll[68], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr106 = new int[ll[1]];
        iArr106[ll[0]] = ll[59];
        if (llIIl(Inventory.contains(iArr106) ? 1 : 0)) {
            int[] iArr107 = new int[ll[1]];
            iArr107[ll[0]] = ll[60];
            if (llIlI(Bank.contains(iArr107) ? 1 : 0)) {
                H.add(new j(ll[60], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr108 = new int[ll[1]];
            iArr108[ll[0]] = ll[61];
            if (llIlI(Bank.contains(iArr108) ? 1 : 0)) {
                H.add(new j(ll[61], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr109 = new int[ll[1]];
            iArr109[ll[0]] = ll[62];
            if (llIlI(Bank.contains(iArr109) ? 1 : 0)) {
                H.add(new j(ll[62], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr110 = new int[ll[1]];
        iArr110[ll[0]] = ll[54];
        if (llIIl(Inventory.contains(iArr110) ? 1 : 0)) {
            int[] iArr111 = new int[ll[1]];
            iArr111[ll[0]] = ll[49];
            if (llIlI(Bank.contains(iArr111) ? 1 : 0)) {
                H.add(new j(ll[49], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr112 = new int[ll[1]];
            iArr112[ll[0]] = ll[55];
            if (llIlI(Bank.contains(iArr112) ? 1 : 0)) {
                H.add(new j(ll[55], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr113 = new int[ll[1]];
            iArr113[ll[0]] = ll[56];
            if (llIlI(Bank.contains(iArr113) ? 1 : 0)) {
                H.add(new j(ll[56], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr114 = new int[ll[1]];
        iArr114[ll[0]] = ll[48];
        if (llIIl(Inventory.contains(iArr114) ? 1 : 0)) {
            int[] iArr115 = new int[ll[1]];
            iArr115[ll[0]] = ll[51];
            if (llIlI(Bank.contains(iArr115) ? 1 : 0)) {
                H.add(new j(ll[51], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr116 = new int[ll[1]];
            iArr116[ll[0]] = ll[49];
            if (llIlI(Bank.contains(iArr116) ? 1 : 0)) {
                H.add(new j(ll[49], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr117 = new int[ll[1]];
            iArr117[ll[0]] = ll[50];
            if (llIlI(Bank.contains(iArr117) ? 1 : 0)) {
                H.add(new j(ll[50], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr118 = new int[ll[1]];
        iArr118[ll[0]] = ll[132];
        if (llIIl(Inventory.contains(iArr118) ? 1 : 0)) {
            int[] iArr119 = new int[ll[1]];
            iArr119[ll[0]] = ll[61];
            if (llIlI(Bank.contains(iArr119) ? 1 : 0)) {
                H.add(new j(ll[61], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr120 = new int[ll[1]];
            iArr120[ll[0]] = ll[133];
            if (llIlI(Bank.contains(iArr120) ? 1 : 0)) {
                H.add(new j(ll[133], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
            int[] iArr121 = new int[ll[1]];
            iArr121[ll[0]] = ll[134];
            if (llIlI(Bank.contains(iArr121) ? 1 : 0)) {
                H.add(new j(ll[134], ll[1], k.c(ll[201], ll[202])));
                "".length();
            }
        }
        int[] iArr122 = new int[ll[1]];
        iArr122[ll[0]] = ll[46];
        if (llIlI(Bank.contains(iArr122) ? 1 : 0)) {
            H.add(new j(ll[46], ll[1], k.c(ll[203], ll[204])));
            "".length();
        }
        if (llIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(l[ll[223]]);
        }) ? 1 : 0)) {
            H.add(new j(ll[205], ll[6], ll[206]));
            "".length();
        }
        int[] iArr123 = new int[ll[1]];
        iArr123[ll[0]] = Clues.k;
        if (llIIl(Bank.contains(iArr123) ? 1 : 0)) {
            int[] iArr124 = new int[ll[1]];
            iArr124[ll[0]] = Clues.k;
            if (llIIl(Bank.contains(iArr124) ? 1 : 0)) {
                int[] iArr125 = new int[ll[1]];
                iArr125[ll[0]] = Clues.k;
            }
            iArr = new int[ll[1]];
            iArr[ll[0]] = ll[20];
            if (llIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr126 = new int[ll[1]];
                iArr126[ll[0]] = ll[20];
                if (llIIl(Bank.contains(iArr126) ? 1 : 0)) {
                    int[] iArr127 = new int[ll[1]];
                    iArr127[ll[0]] = ll[20];
                }
                all = Bank.getAll(item2 -> {
                    return item2.getName().contains(l[ll[222]]);
                });
                if (llIIl(all.isEmpty() ? 1 : 0)) {
                    H.add(new j(ll[33], ll[25], ll[210]));
                    "".length();
                }
                if (llIlI(Bank.contains(item3 -> {
                    return item3.getName().contains(l[ll[221]]);
                }) ? 1 : 0)) {
                    H.add(new j(ll[211], ll[28], ll[210]));
                    "".length();
                }
                if (llIlI(all.isEmpty() ? 1 : 0)) {
                    int[] iArr128 = new int[ll[1]];
                    iArr128[ll[0]] = ll[33];
                    if (llIlI(Bank.contains(iArr128) ? 1 : 0)) {
                        int[] iArr129 = new int[ll[1]];
                        iArr129[ll[0]] = ll[34];
                        if (llIlI(Bank.contains(iArr129) ? 1 : 0)) {
                            int[] iArr130 = new int[ll[1]];
                            iArr130[ll[0]] = ll[35];
                            if (llIlI(Bank.contains(iArr130) ? 1 : 0)) {
                                int[] iArr131 = new int[ll[1]];
                                iArr131[ll[0]] = ll[36];
                                if (llIlI(Bank.contains(iArr131) ? 1 : 0)) {
                                    int[] iArr132 = new int[ll[1]];
                                    iArr132[ll[0]] = ll[37];
                                    if (llIlI(Bank.contains(iArr132) ? 1 : 0)) {
                                        H.add(new j(ll[33], ll[25], ll[210]));
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                iArr2 = new int[ll[1]];
                iArr2[ll[0]] = ll[33];
                if (llIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr133 = new int[ll[1]];
                    iArr133[ll[0]] = ll[34];
                    if (llIlI(Bank.contains(iArr133) ? 1 : 0)) {
                        int[] iArr134 = new int[ll[1]];
                        iArr134[ll[0]] = ll[35];
                        if (llIlI(Bank.contains(iArr134) ? 1 : 0)) {
                            int[] iArr135 = new int[ll[1]];
                            iArr135[ll[0]] = ll[36];
                            if (llIlI(Bank.contains(iArr135) ? 1 : 0)) {
                                int[] iArr136 = new int[ll[1]];
                                iArr136[ll[0]] = ll[37];
                                if (llIlI(Bank.contains(iArr136) ? 1 : 0)) {
                                    int[] iArr137 = new int[ll[1]];
                                    iArr137[ll[0]] = ll[38];
                                    if (llIlI(Bank.contains(iArr137) ? 1 : 0)) {
                                        H.add(new j(ll[33], ll[25], ll[210]));
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                iArr3 = new int[ll[1]];
                iArr3[ll[0]] = ll[41];
                if (llIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr138 = new int[ll[1]];
                    iArr138[ll[0]] = ll[41];
                    if (llIIl(Bank.contains(iArr138) ? 1 : 0)) {
                        int[] iArr139 = new int[ll[1]];
                        iArr139[ll[0]] = ll[41];
                    }
                    iArr4 = new int[ll[1]];
                    iArr4[ll[0]] = ll[43];
                    if (llIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr140 = new int[ll[1]];
                        iArr140[ll[0]] = ll[43];
                        if (llIIl(Bank.contains(iArr140) ? 1 : 0)) {
                            int[] iArr141 = new int[ll[1]];
                            iArr141[ll[0]] = ll[43];
                        }
                        iArr5 = new int[ll[1]];
                        iArr5[ll[0]] = ll[21];
                        if (llIIl(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr142 = new int[ll[1]];
                            iArr142[ll[0]] = ll[21];
                            if (llIIl(Bank.contains(iArr142) ? 1 : 0)) {
                                int[] iArr143 = new int[ll[1]];
                                iArr143[ll[0]] = ll[21];
                            }
                            iArr6 = new int[ll[1]];
                            iArr6[ll[0]] = ll[42];
                            if (llIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                int[] iArr144 = new int[ll[1]];
                                iArr144[ll[0]] = ll[42];
                                if (llIIl(Bank.contains(iArr144) ? 1 : 0)) {
                                    int[] iArr145 = new int[ll[1]];
                                    iArr145[ll[0]] = ll[42];
                                }
                                if (llIIl(Clues.h ? 1 : 0)) {
                                    int[] iArr146 = new int[ll[1]];
                                    iArr146[ll[0]] = ll[215];
                                    if (llIlI(Bank.contains(iArr146) ? 1 : 0)) {
                                        int[] iArr147 = new int[ll[1]];
                                        iArr147[ll[0]] = ll[216];
                                        if (llIlI(Bank.contains(iArr147) ? 1 : 0)) {
                                            int[] iArr148 = new int[ll[1]];
                                            iArr148[ll[0]] = ll[217];
                                            if (llIlI(Bank.contains(iArr148) ? 1 : 0)) {
                                                int[] iArr149 = new int[ll[1]];
                                                iArr149[ll[0]] = ll[218];
                                                if (llIlI(Bank.contains(iArr149) ? 1 : 0)) {
                                                    H.add(new j(ll[215], ll[70], ll[219]));
                                                    "".length();
                                                }
                                            }
                                        }
                                    }
                                    if (llIlI(Bank.contains(item4 -> {
                                        return item4.getName().contains(l[ll[220]]);
                                    }) ? 1 : 0)) {
                                        H.add(new j(ll[215], ll[70], ll[219]));
                                        "".length();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            H.add(new j(ll[42], ll[70], ll[212]));
                            "".length();
                            if (llIIl(Clues.h ? 1 : 0)) {
                            }
                        }
                        H.add(new j(ll[21], ll[70], ll[212]));
                        "".length();
                        iArr6 = new int[ll[1]];
                        iArr6[ll[0]] = ll[42];
                        if (llIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        H.add(new j(ll[42], ll[70], ll[212]));
                        "".length();
                        if (llIIl(Clues.h ? 1 : 0)) {
                        }
                    }
                    H.add(new j(ll[43], ll[70], k.c(ll[213], ll[214])));
                    "".length();
                    iArr5 = new int[ll[1]];
                    iArr5[ll[0]] = ll[21];
                    if (llIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    H.add(new j(ll[21], ll[70], ll[212]));
                    "".length();
                    iArr6 = new int[ll[1]];
                    iArr6[ll[0]] = ll[42];
                    if (llIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    H.add(new j(ll[42], ll[70], ll[212]));
                    "".length();
                    if (llIIl(Clues.h ? 1 : 0)) {
                    }
                }
                H.add(new j(ll[41], ll[70], ll[212]));
                "".length();
                iArr4 = new int[ll[1]];
                iArr4[ll[0]] = ll[43];
                if (llIIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
                H.add(new j(ll[43], ll[70], k.c(ll[213], ll[214])));
                "".length();
                iArr5 = new int[ll[1]];
                iArr5[ll[0]] = ll[21];
                if (llIIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                H.add(new j(ll[21], ll[70], ll[212]));
                "".length();
                iArr6 = new int[ll[1]];
                iArr6[ll[0]] = ll[42];
                if (llIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                H.add(new j(ll[42], ll[70], ll[212]));
                "".length();
                if (llIIl(Clues.h ? 1 : 0)) {
                }
            }
            H.add(new j(ll[20], ll[99], ll[209]));
            "".length();
            all = Bank.getAll(item22 -> {
                return item22.getName().contains(l[ll[222]]);
            });
            if (llIIl(all.isEmpty() ? 1 : 0)) {
            }
            if (llIlI(Bank.contains(item32 -> {
                return item32.getName().contains(l[ll[221]]);
            }) ? 1 : 0)) {
            }
            if (llIlI(all.isEmpty() ? 1 : 0)) {
            }
            iArr2 = new int[ll[1]];
            iArr2[ll[0]] = ll[33];
            if (llIlI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[ll[1]];
            iArr3[ll[0]] = ll[41];
            if (llIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            H.add(new j(ll[41], ll[70], ll[212]));
            "".length();
            iArr4 = new int[ll[1]];
            iArr4[ll[0]] = ll[43];
            if (llIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            H.add(new j(ll[43], ll[70], k.c(ll[213], ll[214])));
            "".length();
            iArr5 = new int[ll[1]];
            iArr5[ll[0]] = ll[21];
            if (llIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            H.add(new j(ll[21], ll[70], ll[212]));
            "".length();
            iArr6 = new int[ll[1]];
            iArr6[ll[0]] = ll[42];
            if (llIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            H.add(new j(ll[42], ll[70], ll[212]));
            "".length();
            if (llIIl(Clues.h ? 1 : 0)) {
            }
        }
        H.add(new j(Clues.k, ll[99], k.c(ll[207], ll[208])));
        "".length();
        iArr = new int[ll[1]];
        iArr[ll[0]] = ll[20];
        if (llIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        H.add(new j(ll[20], ll[99], ll[209]));
        "".length();
        all = Bank.getAll(item222 -> {
            return item222.getName().contains(l[ll[222]]);
        });
        if (llIIl(all.isEmpty() ? 1 : 0)) {
        }
        if (llIlI(Bank.contains(item322 -> {
            return item322.getName().contains(l[ll[221]]);
        }) ? 1 : 0)) {
        }
        if (llIlI(all.isEmpty() ? 1 : 0)) {
        }
        iArr2 = new int[ll[1]];
        iArr2[ll[0]] = ll[33];
        if (llIlI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[ll[1]];
        iArr3[ll[0]] = ll[41];
        if (llIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        H.add(new j(ll[41], ll[70], ll[212]));
        "".length();
        iArr4 = new int[ll[1]];
        iArr4[ll[0]] = ll[43];
        if (llIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        H.add(new j(ll[43], ll[70], k.c(ll[213], ll[214])));
        "".length();
        iArr5 = new int[ll[1]];
        iArr5[ll[0]] = ll[21];
        if (llIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        H.add(new j(ll[21], ll[70], ll[212]));
        "".length();
        iArr6 = new int[ll[1]];
        iArr6[ll[0]] = ll[42];
        if (llIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        H.add(new j(ll[42], ll[70], ll[212]));
        "".length();
        if (llIIl(Clues.h ? 1 : 0)) {
        }
    }

    private static boolean lIIIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1021, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1026, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1031, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1034, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1091, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v235, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v238, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v261, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v264, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v287, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v290, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v313, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v339, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v342, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v368, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v391, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v394, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v417, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v420, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v443, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v446, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v469, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v472, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v495, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v498, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v521, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v524, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v547, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v550, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v573, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v576, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v599, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v602, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v625, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v628, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v651, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v654, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v677, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v680, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v703, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v706, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v727, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v730, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v753, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v756, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v779, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v782, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v805, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v808, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v831, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v834, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v857, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v860, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v883, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v886, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v907, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v910, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v931, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v934, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v955, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v958, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v993, types: [boolean] */
    public static void x() {
        if (llIIl(G ? 1 : 0) && llIlI(Clues.e ? 1 : 0)) {
            Clues.f0c = l[ll[11]];
            h.a(H);
            if (llIll(H.size(), ll[1])) {
                System.out.println(l[ll[12]]);
                G = ll[0];
                return;
            }
        }
        if (llIlI(G ? 1 : 0)) {
            BankLocation[] bankLocationArr = new BankLocation[ll[2]];
            bankLocationArr[ll[0]] = BankLocation.VARROCK_WEST_BANK;
            bankLocationArr[ll[1]] = BankLocation.AL_KHARID_BANK;
            bankLocationArr[ll[3]] = BankLocation.CANIFIS_BANK;
            bankLocationArr[ll[4]] = BankLocation.VARROCK_EAST_BANK;
            bankLocationArr[ll[5]] = BankLocation.GRAND_EXCHANGE_BANK;
            bankLocationArr[ll[6]] = BankLocation.FALADOR_EAST_BANK;
            bankLocationArr[ll[7]] = BankLocation.FALADOR_WEST_BANK;
            bankLocationArr[ll[8]] = BankLocation.LUMBRIDGE_BANK;
            bankLocationArr[ll[9]] = BankLocation.ARDOUGNE_NORTH_BANK;
            bankLocationArr[ll[10]] = BankLocation.ARDOUGNE_SOUTH_BANK;
            bankLocationArr[ll[11]] = BankLocation.CASTLE_WARS_BANK;
            bankLocationArr[ll[12]] = BankLocation.CATHERBY_BANK;
            bankLocationArr[ll[13]] = BankLocation.DRAYNOR_BANK;
            bankLocationArr[ll[14]] = BankLocation.EDGEVILLE_BANK;
            bankLocationArr[ll[15]] = BankLocation.FEROX_ENCLAVE_BANK;
            bankLocationArr[ll[16]] = BankLocation.HOSIDIUS_BANK;
            BankLocation nearestFrom = BankLocation.getNearestFrom(bankLocationArr);
            if (llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlI(A() ? 1 : 0)) {
                WorldPoint worldPoint = new WorldPoint(ll[17], ll[18], ll[0]);
                if (lllII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), ll[5])) {
                    Clues.f0c = l[ll[13]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(ll[1]);
                    "".length();
                }
                if (lllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), ll[5])) {
                    Clues.f0c = l[ll[14]];
                    String[] strArr = new String[ll[1]];
                    strArr[ll[0]] = l[ll[15]];
                    TileObjects.getNearest(strArr).interact(l[ll[16]]);
                    Time.sleepTicks(ll[5]);
                    "".length();
                }
            }
            if (((llIIl(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIlI(A() ? 1 : 0)) || llIlI(f.I.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llllI(nearestFrom) && llIlI(nearestFrom.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Clues.f0c = l[ll[2]];
                g.a(nearestFrom);
            }
            if (llllI(nearestFrom) && llIIl(nearestFrom.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIlI(Bank.isOpen() ? 1 : 0)) {
                    g.G();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, ll[19]);
                    "".length();
                }
                if (llIIl(Bank.isOpen() ? 1 : 0)) {
                    Clues.f0c = l[ll[29]];
                    if (lllll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(ll[5]);
                        "".length();
                    }
                    if (lllll(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(ll[3]);
                        "".length();
                    }
                    if (llIlI(y() ? 1 : 0)) {
                        if (llIIl(Clues.e ? 1 : 0)) {
                            System.out.println(l[ll[30]]);
                            Clues.d = ll[1];
                            return;
                        }
                        B();
                        System.out.println(l[ll[31]]);
                        G = ll[1];
                        return;
                    }
                    if (llIIl(Clues.e ? 1 : 0)) {
                    }
                    if (llIlI(Clues.e ? 1 : 0)) {
                        if (llIlI(Bank.contains(item -> {
                            return item.getName().contains(l[ll[227]]);
                        }) ? 1 : 0) && llIIl(Clues.h ? 1 : 0)) {
                            B();
                            System.out.println(l[ll[32]]);
                            G = ll[1];
                            return;
                        }
                        int[] iArr = new int[ll[1]];
                        iArr[ll[0]] = ll[33];
                        if (llIlI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[ll[1]];
                            iArr2[ll[0]] = ll[34];
                            if (llIlI(Bank.contains(iArr2) ? 1 : 0)) {
                                int[] iArr3 = new int[ll[1]];
                                iArr3[ll[0]] = ll[35];
                                if (llIlI(Bank.contains(iArr3) ? 1 : 0)) {
                                    int[] iArr4 = new int[ll[1]];
                                    iArr4[ll[0]] = ll[36];
                                    if (llIlI(Bank.contains(iArr4) ? 1 : 0)) {
                                        int[] iArr5 = new int[ll[1]];
                                        iArr5[ll[0]] = ll[37];
                                        if (llIlI(Bank.contains(iArr5) ? 1 : 0)) {
                                            int[] iArr6 = new int[ll[1]];
                                            iArr6[ll[0]] = ll[38];
                                            if (llIlI(Bank.contains(iArr6) ? 1 : 0)) {
                                                B();
                                                System.out.println(l[ll[39]]);
                                                G = ll[1];
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (llIlI(Bank.contains(item2 -> {
                            return item2.getName().contains(l[ll[226]]);
                        }) ? 1 : 0)) {
                            B();
                            System.out.println(l[ll[40]]);
                            G = ll[1];
                            return;
                        }
                    }
                    if (llIIl(y() ? 1 : 0)) {
                        Clues.g = ll[0];
                        if (llIIl(Clues.h ? 1 : 0)) {
                            g.b(m.bM, ll[3]);
                        }
                        if (llIlI(Clues.e ? 1 : 0)) {
                            g.a(ll[20], ll[11]);
                            g.a(ll[41], ll[11]);
                            g.a(ll[42], ll[11]);
                            g.a(ll[21], ll[11]);
                            g.a(ll[43], ll[11]);
                        }
                        g.b(m.bE, ll[1]);
                        g.b(m.bF, ll[1]);
                        g.a(ll[44], ll[45]);
                        g.a(ll[46], ll[1]);
                        g.a(Clues.k, ll[3]);
                        if (llIIl(Clues.e ? 1 : 0)) {
                            g.a(ll[22], ll[23]);
                            g.a(ll[24], ll[25]);
                            g.a(ll[26], ll[23]);
                            g.a(ll[47], ll[23]);
                            g.a(ll[27], ll[23]);
                        }
                        Bank.withdraw(item3 -> {
                            if (llIIl(item3.getName().contains(l[ll[224]]) ? 1 : 0) && llIIl(item3.getName().contains(l[ll[225]]) ? 1 : 0)) {
                                ?? r0 = ll[1];
                                "".length();
                                return (((((123 + 116) - 9) + 20) ^ (((18 + 56) - (-37)) + 69)) & (((((85 + 150) - (-5)) + 1) ^ (((56 + 124) - 54) + 65)) ^ (-" ".length()))) > 0 ? ((((25 + 71) - 28) + 63) ^ (((49 + 36) - (-38)) + 25)) & (((67 ^ 89) ^ (136 ^ 133)) ^ (-" ".length())) : r0;
                            }
                            return ll[0];
                        }, ll[1], Bank.WithdrawMode.ITEM);
                        Time.sleepTicks(k.c(ll[4], ll[6]));
                        "".length();
                        int[] iArr7 = new int[ll[1]];
                        iArr7[ll[0]] = ll[48];
                        if (llIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[ll[4]];
                            iArr8[ll[0]] = ll[49];
                            iArr8[ll[1]] = ll[50];
                            iArr8[ll[3]] = ll[51];
                            if (llIlI(k.c(iArr8) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[52]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                B();
                                System.out.println(l[ll[53]]);
                                G = ll[1];
                                return;
                            }
                            int[] iArr9 = new int[ll[4]];
                            iArr9[ll[0]] = ll[49];
                            iArr9[ll[1]] = ll[50];
                            iArr9[ll[3]] = ll[51];
                            if (llIIl(k.c(iArr9) ? 1 : 0)) {
                                g.a(ll[49], ll[1]);
                                g.a(ll[50], ll[1]);
                                g.a(ll[51], ll[1]);
                            }
                        }
                        int[] iArr10 = new int[ll[1]];
                        iArr10[ll[0]] = ll[54];
                        if (llIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[ll[4]];
                            iArr11[ll[0]] = ll[49];
                            iArr11[ll[1]] = ll[55];
                            iArr11[ll[3]] = ll[56];
                            if (llIlI(k.c(iArr11) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[57]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                B();
                                System.out.println(l[ll[58]]);
                                G = ll[1];
                                return;
                            }
                            int[] iArr12 = new int[ll[4]];
                            iArr12[ll[0]] = ll[49];
                            iArr12[ll[1]] = ll[55];
                            iArr12[ll[3]] = ll[56];
                            if (llIIl(k.c(iArr12) ? 1 : 0)) {
                                g.a(ll[49], ll[1]);
                                g.a(ll[55], ll[1]);
                                g.a(ll[56], ll[1]);
                            }
                        }
                        int[] iArr13 = new int[ll[1]];
                        iArr13[ll[0]] = ll[59];
                        if (llIIl(Inventory.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[ll[4]];
                            iArr14[ll[0]] = ll[60];
                            iArr14[ll[1]] = ll[61];
                            iArr14[ll[3]] = ll[62];
                            if (llIlI(k.c(iArr14) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[63]]);
                                    Clues.d = ll[1];
                                    return;
                                }
                                B();
                                System.out.println(l[ll[64]]);
                                G = ll[1];
                                return;
                            }
                            int[] iArr15 = new int[ll[4]];
                            iArr15[ll[0]] = ll[60];
                            iArr15[ll[1]] = ll[61];
                            iArr15[ll[3]] = ll[62];
                            if (llIIl(k.c(iArr15) ? 1 : 0)) {
                                g.a(ll[60], ll[1]);
                                g.a(ll[61], ll[1]);
                                g.a(ll[62], ll[1]);
                            }
                        }
                        int[] iArr16 = new int[ll[1]];
                        iArr16[ll[0]] = ll[65];
                        if (llIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                            int[] iArr17 = new int[ll[4]];
                            iArr17[ll[0]] = ll[66];
                            iArr17[ll[1]] = ll[67];
                            iArr17[ll[3]] = ll[68];
                            if (llIlI(k.c(iArr17) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[69]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[70]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr18 = new int[ll[4]];
                            iArr18[ll[0]] = ll[66];
                            iArr18[ll[1]] = ll[67];
                            iArr18[ll[3]] = ll[68];
                            if (llIIl(k.c(iArr18) ? 1 : 0)) {
                                g.a(ll[66], ll[1]);
                                g.a(ll[67], ll[1]);
                                g.a(ll[68], ll[1]);
                            }
                        }
                        int[] iArr19 = new int[ll[1]];
                        iArr19[ll[0]] = ll[71];
                        if (llIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                            int[] iArr20 = new int[ll[4]];
                            iArr20[ll[0]] = ll[72];
                            iArr20[ll[1]] = ll[73];
                            iArr20[ll[3]] = ll[74];
                            if (llIlI(k.c(iArr20) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[75]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[76]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr21 = new int[ll[4]];
                            iArr21[ll[0]] = ll[72];
                            iArr21[ll[1]] = ll[73];
                            iArr21[ll[3]] = ll[74];
                            if (llIIl(k.c(iArr21) ? 1 : 0)) {
                                g.a(ll[72], ll[1]);
                                g.a(ll[73], ll[1]);
                                g.a(ll[74], ll[1]);
                            }
                        }
                        int[] iArr22 = new int[ll[1]];
                        iArr22[ll[0]] = ll[77];
                        if (llIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                            int[] iArr23 = new int[ll[4]];
                            iArr23[ll[0]] = ll[78];
                            iArr23[ll[1]] = ll[79];
                            iArr23[ll[3]] = ll[80];
                            if (llIlI(k.c(iArr23) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[81]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[82]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr24 = new int[ll[4]];
                            iArr24[ll[0]] = ll[78];
                            iArr24[ll[1]] = ll[79];
                            iArr24[ll[3]] = ll[80];
                            if (llIIl(k.c(iArr24) ? 1 : 0)) {
                                g.a(ll[78], ll[1]);
                                g.a(ll[79], ll[1]);
                                g.a(ll[80], ll[1]);
                            }
                        }
                        int[] iArr25 = new int[ll[1]];
                        iArr25[ll[0]] = ll[83];
                        if (llIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                            int[] iArr26 = new int[ll[4]];
                            iArr26[ll[0]] = ll[84];
                            iArr26[ll[1]] = ll[85];
                            iArr26[ll[3]] = ll[86];
                            if (llIlI(k.c(iArr26) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[87]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[88]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr27 = new int[ll[4]];
                            iArr27[ll[0]] = ll[84];
                            iArr27[ll[1]] = ll[85];
                            iArr27[ll[3]] = ll[86];
                            if (llIIl(k.c(iArr27) ? 1 : 0)) {
                                g.a(ll[84], ll[1]);
                                g.a(ll[85], ll[1]);
                                g.a(ll[86], ll[1]);
                            }
                        }
                        int[] iArr28 = new int[ll[1]];
                        iArr28[ll[0]] = ll[89];
                        if (llIIl(Inventory.contains(iArr28) ? 1 : 0)) {
                            int[] iArr29 = new int[ll[4]];
                            iArr29[ll[0]] = ll[90];
                            iArr29[ll[1]] = ll[73];
                            iArr29[ll[3]] = ll[91];
                            if (llIlI(k.c(iArr29) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[92]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[93]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr30 = new int[ll[4]];
                            iArr30[ll[0]] = ll[90];
                            iArr30[ll[1]] = ll[73];
                            iArr30[ll[3]] = ll[91];
                            if (llIIl(k.c(iArr30) ? 1 : 0)) {
                                g.a(ll[90], ll[1]);
                                g.a(ll[73], ll[1]);
                                g.a(ll[91], ll[1]);
                            }
                        }
                        int[] iArr31 = new int[ll[1]];
                        iArr31[ll[0]] = ll[94];
                        if (llIIl(Inventory.contains(iArr31) ? 1 : 0)) {
                            int[] iArr32 = new int[ll[4]];
                            iArr32[ll[0]] = ll[95];
                            iArr32[ll[1]] = ll[96];
                            iArr32[ll[3]] = ll[97];
                            if (llIlI(k.c(iArr32) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[98]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[99]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr33 = new int[ll[4]];
                            iArr33[ll[0]] = ll[95];
                            iArr33[ll[1]] = ll[96];
                            iArr33[ll[3]] = ll[97];
                            if (llIIl(k.c(iArr33) ? 1 : 0)) {
                                g.a(ll[95], ll[1]);
                                g.a(ll[96], ll[1]);
                                g.a(ll[97], ll[1]);
                            }
                        }
                        int[] iArr34 = new int[ll[1]];
                        iArr34[ll[0]] = ll[100];
                        if (llIIl(Inventory.contains(iArr34) ? 1 : 0)) {
                            int[] iArr35 = new int[ll[3]];
                            iArr35[ll[0]] = ll[101];
                            iArr35[ll[1]] = ll[102];
                            if (llIlI(k.c(iArr35) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[103]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[104]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr36 = new int[ll[3]];
                            iArr36[ll[0]] = ll[101];
                            iArr36[ll[1]] = ll[102];
                            if (llIIl(k.c(iArr36) ? 1 : 0)) {
                                g.a(ll[101], ll[1]);
                                g.a(ll[102], ll[1]);
                            }
                        }
                        int[] iArr37 = new int[ll[1]];
                        iArr37[ll[0]] = ll[105];
                        if (llIIl(Inventory.contains(iArr37) ? 1 : 0)) {
                            int[] iArr38 = new int[ll[4]];
                            iArr38[ll[0]] = ll[106];
                            iArr38[ll[1]] = ll[107];
                            iArr38[ll[3]] = ll[108];
                            if (llIlI(k.c(iArr38) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[109]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[110]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr39 = new int[ll[4]];
                            iArr39[ll[0]] = ll[106];
                            iArr39[ll[1]] = ll[107];
                            iArr39[ll[3]] = ll[108];
                            if (llIIl(k.c(iArr39) ? 1 : 0)) {
                                g.a(ll[106], ll[1]);
                                g.a(ll[107], ll[1]);
                                g.a(ll[108], ll[1]);
                            }
                        }
                        int[] iArr40 = new int[ll[1]];
                        iArr40[ll[0]] = ll[111];
                        if (llIIl(Inventory.contains(iArr40) ? 1 : 0)) {
                            int[] iArr41 = new int[ll[4]];
                            iArr41[ll[0]] = ll[112];
                            iArr41[ll[1]] = ll[113];
                            iArr41[ll[3]] = ll[114];
                            if (llIlI(k.c(iArr41) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[115]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[116]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr42 = new int[ll[4]];
                            iArr42[ll[0]] = ll[112];
                            iArr42[ll[1]] = ll[113];
                            iArr42[ll[3]] = ll[114];
                            if (llIIl(k.c(iArr42) ? 1 : 0)) {
                                g.a(ll[112], ll[1]);
                                g.a(ll[113], ll[1]);
                                g.a(ll[114], ll[1]);
                            }
                        }
                        int[] iArr43 = new int[ll[1]];
                        iArr43[ll[0]] = ll[117];
                        if (llIIl(Inventory.contains(iArr43) ? 1 : 0)) {
                            int[] iArr44 = new int[ll[4]];
                            iArr44[ll[0]] = ll[118];
                            iArr44[ll[1]] = ll[119];
                            iArr44[ll[3]] = ll[120];
                            if (llIlI(k.c(iArr44) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[121]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[122]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr45 = new int[ll[4]];
                            iArr45[ll[0]] = ll[118];
                            iArr45[ll[1]] = ll[119];
                            iArr45[ll[3]] = ll[120];
                            if (llIIl(k.c(iArr45) ? 1 : 0)) {
                                g.a(ll[118], ll[1]);
                                g.a(ll[119], ll[1]);
                                g.a(ll[120], ll[1]);
                            }
                        }
                        int[] iArr46 = new int[ll[1]];
                        iArr46[ll[0]] = ll[123];
                        if (llIIl(Inventory.contains(iArr46) ? 1 : 0)) {
                            int[] iArr47 = new int[ll[4]];
                            iArr47[ll[0]] = ll[124];
                            iArr47[ll[1]] = ll[86];
                            iArr47[ll[3]] = ll[125];
                            if (llIlI(k.c(iArr47) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[126]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[28]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr48 = new int[ll[4]];
                            iArr48[ll[0]] = ll[124];
                            iArr48[ll[1]] = ll[86];
                            iArr48[ll[3]] = ll[125];
                            if (llIIl(k.c(iArr48) ? 1 : 0)) {
                                g.a(ll[124], ll[1]);
                                g.a(ll[86], ll[1]);
                                g.a(ll[125], ll[1]);
                            }
                        }
                        int[] iArr49 = new int[ll[1]];
                        iArr49[ll[0]] = ll[127];
                        if (llIIl(Inventory.contains(iArr49) ? 1 : 0)) {
                            int[] iArr50 = new int[ll[4]];
                            iArr50[ll[0]] = ll[128];
                            iArr50[ll[1]] = ll[91];
                            iArr50[ll[3]] = ll[129];
                            if (llIlI(k.c(iArr50) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[130]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[131]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr51 = new int[ll[4]];
                            iArr51[ll[0]] = ll[128];
                            iArr51[ll[1]] = ll[91];
                            iArr51[ll[3]] = ll[129];
                            if (llIIl(k.c(iArr51) ? 1 : 0)) {
                                g.a(ll[128], ll[1]);
                                g.a(ll[91], ll[1]);
                                g.a(ll[129], ll[1]);
                            }
                        }
                        int[] iArr52 = new int[ll[1]];
                        iArr52[ll[0]] = ll[132];
                        if (llIIl(Inventory.contains(iArr52) ? 1 : 0)) {
                            int[] iArr53 = new int[ll[4]];
                            iArr53[ll[0]] = ll[61];
                            iArr53[ll[1]] = ll[133];
                            iArr53[ll[3]] = ll[134];
                            if (llIlI(k.c(iArr53) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[135]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[136]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr54 = new int[ll[4]];
                            iArr54[ll[0]] = ll[61];
                            iArr54[ll[1]] = ll[133];
                            iArr54[ll[3]] = ll[134];
                            if (llIIl(k.c(iArr54) ? 1 : 0)) {
                                g.a(ll[61], ll[1]);
                                g.a(ll[133], ll[1]);
                                g.a(ll[134], ll[1]);
                            }
                        }
                        int[] iArr55 = new int[ll[1]];
                        iArr55[ll[0]] = ll[137];
                        if (llIIl(Inventory.contains(iArr55) ? 1 : 0)) {
                            int[] iArr56 = new int[ll[4]];
                            iArr56[ll[0]] = ll[138];
                            iArr56[ll[1]] = ll[139];
                            iArr56[ll[3]] = ll[73];
                            if (llIlI(k.c(iArr56) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[140]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[141]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr57 = new int[ll[4]];
                            iArr57[ll[0]] = ll[138];
                            iArr57[ll[1]] = ll[139];
                            iArr57[ll[3]] = ll[73];
                            if (llIIl(k.c(iArr57) ? 1 : 0)) {
                                g.a(ll[138], ll[1]);
                                g.a(ll[139], ll[1]);
                                g.a(ll[73], ll[1]);
                            }
                        }
                        int[] iArr58 = new int[ll[1]];
                        iArr58[ll[0]] = ll[142];
                        if (llIIl(Inventory.contains(iArr58) ? 1 : 0)) {
                            int[] iArr59 = new int[ll[4]];
                            iArr59[ll[0]] = ll[143];
                            iArr59[ll[1]] = ll[124];
                            iArr59[ll[3]] = ll[144];
                            if (llIlI(k.c(iArr59) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[145]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[146]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr60 = new int[ll[4]];
                            iArr60[ll[0]] = ll[143];
                            iArr60[ll[1]] = ll[124];
                            iArr60[ll[3]] = ll[144];
                            if (llIIl(k.c(iArr60) ? 1 : 0)) {
                                g.a(ll[143], ll[1]);
                                g.a(ll[124], ll[1]);
                                g.a(ll[144], ll[1]);
                            }
                        }
                        int[] iArr61 = new int[ll[1]];
                        iArr61[ll[0]] = ll[147];
                        if (llIIl(Inventory.contains(iArr61) ? 1 : 0)) {
                            int[] iArr62 = new int[ll[4]];
                            iArr62[ll[0]] = ll[143];
                            iArr62[ll[1]] = ll[91];
                            iArr62[ll[3]] = ll[148];
                            if (llIlI(k.c(iArr62) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[149]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[150]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr63 = new int[ll[4]];
                            iArr63[ll[0]] = ll[143];
                            iArr63[ll[1]] = ll[91];
                            iArr63[ll[3]] = ll[148];
                            if (llIIl(k.c(iArr63) ? 1 : 0)) {
                                g.a(ll[143], ll[1]);
                                g.a(ll[91], ll[1]);
                                g.a(ll[148], ll[1]);
                            }
                        }
                        int[] iArr64 = new int[ll[1]];
                        iArr64[ll[0]] = ll[151];
                        if (llIIl(Inventory.contains(iArr64) ? 1 : 0)) {
                            int[] iArr65 = new int[ll[4]];
                            iArr65[ll[0]] = ll[152];
                            iArr65[ll[1]] = ll[153];
                            iArr65[ll[3]] = ll[154];
                            if (llIlI(k.c(iArr65) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[155]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[156]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr66 = new int[ll[4]];
                            iArr66[ll[0]] = ll[152];
                            iArr66[ll[1]] = ll[153];
                            iArr66[ll[3]] = ll[154];
                            if (llIIl(k.c(iArr66) ? 1 : 0)) {
                                g.a(ll[152], ll[1]);
                                g.a(ll[153], ll[1]);
                                g.a(ll[154], ll[1]);
                            }
                        }
                        int[] iArr67 = new int[ll[1]];
                        iArr67[ll[0]] = ll[157];
                        if (llIIl(Inventory.contains(iArr67) ? 1 : 0)) {
                            int[] iArr68 = new int[ll[4]];
                            iArr68[ll[0]] = ll[158];
                            iArr68[ll[1]] = ll[50];
                            iArr68[ll[3]] = ll[159];
                            if (llIlI(k.c(iArr68) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[160]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[161]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr69 = new int[ll[4]];
                            iArr69[ll[0]] = ll[158];
                            iArr69[ll[1]] = ll[50];
                            iArr69[ll[3]] = ll[159];
                            if (llIIl(k.c(iArr69) ? 1 : 0)) {
                                g.a(ll[158], ll[1]);
                                g.a(ll[50], ll[1]);
                                g.a(ll[159], ll[1]);
                            }
                        }
                        int[] iArr70 = new int[ll[1]];
                        iArr70[ll[0]] = ll[162];
                        if (llIIl(Inventory.contains(iArr70) ? 1 : 0)) {
                            int[] iArr71 = new int[ll[4]];
                            iArr71[ll[0]] = ll[90];
                            iArr71[ll[1]] = ll[163];
                            iArr71[ll[3]] = ll[164];
                            if (llIlI(k.c(iArr71) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[165]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[166]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr72 = new int[ll[4]];
                            iArr72[ll[0]] = ll[90];
                            iArr72[ll[1]] = ll[163];
                            iArr72[ll[3]] = ll[164];
                            if (llIIl(k.c(iArr72) ? 1 : 0)) {
                                g.a(ll[90], ll[1]);
                                g.a(ll[163], ll[1]);
                                g.a(ll[164], ll[1]);
                            }
                        }
                        int[] iArr73 = new int[ll[1]];
                        iArr73[ll[0]] = ll[167];
                        if (llIIl(Inventory.contains(iArr73) ? 1 : 0)) {
                            int[] iArr74 = new int[ll[4]];
                            iArr74[ll[0]] = ll[168];
                            iArr74[ll[1]] = ll[73];
                            iArr74[ll[3]] = ll[169];
                            if (llIlI(k.c(iArr74) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[170]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[171]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr75 = new int[ll[4]];
                            iArr75[ll[0]] = ll[168];
                            iArr75[ll[1]] = ll[73];
                            iArr75[ll[3]] = ll[169];
                            if (llIIl(k.c(iArr75) ? 1 : 0)) {
                                g.a(ll[168], ll[1]);
                                g.a(ll[73], ll[1]);
                                g.a(ll[169], ll[1]);
                            }
                        }
                        int[] iArr76 = new int[ll[1]];
                        iArr76[ll[0]] = ll[172];
                        if (llIIl(Inventory.contains(iArr76) ? 1 : 0)) {
                            int[] iArr77 = new int[ll[4]];
                            iArr77[ll[0]] = ll[62];
                            iArr77[ll[1]] = ll[173];
                            iArr77[ll[3]] = ll[148];
                            if (llIlI(k.c(iArr77) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[174]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[175]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr78 = new int[ll[4]];
                            iArr78[ll[0]] = ll[62];
                            iArr78[ll[1]] = ll[173];
                            iArr78[ll[3]] = ll[148];
                            if (llIIl(k.c(iArr78) ? 1 : 0)) {
                                g.a(ll[62], ll[1]);
                                g.a(ll[173], ll[1]);
                                g.a(ll[148], ll[1]);
                            }
                        }
                        int[] iArr79 = new int[ll[1]];
                        iArr79[ll[0]] = ll[176];
                        if (llIIl(Inventory.contains(iArr79) ? 1 : 0)) {
                            int[] iArr80 = new int[ll[4]];
                            iArr80[ll[0]] = ll[112];
                            iArr80[ll[1]] = ll[148];
                            iArr80[ll[3]] = ll[177];
                            if (llIlI(k.c(iArr80) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[178]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[179]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr81 = new int[ll[4]];
                            iArr81[ll[0]] = ll[112];
                            iArr81[ll[1]] = ll[148];
                            iArr81[ll[3]] = ll[177];
                            if (llIIl(k.c(iArr81) ? 1 : 0)) {
                                g.a(ll[112], ll[1]);
                                g.a(ll[177], ll[1]);
                                g.a(ll[148], ll[1]);
                            }
                        }
                        int[] iArr82 = new int[ll[1]];
                        iArr82[ll[0]] = ll[180];
                        if (llIIl(Inventory.contains(iArr82) ? 1 : 0)) {
                            int[] iArr83 = new int[ll[4]];
                            iArr83[ll[0]] = ll[91];
                            iArr83[ll[1]] = ll[181];
                            iArr83[ll[3]] = ll[182];
                            if (llIlI(k.c(iArr83) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[183]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[184]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr84 = new int[ll[4]];
                            iArr84[ll[0]] = ll[91];
                            iArr84[ll[1]] = ll[181];
                            iArr84[ll[3]] = ll[182];
                            if (llIIl(k.c(iArr84) ? 1 : 0)) {
                                g.a(ll[91], ll[1]);
                                g.a(ll[181], ll[1]);
                                g.a(ll[182], ll[1]);
                            }
                        }
                        int[] iArr85 = new int[ll[1]];
                        iArr85[ll[0]] = ll[185];
                        if (llIIl(Inventory.contains(iArr85) ? 1 : 0)) {
                            int[] iArr86 = new int[ll[4]];
                            iArr86[ll[0]] = ll[186];
                            iArr86[ll[1]] = ll[79];
                            iArr86[ll[3]] = ll[187];
                            if (llIlI(k.c(iArr86) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[188]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[189]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr87 = new int[ll[4]];
                            iArr87[ll[0]] = ll[186];
                            iArr87[ll[1]] = ll[79];
                            iArr87[ll[3]] = ll[187];
                            if (llIIl(k.c(iArr87) ? 1 : 0)) {
                                g.a(ll[186], ll[1]);
                                g.a(ll[79], ll[1]);
                                g.a(ll[187], ll[1]);
                            }
                        }
                        int[] iArr88 = new int[ll[1]];
                        iArr88[ll[0]] = ll[190];
                        if (llIIl(Inventory.contains(iArr88) ? 1 : 0)) {
                            int[] iArr89 = new int[ll[4]];
                            iArr89[ll[0]] = ll[191];
                            iArr89[ll[1]] = ll[192];
                            iArr89[ll[3]] = ll[193];
                            if (llIlI(k.c(iArr89) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[194]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[195]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr90 = new int[ll[4]];
                            iArr90[ll[0]] = ll[191];
                            iArr90[ll[1]] = ll[192];
                            iArr90[ll[3]] = ll[193];
                            if (llIIl(k.c(iArr90) ? 1 : 0)) {
                                g.a(ll[191], ll[1]);
                                g.a(ll[192], ll[1]);
                                g.a(ll[193], ll[1]);
                            }
                        }
                        int[] iArr91 = new int[ll[1]];
                        iArr91[ll[0]] = ll[196];
                        if (llIIl(Inventory.contains(iArr91) ? 1 : 0)) {
                            int[] iArr92 = new int[ll[4]];
                            iArr92[ll[0]] = ll[96];
                            iArr92[ll[1]] = ll[197];
                            iArr92[ll[3]] = ll[198];
                            if (llIlI(k.c(iArr92) ? 1 : 0)) {
                                if (llIIl(Clues.e ? 1 : 0)) {
                                    System.out.println(l[ll[199]]);
                                    Clues.d = ll[1];
                                    return;
                                } else if (llIlI(Clues.e ? 1 : 0)) {
                                    B();
                                    System.out.println(l[ll[200]]);
                                    G = ll[1];
                                    return;
                                }
                            }
                            int[] iArr93 = new int[ll[4]];
                            iArr93[ll[0]] = ll[96];
                            iArr93[ll[1]] = ll[197];
                            iArr93[ll[3]] = ll[198];
                            if (llIIl(k.c(iArr93) ? 1 : 0)) {
                                g.a(ll[96], ll[1]);
                                g.a(ll[197], ll[1]);
                                g.a(ll[198], ll[1]);
                            }
                        }
                    }
                    if (llIIl(Dialog.isOpen() ? 1 : 0)) {
                        Time.sleepTicks(ll[1]);
                        "".length();
                        Dialog.close();
                    }
                }
            }
        }
    }

    private static String ll(String llllllIllIIlllI, String llllllIllIIllIl) {
        try {
            SecretKeySpec llllllIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllIIllIl.getBytes(StandardCharsets.UTF_8)), ll[9]), "DES");
            Cipher llllllIllIlIIII = Cipher.getInstance("DES");
            llllllIllIlIIII.init(ll[3], llllllIllIlIIIl);
            return new String(llllllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIllIIllll) {
            llllllIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllII(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIl(int i, int i2) {
        return i <= i2;
    }

    private static String lI(String llllllIlIlIIlll, String llllllIlIlIIllI) {
        try {
            SecretKeySpec llllllIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIlIlIlIll = Cipher.getInstance("Blowfish");
            llllllIlIlIlIll.init(ll[3], llllllIlIlIllII);
            return new String(llllllIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIlIlIlIlI) {
            llllllIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIl(int i) {
        return i != 0;
    }

    private static boolean llllI(Object obj) {
        return obj != null;
    }

    private static boolean lllll(int i) {
        return i > 0;
    }

    private static String lIl(String llllllIlIlllllI, String llllllIlIllllIl) {
        String str = new String(Base64.getDecoder().decode(llllllIlIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllIlIllllII = new StringBuilder();
        char[] charArray = llllllIlIllllIl.toCharArray();
        int llllllIlIlllIlI = ll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = ll[0];
        while (llIll(i, length)) {
            llllllIlIllllII.append((char) (charArray2[i] ^ charArray[llllllIlIlllIlI % charArray.length]));
            "".length();
            llllllIlIlllIlI++;
            i++;
            "".length();
            if (" ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllIlIllllII);
    }
}
