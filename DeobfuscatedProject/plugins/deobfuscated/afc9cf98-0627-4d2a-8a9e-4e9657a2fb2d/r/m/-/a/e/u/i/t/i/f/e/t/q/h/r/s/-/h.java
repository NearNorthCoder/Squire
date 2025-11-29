/*
 * Decompiled with CFR 0.152.
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.g;

public final class h
extends Enum<h> {
    private static /* synthetic */ String[] lIlIIIIIIllII;
    private static final /* synthetic */ h[] $VALUES;
    private static /* synthetic */ int[] lIlIIIIIIllIl;
    private final /* synthetic */ g[] patches;
    public static final /* synthetic */ /* enum */ h ROTATION_25;

    private static void lIllIllIlIllIIl() {
        lIlIIIIIIllIl = new int[26];
        h.lIlIIIIIIllIl[0] = (0x2D ^ 0x33) & ~(0x89 ^ 0x97);
        h.lIlIIIIIIllIl[1] = 0xA ^ 0x47 ^ (0x7E ^ 0x2A);
        h.lIlIIIIIIllIl[2] = 1;
        h.lIlIIIIIIllIl[3] = 2;
        h.lIlIIIIIIllIl[4] = 3;
        h.lIlIIIIIIllIl[5] = 0xB1 ^ 0x9E ^ (0x44 ^ 0x6F);
        h.lIlIIIIIIllIl[6] = 0x87 ^ 0xB8 ^ (3 ^ 0x39);
        h.lIlIIIIIIllIl[7] = 0x9B ^ 0x9D;
        h.lIlIIIIIIllIl[8] = 0x9F ^ 0x98;
        h.lIlIIIIIIllIl[9] = 3 ^ 0x6C ^ (0xD9 ^ 0xBE);
        h.lIlIIIIIIllIl[10] = 0xEC ^ 0xA1 ^ (0xD6 ^ 0x92);
        h.lIlIIIIIIllIl[11] = 0x2D ^ 0x27;
        h.lIlIIIIIIllIl[12] = 0x7E ^ 0x57 ^ (0xE3 ^ 0xC1);
        h.lIlIIIIIIllIl[13] = 0x2E ^ 0x22;
        h.lIlIIIIIIllIl[14] = 0x9D ^ 0x90;
        h.lIlIIIIIIllIl[15] = 0x25 ^ 0x2B;
        h.lIlIIIIIIllIl[16] = 0x95 ^ 0x9A;
        h.lIlIIIIIIllIl[17] = 0x23 ^ 0x33;
        h.lIlIIIIIIllIl[18] = 78 + 62 - 100 + 117 ^ 55 + 64 - 19 + 40;
        h.lIlIIIIIIllIl[19] = 0x24 ^ 0x36;
        h.lIlIIIIIIllIl[20] = 87 + 80 - 100 + 63 ^ 82 + 87 - 136 + 112;
        h.lIlIIIIIIllIl[21] = 0x7B ^ 0x6F;
        h.lIlIIIIIIllIl[22] = 31 + 37 - 5 + 81 ^ 35 + 101 - 97 + 94;
        h.lIlIIIIIIllIl[23] = 0xA ^ 0x1C;
        h.lIlIIIIIIllIl[24] = 0x4B ^ 0x5C;
        h.lIlIIIIIIllIl[25] = 0xA0 ^ 0xB8;
    }

    private static String lIllIllIlIlIlll(String llllllllllllllIlllIIlIIlIlIIIlIl, String llllllllllllllIlllIIlIIlIIllllll) {
        llllllllllllllIlllIIlIIlIlIIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIIlIlIIIIll = new StringBuilder();
        char[] llllllllllllllIlllIIlIIlIlIIIIlI = llllllllllllllIlllIIlIIlIIllllll.toCharArray();
        int llllllllllllllIlllIIlIIlIlIIIIIl = lIlIIIIIIllIl[0];
        char[] llllllllllllllIlllIIlIIlIIlllIll = llllllllllllllIlllIIlIIlIlIIIlIl.toCharArray();
        int llllllllllllllIlllIIlIIlIIlllIlI = llllllllllllllIlllIIlIIlIIlllIll.length;
        int llllllllllllllIlllIIlIIlIIlllIIl = lIlIIIIIIllIl[0];
        while (h.lIllIllIlIllIlI(llllllllllllllIlllIIlIIlIIlllIIl, llllllllllllllIlllIIlIIlIIlllIlI)) {
            char llllllllllllllIlllIIlIIlIlIIIllI = llllllllllllllIlllIIlIIlIIlllIll[llllllllllllllIlllIIlIIlIIlllIIl];
            llllllllllllllIlllIIlIIlIlIIIIll.append((char)(llllllllllllllIlllIIlIIlIlIIIllI ^ llllllllllllllIlllIIlIIlIlIIIIlI[llllllllllllllIlllIIlIIlIlIIIIIl % llllllllllllllIlllIIlIIlIlIIIIlI.length]));
            0;
            ++llllllllllllllIlllIIlIIlIlIIIIIl;
            ++llllllllllllllIlllIIlIIlIIlllIIl;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIlIIlIlIIIIll);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private h(g ... gArray) {
        this.patches = gArray;
    }

    private static boolean lIllIllIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIllIII() {
        lIlIIIIIIllII = new String[lIlIIIIIIllIl[2]];
        h.lIlIIIIIIllII[h.lIlIIIIIIllIl[0]] = h."ROTATION_25";
    }

    static {
        h.lIllIllIlIllIIl();
        h.lIllIllIlIllIII();
        g[] gArray = new g[lIlIIIIIIllIl[1]];
        gArray[h.lIlIIIIIIllIl[0]] = g.PATCH_13_SOUTH;
        gArray[h.lIlIIIIIIllIl[2]] = g.PATCH_9;
        gArray[h.lIlIIIIIIllIl[3]] = g.PATCH_13;
        gArray[h.lIlIIIIIIllIl[4]] = g.PATCH_14;
        gArray[h.lIlIIIIIIllIl[5]] = g.PATCH_10;
        gArray[h.lIlIIIIIIllIl[6]] = g.PATCH_11;
        gArray[h.lIlIIIIIIllIl[7]] = g.PATCH_15;
        gArray[h.lIlIIIIIIllIl[8]] = g.PATCH_16;
        gArray[h.lIlIIIIIIllIl[9]] = g.PATCH_12;
        gArray[h.lIlIIIIIIllIl[10]] = g.PATCH_9_NORTH;
        gArray[h.lIlIIIIIIllIl[11]] = g.PATCH_13_NORTH;
        gArray[h.lIlIIIIIIllIl[12]] = g.PATCH_14_NORTH;
        gArray[h.lIlIIIIIIllIl[13]] = g.PATCH_10_NORTH;
        gArray[h.lIlIIIIIIllIl[14]] = g.PATCH_11_NORTH;
        gArray[h.lIlIIIIIIllIl[15]] = g.PATCH_15_NORTH;
        gArray[h.lIlIIIIIIllIl[16]] = g.PATCH_16_NORTH;
        gArray[h.lIlIIIIIIllIl[17]] = g.PATCH_12_NORTH;
        gArray[h.lIlIIIIIIllIl[18]] = g.PATCH_8_NORTH;
        gArray[h.lIlIIIIIIllIl[19]] = g.PATCH_7_NORTH;
        gArray[h.lIlIIIIIIllIl[20]] = g.PATCH_6_NORTH;
        gArray[h.lIlIIIIIIllIl[21]] = g.PATCH_5_NORTH;
        gArray[h.lIlIIIIIIllIl[22]] = g.PATCH_8;
        gArray[h.lIlIIIIIIllIl[23]] = g.PATCH_7;
        gArray[h.lIlIIIIIIllIl[24]] = g.PATCH_6;
        gArray[h.lIlIIIIIIllIl[25]] = g.PATCH_5;
        ROTATION_25 = new h(gArray);
        h[] hArray = new h[lIlIIIIIIllIl[2]];
        hArray[h.lIlIIIIIIllIl[0]] = ROTATION_25;
        $VALUES = hArray;
    }

    public g[] o() {
        return this.patches;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

