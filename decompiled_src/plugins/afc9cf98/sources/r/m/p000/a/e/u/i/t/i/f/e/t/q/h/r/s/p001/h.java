package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.h  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/h.class */
public final class h {
    private static /* synthetic */ String[] lIlIIIIIIllII;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ int[] lIlIIIIIIllIl;
    private final /* synthetic */ g[] patches;
    public static final /* synthetic */ h ROTATION_25;

    private static void lIllIllIlIllIIl() {
        lIlIIIIIIllIl = new int[26];
        lIlIIIIIIllIl[0] = (45 ^ 51) & ((137 ^ 151) ^ (-1));
        lIlIIIIIIllIl[1] = (10 ^ 71) ^ (126 ^ 42);
        lIlIIIIIIllIl[2] = " ".length();
        lIlIIIIIIllIl[3] = "  ".length();
        lIlIIIIIIllIl[4] = "   ".length();
        lIlIIIIIIllIl[5] = (177 ^ 158) ^ (68 ^ 111);
        lIlIIIIIIllIl[6] = (135 ^ 184) ^ (3 ^ 57);
        lIlIIIIIIllIl[7] = 155 ^ 157;
        lIlIIIIIIllIl[8] = 159 ^ 152;
        lIlIIIIIIllIl[9] = (3 ^ 108) ^ (217 ^ 190);
        lIlIIIIIIllIl[10] = (236 ^ 161) ^ (214 ^ 146);
        lIlIIIIIIllIl[11] = 45 ^ 39;
        lIlIIIIIIllIl[12] = (126 ^ 87) ^ (227 ^ 193);
        lIlIIIIIIllIl[13] = 46 ^ 34;
        lIlIIIIIIllIl[14] = 157 ^ 144;
        lIlIIIIIIllIl[15] = 37 ^ 43;
        lIlIIIIIIllIl[16] = 149 ^ 154;
        lIlIIIIIIllIl[17] = 35 ^ 51;
        lIlIIIIIIllIl[18] = (((78 + 62) - 100) + 117) ^ (((55 + 64) - 19) + 40);
        lIlIIIIIIllIl[19] = 36 ^ 54;
        lIlIIIIIIllIl[20] = (((87 + 80) - 100) + 63) ^ (((82 + 87) - 136) + 112);
        lIlIIIIIIllIl[21] = 123 ^ 111;
        lIlIIIIIIllIl[22] = (((31 + 37) - 5) + 81) ^ (((35 + 101) - 97) + 94);
        lIlIIIIIIllIl[23] = 10 ^ 28;
        lIlIIIIIIllIl[24] = 75 ^ 92;
        lIlIIIIIIllIl[25] = 160 ^ 184;
    }

    private static String lIllIllIlIlIlll(String llllllllllllllIlllIIlIIlIlIIIlIl, String llllllllllllllIlllIIlIIlIlIIIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIIlIlIIIlII.toCharArray();
        int llllllllllllllIlllIIlIIlIlIIIIIl = lIlIIIIIIllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIIlIIlIIlllIIl = lIlIIIIIIllIl[0];
        while (lIllIllIlIllIlI(llllllllllllllIlllIIlIIlIIlllIIl, length)) {
            sb.append((char) (charArray2[llllllllllllllIlllIIlIIlIIlllIIl] ^ charArray[llllllllllllllIlllIIlIIlIlIIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIIlIlIIIIIl++;
            llllllllllllllIlllIIlIIlIIlllIIl++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    private h(String str, int i, g... gVarArr) {
        this.patches = gVarArr;
    }

    private static boolean lIllIllIlIllIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIllIllIlIllIII() {
        lIlIIIIIIllII = new String[lIlIIIIIIllIl[2]];
        lIlIIIIIIllII[lIlIIIIIIllIl[0]] = lIllIllIlIlIlll("PT0EIBUmPR4+c1o=", "orPaA");
    }

    static {
        lIllIllIlIllIIl();
        lIllIllIlIllIII();
        String str = lIlIIIIIIllII[lIlIIIIIIllIl[0]];
        int i = lIlIIIIIIllIl[0];
        g[] gVarArr = new g[lIlIIIIIIllIl[1]];
        gVarArr[lIlIIIIIIllIl[0]] = g.PATCH_13_SOUTH;
        gVarArr[lIlIIIIIIllIl[2]] = g.PATCH_9;
        gVarArr[lIlIIIIIIllIl[3]] = g.PATCH_13;
        gVarArr[lIlIIIIIIllIl[4]] = g.PATCH_14;
        gVarArr[lIlIIIIIIllIl[5]] = g.PATCH_10;
        gVarArr[lIlIIIIIIllIl[6]] = g.PATCH_11;
        gVarArr[lIlIIIIIIllIl[7]] = g.PATCH_15;
        gVarArr[lIlIIIIIIllIl[8]] = g.PATCH_16;
        gVarArr[lIlIIIIIIllIl[9]] = g.PATCH_12;
        gVarArr[lIlIIIIIIllIl[10]] = g.PATCH_9_NORTH;
        gVarArr[lIlIIIIIIllIl[11]] = g.PATCH_13_NORTH;
        gVarArr[lIlIIIIIIllIl[12]] = g.PATCH_14_NORTH;
        gVarArr[lIlIIIIIIllIl[13]] = g.PATCH_10_NORTH;
        gVarArr[lIlIIIIIIllIl[14]] = g.PATCH_11_NORTH;
        gVarArr[lIlIIIIIIllIl[15]] = g.PATCH_15_NORTH;
        gVarArr[lIlIIIIIIllIl[16]] = g.PATCH_16_NORTH;
        gVarArr[lIlIIIIIIllIl[17]] = g.PATCH_12_NORTH;
        gVarArr[lIlIIIIIIllIl[18]] = g.PATCH_8_NORTH;
        gVarArr[lIlIIIIIIllIl[19]] = g.PATCH_7_NORTH;
        gVarArr[lIlIIIIIIllIl[20]] = g.PATCH_6_NORTH;
        gVarArr[lIlIIIIIIllIl[21]] = g.PATCH_5_NORTH;
        gVarArr[lIlIIIIIIllIl[22]] = g.PATCH_8;
        gVarArr[lIlIIIIIIllIl[23]] = g.PATCH_7;
        gVarArr[lIlIIIIIIllIl[24]] = g.PATCH_6;
        gVarArr[lIlIIIIIIllIl[25]] = g.PATCH_5;
        ROTATION_25 = new h(str, i, gVarArr);
        h[] hVarArr = new h[lIlIIIIIIllIl[2]];
        hVarArr[lIlIIIIIIllIl[0]] = ROTATION_25;
        $VALUES = hVarArr;
    }

    public g[] o() {
        return this.patches;
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
