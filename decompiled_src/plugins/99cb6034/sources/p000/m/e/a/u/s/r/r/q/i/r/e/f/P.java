package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.P  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/P.class */
public abstract class P {
    public static final /* synthetic */ P GRAPES;
    public static final /* synthetic */ P SPIRIT_TREE;
    public static final /* synthetic */ P HESPORI;
    public static final /* synthetic */ P BELLADONNA;
    private static final /* synthetic */ P[] $VALUES;
    public static final /* synthetic */ P HERB;
    public static final /* synthetic */ P SEAWEED;
    public static final /* synthetic */ P GIANT_COMPOST;
    public static final /* synthetic */ P CRYSTAL_TREE;
    private final /* synthetic */ String unplanted;
    public static final /* synthetic */ P CACTUS;
    public static final /* synthetic */ P BUSH;
    public static final /* synthetic */ P TREE;
    public static final /* synthetic */ P HOPS;
    private final /* synthetic */ boolean healthCheckRequired;
    public static final /* synthetic */ P CALQUAT;
    public static final /* synthetic */ P FRUIT_TREE;
    public static final /* synthetic */ P ALLOTMENT;
    private final /* synthetic */ String name;
    public static final /* synthetic */ P HARDWOOD_TREE;
    private static /* synthetic */ int[] llIIIIllIIll;
    private final /* synthetic */ A runType;
    public static final /* synthetic */ P CELASTRUS;
    public static final /* synthetic */ P MUSHROOM;
    private final /* synthetic */ String planted;
    private static /* synthetic */ String[] llIIIIllIIlI;
    public static final /* synthetic */ P ANIMA;
    public static final /* synthetic */ P FLOWER;
    public static final /* synthetic */ P REDWOOD;
    public static final /* synthetic */ P COMPOST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    static {
        llllIIllIIIlIl();
        llllIIllIIIlII();
        final String str = llIIIIllIIlI[llIIIIllIIll[1]];
        final int i = llIIIIllIIll[1];
        final A a = A.SPECIAL;
        final String str2 = llIIIIllIIlI[llIIIIllIIll[0]];
        final ?? r6 = llIIIIllIIll[1];
        BELLADONNA = new P(str, i, a, str2, r6) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.Q
            private static /* synthetic */ int[] llIIIlIIlIII;

            private static boolean llllIlIIIIIllI(int i2) {
                return i2 >= 0;
            }

            private static void llllIlIIIIIlIl() {
                llIIIlIIlIII = new int[11];
                llIIIlIIlIII[0] = "   ".length();
                llIIIlIIlIII[1] = (((41 + 30) - 55) + 128) ^ (((2 + 114) - 42) + 74);
                llIIIlIIlIII[2] = 70 ^ 65;
                llIIIlIIlIII[3] = (((65 + 7) - 12) + 86) ^ (((24 + 91) - 33) + 72);
                llIIIlIIlIII[4] = (228 ^ 134) & ((119 ^ 21) ^ (-1));
                llIIIlIIlIII[5] = 31 ^ 22;
                llIIIlIIlIII[6] = (((93 + 85) - 77) + 31) ^ (((6 + 13) - (-119)) + 5);
                llIIIlIIlIII[7] = (((27 + 45) - (-58)) + 52) ^ (((175 + 149) - 321) + 183);
                llIIIlIIlIII[8] = 155 ^ 149;
                llIIIlIIlIII[9] = (108 ^ 51) ^ (121 ^ 41);
                llIIIlIIlIII[10] = ((173 + 116) - 61) + 27;
            }

            private static boolean llllIlIIIIIlll(int i2, int i3) {
                return i2 <= i3;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i2) {
                if (llllIlIIIIIllI(i2) && llllIlIIIIIlll(i2, llIIIlIIlIII[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIIlIII[0] - i2);
                }
                if (llllIlIIIIlIII(i2, llIIIlIIlIII[1]) && llllIlIIIIIlll(i2, llIIIlIIlIII[2])) {
                    return new C0014an(EnumC0021au.BELLADONNA, EnumC0039n.GROWING, i2 - llIIIlIIlIII[1]);
                }
                if (llllIlIIIIlIIl(i2, llIIIlIIlIII[3])) {
                    return new C0014an(EnumC0021au.BELLADONNA, EnumC0039n.HARVESTABLE, llIIIlIIlIII[4]);
                }
                if (llllIlIIIIlIII(i2, llIIIlIIlIII[5]) && llllIlIIIIIlll(i2, llIIIlIIlIII[6])) {
                    return new C0014an(EnumC0021au.BELLADONNA, EnumC0039n.DISEASED, i2 - llIIIlIIlIII[3]);
                }
                if (llllIlIIIIlIII(i2, llIIIlIIlIII[7]) && llllIlIIIIIlll(i2, llIIIlIIlIII[8])) {
                    return new C0014an(EnumC0021au.BELLADONNA, EnumC0039n.DEAD, i2 - llIIIlIIlIII[6]);
                }
                if (llllIlIIIIlIII(i2, llIIIlIIlIII[9]) && llllIlIIIIIlll(i2, llIIIlIIlIII[10])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIIlIII[0]);
                }
                return null;
            }

            static {
                llllIlIIIIIlIl();
            }

            private static boolean llllIlIIIIlIIl(int i2, int i3) {
                return i2 == i3;
            }

            private static boolean llllIlIIIIlIII(int i2, int i3) {
                return i2 >= i3;
            }
        };
        final String str3 = llIIIIllIIlI[llIIIIllIIll[2]];
        final int i2 = llIIIIllIIll[0];
        final A a2 = A.SPECIAL;
        final String str4 = llIIIIllIIlI[llIIIIllIIll[3]];
        final ?? r62 = llIIIIllIIll[1];
        MUSHROOM = new P(str3, i2, a2, str4, r62) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ab
            private static /* synthetic */ int[] llIIIllIIllI;

            private static boolean llllIlIllllIlI(int i3, int i4) {
                return i3 <= i4;
            }

            private static void llllIlIllllIII() {
                llIIIllIIllI = new int[11];
                llIIIllIIllI[0] = "   ".length();
                llIIIllIIllI[1] = (((132 + 141) - 210) + 88) ^ (((83 + 111) - 168) + 121);
                llIIIllIIllI[2] = (8 ^ 61) ^ (181 ^ 137);
                llIIIllIIllI[3] = (45 ^ 21) ^ (135 ^ 181);
                llIIIllIIllI[4] = (90 ^ 48) ^ (251 ^ 158);
                llIIIllIIllI[5] = (43 ^ 116) ^ (212 ^ 155);
                llIIIllIIllI[6] = " ".length() ^ (133 ^ 144);
                llIIIllIIllI[7] = (231 ^ 159) ^ (101 ^ 8);
                llIIIllIIllI[8] = (((178 + 159) - 120) + 0) ^ (((163 + 55) - 208) + 182);
                llIIIllIIllI[9] = 16 ^ 10;
                llIIIllIIllI[10] = (((((37 + 71) - (-47)) + 2) + (81 ^ 45)) - (((128 + 137) - 126) + 3)) + (38 ^ 82);
            }

            private static boolean llllIlIllllIIl(int i3) {
                return i3 >= 0;
            }

            private static boolean llllIlIllllIll(int i3, int i4) {
                return i3 >= i4;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i3) {
                if (llllIlIllllIIl(i3) && llllIlIllllIlI(i3, llIIIllIIllI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIllIIllI[0] - i3);
                }
                if (llllIlIllllIll(i3, llIIIllIIllI[1]) && llllIlIllllIlI(i3, llIIIllIIllI[2])) {
                    return new C0014an(EnumC0021au.MUSHROOM, EnumC0039n.GROWING, i3 - llIIIllIIllI[1]);
                }
                if (llllIlIllllIll(i3, llIIIllIIllI[3]) && llllIlIllllIlI(i3, llIIIllIIllI[4])) {
                    return new C0014an(EnumC0021au.MUSHROOM, EnumC0039n.HARVESTABLE, i3 - llIIIllIIllI[3]);
                }
                if (llllIlIllllIll(i3, llIIIllIIllI[5]) && llllIlIllllIlI(i3, llIIIllIIllI[6])) {
                    return new C0014an(EnumC0021au.MUSHROOM, EnumC0039n.DISEASED, i3 - llIIIllIIllI[4]);
                }
                if (llllIlIllllIll(i3, llIIIllIIllI[7]) && llllIlIllllIlI(i3, llIIIllIIllI[8])) {
                    return new C0014an(EnumC0021au.MUSHROOM, EnumC0039n.DEAD, i3 - llIIIllIIllI[6]);
                }
                if (llllIlIllllIll(i3, llIIIllIIllI[9]) && llllIlIllllIlI(i3, llIIIllIIllI[10])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIllIIllI[0]);
                }
                return null;
            }

            static {
                llllIlIllllIII();
            }
        };
        final String str5 = llIIIIllIIlI[llIIIIllIIll[4]];
        final int i3 = llIIIIllIIll[2];
        final A a3 = A.SPECIAL;
        final String str6 = llIIIIllIIlI[llIIIIllIIll[5]];
        final ?? r63 = llIIIIllIIll[0];
        HESPORI = new P(str5, i3, a3, str6, r63) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.af
            private static /* synthetic */ int[] lIllllIlIlll;

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i4) {
                if (lllIlllIlIlIII(i4) && lllIlllIlIlIIl(i4, lIllllIlIlll[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIlIlll[0] - i4);
                }
                if (lllIlllIlIlIlI(i4, lIllllIlIlll[1]) && lllIlllIlIlIIl(i4, lIllllIlIlll[2])) {
                    return new C0014an(EnumC0021au.HESPORI, EnumC0039n.GROWING, i4 - lIllllIlIlll[1]);
                }
                if (lllIlllIlIlIlI(i4, lIllllIlIlll[3]) && lllIlllIlIlIIl(i4, lIllllIlIlll[4])) {
                    return new C0014an(EnumC0021au.HESPORI, EnumC0039n.HARVESTABLE, i4 - lIllllIlIlll[3]);
                }
                if (lllIlllIlIlIll(i4, lIllllIlIlll[5])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIlIlll[0]);
                }
                return null;
            }

            private static boolean lllIlllIlIlIIl(int i4, int i5) {
                return i4 <= i5;
            }

            private static boolean lllIlllIlIlIll(int i4, int i5) {
                return i4 == i5;
            }

            private static void lllIlllIlIIlll() {
                lIllllIlIlll = new int[6];
                lIllllIlIlll[0] = "   ".length();
                lIllllIlIlll[1] = (90 ^ 120) ^ (111 ^ 73);
                lIllllIlIlll[2] = 80 ^ 86;
                lIllllIlIlll[3] = 132 ^ 131;
                lIllllIlIlll[4] = 115 ^ 123;
                lIllllIlIlll[5] = (((149 + 3) - 30) + 39) ^ (((135 + 160) - 253) + 126);
            }

            static {
                lllIlllIlIIlll();
            }

            private static boolean lllIlllIlIlIlI(int i4, int i5) {
                return i4 >= i5;
            }

            private static boolean lllIlllIlIlIII(int i4) {
                return i4 >= 0;
            }
        };
        final String str7 = llIIIIllIIlI[llIIIIllIIll[6]];
        final int i4 = llIIIIllIIll[3];
        final A a4 = A.ALLOTMENT;
        final String str8 = llIIIIllIIlI[llIIIIllIIll[7]];
        final ?? r64 = llIIIIllIIll[1];
        ALLOTMENT = new P(str7, i4, a4, str8, r64) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ag
            private static /* synthetic */ int[] lIlllIllIIII;

            static {
                lllIllIIllIIII();
            }

            private static boolean lllIllIIllIIlI(int i5, int i6) {
                return i5 <= i6;
            }

            private static void lllIllIIllIIII() {
                lIlllIllIIII = new int[126];
                lIlllIllIIII[0] = "   ".length();
                lIlllIllIIII[1] = 79 ^ 75;
                lIlllIllIIII[2] = (72 ^ 23) ^ (16 ^ 74);
                lIlllIllIIII[3] = (((114 + 83) - 97) + 31) ^ (((127 + 75) - 123) + 54);
                lIlllIllIIII[4] = 70 ^ 79;
                lIlllIllIIII[5] = (189 ^ 172) ^ (216 ^ 195);
                lIlllIllIIII[6] = (((188 + 16) - 21) + 18) ^ (((110 + 37) - 37) + 87);
                lIlllIllIIII[7] = 38 ^ 43;
                lIlllIllIIII[8] = (72 ^ 17) ^ (60 ^ 117);
                lIlllIllIIII[9] = (((116 + 10) - 121) + 186) ^ (((163 + 159) - 249) + 101);
                lIlllIllIIII[10] = 27 ^ 8;
                lIlllIllIIII[11] = 163 ^ 183;
                lIlllIllIIII[12] = 129 ^ 150;
                lIlllIllIIII[13] = (((174 + 64) - 105) + 42) ^ (((78 + 136) - 197) + 166);
                lIlllIllIIII[14] = 91 ^ 65;
                lIlllIllIIII[15] = (25 ^ 55) ^ (135 ^ 178);
                lIlllIllIIII[16] = (137 ^ 170) ^ (17 ^ 44);
                lIlllIllIIII[17] = 45 ^ 50;
                lIlllIllIIII[18] = (94 ^ 105) ^ (6 ^ 16);
                lIlllIllIIII[19] = 225 ^ 195;
                lIlllIllIIII[20] = (80 ^ 41) ^ (230 ^ 184);
                lIlllIllIIII[21] = 65 ^ 105;
                lIlllIllIIII[22] = 26 ^ 48;
                lIlllIllIIII[23] = (((44 + 72) - 9) + 37) ^ (((137 + 176) - 293) + 167);
                lIlllIllIIII[24] = 172 ^ 156;
                lIlllIllIIII[25] = (200 ^ 182) ^ (15 ^ 64);
                lIlllIllIIII[26] = 145 ^ 162;
                lIlllIllIIII[27] = 36 ^ 16;
                lIlllIllIIII[28] = (66 ^ 117) ^ (184 ^ 180);
                lIlllIllIIII[29] = (113 ^ 34) ^ (87 ^ 56);
                lIlllIllIIII[30] = 69 ^ 123;
                lIlllIllIIII[31] = (((51 + 130) - 101) + 170) ^ (((147 + 46) - 29) + 33);
                lIlllIllIIII[32] = (120 ^ 27) ^ (156 ^ 186);
                lIlllIllIIII[33] = (((114 + 4) - (-1)) + 125) ^ (((142 + 126) - 126) + 36);
                lIlllIllIIII[34] = (21 ^ 66) ^ (179 ^ 173);
                lIlllIllIIII[35] = (((163 + 214) - 224) + 88) ^ (((134 + 25) - (-7)) + 21);
                lIlllIllIIII[36] = 217 ^ 149;
                lIlllIllIIII[37] = (((7 + 168) - (-30)) + 14) ^ (((72 + 18) - 29) + 89);
                lIlllIllIIII[38] = 151 ^ 199;
                lIlllIllIIII[39] = 99 ^ 50;
                lIlllIllIIII[40] = (26 ^ 80) ^ (122 ^ 99);
                lIlllIllIIII[41] = 66 ^ 22;
                lIlllIllIIII[42] = (208 ^ 151) ^ (72 ^ 88);
                lIlllIllIIII[43] = (113 ^ 43) ^ "  ".length();
                lIlllIllIIII[44] = (222 ^ 169) ^ (56 ^ 21);
                lIlllIllIIII[45] = (4 ^ 31) ^ (81 ^ 17);
                lIlllIllIIII[46] = (((85 + 105) - 104) + 113) ^ (((86 + 52) - 111) + 126);
                lIlllIllIIII[47] = 45 ^ 114;
                lIlllIllIIII[48] = 25 ^ 120;
                lIlllIllIIII[49] = (100 ^ 122) ^ (82 ^ 46);
                lIlllIllIIII[50] = (42 ^ 96) ^ (235 ^ 198);
                lIlllIllIIII[51] = 36 ^ 76;
                lIlllIllIIII[52] = (((43 + 115) - 8) + 95) ^ (((1 + 145) - 133) + 146);
                lIlllIllIIII[53] = (((47 + 180) - 88) + 75) ^ (((162 + 157) - 314) + 184);
                lIlllIllIIII[54] = (13 ^ 21) ^ (46 ^ 70);
                lIlllIllIIII[55] = 77 ^ 60;
                lIlllIllIIII[56] = (62 ^ 112) ^ (35 ^ 30);
                lIlllIllIIII[57] = (((176 + 90) - 174) + 90) ^ (((25 + 141) - (-12)) + 16);
                lIlllIllIIII[58] = 73 ^ 50;
                lIlllIllIIII[59] = 30 ^ 98;
                lIlllIllIIII[60] = ((1 + 25) - (-28)) + 73;
                lIlllIllIIII[61] = (((3 ^ 44) + (206 ^ 146)) - (((58 + 66) - 109) + 122)) + (115 ^ 13);
                lIlllIllIIII[62] = ((123 + 33) - 144) + 122;
                lIlllIllIIII[63] = ((73 + 83) - 109) + 88;
                lIlllIllIIII[64] = ((25 + 5) - (-32)) + 75;
                lIlllIllIIII[65] = ((126 + 76) - 173) + 109;
                lIlllIllIIII[66] = (((196 ^ 144) + (235 ^ 186)) - (((101 + 25) - 83) + 91)) + (62 ^ 83);
                lIlllIllIIII[67] = (((210 ^ 176) + (55 ^ 122)) - (166 ^ 145)) + (59 ^ 46);
                lIlllIllIIII[68] = (((66 ^ 103) + (8 ^ 21)) - (-(80 ^ 85))) + (83 ^ 20);
                lIlllIllIIII[69] = (((184 ^ 156) + (82 ^ 49)) - (((115 + 79) - 142) + 77)) + ((16 + 35) - 37) + 124;
                lIlllIllIIII[70] = (((209 ^ 190) + (((62 + 8) - (-12)) + 60)) - (((138 + 145) - 259) + 146)) + (50 ^ 12);
                lIlllIllIIII[71] = ((126 + 12) - 33) + 43;
                lIlllIllIIII[72] = ((136 + 102) - 233) + 144;
                lIlllIllIIII[73] = ((69 + 39) - 15) + 58;
                lIlllIllIIII[74] = (((167 ^ 179) + (9 ^ 30)) - (-(54 ^ 110))) + (38 ^ 51);
                lIlllIllIIII[75] = ((76 + 36) - 4) + 47;
                lIlllIllIIII[76] = (((((43 + 113) - 145) + 142) + (29 ^ 35)) - (((130 + 14) - (-16)) + 1)) + (31 ^ 121);
                lIlllIllIIII[77] = (((241 ^ 128) + (119 ^ 105)) - (2 ^ 7)) + (102 ^ 114);
                lIlllIllIIII[78] = ((55 + 119) - 173) + 158;
                lIlllIllIIII[79] = (((80 ^ 35) + (117 ^ 93)) - (48 ^ 1)) + (252 ^ 196);
                lIlllIllIIII[80] = ((5 + 0) - (-94)) + 64;
                lIlllIllIIII[81] = (((172 ^ 185) + (236 ^ 129)) - (186 ^ 137)) + (197 ^ 157);
                lIlllIllIIII[82] = (((158 ^ 182) + (((106 + 128) - 205) + 127)) - (((80 + 57) - 121) + 124)) + (73 ^ 57);
                lIlllIllIIII[83] = ((51 + 111) - 83) + 92;
                lIlllIllIIII[84] = (("  ".length() + (137 ^ 171)) - (-(153 ^ 141))) + (225 ^ 149);
                lIlllIllIIII[85] = ((82 + 29) - (-13)) + 52;
                lIlllIllIIII[86] = ((160 + 16) - 64) + 65;
                lIlllIllIIII[87] = (((((127 + 85) - 209) + 142) + (20 ^ 73)) - (197 ^ 171)) + (98 ^ 86);
                lIlllIllIIII[88] = ((86 + 82) - (-13)) + 0;
                lIlllIllIIII[89] = (((214 ^ 189) + (((25 + 93) - 105) + 151)) - (216 ^ 140)) + ((20 ^ 36) & ((107 ^ 91) ^ (-1)));
                lIlllIllIIII[90] = (((((47 + 110) - 21) + 5) + (255 ^ 184)) - (157 ^ 130)) + (5 ^ 2);
                lIlllIllIIII[91] = (((104 ^ 16) + (56 ^ 13)) - (((64 + 31) - 70) + 126)) + ((141 + 158) - 144) + 15;
                lIlllIllIIII[92] = (((223 ^ 181) + (((106 + 116) - 157) + 78)) - (((15 + 123) - 45) + 36)) + (65 ^ 8);
                lIlllIllIIII[93] = (((((132 + 134) - 198) + 110) + (165 ^ 185)) - (((34 + 36) - 49) + 114)) + (255 ^ 131);
                lIlllIllIIII[94] = (((77 ^ 80) + (108 ^ 14)) - (151 ^ 169)) + ((85 + 106) - 67) + 7;
                lIlllIllIIII[95] = ((6 + 67) - 51) + 176;
                lIlllIllIIII[96] = ((198 + 150) - 322) + 173;
                lIlllIllIIII[97] = ((48 + 14) - (-75)) + 64;
                lIlllIllIIII[98] = ((27 + 167) - 107) + 115;
                lIlllIllIIII[99] = (((43 ^ 97) + (((33 + 120) - 36) + 18)) - (((4 + 29) - (-59)) + 72)) + ((114 + 47) - 73) + 71;
                lIlllIllIIII[100] = (((113 ^ 24) + (((147 + 90) - 175) + 106)) - (((53 + 85) - 80) + 174)) + ((92 + 132) - 158) + 98;
                lIlllIllIIII[101] = (((((42 + 71) - 7) + 45) + (23 ^ 36)) - (((35 + 87) - 104) + 115)) + ((8 + 47) - 11) + 93;
                lIlllIllIIII[102] = ((69 + 90) - 45) + 94;
                lIlllIllIIII[103] = ((7 + 160) - 76) + 118;
                lIlllIllIIII[104] = (((70 ^ 66) + (178 ^ 137)) - (-(54 ^ 105))) + (131 ^ 182);
                lIlllIllIIII[105] = ((88 + 78) - (-14)) + 32;
                lIlllIllIIII[106] = (((223 ^ 150) + (101 ^ 73)) - (83 ^ 84)) + (67 ^ 36);
                lIlllIllIIII[107] = (((((3 + 75) - 63) + 173) + (153 ^ 189)) - (((47 + 32) - 7) + 79)) + ((79 + 108) - 88) + 43;
                lIlllIllIIII[108] = ((12 + 213) - 190) + 181;
                lIlllIllIIII[109] = ((162 + 50) - 111) + 118;
                lIlllIllIIII[110] = (((((101 + 210) - 136) + 36) + (50 ^ 103)) - ((-13323) & 13599)) + ((50 + 145) - 90) + 96;
                lIlllIllIIII[111] = (((((167 + 62) - 220) + 167) + (((45 + 3) - (-72)) + 15)) - (77 ^ 41)) + (157 ^ 150);
                lIlllIllIIII[112] = ((154 + 85) - 231) + 215;
                lIlllIllIIII[113] = (((119 ^ 47) + (124 ^ 118)) - (45 ^ 51)) + ((73 + 63) - 76) + 98;
                lIlllIllIIII[114] = ((51 + 214) - 79) + 41;
                lIlllIllIIII[115] = ((149 + 10) - 10) + 82;
                lIlllIllIIII[116] = ((52 + 180) - 11) + 11;
                lIlllIllIIII[117] = (((((163 + 70) - 82) + 23) + (218 ^ 140)) - (255 ^ 133)) + (65 ^ 32);
                lIlllIllIIII[118] = ((85 + 49) - (-48)) + 54;
                lIlllIllIIII[119] = (((14 ^ 1) + (((18 + 20) - (-102)) + 0)) - (-(102 ^ 33))) + (101 ^ 107);
                lIlllIllIIII[120] = ((120 + 194) - 177) + 104;
                lIlllIllIIII[121] = (((((58 + 180) - 106) + 94) + (8 ^ 76)) - ((-9353) & 9611)) + ((156 + 80) - 220) + 193;
                lIlllIllIIII[122] = (((104 ^ 111) + (((158 + 48) - 121) + 127)) - (192 ^ 132)) + (115 ^ 45);
                lIlllIllIIII[123] = (((((124 + 117) - 134) + 84) + (((95 + 160) - 254) + 190)) - (((62 + 56) - 67) + 83)) + "   ".length();
                lIlllIllIIII[124] = ((113 + 4) - 34) + 169;
                lIlllIllIIII[125] = (((13 ^ 27) + (139 ^ 158)) - (-(5 ^ 32))) + ((102 + 52) - 5) + 26;
            }

            private static boolean lllIllIIllIIll(int i5, int i6) {
                return i5 >= i6;
            }

            private static boolean lllIllIIllIlII(int i5, int i6) {
                return i5 == i6;
            }

            private static boolean lllIllIIllIIIl(int i5) {
                return i5 >= 0;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i5) {
                if (lllIllIIllIIIl(i5) && lllIllIIllIIlI(i5, lIlllIllIIII[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0] - i5);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[1]) && lllIllIIllIIlI(i5, lIlllIllIIII[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[3]) && lllIllIIllIIlI(i5, lIlllIllIIII[4])) {
                    return new C0014an(EnumC0021au.POTATO, EnumC0039n.GROWING, i5 - lIlllIllIIII[3]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[5]) && lllIllIIllIIlI(i5, lIlllIllIIII[6])) {
                    return new C0014an(EnumC0021au.POTATO, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[5]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[7]) && lllIllIIllIIlI(i5, lIlllIllIIII[8])) {
                    return new C0014an(EnumC0021au.ONION, EnumC0039n.GROWING, i5 - lIlllIllIIII[7]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[9]) && lllIllIIllIIlI(i5, lIlllIllIIII[10])) {
                    return new C0014an(EnumC0021au.ONION, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[9]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[11]) && lllIllIIllIIlI(i5, lIlllIllIIII[12])) {
                    return new C0014an(EnumC0021au.CABBAGE, EnumC0039n.GROWING, i5 - lIlllIllIIII[11]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[13]) && lllIllIIllIIlI(i5, lIlllIllIIII[14])) {
                    return new C0014an(EnumC0021au.CABBAGE, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[13]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[15]) && lllIllIIllIIlI(i5, lIlllIllIIII[16])) {
                    return new C0014an(EnumC0021au.TOMATO, EnumC0039n.GROWING, i5 - lIlllIllIIII[15]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[17]) && lllIllIIllIIlI(i5, lIlllIllIIII[18])) {
                    return new C0014an(EnumC0021au.TOMATO, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[17]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[19]) && lllIllIIllIIlI(i5, lIlllIllIIII[20])) {
                    return new C0014an(EnumC0021au.SWEETCORN, EnumC0039n.GROWING, i5 - lIlllIllIIII[19]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[21]) && lllIllIIllIIlI(i5, lIlllIllIIII[22])) {
                    return new C0014an(EnumC0021au.SWEETCORN, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[21]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[23]) && lllIllIIllIIlI(i5, lIlllIllIIII[24])) {
                    return new C0014an(EnumC0021au.STRAWBERRY, EnumC0039n.GROWING, i5 - lIlllIllIIII[23]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[25]) && lllIllIIllIIlI(i5, lIlllIllIIII[26])) {
                    return new C0014an(EnumC0021au.STRAWBERRY, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[25]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[27]) && lllIllIIllIIlI(i5, lIlllIllIIII[28])) {
                    return new C0014an(EnumC0021au.WATERMELON, EnumC0039n.GROWING, i5 - lIlllIllIIII[27]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[29]) && lllIllIIllIIlI(i5, lIlllIllIIII[30])) {
                    return new C0014an(EnumC0021au.WATERMELON, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[29]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[31]) && lllIllIIllIIlI(i5, lIlllIllIIII[32])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.GROWING, i5 - lIlllIllIIII[31]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[33]) && lllIllIIllIIlI(i5, lIlllIllIIII[34])) {
                    return new C0014an(EnumC0021au.POTATO, EnumC0039n.GROWING, i5 - lIlllIllIIII[33]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[35]) && lllIllIIllIIlI(i5, lIlllIllIIII[36])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[37]) && lllIllIIllIIlI(i5, lIlllIllIIII[38])) {
                    return new C0014an(EnumC0021au.ONION, EnumC0039n.GROWING, i5 - lIlllIllIIII[37]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[39]) && lllIllIIllIIlI(i5, lIlllIllIIII[40])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[41]) && lllIllIIllIIlI(i5, lIlllIllIIII[42])) {
                    return new C0014an(EnumC0021au.CABBAGE, EnumC0039n.GROWING, i5 - lIlllIllIIII[41]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[43]) && lllIllIIllIIlI(i5, lIlllIllIIII[44])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[45]) && lllIllIIllIIlI(i5, lIlllIllIIII[46])) {
                    return new C0014an(EnumC0021au.TOMATO, EnumC0039n.GROWING, i5 - lIlllIllIIII[45]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[47]) && lllIllIIllIIlI(i5, lIlllIllIIII[48])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[49]) && lllIllIIllIIlI(i5, lIlllIllIIII[50])) {
                    return new C0014an(EnumC0021au.SWEETCORN, EnumC0039n.GROWING, i5 - lIlllIllIIII[49]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[51]) && lllIllIIllIIlI(i5, lIlllIllIIII[52])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[53]) && lllIllIIllIIlI(i5, lIlllIllIIII[54])) {
                    return new C0014an(EnumC0021au.STRAWBERRY, EnumC0039n.GROWING, i5 - lIlllIllIIII[53]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[55]) && lllIllIIllIIlI(i5, lIlllIllIIII[56])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[57]) && lllIllIIllIIlI(i5, lIlllIllIIII[58])) {
                    return new C0014an(EnumC0021au.WATERMELON, EnumC0039n.GROWING, i5 - lIlllIllIIII[57]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[59]) && lllIllIIllIIlI(i5, lIlllIllIIII[60])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[61]) && lllIllIIllIIlI(i5, lIlllIllIIII[62])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.GROWING, i5 - lIlllIllIIII[61]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[63]) && lllIllIIllIIlI(i5, lIlllIllIIII[64])) {
                    return new C0014an(EnumC0021au.POTATO, EnumC0039n.DISEASED, i5 - lIlllIllIIII[62]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[65]) && lllIllIIllIIlI(i5, lIlllIllIIII[66])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.HARVESTABLE, i5 - lIlllIllIIII[65]);
                }
                if (lllIllIIllIlII(i5, lIlllIllIIII[67])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[68]) && lllIllIIllIIlI(i5, lIlllIllIIII[69])) {
                    return new C0014an(EnumC0021au.ONION, EnumC0039n.DISEASED, i5 - lIlllIllIIII[67]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[70]) && lllIllIIllIIlI(i5, lIlllIllIIII[71])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[72]) && lllIllIIllIIlI(i5, lIlllIllIIII[73])) {
                    return new C0014an(EnumC0021au.CABBAGE, EnumC0039n.DISEASED, i5 - lIlllIllIIII[71]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[74]) && lllIllIIllIIlI(i5, lIlllIllIIII[75])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[76]) && lllIllIIllIIlI(i5, lIlllIllIIII[77])) {
                    return new C0014an(EnumC0021au.TOMATO, EnumC0039n.DISEASED, i5 - lIlllIllIIII[75]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[78]) && lllIllIIllIIlI(i5, lIlllIllIIII[79])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[80]) && lllIllIIllIIlI(i5, lIlllIllIIII[81])) {
                    return new C0014an(EnumC0021au.SWEETCORN, EnumC0039n.DISEASED, i5 - lIlllIllIIII[79]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[82]) && lllIllIIllIIlI(i5, lIlllIllIIII[83])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[84]) && lllIllIIllIIlI(i5, lIlllIllIIII[85])) {
                    return new C0014an(EnumC0021au.STRAWBERRY, EnumC0039n.DISEASED, i5 - lIlllIllIIII[83]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[86]) && lllIllIIllIIlI(i5, lIlllIllIIII[87])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[88]) && lllIllIIllIIlI(i5, lIlllIllIIII[89])) {
                    return new C0014an(EnumC0021au.WATERMELON, EnumC0039n.DISEASED, i5 - lIlllIllIIII[87]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[90]) && lllIllIIllIIlI(i5, lIlllIllIIII[91])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[92]) && lllIllIIllIIlI(i5, lIlllIllIIII[93])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.DEAD, i5 - lIlllIllIIII[91]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[94]) && lllIllIIllIIlI(i5, lIlllIllIIII[95])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.DISEASED, i5 - lIlllIllIIII[93]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[96]) && lllIllIIllIIlI(i5, lIlllIllIIII[97])) {
                    return new C0014an(EnumC0021au.POTATO, EnumC0039n.DEAD, i5 - lIlllIllIIII[95]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[98]) && lllIllIIllIIlI(i5, lIlllIllIIII[99])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.DISEASED, (lIlllIllIIII[0] + i5) - lIlllIllIIII[97]);
                }
                if (lllIllIIllIlII(i5, lIlllIllIIII[100])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[101]) && lllIllIIllIIlI(i5, lIlllIllIIII[102])) {
                    return new C0014an(EnumC0021au.ONION, EnumC0039n.DEAD, i5 - lIlllIllIIII[100]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[103]) && lllIllIIllIIlI(i5, lIlllIllIIII[104])) {
                    return new C0014an(EnumC0021au.SNAPE_GRASS, EnumC0039n.DEAD, (lIlllIllIIII[0] + i5) - lIlllIllIIII[102]);
                }
                if (lllIllIIllIlII(i5, lIlllIllIIII[105])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[106]) && lllIllIIllIIlI(i5, lIlllIllIIII[107])) {
                    return new C0014an(EnumC0021au.CABBAGE, EnumC0039n.DEAD, i5 - lIlllIllIIII[105]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[108]) && lllIllIIllIIlI(i5, lIlllIllIIII[109])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[110]) && lllIllIIllIIlI(i5, lIlllIllIIII[111])) {
                    return new C0014an(EnumC0021au.TOMATO, EnumC0039n.DEAD, i5 - lIlllIllIIII[109]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[112]) && lllIllIIllIIlI(i5, lIlllIllIIII[113])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[114]) && lllIllIIllIIlI(i5, lIlllIllIIII[115])) {
                    return new C0014an(EnumC0021au.SWEETCORN, EnumC0039n.DEAD, i5 - lIlllIllIIII[113]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[116]) && lllIllIIllIIlI(i5, lIlllIllIIII[117])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[118]) && lllIllIIllIIlI(i5, lIlllIllIIII[119])) {
                    return new C0014an(EnumC0021au.STRAWBERRY, EnumC0039n.DEAD, i5 - lIlllIllIIII[117]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[120]) && lllIllIIllIIlI(i5, lIlllIllIIII[121])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[122]) && lllIllIIllIIlI(i5, lIlllIllIIII[123])) {
                    return new C0014an(EnumC0021au.WATERMELON, EnumC0039n.DEAD, i5 - lIlllIllIIII[121]);
                }
                if (lllIllIIllIIll(i5, lIlllIllIIII[124]) && lllIllIIllIIlI(i5, lIlllIllIIII[125])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIllIIII[0]);
                }
                return null;
            }
        };
        final String str9 = llIIIIllIIlI[llIIIIllIIll[8]];
        final int i5 = llIIIIllIIll[4];
        final A a5 = A.HERB;
        final String str10 = llIIIIllIIlI[llIIIIllIIll[9]];
        final String str11 = llIIIIllIIlI[llIIIIllIIll[10]];
        final ?? r7 = llIIIIllIIll[1];
        HERB = new P(str9, i5, a5, str10, str11, r7) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ah
            private static /* synthetic */ int[] llIIIIIIlIII;

            private static boolean llllIIIIlllllI(int i6, int i7) {
                return i6 <= i7;
            }

            private static void llllIIIIllllII() {
                llIIIIIIlIII = new int[104];
                llIIIIIIlIII[0] = "   ".length();
                llIIIIIIlIII[1] = 194 ^ 198;
                llIIIIIIlIII[2] = 182 ^ 177;
                llIIIIIIlIII[3] = (2 ^ 41) ^ (79 ^ 108);
                llIIIIIIlIII[4] = (62 ^ 74) ^ (86 ^ 40);
                llIIIIIIlIII[5] = (167 ^ 187) ^ (75 ^ 92);
                llIIIIIIlIII[6] = (87 ^ 110) ^ (241 ^ 198);
                llIIIIIIlIII[7] = 32 ^ 47;
                llIIIIIIlIII[8] = 36 ^ 53;
                llIIIIIIlIII[9] = (69 ^ 52) ^ (90 ^ 57);
                llIIIIIIlIII[10] = (44 ^ 111) ^ (61 ^ 107);
                llIIIIIIlIII[11] = (134 ^ 183) ^ (9 ^ 46);
                llIIIIIIlIII[12] = 73 ^ 81;
                llIIIIIIlIII[13] = 46 ^ 55;
                llIIIIIIlIII[14] = 77 ^ 81;
                llIIIIIIlIII[15] = (((87 + 39) - 105) + 112) ^ (((135 + 100) - 179) + 96);
                llIIIIIIlIII[16] = 73 ^ 86;
                llIIIIIIlIII[17] = (174 ^ 162) ^ (48 ^ 28);
                llIIIIIIlIII[18] = 67 ^ 96;
                llIIIIIIlIII[19] = 157 ^ 185;
                llIIIIIIlIII[20] = 9 ^ 47;
                llIIIIIIlIII[21] = (((123 + 115) - 169) + 92) ^ (((67 + 84) - 59) + 42);
                llIIIIIIlIII[22] = (67 ^ 83) ^ (26 ^ 32);
                llIIIIIIlIII[23] = (165 ^ 182) ^ (178 ^ 138);
                llIIIIIIlIII[24] = (21 ^ 68) ^ (34 ^ 94);
                llIIIIIIlIII[25] = (((19 + 96) - 7) + 58) ^ (((5 + 56) - (-2)) + 73);
                llIIIIIIlIII[26] = 186 ^ 139;
                llIIIIIIlIII[27] = 59 ^ 9;
                llIIIIIIlIII[28] = 89 ^ 109;
                llIIIIIIlIII[29] = (82 ^ 59) ^ (119 ^ 43);
                llIIIIIIlIII[30] = 54 ^ 14;
                llIIIIIIlIII[31] = (37 ^ 85) ^ (108 ^ 37);
                llIIIIIIlIII[32] = 158 ^ 165;
                llIIIIIIlIII[33] = 43 ^ 23;
                llIIIIIIlIII[34] = (132 ^ 161) ^ (3 ^ 101);
                llIIIIIIlIII[35] = (((119 + 182) - 201) + 103) ^ (((47 + 98) - 82) + 80);
                llIIIIIIlIII[36] = 12 ^ 75;
                llIIIIIIlIII[37] = 106 ^ 34;
                llIIIIIIlIII[38] = (117 ^ 60) ^ "   ".length();
                llIIIIIIlIII[39] = 19 ^ 88;
                llIIIIIIlIII[40] = (((70 + 108) - 110) + 69) ^ (((58 + 92) - 57) + 106);
                llIIIIIIlIII[41] = (26 ^ 43) ^ (199 ^ 185);
                llIIIIIIlIII[42] = 207 ^ 158;
                llIIIIIIlIII[43] = 43 ^ 121;
                llIIIIIIlIII[44] = 214 ^ 131;
                llIIIIIIlIII[45] = (((236 + 48) - 49) + 13) ^ (((147 + 86) - 177) + 118);
                llIIIIIIlIII[46] = 31 ^ 71;
                llIIIIIIlIII[47] = 152 ^ 193;
                llIIIIIIlIII[48] = 102 ^ 58;
                llIIIIIIlIII[49] = (107 ^ 86) ^ (92 ^ 60);
                llIIIIIIlIII[50] = (((183 + 15) - 89) + 83) ^ (((108 + 148) - 108) + 11);
                llIIIIIIlIII[51] = (((186 + 121) - 186) + 79) ^ (((153 + 32) - 112) + 95);
                llIIIIIIlIII[52] = (((50 + 1) - 11) + 87) ^ (218 ^ 198);
                llIIIIIIlIII[53] = 197 ^ 161;
                llIIIIIIlIII[54] = (36 ^ 23) ^ (25 ^ 76);
                llIIIIIIlIII[55] = (((30 + 105) - (-67)) + 30) ^ (((20 + 91) - 63) + 95);
                llIIIIIIlIII[56] = (0 ^ 116) ^ (31 ^ 1);
                llIIIIIIlIII[57] = (120 ^ 57) ^ (113 ^ 91);
                llIIIIIIlIII[58] = 48 ^ 93;
                llIIIIIIlIII[59] = (((224 ^ 165) + (168 ^ 175)) - (44 ^ 43)) + (96 ^ 91);
                llIIIIIIlIII[60] = ((((141 ^ 171) & ((16 ^ 54) ^ (-1))) + (90 ^ 38)) - ((220 ^ 141) & ((212 ^ 133) ^ (-1)))) + (129 ^ 135);
                llIIIIIIlIII[61] = ((118 + 75) - 77) + 11;
                llIIIIIIlIII[62] = (((92 ^ 89) + (206 ^ 148)) - (-(125 ^ 92))) + "   ".length();
                llIIIIIIlIII[63] = (((92 ^ 112) + (200 ^ 197)) - (-(150 ^ 144))) + (104 ^ 46);
                llIIIIIIlIII[64] = ((35 + 114) - 51) + 36;
                llIIIIIIlIII[65] = ((71 + 115) - 86) + 36;
                llIIIIIIlIII[66] = ((21 + 38) - 47) + 125;
                llIIIIIIlIII[67] = ((118 + 100) - 127) + 48;
                llIIIIIIlIII[68] = ((28 + 61) - (-1)) + 50;
                llIIIIIIlIII[69] = (((89 ^ 27) + (0 ^ 45)) - (81 ^ 1)) + (53 ^ 90);
                llIIIIIIlIII[70] = ((17 + 1) - (-93)) + 32;
                llIIIIIIlIII[71] = (((56 ^ 109) + (255 ^ 130)) - (116 ^ 55)) + "  ".length();
                llIIIIIIlIII[72] = ((88 + 129) - 122) + 51;
                llIIIIIIlIII[73] = ((120 + 133) - 236) + 131;
                llIIIIIIlIII[74] = (((105 ^ 82) + (71 ^ 27)) - (19 ^ 96)) + (115 ^ 2);
                llIIIIIIlIII[75] = (((175 ^ 185) + (105 ^ 81)) - (80 ^ 97)) + (214 ^ 172);
                llIIIIIIlIII[76] = ((91 + 46) - 13) + 28;
                llIIIIIIlIII[77] = (((154 ^ 182) + (104 ^ 74)) - (44 ^ 26)) + ((49 + 95) - 70) + 56;
                llIIIIIIlIII[78] = ((94 + 142) - 144) + 63;
                llIIIIIIlIII[79] = ((41 + 29) - 3) + 90;
                llIIIIIIlIII[80] = (((206 ^ 172) + (222 ^ 170)) - (90 ^ 42)) + (16 ^ 40);
                llIIIIIIlIII[81] = ((23 + 140) - 99) + 96;
                llIIIIIIlIII[82] = (((1 ^ 91) + (((60 + 115) - 60) + 30)) - (((146 + 26) - 53) + 82)) + ((24 + 55) - 23) + 71;
                llIIIIIIlIII[83] = ((119 + 100) - 172) + 116;
                llIIIIIIlIII[84] = ((6 + 89) - 49) + 118;
                llIIIIIIlIII[85] = ((31 + 19) - (-48)) + 68;
                llIIIIIIlIII[86] = (((89 ^ 113) + (202 ^ 189)) - (21 ^ 117)) + (203 ^ 163);
                llIIIIIIlIII[87] = (((199 ^ 134) + (((60 + 142) - 121) + 86)) - (((139 + 33) - 68) + 109)) + ((138 + 8) - 29) + 33;
                llIIIIIIlIII[88] = (((52 ^ 70) + (213 ^ 192)) - (16 ^ 62)) + (240 ^ 161);
                llIIIIIIlIII[89] = ((167 + 106) - 103) + 2;
                llIIIIIIlIII[90] = ((171 + 129) - 159) + 32;
                llIIIIIIlIII[91] = (((90 ^ 102) + (61 ^ 87)) - (13 ^ 126)) + ((14 + 56) - 59) + 129;
                llIIIIIIlIII[92] = (((163 ^ 180) + (69 ^ 5)) - (216 ^ 145)) + ((119 + 121) - 112) + 50;
                llIIIIIIlIII[93] = ((34 + 108) - (-16)) + 37;
                llIIIIIIlIII[94] = ((133 + 25) - 7) + 45;
                llIIIIIIlIII[95] = ((148 + 164) - 259) + 144;
                llIIIIIIlIII[96] = ((184 + 19) - 57) + 52;
                llIIIIIIlIII[97] = (((157 ^ 194) + (((167 + 142) - 122) + 2)) - (((86 + 174) - 206) + 146)) + (6 ^ 114);
                llIIIIIIlIII[98] = (((((55 + 3) - 19) + 96) + (0 ^ 122)) - (((34 + 0) - 1) + 220)) + ((114 + 97) - 71) + 57;
                llIIIIIIlIII[99] = (((((74 + 95) - 35) + 50) + (247 ^ 131)) - ((-26769) & 27067)) + ((15 + 143) - 60) + 104;
                llIIIIIIlIII[100] = ((121 + 135) - 196) + 144;
                llIIIIIIlIII[101] = ((73 + 117) - (-19)) + 10;
                llIIIIIIlIII[102] = ((167 + 163) - 238) + 129;
                llIIIIIIlIII[103] = ((232 + 12) - 167) + 178;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i6) {
                if (llllIIIIllllIl(i6) && llllIIIIlllllI(i6, llIIIIIIlIII[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIlIII[0] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[1]) && llllIIIIlllllI(i6, llIIIIIIlIII[2])) {
                    return new C0014an(EnumC0021au.GUAM, EnumC0039n.GROWING, i6 - llIIIIIIlIII[1]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[3]) && llllIIIIlllllI(i6, llIIIIIIlIII[4])) {
                    return new C0014an(EnumC0021au.GUAM, EnumC0039n.HARVESTABLE, llIIIIIIlIII[4] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[5]) && llllIIIIlllllI(i6, llIIIIIIlIII[6])) {
                    return new C0014an(EnumC0021au.MARRENTILL, EnumC0039n.GROWING, i6 - llIIIIIIlIII[5]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[7]) && llllIIIIlllllI(i6, llIIIIIIlIII[8])) {
                    return new C0014an(EnumC0021au.MARRENTILL, EnumC0039n.HARVESTABLE, llIIIIIIlIII[8] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[9]) && llllIIIIlllllI(i6, llIIIIIIlIII[10])) {
                    return new C0014an(EnumC0021au.TARROMIN, EnumC0039n.GROWING, i6 - llIIIIIIlIII[9]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[11]) && llllIIIIlllllI(i6, llIIIIIIlIII[12])) {
                    return new C0014an(EnumC0021au.TARROMIN, EnumC0039n.HARVESTABLE, llIIIIIIlIII[12] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[13]) && llllIIIIlllllI(i6, llIIIIIIlIII[14])) {
                    return new C0014an(EnumC0021au.HARRALANDER, EnumC0039n.GROWING, i6 - llIIIIIIlIII[13]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[15]) && llllIIIIlllllI(i6, llIIIIIIlIII[16])) {
                    return new C0014an(EnumC0021au.HARRALANDER, EnumC0039n.HARVESTABLE, llIIIIIIlIII[16] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[17]) && llllIIIIlllllI(i6, llIIIIIIlIII[18])) {
                    return new C0014an(EnumC0021au.RANARR, EnumC0039n.GROWING, i6 - llIIIIIIlIII[17]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[19]) && llllIIIIlllllI(i6, llIIIIIIlIII[20])) {
                    return new C0014an(EnumC0021au.RANARR, EnumC0039n.HARVESTABLE, llIIIIIIlIII[20] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[21]) && llllIIIIlllllI(i6, llIIIIIIlIII[22])) {
                    return new C0014an(EnumC0021au.TOADFLAX, EnumC0039n.GROWING, i6 - llIIIIIIlIII[21]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[23]) && llllIIIIlllllI(i6, llIIIIIIlIII[24])) {
                    return new C0014an(EnumC0021au.TOADFLAX, EnumC0039n.HARVESTABLE, llIIIIIIlIII[24] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[25]) && llllIIIIlllllI(i6, llIIIIIIlIII[26])) {
                    return new C0014an(EnumC0021au.IRIT, EnumC0039n.GROWING, i6 - llIIIIIIlIII[25]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[27]) && llllIIIIlllllI(i6, llIIIIIIlIII[28])) {
                    return new C0014an(EnumC0021au.IRIT, EnumC0039n.HARVESTABLE, llIIIIIIlIII[28] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[29]) && llllIIIIlllllI(i6, llIIIIIIlIII[30])) {
                    return new C0014an(EnumC0021au.AVANTOE, EnumC0039n.GROWING, i6 - llIIIIIIlIII[29]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[31]) && llllIIIIlllllI(i6, llIIIIIIlIII[32])) {
                    return new C0014an(EnumC0021au.AVANTOE, EnumC0039n.HARVESTABLE, llIIIIIIlIII[32] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[33]) && llllIIIIlllllI(i6, llIIIIIIlIII[34])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIlIII[0]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[35]) && llllIIIIlllllI(i6, llIIIIIIlIII[36])) {
                    return new C0014an(EnumC0021au.KWUARM, EnumC0039n.GROWING, i6 - llIIIIIIlIII[35]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[37]) && llllIIIIlllllI(i6, llIIIIIIlIII[38])) {
                    return new C0014an(EnumC0021au.KWUARM, EnumC0039n.HARVESTABLE, llIIIIIIlIII[38] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[39]) && llllIIIIlllllI(i6, llIIIIIIlIII[40])) {
                    return new C0014an(EnumC0021au.SNAPDRAGON, EnumC0039n.GROWING, i6 - llIIIIIIlIII[39]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[41]) && llllIIIIlllllI(i6, llIIIIIIlIII[42])) {
                    return new C0014an(EnumC0021au.SNAPDRAGON, EnumC0039n.HARVESTABLE, llIIIIIIlIII[42] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[43]) && llllIIIIlllllI(i6, llIIIIIIlIII[44])) {
                    return new C0014an(EnumC0021au.CADANTINE, EnumC0039n.GROWING, i6 - llIIIIIIlIII[43]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[45]) && llllIIIIlllllI(i6, llIIIIIIlIII[46])) {
                    return new C0014an(EnumC0021au.CADANTINE, EnumC0039n.HARVESTABLE, llIIIIIIlIII[46] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[47]) && llllIIIIlllllI(i6, llIIIIIIlIII[48])) {
                    return new C0014an(EnumC0021au.LANTADYME, EnumC0039n.GROWING, i6 - llIIIIIIlIII[47]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[49]) && llllIIIIlllllI(i6, llIIIIIIlIII[50])) {
                    return new C0014an(EnumC0021au.LANTADYME, EnumC0039n.HARVESTABLE, llIIIIIIlIII[50] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[51]) && llllIIIIlllllI(i6, llIIIIIIlIII[52])) {
                    return new C0014an(EnumC0021au.DWARF_WEED, EnumC0039n.GROWING, i6 - llIIIIIIlIII[51]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[53]) && llllIIIIlllllI(i6, llIIIIIIlIII[54])) {
                    return new C0014an(EnumC0021au.DWARF_WEED, EnumC0039n.HARVESTABLE, llIIIIIIlIII[54] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[55]) && llllIIIIlllllI(i6, llIIIIIIlIII[56])) {
                    return new C0014an(EnumC0021au.TORSTOL, EnumC0039n.GROWING, i6 - llIIIIIIlIII[55]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[57]) && llllIIIIlllllI(i6, llIIIIIIlIII[58])) {
                    return new C0014an(EnumC0021au.TORSTOL, EnumC0039n.HARVESTABLE, llIIIIIIlIII[58] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[59]) && llllIIIIlllllI(i6, llIIIIIIlIII[60])) {
                    return new C0014an(EnumC0021au.GUAM, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[61]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[62]) && llllIIIIlllllI(i6, llIIIIIIlIII[63])) {
                    return new C0014an(EnumC0021au.MARRENTILL, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[60]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[64]) && llllIIIIlllllI(i6, llIIIIIIlIII[65])) {
                    return new C0014an(EnumC0021au.TARROMIN, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[63]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[66]) && llllIIIIlllllI(i6, llIIIIIIlIII[67])) {
                    return new C0014an(EnumC0021au.HARRALANDER, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[65]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[68]) && llllIIIIlllllI(i6, llIIIIIIlIII[69])) {
                    return new C0014an(EnumC0021au.RANARR, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[67]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[70]) && llllIIIIlllllI(i6, llIIIIIIlIII[71])) {
                    return new C0014an(EnumC0021au.TOADFLAX, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[69]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[72]) && llllIIIIlllllI(i6, llIIIIIIlIII[73])) {
                    return new C0014an(EnumC0021au.IRIT, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[71]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[74]) && llllIIIIlllllI(i6, llIIIIIIlIII[75])) {
                    return new C0014an(EnumC0021au.AVANTOE, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[73]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[76]) && llllIIIIlllllI(i6, llIIIIIIlIII[77])) {
                    return new C0014an(EnumC0021au.KWUARM, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[75]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[78]) && llllIIIIlllllI(i6, llIIIIIIlIII[79])) {
                    return new C0014an(EnumC0021au.SNAPDRAGON, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[77]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[80]) && llllIIIIlllllI(i6, llIIIIIIlIII[81])) {
                    return new C0014an(EnumC0021au.CADANTINE, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[79]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[82]) && llllIIIIlllllI(i6, llIIIIIIlIII[83])) {
                    return new C0014an(EnumC0021au.LANTADYME, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[81]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[84]) && llllIIIIlllllI(i6, llIIIIIIlIII[85])) {
                    return new C0014an(EnumC0021au.DWARF_WEED, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[83]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[86]) && llllIIIIlllllI(i6, llIIIIIIlIII[87])) {
                    return new C0014an(EnumC0021au.TORSTOL, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[85]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[88]) && llllIIIIlllllI(i6, llIIIIIIlIII[89])) {
                    return new C0014an(EnumC0021au.ANYHERB, EnumC0039n.DEAD, i6 - llIIIIIIlIII[87]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[90]) && llllIIIIlllllI(i6, llIIIIIIlIII[91])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIlIII[0]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[92]) && llllIIIIlllllI(i6, llIIIIIIlIII[93])) {
                    return new C0014an(EnumC0021au.GOUTWEED, EnumC0039n.GROWING, i6 - llIIIIIIlIII[92]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[94]) && llllIIIIlllllI(i6, llIIIIIIlIII[95])) {
                    return new C0014an(EnumC0021au.GOUTWEED, EnumC0039n.HARVESTABLE, llIIIIIIlIII[95] - i6);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[96]) && llllIIIIlllllI(i6, llIIIIIIlIII[97])) {
                    return new C0014an(EnumC0021au.GOUTWEED, EnumC0039n.DISEASED, i6 - llIIIIIIlIII[95]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[98]) && llllIIIIlllllI(i6, llIIIIIIlIII[99])) {
                    return new C0014an(EnumC0021au.GOUTWEED, EnumC0039n.DEAD, i6 - llIIIIIIlIII[97]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[100]) && llllIIIIlllllI(i6, llIIIIIIlIII[101])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIlIII[0]);
                }
                if (llllIIIIllllll(i6, llIIIIIIlIII[102]) && llllIIIIlllllI(i6, llIIIIIIlIII[103])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIlIII[0]);
                }
                return null;
            }

            private static boolean llllIIIIllllll(int i6, int i7) {
                return i6 >= i7;
            }

            private static boolean llllIIIIllllIl(int i6) {
                return i6 >= 0;
            }

            static {
                llllIIIIllllII();
            }
        };
        final String str12 = llIIIIllIIlI[llIIIIllIIll[11]];
        final int i6 = llIIIIllIIll[5];
        final A a6 = A.FLOWER;
        final String str13 = llIIIIllIIlI[llIIIIllIIll[12]];
        final ?? r65 = llIIIIllIIll[1];
        FLOWER = new P(str12, i6, a6, str13, r65) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ai
            private static /* synthetic */ int[] llIIIIlllIIl;

            static {
                llllIIllIlIIll();
            }

            private static boolean llllIIllIlIllI(int i7, int i8) {
                return i7 >= i8;
            }

            private static boolean llllIIllIlIlIl(int i7, int i8) {
                return i7 <= i8;
            }

            private static boolean llllIIllIlIlII(int i7) {
                return i7 >= 0;
            }

            private static void llllIIllIlIIll() {
                llIIIIlllIIl = new int[91];
                llIIIIlllIIl[0] = "   ".length();
                llIIIIlllIIl[1] = (((138 + 15) - 31) + 48) ^ (((155 + 32) - 127) + 114);
                llIIIIlllIIl[2] = (((144 + 27) - 141) + 156) ^ (((97 + 147) - 119) + 64);
                llIIIIlllIIl[3] = 52 ^ 60;
                llIIIIlllIIl[4] = 108 ^ 103;
                llIIIIlllIIl[5] = 127 ^ 115;
                llIIIIlllIIl[6] = ((76 ^ 125) ^ "   ".length()) & (((3 ^ 22) ^ (22 ^ 49)) ^ (-" ".length()));
                llIIIIlllIIl[7] = (64 ^ 111) ^ (152 ^ 186);
                llIIIIlllIIl[8] = 120 ^ 104;
                llIIIIlllIIl[9] = (((55 + 37) - 38) + 123) ^ (((44 + 99) - 100) + 117);
                llIIIIlllIIl[10] = 96 ^ 114;
                llIIIIlllIIl[11] = 113 ^ 100;
                llIIIIlllIIl[12] = (14 ^ 85) ^ (201 ^ 132);
                llIIIIlllIIl[13] = 174 ^ 185;
                llIIIIlllIIl[14] = 108 ^ 118;
                llIIIIlllIIl[15] = 172 ^ 183;
                llIIIIlllIIl[16] = (12 ^ 121) ^ (203 ^ 162);
                llIIIIlllIIl[17] = (94 ^ 110) ^ (182 ^ 153);
                llIIIIlllIIl[18] = (((188 + 68) - 163) + 138) ^ (((60 + 80) - (-32)) + 27);
                llIIIIlllIIl[19] = (27 ^ 111) ^ (33 ^ 116);
                llIIIIlllIIl[20] = (15 ^ 36) ^ (175 ^ 167);
                llIIIIlllIIl[21] = (87 ^ 94) ^ (149 ^ 184);
                llIIIIlllIIl[22] = 13 ^ 40;
                llIIIIlllIIl[23] = 9 ^ 33;
                llIIIIlllIIl[24] = 118 ^ 95;
                llIIIIlllIIl[25] = (32 ^ 53) ^ (182 ^ 137);
                llIIIIlllIIl[26] = 63 ^ 120;
                llIIIIlllIIl[27] = (48 ^ 2) ^ (202 ^ 176);
                llIIIIlllIIl[28] = 57 ^ 114;
                llIIIIlllIIl[29] = (((37 + 115) - 101) + 203) ^ (((119 + 162) - 164) + 61);
                llIIIIlllIIl[30] = (118 ^ 64) ^ (79 ^ 52);
                llIIIIlllIIl[31] = 93 ^ 13;
                llIIIIlllIIl[32] = 57 ^ 104;
                llIIIIlllIIl[33] = 244 ^ 166;
                llIIIIlllIIl[34] = (70 ^ 37) ^ (164 ^ 146);
                llIIIIlllIIl[35] = (73 ^ 124) ^ (210 ^ 177);
                llIIIIlllIIl[36] = (238 ^ 199) ^ (191 ^ 193);
                llIIIIlllIIl[37] = (63 ^ 74) ^ (234 ^ 197);
                llIIIIlllIIl[38] = (29 ^ 13) ^ (111 ^ 36);
                llIIIIlllIIl[39] = 32 ^ 124;
                llIIIIlllIIl[40] = 3 ^ 92;
                llIIIIlllIIl[41] = 117 ^ 21;
                llIIIIlllIIl[42] = (((66 + 36) - (-7)) + 83) ^ (((61 + 17) - 50) + 136);
                llIIIIlllIIl[43] = (40 ^ 101) ^ (33 ^ 9);
                llIIIIlllIIl[44] = (64 ^ 51) ^ (93 ^ 70);
                llIIIIlllIIl[45] = 86 ^ 63;
                llIIIIlllIIl[46] = ((74 + 7) - 34) + 89;
                llIIIIlllIIl[47] = (((28 ^ 8) + (216 ^ 174)) - (13 ^ 67)) + (59 ^ 118);
                llIIIIlllIIl[48] = ((48 + 100) - 70) + 61;
                llIIIIlllIIl[49] = (((51 ^ 125) + (3 ^ 33)) - (130 ^ 188)) + (255 ^ 165);
                llIIIIlllIIl[50] = ((105 + 30) - 40) + 46;
                llIIIIlllIIl[51] = ((33 + 40) - 59) + 128;
                llIIIIlllIIl[52] = (((81 ^ 76) + (82 ^ 7)) - (-(58 ^ 63))) + (119 ^ 110);
                llIIIIlllIIl[53] = (((226 ^ 154) + (81 ^ 32)) - (206 ^ 163)) + (146 ^ 135);
                llIIIIlllIIl[54] = (((8 ^ 86) + (15 ^ 62)) - (((98 + 52) - 141) + 124)) + ((33 + 68) - (-8)) + 27;
                llIIIIlllIIl[55] = ((118 + 95) - 88) + 22;
                llIIIIlllIIl[56] = (((9 ^ 95) + (7 ^ 83)) - (239 ^ 174)) + (173 ^ 129);
                llIIIIlllIIl[57] = ((103 + 128) - 154) + 73;
                llIIIIlllIIl[58] = (((162 ^ 170) + (154 ^ 192)) - (73 ^ 91)) + (64 ^ 7);
                llIIIIlllIIl[59] = (((100 ^ 87) + (107 ^ 19)) - (20 ^ 10)) + (89 ^ 82);
                llIIIIlllIIl[60] = (((46 ^ 121) + (((50 + 81) - 72) + 68)) - (239 ^ 172)) + (118 ^ 113);
                llIIIIlllIIl[61] = ((133 + 15) - 104) + 111;
                llIIIIlllIIl[62] = ((25 + 22) - (-60)) + 49;
                llIIIIlllIIl[63] = ((52 + 25) - (-69)) + 11;
                llIIIIlllIIl[64] = ((14 + 103) - 78) + 120;
                llIIIIlllIIl[65] = ((116 + 99) - 64) + 9;
                llIIIIlllIIl[66] = (((100 ^ 112) + (111 ^ 50)) - (94 ^ 123)) + (47 ^ 118);
                llIIIIlllIIl[67] = (((27 ^ 101) + (194 ^ 180)) - (209 ^ 191)) + (16 ^ 48);
                llIIIIlllIIl[68] = (((70 ^ 34) + (178 ^ 182)) - (212 ^ 156)) + ((47 + 78) - 79) + 90;
                llIIIIlllIIl[69] = (((82 ^ 3) + (122 ^ 31)) - (178 ^ 194)) + (41 ^ 74);
                llIIIIlllIIl[70] = ((185 + 100) - 251) + 166;
                llIIIIlllIIl[71] = ((109 + 66) - 113) + 139;
                llIIIIlllIIl[72] = (((((118 + 124) - 115) + 34) + (184 ^ 153)) - (((106 + 126) - 167) + 102)) + ((6 + 173) - 145) + 143;
                llIIIIlllIIl[73] = ((9 + 95) - (-61)) + 40;
                llIIIIlllIIl[74] = ((113 + 96) - 112) + 109;
                llIIIIlllIIl[75] = (("   ".length() + (192 ^ 166)) - (-(78 ^ 14))) + (164 ^ 140);
                llIIIIlllIIl[76] = (((((37 + 98) - (-13)) + 2) + (((37 + 141) - 88) + 52)) - (((107 + 102) - 129) + 52)) + (14 ^ 60);
                llIIIIlllIIl[77] = ((66 + 29) - (-57)) + 59;
                llIIIIlllIIl[78] = ((137 + 134) - 222) + 165;
                llIIIIlllIIl[79] = (((((69 + 75) - 135) + 122) + (175 ^ 194)) - (105 ^ 6)) + (37 ^ 115);
                llIIIIlllIIl[80] = (((((127 + 9) - 9) + 33) + (106 ^ 96)) - (86 ^ 120)) + (204 ^ 144);
                llIIIIlllIIl[81] = ((61 + 119) - 146) + 185;
                llIIIIlllIIl[82] = (((255 ^ 171) + (((195 + 92) - 271) + 193)) - (0 ^ 92)) + (183 ^ 164);
                llIIIIlllIIl[83] = (((((35 + 66) - 89) + 125) + (232 ^ 173)) - (((155 + 97) - 236) + 144)) + ((81 + 60) - 134) + 168;
                llIIIIlllIIl[84] = (((103 ^ 47) + (85 ^ 55)) - (158 ^ 194)) + ((67 + 105) - 113) + 87;
                llIIIIlllIIl[85] = ((132 + 179) - 304) + 218;
                llIIIIlllIIl[86] = (((((22 + 102) - (-23)) + 20) + (22 ^ 122)) - (((128 + 6) - 27) + 58)) + (15 ^ 120);
                llIIIIlllIIl[87] = (((((60 + 169) - 205) + 204) + (113 ^ 13)) - (((39 + 10) - (-61)) + 17)) + (118 ^ 115);
                llIIIIlllIIl[88] = (((222 ^ 149) + (136 ^ 134)) - (-(124 ^ 80))) + (127 ^ 27);
                llIIIIlllIIl[89] = ((48 + 229) - 99) + 56;
                llIIIIlllIIl[90] = ((169 + 86) - 201) + 201;
            }

            private static boolean llllIIllIlIlll(int i7, int i8) {
                return i7 == i8;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i7) {
                if (llllIIllIlIlII(i7) && llllIIllIlIlIl(i7, llIIIIlllIIl[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0] - i7);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[1]) && llllIIllIlIlIl(i7, llIIIIlllIIl[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[3]) && llllIIllIlIlIl(i7, llIIIIlllIIl[4])) {
                    return new C0014an(EnumC0021au.MARIGOLD, EnumC0039n.GROWING, i7 - llIIIIlllIIl[3]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[5])) {
                    return new C0014an(EnumC0021au.MARIGOLD, EnumC0039n.HARVESTABLE, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[7]) && llllIIllIlIlIl(i7, llIIIIlllIIl[8])) {
                    return new C0014an(EnumC0021au.ROSEMARY, EnumC0039n.GROWING, i7 - llIIIIlllIIl[7]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[9])) {
                    return new C0014an(EnumC0021au.ROSEMARY, EnumC0039n.HARVESTABLE, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[10]) && llllIIllIlIlIl(i7, llIIIIlllIIl[11])) {
                    return new C0014an(EnumC0021au.NASTURTIUM, EnumC0039n.GROWING, i7 - llIIIIlllIIl[10]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[12])) {
                    return new C0014an(EnumC0021au.NASTURTIUM, EnumC0039n.HARVESTABLE, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[13]) && llllIIllIlIlIl(i7, llIIIIlllIIl[14])) {
                    return new C0014an(EnumC0021au.WOAD, EnumC0039n.GROWING, i7 - llIIIIlllIIl[13]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[15])) {
                    return new C0014an(EnumC0021au.WOAD, EnumC0039n.HARVESTABLE, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[16]) && llllIIllIlIlIl(i7, llIIIIlllIIl[17])) {
                    return new C0014an(EnumC0021au.LIMPWURT, EnumC0039n.GROWING, i7 - llIIIIlllIIl[16]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[18])) {
                    return new C0014an(EnumC0021au.LIMPWURT, EnumC0039n.HARVESTABLE, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[19]) && llllIIllIlIlIl(i7, llIIIIlllIIl[20])) {
                    return new C0014an(EnumC0021au.SCARECROW, EnumC0039n.GROWING, llIIIIlllIIl[20] - i7);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[21])) {
                    return new C0014an(EnumC0021au.SCARECROW, EnumC0039n.GROWING, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[22]) && llllIIllIlIlIl(i7, llIIIIlllIIl[23])) {
                    return new C0014an(EnumC0021au.WHITE_LILY, EnumC0039n.GROWING, i7 - llIIIIlllIIl[22]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[24])) {
                    return new C0014an(EnumC0021au.WHITE_LILY, EnumC0039n.HARVESTABLE, llIIIIlllIIl[6]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[25]) && llllIIllIlIlIl(i7, llIIIIlllIIl[26])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[27]) && llllIIllIlIlIl(i7, llIIIIlllIIl[28])) {
                    return new C0014an(EnumC0021au.MARIGOLD, EnumC0039n.GROWING, i7 - llIIIIlllIIl[27]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[29])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[30]) && llllIIllIlIlIl(i7, llIIIIlllIIl[31])) {
                    return new C0014an(EnumC0021au.ROSEMARY, EnumC0039n.GROWING, i7 - llIIIIlllIIl[30]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[32])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[33]) && llllIIllIlIlIl(i7, llIIIIlllIIl[34])) {
                    return new C0014an(EnumC0021au.NASTURTIUM, EnumC0039n.GROWING, i7 - llIIIIlllIIl[33]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[35])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[36]) && llllIIllIlIlIl(i7, llIIIIlllIIl[37])) {
                    return new C0014an(EnumC0021au.WOAD, EnumC0039n.GROWING, i7 - llIIIIlllIIl[36]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[38])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[39]) && llllIIllIlIlIl(i7, llIIIIlllIIl[40])) {
                    return new C0014an(EnumC0021au.LIMPWURT, EnumC0039n.GROWING, i7 - llIIIIlllIIl[39]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[41]) && llllIIllIlIlIl(i7, llIIIIlllIIl[42])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[43]) && llllIIllIlIlIl(i7, llIIIIlllIIl[44])) {
                    return new C0014an(EnumC0021au.WHITE_LILY, EnumC0039n.GROWING, i7 - llIIIIlllIIl[43]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[45]) && llllIIllIlIlIl(i7, llIIIIlllIIl[46])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[47]) && llllIIllIlIlIl(i7, llIIIIlllIIl[48])) {
                    return new C0014an(EnumC0021au.MARIGOLD, EnumC0039n.DISEASED, i7 - llIIIIlllIIl[46]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[49]) && llllIIllIlIlIl(i7, llIIIIlllIIl[50])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[51]) && llllIIllIlIlIl(i7, llIIIIlllIIl[52])) {
                    return new C0014an(EnumC0021au.ROSEMARY, EnumC0039n.DISEASED, i7 - llIIIIlllIIl[50]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[53]) && llllIIllIlIlIl(i7, llIIIIlllIIl[54])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[55]) && llllIIllIlIlIl(i7, llIIIIlllIIl[56])) {
                    return new C0014an(EnumC0021au.NASTURTIUM, EnumC0039n.DISEASED, i7 - llIIIIlllIIl[54]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[57]) && llllIIllIlIlIl(i7, llIIIIlllIIl[58])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[59]) && llllIIllIlIlIl(i7, llIIIIlllIIl[60])) {
                    return new C0014an(EnumC0021au.WOAD, EnumC0039n.DISEASED, i7 - llIIIIlllIIl[58]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[61]) && llllIIllIlIlIl(i7, llIIIIlllIIl[62])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[63]) && llllIIllIlIlIl(i7, llIIIIlllIIl[64])) {
                    return new C0014an(EnumC0021au.LIMPWURT, EnumC0039n.DISEASED, i7 - llIIIIlllIIl[62]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[65]) && llllIIllIlIlIl(i7, llIIIIlllIIl[66])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[67]) && llllIIllIlIlIl(i7, llIIIIlllIIl[68])) {
                    return new C0014an(EnumC0021au.WHITE_LILY, EnumC0039n.DISEASED, i7 - llIIIIlllIIl[66]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[69]) && llllIIllIlIlIl(i7, llIIIIlllIIl[70])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[71]) && llllIIllIlIlIl(i7, llIIIIlllIIl[72])) {
                    return new C0014an(EnumC0021au.MARIGOLD, EnumC0039n.DEAD, i7 - llIIIIlllIIl[70]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[73])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[74]) && llllIIllIlIlIl(i7, llIIIIlllIIl[75])) {
                    return new C0014an(EnumC0021au.ROSEMARY, EnumC0039n.DEAD, i7 - llIIIIlllIIl[73]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[76])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[77]) && llllIIllIlIlIl(i7, llIIIIlllIIl[78])) {
                    return new C0014an(EnumC0021au.NASTURTIUM, EnumC0039n.DEAD, i7 - llIIIIlllIIl[76]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[79])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[80]) && llllIIllIlIlIl(i7, llIIIIlllIIl[81])) {
                    return new C0014an(EnumC0021au.WOAD, EnumC0039n.DEAD, i7 - llIIIIlllIIl[79]);
                }
                if (llllIIllIlIlll(i7, llIIIIlllIIl[82])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[83]) && llllIIllIlIlIl(i7, llIIIIlllIIl[84])) {
                    return new C0014an(EnumC0021au.LIMPWURT, EnumC0039n.DEAD, i7 - llIIIIlllIIl[82]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[85]) && llllIIllIlIlIl(i7, llIIIIlllIIl[86])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[87]) && llllIIllIlIlIl(i7, llIIIIlllIIl[88])) {
                    return new C0014an(EnumC0021au.WHITE_LILY, EnumC0039n.DEAD, i7 - llIIIIlllIIl[86]);
                }
                if (llllIIllIlIllI(i7, llIIIIlllIIl[89]) && llllIIllIlIlIl(i7, llIIIIlllIIl[90])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIIl[0]);
                }
                return null;
            }
        };
        final String str14 = llIIIIllIIlI[llIIIIllIIll[13]];
        final int i7 = llIIIIllIIll[6];
        final A a7 = A.BUSH;
        final String str15 = llIIIIllIIlI[llIIIIllIIll[14]];
        final ?? r66 = llIIIIllIIll[0];
        BUSH = new P(str14, i7, a7, str15, r66) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.aj
            private static /* synthetic */ int[] lIlllIlllIII;

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i8) {
                if (lllIllIlIIIllI(i8) && lllIllIlIIIlll(i8, lIlllIlllIII[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0] - i8);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[1])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[2]) && lllIllIlIIIlll(i8, lIlllIlllIII[3])) {
                    return new C0014an(EnumC0021au.REDBERRIES, EnumC0039n.GROWING, i8 - lIlllIlllIII[2]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[4]) && lllIllIlIIIlll(i8, lIlllIlllIII[5])) {
                    return new C0014an(EnumC0021au.REDBERRIES, EnumC0039n.HARVESTABLE, i8 - lIlllIlllIII[4]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[6]) && lllIllIlIIIlll(i8, lIlllIlllIII[7])) {
                    return new C0014an(EnumC0021au.CADAVABERRIES, EnumC0039n.GROWING, i8 - lIlllIlllIII[6]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[8]) && lllIllIlIIIlll(i8, lIlllIlllIII[9])) {
                    return new C0014an(EnumC0021au.CADAVABERRIES, EnumC0039n.HARVESTABLE, i8 - lIlllIlllIII[8]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[10]) && lllIllIlIIIlll(i8, lIlllIlllIII[11])) {
                    return new C0014an(EnumC0021au.DWELLBERRIES, EnumC0039n.GROWING, i8 - lIlllIlllIII[10]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[12]) && lllIllIlIIIlll(i8, lIlllIlllIII[13])) {
                    return new C0014an(EnumC0021au.DWELLBERRIES, EnumC0039n.HARVESTABLE, i8 - lIlllIlllIII[12]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[14]) && lllIllIlIIIlll(i8, lIlllIlllIII[15])) {
                    return new C0014an(EnumC0021au.JANGERBERRIES, EnumC0039n.GROWING, i8 - lIlllIlllIII[14]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[16]) && lllIllIlIIIlll(i8, lIlllIlllIII[17])) {
                    return new C0014an(EnumC0021au.JANGERBERRIES, EnumC0039n.HARVESTABLE, i8 - lIlllIlllIII[16]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[18]) && lllIllIlIIIlll(i8, lIlllIlllIII[19])) {
                    return new C0014an(EnumC0021au.WHITEBERRIES, EnumC0039n.GROWING, i8 - lIlllIlllIII[18]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[20]) && lllIllIlIIIlll(i8, lIlllIlllIII[21])) {
                    return new C0014an(EnumC0021au.WHITEBERRIES, EnumC0039n.HARVESTABLE, i8 - lIlllIlllIII[20]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[22]) && lllIllIlIIIlll(i8, lIlllIlllIII[23])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[24]) && lllIllIlIIIlll(i8, lIlllIlllIII[25])) {
                    return new C0014an(EnumC0021au.REDBERRIES, EnumC0039n.DISEASED, i8 - lIlllIlllIII[23]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[26]) && lllIllIlIIIlll(i8, lIlllIlllIII[27])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[28]) && lllIllIlIIIlll(i8, lIlllIlllIII[29])) {
                    return new C0014an(EnumC0021au.CADAVABERRIES, EnumC0039n.DISEASED, i8 - lIlllIlllIII[27]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[30]) && lllIllIlIIIlll(i8, lIlllIlllIII[31])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[32]) && lllIllIlIIIlll(i8, lIlllIlllIII[33])) {
                    return new C0014an(EnumC0021au.DWELLBERRIES, EnumC0039n.DISEASED, i8 - lIlllIlllIII[31]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[34]) && lllIllIlIIIlll(i8, lIlllIlllIII[35])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[36]) && lllIllIlIIIlll(i8, lIlllIlllIII[37])) {
                    return new C0014an(EnumC0021au.JANGERBERRIES, EnumC0039n.DISEASED, i8 - lIlllIlllIII[35]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[38]) && lllIllIlIIIlll(i8, lIlllIlllIII[39])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[40]) && lllIllIlIIIlll(i8, lIlllIlllIII[41])) {
                    return new C0014an(EnumC0021au.WHITEBERRIES, EnumC0039n.DISEASED, i8 - lIlllIlllIII[39]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[42]) && lllIllIlIIIlll(i8, lIlllIlllIII[43])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[44]) && lllIllIlIIIlll(i8, lIlllIlllIII[45])) {
                    return new C0014an(EnumC0021au.REDBERRIES, EnumC0039n.DEAD, i8 - lIlllIlllIII[43]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[46]) && lllIllIlIIIlll(i8, lIlllIlllIII[47])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[48]) && lllIllIlIIIlll(i8, lIlllIlllIII[49])) {
                    return new C0014an(EnumC0021au.CADAVABERRIES, EnumC0039n.DEAD, i8 - lIlllIlllIII[47]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[50]) && lllIllIlIIIlll(i8, lIlllIlllIII[51])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[52]) && lllIllIlIIIlll(i8, lIlllIlllIII[53])) {
                    return new C0014an(EnumC0021au.DWELLBERRIES, EnumC0039n.DEAD, i8 - lIlllIlllIII[51]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[54]) && lllIllIlIIIlll(i8, lIlllIlllIII[55])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[56]) && lllIllIlIIIlll(i8, lIlllIlllIII[57])) {
                    return new C0014an(EnumC0021au.JANGERBERRIES, EnumC0039n.DEAD, i8 - lIlllIlllIII[55]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[58]) && lllIllIlIIIlll(i8, lIlllIlllIII[59])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[60]) && lllIllIlIIIlll(i8, lIlllIlllIII[61])) {
                    return new C0014an(EnumC0021au.WHITEBERRIES, EnumC0039n.DEAD, i8 - lIlllIlllIII[59]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[62]) && lllIllIlIIIlll(i8, lIlllIlllIII[63])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[64]) && lllIllIlIIIlll(i8, lIlllIlllIII[65])) {
                    return new C0014an(EnumC0021au.POISON_IVY, EnumC0039n.GROWING, i8 - lIlllIlllIII[64]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[66]) && lllIllIlIIIlll(i8, lIlllIlllIII[67])) {
                    return new C0014an(EnumC0021au.POISON_IVY, EnumC0039n.HARVESTABLE, i8 - lIlllIlllIII[66]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[68]) && lllIllIlIIIlll(i8, lIlllIlllIII[69])) {
                    return new C0014an(EnumC0021au.POISON_IVY, EnumC0039n.DISEASED, i8 - lIlllIlllIII[67]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[70]) && lllIllIlIIIlll(i8, lIlllIlllIII[71])) {
                    return new C0014an(EnumC0021au.POISON_IVY, EnumC0039n.DEAD, i8 - lIlllIlllIII[69]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[72])) {
                    return new C0014an(EnumC0021au.POISON_IVY, EnumC0039n.DISEASED, lIlllIlllIII[73]);
                }
                if (lllIllIlIIlIIl(i8, lIlllIlllIII[74]) && lllIllIlIIIlll(i8, lIlllIlllIII[75])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIII[0]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[76])) {
                    return new C0014an(EnumC0021au.REDBERRIES, EnumC0039n.GROWING, EnumC0021au.REDBERRIES.bc() - lIlllIlllIII[77]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[78])) {
                    return new C0014an(EnumC0021au.CADAVABERRIES, EnumC0039n.GROWING, EnumC0021au.CADAVABERRIES.bc() - lIlllIlllIII[77]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[79])) {
                    return new C0014an(EnumC0021au.DWELLBERRIES, EnumC0039n.GROWING, EnumC0021au.DWELLBERRIES.bc() - lIlllIlllIII[77]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[80])) {
                    return new C0014an(EnumC0021au.JANGERBERRIES, EnumC0039n.GROWING, EnumC0021au.JANGERBERRIES.bc() - lIlllIlllIII[77]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[81])) {
                    return new C0014an(EnumC0021au.WHITEBERRIES, EnumC0039n.GROWING, EnumC0021au.WHITEBERRIES.bc() - lIlllIlllIII[77]);
                }
                if (lllIllIlIIlIII(i8, lIlllIlllIII[82])) {
                    return new C0014an(EnumC0021au.POISON_IVY, EnumC0039n.GROWING, EnumC0021au.POISON_IVY.bc() - lIlllIlllIII[77]);
                }
                return null;
            }

            private static boolean lllIllIlIIlIIl(int i8, int i9) {
                return i8 >= i9;
            }

            static {
                lllIllIlIIIlIl();
            }

            private static boolean lllIllIlIIlIII(int i8, int i9) {
                return i8 == i9;
            }

            private static boolean lllIllIlIIIlll(int i8, int i9) {
                return i8 <= i9;
            }

            private static void lllIllIlIIIlIl() {
                lIlllIlllIII = new int[83];
                lIlllIlllIII[0] = "   ".length();
                lIlllIlllIII[1] = 108 ^ 104;
                lIlllIlllIII[2] = (((62 + 122) - 182) + 128) ^ (((10 + 62) - (-10)) + 53);
                lIlllIlllIII[3] = 115 ^ 122;
                lIlllIlllIII[4] = 109 ^ 103;
                lIlllIlllIII[5] = (34 ^ 9) ^ (147 ^ 182);
                lIlllIlllIII[6] = 178 ^ 189;
                lIlllIlllIII[7] = (58 ^ 8) ^ (126 ^ 88);
                lIlllIlllIII[8] = (0 ^ 24) ^ (81 ^ 92);
                lIlllIlllIII[9] = (215 ^ 175) ^ (247 ^ 150);
                lIlllIlllIII[10] = (186 ^ 144) ^ (246 ^ 198);
                lIlllIlllIII[11] = 78 ^ 110;
                lIlllIlllIII[12] = (204 ^ 174) ^ (78 ^ 13);
                lIlllIlllIII[13] = (27 ^ 30) ^ (12 ^ 44);
                lIlllIlllIII[14] = 164 ^ 130;
                lIlllIlllIII[15] = 131 ^ 174;
                lIlllIlllIII[16] = 235 ^ 197;
                lIlllIlllIII[17] = 63 ^ 13;
                lIlllIlllIII[18] = 113 ^ 66;
                lIlllIlllIII[19] = (((121 + 183) - 205) + 86) ^ (((48 + 123) - 42) + 2);
                lIlllIlllIII[20] = 119 ^ 76;
                lIlllIlllIII[21] = 27 ^ 36;
                lIlllIlllIII[22] = 82 ^ 18;
                lIlllIlllIII[23] = 66 ^ 7;
                lIlllIlllIII[24] = (147 ^ 179) ^ (85 ^ 51);
                lIlllIlllIII[25] = 193 ^ 139;
                lIlllIlllIII[26] = (169 ^ 193) ^ (88 ^ 123);
                lIlllIlllIII[27] = (((189 + 146) - 277) + 143) ^ (((59 + 87) - 84) + 72);
                lIlllIlllIII[28] = 8 ^ 88;
                lIlllIlllIII[29] = 219 ^ 142;
                lIlllIlllIII[30] = 203 ^ 157;
                lIlllIlllIII[31] = (159 ^ 165) ^ (6 ^ 102);
                lIlllIlllIII[32] = (128 ^ 155) ^ (254 ^ 190);
                lIlllIlllIII[33] = 250 ^ 155;
                lIlllIlllIII[34] = (((172 + 140) - 96) + 34) ^ (((43 + 6) - (-21)) + 82);
                lIlllIlllIII[35] = (189 ^ 181) ^ (72 ^ 38);
                lIlllIlllIII[36] = 91 ^ 60;
                lIlllIlllIII[37] = (94 ^ 67) ^ (47 ^ 92);
                lIlllIlllIII[38] = 31 ^ 112;
                lIlllIlllIII[39] = 203 ^ 184;
                lIlllIlllIII[40] = (131 ^ 135) ^ (0 ^ 112);
                lIlllIlllIII[41] = 230 ^ 157;
                lIlllIlllIII[42] = (0 ^ 63) ^ (193 ^ 130);
                lIlllIlllIII[43] = (((17 ^ 13) + (240 ^ 159)) - (47 ^ 110)) + (188 ^ 135);
                lIlllIlllIII[44] = ((79 + 42) - 94) + 107;
                lIlllIlllIII[45] = ((32 + 92) - 106) + 120;
                lIlllIlllIII[46] = (((203 ^ 173) + (106 ^ 113)) - (51 ^ 1)) + (179 ^ 143);
                lIlllIlllIII[47] = ((92 + 34) - 10) + 27;
                lIlllIlllIII[48] = (((122 ^ 48) + (111 ^ 35)) - (109 ^ 38)) + (99 ^ 38);
                lIlllIlllIII[49] = ((73 + 104) - 172) + 144;
                lIlllIlllIII[50] = (((119 ^ 52) + (240 ^ 144)) - (181 ^ 131)) + (55 ^ 30);
                lIlllIlllIII[51] = ((31 + 6) - (-58)) + 59;
                lIlllIlllIII[52] = (((242 ^ 135) + (102 ^ 52)) - (((3 + 94) - 55) + 139)) + ((58 + 86) - 128) + 121;
                lIlllIlllIII[53] = (((116 ^ 83) + (105 ^ 8)) - (27 ^ 16)) + (229 ^ 193);
                lIlllIlllIII[54] = (((136 ^ 180) + "   ".length()) - (-(149 ^ 196))) + (95 ^ 77);
                lIlllIlllIII[55] = ((154 + 82) - 184) + 114;
                lIlllIlllIII[56] = ((86 + 166) - 117) + 32;
                lIlllIlllIII[57] = (((((117 + 109) - 173) + 108) + (((113 + 103) - 184) + 114)) - (((41 + 42) - (-71)) + 46)) + (85 ^ 22);
                lIlllIlllIII[58] = (((((60 + 115) - 75) + 27) + (((16 + 31) - (-26)) + 80)) - ((-16541) & 16796)) + ((117 + 1) - 61) + 94;
                lIlllIlllIII[59] = (((80 ^ 18) + (((22 + 11) - (-26)) + 87)) - (((126 + 153) - 220) + 124)) + ((53 + 128) - 99) + 68;
                lIlllIlllIII[60] = (((130 ^ 135) + (71 ^ 46)) - (109 ^ 58)) + ((57 + 148) - 193) + 145;
                lIlllIlllIII[61] = ((54 + 40) - (-67)) + 26;
                lIlllIlllIII[62] = ((40 + 145) - 103) + 106;
                lIlllIlllIII[63] = ((95 + 135) - 88) + 54;
                lIlllIlllIII[64] = (((247 ^ 179) + (94 ^ 106)) - (-(146 ^ 175))) + (151 ^ 135);
                lIlllIlllIII[65] = (((224 ^ 139) + (64 ^ 96)) - (201 ^ 152)) + ((27 + 67) - (-8)) + 44;
                lIlllIlllIII[66] = ((45 + 62) - (-3)) + 95;
                lIlllIlllIII[67] = (((((12 + 94) - 95) + 168) + (205 ^ 190)) - (((103 + 96) - 122) + 62)) + (144 ^ 166);
                lIlllIlllIII[68] = ((179 + 179) - 167) + 19;
                lIlllIlllIII[69] = (((((62 + 118) - 96) + 100) + (((81 + 110) - 30) + 13)) - ((-28339) & 28598)) + (52 ^ 66);
                lIlllIlllIII[70] = (((58 ^ 74) + (((85 + 1) - (-107)) + 20)) - ((-8890) & 9211)) + ((99 + 205) - 208) + 118;
                lIlllIlllIII[71] = (((((133 + 48) - 158) + 164) + (((86 + 0) - 69) + 193)) - (((167 + 61) - 217) + 200)) + (59 ^ 29);
                lIlllIlllIII[72] = ((219 + 84) - 130) + 52;
                lIlllIlllIII[73] = (42 ^ 23) ^ (41 ^ 28);
                lIlllIlllIII[74] = (((87 ^ 80) + (2 ^ 4)) - (-(((80 + 58) - 68) + 125))) + (23 ^ 5);
                lIlllIlllIII[75] = (((127 ^ 45) + (((197 + 82) - 161) + 128)) - ((-5364) & 5627)) + ((179 + 97) - 156) + 65;
                lIlllIlllIII[76] = (("   ".length() + (((148 + 141) - 124) + 42)) - (((104 + 56) - 68) + 84)) + ((0 + 118) - (-59)) + 39;
                lIlllIlllIII[77] = " ".length();
                lIlllIlllIII[78] = (((172 ^ 186) + (158 ^ 186)) - (-(81 ^ 11))) + (15 ^ 104);
                lIlllIlllIII[79] = (((((105 + 46) - 144) + 138) + (((85 + 25) - 53) + 97)) - (((1 + 135) - (-38)) + 81)) + ((125 + 53) - 63) + 93;
                lIlllIlllIII[80] = ((91 + 12) - (-9)) + 141;
                lIlllIlllIII[81] = (((123 ^ 125) + (159 ^ 199)) - (-(181 ^ 174))) + ((19 + 86) - 100) + 128;
                lIlllIlllIII[82] = (((171 ^ 191) + (((31 + 20) - (-58)) + 51)) - (35 ^ 108)) + ((145 + 80) - 119) + 48;
            }

            private static boolean lllIllIlIIIllI(int i8) {
                return i8 >= 0;
            }
        };
        final String str16 = llIIIIllIIlI[llIIIIllIIll[15]];
        final int i8 = llIIIIllIIll[7];
        final A a8 = A.FRUIT_TREE;
        final String str17 = llIIIIllIIlI[llIIIIllIIll[16]];
        final ?? r67 = llIIIIllIIll[0];
        FRUIT_TREE = new P(str16, i8, a8, str17, r67) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ak
            private static /* synthetic */ int[] llIIIIIlIIlI;

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i9) {
                if (llllIIIlIlllII(i9) && llllIIIlIlllIl(i9, llIIIIIlIIlI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIlIIlI[0] - i9);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[1]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIlIIlI[0]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[3]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[4])) {
                    return new C0014an(EnumC0021au.APPLE, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[3]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[5]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[6])) {
                    return new C0014an(EnumC0021au.APPLE, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[5]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[7]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[8])) {
                    return new C0014an(EnumC0021au.APPLE, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[6]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[9]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[10])) {
                    return new C0014an(EnumC0021au.APPLE, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[8]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[11])) {
                    return new C0014an(EnumC0021au.APPLE, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[13])) {
                    return new C0014an(EnumC0021au.APPLE, EnumC0039n.GROWING, EnumC0021au.APPLE.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[15]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[16])) {
                    return new C0014an(EnumC0021au.BANANA, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[15]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[17]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[18])) {
                    return new C0014an(EnumC0021au.BANANA, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[17]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[19]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[20])) {
                    return new C0014an(EnumC0021au.BANANA, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[18]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[21]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[22])) {
                    return new C0014an(EnumC0021au.BANANA, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[20]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[23])) {
                    return new C0014an(EnumC0021au.BANANA, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[24])) {
                    return new C0014an(EnumC0021au.BANANA, EnumC0039n.GROWING, EnumC0021au.BANANA.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[25]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[26])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIlIIlI[0]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[27]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[28])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[27]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[29]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[30])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[29]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[31]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[32])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[30]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[33])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.DISEASED, llIIIIIlIIlI[34]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[35]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[36])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[33]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[37])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[38])) {
                    return new C0014an(EnumC0021au.ORANGE, EnumC0039n.GROWING, EnumC0021au.ORANGE.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[39]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[40])) {
                    return new C0014an(EnumC0021au.CURRY, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[39]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[41]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[42])) {
                    return new C0014an(EnumC0021au.CURRY, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[41]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[43]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[44])) {
                    return new C0014an(EnumC0021au.CURRY, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[42]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[45]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[46])) {
                    return new C0014an(EnumC0021au.CURRY, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[44]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[47])) {
                    return new C0014an(EnumC0021au.CURRY, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[48])) {
                    return new C0014an(EnumC0021au.CURRY, EnumC0039n.GROWING, EnumC0021au.CURRY.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[49]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[50])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIlIIlI[0]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[51]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[52])) {
                    return new C0014an(EnumC0021au.PINEAPPLE, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[51]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[53]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[54])) {
                    return new C0014an(EnumC0021au.PINEAPPLE, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[53]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[55]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[56])) {
                    return new C0014an(EnumC0021au.PINEAPPLE, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[54]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[57]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[58])) {
                    return new C0014an(EnumC0021au.PINEAPPLE, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[56]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[59])) {
                    return new C0014an(EnumC0021au.PINEAPPLE, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[60])) {
                    return new C0014an(EnumC0021au.PINEAPPLE, EnumC0039n.GROWING, EnumC0021au.PINEAPPLE.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[61]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[62])) {
                    return new C0014an(EnumC0021au.PAPAYA, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[61]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[63]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[64])) {
                    return new C0014an(EnumC0021au.PAPAYA, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[63]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[65]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[66])) {
                    return new C0014an(EnumC0021au.PAPAYA, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[64]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[67]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[68])) {
                    return new C0014an(EnumC0021au.PAPAYA, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[66]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[69])) {
                    return new C0014an(EnumC0021au.PAPAYA, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[70])) {
                    return new C0014an(EnumC0021au.PAPAYA, EnumC0039n.GROWING, EnumC0021au.PAPAYA.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[71]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[72])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIlIIlI[0]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[73]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[74])) {
                    return new C0014an(EnumC0021au.PALM, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[73]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[75]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[76])) {
                    return new C0014an(EnumC0021au.PALM, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[75]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[77]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[78])) {
                    return new C0014an(EnumC0021au.PALM, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[76]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[79]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[80])) {
                    return new C0014an(EnumC0021au.PALM, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[78]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[81])) {
                    return new C0014an(EnumC0021au.PALM, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[82])) {
                    return new C0014an(EnumC0021au.PALM, EnumC0039n.GROWING, EnumC0021au.PALM.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[83]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[84])) {
                    return new C0014an(EnumC0021au.DRAGONFRUIT, EnumC0039n.GROWING, i9 - llIIIIIlIIlI[83]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[85]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[86])) {
                    return new C0014an(EnumC0021au.DRAGONFRUIT, EnumC0039n.HARVESTABLE, i9 - llIIIIIlIIlI[85]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[87]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[88])) {
                    return new C0014an(EnumC0021au.DRAGONFRUIT, EnumC0039n.DISEASED, i9 - llIIIIIlIIlI[86]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[89]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[90])) {
                    return new C0014an(EnumC0021au.DRAGONFRUIT, EnumC0039n.DEAD, i9 - llIIIIIlIIlI[88]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[91])) {
                    return new C0014an(EnumC0021au.DRAGONFRUIT, EnumC0039n.HARVESTABLE, llIIIIIlIIlI[12]);
                }
                if (llllIIIlIlllll(i9, llIIIIIlIIlI[92])) {
                    return new C0014an(EnumC0021au.DRAGONFRUIT, EnumC0039n.GROWING, EnumC0021au.DRAGONFRUIT.bc() - llIIIIIlIIlI[14]);
                }
                if (llllIIIlIllllI(i9, llIIIIIlIIlI[93]) && llllIIIlIlllIl(i9, llIIIIIlIIlI[94])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIlIIlI[0]);
                }
                return null;
            }

            static {
                llllIIIlIllIll();
            }

            private static boolean llllIIIlIlllIl(int i9, int i10) {
                return i9 <= i10;
            }

            private static boolean llllIIIlIlllII(int i9) {
                return i9 >= 0;
            }

            private static void llllIIIlIllIll() {
                llIIIIIlIIlI = new int[95];
                llIIIIIlIIlI[0] = "   ".length();
                llIIIIIlIIlI[1] = 67 ^ 71;
                llIIIIIlIIlI[2] = 176 ^ 183;
                llIIIIIlIIlI[3] = 62 ^ 54;
                llIIIIIlIIlI[4] = 16 ^ 29;
                llIIIIIlIIlI[5] = (102 ^ 24) ^ (183 ^ 199);
                llIIIIIlIIlI[6] = (((148 + 117) - 258) + 170) ^ (((123 + 104) - 176) + 114);
                llIIIIIlIIlI[7] = (252 ^ 149) ^ (46 ^ 82);
                llIIIIIlIIlI[8] = (66 ^ 62) ^ (101 ^ 3);
                llIIIIIlIIlI[9] = (251 ^ 134) ^ (2 ^ 100);
                llIIIIIlIIlI[10] = 59 ^ 27;
                llIIIIIlIIlI[11] = 112 ^ 81;
                llIIIIIlIIlI[12] = (187 ^ 190) & ((165 ^ 160) ^ (-1));
                llIIIIIlIIlI[13] = 144 ^ 178;
                llIIIIIlIIlI[14] = " ".length();
                llIIIIIlIIlI[15] = (199 ^ 150) ^ (53 ^ 71);
                llIIIIIlIIlI[16] = 53 ^ 29;
                llIIIIIlIIlI[17] = (((33 + 92) - 21) + 72) ^ (((40 + 6) - (-45)) + 62);
                llIIIIIlIIlI[18] = 147 ^ 188;
                llIIIIIlIIlI[19] = 9 ^ 57;
                llIIIIIlIIlI[20] = (6 ^ 104) ^ (213 ^ 142);
                llIIIIIlIIlI[21] = (((55 + 79) - 22) + 57) ^ (((125 + 123) - 153) + 64);
                llIIIIIlIIlI[22] = 255 ^ 196;
                llIIIIIlIIlI[23] = (20 ^ 121) ^ (148 ^ 197);
                llIIIIIlIIlI[24] = 27 ^ 38;
                llIIIIIlIIlI[25] = 80 ^ 110;
                llIIIIIlIIlI[26] = 75 ^ 12;
                llIIIIIlIIlI[27] = (166 ^ 131) ^ (118 ^ 27);
                llIIIIIlIIlI[28] = 68 ^ 9;
                llIIIIIlIIlI[29] = 75 ^ 5;
                llIIIIIlIIlI[30] = 16 ^ 68;
                llIIIIIlIIlI[31] = 20 ^ 65;
                llIIIIIlIIlI[32] = 21 ^ 76;
                llIIIIIlIIlI[33] = (18 ^ 98) ^ (99 ^ 73);
                llIIIIIlIIlI[34] = (57 ^ 25) ^ (60 ^ 26);
                llIIIIIlIIlI[35] = 9 ^ 82;
                llIIIIIlIIlI[36] = 48 ^ 80;
                llIIIIIlIIlI[37] = 26 ^ 123;
                llIIIIIlIIlI[38] = 118 ^ 20;
                llIIIIIlIIlI[39] = (((30 + 208) - 111) + 101) ^ (((113 + 92) - 144) + 74);
                llIIIIIlIIlI[40] = (83 ^ 30) ^ (14 ^ 43);
                llIIIIIlIIlI[41] = (((148 + 103) - 222) + 140) ^ (((120 + 127) - 188) + 133);
                llIIIIIlIIlI[42] = 83 ^ 60;
                llIIIIIlIIlI[43] = 124 ^ 12;
                llIIIIIlIIlI[44] = 12 ^ 121;
                llIIIIIlIIlI[45] = 203 ^ 189;
                llIIIIIlIIlI[46] = 221 ^ 166;
                llIIIIIlIIlI[47] = 12 ^ 112;
                llIIIIIlIIlI[48] = 111 ^ 18;
                llIIIIIlIIlI[49] = (79 ^ 15) ^ (54 ^ 8);
                llIIIIIlIIlI[50] = (((235 ^ 175) + (162 ^ 166)) - (-(163 ^ 188))) + (104 ^ 72);
                llIIIIIlIIlI[51] = (((((28 + 112) - 64) + 57) + (72 ^ 52)) - (((87 + 152) - 196) + 206)) + ((12 + 32) - (-67)) + 17;
                llIIIIIlIIlI[52] = ((19 + 122) - 94) + 94;
                llIIIIIlIIlI[53] = ((55 + 61) - 25) + 51;
                llIIIIIlIIlI[54] = (((195 ^ 161) + (((8 + 88) - 24) + 72)) - (((105 + 86) - 73) + 55)) + (197 ^ 138);
                llIIIIIlIIlI[55] = ((78 + 42) - 61) + 90;
                llIIIIIlIIlI[56] = (((75 ^ 54) + (207 ^ 178)) - (89 ^ 56)) + " ".length();
                llIIIIIlIIlI[57] = (((199 ^ 193) + (9 ^ 114)) - (61 ^ 3)) + (41 ^ 113);
                llIIIIIlIIlI[58] = (((((126 + 41) - 115) + 89) + (((11 + 79) - (-4)) + 53)) - (((169 + 128) - 271) + 150)) + (154 ^ 170);
                llIIIIIlIIlI[59] = (((186 ^ 199) + (((111 + 83) - 67) + 32)) - (222 ^ 163)) + "  ".length();
                llIIIIIlIIlI[60] = ((138 + 158) - 270) + 136;
                llIIIIIlIIlI[61] = (((112 ^ 47) + (100 ^ 16)) - (((85 + 56) - (-19)) + 10)) + (83 ^ 41);
                llIIIIIlIIlI[62] = ((140 + 160) - 278) + 146;
                llIIIIIlIIlI[63] = (((146 ^ 173) + (198 ^ 156)) - (28 ^ 7)) + (19 ^ 56);
                llIIIIIlIIlI[64] = (((9 ^ 82) + (201 ^ 147)) - (107 ^ 109)) + ((220 ^ 156) & ((219 ^ 155) ^ (-1)));
                llIIIIIlIIlI[65] = (((25 ^ 75) + (((92 + 104) - 189) + 151)) - (((112 + 96) - 181) + 134)) + (45 ^ 76);
                llIIIIIlIIlI[66] = (((80 ^ 68) + (78 ^ 93)) - (38 ^ 33)) + ((5 + 19) - (-29)) + 96;
                llIIIIIlIIlI[67] = (((((107 + 29) - (-22)) + 3) + (109 ^ 99)) - (181 ^ 133)) + (108 ^ 91);
                llIIIIIlIIlI[68] = (((246 ^ 186) + (10 ^ 91)) - (176 ^ 152)) + (75 ^ 13);
                llIIIIIlIIlI[69] = (((155 ^ 189) + (((151 + 143) - 255) + 138)) - (82 ^ 125)) + (92 ^ 72);
                llIIIIIlIIlI[70] = ((103 + 10) - (-46)) + 30;
                llIIIIIlIIlI[71] = ((26 + 185) - 209) + 188;
                llIIIIIlIIlI[72] = (((((114 + 25) - 87) + 132) + (162 ^ 170)) - (((9 + 90) - (-39)) + 19)) + ((3 + 58) - (-47)) + 56;
                llIIIIIlIIlI[73] = (((190 ^ 183) + (157 ^ 195)) - (47 ^ 37)) + (1 ^ 106);
                llIIIIIlIIlI[74] = ((" ".length() + (23 ^ 5)) - (-(131 ^ 184))) + ((87 + 13) - 51) + 78;
                llIIIIIlIIlI[75] = ((104 + 115) - 178) + 165;
                llIIIIIlIIlI[76] = (((((27 + 93) - (-9)) + 14) + (144 ^ 142)) - (177 ^ 136)) + (88 ^ 56);
                llIIIIIlIIlI[77] = ((66 + 170) - 181) + 158;
                llIIIIIlIIlI[78] = (((97 ^ 77) + " ".length()) - (-(((40 + 58) - (-58)) + 4))) + (133 ^ 136);
                llIIIIIlIIlI[79] = (((29 ^ 7) + (141 ^ 138)) - (105 ^ 127)) + ((156 + 166) - 234) + 120;
                llIIIIIlIIlI[80] = ((49 + 83) - (-4)) + 88;
                llIIIIIlIIlI[81] = ((207 + 209) - 341) + 150;
                llIIIIIlIIlI[82] = (((((77 + 75) - 111) + 97) + (37 ^ 66)) - (((147 + 57) - 102) + 138)) + ((160 + 95) - 178) + 148;
                llIIIIIlIIlI[83] = (((((97 + 133) - 94) + 22) + (92 ^ 30)) - (((24 + 179) - 27) + 5)) + ((59 + 130) - 177) + 172;
                llIIIIIlIIlI[84] = ((231 + 141) - 322) + 182;
                llIIIIIlIIlI[85] = ((208 + 7) - 121) + 139;
                llIIIIIlIIlI[86] = (((221 ^ 154) + (61 ^ 26)) - (158 ^ 187)) + ((7 + 42) - (-117)) + 0;
                llIIIIIlIIlI[87] = (((222 ^ 170) + (179 ^ 185)) - (87 ^ 73)) + ((109 + 19) - 113) + 129;
                llIIIIIlIIlI[88] = ((152 + 150) - 213) + 156;
                llIIIIIlIIlI[89] = (((((89 + 53) - 60) + 54) + (29 ^ 104)) - (((161 + 10) - 38) + 68)) + ((58 + 125) - 92) + 103;
                llIIIIIlIIlI[90] = (((((102 + 165) - 211) + 162) + (((157 + 80) - 230) + 240)) - ((-16484) & 16867)) + ((159 + 54) - 143) + 100;
                llIIIIIlIIlI[91] = ((86 + 251) - 279) + 194;
                llIIIIIlIIlI[92] = ((241 + 213) - 331) + 130;
                llIIIIIlIIlI[93] = ((202 + 185) - 344) + 211;
                llIIIIIlIIlI[94] = (((7 ^ 38) + (((154 + 3) - 35) + 65)) - ((192 ^ 141) & ((47 ^ 98) ^ (-1)))) + (225 ^ 194);
            }

            private static boolean llllIIIlIlllll(int i9, int i10) {
                return i9 == i10;
            }

            private static boolean llllIIIlIllllI(int i9, int i10) {
                return i9 >= i10;
            }
        };
        final String str18 = llIIIIllIIlI[llIIIIllIIll[17]];
        final int i9 = llIIIIllIIll[8];
        final A a9 = A.HOPS;
        final String str19 = llIIIIllIIlI[llIIIIllIIll[18]];
        final ?? r68 = llIIIIllIIll[1];
        HOPS = new P(str18, i9, a9, str19, r68) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.al
            private static /* synthetic */ int[] lIllllIllIll;

            private static void lllIlllIllIIII() {
                lIllllIllIll = new int[116];
                lIllllIllIll[0] = "   ".length();
                lIllllIllIll[1] = (((48 + 118) - 143) + 168) ^ (((95 + 30) - (-11)) + 51);
                lIllllIllIll[2] = (200 ^ 158) ^ (239 ^ 190);
                lIllllIllIll[3] = (101 ^ 51) ^ (118 ^ 40);
                lIllllIllIll[4] = 142 ^ 132;
                lIllllIllIll[5] = 147 ^ 152;
                lIllllIllIll[6] = 1 ^ 14;
                lIllllIllIll[7] = " ".length() ^ (11 ^ 26);
                lIllllIllIll[8] = 160 ^ 178;
                lIllllIllIll[9] = 87 ^ 68;
                lIllllIllIll[10] = (86 ^ 107) ^ (71 ^ 98);
                lIllllIllIll[11] = (102 ^ 49) ^ (227 ^ 173);
                lIllllIllIll[12] = (((94 + 9) - (-13)) + 14) ^ (((39 + 77) - 32) + 69);
                lIllllIllIll[13] = (192 ^ 188) ^ (110 ^ 14);
                lIllllIllIll[14] = 87 ^ 117;
                lIllllIllIll[15] = (((57 + 8) - (-49)) + 63) ^ (((1 + 54) - 0) + 91);
                lIllllIllIll[16] = (((34 + 87) - 57) + 65) ^ (((39 + 69) - 61) + 117);
                lIllllIllIll[17] = 42 ^ 12;
                lIllllIllIll[18] = 162 ^ 143;
                lIllllIllIll[19] = 37 ^ 11;
                lIllllIllIll[20] = 37 ^ 21;
                lIllllIllIll[21] = (119 ^ 94) ^ (152 ^ 128);
                lIllllIllIll[22] = 130 ^ 182;
                lIllllIllIll[23] = 54 ^ 3;
                lIllllIllIll[24] = 130 ^ 181;
                lIllllIllIll[25] = (53 ^ 123) ^ (121 ^ 15);
                lIllllIllIll[26] = 81 ^ 109;
                lIllllIllIll[27] = (86 ^ 80) ^ (132 ^ 191);
                lIllllIllIll[28] = (22 ^ 64) ^ (43 ^ 66);
                lIllllIllIll[29] = (((147 + 17) - 5) + 86) ^ (((123 + 62) - 156) + 152);
                lIllllIllIll[30] = 245 ^ 182;
                lIllllIllIll[31] = 36 ^ 96;
                lIllllIllIll[32] = 68 ^ 3;
                lIllllIllIll[33] = 208 ^ 152;
                lIllllIllIll[34] = 214 ^ 156;
                lIllllIllIll[35] = (((21 + 104) - 58) + 177) ^ (((12 + 11) - (-27)) + 141);
                lIllllIllIll[36] = (82 ^ 109) ^ (100 ^ 20);
                lIllllIllIll[37] = (225 ^ 128) ^ (171 ^ 154);
                lIllllIllIll[38] = (9 ^ 0) ^ (23 ^ 76);
                lIllllIllIll[39] = 59 ^ 104;
                lIllllIllIll[40] = (((141 + 120) - 135) + 67) ^ (((32 + 126) - 11) + 6);
                lIllllIllIll[41] = (96 ^ 24) ^ (100 ^ 69);
                lIllllIllIll[42] = (((56 + 77) - 115) + 109) ^ (96 ^ 68);
                lIllllIllIll[43] = 251 ^ 167;
                lIllllIllIll[44] = (((182 + 18) - 141) + 139) ^ (((41 + 10) - (-68)) + 45);
                lIllllIllIll[45] = (((126 + 150) - 149) + 77) ^ (((44 + 30) - (-23)) + 78);
                lIllllIllIll[46] = (71 ^ 33) ^ "   ".length();
                lIllllIllIll[47] = (93 ^ 35) ^ (32 ^ 56);
                lIllllIllIll[48] = (20 ^ 127) ^ (174 ^ 168);
                lIllllIllIll[49] = 84 ^ 58;
                lIllllIllIll[50] = 68 ^ 52;
                lIllllIllIll[51] = 56 ^ 73;
                lIllllIllIll[52] = 254 ^ 138;
                lIllllIllIll[53] = (200 ^ 182) ^ (102 ^ 109);
                lIllllIllIll[54] = 247 ^ 128;
                lIllllIllIll[55] = 229 ^ 157;
                lIllllIllIll[56] = (105 ^ 83) ^ (211 ^ 149);
                lIllllIllIll[57] = 113 ^ 12;
                lIllllIllIll[58] = ((10 + 21) - (-86)) + 15;
                lIllllIllIll[59] = ((12 + 78) - 2) + 45;
                lIllllIllIll[60] = (((191 ^ 165) + (4 ^ 27)) - (169 ^ 165)) + (43 ^ 113);
                lIllllIllIll[61] = ((45 + 66) - 44) + 69;
                lIllllIllIll[62] = ((138 + 20) - 123) + 104;
                lIllllIllIll[63] = ((83 + 15) - 39) + 81;
                lIllllIllIll[64] = ((85 + 106) - 173) + 125;
                lIllllIllIll[65] = (((43 ^ 86) + (44 ^ 66)) - (176 ^ 195)) + (168 ^ 176);
                lIllllIllIll[66] = (((244 ^ 138) + (41 ^ 44)) - (163 ^ 189)) + (6 ^ 40);
                lIllllIllIll[67] = ((146 + 53) - 175) + 124;
                lIllllIllIll[68] = ((106 + 138) - 100) + 8;
                lIllllIllIll[69] = ((127 + 132) - 211) + 105;
                lIllllIllIll[70] = (((87 ^ 42) + (46 ^ 31)) - (((68 + 124) - 113) + 91)) + ((132 + 123) - 206) + 103;
                lIllllIllIll[71] = (((79 ^ 31) + (175 ^ 156)) - (93 ^ 49)) + ((92 + 128) - 157) + 71;
                lIllllIllIll[72] = ((4 + 152) - 135) + 141;
                lIllllIllIll[73] = ((30 + 72) - 19) + 80;
                lIllllIllIll[74] = (((204 ^ 158) + (182 ^ 147)) - (38 ^ 101)) + (63 ^ 77);
                lIllllIllIll[75] = (((35 ^ 11) + (65 ^ 1)) - (9 ^ 4)) + (117 ^ 57);
                lIllllIllIll[76] = ((52 + 152) - 83) + 52;
                lIllllIllIll[77] = (((((39 + 64) - 44) + 70) + (((55 + 91) - 101) + 88)) - (((31 + 93) - (-82)) + 22)) + ((9 + 106) - (-9)) + 16;
                lIllllIllIll[78] = ((45 + 55) - 52) + 129;
                lIllllIllIll[79] = (((((25 + 160) - 176) + 155) + (((127 + 109) - 183) + 90)) - ((-4793) & 5055)) + ((66 + 22) - 79) + 125;
                lIllllIllIll[80] = (((104 ^ 6) + (((47 + 6) - (-23)) + 63)) - (((53 + 101) - 5) + 5)) + (68 ^ 17);
                lIllllIllIll[81] = (((169 ^ 134) + (((119 + 51) - 93) + 58)) - (((62 + 146) - 150) + 89)) + ((21 + 105) - 105) + 125;
                lIllllIllIll[82] = (((((145 + 10) - (-15)) + 6) + (254 ^ 163)) - (121 ^ 18)) + (171 ^ 190);
                lIllllIllIll[83] = ((71 + 57) - (-16)) + 40;
                lIllllIllIll[84] = (((101 ^ 120) + (87 ^ 125)) - (-(226 ^ 135))) + (100 ^ 105);
                lIllllIllIll[85] = ((104 + 7) - 35) + 112;
                lIllllIllIll[86] = (((185 ^ 155) + (5 ^ 72)) - (-(119 ^ 82))) + (81 ^ 120);
                lIllllIllIll[87] = (((((35 + 88) - 58) + 66) + (16 ^ 12)) - (196 ^ 191)) + ((107 + 59) - 99) + 93;
                lIllllIllIll[88] = (((((28 + 1) - (-36)) + 63) + (110 ^ 32)) - (51 ^ 99)) + (92 ^ 27);
                lIllllIllIll[89] = (((25 ^ 92) + (25 ^ 65)) - (-(32 ^ 45))) + (40 ^ 53);
                lIllllIllIll[90] = (((209 ^ 177) + (246 ^ 140)) - (53 ^ 11)) + (112 ^ 92);
                lIllllIllIll[91] = (((15 ^ 79) + (85 ^ 31)) - (240 ^ 142)) + ((133 + 131) - 222) + 149;
                lIllllIllIll[92] = ((128 + 153) - 273) + 196;
                lIllllIllIll[93] = ((31 + 112) - 85) + 149;
                lIllllIllIll[94] = ((151 + 27) - 130) + 160;
                lIllllIllIll[95] = ((196 + 184) - 341) + 172;
                lIllllIllIll[96] = (((50 ^ 110) + (((132 + 125) - 252) + 138)) - (114 ^ 101)) + ("   ".length() & ("   ".length() ^ (-1)));
                lIllllIllIll[97] = ((128 + 47) - 137) + 178;
                lIllllIllIll[98] = (((48 ^ 100) + (((170 + 38) - 119) + 118)) - (((80 + 45) - 98) + 137)) + (79 ^ 21);
                lIllllIllIll[99] = (((186 ^ 143) + (203 ^ 146)) - (98 ^ 52)) + ((27 + 111) - 44) + 70;
                lIllllIllIll[100] = ((188 + 125) - 133) + 41;
                lIllllIllIll[101] = ((92 + 146) - 229) + 217;
                lIllllIllIll[102] = (((106 ^ 46) + (((36 + 123) - 88) + 71)) - (195 ^ 165)) + (75 ^ 60);
                lIllllIllIll[103] = ((54 + 5) - 54) + 225;
                lIllllIllIll[104] = ((81 + 4) - (-89)) + 57;
                lIllllIllIll[105] = ((160 + 43) - (-28)) + 6;
                lIllllIllIll[106] = ((54 + 57) - 58) + 185;
                lIllllIllIll[107] = (((((100 + 99) - 89) + 26) + (20 ^ 90)) - (((7 + 30) - (-23)) + 83)) + ((126 + 53) - 105) + 96;
                lIllllIllIll[108] = (((106 ^ 15) + (((100 + 120) - 72) + 48)) - ((-22115) & 22382)) + ((189 + 81) - 174) + 117;
                lIllllIllIll[109] = (((93 ^ 117) + (((40 + 25) - 41) + 139)) - (155 ^ 156)) + (244 ^ 196);
                lIllllIllIll[110] = ((85 + 86) - 66) + 140;
                lIllllIllIll[111] = ((113 + 63) - 3) + 75;
                lIllllIllIll[112] = ((31 + 227) - 220) + 211;
                lIllllIllIll[113] = ((113 + 215) - 162) + 86;
                lIllllIllIll[114] = ((194 + 72) - 39) + 26;
                lIllllIllIll[115] = (((((19 + 81) - (-1)) + 33) + (((148 + 189) - 216) + 88)) - (214 ^ 161)) + (68 ^ 91);
            }

            private static boolean lllIlllIllIIll(int i10, int i11) {
                return i10 >= i11;
            }

            private static boolean lllIlllIllIlII(int i10, int i11) {
                return i10 == i11;
            }

            private static boolean lllIlllIllIIlI(int i10, int i11) {
                return i10 <= i11;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i10) {
                if (lllIlllIllIIIl(i10) && lllIlllIllIIlI(i10, lIllllIllIll[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0] - i10);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[1]) && lllIlllIllIIlI(i10, lIllllIllIll[2])) {
                    return new C0014an(EnumC0021au.HAMMERSTONE, EnumC0039n.GROWING, i10 - lIllllIllIll[1]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[3]) && lllIlllIllIIlI(i10, lIllllIllIll[4])) {
                    return new C0014an(EnumC0021au.HAMMERSTONE, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[3]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[5]) && lllIlllIllIIlI(i10, lIllllIllIll[6])) {
                    return new C0014an(EnumC0021au.ASGARNIAN, EnumC0039n.GROWING, i10 - lIllllIllIll[5]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[7]) && lllIlllIllIIlI(i10, lIllllIllIll[8])) {
                    return new C0014an(EnumC0021au.ASGARNIAN, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[7]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[9]) && lllIlllIllIIlI(i10, lIllllIllIll[10])) {
                    return new C0014an(EnumC0021au.YANILLIAN, EnumC0039n.GROWING, i10 - lIllllIllIll[9]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[11]) && lllIlllIllIIlI(i10, lIllllIllIll[12])) {
                    return new C0014an(EnumC0021au.YANILLIAN, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[11]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[13]) && lllIlllIllIIlI(i10, lIllllIllIll[14])) {
                    return new C0014an(EnumC0021au.KRANDORIAN, EnumC0039n.GROWING, i10 - lIllllIllIll[13]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[15]) && lllIlllIllIIlI(i10, lIllllIllIll[16])) {
                    return new C0014an(EnumC0021au.KRANDORIAN, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[15]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[17]) && lllIlllIllIIlI(i10, lIllllIllIll[18])) {
                    return new C0014an(EnumC0021au.WILDBLOOD, EnumC0039n.GROWING, i10 - lIllllIllIll[17]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[19]) && lllIlllIllIIlI(i10, lIllllIllIll[20])) {
                    return new C0014an(EnumC0021au.WILDBLOOD, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[19]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[21]) && lllIlllIllIIlI(i10, lIllllIllIll[22])) {
                    return new C0014an(EnumC0021au.BARLEY, EnumC0039n.GROWING, i10 - lIllllIllIll[21]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[23]) && lllIlllIllIIlI(i10, lIllllIllIll[24])) {
                    return new C0014an(EnumC0021au.BARLEY, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[23]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[25]) && lllIlllIllIIlI(i10, lIllllIllIll[26])) {
                    return new C0014an(EnumC0021au.JUTE, EnumC0039n.GROWING, i10 - lIllllIllIll[25]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[27]) && lllIlllIllIIlI(i10, lIllllIllIll[28])) {
                    return new C0014an(EnumC0021au.JUTE, EnumC0039n.HARVESTABLE, i10 - lIllllIllIll[27]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[29]) && lllIlllIllIIlI(i10, lIllllIllIll[30])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[31]) && lllIlllIllIIlI(i10, lIllllIllIll[32])) {
                    return new C0014an(EnumC0021au.HAMMERSTONE, EnumC0039n.GROWING, i10 - lIllllIllIll[31]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[33]) && lllIlllIllIIlI(i10, lIllllIllIll[34])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[35]) && lllIlllIllIIlI(i10, lIllllIllIll[36])) {
                    return new C0014an(EnumC0021au.ASGARNIAN, EnumC0039n.GROWING, i10 - lIllllIllIll[35]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[37]) && lllIlllIllIIlI(i10, lIllllIllIll[38])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[39]) && lllIlllIllIIlI(i10, lIllllIllIll[40])) {
                    return new C0014an(EnumC0021au.YANILLIAN, EnumC0039n.GROWING, i10 - lIllllIllIll[39]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[41]) && lllIlllIllIIlI(i10, lIllllIllIll[42])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[43]) && lllIlllIllIIlI(i10, lIllllIllIll[44])) {
                    return new C0014an(EnumC0021au.KRANDORIAN, EnumC0039n.GROWING, i10 - lIllllIllIll[43]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[45]) && lllIlllIllIIlI(i10, lIllllIllIll[46])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[47]) && lllIlllIllIIlI(i10, lIllllIllIll[48])) {
                    return new C0014an(EnumC0021au.WILDBLOOD, EnumC0039n.GROWING, i10 - lIllllIllIll[47]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[49]) && lllIlllIllIIlI(i10, lIllllIllIll[50])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[51]) && lllIlllIllIIlI(i10, lIllllIllIll[52])) {
                    return new C0014an(EnumC0021au.BARLEY, EnumC0039n.GROWING, i10 - lIllllIllIll[51]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[53]) && lllIlllIllIIlI(i10, lIllllIllIll[54])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[55]) && lllIlllIllIIlI(i10, lIllllIllIll[56])) {
                    return new C0014an(EnumC0021au.JUTE, EnumC0039n.GROWING, i10 - lIllllIllIll[55]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[57]) && lllIlllIllIIlI(i10, lIllllIllIll[58])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[59]) && lllIlllIllIIlI(i10, lIllllIllIll[60])) {
                    return new C0014an(EnumC0021au.HAMMERSTONE, EnumC0039n.DISEASED, i10 - lIllllIllIll[58]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[61]) && lllIlllIllIIlI(i10, lIllllIllIll[62])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[63]) && lllIlllIllIIlI(i10, lIllllIllIll[64])) {
                    return new C0014an(EnumC0021au.ASGARNIAN, EnumC0039n.DISEASED, i10 - lIllllIllIll[62]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[65]) && lllIlllIllIIlI(i10, lIllllIllIll[66])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[67]) && lllIlllIllIIlI(i10, lIllllIllIll[68])) {
                    return new C0014an(EnumC0021au.YANILLIAN, EnumC0039n.DISEASED, i10 - lIllllIllIll[66]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[69]) && lllIlllIllIIlI(i10, lIllllIllIll[70])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[71]) && lllIlllIllIIlI(i10, lIllllIllIll[72])) {
                    return new C0014an(EnumC0021au.KRANDORIAN, EnumC0039n.DISEASED, i10 - lIllllIllIll[70]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[73]) && lllIlllIllIIlI(i10, lIllllIllIll[74])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[75]) && lllIlllIllIIlI(i10, lIllllIllIll[76])) {
                    return new C0014an(EnumC0021au.WILDBLOOD, EnumC0039n.DISEASED, i10 - lIllllIllIll[74]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[77]) && lllIlllIllIIlI(i10, lIllllIllIll[78])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[79]) && lllIlllIllIIlI(i10, lIllllIllIll[80])) {
                    return new C0014an(EnumC0021au.BARLEY, EnumC0039n.DISEASED, i10 - lIllllIllIll[78]);
                }
                if (lllIlllIllIlII(i10, lIllllIllIll[81])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[82]) && lllIlllIllIIlI(i10, lIllllIllIll[83])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[84]) && lllIlllIllIIlI(i10, lIllllIllIll[85])) {
                    return new C0014an(EnumC0021au.JUTE, EnumC0039n.DISEASED, i10 - lIllllIllIll[83]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[86]) && lllIlllIllIIlI(i10, lIllllIllIll[87])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[88]) && lllIlllIllIIlI(i10, lIllllIllIll[89])) {
                    return new C0014an(EnumC0021au.HAMMERSTONE, EnumC0039n.DEAD, i10 - lIllllIllIll[87]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[90]) && lllIlllIllIIlI(i10, lIllllIllIll[91])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[92]) && lllIlllIllIIlI(i10, lIllllIllIll[93])) {
                    return new C0014an(EnumC0021au.ASGARNIAN, EnumC0039n.DEAD, i10 - lIllllIllIll[91]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[94]) && lllIlllIllIIlI(i10, lIllllIllIll[95])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[96]) && lllIlllIllIIlI(i10, lIllllIllIll[97])) {
                    return new C0014an(EnumC0021au.YANILLIAN, EnumC0039n.DEAD, i10 - lIllllIllIll[95]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[98]) && lllIlllIllIIlI(i10, lIllllIllIll[99])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[100]) && lllIlllIllIIlI(i10, lIllllIllIll[101])) {
                    return new C0014an(EnumC0021au.KRANDORIAN, EnumC0039n.DEAD, i10 - lIllllIllIll[99]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[102]) && lllIlllIllIIlI(i10, lIllllIllIll[103])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[104]) && lllIlllIllIIlI(i10, lIllllIllIll[105])) {
                    return new C0014an(EnumC0021au.WILDBLOOD, EnumC0039n.DEAD, i10 - lIllllIllIll[103]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[106]) && lllIlllIllIIlI(i10, lIllllIllIll[107])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[108]) && lllIlllIllIIlI(i10, lIllllIllIll[109])) {
                    return new C0014an(EnumC0021au.BARLEY, EnumC0039n.DEAD, i10 - lIllllIllIll[107]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[110]) && lllIlllIllIIlI(i10, lIllllIllIll[111])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[112]) && lllIlllIllIIlI(i10, lIllllIllIll[113])) {
                    return new C0014an(EnumC0021au.JUTE, EnumC0039n.DEAD, i10 - lIllllIllIll[111]);
                }
                if (lllIlllIllIIll(i10, lIllllIllIll[114]) && lllIlllIllIIlI(i10, lIllllIllIll[115])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIllllIllIll[0]);
                }
                return null;
            }

            private static boolean lllIlllIllIIIl(int i10) {
                return i10 >= 0;
            }

            static {
                lllIlllIllIIII();
            }
        };
        final String str20 = llIIIIllIIlI[llIIIIllIIll[19]];
        final int i10 = llIIIIllIIll[9];
        final A a10 = A.TREE;
        final String str21 = llIIIIllIIlI[llIIIIllIIll[20]];
        final ?? r69 = llIIIIllIIll[0];
        TREE = new P(str20, i10, a10, str21, r69) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.R
            private static /* synthetic */ int[] llIIIlIllIll;

            private static boolean llllIlIlIllIll(int i11, int i12) {
                return i11 == i12;
            }

            private static boolean llllIlIlIllIIl(int i11, int i12) {
                return i11 <= i12;
            }

            static {
                llllIlIlIlIlll();
            }

            private static boolean llllIlIlIllIlI(int i11, int i12) {
                return i11 >= i12;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i11) {
                if (llllIlIlIllIII(i11) && llllIlIlIllIIl(i11, llIIIlIllIll[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0] - i11);
                }
                if (llllIlIlIllIlI(i11, llIIIlIllIll[1]) && llllIlIlIllIIl(i11, llIIIlIllIll[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                }
                if (llllIlIlIllIlI(i11, llIIIlIllIll[3]) && llllIlIlIllIIl(i11, llIIIlIllIll[4])) {
                    return new C0014an(EnumC0021au.OAK, EnumC0039n.GROWING, i11 - llIIIlIllIll[3]);
                }
                if (llllIlIlIllIll(i11, llIIIlIllIll[5])) {
                    return new C0014an(EnumC0021au.OAK, EnumC0039n.GROWING, EnumC0021au.OAK.bc() - llIIIlIllIll[6]);
                }
                if (!llllIlIlIllIll(i11, llIIIlIllIll[7]) && !llllIlIlIllIll(i11, llIIIlIllIll[9])) {
                    if (llllIlIlIllIlI(i11, llIIIlIllIll[10]) && llllIlIlIllIIl(i11, llIIIlIllIll[11])) {
                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.GROWING, i11 - llIIIlIllIll[10]);
                    }
                    if (llllIlIlIllIll(i11, llIIIlIllIll[12])) {
                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.GROWING, EnumC0021au.WILLOW.bc() - llIIIlIllIll[6]);
                    }
                    if (!llllIlIlIllIll(i11, llIIIlIllIll[13]) && !llllIlIlIllIll(i11, llIIIlIllIll[14])) {
                        if (llllIlIlIllIlI(i11, llIIIlIllIll[15]) && llllIlIlIllIIl(i11, llIIIlIllIll[16])) {
                            return new C0014an(EnumC0021au.MAPLE, EnumC0039n.GROWING, i11 - llIIIlIllIll[15]);
                        }
                        if (llllIlIlIllIll(i11, llIIIlIllIll[17])) {
                            return new C0014an(EnumC0021au.MAPLE, EnumC0039n.GROWING, EnumC0021au.MAPLE.bc() - llIIIlIllIll[6]);
                        }
                        if (!llllIlIlIllIll(i11, llIIIlIllIll[18]) && !llllIlIlIllIll(i11, llIIIlIllIll[19])) {
                            if (llllIlIlIllIlI(i11, llIIIlIllIll[20]) && llllIlIlIllIIl(i11, llIIIlIllIll[21])) {
                                return new C0014an(EnumC0021au.YEW, EnumC0039n.GROWING, i11 - llIIIlIllIll[20]);
                            }
                            if (llllIlIlIllIll(i11, llIIIlIllIll[22])) {
                                return new C0014an(EnumC0021au.YEW, EnumC0039n.GROWING, EnumC0021au.YEW.bc() - llIIIlIllIll[6]);
                            }
                            if (!llllIlIlIllIll(i11, llIIIlIllIll[23]) && !llllIlIlIllIll(i11, llIIIlIllIll[24])) {
                                if (llllIlIlIllIlI(i11, llIIIlIllIll[25]) && llllIlIlIllIIl(i11, llIIIlIllIll[26])) {
                                    return new C0014an(EnumC0021au.MAGIC, EnumC0039n.GROWING, i11 - llIIIlIllIll[25]);
                                }
                                if (llllIlIlIllIll(i11, llIIIlIllIll[27])) {
                                    return new C0014an(EnumC0021au.MAGIC, EnumC0039n.GROWING, EnumC0021au.MAGIC.bc() - llIIIlIllIll[6]);
                                }
                                if (!llllIlIlIllIll(i11, llIIIlIllIll[28]) && !llllIlIlIllIll(i11, llIIIlIllIll[29])) {
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[30]) && llllIlIlIllIIl(i11, llIIIlIllIll[31])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[32]) && llllIlIlIllIIl(i11, llIIIlIllIll[33])) {
                                        return new C0014an(EnumC0021au.OAK, EnumC0039n.DISEASED, i11 - llIIIlIllIll[31]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[34])) {
                                        return new C0014an(EnumC0021au.OAK, EnumC0039n.DISEASED, llIIIlIllIll[1]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[35]) && llllIlIlIllIIl(i11, llIIIlIllIll[36])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[37]) && llllIlIlIllIIl(i11, llIIIlIllIll[38])) {
                                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.DISEASED, i11 - llIIIlIllIll[36]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[39])) {
                                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.DISEASED, llIIIlIllIll[40]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[41]) && llllIlIlIllIIl(i11, llIIIlIllIll[42])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[43]) && llllIlIlIllIIl(i11, llIIIlIllIll[44])) {
                                        return new C0014an(EnumC0021au.MAPLE, EnumC0039n.DISEASED, i11 - llIIIlIllIll[42]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[45])) {
                                        return new C0014an(EnumC0021au.MAPLE, EnumC0039n.DISEASED, llIIIlIllIll[3]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[46]) && llllIlIlIllIIl(i11, llIIIlIllIll[47])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[48]) && llllIlIlIllIIl(i11, llIIIlIllIll[49])) {
                                        return new C0014an(EnumC0021au.YEW, EnumC0039n.DISEASED, i11 - llIIIlIllIll[47]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[50])) {
                                        return new C0014an(EnumC0021au.YEW, EnumC0039n.DISEASED, llIIIlIllIll[51]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[52]) && llllIlIlIllIIl(i11, llIIIlIllIll[53])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[54]) && llllIlIlIllIIl(i11, llIIIlIllIll[55])) {
                                        return new C0014an(EnumC0021au.MAGIC, EnumC0039n.DISEASED, i11 - llIIIlIllIll[53]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[56])) {
                                        return new C0014an(EnumC0021au.MAGIC, EnumC0039n.DISEASED, llIIIlIllIll[5]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[57]) && llllIlIlIllIIl(i11, llIIIlIllIll[58])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[59]) && llllIlIlIllIIl(i11, llIIIlIllIll[60])) {
                                        return new C0014an(EnumC0021au.OAK, EnumC0039n.DEAD, i11 - llIIIlIllIll[58]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[61])) {
                                        return new C0014an(EnumC0021au.OAK, EnumC0039n.DEAD, llIIIlIllIll[1]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[62]) && llllIlIlIllIIl(i11, llIIIlIllIll[63])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[64]) && llllIlIlIllIIl(i11, llIIIlIllIll[65])) {
                                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.DEAD, i11 - llIIIlIllIll[63]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[66])) {
                                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.DEAD, llIIIlIllIll[40]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[67]) && llllIlIlIllIIl(i11, llIIIlIllIll[68])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[69]) && llllIlIlIllIIl(i11, llIIIlIllIll[70])) {
                                        return new C0014an(EnumC0021au.MAPLE, EnumC0039n.DEAD, i11 - llIIIlIllIll[68]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[71])) {
                                        return new C0014an(EnumC0021au.MAPLE, EnumC0039n.DEAD, llIIIlIllIll[3]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[72]) && llllIlIlIllIIl(i11, llIIIlIllIll[73])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[74]) && llllIlIlIllIIl(i11, llIIIlIllIll[75])) {
                                        return new C0014an(EnumC0021au.YEW, EnumC0039n.DEAD, i11 - llIIIlIllIll[73]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[76])) {
                                        return new C0014an(EnumC0021au.YEW, EnumC0039n.DEAD, llIIIlIllIll[51]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[77]) && llllIlIlIllIIl(i11, llIIIlIllIll[78])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[79]) && llllIlIlIllIIl(i11, llIIIlIllIll[80])) {
                                        return new C0014an(EnumC0021au.MAGIC, EnumC0039n.DEAD, i11 - llIIIlIllIll[78]);
                                    }
                                    if (llllIlIlIllIll(i11, llIIIlIllIll[81])) {
                                        return new C0014an(EnumC0021au.MAGIC, EnumC0039n.DEAD, llIIIlIllIll[5]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[82]) && llllIlIlIllIIl(i11, llIIIlIllIll[83])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[84]) && llllIlIlIllIIl(i11, llIIIlIllIll[85])) {
                                        return new C0014an(EnumC0021au.WILLOW, EnumC0039n.HARVESTABLE, llIIIlIllIll[8]);
                                    }
                                    if (llllIlIlIllIlI(i11, llIIIlIllIll[86]) && llllIlIlIllIIl(i11, llIIIlIllIll[87])) {
                                        return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIllIll[0]);
                                    }
                                    return null;
                                }
                                return new C0014an(EnumC0021au.MAGIC, EnumC0039n.HARVESTABLE, llIIIlIllIll[8]);
                            }
                            return new C0014an(EnumC0021au.YEW, EnumC0039n.HARVESTABLE, llIIIlIllIll[8]);
                        }
                        return new C0014an(EnumC0021au.MAPLE, EnumC0039n.HARVESTABLE, llIIIlIllIll[8]);
                    }
                    return new C0014an(EnumC0021au.WILLOW, EnumC0039n.HARVESTABLE, llIIIlIllIll[8]);
                }
                return new C0014an(EnumC0021au.OAK, EnumC0039n.HARVESTABLE, llIIIlIllIll[8]);
            }

            private static void llllIlIlIlIlll() {
                llIIIlIllIll = new int[88];
                llIIIlIllIll[0] = "   ".length();
                llIIIlIllIll[1] = (209 ^ 169) ^ (243 ^ 143);
                llIIIlIllIll[2] = 25 ^ 30;
                llIIIlIllIll[3] = 165 ^ 173;
                llIIIlIllIll[4] = 4 ^ 15;
                llIIIlIllIll[5] = (((28 + 123) - 30) + 11) ^ (((96 + 97) - 64) + 7);
                llIIIlIllIll[6] = " ".length();
                llIIIlIllIll[7] = (((68 + 22) - (-50)) + 5) ^ (((140 + 65) - 91) + 42);
                llIIIlIllIll[8] = ((93 ^ 21) ^ (22 ^ 106)) & (((110 ^ 71) ^ (164 ^ 185)) ^ (-" ".length()));
                llIIIlIllIll[9] = (37 ^ 72) ^ (202 ^ 169);
                llIIIlIllIll[10] = 175 ^ 160;
                llIIIlIllIll[11] = (((97 + 39) - 89) + 108) ^ (((81 + 69) - 52) + 45);
                llIIIlIllIll[12] = 90 ^ 79;
                llIIIlIllIll[13] = (((24 + 118) - (-28)) + 0) ^ (((58 + 71) - (-49)) + 10);
                llIIIlIllIll[14] = 3 ^ 20;
                llIIIlIllIll[15] = 133 ^ 157;
                llIIIlIllIll[16] = 63 ^ 32;
                llIIIlIllIll[17] = (((112 + 96) - 148) + 110) ^ (((52 + 74) - 47) + 59);
                llIIIlIllIll[18] = 69 ^ 100;
                llIIIlIllIll[19] = (26 ^ 93) ^ (29 ^ 120);
                llIIIlIllIll[20] = (99 ^ 82) ^ (90 ^ 72);
                llIIIlIllIll[21] = 39 ^ 11;
                llIIIlIllIll[22] = (((27 + 33) - (-89)) + 20) ^ (((25 + 124) - 61) + 44);
                llIIIlIllIll[23] = (((63 + 125) - 126) + 91) ^ (((105 + 118) - 208) + 168);
                llIIIlIllIll[24] = (((40 + 141) - 180) + 175) ^ (((48 + 115) - 98) + 94);
                llIIIlIllIll[25] = (((5 + 64) - (-1)) + 105) ^ (((152 + 10) - 128) + 125);
                llIIIlIllIll[26] = (((82 + 42) - 13) + 58) ^ (((46 + 119) - 63) + 44);
                llIIIlIllIll[27] = 139 ^ 183;
                llIIIlIllIll[28] = 179 ^ 142;
                llIIIlIllIll[29] = (144 ^ 163) ^ (88 ^ 85);
                llIIIlIllIll[30] = 82 ^ 109;
                llIIIlIllIll[31] = (220 ^ 174) ^ (189 ^ 135);
                llIIIlIllIll[32] = (5 ^ 54) ^ (244 ^ 142);
                llIIIlIllIll[33] = 79 ^ 4;
                llIIIlIllIll[34] = 12 ^ 65;
                llIIIlIllIll[35] = (104 ^ 96) ^ (75 ^ 13);
                llIIIlIllIll[36] = 234 ^ 165;
                llIIIlIllIll[37] = (((120 + 117) - 64) + 38) ^ (((34 + 56) - (-8)) + 33);
                llIIIlIllIll[38] = 252 ^ 168;
                llIIIlIllIll[39] = (41 ^ 99) ^ (30 ^ 2);
                llIIIlIllIll[40] = 121 ^ 127;
                llIIIlIllIll[41] = 114 ^ 37;
                llIIIlIllIll[42] = 239 ^ 183;
                llIIIlIllIll[43] = 112 ^ 41;
                llIIIlIllIll[44] = 77 ^ 18;
                llIIIlIllIll[45] = (50 ^ 1) ^ (216 ^ 138);
                llIIIlIllIll[46] = 243 ^ 145;
                llIIIlIllIll[47] = 202 ^ 169;
                llIIIlIllIll[48] = 241 ^ 149;
                llIIIlIllIll[49] = 175 ^ 195;
                llIIIlIllIll[50] = 4 ^ 106;
                llIIIlIllIll[51] = (((134 + 3) - (-8)) + 20) ^ (((126 + 124) - 77) + 2);
                llIIIlIllIll[52] = (((205 + 57) - 170) + 148) ^ (((17 + 98) - 47) + 91);
                llIIIlIllIll[53] = (((172 + 45) - 52) + 27) ^ (((140 + 105) - 88) + 19);
                llIIIlIllIll[54] = (62 ^ 44) ^ (84 ^ 55);
                llIIIlIllIll[55] = (224 ^ 161) ^ (39 ^ 29);
                llIIIlIllIll[56] = (((35 + 16) - 2) + 163) ^ (((35 + 86) - 90) + 138);
                llIIIlIllIll[57] = 121 ^ 7;
                llIIIlIllIll[58] = (((245 ^ 162) + (49 ^ 107)) - (92 ^ 96)) + (104 ^ 123);
                llIIIlIllIll[59] = ((55 + 57) - 10) + 35;
                llIIIlIllIll[60] = (((43 ^ 58) + (30 ^ 61)) - (-(76 ^ 108))) + (101 ^ 82);
                llIIIlIllIll[61] = (((169 ^ 194) + (93 ^ 61)) - (((55 + 37) - (-50)) + 28)) + (32 ^ 76);
                llIIIlIllIll[62] = (((62 ^ 8) + (((108 + 21) - 60) + 59)) - (13 ^ 55)) + (148 ^ 134);
                llIIIlIllIll[63] = ((61 + 74) - (-3)) + 5;
                llIIIlIllIll[64] = ((101 + 29) - 128) + 142;
                llIIIlIllIll[65] = (((((60 + 123) - 39) + 3) + (64 ^ 68)) - (122 ^ 102)) + (139 ^ 146);
                llIIIlIllIll[66] = (((70 ^ 10) + (4 ^ 36)) - (-(81 ^ 93))) + (168 ^ 182);
                llIIIlIllIll[67] = ((34 + 93) - 44) + 68;
                llIIIlIllIll[68] = ((21 + 8) - (-44)) + 79;
                llIIIlIllIll[69] = ((102 + 28) - 15) + 38;
                llIIIlIllIll[70] = ((52 + 127) - 122) + 102;
                llIIIlIllIll[71] = (((188 ^ 169) + (((137 + 110) - 243) + 144)) - (78 ^ 38)) + (101 ^ 5);
                llIIIlIllIll[72] = ((28 + 132) - 126) + 128;
                llIIIlIllIll[73] = (((115 ^ 92) + (244 ^ 162)) - (22 ^ 57)) + (24 ^ 85);
                llIIIlIllIll[74] = ((57 + 113) - 86) + 80;
                llIIIlIllIll[75] = (("   ".length() + (94 ^ 43)) - (179 ^ 132)) + (172 ^ 199);
                llIIIlIllIll[76] = ((157 + 55) - 191) + 153;
                llIIIlIllIll[77] = (((169 ^ 174) + (151 ^ 162)) - (-(40 ^ 118))) + (75 ^ 94);
                llIIIlIllIll[78] = ((1 + 125) - 35) + 85;
                llIIIlIllIll[79] = ((21 + 53) - (-7)) + 96;
                llIIIlIllIll[80] = (((((141 + 1) - 12) + 20) + (151 ^ 145)) - (-(50 ^ 63))) + (76 ^ 94);
                llIIIlIllIll[81] = (((175 ^ 134) + (73 ^ 111)) - (-(139 ^ 162))) + (86 ^ 19);
                llIIIlIllIll[82] = ((44 + 80) - (-35)) + 31;
                llIIIlIllIll[83] = (((35 ^ 87) + (((139 + 112) - 120) + 15)) - (254 ^ 178)) + (138 ^ 143);
                llIIIlIllIll[84] = ((58 + 8) - 29) + 155;
                llIIIlIllIll[85] = (((252 ^ 149) + (((14 + 133) - 11) + 32)) - (((6 + 133) - 58) + 66)) + (214 ^ 145);
                llIIIlIllIll[86] = (((0 ^ 91) + (((126 + 100) - 100) + 10)) - (147 ^ 192)) + (20 ^ 34);
                llIIIlIllIll[87] = ((95 + 247) - 179) + 92;
            }

            private static boolean llllIlIlIllIII(int i11) {
                return i11 >= 0;
            }
        };
        final String str22 = llIIIIllIIlI[llIIIIllIIll[21]];
        final int i11 = llIIIIllIIll[10];
        final A a11 = A.TREE;
        final String str23 = llIIIIllIIlI[llIIIIllIIll[22]];
        final ?? r610 = llIIIIllIIll[0];
        HARDWOOD_TREE = new P(str22, i11, a11, str23, r610) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.S
            private static /* synthetic */ int[] llIIIIIIIIll;

            private static boolean llllIIIIllIIlI(int i12) {
                return i12 >= 0;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i12) {
                if (llllIIIIllIIlI(i12) && llllIIIIllIIll(i12, llIIIIIIIIll[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIIIll[0] - i12);
                }
                if (llllIIIIllIlII(i12, llIIIIIIIIll[1]) && llllIIIIllIIll(i12, llIIIIIIIIll[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIIIll[0]);
                }
                if (llllIIIIllIlII(i12, llIIIIIIIIll[3]) && llllIIIIllIIll(i12, llIIIIIIIIll[4])) {
                    return new C0014an(EnumC0021au.TEAK, EnumC0039n.GROWING, i12 - llIIIIIIIIll[3]);
                }
                if (llllIIIIllIlIl(i12, llIIIIIIIIll[5])) {
                    return new C0014an(EnumC0021au.TEAK, EnumC0039n.GROWING, EnumC0021au.TEAK.bc() - llIIIIIIIIll[6]);
                }
                if (!llllIIIIllIlIl(i12, llIIIIIIIIll[7]) && !llllIIIIllIlIl(i12, llIIIIIIIIll[9])) {
                    if (llllIIIIllIlII(i12, llIIIIIIIIll[10]) && llllIIIIllIIll(i12, llIIIIIIIIll[11])) {
                        return new C0014an(EnumC0021au.TEAK, EnumC0039n.DISEASED, i12 - llIIIIIIIIll[9]);
                    }
                    if (llllIIIIllIlII(i12, llIIIIIIIIll[12]) && llllIIIIllIIll(i12, llIIIIIIIIll[13])) {
                        return new C0014an(EnumC0021au.TEAK, EnumC0039n.DEAD, i12 - llIIIIIIIIll[11]);
                    }
                    if (llllIIIIllIlII(i12, llIIIIIIIIll[14]) && llllIIIIllIIll(i12, llIIIIIIIIll[15])) {
                        return new C0014an(EnumC0021au.MAHOGANY, EnumC0039n.GROWING, i12 - llIIIIIIIIll[14]);
                    }
                    if (llllIIIIllIlIl(i12, llIIIIIIIIll[16])) {
                        return new C0014an(EnumC0021au.MAHOGANY, EnumC0039n.GROWING, EnumC0021au.MAHOGANY.bc() - llIIIIIIIIll[6]);
                    }
                    if (!llllIIIIllIlIl(i12, llIIIIIIIIll[17]) && !llllIIIIllIlIl(i12, llIIIIIIIIll[18])) {
                        if (llllIIIIllIlII(i12, llIIIIIIIIll[19]) && llllIIIIllIIll(i12, llIIIIIIIIll[20])) {
                            return new C0014an(EnumC0021au.MAHOGANY, EnumC0039n.DISEASED, i12 - llIIIIIIIIll[18]);
                        }
                        if (llllIIIIllIlII(i12, llIIIIIIIIll[21]) && llllIIIIllIIll(i12, llIIIIIIIIll[22])) {
                            return new C0014an(EnumC0021au.MAHOGANY, EnumC0039n.DEAD, i12 - llIIIIIIIIll[20]);
                        }
                        if (llllIIIIllIlII(i12, llIIIIIIIIll[23]) && llllIIIIllIIll(i12, llIIIIIIIIll[24])) {
                            return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIIIIll[0]);
                        }
                        return null;
                    }
                    return new C0014an(EnumC0021au.MAHOGANY, EnumC0039n.HARVESTABLE, llIIIIIIIIll[8]);
                }
                return new C0014an(EnumC0021au.TEAK, EnumC0039n.HARVESTABLE, llIIIIIIIIll[8]);
            }

            private static boolean llllIIIIllIIll(int i12, int i13) {
                return i12 <= i13;
            }

            private static boolean llllIIIIllIlIl(int i12, int i13) {
                return i12 == i13;
            }

            private static void llllIIIIllIIIl() {
                llIIIIIIIIll = new int[25];
                llIIIIIIIIll[0] = "   ".length();
                llIIIIIIIIll[1] = (7 ^ 111) ^ (53 ^ 89);
                llIIIIIIIIll[2] = 6 ^ 1;
                llIIIIIIIIll[3] = (165 ^ 197) ^ (123 ^ 19);
                llIIIIIIIIll[4] = (((176 + 132) - 256) + 132) ^ (((161 + 87) - 145) + 79);
                llIIIIIIIIll[5] = 185 ^ 182;
                llIIIIIIIIll[6] = " ".length();
                llIIIIIIIIll[7] = 142 ^ 158;
                llIIIIIIIIll[8] = (44 ^ 103) & ((94 ^ 21) ^ (-1));
                llIIIIIIIIll[9] = (62 ^ 101) ^ (220 ^ 150);
                llIIIIIIIIll[10] = (84 ^ 63) ^ (53 ^ 76);
                llIIIIIIIIll[11] = (25 ^ 127) ^ (109 ^ 28);
                llIIIIIIIIll[12] = 65 ^ 89;
                llIIIIIIIIll[13] = (70 ^ 96) ^ (187 ^ 128);
                llIIIIIIIIll[14] = (((10 + 166) - (-5)) + 0) ^ (((14 + 25) - (-27)) + 105);
                llIIIIIIIIll[15] = 45 ^ 8;
                llIIIIIIIIll[16] = (47 ^ 24) ^ (179 ^ 162);
                llIIIIIIIIll[17] = (240 ^ 135) ^ (0 ^ 80);
                llIIIIIIIIll[18] = (249 ^ 188) ^ (74 ^ 39);
                llIIIIIIIIll[19] = 41 ^ 0;
                llIIIIIIIIll[20] = 4 ^ 43;
                llIIIIIIIIll[21] = (32 ^ 118) ^ (51 ^ 85);
                llIIIIIIIIll[22] = (198 ^ 194) ^ (63 ^ 13);
                llIIIIIIIIll[23] = (((15 + 181) - 109) + 153) ^ (((28 + 157) - 130) + 144);
                llIIIIIIIIll[24] = (((120 ^ 9) + (216 ^ 139)) - (-(30 ^ 23))) + (44 ^ 30);
            }

            private static boolean llllIIIIllIlII(int i12, int i13) {
                return i12 >= i13;
            }

            static {
                llllIIIIllIIIl();
            }
        };
        final String str24 = llIIIIllIIlI[llIIIIllIIll[23]];
        final int i12 = llIIIIllIIll[11];
        final A a12 = A.TREE;
        final String str25 = llIIIIllIIlI[llIIIIllIIll[24]];
        final ?? r611 = llIIIIllIIll[0];
        REDWOOD = new P(str24, i12, a12, str25, r611) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.T
            private static /* synthetic */ int[] lIlllIlIlllI;

            static {
                lllIllIIlIlIll();
            }

            private static void lllIllIIlIlIll() {
                lIlllIlIlllI = new int[15];
                lIlllIlIlllI[0] = "   ".length();
                lIlllIlIlllI[1] = (((128 + 112) - 212) + 157) ^ (((139 + 158) - 134) + 26);
                lIlllIlIlllI[2] = (((21 + 77) - 65) + 164) ^ (((105 + 5) - (-79)) + 5);
                lIlllIlIlllI[3] = 76 ^ 68;
                lIlllIlIlllI[4] = (85 ^ 26) ^ (63 ^ 97);
                lIlllIlIlllI[5] = 48 ^ 34;
                lIlllIlIlllI[6] = (249 ^ 153) & ((206 ^ 174) ^ (-1));
                lIlllIlIlllI[7] = 180 ^ 167;
                lIlllIlIlllI[8] = "  ".length() ^ (83 ^ 74);
                lIlllIlIlllI[9] = (7 ^ 118) ^ (23 ^ 122);
                lIlllIlIlllI[10] = 154 ^ 190;
                lIlllIlIlllI[11] = 64 ^ 101;
                lIlllIlIlllI[12] = " ".length();
                lIlllIlIlllI[13] = 11 ^ 34;
                lIlllIlIlllI[14] = 79 ^ 120;
            }

            private static boolean lllIllIIlIllII(int i13) {
                return i13 >= 0;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i13) {
                if (lllIllIIlIllII(i13) && lllIllIIlIllIl(i13, lIlllIlIlllI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlIlllI[0] - i13);
                }
                if (lllIllIIlIlllI(i13, lIlllIlIlllI[1]) && lllIllIIlIllIl(i13, lIlllIlIlllI[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlIlllI[0]);
                }
                if (lllIllIIlIlllI(i13, lIlllIlIlllI[3]) && lllIllIIlIllIl(i13, lIlllIlIlllI[4])) {
                    return new C0014an(EnumC0021au.REDWOOD, EnumC0039n.GROWING, i13 - lIlllIlIlllI[3]);
                }
                if (lllIllIIlIllll(i13, lIlllIlIlllI[5])) {
                    return new C0014an(EnumC0021au.REDWOOD, EnumC0039n.HARVESTABLE, lIlllIlIlllI[6]);
                }
                if (lllIllIIlIlllI(i13, lIlllIlIlllI[7]) && lllIllIIlIllIl(i13, lIlllIlIlllI[8])) {
                    return new C0014an(EnumC0021au.REDWOOD, EnumC0039n.DISEASED, i13 - lIlllIlIlllI[5]);
                }
                if (lllIllIIlIlllI(i13, lIlllIlIlllI[9]) && lllIllIIlIllIl(i13, lIlllIlIlllI[10])) {
                    return new C0014an(EnumC0021au.REDWOOD, EnumC0039n.DEAD, i13 - lIlllIlIlllI[8]);
                }
                if (lllIllIIlIllll(i13, lIlllIlIlllI[11])) {
                    return new C0014an(EnumC0021au.REDWOOD, EnumC0039n.GROWING, EnumC0021au.REDWOOD.bc() - lIlllIlIlllI[12]);
                }
                if (lllIllIIlIlllI(i13, lIlllIlIlllI[13]) && lllIllIIlIllIl(i13, lIlllIlIlllI[14])) {
                    return new C0014an(EnumC0021au.REDWOOD, EnumC0039n.HARVESTABLE, lIlllIlIlllI[6]);
                }
                return null;
            }

            private static boolean lllIllIIlIllll(int i13, int i14) {
                return i13 == i14;
            }

            private static boolean lllIllIIlIllIl(int i13, int i14) {
                return i13 <= i14;
            }

            private static boolean lllIllIIlIlllI(int i13, int i14) {
                return i13 >= i14;
            }
        };
        final String str26 = llIIIIllIIlI[llIIIIllIIll[25]];
        final int i13 = llIIIIllIIll[12];
        final A a13 = A.TREE;
        final String str27 = llIIIIllIIlI[llIIIIllIIll[26]];
        final ?? r612 = llIIIIllIIll[0];
        SPIRIT_TREE = new P(str26, i13, a13, str27, r612) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.U
            private static /* synthetic */ int[] lIlllllllIII;

            private static boolean llllIIIIIlllIl(int i14, int i15) {
                return i14 >= i15;
            }

            private static void llllIIIIIllIlI() {
                lIlllllllIII = new int[15];
                lIlllllllIII[0] = "   ".length();
                lIlllllllIII[1] = (141 ^ 166) ^ (170 ^ 133);
                lIlllllllIII[2] = 96 ^ 103;
                lIlllllllIII[3] = 99 ^ 107;
                lIlllllllIII[4] = 106 ^ 121;
                lIlllllllIII[5] = 58 ^ 46;
                lIlllllllIII[6] = (52 ^ 88) ^ (9 ^ 105);
                lIlllllllIII[7] = 185 ^ 172;
                lIlllllllIII[8] = (96 ^ 50) ^ (209 ^ 156);
                lIlllllllIII[9] = (15 ^ 99) ^ (53 ^ 121);
                lIlllllllIII[10] = 169 ^ 130;
                lIlllllllIII[11] = 153 ^ 181;
                lIlllllllIII[12] = " ".length();
                lIlllllllIII[13] = (((122 + 181) - 237) + 170) ^ (((154 + 170) - 160) + 29);
                lIlllllllIII[14] = 165 ^ 154;
            }

            private static boolean llllIIIIIllllI(int i14, int i15) {
                return i14 == i15;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i14) {
                if (llllIIIIIllIll(i14) && llllIIIIIlllII(i14, lIlllllllIII[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllllllIII[0] - i14);
                }
                if (llllIIIIIlllIl(i14, lIlllllllIII[1]) && llllIIIIIlllII(i14, lIlllllllIII[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllllllIII[0]);
                }
                if (llllIIIIIlllIl(i14, lIlllllllIII[3]) && llllIIIIIlllII(i14, lIlllllllIII[4])) {
                    return new C0014an(EnumC0021au.SPIRIT_TREE, EnumC0039n.GROWING, i14 - lIlllllllIII[3]);
                }
                if (llllIIIIIllllI(i14, lIlllllllIII[5])) {
                    return new C0014an(EnumC0021au.SPIRIT_TREE, EnumC0039n.GROWING, lIlllllllIII[6]);
                }
                if (llllIIIIIlllIl(i14, lIlllllllIII[7]) && llllIIIIIlllII(i14, lIlllllllIII[8])) {
                    return new C0014an(EnumC0021au.SPIRIT_TREE, EnumC0039n.DISEASED, i14 - lIlllllllIII[5]);
                }
                if (llllIIIIIlllIl(i14, lIlllllllIII[9]) && llllIIIIIlllII(i14, lIlllllllIII[10])) {
                    return new C0014an(EnumC0021au.SPIRIT_TREE, EnumC0039n.DEAD, i14 - lIlllllllIII[8]);
                }
                if (llllIIIIIllllI(i14, lIlllllllIII[11])) {
                    return new C0014an(EnumC0021au.SPIRIT_TREE, EnumC0039n.GROWING, EnumC0021au.SPIRIT_TREE.bc() - lIlllllllIII[12]);
                }
                if (llllIIIIIlllIl(i14, lIlllllllIII[13]) && llllIIIIIlllII(i14, lIlllllllIII[14])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllllllIII[0]);
                }
                return null;
            }

            private static boolean llllIIIIIllIll(int i14) {
                return i14 >= 0;
            }

            static {
                llllIIIIIllIlI();
            }

            private static boolean llllIIIIIlllII(int i14, int i15) {
                return i14 <= i15;
            }
        };
        final String str28 = llIIIIllIIlI[llIIIIllIIll[27]];
        final int i14 = llIIIIllIIll[13];
        final A a14 = A.SPECIAL;
        final String str29 = llIIIIllIIlI[llIIIIllIIll[28]];
        final ?? r613 = llIIIIllIIll[1];
        ANIMA = new P(str28, i14, a14, str29, r613) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.V
            private static /* synthetic */ int[] llIIIIIllIlI;

            private static boolean llllIIIllIllll(int i15, int i16) {
                return i15 <= i16;
            }

            static {
                llllIIIllIllIl();
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i15) {
                if (llllIIIllIlllI(i15) && llllIIIllIllll(i15, llIIIIIllIlI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIllIlI[0] - i15);
                }
                if (llllIIIlllIIII(i15, llIIIIIllIlI[1]) && llllIIIllIllll(i15, llIIIIIllIlI[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIllIlI[0]);
                }
                if (llllIIIlllIIII(i15, llIIIIIllIlI[3]) && llllIIIllIllll(i15, llIIIIIllIlI[4])) {
                    return new C0014an(EnumC0021au.ATTAS, EnumC0039n.GROWING, i15 - llIIIIIllIlI[3]);
                }
                if (llllIIIlllIIII(i15, llIIIIIllIlI[5]) && llllIIIllIllll(i15, llIIIIIllIlI[6])) {
                    return new C0014an(EnumC0021au.IASOR, EnumC0039n.GROWING, i15 - llIIIIIllIlI[5]);
                }
                if (llllIIIlllIIII(i15, llIIIIIllIlI[7]) && llllIIIllIllll(i15, llIIIIIllIlI[8])) {
                    return new C0014an(EnumC0021au.KRONOS, EnumC0039n.GROWING, i15 - llIIIIIllIlI[7]);
                }
                if (llllIIIlllIIII(i15, llIIIIIllIlI[9]) && llllIIIllIllll(i15, llIIIIIllIlI[10])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIIllIlI[0]);
                }
                return null;
            }

            private static void llllIIIllIllIl() {
                llIIIIIllIlI = new int[11];
                llIIIIIllIlI[0] = "   ".length();
                llIIIIIllIlI[1] = 74 ^ 78;
                llIIIIIllIlI[2] = (162 ^ 197) ^ (116 ^ 20);
                llIIIIIllIlI[3] = (213 ^ 180) ^ (42 ^ 67);
                llIIIIIllIlI[4] = (((75 + 31) - 66) + 130) ^ (((94 + 141) - 132) + 83);
                llIIIIIllIlI[5] = 61 ^ 44;
                llIIIIIllIlI[6] = (138 ^ 155) ^ (189 ^ 181);
                llIIIIIllIlI[7] = 19 ^ 9;
                llIIIIIllIlI[8] = (((129 + 50) - 46) + 14) ^ (((18 + 113) - 51) + 97);
                llIIIIIllIlI[9] = (62 ^ 24) ^ (76 ^ 73);
                llIIIIIllIlI[10] = ((53 + 6) - (-136)) + 60;
            }

            private static boolean llllIIIllIlllI(int i15) {
                return i15 >= 0;
            }

            private static boolean llllIIIlllIIII(int i15, int i16) {
                return i15 >= i16;
            }
        };
        final String str30 = llIIIIllIIlI[llIIIIllIIll[29]];
        final int i15 = llIIIIllIIll[14];
        final A a15 = A.SPECIAL;
        final String str31 = llIIIIllIIlI[llIIIIllIIll[30]];
        final ?? r614 = llIIIIllIIll[0];
        CACTUS = new P(str30, i15, a15, str31, r614) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.W
            private static /* synthetic */ int[] lIlllIIlIllI;

            private static boolean lllIlIlllIIIII(int i16) {
                return i16 >= 0;
            }

            private static boolean lllIlIlllIIIIl(int i16, int i17) {
                return i16 <= i17;
            }

            private static boolean lllIlIlllIIIlI(int i16, int i17) {
                return i16 >= i17;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i16) {
                if (lllIlIlllIIIII(i16) && lllIlIlllIIIIl(i16, lIlllIIlIllI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIIlIllI[0] - i16);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[1]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIIlIllI[0]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[3]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[4])) {
                    return new C0014an(EnumC0021au.CACTUS, EnumC0039n.GROWING, i16 - lIlllIIlIllI[3]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[5]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[6])) {
                    return new C0014an(EnumC0021au.CACTUS, EnumC0039n.HARVESTABLE, i16 - lIlllIIlIllI[5]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[7]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[8])) {
                    return new C0014an(EnumC0021au.CACTUS, EnumC0039n.DISEASED, i16 - lIlllIIlIllI[6]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[9]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[10])) {
                    return new C0014an(EnumC0021au.CACTUS, EnumC0039n.DEAD, i16 - lIlllIIlIllI[8]);
                }
                if (lllIlIlllIIIll(i16, lIlllIIlIllI[11])) {
                    return new C0014an(EnumC0021au.CACTUS, EnumC0039n.GROWING, EnumC0021au.CACTUS.bc() - lIlllIIlIllI[12]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[13]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[14])) {
                    return new C0014an(EnumC0021au.POTATO_CACTUS, EnumC0039n.GROWING, i16 - lIlllIIlIllI[13]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[15]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[16])) {
                    return new C0014an(EnumC0021au.POTATO_CACTUS, EnumC0039n.HARVESTABLE, i16 - lIlllIIlIllI[15]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[17]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[18])) {
                    return new C0014an(EnumC0021au.POTATO_CACTUS, EnumC0039n.DISEASED, i16 - lIlllIIlIllI[16]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[19]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[20])) {
                    return new C0014an(EnumC0021au.POTATO_CACTUS, EnumC0039n.DEAD, i16 - lIlllIIlIllI[18]);
                }
                if (lllIlIlllIIIll(i16, lIlllIIlIllI[21])) {
                    return new C0014an(EnumC0021au.POTATO_CACTUS, EnumC0039n.GROWING, EnumC0021au.POTATO_CACTUS.bc() - lIlllIIlIllI[12]);
                }
                if (lllIlIlllIIIlI(i16, lIlllIIlIllI[22]) && lllIlIlllIIIIl(i16, lIlllIIlIllI[23])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIIlIllI[0]);
                }
                return null;
            }

            private static boolean lllIlIlllIIIll(int i16, int i17) {
                return i16 == i17;
            }

            private static void lllIlIllIlllll() {
                lIlllIIlIllI = new int[24];
                lIlllIIlIllI[0] = "   ".length();
                lIlllIIlIllI[1] = 103 ^ 99;
                lIlllIIlIllI[2] = (((46 + 95) - 50) + 47) ^ (((61 + 107) - 138) + 111);
                lIlllIIlIllI[3] = 126 ^ 118;
                lIlllIIlIllI[4] = 99 ^ 109;
                lIlllIIlIllI[5] = (37 ^ 126) ^ (104 ^ 60);
                lIlllIIlIllI[6] = (54 ^ 95) ^ (72 ^ 51);
                lIlllIIlIllI[7] = 179 ^ 160;
                lIlllIIlIllI[8] = (((43 + 110) - 144) + 150) ^ (((132 + 130) - 174) + 47);
                lIlllIIlIllI[9] = (182 ^ 173) ^ "  ".length();
                lIlllIIlIllI[10] = 11 ^ 21;
                lIlllIIlIllI[11] = 38 ^ 57;
                lIlllIIlIllI[12] = " ".length();
                lIlllIIlIllI[13] = 38 ^ 6;
                lIlllIIlIllI[14] = 87 ^ 113;
                lIlllIIlIllI[15] = 93 ^ 122;
                lIlllIIlIllI[16] = 160 ^ 141;
                lIlllIIlIllI[17] = 99 ^ 77;
                lIlllIIlIllI[18] = (((127 + 28) - 81) + 94) ^ (((64 + 6) - 21) + 106);
                lIlllIIlIllI[19] = 41 ^ 29;
                lIlllIIlIllI[20] = " ".length() ^ (161 ^ 153);
                lIlllIIlIllI[21] = 1 ^ 59;
                lIlllIIlIllI[22] = 184 ^ 131;
                lIlllIIlIllI[23] = (((((184 + 101) - 162) + 68) + (156 ^ 154)) - (118 ^ 15)) + ((54 + 88) - 46) + 83;
            }

            static {
                lllIlIllIlllll();
            }
        };
        final String str32 = llIIIIllIIlI[llIIIIllIIll[31]];
        final int i16 = llIIIIllIIll[15];
        final A a16 = A.SPECIAL;
        final String str33 = llIIIIllIIlI[llIIIIllIIll[32]];
        final ?? r615 = llIIIIllIIll[1];
        SEAWEED = new P(str32, i16, a16, str33, r615) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.X
            private static /* synthetic */ int[] llIIIlIlllIl;

            private static boolean llllIlIlIlllll(int i17, int i18) {
                return i17 >= i18;
            }

            private static boolean llllIlIlIllllI(int i17, int i18) {
                return i17 <= i18;
            }

            private static boolean llllIlIlIlllIl(int i17) {
                return i17 >= 0;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i17) {
                if (llllIlIlIlllIl(i17) && llllIlIlIllllI(i17, llIIIlIlllIl[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIlllIl[0] - i17);
                }
                if (llllIlIlIlllll(i17, llIIIlIlllIl[1]) && llllIlIlIllllI(i17, llIIIlIlllIl[2])) {
                    return new C0014an(EnumC0021au.SEAWEED, EnumC0039n.GROWING, i17 - llIIIlIlllIl[1]);
                }
                if (llllIlIlIlllll(i17, llIIIlIlllIl[3]) && llllIlIlIllllI(i17, llIIIlIlllIl[4])) {
                    return new C0014an(EnumC0021au.SEAWEED, EnumC0039n.HARVESTABLE, i17 - llIIIlIlllIl[3]);
                }
                if (llllIlIlIlllll(i17, llIIIlIlllIl[5]) && llllIlIlIllllI(i17, llIIIlIlllIl[6])) {
                    return new C0014an(EnumC0021au.SEAWEED, EnumC0039n.DISEASED, i17 - llIIIlIlllIl[4]);
                }
                if (llllIlIlIlllll(i17, llIIIlIlllIl[7]) && llllIlIlIllllI(i17, llIIIlIlllIl[8])) {
                    return new C0014an(EnumC0021au.SEAWEED, EnumC0039n.DEAD, i17 - llIIIlIlllIl[6]);
                }
                if (llllIlIlIlllll(i17, llIIIlIlllIl[9]) && llllIlIlIllllI(i17, llIIIlIlllIl[10])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIlllIl[0]);
                }
                return null;
            }

            private static void llllIlIlIlllII() {
                llIIIlIlllIl = new int[11];
                llIIIlIlllIl[0] = "   ".length();
                llIIIlIlllIl[1] = 3 ^ 7;
                llIIIlIlllIl[2] = (((182 + 188) - 259) + 82) ^ (((2 + 70) - 24) + 150);
                llIIIlIlllIl[3] = (16 ^ 44) ^ (64 ^ 116);
                llIIIlIlllIl[4] = 110 ^ 100;
                llIIIlIlllIl[5] = 162 ^ 169;
                llIIIlIlllIl[6] = 114 ^ 127;
                llIIIlIlllIl[7] = 9 ^ 7;
                llIIIlIlllIl[8] = 189 ^ 173;
                llIIIlIlllIl[9] = (236 ^ 134) ^ (32 ^ 91);
                llIIIlIlllIl[10] = ((14 + 35) - (-28)) + 178;
            }

            static {
                llllIlIlIlllII();
            }
        };
        final String str34 = llIIIIllIIlI[llIIIIllIIll[33]];
        final int i17 = llIIIIllIIll[16];
        final A a17 = A.FRUIT_TREE;
        final String str35 = llIIIIllIIlI[llIIIIllIIll[34]];
        final ?? r616 = llIIIIllIIll[0];
        CALQUAT = new P(str34, i17, a17, str35, r616) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.Y
            private static /* synthetic */ int[] llIIIlIIIllI;

            private static void llllIlIIIIIIII() {
                llIIIlIIIllI = new int[13];
                llIIIlIIIllI[0] = "   ".length();
                llIIIlIIIllI[1] = 189 ^ 185;
                llIIIlIIIllI[2] = 84 ^ 95;
                llIIIlIIIllI[3] = (99 ^ 11) ^ (221 ^ 185);
                llIIIlIIIllI[4] = (124 ^ 107) ^ (88 ^ 93);
                llIIIlIIIllI[5] = (((89 + 102) - 156) + 123) ^ (((62 + 47) - 89) + 121);
                llIIIlIIIllI[6] = (29 ^ 112) ^ (5 ^ 113);
                llIIIlIIIllI[7] = (52 ^ 92) ^ (230 ^ 148);
                llIIIlIIIllI[8] = 116 ^ 85;
                llIIIlIIIllI[9] = 83 ^ 113;
                llIIIlIIIllI[10] = " ".length();
                llIIIlIIIllI[11] = (41 ^ 108) ^ (107 ^ 13);
                llIIIlIIIllI[12] = (((((64 + 54) - 84) + 211) + (108 ^ 42)) - (((58 + 157) - 64) + 11)) + (64 ^ 38);
            }

            private static boolean llllIlIIIIIIll(int i18, int i19) {
                return i18 >= i19;
            }

            private static boolean llllIlIIIIIIlI(int i18, int i19) {
                return i18 <= i19;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i18) {
                if (llllIlIIIIIIIl(i18) && llllIlIIIIIIlI(i18, llIIIlIIIllI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIIIllI[0] - i18);
                }
                if (llllIlIIIIIIll(i18, llIIIlIIIllI[1]) && llllIlIIIIIIlI(i18, llIIIlIIIllI[2])) {
                    return new C0014an(EnumC0021au.CALQUAT, EnumC0039n.GROWING, i18 - llIIIlIIIllI[1]);
                }
                if (llllIlIIIIIIll(i18, llIIIlIIIllI[3]) && llllIlIIIIIIlI(i18, llIIIlIIIllI[4])) {
                    return new C0014an(EnumC0021au.CALQUAT, EnumC0039n.HARVESTABLE, i18 - llIIIlIIIllI[3]);
                }
                if (llllIlIIIIIIll(i18, llIIIlIIIllI[5]) && llllIlIIIIIIlI(i18, llIIIlIIIllI[6])) {
                    return new C0014an(EnumC0021au.CALQUAT, EnumC0039n.DISEASED, i18 - llIIIlIIIllI[4]);
                }
                if (llllIlIIIIIIll(i18, llIIIlIIIllI[7]) && llllIlIIIIIIlI(i18, llIIIlIIIllI[8])) {
                    return new C0014an(EnumC0021au.CALQUAT, EnumC0039n.DEAD, i18 - llIIIlIIIllI[6]);
                }
                if (llllIlIIIIIlII(i18, llIIIlIIIllI[9])) {
                    return new C0014an(EnumC0021au.CALQUAT, EnumC0039n.GROWING, EnumC0021au.CALQUAT.bc() - llIIIlIIIllI[10]);
                }
                if (llllIlIIIIIIll(i18, llIIIlIIIllI[11]) && llllIlIIIIIIlI(i18, llIIIlIIIllI[12])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIlIIIllI[0]);
                }
                return null;
            }

            static {
                llllIlIIIIIIII();
            }

            private static boolean llllIlIIIIIlII(int i18, int i19) {
                return i18 == i19;
            }

            private static boolean llllIlIIIIIIIl(int i18) {
                return i18 >= 0;
            }
        };
        final String str36 = llIIIIllIIlI[llIIIIllIIll[35]];
        final int i18 = llIIIIllIIll[17];
        final A a18 = A.FRUIT_TREE;
        final String str37 = llIIIIllIIlI[llIIIIllIIll[36]];
        final ?? r617 = llIIIIllIIll[0];
        CELASTRUS = new P(str36, i18, a18, str37, r617) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.Z
            private static /* synthetic */ int[] lIlllIlllIll;

            private static boolean lllIllIlIIlllI(int i19, int i20) {
                return i19 == i20;
            }

            private static void lllIllIlIIlIlI() {
                lIlllIlllIll = new int[18];
                lIlllIlllIll[0] = "   ".length();
                lIlllIlllIll[1] = 76 ^ 72;
                lIlllIlllIll[2] = (218 ^ 154) ^ (50 ^ 117);
                lIlllIlllIll[3] = 119 ^ 127;
                lIlllIlllIll[4] = (218 ^ 151) ^ (215 ^ 150);
                lIlllIlllIll[5] = (((77 + 83) - 154) + 125) ^ (((57 + 109) - 39) + 15);
                lIlllIlllIll[6] = " ".length();
                lIlllIlllIll[7] = 129 ^ 143;
                lIlllIlllIll[8] = (0 ^ 4) ^ (138 ^ 158);
                lIlllIlllIll[9] = (149 ^ 132) ^ ((165 ^ 169) & ((144 ^ 156) ^ (-1)));
                lIlllIlllIll[10] = ((72 ^ 48) ^ (5 ^ 29)) & (((115 ^ 101) ^ (244 ^ 130)) ^ (-" ".length()));
                lIlllIlllIll[11] = (((37 + 152) - 129) + 123) ^ (((141 + 40) - 86) + 70);
                lIlllIlllIll[12] = (37 ^ 23) ^ (64 ^ 100);
                lIlllIlllIll[13] = (254 ^ 161) ^ (71 ^ 15);
                lIlllIlllIll[14] = 171 ^ 176;
                lIlllIlllIll[15] = (213 ^ 130) ^ (103 ^ 44);
                lIlllIlllIll[16] = 80 ^ 77;
                lIlllIlllIll[17] = (((((56 + 119) - 5) + 4) + (((137 + 8) - 25) + 38)) - (((79 + 58) - 94) + 134)) + (86 ^ 50);
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i19) {
                if (lllIllIlIIlIll(i19) && lllIllIlIIllII(i19, lIlllIlllIll[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIll[0] - i19);
                }
                if (lllIllIlIIllIl(i19, lIlllIlllIll[1]) && lllIllIlIIllII(i19, lIlllIlllIll[2])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIll[0]);
                }
                if (lllIllIlIIllIl(i19, lIlllIlllIll[3]) && lllIllIlIIllII(i19, lIlllIlllIll[4])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.GROWING, i19 - lIlllIlllIll[3]);
                }
                if (lllIllIlIIlllI(i19, lIlllIlllIll[5])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.GROWING, EnumC0021au.CELASTRUS.bc() - lIlllIlllIll[6]);
                }
                if (lllIllIlIIllIl(i19, lIlllIlllIll[7]) && lllIllIlIIllII(i19, lIlllIlllIll[8])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.HARVESTABLE, i19 - lIlllIlllIll[7]);
                }
                if (lllIllIlIIlllI(i19, lIlllIlllIll[9])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.HARVESTABLE, lIlllIlllIll[10]);
                }
                if (lllIllIlIIllIl(i19, lIlllIlllIll[11]) && lllIllIlIIllII(i19, lIlllIlllIll[12])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.DISEASED, i19 - lIlllIlllIll[9]);
                }
                if (lllIllIlIIllIl(i19, lIlllIlllIll[13]) && lllIllIlIIllII(i19, lIlllIlllIll[14])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.DEAD, i19 - lIlllIlllIll[12]);
                }
                if (lllIllIlIIlllI(i19, lIlllIlllIll[15])) {
                    return new C0014an(EnumC0021au.CELASTRUS, EnumC0039n.HARVESTABLE, lIlllIlllIll[10]);
                }
                if (lllIllIlIIllIl(i19, lIlllIlllIll[16]) && lllIllIlIIllII(i19, lIlllIlllIll[17])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlllIll[0]);
                }
                return null;
            }

            private static boolean lllIllIlIIllII(int i19, int i20) {
                return i19 <= i20;
            }

            private static boolean lllIllIlIIllIl(int i19, int i20) {
                return i19 >= i20;
            }

            private static boolean lllIllIlIIlIll(int i19) {
                return i19 >= 0;
            }

            static {
                lllIllIlIIlIlI();
            }
        };
        final String str38 = llIIIIllIIlI[llIIIIllIIll[37]];
        final int i19 = llIIIIllIIll[18];
        final A a19 = A.GRAPE;
        final String str39 = llIIIIllIIlI[llIIIIllIIll[38]];
        final ?? r618 = llIIIIllIIll[0];
        GRAPES = new P(str38, i19, a19, str39, r618) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.aa
            private static /* synthetic */ int[] lIlllIlIIIlI;

            static {
                lllIllIIIIlIll();
            }

            private static void lllIllIIIIlIll() {
                lIlllIlIIIlI = new int[8];
                lIlllIlIIIlI[0] = " ".length();
                lIlllIlIIIlI[1] = "   ".length();
                lIlllIlIIIlI[2] = "  ".length();
                lIlllIlIIIlI[3] = (((72 + 67) - 77) + 107) ^ (((99 + 29) - 25) + 57);
                lIlllIlIIIlI[4] = (119 ^ 30) ^ (56 ^ 91);
                lIlllIlIIIlI[5] = (41 ^ 62) ^ (149 ^ 133);
                lIlllIlIIIlI[6] = (222 ^ 151) ^ (61 ^ 127);
                lIlllIlIIIlI[7] = 127 ^ 112;
            }

            private static boolean lllIllIIIIllIl(int i20, int i21) {
                return i20 <= i21;
            }

            private static boolean lllIllIIIIllII(int i20) {
                return i20 >= 0;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i20) {
                if (lllIllIIIIllII(i20) && lllIllIIIIllIl(i20, lIlllIlIIIlI[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, lIlllIlIIIlI[1]);
                }
                if (lllIllIIIIlllI(i20, lIlllIlIIIlI[2]) && lllIllIIIIllIl(i20, lIlllIlIIIlI[3])) {
                    return new C0014an(EnumC0021au.GRAPE, EnumC0039n.GROWING, i20 - lIlllIlIIIlI[2]);
                }
                if (lllIllIIIIllll(i20, lIlllIlIIIlI[4])) {
                    return new C0014an(EnumC0021au.GRAPE, EnumC0039n.GROWING, lIlllIlIIIlI[5]);
                }
                if (lllIllIIIIlllI(i20, lIlllIlIIIlI[6]) && lllIllIIIIllIl(i20, lIlllIlIIIlI[7])) {
                    return new C0014an(EnumC0021au.GRAPE, EnumC0039n.HARVESTABLE, i20 - lIlllIlIIIlI[6]);
                }
                return null;
            }

            private static boolean lllIllIIIIllll(int i20, int i21) {
                return i20 == i21;
            }

            private static boolean lllIllIIIIlllI(int i20, int i21) {
                return i20 >= i21;
            }
        };
        final String str40 = llIIIIllIIlI[llIIIIllIIll[39]];
        final int i20 = llIIIIllIIll[19];
        final A a20 = A.FRUIT_TREE;
        final String str41 = llIIIIllIIlI[llIIIIllIIll[40]];
        final ?? r619 = llIIIIllIIll[0];
        CRYSTAL_TREE = new P(str40, i20, a20, str41, r619) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ac
            private static /* synthetic */ int[] llIIIIlllIll;

            private static boolean llllIIllIllIIl(int i21) {
                return i21 >= 0;
            }

            private static boolean llllIIllIllIll(int i21, int i22) {
                return i21 >= i22;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i21) {
                if (llllIIllIllIIl(i21) && llllIIllIllIlI(i21, llIIIIlllIll[0])) {
                    return new C0014an(EnumC0021au.WEEDS, EnumC0039n.GROWING, llIIIIlllIll[0] - i21);
                }
                if (llllIIllIllIll(i21, llIIIIlllIll[1]) && llllIIllIllIlI(i21, llIIIIlllIll[2])) {
                    return new C0014an(EnumC0021au.CRYSTAL_TREE, EnumC0039n.GROWING, i21 - llIIIIlllIll[1]);
                }
                if (llllIIllIlllII(i21, llIIIIlllIll[3])) {
                    return new C0014an(EnumC0021au.CRYSTAL_TREE, EnumC0039n.GROWING, EnumC0021au.CRYSTAL_TREE.bc() - llIIIIlllIll[4]);
                }
                if (llllIIllIlllII(i21, llIIIIlllIll[5])) {
                    return new C0014an(EnumC0021au.CRYSTAL_TREE, EnumC0039n.HARVESTABLE, llIIIIlllIll[6]);
                }
                return null;
            }

            static {
                llllIIllIllIII();
            }

            private static boolean llllIIllIlllII(int i21, int i22) {
                return i21 == i22;
            }

            private static boolean llllIIllIllIlI(int i21, int i22) {
                return i21 <= i22;
            }

            private static void llllIIllIllIII() {
                llIIIIlllIll = new int[7];
                llIIIIlllIll[0] = "   ".length();
                llIIIIlllIll[1] = 76 ^ 68;
                llIIIIlllIll[2] = 109 ^ 96;
                llIIIIlllIll[3] = 106 ^ 100;
                llIIIIlllIll[4] = " ".length();
                llIIIIlllIll[5] = (31 ^ 16) ^ ((156 ^ 175) & ((47 ^ 28) ^ (-1)));
                llIIIIlllIll[6] = (4 ^ 31) & ((182 ^ 173) ^ (-1));
            }
        };
        final String str42 = llIIIIllIIlI[llIIIIllIIll[41]];
        final int i21 = llIIIIllIIll[20];
        final A a21 = A.SPECIAL;
        final String str43 = llIIIIllIIlI[llIIIIllIIll[42]];
        final ?? r620 = llIIIIllIIll[0];
        COMPOST = new P(str42, i21, a21, str43, r620) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ad
            private static /* synthetic */ int[] lIlllIIllIll;

            private static boolean lllIlIllllIlIl(int i22, int i23) {
                return i22 >= i23;
            }

            private static boolean lllIlIlllllIII(int i22, int i23) {
                return i22 == i23;
            }

            static {
                lllIlIllllIIll();
            }

            private static void lllIlIllllIIll() {
                lIlllIIllIll = new int[23];
                lIlllIIllIll[0] = ((((147 + 170) - 227) + 143) ^ (((103 + 101) - 55) + 33)) & (((237 ^ 190) ^ (155 ^ 151)) ^ (-" ".length()));
                lIlllIIllIll[1] = " ".length();
                lIlllIIllIll[2] = 190 ^ 177;
                lIlllIIllIll[3] = (((152 + 77) - 143) + 97) ^ (((46 + 140) - 122) + 103);
                lIlllIIllIll[4] = 32 ^ 62;
                lIlllIIllIll[5] = 166 ^ 185;
                lIlllIIllIll[6] = " ".length() ^ (133 ^ 164);
                lIlllIIllIll[7] = 79 ^ 110;
                lIlllIIllIll[8] = (((57 + 119) - 4) + 12) ^ (((41 + 41) - 30) + 99);
                lIlllIIllIll[9] = (94 ^ 57) ^ (251 ^ 172);
                lIlllIIllIll[10] = 133 ^ 187;
                lIlllIIllIll[11] = 13 ^ 83;
                lIlllIIllIll[12] = (180 ^ 173) ^ (212 ^ 146);
                lIlllIIllIll[13] = (215 ^ 187) ^ (74 ^ 70);
                lIlllIIllIll[14] = 9 ^ 119;
                lIlllIIllIll[15] = (((51 ^ 73) + (207 ^ 164)) - (37 ^ 92)) + (17 ^ 4);
                lIlllIIllIll[16] = ((128 + 41) - 148) + 122;
                lIlllIIllIll[17] = (((32 ^ 19) + (((61 + 41) - 35) + 61)) - (36 ^ 68)) + (7 ^ 58);
                lIlllIIllIll[18] = (((155 ^ 183) + (171 ^ 192)) - (236 ^ 184)) + (8 ^ 83);
                lIlllIIllIll[19] = ((52 + 0) - (-107)) + 0;
                lIlllIIllIll[20] = ((127 + 132) - 108) + 9;
                lIlllIIllIll[21] = ((31 + 133) - 121) + 133;
                lIlllIIllIll[22] = ((50 + 91) - 40) + 89;
            }

            private static boolean lllIlIllllIlll(int i22, int i23) {
                return i22 != i23;
            }

            private static boolean lllIlIllllIlII(int i22) {
                return i22 == 0;
            }

            private static boolean lllIlIllllIllI(int i22, int i23) {
                return i22 <= i23;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i22) {
                if (lllIlIllllIlII(i22)) {
                    return new C0014an(EnumC0021au.EMPTY_COMPOST_BIN, EnumC0039n.EMPTY, lIlllIIllIll[0]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[1]) && lllIlIllllIllI(i22, lIlllIIllIll[2])) {
                    return new C0014an(EnumC0021au.COMPOST, EnumC0039n.FILLING, i22 - lIlllIIllIll[1]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[3]) && lllIlIllllIllI(i22, lIlllIIllIll[4])) {
                    return new C0014an(EnumC0021au.COMPOST, EnumC0039n.HARVESTABLE, i22 - lIlllIIllIll[3]);
                }
                if (!lllIlIllllIlll(i22, lIlllIIllIll[5]) || lllIlIlllllIII(i22, lIlllIIllIll[6])) {
                    return new C0014an(EnumC0021au.COMPOST, EnumC0039n.GROWING, i22 - lIlllIIllIll[5]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[7]) && lllIlIllllIllI(i22, lIlllIIllIll[8])) {
                    return new C0014an(EnumC0021au.SUPERCOMPOST, EnumC0039n.FILLING, i22 - lIlllIIllIll[7]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[9]) && lllIlIllllIllI(i22, lIlllIIllIll[10])) {
                    return new C0014an(EnumC0021au.SUPERCOMPOST, EnumC0039n.HARVESTABLE, i22 - lIlllIIllIll[9]);
                }
                if (lllIlIlllllIII(i22, lIlllIIllIll[11])) {
                    return new C0014an(EnumC0021au.COMPOST, EnumC0039n.GROWING, EnumC0021au.COMPOST.bc() - lIlllIIllIll[1]);
                }
                if (!lllIlIllllIlll(i22, lIlllIIllIll[12]) || lllIlIlllllIII(i22, lIlllIIllIll[13])) {
                    return new C0014an(EnumC0021au.SUPERCOMPOST, EnumC0039n.GROWING, i22 - lIlllIIllIll[12]);
                }
                if (lllIlIlllllIII(i22, lIlllIIllIll[14])) {
                    return new C0014an(EnumC0021au.SUPERCOMPOST, EnumC0039n.GROWING, EnumC0021au.SUPERCOMPOST.bc() - lIlllIIllIll[1]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[15]) && lllIlIllllIllI(i22, lIlllIIllIll[16])) {
                    return new C0014an(EnumC0021au.ROTTEN_TOMATO, EnumC0039n.FILLING, i22 - lIlllIIllIll[15]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[17]) && lllIlIllllIllI(i22, lIlllIIllIll[18])) {
                    return new C0014an(EnumC0021au.ROTTEN_TOMATO, EnumC0039n.HARVESTABLE, i22 - lIlllIIllIll[17]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[19]) && lllIlIllllIllI(i22, lIlllIIllIll[20])) {
                    return new C0014an(EnumC0021au.ROTTEN_TOMATO, EnumC0039n.GROWING, i22 - lIlllIIllIll[19]);
                }
                if (lllIlIllllIlIl(i22, lIlllIIllIll[21]) && lllIlIllllIllI(i22, lIlllIIllIll[22])) {
                    return new C0014an(EnumC0021au.ULTRACOMPOST, EnumC0039n.HARVESTABLE, i22 - lIlllIIllIll[21]);
                }
                return null;
            }
        };
        final String str44 = llIIIIllIIlI[llIIIIllIIll[43]];
        final int i22 = llIIIIllIIll[21];
        final A a22 = A.SPECIAL;
        final String str45 = llIIIIllIIlI[llIIIIllIIll[44]];
        final ?? r621 = llIIIIllIIll[0];
        GIANT_COMPOST = new P(str44, i22, a22, str45, r621) { // from class: -.m.e.a.u.s.r.r.q.i.r.e.f.ae
            private static /* synthetic */ int[] lIlllllIIIll;

            private static boolean lllIllllIIllIl(int i23) {
                return i23 == 0;
            }

            @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.P
            public C0014an f(int i23) {
                if (lllIllllIIllIl(i23)) {
                    return new C0014an(EnumC0021au.EMPTY_GIANT_COMPOST_BIN, EnumC0039n.EMPTY, lIlllllIIIll[0]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[1]) && lllIllllIIllll(i23, lIlllllIIIll[2])) {
                    return new C0014an(EnumC0021au.GIANT_COMPOST, EnumC0039n.FILLING, i23 - lIlllllIIIll[1]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[3]) && lllIllllIIllll(i23, lIlllllIIIll[4])) {
                    return new C0014an(EnumC0021au.GIANT_COMPOST, EnumC0039n.HARVESTABLE, i23 - lIlllllIIIll[3]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[5]) && lllIllllIIllll(i23, lIlllllIIIll[6])) {
                    return new C0014an(EnumC0021au.GIANT_SUPERCOMPOST, EnumC0039n.FILLING, i23 - lIlllllIIIll[5]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[7]) && lllIllllIIllll(i23, lIlllllIIIll[8])) {
                    return new C0014an(EnumC0021au.GIANT_SUPERCOMPOST, EnumC0039n.HARVESTABLE, i23 - lIlllllIIIll[7]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[9]) && lllIllllIIllll(i23, lIlllllIIIll[10])) {
                    return new C0014an(EnumC0021au.GIANT_COMPOST, EnumC0039n.FILLING, (lIlllllIIIll[2] + i23) - lIlllllIIIll[9]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[11]) && lllIllllIIllll(i23, lIlllllIIIll[12])) {
                    return new C0014an(EnumC0021au.GIANT_COMPOST, EnumC0039n.HARVESTABLE, (lIlllllIIIll[2] + i23) - lIlllllIIIll[11]);
                }
                if (lllIllllIlIIII(i23, lIlllllIIIll[13])) {
                    return new C0014an(EnumC0021au.GIANT_COMPOST, EnumC0039n.GROWING, EnumC0021au.GIANT_COMPOST.bc() - lIlllllIIIll[1]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[14]) && lllIllllIIllll(i23, lIlllllIIIll[15])) {
                    return new C0014an(EnumC0021au.GIANT_SUPERCOMPOST, EnumC0039n.GROWING, i23 - lIlllllIIIll[14]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[16]) && lllIllllIIllll(i23, lIlllllIIIll[17])) {
                    return new C0014an(EnumC0021au.GIANT_SUPERCOMPOST, EnumC0039n.HARVESTABLE, (lIlllllIIIll[2] + i23) - lIlllllIIIll[16]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[18]) && lllIllllIIllll(i23, lIlllllIIIll[19])) {
                    return new C0014an(EnumC0021au.GIANT_COMPOST, EnumC0039n.GROWING, i23 - lIlllllIIIll[18]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[20]) && lllIllllIIllll(i23, lIlllllIIIll[21])) {
                    return new C0014an(EnumC0021au.GIANT_ROTTEN_TOMATO, EnumC0039n.FILLING, i23 - lIlllllIIIll[20]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[22]) && lllIllllIIllll(i23, lIlllllIIIll[23])) {
                    return new C0014an(EnumC0021au.GIANT_ROTTEN_TOMATO, EnumC0039n.HARVESTABLE, i23 - lIlllllIIIll[22]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[24]) && lllIllllIIllll(i23, lIlllllIIIll[25])) {
                    return new C0014an(EnumC0021au.GIANT_ROTTEN_TOMATO, EnumC0039n.GROWING, i23 - lIlllllIIIll[24]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[26]) && lllIllllIIllll(i23, lIlllllIIIll[27])) {
                    return new C0014an(EnumC0021au.GIANT_SUPERCOMPOST, EnumC0039n.FILLING, (lIlllllIIIll[2] + i23) - lIlllllIIIll[26]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[28]) && lllIllllIIllll(i23, lIlllllIIIll[29])) {
                    return new C0014an(EnumC0021au.GIANT_ULTRACOMPOST, EnumC0039n.HARVESTABLE, i23 - lIlllllIIIll[28]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[30]) && lllIllllIIllll(i23, lIlllllIIIll[31])) {
                    return new C0014an(EnumC0021au.GIANT_ROTTEN_TOMATO, EnumC0039n.HARVESTABLE, (lIlllllIIIll[2] + i23) - lIlllllIIIll[30]);
                }
                if (lllIllllIlIIII(i23, lIlllllIIIll[32])) {
                    return new C0014an(EnumC0021au.GIANT_ROTTEN_TOMATO, EnumC0039n.GROWING, EnumC0021au.GIANT_ROTTEN_TOMATO.bc() - lIlllllIIIll[1]);
                }
                if (lllIllllIIlllI(i23, lIlllllIIIll[33]) && lllIllllIIllll(i23, lIlllllIIIll[34])) {
                    return new C0014an(EnumC0021au.GIANT_ROTTEN_TOMATO, EnumC0039n.FILLING, (lIlllllIIIll[2] + i23) - lIlllllIIIll[33]);
                }
                return null;
            }

            private static boolean lllIllllIIlllI(int i23, int i24) {
                return i23 >= i24;
            }

            private static boolean lllIllllIIllll(int i23, int i24) {
                return i23 <= i24;
            }

            private static void lllIllllIIllII() {
                lIlllllIIIll = new int[35];
                lIlllllIIIll[0] = (211 ^ 150) & ((18 ^ 87) ^ (-1));
                lIlllllIIIll[1] = " ".length();
                lIlllllIIIll[2] = (27 ^ 83) ^ (6 ^ 65);
                lIlllllIIIll[3] = 46 ^ 62;
                lIlllllIIIll[4] = (((143 + 8) - (-3)) + 65) ^ (((17 + 47) - (-69)) + 64);
                lIlllllIIIll[5] = (((74 + 101) - 137) + 118) ^ (((49 + 43) - 80) + 177);
                lIlllllIIIll[6] = 3 ^ 44;
                lIlllllIIIll[7] = 65 ^ 113;
                lIlllllIIIll[8] = (159 ^ 173) ^ (53 ^ 57);
                lIlllllIIIll[9] = 151 ^ 168;
                lIlllllIIIll[10] = 110 ^ 35;
                lIlllllIIIll[11] = (254 ^ 135) ^ (126 ^ 73);
                lIlllllIIIll[12] = (((200 + 21) - 186) + 179) ^ (((78 + 97) - 89) + 52);
                lIlllllIIIll[13] = (88 ^ 96) ^ (55 ^ 82);
                lIlllllIIIll[14] = 236 ^ 141;
                lIlllllIIIll[15] = (70 ^ 110) ^ (200 ^ 131);
                lIlllllIIIll[16] = 41 ^ 77;
                lIlllllIIIll[17] = (((149 + 96) - 172) + 103) ^ (((159 + 123) - 186) + 98);
                lIlllllIIIll[18] = ((102 + 50) - 59) + 34;
                lIlllllIIIll[19] = (((35 ^ 65) + (74 ^ 33)) - (118 ^ 8)) + (176 ^ 129);
                lIlllllIIIll[20] = (((155 ^ 130) + (91 ^ 23)) - (157 ^ 128)) + (186 ^ 131);
                lIlllllIIIll[21] = (((102 ^ 55) + "  ".length()) - (-(51 ^ 34))) + (7 ^ 44);
                lIlllllIIIll[22] = ((23 + 114) - 106) + 113;
                lIlllllIIIll[23] = (((195 ^ 134) + (180 ^ 157)) - (20 ^ 126)) + ((24 + 22) - 40) + 148;
                lIlllllIIIll[24] = (((((70 + 7) - (-42)) + 11) + (164 ^ 143)) - (239 ^ 129)) + (218 ^ 186);
                lIlllllIIIll[25] = (((157 ^ 178) + (236 ^ 197)) - (154 ^ 176)) + (45 ^ 95);
                lIlllllIIIll[26] = (((245 ^ 191) + (((114 + 7) - 10) + 39)) - (89 ^ 8)) + (113 ^ 99);
                lIlllllIIIll[27] = ((80 + 161) - 162) + 96;
                lIlllllIIIll[28] = ((32 + 20) - (-32)) + 92;
                lIlllllIIIll[29] = (((149 ^ 145) + (190 ^ 194)) - (142 ^ 197)) + ((61 + 7) - 36) + 120;
                lIlllllIIIll[30] = (((33 ^ 93) + (33 ^ 74)) - (((185 + 185) - 189) + 48)) + ((114 + 63) - 77) + 105;
                lIlllllIIIll[31] = ((83 + 204) - 218) + 152;
                lIlllllIIIll[32] = ((205 + 76) - 219) + 160;
                lIlllllIIIll[33] = ((192 + 19) - 160) + 172;
                lIlllllIIIll[34] = (((46 ^ 111) + (((53 + 116) - 145) + 138)) - (82 ^ 109)) + (55 ^ 126);
            }

            static {
                lllIllllIIllII();
            }

            private static boolean lllIllllIlIIII(int i23, int i24) {
                return i23 == i24;
            }
        };
        P[] pArr = new P[llIIIIllIIll[22]];
        pArr[llIIIIllIIll[1]] = BELLADONNA;
        pArr[llIIIIllIIll[0]] = MUSHROOM;
        pArr[llIIIIllIIll[2]] = HESPORI;
        pArr[llIIIIllIIll[3]] = ALLOTMENT;
        pArr[llIIIIllIIll[4]] = HERB;
        pArr[llIIIIllIIll[5]] = FLOWER;
        pArr[llIIIIllIIll[6]] = BUSH;
        pArr[llIIIIllIIll[7]] = FRUIT_TREE;
        pArr[llIIIIllIIll[8]] = HOPS;
        pArr[llIIIIllIIll[9]] = TREE;
        pArr[llIIIIllIIll[10]] = HARDWOOD_TREE;
        pArr[llIIIIllIIll[11]] = REDWOOD;
        pArr[llIIIIllIIll[12]] = SPIRIT_TREE;
        pArr[llIIIIllIIll[13]] = ANIMA;
        pArr[llIIIIllIIll[14]] = CACTUS;
        pArr[llIIIIllIIll[15]] = SEAWEED;
        pArr[llIIIIllIIll[16]] = CALQUAT;
        pArr[llIIIIllIIll[17]] = CELASTRUS;
        pArr[llIIIIllIIll[18]] = GRAPES;
        pArr[llIIIIllIIll[19]] = CRYSTAL_TREE;
        pArr[llIIIIllIIll[20]] = COMPOST;
        pArr[llIIIIllIIll[21]] = GIANT_COMPOST;
        $VALUES = pArr;
    }

    private static String llllIIllIIIIIl(String lllllllllllllllIlIlIlIlIIllIIIIl, String lllllllllllllllIlIlIlIlIIllIIIII) {
        String lllllllllllllllIlIlIlIlIIllIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlIlIIlIlllll = new StringBuilder();
        char[] lllllllllllllllIlIlIlIlIIlIllllI = lllllllllllllllIlIlIlIlIIllIIIII.toCharArray();
        int lllllllllllllllIlIlIlIlIIlIlllIl = llIIIIllIIll[1];
        char[] charArray = lllllllllllllllIlIlIlIlIIllIIIIl2.toCharArray();
        int length = charArray.length;
        int i = llIIIIllIIll[1];
        while (llllIIllIIlIII(i, length)) {
            char lllllllllllllllIlIlIlIlIIllIIIlI = charArray[i];
            lllllllllllllllIlIlIlIlIIlIlllll.append((char) (lllllllllllllllIlIlIlIlIIllIIIlI ^ lllllllllllllllIlIlIlIlIIlIllllI[lllllllllllllllIlIlIlIlIIlIlllIl % lllllllllllllllIlIlIlIlIIlIllllI.length]));
            "".length();
            lllllllllllllllIlIlIlIlIIlIlllIl++;
            i++;
            "".length();
            if (((((19 + 152) - 98) + 104) ^ (((172 + 38) - 154) + 124)) == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIlIlIIlIlllll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean aT() {
        if (llllIIllIIIllI(this, HERB) && llllIIllIIIllI(this, BUSH) && llllIIllIIIllI(this, SEAWEED) && !llllIIllIIIlll(this, GRAPES)) {
            return llIIIIllIIll[1];
        }
        ?? r0 = llIIIIllIIll[0];
        "".length();
        return (((((179 + 84) - 134) + 76) ^ (((118 + 49) - 164) + 145)) & (((49 ^ 107) ^ "   ".length()) ^ (-" ".length()))) != 0 ? ((123 ^ 32) ^ (160 ^ 178)) & (((((63 + 120) - 53) + 110) ^ (((72 + 78) - (-31)) + 4)) ^ (-" ".length())) : r0;
    }

    private static void llllIIllIIIlIl() {
        llIIIIllIIll = new int[46];
        llIIIIllIIll[0] = " ".length();
        llIIIIllIIll[1] = (46 ^ 40) & ((199 ^ 193) ^ (-1));
        llIIIIllIIll[2] = "  ".length();
        llIIIIllIIll[3] = "   ".length();
        llIIIIllIIll[4] = 126 ^ 122;
        llIIIIllIIll[5] = (((9 + 8) - 2) + 127) ^ (((82 + 111) - 82) + 28);
        llIIIIllIIll[6] = 108 ^ 106;
        llIIIIllIIll[7] = (189 ^ 158) ^ (51 ^ 23);
        llIIIIllIIll[8] = 157 ^ 149;
        llIIIIllIIll[9] = 135 ^ 142;
        llIIIIllIIll[10] = (170 ^ 131) ^ (15 ^ 44);
        llIIIIllIIll[11] = (((104 + 143) - 214) + 142) ^ (((126 + 69) - 140) + 109);
        llIIIIllIIll[12] = (218 ^ 149) ^ (194 ^ 129);
        llIIIIllIIll[13] = 61 ^ 48;
        llIIIIllIIll[14] = (67 ^ 87) ^ (178 ^ 168);
        llIIIIllIIll[15] = 126 ^ 113;
        llIIIIllIIll[16] = 152 ^ 136;
        llIIIIllIIll[17] = (253 ^ 188) ^ (145 ^ 193);
        llIIIIllIIll[18] = (92 ^ 68) ^ (140 ^ 134);
        llIIIIllIIll[19] = (63 ^ 46) ^ "  ".length();
        llIIIIllIIll[20] = (((55 + 166) - 159) + 121) ^ (((59 + 110) - 17) + 11);
        llIIIIllIIll[21] = 26 ^ 15;
        llIIIIllIIll[22] = (((12 + 16) - (-13)) + 112) ^ (((77 + 55) - 105) + 116);
        llIIIIllIIll[23] = 182 ^ 161;
        llIIIIllIIll[24] = (72 ^ 1) ^ (71 ^ 22);
        llIIIIllIIll[25] = 143 ^ 150;
        llIIIIllIIll[26] = 55 ^ 45;
        llIIIIllIIll[27] = (195 ^ 166) ^ (192 ^ 190);
        llIIIIllIIll[28] = (65 ^ 58) ^ (167 ^ 192);
        llIIIIllIIll[29] = (67 ^ 13) ^ (194 ^ 145);
        llIIIIllIIll[30] = 134 ^ 152;
        llIIIIllIIll[31] = (236 ^ 177) ^ (66 ^ 0);
        llIIIIllIIll[32] = (((64 + 87) - 60) + 100) ^ (((43 + 105) - 4) + 15);
        llIIIIllIIll[33] = (46 ^ 60) ^ (133 ^ 182);
        llIIIIllIIll[34] = (((5 + 145) - 147) + 150) ^ (((45 + 9) - (-10)) + 123);
        llIIIIllIIll[35] = (((104 + 52) - (-3)) + 17) ^ (((0 + 134) - 90) + 103);
        llIIIIllIIll[36] = 71 ^ 99;
        llIIIIllIIll[37] = 13 ^ 40;
        llIIIIllIIll[38] = 181 ^ 147;
        llIIIIllIIll[39] = (((77 + 27) - (-20)) + 30) ^ (((106 + 91) - 168) + 160);
        llIIIIllIIll[40] = 148 ^ 188;
        llIIIIllIIll[41] = (((64 + 133) - 133) + 169) ^ (((135 + 70) - 130) + 117);
        llIIIIllIIll[42] = 52 ^ 30;
        llIIIIllIIll[43] = 1 ^ 42;
        llIIIIllIIll[44] = 8 ^ 36;
        llIIIIllIIll[45] = (255 ^ 197) ^ (64 ^ 87);
    }

    private static boolean llllIIllIIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean aS() {
        if (!llllIIllIIIllI(this, TREE) || llllIIllIIIlll(this, FRUIT_TREE)) {
            ?? r0 = llIIIIllIIll[0];
            "".length();
            return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIIllIIll[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(String str, int i, A a, String str2, boolean z) {
        this(str, i, a, str2, str2, z);
    }

    private static void llllIIllIIIlII() {
        llIIIIllIIlI = new String[llIIIIllIIll[45]];
        llIIIIllIIlI[llIIIIllIIll[1]] = llllIIllIIIIIl("ES87GSIXJTkbIg==", "SjwUc");
        llIIIIllIIlI[llIIIIllIIll[0]] = llllIIllIIIIIl("", "KBbHB");
        llIIIIllIIlI[llIIIIllIIll[2]] = llllIIllIIIIlI("tzPVtBXCMeQZnxGv0MJNZg==", "LBncx");
        llIIIIllIIlI[llIIIIllIIll[3]] = llllIIllIIIIlI("tBbeOVX5uvU=", "lveGn");
        llIIIIllIIlI[llIIIIllIIll[4]] = llllIIllIIIIll("7qLMoSKS5Hg=", "XwDfx");
        llIIIIllIIlI[llIIIIllIIll[5]] = llllIIllIIIIIl("", "dRWJB");
        llIIIIllIIlI[llIIIIllIIll[6]] = llllIIllIIIIll("4bmB3tNw8LrBNAJeiDKJAA==", "HqGnx");
        llIIIIllIIlI[llIIIIllIIll[7]] = llllIIllIIIIIl("BAE0KxwoCDYw", "EmXDh");
        llIIIIllIIlI[llIIIIllIIll[8]] = llllIIllIIIIIl("ByAYKw==", "OeJif");
        llIIIIllIIlI[llIIIIllIIll[9]] = llllIIllIIIIIl("JhECOEEeFQQ5CQ==", "ntpZa");
        llIIIIllIIlI[llIIIIllIIll[10]] = llllIIllIIIIIl("LyI4ISc=", "gGJCT");
        llIIIIllIIlI[llIIIIllIIll[11]] = llllIIllIIIIll("ivT+/AGF54U=", "LKfyN");
        llIIIIllIIlI[llIIIIllIIll[12]] = llllIIllIIIIlI("A0dqse7wSf1EFqW/8ZRIYg==", "NTSHf");
        llIIIIllIIlI[llIIIIllIIll[13]] = llllIIllIIIIlI("OViYCdaKI/c=", "kCwNM");
        llIIIIllIIlI[llIIIIllIIll[14]] = llllIIllIIIIIl("", "HhCDi");
        llIIIIllIIlI[llIIIIllIIll[15]] = llllIIllIIIIIl("CCExDz0RJzYDLA==", "NsdFi");
        llIIIIllIIlI[llIIIIllIIll[16]] = llllIIllIIIIlI("Ba2m8cFQ65w=", "YoudW");
        llIIIIllIIlI[llIIIIllIIll[17]] = llllIIllIIIIlI("0+FNl0GFWgo=", "GkVOR");
        llIIIIllIIlI[llIIIIllIIll[18]] = llllIIllIIIIll("BYI129CFvkE=", "iAImi");
        llIIIIllIIlI[llIIIIllIIll[19]] = llllIIllIIIIlI("g3G0fcNskgY=", "DPJlB");
        llIIIIllIIlI[llIIIIllIIll[20]] = llllIIllIIIIll("VHIeA2ej0Ws=", "MbpQn");
        llIIIIllIIlI[llIIIIllIIll[21]] = llllIIllIIIIlI("tvw7XHxpUR6Hx4pC2al8Og==", "CEBiP");
        llIIIIllIIlI[llIIIIllIIll[22]] = llllIIllIIIIll("NLmQGLq2uyO3oM1pJzNd/A==", "yCiYP");
        llIIIIllIIlI[llIIIIllIIll[23]] = llllIIllIIIIlI("ESTtZs4FWDc=", "loBAD");
        llIIIIllIIlI[llIIIIllIIll[24]] = llllIIllIIIIll("ny14ICA1KxnochyUGY/keA==", "xWHCf");
        llIIIIllIIlI[llIIIIllIIll[25]] = llllIIllIIIIIl("Ch8HKD0NEBooMRw=", "YONzt");
        llIIIIllIIlI[llIIIIllIIll[26]] = llllIIllIIIIIl("MAEtOyAXURA7LAYC", "cqDII");
        llIIIIllIIlI[llIIIIllIIll[27]] = llllIIllIIIIIl("IB8oByg=", "aQaJi");
        llIIIIllIIlI[llIIIIllIIll[28]] = llllIIllIIIIll("nOmuEGqiFG0=", "agvOZ");
        llIIIIllIIlI[llIIIIllIIll[29]] = llllIIllIIIIll("868xzVXxyvw=", "XOAxi");
        llIIIIllIIlI[llIIIIllIIll[30]] = llllIIllIIIIIl("KTICOzAZ", "jSaOE");
        llIIIIllIIlI[llIIIIllIIll[31]] = llllIIllIIIIIl("GhMsAxwMEg==", "IVmTY");
        llIIIIllIIlI[llIIIIllIIll[32]] = llllIIllIIIIIl("HBMzLi4qEg==", "OvRYK");
        llIIIIllIIlI[llIIIIllIIll[33]] = llllIIllIIIIIl("LDkrFQAuLA==", "oxgDU");
        llIIIIllIIlI[llIIIIllIIll[34]] = llllIIllIIIIll("YaY1jFs9uf0=", "XNfpp");
        llIIIIllIIlI[llIIIIllIIll[35]] = llllIIllIIIIlI("M3OcO4w3WwDQiIWZh9MQ4A==", "eOzRp");
        llIIIIllIIlI[llIIIIllIIll[36]] = llllIIllIIIIll("iDLw7d5LTwqW4CaVkxvPgw==", "InWmG");
        llIIIIllIIlI[llIIIIllIIll[37]] = llllIIllIIIIIl("CRglIRUd", "NJdqP");
        llIIIIllIIlI[llIIIIllIIll[38]] = llllIIllIIIIlI("1VDJfTdZTcs=", "tlCYa");
        llIIIIllIIlI[llIIIIllIIll[39]] = llllIIllIIIIll("4T1ld43PvcBJj+d9WGACeg==", "aybXL");
        llIIIIllIIlI[llIIIIllIIll[40]] = llllIIllIIIIIl("NgswBz8UFWkgORAc", "uyItK");
        llIIIIllIIlI[llIIIIllIIll[41]] = llllIIllIIIIIl("ACUePCoQPg==", "CjSle");
        llIIIIllIIlI[llIIIIllIIll[42]] = llllIIllIIIIlI("eeBwcQlLS+ofHl3/Ff6r5Q==", "WZtgl");
        llIIIIllIIlI[llIIIIllIIll[43]] = llllIIllIIIIll("YfKwcX/8wB5CP7tdU0JVmg==", "LdQyh");
        llIIIIllIIlI[llIIIIllIIll[44]] = llllIIllIIIIlI("jM1qCcRkIlJ5sdCEOPDTtQ==", "ThDxV");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean aR() {
        if (!llllIIllIIIllI(this, COMPOST) || llllIIllIIIlll(this, GIANT_COMPOST)) {
            ?? r0 = llIIIIllIIll[0];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIIllIIll[1];
    }

    public String aV() {
        return this.unplanted;
    }

    public A aU() {
        return this.runType;
    }

    private static boolean llllIIllIIlIII(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(String str, int i, A a, String str2, String str3, boolean z) {
        this(str, i, a, str2, str2, str3, z);
    }

    private static String llllIIllIIIIll(String lllllllllllllllIlIlIlIlIIlllIIIl, String lllllllllllllllIlIlIlIlIIlllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIlIIlllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlIlIIlllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIlIIlllIIll.init(llIIIIllIIll[2], lllllllllllllllIlIlIlIlIIlllIlII);
            return new String(lllllllllllllllIlIlIlIlIIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlIIlllIIlI) {
            lllllllllllllllIlIlIlIlIIlllIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIIllIIIIlI(String lllllllllllllllIlIlIlIlIIllllllI, String lllllllllllllllIlIlIlIlIIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlIlIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIlllllIl.getBytes(StandardCharsets.UTF_8)), llIIIIllIIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIllIIll[2], lllllllllllllllIlIlIlIlIlIIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIlIlIIlllllll) {
            lllllllllllllllIlIlIlIlIIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIllIIIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    public String aW() {
        return this.planted;
    }

    public String ac() {
        return this.name;
    }

    public boolean aX() {
        return this.healthCheckRequired;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    private P(String str, int i, A a, String str2, String str3, String str4, boolean z) {
        this.runType = a;
        this.name = str2;
        this.healthCheckRequired = z;
        this.unplanted = str3;
        this.planted = str4;
    }

    @Nullable
    public abstract C0014an f(int i);

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}
