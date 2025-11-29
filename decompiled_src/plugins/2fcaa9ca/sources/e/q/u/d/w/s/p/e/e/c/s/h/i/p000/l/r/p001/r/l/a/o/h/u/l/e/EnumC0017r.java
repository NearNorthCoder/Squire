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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/r.class */
public final class EnumC0017r {
    public static final /* synthetic */ EnumC0017r NORTH_I_VI;
    private static final /* synthetic */ EnumC0017r[] $VALUES;
    public static final /* synthetic */ EnumC0017r EAST_II_XII;
    public static final /* synthetic */ EnumC0017r WEST_II_VI;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ EnumC0017r NORTH_I_V;
    /* synthetic */ Supplier<WorldPoint> destination;
    /* synthetic */ EnumC0018s type;
    private static /* synthetic */ int[] lllIIIllIIIl;
    public static final /* synthetic */ EnumC0017r SOUTH_IV_VII;
    public static final /* synthetic */ EnumC0017r BOTTOM_V_IV;
    public static final /* synthetic */ EnumC0017r NORTH_II_IV;
    public static final /* synthetic */ EnumC0017r SOUTH_I_V;
    public static final /* synthetic */ EnumC0017r SOUTH_II_VI;
    public static final /* synthetic */ EnumC0017r SOUTH_III_II;
    public static final /* synthetic */ EnumC0017r NORTH_IV_X;
    public /* synthetic */ Supplier<TileObject> object;
    public static final /* synthetic */ EnumC0017r EAST_II_VII;
    public static final /* synthetic */ EnumC0017r SOUTH_IV_VI;
    public static final /* synthetic */ EnumC0017r SOUTH_II_IV;
    public static final /* synthetic */ EnumC0017r WEST_III_VI;
    private static /* synthetic */ String[] lllIIIllIIII;
    public static final /* synthetic */ EnumC0017r WEST_I_VI;
    public static final /* synthetic */ EnumC0017r MIDDLE_V_XVII;
    public static final /* synthetic */ EnumC0017r WEST_I_V;
    public static final /* synthetic */ EnumC0017r NORTH_II_XI;
    public static final /* synthetic */ EnumC0017r EAST_III_VIII;
    public static final /* synthetic */ EnumC0017r WEST_II_VIII;
    public static final /* synthetic */ EnumC0017r TOP_V_VIII;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ EnumC0017r NORTH_II_I;
    public static final /* synthetic */ EnumC0017r EAST_I_VI;

    private EnumC0017r(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier supplier, EnumC0018s enumC0018s) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIlIlIllll(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ((140 ^ 136) < "   ".length()) {
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
        this.object = supplier;
        this.type = enumC0018s;
    }

    private static boolean lIIIlIIlIlIllIl(Object obj) {
        return obj == null;
    }

    private static void lIIIlIIlIlIllII() {
        lllIIIllIIIl = new int[77];
        lllIIIllIIIl[0] = ((19 ^ 124) ^ (223 ^ 135)) & (((((133 + 84) - 134) + 70) ^ (((23 + 111) - 103) + 143)) ^ (-" ".length()));
        lllIIIllIIIl[1] = " ".length();
        lllIIIllIIIl[2] = "   ".length();
        lllIIIllIIIl[3] = "  ".length();
        lllIIIllIIIl[4] = (196 ^ 173) ^ (170 ^ 199);
        lllIIIllIIIl[5] = (17 ^ 91) ^ (210 ^ 157);
        lllIIIllIIIl[6] = 17 ^ 23;
        lllIIIllIIIl[7] = 122 ^ 125;
        lllIIIllIIIl[8] = (110 ^ 9) ^ (103 ^ 8);
        lllIIIllIIIl[9] = 106 ^ 99;
        lllIIIllIIIl[10] = 6 ^ 12;
        lllIIIllIIIl[11] = 110 ^ 101;
        lllIIIllIIIl[12] = (((145 + 72) - 50) + 17) ^ (((178 + 166) - 325) + 161);
        lllIIIllIIIl[13] = (117 ^ 39) ^ (126 ^ 33);
        lllIIIllIIIl[14] = 132 ^ 138;
        lllIIIllIIIl[15] = 55 ^ 56;
        lllIIIllIIIl[16] = (((34 + 10) - (-30)) + 58) ^ (((17 + 143) - 83) + 71);
        lllIIIllIIIl[17] = 22 ^ 7;
        lllIIIllIIIl[18] = (63 ^ 44) ^ " ".length();
        lllIIIllIIIl[19] = 129 ^ 146;
        lllIIIllIIIl[20] = (((136 + 95) - 108) + 17) ^ (((26 + 136) - 11) + 1);
        lllIIIllIIIl[21] = (7 ^ 3) ^ (177 ^ 160);
        lllIIIllIIIl[22] = (124 ^ 119) ^ (25 ^ 4);
        lllIIIllIIIl[23] = 117 ^ 98;
        lllIIIllIIIl[24] = (64 ^ 43) ^ (83 ^ 32);
        lllIIIllIIIl[25] = 36 ^ 61;
        lllIIIllIIIl[26] = 102 ^ 124;
        lllIIIllIIIl[27] = 103 ^ 124;
        lllIIIllIIIl[28] = "   ".length() ^ (96 ^ 127);
        lllIIIllIIIl[29] = (143 ^ 161) ^ (2 ^ 49);
        lllIIIllIIIl[30] = (247 ^ 154) ^ (32 ^ 83);
        lllIIIllIIIl[31] = (((33 + 55) - 29) + 104) ^ (((113 + 69) - 1) + 7);
        lllIIIllIIIl[32] = (159 ^ 189) ^ "  ".length();
        lllIIIllIIIl[33] = 106 ^ 75;
        lllIIIllIIIl[34] = (46 ^ 107) ^ (204 ^ 171);
        lllIIIllIIIl[35] = 42 ^ 9;
        lllIIIllIIIl[36] = 75 ^ 111;
        lllIIIllIIIl[37] = (((16 + 50) - (-2)) + 121) ^ (((18 + 103) - 5) + 36);
        lllIIIllIIIl[38] = 26 ^ 60;
        lllIIIllIIIl[39] = 29 ^ 58;
        lllIIIllIIIl[40] = 150 ^ 190;
        lllIIIllIIIl[41] = (((66 + 90) - 92) + 90) ^ (((24 + 38) - (-52)) + 65);
        lllIIIllIIIl[42] = 36 ^ 14;
        lllIIIllIIIl[43] = (((57 + 107) - 140) + 113) ^ (((58 + 135) - 40) + 9);
        lllIIIllIIIl[44] = 15 ^ 35;
        lllIIIllIIIl[45] = (((22 + 88) - 14) + 51) ^ (((37 + 98) - (-14)) + 41);
        lllIIIllIIIl[46] = 155 ^ 181;
        lllIIIllIIIl[47] = (122 ^ 100) ^ (133 ^ 180);
        lllIIIllIIIl[48] = (20 ^ 71) ^ (37 ^ 70);
        lllIIIllIIIl[49] = 117 ^ 68;
        lllIIIllIIIl[50] = (217 ^ 140) ^ (121 ^ 30);
        lllIIIllIIIl[51] = 173 ^ 158;
        lllIIIllIIIl[52] = 71 ^ 115;
        lllIIIllIIIl[53] = 74 ^ 127;
        lllIIIllIIIl[54] = (246 ^ 131) ^ (235 ^ 168);
        lllIIIllIIIl[55] = 98 ^ 85;
        lllIIIllIIIl[56] = (125 ^ 46) ^ (170 ^ 193);
        lllIIIllIIIl[57] = (((77 + 142) - 173) + 104) ^ (((25 + 169) - 137) + 118);
        lllIIIllIIIl[58] = (((122 + 115) - 149) + 74) ^ (((90 + 62) - 134) + 134);
        lllIIIllIIIl[59] = 126 ^ 67;
        lllIIIllIIIl[60] = (((4 + 96) - (-41)) + 38) ^ (((5 + 5) - (-77)) + 49);
        lllIIIllIIIl[61] = 152 ^ 167;
        lllIIIllIIIl[62] = "   ".length() ^ (162 ^ 157);
        lllIIIllIIIl[63] = 99 ^ 93;
        lllIIIllIIIl[64] = (101 ^ 41) ^ (158 ^ 146);
        lllIIIllIIIl[65] = (((63 + 106) - 108) + 69) ^ (((7 + 157) - 105) + 136);
        lllIIIllIIIl[66] = 105 ^ 43;
        lllIIIllIIIl[67] = (77 ^ 37) ^ (103 ^ 76);
        lllIIIllIIIl[68] = 59 ^ 127;
        lllIIIllIIIl[69] = 127 ^ 58;
        lllIIIllIIIl[70] = 134 ^ 192;
        lllIIIllIIIl[71] = 1 ^ 70;
        lllIIIllIIIl[72] = 19 ^ 91;
        lllIIIllIIIl[73] = 49 ^ 120;
        lllIIIllIIIl[74] = (74 ^ 32) ^ (130 ^ 162);
        lllIIIllIIIl[75] = (((136 + 168) - 291) + 184) ^ (((31 + 108) - 15) + 18);
        lllIIIllIIIl[76] = 127 ^ 51;
    }

    public static EnumC0017r valueOf(String str) {
        return (EnumC0017r) Enum.valueOf(EnumC0017r.class, str);
    }

    private static String lIIIlIIlIlIIlIl(String lllllllllllllllIIllIllIlllIIlIlI, String lllllllllllllllIIllIllIlllIIlIIl) {
        String lllllllllllllllIIllIllIlllIIlIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIllIlllIIIlll = lllllllllllllllIIllIllIlllIIlIIl.toCharArray();
        int lllllllllllllllIIllIllIlllIIIllI = lllIIIllIIIl[0];
        char[] charArray = lllllllllllllllIIllIllIlllIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lllIIIllIIIl[0];
        while (lIIIlIIlIllIIII(i, length)) {
            char lllllllllllllllIIllIllIlllIIlIll = charArray[i];
            sb.append((char) (lllllllllllllllIIllIllIlllIIlIll ^ lllllllllllllllIIllIllIlllIIIlll[lllllllllllllllIIllIllIlllIIIllI % lllllllllllllllIIllIllIlllIIIlll.length]));
            "".length();
            lllllllllllllllIIllIllIlllIIIllI++;
            i++;
            "".length();
            if ((((((67 + 77) - 101) + 145) ^ (((149 + 143) - 155) + 49)) & (((221 ^ 141) ^ (202 ^ 156)) ^ (-" ".length()))) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0017r[] values() {
        return (EnumC0017r[]) $VALUES.clone();
    }

    static {
        lIIIlIIlIlIllII();
        lIIIlIIlIlIIlll();
        WEST_I_V = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[52]], lllIIIllIIIl[0], new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.C), lllIIIllIIIl[2], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.C), new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[50]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[51]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (-" ".length()) > "   ".length() ? ((((114 + 78) - 72) + 10) ^ (((31 + 71) - 95) + 139)) & (((((62 + 80) - 85) + 79) ^ (((70 + 3) - (-3)) + 76)) ^ (-" ".length())) & ((((((126 + 114) - 119) + 70) ^ (((46 + 130) - 53) + 19)) & (((134 ^ 137) ^ (28 ^ 34)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        WEST_I_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[53]], lllIIIllIIIl[1], new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[29], lllIIIllIIIl[1], C0001b.C), lllIIIllIIIl[2], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.C), new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[48]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[49]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (((205 ^ 148) ^ (108 ^ 22)) & (((((124 + 58) - 117) + 110) ^ (((11 + 34) - (-52)) + 43)) ^ (-" ".length()))) != 0 ? ((2 ^ 115) ^ (107 ^ 66)) & (((((16 + 38) - (-82)) + 21) ^ (((168 + 185) - 207) + 51)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        NORTH_I_V = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[54]], lllIIIllIIIl[3], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.C), lllIIIllIIIl[2], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[42], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.C), new RegionPoint(lllIIIllIIIl[42], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[46]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[47]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return "  ".length() <= 0 ? ((68 ^ 79) ^ (238 ^ 182)) & (((((26 + 98) - (-97)) + 16) ^ (((77 + 10) - (-94)) + 9)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        NORTH_I_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[55]], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[31], lllIIIllIIIl[1], C0001b.C), lllIIIllIIIl[2], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.C), new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[44]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[45]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        SOUTH_I_V = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[56]], lllIIIllIIIl[4], new RegionPoint(lllIIIllIIIl[18], lllIIIllIIIl[26], lllIIIllIIIl[3], C0001b.C), lllIIIllIIIl[6], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[30], lllIIIllIIIl[3], C0001b.C), new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[30], lllIIIllIIIl[3], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[42]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[43]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        EAST_I_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[57]], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[44], lllIIIllIIIl[16], lllIIIllIIIl[3], C0001b.C), lllIIIllIIIl[2], lllIIIllIIIl[16], new RegionPoint(lllIIIllIIIl[45], lllIIIllIIIl[30], lllIIIllIIIl[3], C0001b.C), new RegionPoint(lllIIIllIIIl[45], lllIIIllIIIl[30], lllIIIllIIIl[3], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[40]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[41]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return ((95 ^ 28) & ((125 ^ 62) ^ (-1))) > 0 ? (!true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        WEST_II_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[58]], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[55], lllIIIllIIIl[19], lllIIIllIIIl[3], C0001b.I), lllIIIllIIIl[8], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[57], lllIIIllIIIl[32], lllIIIllIIIl[3], C0001b.I), new RegionPoint(lllIIIllIIIl[59], lllIIIllIIIl[21], lllIIIllIIIl[3], C0001b.I), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[38]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[39]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        WEST_II_VIII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[60]], lllIIIllIIIl[7], new RegionPoint(lllIIIllIIIl[61], lllIIIllIIIl[31], lllIIIllIIIl[1], C0001b.I), lllIIIllIIIl[25], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.G), new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[36]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[37]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return ((231 ^ 134) ^ (51 ^ 86)) < 0 ? ((18 ^ 82) ^ (35 ^ 124)) & (((2 ^ 5) ^ (49 ^ 41)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        SOUTH_II_IV = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[62]], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[55], lllIIIllIIIl[3], lllIIIllIIIl[3], C0001b.I), lllIIIllIIIl[33], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[15], lllIIIllIIIl[13], lllIIIllIIIl[3], C0001b.G), new RegionPoint(lllIIIllIIIl[15], lllIIIllIIIl[13], lllIIIllIIIl[3], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[34]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[35]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        SOUTH_II_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[59]], lllIIIllIIIl[9], new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[22], lllIIIllIIIl[1], C0001b.G), lllIIIllIIIl[2], lllIIIllIIIl[3], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[23], lllIIIllIIIl[1], C0001b.G), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[23], lllIIIllIIIl[1], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[32]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[33]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        EAST_II_VII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[63]], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[33], lllIIIllIIIl[2], lllIIIllIIIl[3], C0001b.G), lllIIIllIIIl[13], lllIIIllIIIl[7], new RegionPoint(lllIIIllIIIl[40], lllIIIllIIIl[7], lllIIIllIIIl[3], C0001b.G), new RegionPoint(lllIIIllIIIl[40], lllIIIllIIIl[7], lllIIIllIIIl[3], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[30]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[31]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return ((((132 + 49) - 122) + 77) ^ (((39 + 68) - 51) + 84)) != ((154 ^ 163) ^ (99 ^ 94)) ? ((124 ^ 60) ^ (58 ^ 91)) & (((((26 + 153) - 91) + 81) ^ (((100 + 18) - 39) + 57)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        EAST_II_XII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[61]], lllIIIllIIIl[11], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[30], lllIIIllIIIl[1], C0001b.G), lllIIIllIIIl[6], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.G), new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[28]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[29]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        NORTH_II_I = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[64]], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[36], lllIIIllIIIl[3], C0001b.G), lllIIIllIIIl[15], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[47], lllIIIllIIIl[3], C0001b.G), new RegionPoint(lllIIIllIIIl[3], lllIIIllIIIl[47], lllIIIllIIIl[3], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[26]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[27]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return "  ".length() <= 0 ? ((134 ^ 129) ^ (114 ^ 120)) & (((124 ^ 87) ^ (47 ^ 9)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        NORTH_II_IV = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[65]], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[51], lllIIIllIIIl[3], C0001b.G), lllIIIllIIIl[15], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[47], lllIIIllIIIl[3], C0001b.G), new RegionPoint(lllIIIllIIIl[3], lllIIIllIIIl[47], lllIIIllIIIl[3], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[24]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[25]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return ((66 ^ 0) & ((72 ^ 10) ^ (-1))) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        NORTH_II_XI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[66]], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[41], lllIIIllIIIl[1], C0001b.G), lllIIIllIIIl[2], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[1], C0001b.G), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[1], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[22]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[23]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (-(184 ^ 188)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        EAST_III_VIII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[67]], lllIIIllIIIl[15], new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[2], lllIIIllIIIl[3], C0001b.J), lllIIIllIIIl[8], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[4], lllIIIllIIIl[3], C0001b.J), new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[4], lllIIIllIIIl[3], C0001b.J), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[20]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[21]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return " ".length() >= "   ".length() ? ((179 ^ 135) ^ (99 ^ 90)) & (((78 ^ 20) ^ (28 ^ 75)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        SOUTH_III_II = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[68]], lllIIIllIIIl[16], new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[21], lllIIIllIIIl[1], C0001b.J), lllIIIllIIIl[11], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[30], lllIIIllIIIl[1], C0001b.J), new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[30], lllIIIllIIIl[1], C0001b.J), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[18]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[19]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (((98 ^ 125) ^ (17 ^ 57)) & (((140 ^ 152) ^ (140 ^ 175)) ^ (-" ".length()))) != 0 ? ((153 ^ 146) ^ (24 ^ 55)) & (((77 ^ 120) ^ (212 ^ 197)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        WEST_III_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[69]], lllIIIllIIIl[17], List.of(new Triple(new RegionPoint(lllIIIllIIIl[4], lllIIIllIIIl[12], lllIIIllIIIl[3], C0001b.J), Integer.valueOf(lllIIIllIIIl[21]), Integer.valueOf(lllIIIllIIIl[2])), new Triple(new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[2], lllIIIllIIIl[3], C0001b.J), Integer.valueOf(lllIIIllIIIl[8]), Integer.valueOf(lllIIIllIIIl[9]))), new RegionPoint(lllIIIllIIIl[26], lllIIIllIIIl[5], lllIIIllIIIl[3], C0001b.J), new RegionPoint(lllIIIllIIIl[26], lllIIIllIIIl[5], lllIIIllIIIl[3], C0001b.J), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[16]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[17]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (-((((74 + 103) - 46) + 56) ^ (((186 + 37) - 196) + 164))) >= 0 ? ((109 ^ 20) ^ (148 ^ 179)) & (((79 ^ 29) ^ (107 ^ 103)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        SOUTH_IV_VII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[70]], lllIIIllIIIl[18], new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[2], lllIIIllIIIl[3], C0001b.L), lllIIIllIIIl[25], lllIIIllIIIl[19], new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[18], lllIIIllIIIl[3], C0001b.L), new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[18], lllIIIllIIIl[3], C0001b.L), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[14]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[15]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        NORTH_IV_X = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[71]], lllIIIllIIIl[19], new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[35], lllIIIllIIIl[3], C0001b.L), lllIIIllIIIl[9], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.L), new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[37], lllIIIllIIIl[3], C0001b.L), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[12]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[13]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        SOUTH_IV_VI = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[72]], lllIIIllIIIl[20], List.of(new Triple(new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[5], lllIIIllIIIl[1], C0001b.L), Integer.valueOf(lllIIIllIIIl[2]), Integer.valueOf(lllIIIllIIIl[16])), new Triple(new RegionPoint(lllIIIllIIIl[34], lllIIIllIIIl[17], lllIIIllIIIl[1], C0001b.L), Integer.valueOf(lllIIIllIIIl[8]), Integer.valueOf(lllIIIllIIIl[2]))), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[20], lllIIIllIIIl[1], C0001b.L), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[20], lllIIIllIIIl[1], C0001b.L), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[10]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[11]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return "   ".length() < 0 ? ((((158 + 69) - 163) + 115) ^ (((9 + 83) - (-41)) + 18)) & (((((138 + 64) - 112) + 55) ^ (((78 + 38) - 89) + 154)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        TOP_V_VIII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[73]], lllIIIllIIIl[21], new RegionPoint(lllIIIllIIIl[2], lllIIIllIIIl[3], lllIIIllIIIl[3], C0001b.N), lllIIIllIIIl[2], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[5], lllIIIllIIIl[4], lllIIIllIIIl[3], C0001b.N), new RegionPoint(lllIIIllIIIl[5], lllIIIllIIIl[4], lllIIIllIIIl[3], C0001b.N), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[8]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[9]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return ((((152 + 102) - 198) + 122) ^ (((54 + 73) - (-45)) + 10)) != ((((34 + 145) - 164) + 150) ^ (((159 + 20) - 26) + 8)) ? ((74 ^ 60) ^ (113 ^ 31)) & (("   ".length() ^ (68 ^ 95)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        MIDDLE_V_XVII = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[74]], lllIIIllIIIl[22], new RegionPoint(lllIIIllIIIl[53], lllIIIllIIIl[8], lllIIIllIIIl[1], C0001b.N), lllIIIllIIIl[14], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[60], lllIIIllIIIl[8], lllIIIllIIIl[1], C0001b.N), new RegionPoint(lllIIIllIIIl[60], lllIIIllIIIl[8], lllIIIllIIIl[1], C0001b.N), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[6]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[7]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        BOTTOM_V_IV = new EnumC0017r(lllIIIllIIII[lllIIIllIIIl[75]], lllIIIllIIIl[23], new RegionPoint(lllIIIllIIIl[25], lllIIIllIIIl[41], lllIIIllIIIl[0], C0001b.N), lllIIIllIIIl[19], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[0], C0001b.N), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[0], C0001b.N), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[4]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIllIIIl[1]];
                    strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[5]];
                    if (lIIIlIIlIlIllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIllIIIl[1];
                        "".length();
                        return (-" ".length()) > 0 ? ((((221 + 84) - 104) + 23) ^ (((165 + 79) - 111) + 43)) & (((((239 + 73) - 109) + 46) ^ (((113 + 121) - 166) + 101)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIIllIIIl[0];
            });
        }, EnumC0018s.INTERACT);
        EnumC0017r[] enumC0017rArr = new EnumC0017r[lllIIIllIIIl[24]];
        enumC0017rArr[lllIIIllIIIl[0]] = WEST_I_V;
        enumC0017rArr[lllIIIllIIIl[1]] = WEST_I_VI;
        enumC0017rArr[lllIIIllIIIl[3]] = NORTH_I_V;
        enumC0017rArr[lllIIIllIIIl[2]] = NORTH_I_VI;
        enumC0017rArr[lllIIIllIIIl[4]] = SOUTH_I_V;
        enumC0017rArr[lllIIIllIIIl[5]] = EAST_I_VI;
        enumC0017rArr[lllIIIllIIIl[6]] = WEST_II_VI;
        enumC0017rArr[lllIIIllIIIl[7]] = WEST_II_VIII;
        enumC0017rArr[lllIIIllIIIl[8]] = SOUTH_II_IV;
        enumC0017rArr[lllIIIllIIIl[9]] = SOUTH_II_VI;
        enumC0017rArr[lllIIIllIIIl[10]] = EAST_II_VII;
        enumC0017rArr[lllIIIllIIIl[11]] = EAST_II_XII;
        enumC0017rArr[lllIIIllIIIl[12]] = NORTH_II_I;
        enumC0017rArr[lllIIIllIIIl[13]] = NORTH_II_IV;
        enumC0017rArr[lllIIIllIIIl[14]] = NORTH_II_XI;
        enumC0017rArr[lllIIIllIIIl[15]] = EAST_III_VIII;
        enumC0017rArr[lllIIIllIIIl[16]] = SOUTH_III_II;
        enumC0017rArr[lllIIIllIIIl[17]] = WEST_III_VI;
        enumC0017rArr[lllIIIllIIIl[18]] = SOUTH_IV_VII;
        enumC0017rArr[lllIIIllIIIl[19]] = NORTH_IV_X;
        enumC0017rArr[lllIIIllIIIl[20]] = SOUTH_IV_VI;
        enumC0017rArr[lllIIIllIIIl[21]] = TOP_V_VIII;
        enumC0017rArr[lllIIIllIIIl[22]] = MIDDLE_V_XVII;
        enumC0017rArr[lllIIIllIIIl[23]] = BOTTOM_V_IV;
        $VALUES = enumC0017rArr;
    }

    private static String lIIIlIIlIlIIlII(String lllllllllllllllIIllIllIllllIIlll, String lllllllllllllllIIllIllIllllIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIllllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIllIIIl[3], lllllllllllllllIIllIllIllllIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIllllIlIII) {
            lllllllllllllllIIllIllIllllIlIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIlIIlIlIllIl(local) && !lIIIlIIlIlIlllI(a((Locatable) local) ? 1 : 0)) {
            a(squireSepulchre);
            X();
            "".length();
            return lllIIIllIIIl[1];
        }
        return lllIIIllIIIl[0];
    }

    private EnumC0017r(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier supplier, EnumC0018s enumC0018s) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.object = supplier;
        this.type = enumC0018s;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static String lIIIlIIlIlIIllI(String lllllllllllllllIIllIllIlllIllIlI, String lllllllllllllllIIllIllIlllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlllIllIIl.getBytes(StandardCharsets.UTF_8)), lllIIIllIIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIllIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIlllIllIll) {
            lllllllllllllllIIllIllIlllIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean X() {
        TileObject tileObject = this.object.get();
        if (lIIIlIIlIlIllIl(tileObject)) {
            return lllIIIllIIIl[0];
        }
        System.out.println(lllIIIllIIII[lllIIIllIIIl[0]]);
        String[] strArr = new String[lllIIIllIIIl[2]];
        strArr[lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[1]];
        strArr[lllIIIllIIIl[1]] = lllIIIllIIII[lllIIIllIIIl[3]];
        strArr[lllIIIllIIIl[3]] = lllIIIllIIII[lllIIIllIIIl[2]];
        tileObject.interact(strArr);
        return lllIIIllIIIl[1];
    }

    private static boolean lIIIlIIlIlIlllI(int i) {
        return i == 0;
    }

    private static void lIIIlIIlIlIIlll() {
        lllIIIllIIII = new String[lllIIIllIIIl[76]];
        lllIIIllIIII[lllIIIllIIIl[0]] = lIIIlIIlIlIIlII("dgx2ujaW9ct2JoEg7pmenQ==", "JGFzq");
        lllIIIllIIII[lllIIIllIIIl[1]] = lIIIlIIlIlIIlII("MhYEwtoKcoE=", "njXKT");
        lllIIIllIIII[lllIIIllIIIl[3]] = lIIIlIIlIlIIlIl("Agk9NwlsATstBQ==", "AeTZk");
        lllIIIllIIII[lllIIIllIIIl[2]] = lIIIlIIlIlIIllI("FLAPHxtZ12IUjUJhBR/W8Q==", "NdFre");
        lllIIIllIIII[lllIIIllIIIl[4]] = lIIIlIIlIlIIlII("VXyEfROvQxhd4A/wfHpl6A==", "jTYFe");
        lllIIIllIIII[lllIIIllIIIl[5]] = lIIIlIIlIlIIlII("CH1sdiJD8t4=", "plXHY");
        lllIIIllIIII[lllIIIllIIIl[6]] = lIIIlIIlIlIIlII("VTXF4vlHWSs=", "qFVCt");
        lllIIIllIIII[lllIIIllIIIl[7]] = lIIIlIIlIlIIllI("Wt3W6OZg/Z4=", "nBpDX");
        lllIIIllIIII[lllIIIllIIIl[8]] = lIIIlIIlIlIIllI("/VYFGkdOKWs=", "yYYFV");
        lllIIIllIIII[lllIIIllIIIl[9]] = lIIIlIIlIlIIllI("y1utfOrvgeI=", "sRqVx");
        lllIIIllIIII[lllIIIllIIIl[10]] = lIIIlIIlIlIIlIl("NQMTBw==", "rbgbJ");
        lllIIIllIIII[lllIIIllIIIl[11]] = lIIIlIIlIlIIlII("MOdfD2vQBGvfRIGucoDMpw==", "gKYmJ");
        lllIIIllIIII[lllIIIllIIIl[12]] = lIIIlIIlIlIIllI("VJLVnl8xtas=", "sQJbS");
        lllIIIllIIII[lllIIIllIIIl[13]] = lIIIlIIlIlIIlIl("KQw4Kg==", "cyUZj");
        lllIIIllIIII[lllIIIllIIIl[14]] = lIIIlIIlIlIIllI("Y/cuqkTWeqY=", "yOvfE");
        lllIIIllIIII[lllIIIllIIIl[15]] = lIIIlIIlIlIIlIl("OQAoGCZXCC4CKg==", "zlAuD");
        lllIIIllIIII[lllIIIllIIIl[16]] = lIIIlIIlIlIIlIl("OToPHBoZ", "jNnuh");
        lllIIIllIIII[lllIIIllIIIl[17]] = lIIIlIIlIlIIlII("KB+P12/13Xg=", "MWFiP");
        lllIIIllIIII[lllIIIllIIIl[18]] = lIIIlIIlIlIIlIl("NCgNNhYLNgE=", "dDlBp");
        lllIIIllIIII[lllIIIllIIIl[19]] = lIIIlIIlIlIIlII("q+nsPbrwvcc=", "VPKZX");
        lllIIIllIIII[lllIIIllIIIl[20]] = lIIIlIIlIlIIllI("vCbj+LqQ250=", "XZPGq");
        lllIIIllIIII[lllIIIllIIIl[21]] = lIIIlIIlIlIIlIl("AzIaPQ==", "IGwMR");
        lllIIIllIIII[lllIIIllIIIl[22]] = lIIIlIIlIlIIlII("tBTJVnMK+6qH79PgEyg2Rg==", "fyFPq");
        lllIIIllIIII[lllIIIllIIIl[23]] = lIIIlIIlIlIIllI("tSHwHFxmP6A=", "FtzwH");
        lllIIIllIIII[lllIIIllIIIl[24]] = lIIIlIIlIlIIlII("80f5rJ2kwqg=", "tDkqi");
        lllIIIllIIII[lllIIIllIIIl[25]] = lIIIlIIlIlIIllI("9wjxsKmKtjJ5jqG+jYt+sA==", "evRRG");
        lllIIIllIIII[lllIIIllIIIl[26]] = lIIIlIIlIlIIlIl("AAIqNyI/HCY=", "PnKCD");
        lllIIIllIIII[lllIIIllIIIl[27]] = lIIIlIIlIlIIlIl("CC09Fw==", "BXPgi");
        lllIIIllIIII[lllIIIllIIIl[28]] = lIIIlIIlIlIIllI("QBJFVOVwwe7YYwxf5yQykQ==", "xjWFV");
        lllIIIllIIII[lllIIIllIIIl[29]] = lIIIlIIlIlIIlIl("AAwkEw==", "JyIcQ");
        lllIIIllIIII[lllIIIllIIIl[30]] = lIIIlIIlIlIIllI("6UfC7FcddeM=", "fkpCZ");
        lllIIIllIIII[lllIIIllIIIl[31]] = lIIIlIIlIlIIllI("3gomXQUrbJqjiGaL9CS8kA==", "WcZud");
        lllIIIllIIII[lllIIIllIIIl[32]] = lIIIlIIlIlIIllI("MCE90POE3F773Cxzjhyc3Q==", "gDqxG");
        lllIIIllIIII[lllIIIllIIIl[33]] = lIIIlIIlIlIIlIl("IC84Ow==", "jZUKQ");
        lllIIIllIIII[lllIIIllIIIl[34]] = lIIIlIIlIlIIlII("NbAXvtCdJYE=", "wLYda");
        lllIIIllIIII[lllIIIllIIIl[35]] = lIIIlIIlIlIIllI("Lz0ABWalTut55SHk4sZYvA==", "WPCul");
        lllIIIllIIII[lllIIIllIIIl[36]] = lIIIlIIlIlIIllI("MOJ9lPKlEnFJYOdACBXHiA==", "uyujg");
        lllIIIllIIII[lllIIIllIIIl[37]] = lIIIlIIlIlIIllI("ybSqJLoC1Dg=", "WWeCD");
        lllIIIllIIII[lllIIIllIIIl[38]] = lIIIlIIlIlIIllI("xIXA088Je5Q=", "bbkEY");
        lllIIIllIIII[lllIIIllIIIl[39]] = lIIIlIIlIlIIlII("RVVihKpynhE=", "wUkGz");
        lllIIIllIIII[lllIIIllIIIl[40]] = lIIIlIIlIlIIlIl("IiAgBzAC", "qTAnB");
        lllIIIllIIII[lllIIIllIIIl[41]] = lIIIlIIlIlIIlII("9pX4iSRPwM2sx86Ofob4Aw==", "DNLZm");
        lllIIIllIIII[lllIIIllIIIl[42]] = lIIIlIIlIlIIlII("/oC88PpXX68=", "arICR");
        lllIIIllIIII[lllIIIllIIIl[43]] = lIIIlIIlIlIIlIl("NQoIIyFbAg45LQ==", "vfaNC");
        lllIIIllIIII[lllIIIllIIIl[44]] = lIIIlIIlIlIIllI("mnbZmFfSOuRqgYfw5PW5eg==", "kwZEo");
        lllIIIllIIII[lllIIIllIIIl[45]] = lIIIlIIlIlIIllI("17CQeHGwaS8=", "MPUvo");
        lllIIIllIIII[lllIIIllIIIl[46]] = lIIIlIIlIlIIlII("/RPMsraZIpY=", "lSlBG");
        lllIIIllIIII[lllIIIllIIIl[47]] = lIIIlIIlIlIIlIl("LjMbKA==", "dFvXt");
        lllIIIllIIII[lllIIIllIIIl[48]] = lIIIlIIlIlIIlIl("OCImDjAHPCo=", "hNGzV");
        lllIIIllIIII[lllIIIllIIIl[49]] = lIIIlIIlIlIIlIl("ITcAMg==", "kBmBm");
        lllIIIllIIII[lllIIIllIIIl[50]] = lIIIlIIlIlIIlII("vR5eMaK2His=", "UmCvR");
        lllIIIllIIII[lllIIIllIIIl[51]] = lIIIlIIlIlIIllI("H+QyESwPGOk=", "MRkYO");
        lllIIIllIIII[lllIIIllIIIl[52]] = lIIIlIIlIlIIlIl("DyIfBicROBo=", "XgLRx");
        lllIIIllIIII[lllIIIllIIIl[53]] = lIIIlIIlIlIIllI("7XnWffbqfAOZlO3Op+ZxUw==", "AkBnH");
        lllIIIllIIII[lllIIIllIIIl[54]] = lIIIlIIlIlIIllI("IYBjc2302jj0PilnbZ1kgQ==", "FIZTm");
        lllIIIllIIII[lllIIIllIIIl[55]] = lIIIlIIlIlIIllI("3hAgtiELyX/IIw+OZmMm0Q==", "vFsau");
        lllIIIllIIII[lllIIIllIIIl[56]] = lIIIlIIlIlIIlIl("OAQTJiA0Ahkk", "kKFrh");
        lllIIIllIIII[lllIIIllIIIl[57]] = lIIIlIIlIlIIlII("A5qntqFXke4nwG+5TGub4g==", "ZaHPJ");
        lllIIIllIIII[lllIIIllIIIl[58]] = lIIIlIIlIlIIlII("3/dP7cC2s4az9vV5P/CRrA==", "UVAMf");
        lllIIIllIIII[lllIIIllIIIl[60]] = lIIIlIIlIlIIlII("v82iadhZu7ikZ8OoxD3v/A==", "IXqZk");
        lllIIIllIIII[lllIIIllIIIl[62]] = lIIIlIIlIlIIlII("O9u6b/XkjUgcx+kdMv2ICg==", "UgLcC");
        lllIIIllIIII[lllIIIllIIIl[59]] = lIIIlIIlIlIIllI("6jP+pdqh1nIGh/x4KNAFtw==", "xqfBl");
        lllIIIllIIII[lllIIIllIIIl[63]] = lIIIlIIlIlIIllI("woXFA3GpgG7US8d9Q0T7zw==", "TVquD");
        lllIIIllIIII[lllIIIllIIIl[61]] = lIIIlIIlIlIIllI("z2l6dJW9UGa11Ownku4Npg==", "NMOVN");
        lllIIIllIIII[lllIIIllIIIl[64]] = lIIIlIIlIlIIllI("pb0ZLnb2RrspGc257ZySvg==", "uQiOv");
        lllIIIllIIII[lllIIIllIIIl[65]] = lIIIlIIlIlIIlII("3DtBcxw2uBROkDeVGVl1ag==", "Lebuq");
        lllIIIllIIII[lllIIIllIIIl[66]] = lIIIlIIlIlIIllI("KWMmxE9ke+FVVkjxZl747g==", "UZmdI");
        lllIIIllIIII[lllIIIllIIIl[67]] = lIIIlIIlIlIIlII("rcJYJ0oxCPWJoo6WWcSf5w==", "NHNWW");
        lllIIIllIIII[lllIIIllIIIl[68]] = lIIIlIIlIlIIlIl("HgccAgUSAQAfEgQB", "MHIVM");
        lllIIIllIIII[lllIIIllIIIl[69]] = lIIIlIIlIlIIllI("sQRiVgBc4BhriHzg/6Z8XQ==", "TJfPV");
        lllIIIllIIII[lllIIIllIIIl[70]] = lIIIlIIlIlIIlIl("ET4gPgodOCM1FAs4", "BqujB");
        lllIIIllIIII[lllIIIllIIIl[71]] = lIIIlIIlIlIIlII("h37FsxAaVvJJgzMLXwWOYg==", "obSPh");
        lllIIIllIIII[lllIIIllIIIl[72]] = lIIIlIIlIlIIlII("SPedwrtD+HUKdaKbZwbqsw==", "UAPQf");
        lllIIIllIIII[lllIIIllIIIl[73]] = lIIIlIIlIlIIlII("XkDrbAmQbAwG+yWXAhrtPg==", "vJnHl");
        lllIIIllIIII[lllIIIllIIIl[74]] = lIIIlIIlIlIIlIl("DiI9CQMGNC8SFxUiMA==", "CkyMO");
        lllIIIllIIII[lllIIIllIIIl[75]] = lIIIlIIlIlIIlII("QSxcehhT4B7aJvU8n7WXjw==", "bOoFZ");
    }

    private static boolean lIIIlIIlIllIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIlIlIllll(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIllIIIl[1];
            }
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIllIIIl[0];
    }

    private static boolean lIIIlIIlIlIllll(int i) {
        return i != 0;
    }
}
