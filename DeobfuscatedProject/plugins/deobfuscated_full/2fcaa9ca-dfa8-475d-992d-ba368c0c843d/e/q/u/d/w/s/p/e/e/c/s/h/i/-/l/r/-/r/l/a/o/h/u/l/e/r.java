/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.s;
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

public final class r
extends Enum<r> {
    public static final /* synthetic */ /* enum */ r NORTH_I_VI;
    private static final /* synthetic */ r[] $VALUES;
    public static final /* synthetic */ /* enum */ r EAST_II_XII;
    public static final /* synthetic */ /* enum */ r WEST_II_VI;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ r NORTH_I_V;
    /* synthetic */ Supplier<WorldPoint> destination;
    /* synthetic */ s type;
    private static /* synthetic */ int[] lllIIIllIIIl;
    public static final /* synthetic */ /* enum */ r SOUTH_IV_VII;
    public static final /* synthetic */ /* enum */ r BOTTOM_V_IV;
    public static final /* synthetic */ /* enum */ r NORTH_II_IV;
    public static final /* synthetic */ /* enum */ r SOUTH_I_V;
    public static final /* synthetic */ /* enum */ r SOUTH_II_VI;
    public static final /* synthetic */ /* enum */ r SOUTH_III_II;
    public static final /* synthetic */ /* enum */ r NORTH_IV_X;
    public /* synthetic */ Supplier<TileObject> object;
    public static final /* synthetic */ /* enum */ r EAST_II_VII;
    public static final /* synthetic */ /* enum */ r SOUTH_IV_VI;
    public static final /* synthetic */ /* enum */ r SOUTH_II_IV;
    public static final /* synthetic */ /* enum */ r WEST_III_VI;
    private static /* synthetic */ String[] lllIIIllIIII;
    public static final /* synthetic */ /* enum */ r WEST_I_VI;
    public static final /* synthetic */ /* enum */ r MIDDLE_V_XVII;
    public static final /* synthetic */ /* enum */ r WEST_I_V;
    public static final /* synthetic */ /* enum */ r NORTH_II_XI;
    public static final /* synthetic */ /* enum */ r EAST_III_VIII;
    public static final /* synthetic */ /* enum */ r WEST_II_VIII;
    public static final /* synthetic */ /* enum */ r TOP_V_VIII;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ /* enum */ r NORTH_II_I;
    public static final /* synthetic */ /* enum */ r EAST_I_VI;

    private r(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, s s2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var19 = list.iterator();
            while (r.lIIIlIIlIlIllll(var19.hasNext() ? 1 : 0)) {
                void var24;
                Triple var25 = (Triple)var19.next();
                var24.add(new WorldArea(SquireSepulchre.a((RegionPoint)var25.getFirst()), ((Integer)var25.getSecond()).intValue(), ((Integer)var25.getThird()).intValue()));
                0;
                0;
                if ((0x8C ^ 0x88) >= 3) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = s2;
    }

    private static boolean lIIIlIIlIlIllIl(Object object) {
        return object == null;
    }

    private static void lIIIlIIlIlIllII() {
        lllIIIllIIIl = new int[77];
        r.lllIIIllIIIl[0] = (0x13 ^ 0x7C ^ (0xDF ^ 0x87)) & (133 + 84 - 134 + 70 ^ 23 + 111 - 103 + 143 ^ -1);
        r.lllIIIllIIIl[1] = 1;
        r.lllIIIllIIIl[2] = 3;
        r.lllIIIllIIIl[3] = 2;
        r.lllIIIllIIIl[4] = 0xC4 ^ 0xAD ^ (0xAA ^ 0xC7);
        r.lllIIIllIIIl[5] = 0x11 ^ 0x5B ^ (0xD2 ^ 0x9D);
        r.lllIIIllIIIl[6] = 0x11 ^ 0x17;
        r.lllIIIllIIIl[7] = 0x7A ^ 0x7D;
        r.lllIIIllIIIl[8] = 0x6E ^ 9 ^ (0x67 ^ 8);
        r.lllIIIllIIIl[9] = 0x6A ^ 0x63;
        r.lllIIIllIIIl[10] = 6 ^ 0xC;
        r.lllIIIllIIIl[11] = 0x6E ^ 0x65;
        r.lllIIIllIIIl[12] = 145 + 72 - 50 + 17 ^ 178 + 166 - 325 + 161;
        r.lllIIIllIIIl[13] = 0x75 ^ 0x27 ^ (0x7E ^ 0x21);
        r.lllIIIllIIIl[14] = 0x84 ^ 0x8A;
        r.lllIIIllIIIl[15] = 0x37 ^ 0x38;
        r.lllIIIllIIIl[16] = 34 + 10 - -30 + 58 ^ 17 + 143 - 83 + 71;
        r.lllIIIllIIIl[17] = 0x16 ^ 7;
        r.lllIIIllIIIl[18] = 0x3F ^ 0x2C ^ 1;
        r.lllIIIllIIIl[19] = 0x81 ^ 0x92;
        r.lllIIIllIIIl[20] = 136 + 95 - 108 + 17 ^ 26 + 136 - 11 + 1;
        r.lllIIIllIIIl[21] = 7 ^ 3 ^ (0xB1 ^ 0xA0);
        r.lllIIIllIIIl[22] = 0x7C ^ 0x77 ^ (0x19 ^ 4);
        r.lllIIIllIIIl[23] = 0x75 ^ 0x62;
        r.lllIIIllIIIl[24] = 0x40 ^ 0x2B ^ (0x53 ^ 0x20);
        r.lllIIIllIIIl[25] = 0x24 ^ 0x3D;
        r.lllIIIllIIIl[26] = 0x66 ^ 0x7C;
        r.lllIIIllIIIl[27] = 0x67 ^ 0x7C;
        r.lllIIIllIIIl[28] = 3 ^ (0x60 ^ 0x7F);
        r.lllIIIllIIIl[29] = 0x8F ^ 0xA1 ^ (2 ^ 0x31);
        r.lllIIIllIIIl[30] = 0xF7 ^ 0x9A ^ (0x20 ^ 0x53);
        r.lllIIIllIIIl[31] = 33 + 55 - 29 + 104 ^ 113 + 69 - 1 + 7;
        r.lllIIIllIIIl[32] = 0x9F ^ 0xBD ^ 2;
        r.lllIIIllIIIl[33] = 0x6A ^ 0x4B;
        r.lllIIIllIIIl[34] = 0x2E ^ 0x6B ^ (0xCC ^ 0xAB);
        r.lllIIIllIIIl[35] = 0x2A ^ 9;
        r.lllIIIllIIIl[36] = 0x4B ^ 0x6F;
        r.lllIIIllIIIl[37] = 16 + 50 - -2 + 121 ^ 18 + 103 - 5 + 36;
        r.lllIIIllIIIl[38] = 0x1A ^ 0x3C;
        r.lllIIIllIIIl[39] = 0x1D ^ 0x3A;
        r.lllIIIllIIIl[40] = 0x96 ^ 0xBE;
        r.lllIIIllIIIl[41] = 66 + 90 - 92 + 90 ^ 24 + 38 - -52 + 65;
        r.lllIIIllIIIl[42] = 0x24 ^ 0xE;
        r.lllIIIllIIIl[43] = 57 + 107 - 140 + 113 ^ 58 + 135 - 40 + 9;
        r.lllIIIllIIIl[44] = 0xF ^ 0x23;
        r.lllIIIllIIIl[45] = 22 + 88 - 14 + 51 ^ 37 + 98 - -14 + 41;
        r.lllIIIllIIIl[46] = 0x9B ^ 0xB5;
        r.lllIIIllIIIl[47] = 0x7A ^ 0x64 ^ (0x85 ^ 0xB4);
        r.lllIIIllIIIl[48] = 0x14 ^ 0x47 ^ (0x25 ^ 0x46);
        r.lllIIIllIIIl[49] = 0x75 ^ 0x44;
        r.lllIIIllIIIl[50] = 0xD9 ^ 0x8C ^ (0x79 ^ 0x1E);
        r.lllIIIllIIIl[51] = 0xAD ^ 0x9E;
        r.lllIIIllIIIl[52] = 0x47 ^ 0x73;
        r.lllIIIllIIIl[53] = 0x4A ^ 0x7F;
        r.lllIIIllIIIl[54] = 0xF6 ^ 0x83 ^ (0xEB ^ 0xA8);
        r.lllIIIllIIIl[55] = 0x62 ^ 0x55;
        r.lllIIIllIIIl[56] = 0x7D ^ 0x2E ^ (0xAA ^ 0xC1);
        r.lllIIIllIIIl[57] = 77 + 142 - 173 + 104 ^ 25 + 169 - 137 + 118;
        r.lllIIIllIIIl[58] = 122 + 115 - 149 + 74 ^ 90 + 62 - 134 + 134;
        r.lllIIIllIIIl[59] = 0x7E ^ 0x43;
        r.lllIIIllIIIl[60] = 4 + 96 - -41 + 38 ^ 5 + 5 - -77 + 49;
        r.lllIIIllIIIl[61] = 0x98 ^ 0xA7;
        r.lllIIIllIIIl[62] = 3 ^ (0xA2 ^ 0x9D);
        r.lllIIIllIIIl[63] = 0x63 ^ 0x5D;
        r.lllIIIllIIIl[64] = 0x65 ^ 0x29 ^ (0x9E ^ 0x92);
        r.lllIIIllIIIl[65] = 63 + 106 - 108 + 69 ^ 7 + 157 - 105 + 136;
        r.lllIIIllIIIl[66] = 0x69 ^ 0x2B;
        r.lllIIIllIIIl[67] = 0x4D ^ 0x25 ^ (0x67 ^ 0x4C);
        r.lllIIIllIIIl[68] = 0x3B ^ 0x7F;
        r.lllIIIllIIIl[69] = 0x7F ^ 0x3A;
        r.lllIIIllIIIl[70] = 0x86 ^ 0xC0;
        r.lllIIIllIIIl[71] = 1 ^ 0x46;
        r.lllIIIllIIIl[72] = 0x13 ^ 0x5B;
        r.lllIIIllIIIl[73] = 0x31 ^ 0x78;
        r.lllIIIllIIIl[74] = 0x4A ^ 0x20 ^ (0x82 ^ 0xA2);
        r.lllIIIllIIIl[75] = 136 + 168 - 291 + 184 ^ 31 + 108 - 15 + 18;
        r.lllIIIllIIIl[76] = 0x7F ^ 0x33;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    private static String lIIIlIIlIlIIlIl(String var7, String var18) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var6 = var18.toCharArray();
        int var21 = lllIIIllIIIl[0];
        char[] var2 = var7.toCharArray();
        int var10 = var2.length;
        int var22 = lllIIIllIIIl[0];
        while (r.lIIIlIIlIllIIII(var22, var10)) {
            char var14 = var2[var22];
            var16.append((char)(var14 ^ var6[var21 % var6.length]));
            0;
            ++var21;
            ++var22;
            0;
            if (((67 + 77 - 101 + 145 ^ 149 + 143 - 155 + 49) & (0xDD ^ 0x8D ^ (0xCA ^ 0x9C) ^ -1)) >= -1) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    static {
        r.lIIIlIIlIlIllII();
        r.lIIIlIIlIlIIlll();
        WEST_I_V = new r(new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), lllIIIllIIIl[2], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[50]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[51]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (-1 <= 3) return n2 != 0;
                    return ((114 + 78 - 72 + 10 ^ 31 + 71 - 95 + 139) & (62 + 80 - 85 + 79 ^ 70 + 3 - -3 + 76 ^ -1) & ((126 + 114 - 119 + 70 ^ 46 + 130 - 53 + 19) & (0x86 ^ 0x89 ^ (0x1C ^ 0x22) ^ -1) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_I_VI = new r(new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[29], lllIIIllIIIl[1], b.C), lllIIIllIIIl[2], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[48]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[49]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (((0xCD ^ 0x94 ^ (0x6C ^ 0x16)) & (124 + 58 - 117 + 110 ^ 11 + 34 - -52 + 43 ^ -1)) == 0) return n2 != 0;
                    return ((2 ^ 0x73 ^ (0x6B ^ 0x42)) & (16 + 38 - -82 + 21 ^ 168 + 185 - 207 + 51 ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_I_V = new r(new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), lllIIIllIIIl[2], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[42], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[42], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[46]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[47]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0x44 ^ 0x4F ^ (0xEE ^ 0xB6)) & (26 + 98 - -97 + 16 ^ 77 + 10 - -94 + 9 ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_I_VI = new r(new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[31], lllIIIllIIIl[1], b.C), lllIIIllIIIl[2], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[44]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[45]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (3 != -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_I_V = new r(new RegionPoint(lllIIIllIIIl[18], lllIIIllIIIl[26], lllIIIllIIIl[3], b.C), lllIIIllIIIl[6], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[42]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[43]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (-3 < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_I_VI = new r(new RegionPoint(lllIIIllIIIl[44], lllIIIllIIIl[16], lllIIIllIIIl[3], b.C), lllIIIllIIIl[2], lllIIIllIIIl[16], new RegionPoint(lllIIIllIIIl[45], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[45], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[40]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[41]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (((0x5F ^ 0x1C) & ~(0x7D ^ 0x3E)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_II_VI = new r(new RegionPoint(lllIIIllIIIl[55], lllIIIllIIIl[19], lllIIIllIIIl[3], b.I), lllIIIllIIIl[8], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[57], lllIIIllIIIl[32], lllIIIllIIIl[3], b.I), new RegionPoint(lllIIIllIIIl[59], lllIIIllIIIl[21], lllIIIllIIIl[3], b.I), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[38]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[39]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_II_VIII = new r(new RegionPoint(lllIIIllIIIl[61], lllIIIllIIIl[31], lllIIIllIIIl[1], b.I), lllIIIllIIIl[25], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[36]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[37]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if ((0xE7 ^ 0x86 ^ (0x33 ^ 0x56)) >= 0) return n2 != 0;
                    return ((0x12 ^ 0x52 ^ (0x23 ^ 0x7C)) & (2 ^ 5 ^ (0x31 ^ 0x29) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_II_IV = new r(new RegionPoint(lllIIIllIIIl[55], lllIIIllIIIl[3], lllIIIllIIIl[3], b.I), lllIIIllIIIl[33], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[15], lllIIIllIIIl[13], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[15], lllIIIllIIIl[13], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[34]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[35]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_II_VI = new r(new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[22], lllIIIllIIIl[1], b.G), lllIIIllIIIl[2], lllIIIllIIIl[3], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[23], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[23], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[32]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[33]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_II_VII = new r(new RegionPoint(lllIIIllIIIl[33], lllIIIllIIIl[2], lllIIIllIIIl[3], b.G), lllIIIllIIIl[13], lllIIIllIIIl[7], new RegionPoint(lllIIIllIIIl[40], lllIIIllIIIl[7], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[40], lllIIIllIIIl[7], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[30]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[31]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if ((132 + 49 - 122 + 77 ^ 39 + 68 - 51 + 84) == (0x9A ^ 0xA3 ^ (0x63 ^ 0x5E))) return n2 != 0;
                    return ((0x7C ^ 0x3C ^ (0x3A ^ 0x5B)) & (26 + 153 - 91 + 81 ^ 100 + 18 - 39 + 57 ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_II_XII = new r(new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[30], lllIIIllIIIl[1], b.G), lllIIIllIIIl[6], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[29]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_I = new r(new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[36], lllIIIllIIIl[3], b.G), lllIIIllIIIl[15], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[3], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[26]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[27]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0x86 ^ 0x81 ^ (0x72 ^ 0x78)) & (0x7C ^ 0x57 ^ (0x2F ^ 9) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_IV = new r(new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[51], lllIIIllIIIl[3], b.G), lllIIIllIIIl[15], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[3], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[24]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[25]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (((0x42 ^ 0) & ~(0x48 ^ 0xA)) >= -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_XI = new r(new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[41], lllIIIllIIIl[1], b.G), lllIIIllIIIl[2], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[22]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[23]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (-(0xB8 ^ 0xBC) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_III_VIII = new r(new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[2], lllIIIllIIIl[3], b.J), lllIIIllIIIl[8], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[4], lllIIIllIIIl[3], b.J), new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[4], lllIIIllIIIl[3], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[20]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[21]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (1 < 3) return n2 != 0;
                    return ((0xB3 ^ 0x87 ^ (0x63 ^ 0x5A)) & (0x4E ^ 0x14 ^ (0x1C ^ 0x4B) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_III_II = new r(new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[21], lllIIIllIIIl[1], b.J), lllIIIllIIIl[11], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[30], lllIIIllIIIl[1], b.J), new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[30], lllIIIllIIIl[1], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[18]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[19]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (((0x62 ^ 0x7D ^ (0x11 ^ 0x39)) & (0x8C ^ 0x98 ^ (0x8C ^ 0xAF) ^ -1)) == 0) return n2 != 0;
                    return ((0x99 ^ 0x92 ^ (0x18 ^ 0x37)) & (0x4D ^ 0x78 ^ (0xD4 ^ 0xC5) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_III_VI = new r(List.of(new Triple((Object)new RegionPoint(lllIIIllIIIl[4], lllIIIllIIIl[12], lllIIIllIIIl[3], b.J), (Object)lllIIIllIIIl[21], (Object)lllIIIllIIIl[2]), new Triple((Object)new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[2], lllIIIllIIIl[3], b.J), (Object)lllIIIllIIIl[8], (Object)lllIIIllIIIl[9])), new RegionPoint(lllIIIllIIIl[26], lllIIIllIIIl[5], lllIIIllIIIl[3], b.J), new RegionPoint(lllIIIllIIIl[26], lllIIIllIIIl[5], lllIIIllIIIl[3], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[16]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[17]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (-(74 + 103 - 46 + 56 ^ 186 + 37 - 196 + 164) < 0) return n2 != 0;
                    return ((0x6D ^ 0x14 ^ (0x94 ^ 0xB3)) & (0x4F ^ 0x1D ^ (0x6B ^ 0x67) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_IV_VII = new r(new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[2], lllIIIllIIIl[3], b.L), lllIIIllIIIl[25], lllIIIllIIIl[19], new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[18], lllIIIllIIIl[3], b.L), new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[18], lllIIIllIIIl[3], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[15]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if ((0xE ^ 0xB) != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_IV_X = new r(new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[35], lllIIIllIIIl[3], b.L), lllIIIllIIIl[9], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[37], lllIIIllIIIl[3], b.L), new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[37], lllIIIllIIIl[3], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[13]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (1 > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_IV_VI = new r(List.of(new Triple((Object)new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[5], lllIIIllIIIl[1], b.L), (Object)lllIIIllIIIl[2], (Object)lllIIIllIIIl[16]), new Triple((Object)new RegionPoint(lllIIIllIIIl[34], lllIIIllIIIl[17], lllIIIllIIIl[1], b.L), (Object)lllIIIllIIIl[8], (Object)lllIIIllIIIl[2])), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[20], lllIIIllIIIl[1], b.L), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[20], lllIIIllIIIl[1], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[11]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (3 >= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        TOP_V_VIII = new r(new RegionPoint(lllIIIllIIIl[2], lllIIIllIIIl[3], lllIIIllIIIl[3], b.N), lllIIIllIIIl[2], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[5], lllIIIllIIIl[4], lllIIIllIIIl[3], b.N), new RegionPoint(lllIIIllIIIl[5], lllIIIllIIIl[4], lllIIIllIIIl[3], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[9]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if ((152 + 102 - 198 + 122 ^ 54 + 73 - -45 + 10) == (34 + 145 - 164 + 150 ^ 159 + 20 - 26 + 8)) return n2 != 0;
                    return ((0x4A ^ 0x3C ^ (0x71 ^ 0x1F)) & (3 ^ (0x44 ^ 0x5F) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        MIDDLE_V_XVII = new r(new RegionPoint(lllIIIllIIIl[53], lllIIIllIIIl[8], lllIIIllIIIl[1], b.N), lllIIIllIIIl[14], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[60], lllIIIllIIIl[8], lllIIIllIIIl[1], b.N), new RegionPoint(lllIIIllIIIl[60], lllIIIllIIIl[8], lllIIIllIIIl[1], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[7]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        BOTTOM_V_IV = new r(new RegionPoint(lllIIIllIIIl[25], lllIIIllIIIl[41], lllIIIllIIIl[0], b.N), lllIIIllIIIl[19], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[0], b.N), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[0], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[5]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];
                    0;
                    if (-1 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        r[] rArray = new r[lllIIIllIIIl[24]];
        rArray[r.lllIIIllIIIl[0]] = WEST_I_V;
        rArray[r.lllIIIllIIIl[1]] = WEST_I_VI;
        rArray[r.lllIIIllIIIl[3]] = NORTH_I_V;
        rArray[r.lllIIIllIIIl[2]] = NORTH_I_VI;
        rArray[r.lllIIIllIIIl[4]] = SOUTH_I_V;
        rArray[r.lllIIIllIIIl[5]] = EAST_I_VI;
        rArray[r.lllIIIllIIIl[6]] = WEST_II_VI;
        rArray[r.lllIIIllIIIl[7]] = WEST_II_VIII;
        rArray[r.lllIIIllIIIl[8]] = SOUTH_II_IV;
        rArray[r.lllIIIllIIIl[9]] = SOUTH_II_VI;
        rArray[r.lllIIIllIIIl[10]] = EAST_II_VII;
        rArray[r.lllIIIllIIIl[11]] = EAST_II_XII;
        rArray[r.lllIIIllIIIl[12]] = NORTH_II_I;
        rArray[r.lllIIIllIIIl[13]] = NORTH_II_IV;
        rArray[r.lllIIIllIIIl[14]] = NORTH_II_XI;
        rArray[r.lllIIIllIIIl[15]] = EAST_III_VIII;
        rArray[r.lllIIIllIIIl[16]] = SOUTH_III_II;
        rArray[r.lllIIIllIIIl[17]] = WEST_III_VI;
        rArray[r.lllIIIllIIIl[18]] = SOUTH_IV_VII;
        rArray[r.lllIIIllIIIl[19]] = NORTH_IV_X;
        rArray[r.lllIIIllIIIl[20]] = SOUTH_IV_VI;
        rArray[r.lllIIIllIIIl[21]] = TOP_V_VIII;
        rArray[r.lllIIIllIIIl[22]] = MIDDLE_V_XVII;
        rArray[r.lllIIIllIIIl[23]] = BOTTOM_V_IV;
        $VALUES = rArray;
    }

    private static String lIIIlIIlIlIIlII(String var11, String var8) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lllIIIllIIIl[3], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var27;
        r var12;
        Player player = Players.getLocal();
        if (r.lIIIlIIlIlIllIl(player)) {
            return lllIIIllIIIl[0];
        }
        if (r.lIIIlIIlIlIlllI(var12.a((Locatable)var27) ? 1 : 0)) {
            return lllIIIllIIIl[0];
        }
        this.a(squireSepulchre);
        this.X();
        0;
        return lllIIIllIIIl[1];
    }

    private r(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, s s2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = s2;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static String lIIIlIIlIlIIllI(String var4, String var23) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lllIIIllIIIl[8]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lllIIIllIIIl[3], var13);
            return new String(var15.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private boolean X() {
        TileObject tileObject = this.object.get();
        if (r.lIIIlIIlIlIllIl(tileObject)) {
            return lllIIIllIIIl[0];
        }
        System.out.println(lllIIIllIIII[lllIIIllIIIl[0]]);
        String[] stringArray = new String[lllIIIllIIIl[2]];
        stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[1]];
        stringArray[r.lllIIIllIIIl[1]] = lllIIIllIIII[lllIIIllIIIl[3]];
        stringArray[r.lllIIIllIIIl[3]] = lllIIIllIIII[lllIIIllIIIl[2]];
        tileObject.interact(stringArray);
        return lllIIIllIIIl[1];
    }

    private static boolean lIIIlIIlIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIIlIlIIlll() {
        lllIIIllIIII = new String[lllIIIllIIIl[76]];
        r.lllIIIllIIII[r.lllIIIllIIIl[0]] = r."Traversing";
        r.lllIIIllIIII[r.lllIIIllIIIl[1]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[3]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[2]] = r."Squeeze-through";
        r.lllIIIllIIII[r.lllIIIllIIIl[4]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[5]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[6]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[7]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[8]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[9]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[10]] = r."Gate";
        r.lllIIIllIIII[r.lllIIIllIIIl[11]] = r."Squeeze-through";
        r.lllIIIllIIII[r.lllIIIllIIIl[12]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[13]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[14]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[15]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[16]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[17]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[18]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[19]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[20]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[21]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[22]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[23]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[24]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[25]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[26]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[27]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[28]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[29]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[30]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[31]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[32]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[33]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[34]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[35]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[36]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[37]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[38]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[39]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[40]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[41]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[42]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[43]] = r."Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[44]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[45]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[46]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[47]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[48]] = r."Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[49]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[50]] = r."Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[51]] = r."Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[52]] = r."WEST_I_V";
        r.lllIIIllIIII[r.lllIIIllIIIl[53]] = r."WEST_I_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[54]] = r."NORTH_I_V";
        r.lllIIIllIIII[r.lllIIIllIIIl[55]] = r."NORTH_I_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[56]] = r."SOUTH_I_V";
        r.lllIIIllIIII[r.lllIIIllIIIl[57]] = r."EAST_I_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[58]] = r."WEST_II_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[60]] = r."WEST_II_VIII";
        r.lllIIIllIIII[r.lllIIIllIIIl[62]] = r."SOUTH_II_IV";
        r.lllIIIllIIII[r.lllIIIllIIIl[59]] = r."SOUTH_II_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[63]] = r."EAST_II_VII";
        r.lllIIIllIIII[r.lllIIIllIIIl[61]] = r."EAST_II_XII";
        r.lllIIIllIIII[r.lllIIIllIIIl[64]] = r."NORTH_II_I";
        r.lllIIIllIIII[r.lllIIIllIIIl[65]] = r."NORTH_II_IV";
        r.lllIIIllIIII[r.lllIIIllIIIl[66]] = r."NORTH_II_XI";
        r.lllIIIllIIII[r.lllIIIllIIIl[67]] = r."EAST_III_VIII";
        r.lllIIIllIIII[r.lllIIIllIIIl[68]] = r."SOUTH_III_II";
        r.lllIIIllIIII[r.lllIIIllIIIl[69]] = r."WEST_III_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[70]] = r."SOUTH_IV_VII";
        r.lllIIIllIIII[r.lllIIIllIIIl[71]] = r."NORTH_IV_X";
        r.lllIIIllIIII[r.lllIIIllIIIl[72]] = r."SOUTH_IV_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[73]] = r."TOP_V_VIII";
        r.lllIIIllIIII[r.lllIIIllIIIl[74]] = r."MIDDLE_V_XVII";
        r.lllIIIllIIII[r.lllIIIllIIIl[75]] = r."BOTTOM_V_IV";
    }

    private static boolean lIIIlIIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var20 = this.startAreas.get().iterator();
        while (r.lIIIlIIlIlIllll(var20.hasNext() ? 1 : 0)) {
            void var9;
            WorldArea var17 = var20.next();
            if (r.lIIIlIIlIlIllll(var17.contains((Locatable)var9) ? 1 : 0)) {
                return lllIIIllIIIl[1];
            }
            0;
            if (-1 < 2) continue;
            return false;
        }
        return lllIIIllIIIl[0];
    }

    private static boolean lIIIlIIlIlIllll(int n2) {
        return n2 != 0;
    }
}

