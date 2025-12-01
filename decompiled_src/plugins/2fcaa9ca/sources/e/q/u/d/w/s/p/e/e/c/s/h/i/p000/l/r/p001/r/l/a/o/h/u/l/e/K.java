package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.K  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/K.class */
public final class K {
    public static final /* synthetic */ K WEST_II_II;
    public static final /* synthetic */ K BOTTOM_V_III;
    public static final /* synthetic */ K SOUTH_II_I_EXTEND;
    public static final /* synthetic */ K NORTH_IV_IV;
    public static final /* synthetic */ K TOP_V_VII;
    public static final /* synthetic */ K SOUTH_IV_III;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ K WEST_III_IV;
    public static final /* synthetic */ K EAST_II_IV;
    public static final /* synthetic */ K MIDDLE_V_XVI;
    public static final /* synthetic */ K NORTH_II_V;
    private static /* synthetic */ int[] lllIIIIllIlI;
    public static final /* synthetic */ K EAST_III_III_EXTEND;
    /* synthetic */ Supplier<WorldPoint> destination;
    /* synthetic */ L type;
    private static final /* synthetic */ K[] $VALUES;
    public static final /* synthetic */ K MIDDLE_V_II;
    public static final /* synthetic */ K TOP_V_VI;
    public static final /* synthetic */ K MIDDLE_V_XIV;
    public static final /* synthetic */ K WEST_IV_III;
    public static final /* synthetic */ K SOUTH_IV_V;
    public static final /* synthetic */ K EAST_IV_V;
    public static final /* synthetic */ K WEST_IV_V;
    public static final /* synthetic */ K EAST_IV_IV;
    public static final /* synthetic */ K WEST_IV_VI;
    public static final /* synthetic */ K WEST_IV_II;
    public static final /* synthetic */ K NORTH_IV_I;
    public static final /* synthetic */ K SOUTH_II_II;
    public static final /* synthetic */ K MIDDLE_V_XII;
    public static final /* synthetic */ K WEST_IV_IV;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ K NORTH_IV_II;
    private static /* synthetic */ String[] lllIIIIlIIII;

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIlIIIlIllIIl(local) && !lIIIlIIIlIllIlI(a((Locatable) local) ? 1 : 0)) {
            System.out.println(lllIIIIlIIII[lllIIIIllIlI[0]]);
            a(squireSepulchre);
            Movement.setDestination(this.destination.get());
            return lllIIIIllIlI[1];
        }
        return lllIIIIllIlI[0];
    }

    private static String lIIIlIIIIllIllI(String lllllllllllllllIIlllIIIIllIIIIlI, String lllllllllllllllIIlllIIIIllIIIIIl) {
        String lllllllllllllllIIlllIIIIllIIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIIIllIIIIII = new StringBuilder();
        char[] lllllllllllllllIIlllIIIIlIllllll = lllllllllllllllIIlllIIIIllIIIIIl.toCharArray();
        int lllllllllllllllIIlllIIIIlIlllllI = lllIIIIllIlI[0];
        char[] charArray = lllllllllllllllIIlllIIIIllIIIIlI2.toCharArray();
        int lllllllllllllllIIlllIIIIlIllIlll = charArray.length;
        int lllllllllllllllIIlllIIIIlIllIllI = lllIIIIllIlI[0];
        while (lIIIlIIIlIlllII(lllllllllllllllIIlllIIIIlIllIllI, lllllllllllllllIIlllIIIIlIllIlll)) {
            lllllllllllllllIIlllIIIIllIIIIII.append((char) (charArray[lllllllllllllllIIlllIIIIlIllIllI] ^ lllllllllllllllIIlllIIIIlIllllll[lllllllllllllllIIlllIIIIlIlllllI % lllllllllllllllIIlllIIIIlIllllll.length]));
            "".length();
            lllllllllllllllIIlllIIIIlIlllllI++;
            lllllllllllllllIIlllIIIIlIllIllI++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIIIllIIIIII);
    }

    private static void lIIIlIIIlIllIII() {
        lllIIIIllIlI = new int[55];
        lllIIIIllIlI[0] = (253 ^ 163) & ((7 ^ 89) ^ (-1));
        lllIIIIllIlI[1] = " ".length();
        lllIIIIllIlI[2] = (((88 + 45) - 18) + 43) ^ (((141 + 106) - 215) + 118);
        lllIIIIllIlI[3] = (((163 + 136) - 188) + 108) ^ (((77 + 113) - 138) + 147);
        lllIIIIllIlI[4] = "  ".length();
        lllIIIIllIlI[5] = 93 ^ 87;
        lllIIIIllIlI[6] = (((36 + 127) - 93) + 112) ^ (((87 + 64) - 20) + 20);
        lllIIIIllIlI[7] = (((86 + 114) - 137) + 119) ^ (((1 + 40) - (-58)) + 39);
        lllIIIIllIlI[8] = (107 ^ 11) ^ (59 ^ 97);
        lllIIIIllIlI[9] = (((4 + 134) - 12) + 13) ^ (((79 + 121) - 146) + 81);
        lllIIIIllIlI[10] = "   ".length();
        lllIIIIllIlI[11] = (12 ^ 84) ^ (48 ^ 85);
        lllIIIIllIlI[12] = 97 ^ 88;
        lllIIIIllIlI[13] = 170 ^ 187;
        lllIIIIllIlI[14] = (((101 + 68) - 168) + 145) ^ (((146 + 99) - 151) + 54);
        lllIIIIllIlI[15] = (((173 + 188) - 354) + 207) ^ (((58 + 74) - 113) + 179);
        lllIIIIllIlI[16] = 116 ^ 127;
        lllIIIIllIlI[17] = 49 ^ 62;
        lllIIIIllIlI[18] = (136 ^ 149) ^ (128 ^ 153);
        lllIIIIllIlI[19] = (232 ^ 180) ^ (219 ^ 180);
        lllIIIIllIlI[20] = (((53 + 124) - 96) + 70) ^ (((54 + 17) - (-6)) + 64);
        lllIIIIllIlI[21] = (((111 + 122) - 96) + 14) ^ (((31 + 70) - (-6)) + 21);
        lllIIIIllIlI[22] = (111 ^ 96) ^ (76 ^ 70);
        lllIIIIllIlI[23] = 59 ^ 9;
        lllIIIIllIlI[24] = 137 ^ 188;
        lllIIIIllIlI[25] = (44 ^ 80) ^ (5 ^ 72);
        lllIIIIllIlI[26] = 160 ^ 142;
        lllIIIIllIlI[27] = (182 ^ 148) ^ (99 ^ 118);
        lllIIIIllIlI[28] = (92 ^ 44) ^ (241 ^ 149);
        lllIIIIllIlI[29] = 104 ^ 83;
        lllIIIIllIlI[30] = (((70 + 97) - (-12)) + 5) ^ (((144 + 49) - 169) + 123);
        lllIIIIllIlI[31] = (30 ^ 93) ^ (76 ^ 8);
        lllIIIIllIlI[32] = (13 ^ 111) ^ (43 ^ 100);
        lllIIIIllIlI[33] = (((8 + 93) - (-31)) + 53) ^ (((42 + 125) - 118) + 98);
        lllIIIIllIlI[34] = 190 ^ 166;
        lllIIIIllIlI[35] = 77 ^ 105;
        lllIIIIllIlI[36] = (23 ^ 113) ^ (7 ^ 111);
        lllIIIIllIlI[37] = 131 ^ 170;
        lllIIIIllIlI[38] = 87 ^ 94;
        lllIIIIllIlI[39] = 59 ^ 25;
        lllIIIIllIlI[40] = (66 ^ 59) ^ (123 ^ 15);
        lllIIIIllIlI[41] = (22 ^ 4) ^ (105 ^ 68);
        lllIIIIllIlI[42] = 139 ^ 163;
        lllIIIIllIlI[43] = (((37 + 166) - 31) + 17) ^ (((67 + 164) - 81) + 18);
        lllIIIIllIlI[44] = 49 ^ 17;
        lllIIIIllIlI[45] = 161 ^ 179;
        lllIIIIllIlI[46] = (71 ^ 100) ^ (57 ^ 12);
        lllIIIIllIlI[47] = 138 ^ 153;
        lllIIIIllIlI[48] = 1 ^ 46;
        lllIIIIllIlI[49] = 138 ^ 175;
        lllIIIIllIlI[50] = 22 ^ 53;
        lllIIIIllIlI[51] = 121 ^ 96;
        lllIIIIllIlI[52] = (((23 + 64) - 58) + 101) ^ (((23 + 151) - 159) + 171);
        lllIIIIllIlI[53] = (((100 + 7) - (-12)) + 39) ^ (((177 + 132) - 161) + 37);
        lllIIIIllIlI[54] = (((37 + 105) - 88) + 86) ^ (((149 + 134) - 162) + 30);
    }

    private static void lIIIlIIIlIlIlll() {
        lllIIIIlIIII = new String[lllIIIIllIlI[54]];
        lllIIIIlIIII[lllIIIIllIlI[0]] = lIIIlIIIIllIllI("DR9FBCEWFEQ=", "dqelD");
        lllIIIIlIIII[lllIIIIllIlI[1]] = lIIIlIIIIllIlll("qj51V5aAS7V60YawjKzfOg==", "hrQqO");
        lllIIIIlIIII[lllIIIIllIlI[4]] = lIIIlIIIIlllIII("j5u/yQDsXMl11Q1E8ZljQ/dHwaf2kji6", "LHPqh");
        lllIIIIlIIII[lllIIIIllIlI[10]] = lIIIlIIIIllIllI("HwczPAUTAS83BAU=", "LHfhM");
        lllIIIIlIIII[lllIIIIllIlI[18]] = lIIIlIIIIlllIII("9eByLpDw5IzSmlDoYWXnfA==", "bLAgm");
        lllIIIIlIIII[lllIIIIllIlI[22]] = lIIIlIIIIlllIII("LUBFJkOu+OjrJPEzLPtthA==", "XOxdq");
        lllIIIIlIIII[lllIIIIllIlI[14]] = lIIIlIIIIllIlll("y1ZqC3lxkx+7Al62NQ7P/ZrKHZIkc9kl", "mLUYY");
        lllIIIIlIIII[lllIIIIllIlI[31]] = lIIIlIIIIlllIII("dD46r9fYqUjo3Dv2cn2ZAQ==", "ByiGe");
        lllIIIIlIIII[lllIIIIllIlI[2]] = lIIIlIIIIllIllI("IjkAHA0zPwQXDA==", "lvRHE");
        lllIIIIlIIII[lllIIIIllIlI[38]] = lIIIlIIIIlllIII("bHgsw/2KSk6xy9/ySoGHEg==", "IYNmI");
        lllIIIIlIIII[lllIIIIllIlI[5]] = lIIIlIIIIlllIII("7JbhCgR8Hd9QRDrCthQLnA==", "tFQAk");
        lllIIIIlIIII[lllIIIIllIlI[16]] = lIIIlIIIIlllIII("t88zMyQCUYLtVOUF8CKJwA==", "FTvex");
        lllIIIIlIIII[lllIIIIllIlI[9]] = lIIIlIIIIllIlll("ELszunrIVAlKdXpR2OPyDw==", "TWOSt");
        lllIIIIlIIII[lllIIIIllIlI[40]] = lIIIlIIIIllIllI("EQQSIxMdEx4+Gg==", "TEAwL");
        lllIIIIlIIII[lllIIIIllIlI[36]] = lIIIlIIIIllIllI("Nw4gMTs7GSwz", "rOsed");
        lllIIIIlIIII[lllIIIIllIlI[17]] = lIIIlIIIIllIlll("2TwNs3i6CAFPHQx9P4pS7Q==", "tEHil");
        lllIIIIlIIII[lllIIIIllIlI[15]] = lIIIlIIIIlllIII("6FdWnCydkES/8NzbwL3pYw==", "JFZAo");
        lllIIIIlIIII[lllIIIIllIlI[13]] = lIIIlIIIIllIllI("FD87EjUKLDcPPA==", "CzhFj");
        lllIIIIlIIII[lllIIIIllIlI[45]] = lIIIlIIIIllIlll("NBWK7OfSaacGuSdy560KRw==", "CZrdf");
        lllIIIIlIIII[lllIIIIllIlI[47]] = lIIIlIIIIlllIII("wZyrl4OHGcEmSG5XKdZHHQ==", "qEvxY");
        lllIIIIlIIII[lllIIIIllIlI[28]] = lIIIlIIIIllIlll("puZ7pZTIfPZM//ruRL5GLw==", "NwFNS");
        lllIIIIlIIII[lllIIIIllIlI[43]] = lIIIlIIIIllIllI("OyUyPB4wPCsq", "ojbcH");
        lllIIIIlIIII[lllIIIIllIlI[46]] = lIIIlIIIIllIllI("HTkgJQ4VLzI+Cxk=", "PpdaB");
        lllIIIIlIIII[lllIIIIllIlI[21]] = lIIIlIIIIlllIII("F7Ueu7FJ10oXUWD0l1J10A==", "RePym");
        lllIIIIlIIII[lllIIIIllIlI[34]] = lIIIlIIIIllIlll("6jTy8JPLMnvgpDk056h4vg==", "aFwsV");
        lllIIIIlIIII[lllIIIIllIlI[51]] = lIIIlIIIIlllIII("hNf7Yx6Pjr2abnPjA8cieg==", "zqKoJ");
        lllIIIIlIIII[lllIIIIllIlI[20]] = lIIIlIIIIllIlll("rE1HNh2xPYIiM1cfUA023Q==", "iQvOl");
    }

    static {
        lIIIlIIIlIllIII();
        lIIIlIIIlIlIlll();
        WEST_II_II = new K(lllIIIIlIIII[lllIIIIllIlI[1]], lllIIIIllIlI[0], List.of(new Triple(new RegionPoint(lllIIIIllIlI[2], lllIIIIllIlI[3], lllIIIIllIlI[4], C0001b.G), Integer.valueOf(lllIIIIllIlI[5]), Integer.valueOf(lllIIIIllIlI[6])), new Triple(new RegionPoint(lllIIIIllIlI[7], lllIIIIllIlI[8], lllIIIIllIlI[4], C0001b.I), Integer.valueOf(lllIIIIllIlI[9]), Integer.valueOf(lllIIIIllIlI[10]))), new RegionPoint(lllIIIIllIlI[11], lllIIIIllIlI[12], lllIIIIllIlI[4], C0001b.I), new RegionPoint(lllIIIIllIlI[11], lllIIIIllIlI[12], lllIIIIllIlI[4], C0001b.I), L.WALK);
        SOUTH_II_I_EXTEND = new K(lllIIIIlIIII[lllIIIIllIlI[4]], lllIIIIllIlI[1], new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[13], lllIIIIllIlI[4], C0001b.G), lllIIIIllIlI[4], lllIIIIllIlI[4], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[13], lllIIIIllIlI[4], C0001b.G), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[13], lllIIIIllIlI[4], C0001b.G), L.WALK);
        SOUTH_II_II = new K(lllIIIIlIIII[lllIIIIllIlI[10]], lllIIIIllIlI[4], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[15], lllIIIIllIlI[4], C0001b.G), lllIIIIllIlI[16], lllIIIIllIlI[14], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], C0001b.G), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], C0001b.G), L.WALK);
        EAST_II_IV = new K(lllIIIIlIIII[lllIIIIllIlI[18]], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[19], lllIIIIllIlI[20], lllIIIIllIlI[4], C0001b.G), lllIIIIllIlI[15], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[21], lllIIIIllIlI[4], C0001b.G), new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[21], lllIIIIllIlI[4], C0001b.G), L.WALK);
        NORTH_II_V = new K(lllIIIIlIIII[lllIIIIllIlI[22]], lllIIIIllIlI[18], new RegionPoint(lllIIIIllIlI[23], lllIIIIllIlI[24], lllIIIIllIlI[1], C0001b.G), lllIIIIllIlI[14], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[11], lllIIIIllIlI[1], C0001b.G), new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[11], lllIIIIllIlI[1], C0001b.G), L.WALK);
        EAST_III_III_EXTEND = new K(lllIIIIlIIII[lllIIIIllIlI[14]], lllIIIIllIlI[22], new RegionPoint(lllIIIIllIlI[26], lllIIIIllIlI[27], lllIIIIllIlI[4], C0001b.J), lllIIIIllIlI[28], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[30], lllIIIIllIlI[4], C0001b.J), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[30], lllIIIIllIlI[4], C0001b.J), L.WALK);
        WEST_III_IV = new K(lllIIIIlIIII[lllIIIIllIlI[31]], lllIIIIllIlI[14], new RegionPoint(lllIIIIllIlI[1], lllIIIIllIlI[32], lllIIIIllIlI[4], C0001b.J), lllIIIIllIlI[10], lllIIIIllIlI[17], new RegionPoint(lllIIIIllIlI[18], lllIIIIllIlI[33], lllIIIIllIlI[4], C0001b.J), new RegionPoint(lllIIIIllIlI[18], lllIIIIllIlI[33], lllIIIIllIlI[4], C0001b.J), L.WALK);
        NORTH_IV_I = new K(lllIIIIlIIII[lllIIIIllIlI[2]], lllIIIIllIlI[31], new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[35], lllIIIIllIlI[4], C0001b.L), lllIIIIllIlI[36], lllIIIIllIlI[31], new RegionPoint(lllIIIIllIlI[21], lllIIIIllIlI[37], lllIIIIllIlI[4], C0001b.L), new RegionPoint(lllIIIIllIlI[21], lllIIIIllIlI[37], lllIIIIllIlI[4], C0001b.L), L.WALK);
        NORTH_IV_II = new K(lllIIIIlIIII[lllIIIIllIlI[38]], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[39], lllIIIIllIlI[4], C0001b.L), lllIIIIllIlI[40], lllIIIIllIlI[38], new RegionPoint(lllIIIIllIlI[5], lllIIIIllIlI[33], lllIIIIllIlI[4], C0001b.L), new RegionPoint(lllIIIIllIlI[5], lllIIIIllIlI[33], lllIIIIllIlI[4], C0001b.L), L.WALK);
        SOUTH_IV_III = new K(lllIIIIlIIII[lllIIIIllIlI[5]], lllIIIIllIlI[38], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[15], lllIIIIllIlI[4], C0001b.L), lllIIIIllIlI[36], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], C0001b.L), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], C0001b.L), L.WALK);
        SOUTH_IV_V = new K(lllIIIIlIIII[lllIIIIllIlI[16]], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[12], lllIIIIllIlI[4], C0001b.M), lllIIIIllIlI[16], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[41], lllIIIIllIlI[4], C0001b.M), new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[41], lllIIIIllIlI[4], C0001b.M), L.WALK);
        NORTH_IV_IV = new K(lllIIIIlIIII[lllIIIIllIlI[9]], lllIIIIllIlI[16], new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[42], lllIIIIllIlI[4], C0001b.L), lllIIIIllIlI[10], lllIIIIllIlI[43], new RegionPoint(lllIIIIllIlI[9], lllIIIIllIlI[7], lllIIIIllIlI[4], C0001b.L), new RegionPoint(lllIIIIllIlI[9], lllIIIIllIlI[7], lllIIIIllIlI[4], C0001b.L), L.WALK);
        EAST_IV_IV = new K(lllIIIIlIIII[lllIIIIllIlI[40]], lllIIIIllIlI[9], new RegionPoint(lllIIIIllIlI[23], lllIIIIllIlI[22], lllIIIIllIlI[1], C0001b.L), lllIIIIllIlI[14], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[31], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[31], lllIIIIllIlI[1], C0001b.L), L.WALK);
        EAST_IV_V = new K(lllIIIIlIIII[lllIIIIllIlI[36]], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[39], lllIIIIllIlI[22], lllIIIIllIlI[1], C0001b.L), lllIIIIllIlI[15], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[28], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[28], lllIIIIllIlI[1], C0001b.L), L.WALK);
        WEST_IV_II = new K(lllIIIIlIIII[lllIIIIllIlI[17]], lllIIIIllIlI[36], new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[13], lllIIIIllIlI[1], C0001b.L), lllIIIIllIlI[10], lllIIIIllIlI[22], new RegionPoint(lllIIIIllIlI[45], lllIIIIllIlI[46], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[45], lllIIIIllIlI[46], lllIIIIllIlI[1], C0001b.L), L.WALK);
        WEST_IV_III = new K(lllIIIIlIIII[lllIIIIllIlI[15]], lllIIIIllIlI[17], new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[46], lllIIIIllIlI[1], C0001b.L), lllIIIIllIlI[10], lllIIIIllIlI[18], new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], C0001b.L), L.WALK);
        WEST_IV_IV = new K(lllIIIIlIIII[lllIIIIllIlI[13]], lllIIIIllIlI[15], List.of(new Triple(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], C0001b.L), Integer.valueOf(lllIIIIllIlI[10]), Integer.valueOf(lllIIIIllIlI[34])), new Triple(new RegionPoint(lllIIIIllIlI[2], lllIIIIllIlI[30], lllIIIIllIlI[1], C0001b.L), Integer.valueOf(lllIIIIllIlI[38]), Integer.valueOf(lllIIIIllIlI[10]))), new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[44], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[44], lllIIIIllIlI[1], C0001b.L), L.WALK);
        WEST_IV_V = new K(lllIIIIlIIII[lllIIIIllIlI[45]], lllIIIIllIlI[13], new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[22], lllIIIIllIlI[1], C0001b.L), lllIIIIllIlI[18], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[31], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[31], lllIIIIllIlI[1], C0001b.L), L.WALK);
        WEST_IV_VI = new K(lllIIIIlIIII[lllIIIIllIlI[47]], lllIIIIllIlI[45], new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[22], lllIIIIllIlI[1], C0001b.L), lllIIIIllIlI[15], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[9], lllIIIIllIlI[1], C0001b.L), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[9], lllIIIIllIlI[1], C0001b.L), L.WALK);
        TOP_V_VI = new K(lllIIIIlIIII[lllIIIIllIlI[28]], lllIIIIllIlI[47], new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[42], lllIIIIllIlI[4], C0001b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[39], lllIIIIllIlI[4], C0001b.N), new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[39], lllIIIIllIlI[4], C0001b.N), L.WALK);
        TOP_V_VII = new K(lllIIIIlIIII[lllIIIIllIlI[43]], lllIIIIllIlI[28], new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[15], lllIIIIllIlI[4], C0001b.N), lllIIIIllIlI[38], lllIIIIllIlI[15], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[18], lllIIIIllIlI[4], C0001b.N), new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[18], lllIIIIllIlI[4], C0001b.N), L.WALK);
        MIDDLE_V_II = new K(lllIIIIlIIII[lllIIIIllIlI[46]], lllIIIIllIlI[43], new RegionPoint(lllIIIIllIlI[0], lllIIIIllIlI[39], lllIIIIllIlI[1], C0001b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[24], lllIIIIllIlI[1], C0001b.N), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[24], lllIIIIllIlI[1], C0001b.N), L.WALK);
        MIDDLE_V_XII = new K(lllIIIIlIIII[lllIIIIllIlI[21]], lllIIIIllIlI[46], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[25], lllIIIIllIlI[1], C0001b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[48], lllIIIIllIlI[1], C0001b.N), new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[48], lllIIIIllIlI[1], C0001b.N), L.WALK);
        MIDDLE_V_XIV = new K(lllIIIIlIIII[lllIIIIllIlI[34]], lllIIIIllIlI[21], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[49], lllIIIIllIlI[1], C0001b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[50], lllIIIIllIlI[1], C0001b.N), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[50], lllIIIIllIlI[1], C0001b.N), L.WALK);
        MIDDLE_V_XVI = new K(lllIIIIlIIII[lllIIIIllIlI[51]], lllIIIIllIlI[34], new RegionPoint(lllIIIIllIlI[52], lllIIIIllIlI[15], lllIIIIllIlI[1], C0001b.N), lllIIIIllIlI[14], lllIIIIllIlI[13], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[2], lllIIIIllIlI[1], C0001b.N), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[2], lllIIIIllIlI[1], C0001b.N), L.WALK);
        BOTTOM_V_III = new K(lllIIIIlIIII[lllIIIIllIlI[20]], lllIIIIllIlI[51], new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[53], lllIIIIllIlI[0], C0001b.N), lllIIIIllIlI[46], lllIIIIllIlI[9], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[37], lllIIIIllIlI[0], C0001b.N), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[37], lllIIIIllIlI[0], C0001b.N), L.WALK);
        K[] kArr = new K[lllIIIIllIlI[20]];
        kArr[lllIIIIllIlI[0]] = WEST_II_II;
        kArr[lllIIIIllIlI[1]] = SOUTH_II_I_EXTEND;
        kArr[lllIIIIllIlI[4]] = SOUTH_II_II;
        kArr[lllIIIIllIlI[10]] = EAST_II_IV;
        kArr[lllIIIIllIlI[18]] = NORTH_II_V;
        kArr[lllIIIIllIlI[22]] = EAST_III_III_EXTEND;
        kArr[lllIIIIllIlI[14]] = WEST_III_IV;
        kArr[lllIIIIllIlI[31]] = NORTH_IV_I;
        kArr[lllIIIIllIlI[2]] = NORTH_IV_II;
        kArr[lllIIIIllIlI[38]] = SOUTH_IV_III;
        kArr[lllIIIIllIlI[5]] = SOUTH_IV_V;
        kArr[lllIIIIllIlI[16]] = NORTH_IV_IV;
        kArr[lllIIIIllIlI[9]] = EAST_IV_IV;
        kArr[lllIIIIllIlI[40]] = EAST_IV_V;
        kArr[lllIIIIllIlI[36]] = WEST_IV_II;
        kArr[lllIIIIllIlI[17]] = WEST_IV_III;
        kArr[lllIIIIllIlI[15]] = WEST_IV_IV;
        kArr[lllIIIIllIlI[13]] = WEST_IV_V;
        kArr[lllIIIIllIlI[45]] = WEST_IV_VI;
        kArr[lllIIIIllIlI[47]] = TOP_V_VI;
        kArr[lllIIIIllIlI[28]] = TOP_V_VII;
        kArr[lllIIIIllIlI[43]] = MIDDLE_V_II;
        kArr[lllIIIIllIlI[46]] = MIDDLE_V_XII;
        kArr[lllIIIIllIlI[21]] = MIDDLE_V_XIV;
        kArr[lllIIIIllIlI[34]] = MIDDLE_V_XVI;
        kArr[lllIIIIllIlI[51]] = BOTTOM_V_III;
        $VALUES = kArr;
    }

    private static boolean lIIIlIIIlIllIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIIlIllIll(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIIllIlI[1];
            }
            "".length();
            if (0 != 0) {
                return ((((93 + 102) - 135) + 133) ^ (((83 + 38) - (-26)) + 10)) & (((80 ^ 66) ^ (207 ^ 129)) ^ (-" ".length()));
            }
        }
        return lllIIIIllIlI[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private K(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, L l) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.type = l;
    }

    private static String lIIIlIIIIllIlll(String lllllllllllllllIIlllIIIIlIlIllIl, String lllllllllllllllIIlllIIIIlIlIllII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIIlIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), lllIIIIllIlI[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIllIlI[4], lllllllllllllllIIlllIIIIlIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIIlIlIlllI) {
            lllllllllllllllIIlllIIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIllIlI(int i) {
        return i == 0;
    }

    private static String lIIIlIIIIlllIII(String lllllllllllllllIIlllIIIIlIlIIIII, String lllllllllllllllIIlllIIIIlIIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIIIlIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIIIlIlIIIlI.init(lllIIIIllIlI[4], secretKeySpec);
            return new String(lllllllllllllllIIlllIIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIIlIlIIIIl) {
            lllllllllllllllIIlllIIIIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIlllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIIlIllIll(int i) {
        return i != 0;
    }

    private K(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, L l) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIIlIllIll(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            return arrayList;
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.type = l;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) $VALUES.clone();
    }
}
