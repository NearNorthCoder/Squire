/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.L;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
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

public final class K
extends Enum<K> {
    public static final /* synthetic */ /* enum */ K WEST_II_II;
    public static final /* synthetic */ /* enum */ K BOTTOM_V_III;
    public static final /* synthetic */ /* enum */ K SOUTH_II_I_EXTEND;
    public static final /* synthetic */ /* enum */ K NORTH_IV_IV;
    public static final /* synthetic */ /* enum */ K TOP_V_VII;
    public static final /* synthetic */ /* enum */ K SOUTH_IV_III;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ K WEST_III_IV;
    public static final /* synthetic */ /* enum */ K EAST_II_IV;
    public static final /* synthetic */ /* enum */ K MIDDLE_V_XVI;
    public static final /* synthetic */ /* enum */ K NORTH_II_V;
    private static /* synthetic */ int[] lllIIIIllIlI;
    public static final /* synthetic */ /* enum */ K EAST_III_III_EXTEND;
    /* synthetic */ Supplier<WorldPoint> destination;
    /* synthetic */ L type;
    private static final /* synthetic */ K[] $VALUES;
    public static final /* synthetic */ /* enum */ K MIDDLE_V_II;
    public static final /* synthetic */ /* enum */ K TOP_V_VI;
    public static final /* synthetic */ /* enum */ K MIDDLE_V_XIV;
    public static final /* synthetic */ /* enum */ K WEST_IV_III;
    public static final /* synthetic */ /* enum */ K SOUTH_IV_V;
    public static final /* synthetic */ /* enum */ K EAST_IV_V;
    public static final /* synthetic */ /* enum */ K WEST_IV_V;
    public static final /* synthetic */ /* enum */ K EAST_IV_IV;
    public static final /* synthetic */ /* enum */ K WEST_IV_VI;
    public static final /* synthetic */ /* enum */ K WEST_IV_II;
    public static final /* synthetic */ /* enum */ K NORTH_IV_I;
    public static final /* synthetic */ /* enum */ K SOUTH_II_II;
    public static final /* synthetic */ /* enum */ K MIDDLE_V_XII;
    public static final /* synthetic */ /* enum */ K WEST_IV_IV;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ /* enum */ K NORTH_IV_II;
    private static /* synthetic */ String[] lllIIIIlIIII;

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var2;
        K var26;
        Player player = Players.getLocal();
        if (K.lIIIlIIIlIllIIl(player)) {
            return lllIIIIllIlI[0];
        }
        if (K.lIIIlIIIlIllIlI(var26.a((Locatable)var2) ? 1 : 0)) {
            return lllIIIIllIlI[0];
        }
        System.out.println(lllIIIIlIIII[lllIIIIllIlI[0]]);
        this.a(squireSepulchre);
        Movement.setDestination((WorldPoint)this.destination.get());
        return lllIIIIllIlI[1];
    }

    private static String lIIIlIIIIllIllI(String var10, String var14) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var27 = lllIIIIllIlI[0];
        char[] var19 = var10.toCharArray();
        int var5 = var19.length;
        int var13 = lllIIIIllIlI[0];
        while (K.lIIIlIIIlIlllII(var13, var5)) {
            char var25 = var19[var13];
            var22.append((char)(var25 ^ var16[var27 % var16.length]));
            0;
            ++var27;
            ++var13;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static void lIIIlIIIlIllIII() {
        lllIIIIllIlI = new int[55];
        K.lllIIIIllIlI[0] = (0xFD ^ 0xA3) & ~(7 ^ 0x59);
        K.lllIIIIllIlI[1] = 1;
        K.lllIIIIllIlI[2] = 88 + 45 - 18 + 43 ^ 141 + 106 - 215 + 118;
        K.lllIIIIllIlI[3] = 163 + 136 - 188 + 108 ^ 77 + 113 - 138 + 147;
        K.lllIIIIllIlI[4] = 2;
        K.lllIIIIllIlI[5] = 0x5D ^ 0x57;
        K.lllIIIIllIlI[6] = 36 + 127 - 93 + 112 ^ 87 + 64 - 20 + 20;
        K.lllIIIIllIlI[7] = 86 + 114 - 137 + 119 ^ 1 + 40 - -58 + 39;
        K.lllIIIIllIlI[8] = 0x6B ^ 0xB ^ (0x3B ^ 0x61);
        K.lllIIIIllIlI[9] = 4 + 134 - 12 + 13 ^ 79 + 121 - 146 + 81;
        K.lllIIIIllIlI[10] = 3;
        K.lllIIIIllIlI[11] = 0xC ^ 0x54 ^ (0x30 ^ 0x55);
        K.lllIIIIllIlI[12] = 0x61 ^ 0x58;
        K.lllIIIIllIlI[13] = 0xAA ^ 0xBB;
        K.lllIIIIllIlI[14] = 101 + 68 - 168 + 145 ^ 146 + 99 - 151 + 54;
        K.lllIIIIllIlI[15] = 173 + 188 - 354 + 207 ^ 58 + 74 - 113 + 179;
        K.lllIIIIllIlI[16] = 0x74 ^ 0x7F;
        K.lllIIIIllIlI[17] = 0x31 ^ 0x3E;
        K.lllIIIIllIlI[18] = 0x88 ^ 0x95 ^ (0x80 ^ 0x99);
        K.lllIIIIllIlI[19] = 0xE8 ^ 0xB4 ^ (0xDB ^ 0xB4);
        K.lllIIIIllIlI[20] = 53 + 124 - 96 + 70 ^ 54 + 17 - -6 + 64;
        K.lllIIIIllIlI[21] = 111 + 122 - 96 + 14 ^ 31 + 70 - -6 + 21;
        K.lllIIIIllIlI[22] = 0x6F ^ 0x60 ^ (0x4C ^ 0x46);
        K.lllIIIIllIlI[23] = 0x3B ^ 9;
        K.lllIIIIllIlI[24] = 0x89 ^ 0xBC;
        K.lllIIIIllIlI[25] = 0x2C ^ 0x50 ^ (5 ^ 0x48);
        K.lllIIIIllIlI[26] = 0xA0 ^ 0x8E;
        K.lllIIIIllIlI[27] = 0xB6 ^ 0x94 ^ (0x63 ^ 0x76);
        K.lllIIIIllIlI[28] = 0x5C ^ 0x2C ^ (0xF1 ^ 0x95);
        K.lllIIIIllIlI[29] = 0x68 ^ 0x53;
        K.lllIIIIllIlI[30] = 70 + 97 - -12 + 5 ^ 144 + 49 - 169 + 123;
        K.lllIIIIllIlI[31] = 0x1E ^ 0x5D ^ (0x4C ^ 8);
        K.lllIIIIllIlI[32] = 0xD ^ 0x6F ^ (0x2B ^ 0x64);
        K.lllIIIIllIlI[33] = 8 + 93 - -31 + 53 ^ 42 + 125 - 118 + 98;
        K.lllIIIIllIlI[34] = 0xBE ^ 0xA6;
        K.lllIIIIllIlI[35] = 0x4D ^ 0x69;
        K.lllIIIIllIlI[36] = 0x17 ^ 0x71 ^ (7 ^ 0x6F);
        K.lllIIIIllIlI[37] = 0x83 ^ 0xAA;
        K.lllIIIIllIlI[38] = 0x57 ^ 0x5E;
        K.lllIIIIllIlI[39] = 0x3B ^ 0x19;
        K.lllIIIIllIlI[40] = 0x42 ^ 0x3B ^ (0x7B ^ 0xF);
        K.lllIIIIllIlI[41] = 0x16 ^ 4 ^ (0x69 ^ 0x44);
        K.lllIIIIllIlI[42] = 0x8B ^ 0xA3;
        K.lllIIIIllIlI[43] = 37 + 166 - 31 + 17 ^ 67 + 164 - 81 + 18;
        K.lllIIIIllIlI[44] = 0x31 ^ 0x11;
        K.lllIIIIllIlI[45] = 0xA1 ^ 0xB3;
        K.lllIIIIllIlI[46] = 0x47 ^ 0x64 ^ (0x39 ^ 0xC);
        K.lllIIIIllIlI[47] = 0x8A ^ 0x99;
        K.lllIIIIllIlI[48] = 1 ^ 0x2E;
        K.lllIIIIllIlI[49] = 0x8A ^ 0xAF;
        K.lllIIIIllIlI[50] = 0x16 ^ 0x35;
        K.lllIIIIllIlI[51] = 0x79 ^ 0x60;
        K.lllIIIIllIlI[52] = 23 + 64 - 58 + 101 ^ 23 + 151 - 159 + 171;
        K.lllIIIIllIlI[53] = 100 + 7 - -12 + 39 ^ 177 + 132 - 161 + 37;
        K.lllIIIIllIlI[54] = 37 + 105 - 88 + 86 ^ 149 + 134 - 162 + 30;
    }

    private static void lIIIlIIIlIlIlll() {
        lllIIIIlIIII = new String[lllIIIIllIlI[54]];
        K.lllIIIIlIIII[K.lllIIIIllIlI[0]] = K."in here!";
        K.lllIIIIlIIII[K.lllIIIIllIlI[1]] = K."WEST_II_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[4]] = K."SOUTH_II_I_EXTEND";
        K.lllIIIIlIIII[K.lllIIIIllIlI[10]] = K."SOUTH_II_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[18]] = K."EAST_II_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[22]] = K."NORTH_II_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[14]] = K."EAST_III_III_EXTEND";
        K.lllIIIIlIIII[K.lllIIIIllIlI[31]] = K."WEST_III_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[2]] = K."NORTH_IV_I";
        K.lllIIIIlIIII[K.lllIIIIllIlI[38]] = K."NORTH_IV_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[5]] = K."SOUTH_IV_III";
        K.lllIIIIlIIII[K.lllIIIIllIlI[16]] = K."SOUTH_IV_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[9]] = K."NORTH_IV_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[40]] = K."EAST_IV_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[36]] = K."EAST_IV_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[17]] = K."WEST_IV_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[15]] = K."WEST_IV_III";
        K.lllIIIIlIIII[K.lllIIIIllIlI[13]] = K."WEST_IV_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[45]] = K."WEST_IV_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[47]] = K."WEST_IV_VI";
        K.lllIIIIlIIII[K.lllIIIIllIlI[28]] = K."TOP_V_VI";
        K.lllIIIIlIIII[K.lllIIIIllIlI[43]] = K."TOP_V_VII";
        K.lllIIIIlIIII[K.lllIIIIllIlI[46]] = K."MIDDLE_V_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[21]] = K."MIDDLE_V_XII";
        K.lllIIIIlIIII[K.lllIIIIllIlI[34]] = K."MIDDLE_V_XIV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[51]] = K."MIDDLE_V_XVI";
        K.lllIIIIlIIII[K.lllIIIIllIlI[20]] = K."BOTTOM_V_III";
    }

    static {
        K.lIIIlIIIlIllIII();
        K.lIIIlIIIlIlIlll();
        WEST_II_II = new K(List.of(new Triple((Object)new RegionPoint(lllIIIIllIlI[2], lllIIIIllIlI[3], lllIIIIllIlI[4], b.G), (Object)lllIIIIllIlI[5], (Object)lllIIIIllIlI[6]), new Triple((Object)new RegionPoint(lllIIIIllIlI[7], lllIIIIllIlI[8], lllIIIIllIlI[4], b.I), (Object)lllIIIIllIlI[9], (Object)lllIIIIllIlI[10])), new RegionPoint(lllIIIIllIlI[11], lllIIIIllIlI[12], lllIIIIllIlI[4], b.I), new RegionPoint(lllIIIIllIlI[11], lllIIIIllIlI[12], lllIIIIllIlI[4], b.I), L.WALK);
        SOUTH_II_I_EXTEND = new K(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[13], lllIIIIllIlI[4], b.G), lllIIIIllIlI[4], lllIIIIllIlI[4], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[13], lllIIIIllIlI[4], b.G), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[13], lllIIIIllIlI[4], b.G), L.WALK);
        SOUTH_II_II = new K(new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[15], lllIIIIllIlI[4], b.G), lllIIIIllIlI[16], lllIIIIllIlI[14], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.G), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.G), L.WALK);
        EAST_II_IV = new K(new RegionPoint(lllIIIIllIlI[19], lllIIIIllIlI[20], lllIIIIllIlI[4], b.G), lllIIIIllIlI[15], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[21], lllIIIIllIlI[4], b.G), new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[21], lllIIIIllIlI[4], b.G), L.WALK);
        NORTH_II_V = new K(new RegionPoint(lllIIIIllIlI[23], lllIIIIllIlI[24], lllIIIIllIlI[1], b.G), lllIIIIllIlI[14], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[11], lllIIIIllIlI[1], b.G), new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[11], lllIIIIllIlI[1], b.G), L.WALK);
        EAST_III_III_EXTEND = new K(new RegionPoint(lllIIIIllIlI[26], lllIIIIllIlI[27], lllIIIIllIlI[4], b.J), lllIIIIllIlI[28], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[30], lllIIIIllIlI[4], b.J), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[30], lllIIIIllIlI[4], b.J), L.WALK);
        WEST_III_IV = new K(new RegionPoint(lllIIIIllIlI[1], lllIIIIllIlI[32], lllIIIIllIlI[4], b.J), lllIIIIllIlI[10], lllIIIIllIlI[17], new RegionPoint(lllIIIIllIlI[18], lllIIIIllIlI[33], lllIIIIllIlI[4], b.J), new RegionPoint(lllIIIIllIlI[18], lllIIIIllIlI[33], lllIIIIllIlI[4], b.J), L.WALK);
        NORTH_IV_I = new K(new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[35], lllIIIIllIlI[4], b.L), lllIIIIllIlI[36], lllIIIIllIlI[31], new RegionPoint(lllIIIIllIlI[21], lllIIIIllIlI[37], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[21], lllIIIIllIlI[37], lllIIIIllIlI[4], b.L), L.WALK);
        NORTH_IV_II = new K(new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[39], lllIIIIllIlI[4], b.L), lllIIIIllIlI[40], lllIIIIllIlI[38], new RegionPoint(lllIIIIllIlI[5], lllIIIIllIlI[33], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[5], lllIIIIllIlI[33], lllIIIIllIlI[4], b.L), L.WALK);
        SOUTH_IV_III = new K(new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[15], lllIIIIllIlI[4], b.L), lllIIIIllIlI[36], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.L), L.WALK);
        SOUTH_IV_V = new K(new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[12], lllIIIIllIlI[4], b.M), lllIIIIllIlI[16], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[41], lllIIIIllIlI[4], b.M), new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[41], lllIIIIllIlI[4], b.M), L.WALK);
        NORTH_IV_IV = new K(new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[42], lllIIIIllIlI[4], b.L), lllIIIIllIlI[10], lllIIIIllIlI[43], new RegionPoint(lllIIIIllIlI[9], lllIIIIllIlI[7], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[9], lllIIIIllIlI[7], lllIIIIllIlI[4], b.L), L.WALK);
        EAST_IV_IV = new K(new RegionPoint(lllIIIIllIlI[23], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[14], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), L.WALK);
        EAST_IV_V = new K(new RegionPoint(lllIIIIllIlI[39], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[15], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[28], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[28], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_II = new K(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[13], lllIIIIllIlI[1], b.L), lllIIIIllIlI[10], lllIIIIllIlI[22], new RegionPoint(lllIIIIllIlI[45], lllIIIIllIlI[46], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[45], lllIIIIllIlI[46], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_III = new K(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[46], lllIIIIllIlI[1], b.L), lllIIIIllIlI[10], lllIIIIllIlI[18], new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_IV = new K(List.of(new Triple((Object)new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], b.L), (Object)lllIIIIllIlI[10], (Object)lllIIIIllIlI[34]), new Triple((Object)new RegionPoint(lllIIIIllIlI[2], lllIIIIllIlI[30], lllIIIIllIlI[1], b.L), (Object)lllIIIIllIlI[38], (Object)lllIIIIllIlI[10])), new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[44], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[44], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_V = new K(new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[18], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_VI = new K(new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[15], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[9], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[9], lllIIIIllIlI[1], b.L), L.WALK);
        TOP_V_VI = new K(new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[42], lllIIIIllIlI[4], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[39], lllIIIIllIlI[4], b.N), new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[39], lllIIIIllIlI[4], b.N), L.WALK);
        TOP_V_VII = new K(new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[15], lllIIIIllIlI[4], b.N), lllIIIIllIlI[38], lllIIIIllIlI[15], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[18], lllIIIIllIlI[4], b.N), new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[18], lllIIIIllIlI[4], b.N), L.WALK);
        MIDDLE_V_II = new K(new RegionPoint(lllIIIIllIlI[0], lllIIIIllIlI[39], lllIIIIllIlI[1], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[24], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[24], lllIIIIllIlI[1], b.N), L.WALK);
        MIDDLE_V_XII = new K(new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[25], lllIIIIllIlI[1], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[48], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[48], lllIIIIllIlI[1], b.N), L.WALK);
        MIDDLE_V_XIV = new K(new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[49], lllIIIIllIlI[1], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[50], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[50], lllIIIIllIlI[1], b.N), L.WALK);
        MIDDLE_V_XVI = new K(new RegionPoint(lllIIIIllIlI[52], lllIIIIllIlI[15], lllIIIIllIlI[1], b.N), lllIIIIllIlI[14], lllIIIIllIlI[13], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[2], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[2], lllIIIIllIlI[1], b.N), L.WALK);
        BOTTOM_V_III = new K(new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[53], lllIIIIllIlI[0], b.N), lllIIIIllIlI[46], lllIIIIllIlI[9], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[37], lllIIIIllIlI[0], b.N), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[37], lllIIIIllIlI[0], b.N), L.WALK);
        K[] kArray = new K[lllIIIIllIlI[20]];
        kArray[K.lllIIIIllIlI[0]] = WEST_II_II;
        kArray[K.lllIIIIllIlI[1]] = SOUTH_II_I_EXTEND;
        kArray[K.lllIIIIllIlI[4]] = SOUTH_II_II;
        kArray[K.lllIIIIllIlI[10]] = EAST_II_IV;
        kArray[K.lllIIIIllIlI[18]] = NORTH_II_V;
        kArray[K.lllIIIIllIlI[22]] = EAST_III_III_EXTEND;
        kArray[K.lllIIIIllIlI[14]] = WEST_III_IV;
        kArray[K.lllIIIIllIlI[31]] = NORTH_IV_I;
        kArray[K.lllIIIIllIlI[2]] = NORTH_IV_II;
        kArray[K.lllIIIIllIlI[38]] = SOUTH_IV_III;
        kArray[K.lllIIIIllIlI[5]] = SOUTH_IV_V;
        kArray[K.lllIIIIllIlI[16]] = NORTH_IV_IV;
        kArray[K.lllIIIIllIlI[9]] = EAST_IV_IV;
        kArray[K.lllIIIIllIlI[40]] = EAST_IV_V;
        kArray[K.lllIIIIllIlI[36]] = WEST_IV_II;
        kArray[K.lllIIIIllIlI[17]] = WEST_IV_III;
        kArray[K.lllIIIIllIlI[15]] = WEST_IV_IV;
        kArray[K.lllIIIIllIlI[13]] = WEST_IV_V;
        kArray[K.lllIIIIllIlI[45]] = WEST_IV_VI;
        kArray[K.lllIIIIllIlI[47]] = TOP_V_VI;
        kArray[K.lllIIIIllIlI[28]] = TOP_V_VII;
        kArray[K.lllIIIIllIlI[43]] = MIDDLE_V_II;
        kArray[K.lllIIIIllIlI[46]] = MIDDLE_V_XII;
        kArray[K.lllIIIIllIlI[21]] = MIDDLE_V_XIV;
        kArray[K.lllIIIIllIlI[34]] = MIDDLE_V_XVI;
        kArray[K.lllIIIIllIlI[51]] = BOTTOM_V_III;
        $VALUES = kArray;
    }

    private static boolean lIIIlIIIlIllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var9 = this.startAreas.get().iterator();
        while (K.lIIIlIIIlIllIll(var9.hasNext() ? 1 : 0)) {
            void var24;
            WorldArea var7 = var9.next();
            if (K.lIIIlIIIlIllIll(var7.contains((Locatable)var24) ? 1 : 0)) {
                return lllIIIIllIlI[1];
            }
            0;
            
            return ((93 + 102 - 135 + 133 ^ 83 + 38 - -26 + 10) & (0x50 ^ 0x42 ^ (0xCF ^ 0x81) ^ -1)) != 0;
        }
        return lllIIIIllIlI[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private K(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, L l2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.type = l2;
    }

    private static String lIIIlIIIIllIlll(String var8, String var23) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lllIIIIllIlI[2]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lllIIIIllIlI[4], var17);
            return new String(var18.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIIlIIIIlllIII(String var11, String var21) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lllIIIIllIlI[4], var12);
            return new String(var3.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlIllIll(int n2) {
        return n2 != 0;
    }

    private K(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, L l2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var4 = list.iterator();
            while (K.lIIIlIIIlIllIll(var4.hasNext() ? 1 : 0)) {
                void var20;
                Triple var1 = (Triple)var4.next();
                var20.add(new WorldArea(SquireSepulchre.a((RegionPoint)var1.getFirst()), ((Integer)var1.getSecond()).intValue(), ((Integer)var1.getThird()).intValue()));
                0;
                0;
                if (3 == 3) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = l2;
    }

    public static K valueOf(String string) {
        return Enum.valueOf(K.class, string);
    }

    public static K[] values() {
        return (K[])$VALUES.clone();
    }
}

