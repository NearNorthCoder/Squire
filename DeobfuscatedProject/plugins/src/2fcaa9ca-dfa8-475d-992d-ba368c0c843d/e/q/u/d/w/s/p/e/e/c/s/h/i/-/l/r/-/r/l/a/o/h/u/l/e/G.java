/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Client
 *  net.runelite.api.Deque
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.H;
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
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

public final class G
extends Enum<G> {
    public static final /* synthetic */ /* enum */ G NORTH_II_VII;
    public static final /* synthetic */ /* enum */ G TOP_V_V;
    private static /* synthetic */ int[] lllIIIlIIllI;
    private static /* synthetic */ String[] lllIIIlIIlIl;
    public static final /* synthetic */ /* enum */ G NORTH_II_V;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ G MIDDLE_V_XIII;
    public static final /* synthetic */ /* enum */ G NORTH_II_VI;
    /* synthetic */ H type;
    public static final /* synthetic */ /* enum */ G TOP_V_VII;
    public static final /* synthetic */ /* enum */ G MIDDLE_V_XV;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ /* enum */ G EAST_IV_II;
    public static final /* synthetic */ /* enum */ G WEST_II_III;
    private static final /* synthetic */ G[] $VALUES;
    /* synthetic */ Supplier<WorldPoint> destination;
    public static final /* synthetic */ /* enum */ G EAST_II_VI;

    private static boolean lIIIlIIlIIIlIII(Object object) {
        return object == null;
    }

    private G(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, H h2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator lllllllllllllllIIllIllllIlIllIII = list.iterator();
            while (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIlIllIII.hasNext() ? 1 : 0)) {
                void lllllllllllllllIIllIllllIlIllIIl;
                Triple lllllllllllllllIIllIllllIlIlIlll = (Triple)lllllllllllllllIIllIllllIlIllIII.next();
                lllllllllllllllIIllIllllIlIllIIl.add(new WorldArea(SquireSepulchre.a((RegionPoint)lllllllllllllllIIllIllllIlIlIlll.getFirst()), ((Integer)lllllllllllllllIIllIllllIlIlIlll.getSecond()).intValue(), ((Integer)lllllllllllllllIIllIllllIlIlIlll.getThird()).intValue()));
                "".length();
                "".length();
                if (-" ".length() <= "  ".length()) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = h2;
    }

    private static String lIIIlIIlIIIIlIl(String lllllllllllllllIIllIllllIlIIllIl, String lllllllllllllllIIllIllllIlIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllllIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIlIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIIlIIllI[25]), "DES");
            Cipher lllllllllllllllIIllIllllIlIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIllllIlIlIIIl.init(lllIIIlIIllI[4], lllllllllllllllIIllIllllIlIlIIlI);
            return new String(lllllllllllllllIIllIllllIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllllIlIlIIII) {
            lllllllllllllllIIllIllllIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIlIIIIllI() {
        lllIIIlIIlIl = new String[lllIIIlIIllI[31]];
        G.lllIIIlIIlIl[G.lllIIIlIIllI[0]] = G.lIIIlIIlIIIIIll("Kg9FORAxBEQ=", "CaeQu");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[1]] = G.lIIIlIIlIIIIlII("sf5n3X005K1E5xZZjVzl+A==", "KNBUz");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[4]] = G.lIIIlIIlIIIIIll("DjcVAggCPxkAHg==", "KvFVW");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[5]] = G.lIIIlIIlIIIIIll("LysbLgc+LQAlGQ==", "adIzO");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[9]] = G.lIIIlIIlIIIIlIl("9Ccs0NNYkzUBj9BPC1SNaA==", "mTUsB");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[11]] = G.lIIIlIIlIIIIlII("mrkUyUQjly/yU6SqKycyhA==", "dNsbB");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[17]] = G.lIIIlIIlIIIIlIl("IwBG7UlZCI3kQ7el+G7smA==", "bBGNC");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[21]] = G.lIIIlIIlIIIIlII("xer5EFQeNLI=", "vZLBZ");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[25]] = G.lIIIlIIlIIIIIll("Ax0BGBoIBBgO", "WRQGL");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[23]] = G.lIIIlIIlIIIIlII("cuRCbwZ9awZkhwKx2OHlhg==", "bRWsE");
        G.lllIIIlIIlIl[G.lllIIIlIIllI[29]] = G.lIIIlIIlIIIIlII("Y9GeQZOYqc/RmnACb3qGCg==", "lTKVV");
    }

    private static String lIIIlIIlIIIIIll(String lllllllllllllllIIllIllllIIllllll, String lllllllllllllllIIllIllllIIlllllI) {
        lllllllllllllllIIllIllllIIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllllIIllllIl = new StringBuilder();
        char[] lllllllllllllllIIllIllllIIllllII = lllllllllllllllIIllIllllIIlllllI.toCharArray();
        int lllllllllllllllIIllIllllIIlllIll = lllIIIlIIllI[0];
        char[] lllllllllllllllIIllIllllIIllIlIl = lllllllllllllllIIllIllllIIllllll.toCharArray();
        int lllllllllllllllIIllIllllIIllIlII = lllllllllllllllIIllIllllIIllIlIl.length;
        int lllllllllllllllIIllIllllIIllIIll = lllIIIlIIllI[0];
        while (G.lIIIlIIlIIIllII(lllllllllllllllIIllIllllIIllIIll, lllllllllllllllIIllIllllIIllIlII)) {
            char lllllllllllllllIIllIllllIlIIIIII = lllllllllllllllIIllIllllIIllIlIl[lllllllllllllllIIllIllllIIllIIll];
            lllllllllllllllIIllIllllIIllllIl.append((char)(lllllllllllllllIIllIllllIlIIIIII ^ lllllllllllllllIIllIllllIIllllII[lllllllllllllllIIllIllllIIlllIll % lllllllllllllllIIllIllllIIllllII.length]));
            "".length();
            ++lllllllllllllllIIllIllllIIlllIll;
            ++lllllllllllllllIIllIllllIIllIIll;
            "".length();
            if ((0xB ^ 0xF) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllllIIllllIl);
    }

    private static void lIIIlIIlIIIIlll() {
        lllIIIlIIllI = new int[32];
        G.lllIIIlIIllI[0] = (2 ^ 0x26 ^ (0x5E ^ 0x7F)) & (0x6F ^ 0x16 ^ (0xF0 ^ 0x8C) ^ -" ".length());
        G.lllIIIlIIllI[1] = " ".length();
        G.lllIIIlIIllI[2] = 9 ^ 0x35;
        G.lllIIIlIIllI[3] = 0xFC ^ 0xC2 ^ (0x37 ^ 0x27);
        G.lllIIIlIIllI[4] = "  ".length();
        G.lllIIIlIIllI[5] = "   ".length();
        G.lllIIIlIIllI[6] = 0x74 ^ 0x78;
        G.lllIIIlIIllI[7] = 97 + 21 - -14 + 10 ^ 43 + 151 - 115 + 104;
        G.lllIIIlIIllI[8] = 0xD2 ^ 0x90 ^ (0xA ^ 0x6C);
        G.lllIIIlIIllI[9] = 0x5D ^ 0x46 ^ (0x58 ^ 0x47);
        G.lllIIIlIIllI[10] = 132 + 149 - 139 + 17 ^ 40 + 162 - 86 + 62;
        G.lllIIIlIIllI[11] = 0xA3 ^ 0x8D ^ (0x99 ^ 0xB2);
        G.lllIIIlIIllI[12] = 0x70 ^ 0x5C;
        G.lllIIIlIIllI[13] = 155 + 12 - 99 + 99 ^ 5 + 87 - -53 + 9;
        G.lllIIIlIIllI[14] = 0xA7 ^ 0x8F;
        G.lllIIIlIIllI[15] = 0x3E ^ 0x19;
        G.lllIIIlIIllI[16] = 90 + 22 - 7 + 83 ^ 92 + 17 - 95 + 145;
        G.lllIIIlIIllI[17] = 0x9C ^ 0x9A;
        G.lllIIIlIIllI[18] = 0x56 ^ 0x2F ^ (0x66 ^ 0x27);
        G.lllIIIlIIllI[19] = 195 + 136 - 309 + 189 ^ 172 + 95 - 102 + 34;
        G.lllIIIlIIllI[20] = 0x71 ^ 0x66;
        G.lllIIIlIIllI[21] = 0x71 ^ 0x5F ^ (0 ^ 0x29);
        G.lllIIIlIIllI[22] = 0xE ^ 0x3E;
        G.lllIIIlIIllI[23] = 0xF ^ 6;
        G.lllIIIlIIllI[24] = 0xE1 ^ 0x8F ^ (0x40 ^ 4);
        G.lllIIIlIIllI[25] = 0x5E ^ 0x56;
        G.lllIIIlIIllI[26] = 0xA3 ^ 0x83;
        G.lllIIIlIIllI[27] = 0x8A ^ 0x85;
        G.lllIIIlIIllI[28] = 0x93 ^ 0xB7 ^ (0xB6 ^ 0xA9);
        G.lllIIIlIIllI[29] = 0x54 ^ 0x5E;
        G.lllIIIlIIllI[30] = 0x8E ^ 0xC0 ^ (0x37 ^ 0x58);
        G.lllIIIlIIllI[31] = 96 + 83 - 136 + 99 ^ 95 + 19 - 111 + 130;
    }

    private G(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, H h2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.type = h2;
    }

    private static boolean lIIIlIIlIIIlIIl(int n2) {
        return n2 == 0;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(WorldPoint worldPoint) {
        Iterator<WorldArea> lllllllllllllllIIllIllllIllIIIII = this.startAreas.get().iterator();
        while (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIllIIIII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIllllIllIIIIl;
            WorldArea lllllllllllllllIIllIllllIlIlllll = lllllllllllllllIIllIllllIllIIIII.next();
            if (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIlIlllll.contains((WorldPoint)lllllllllllllllIIllIllllIllIIIIl) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }
            "".length();
            if (null == null) continue;
            return ((28 + 123 - 59 + 68 ^ 149 + 134 - 187 + 63) & (0x41 ^ 0x16 ^ (0x27 ^ 0x4F) ^ -" ".length())) != 0;
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIIIlIIlIIIIlII(String lllllllllllllllIIllIllllIIlIlIII, String lllllllllllllllIIllIllllIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllllIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllllIIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllllIIlIllII.init(lllIIIlIIllI[4], lllllllllllllllIIllIllllIIlIllIl);
            return new String(lllllllllllllllIIllIllllIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllllIIlIlIll) {
            lllllllllllllllIIllIllllIIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        G.lIIIlIIlIIIIlll();
        G.lIIIlIIlIIIIllI();
        WEST_II_III = new G(new RegionPoint(lllIIIlIIllI[2], lllIIIlIIllI[3], lllIIIlIIllI[4], b.I), lllIIIlIIllI[5], lllIIIlIIllI[6], new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[8], lllIIIlIIllI[4], b.I), new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[8], lllIIIlIIllI[4], b.I), H.STRANGE_TILES);
        EAST_II_VI = new G(new RegionPoint(lllIIIlIIllI[3], lllIIIlIIllI[5], lllIIIlIIllI[4], b.G), lllIIIlIIllI[6], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[9], lllIIIlIIllI[4], b.G), new RegionPoint(lllIIIlIIllI[10], lllIIIlIIllI[9], lllIIIlIIllI[4], b.G), H.STRANGE_TILES);
        NORTH_II_V = new G(new RegionPoint(lllIIIlIIllI[10], lllIIIlIIllI[2], lllIIIlIIllI[1], b.G), lllIIIlIIllI[11], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[12], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), new RegionPoint(lllIIIlIIllI[12], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), H.STRANGE_TILES);
        NORTH_II_VI = new G(new RegionPoint(lllIIIlIIllI[14], lllIIIlIIllI[2], lllIIIlIIllI[1], b.G), lllIIIlIIllI[11], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[15], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), new RegionPoint(lllIIIlIIllI[15], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), H.STRANGE_TILES);
        NORTH_II_VII = new G(new RegionPoint(lllIIIlIIllI[8], lllIIIlIIllI[2], lllIIIlIIllI[1], b.G), lllIIIlIIllI[9], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[16], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), new RegionPoint(lllIIIlIIllI[16], lllIIIlIIllI[13], lllIIIlIIllI[1], b.G), H.STRANGE_TILES);
        EAST_IV_II = new G(new RegionPoint(lllIIIlIIllI[18], lllIIIlIIllI[19], lllIIIlIIllI[1], b.L), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[19], lllIIIlIIllI[20], lllIIIlIIllI[1], b.L), new RegionPoint(lllIIIlIIllI[19], lllIIIlIIllI[20], lllIIIlIIllI[1], b.L), H.DART_STRANGE_TILES);
        TOP_V_V = new G(new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[22], lllIIIlIIllI[4], b.N), lllIIIlIIllI[5], lllIIIlIIllI[23], new RegionPoint(lllIIIlIIllI[11], lllIIIlIIllI[24], lllIIIlIIllI[4], b.N), new RegionPoint(lllIIIlIIllI[11], lllIIIlIIllI[24], lllIIIlIIllI[4], b.N), H.BLADE_STRANGE_TILES);
        TOP_V_VII = new G(new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[26], lllIIIlIIllI[4], b.N), lllIIIlIIllI[5], lllIIIlIIllI[25], new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[27], lllIIIlIIllI[4], b.N), new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[27], lllIIIlIIllI[4], b.N), H.BLADE_STRANGE_TILES);
        MIDDLE_V_XIII = new G(new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], b.N), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], b.N), new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], b.N), H.BLADE_STRANGE_TILES);
        MIDDLE_V_XV = new G(new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], b.N), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], b.N), new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], b.N), H.BLADE_STRANGE_TILES);
        G[] gArray = new G[lllIIIlIIllI[29]];
        gArray[G.lllIIIlIIllI[0]] = WEST_II_III;
        gArray[G.lllIIIlIIllI[1]] = EAST_II_VI;
        gArray[G.lllIIIlIIllI[4]] = NORTH_II_V;
        gArray[G.lllIIIlIIllI[5]] = NORTH_II_VI;
        gArray[G.lllIIIlIIllI[9]] = NORTH_II_VII;
        gArray[G.lllIIIlIIllI[11]] = EAST_IV_II;
        gArray[G.lllIIIlIIllI[17]] = TOP_V_V;
        gArray[G.lllIIIlIIllI[21]] = TOP_V_VII;
        gArray[G.lllIIIlIIllI[25]] = MIDDLE_V_XIII;
        gArray[G.lllIIIlIIllI[23]] = MIDDLE_V_XV;
        $VALUES = gArray;
    }

    public static G valueOf(String string) {
        return Enum.valueOf(G.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void lllllllllllllllIIllIllllIlllIIll;
        void lllllllllllllllIIllIllllIlllIIlI;
        G lllllllllllllllIIllIllllIlllIlII;
        Player player = Players.getLocal();
        if (G.lIIIlIIlIIIlIII(player)) {
            return lllIIIlIIllI[0];
        }
        if (G.lIIIlIIlIIIlIIl(lllllllllllllllIIllIllllIlllIlII.a((Locatable)lllllllllllllllIIllIllllIlllIIlI) ? 1 : 0)) {
            return lllIIIlIIllI[0];
        }
        System.out.println(lllIIIlIIlIl[lllIIIlIIllI[0]]);
        lllllllllllllllIIllIllllIlllIlII.a((SquireSepulchre)lllllllllllllllIIllIllllIlllIIll);
        if (G.lIIIlIIlIIIlIlI((Object)lllllllllllllllIIllIllllIlllIlII.type, (Object)H.DART_STRANGE_TILES)) {
            Deque lllllllllllllllIIllIllllIlllIIIl = Static.getClient().getGraphicsObjects();
            Iterator lllllllllllllllIIllIllllIlllIIII = lllllllllllllllIIllIllllIlllIIIl.iterator();
            while (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIlllIIII.hasNext() ? 1 : 0)) {
                GraphicsObject lllllllllllllllIIllIllllIllIllll = (GraphicsObject)lllllllllllllllIIllIllllIlllIIII.next();
                if (G.lIIIlIIlIIIlIll(b.A.contains(lllllllllllllllIIllIllllIllIllll.getId()) ? 1 : 0) && G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIlllIlII.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)lllllllllllllllIIllIllllIllIllll.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)lllllllllllllllIIllIllllIllIllll.getLocation()));
                    return lllIIIlIIllI[1];
                }
                "".length();
                if (-"  ".length() <= 0) continue;
                return ((0x88 ^ 0xB0 ^ (0x38 ^ 0x34)) & (0x59 ^ 9 ^ (0x46 ^ 0x22) ^ -" ".length())) != 0;
            }
            return lllIIIlIIllI[0];
        }
        if (G.lIIIlIIlIIIlIlI((Object)lllllllllllllllIIllIllllIlllIlII.type, (Object)H.BLADE_STRANGE_TILES)) {
            Deque lllllllllllllllIIllIllllIlllIIIl = Static.getClient().getGraphicsObjects();
            Iterator lllllllllllllllIIllIllllIlllIIII = lllllllllllllllIIllIllllIlllIIIl.iterator();
            while (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIlllIIII.hasNext() ? 1 : 0)) {
                GraphicsObject lllllllllllllllIIllIllllIllIllll = (GraphicsObject)lllllllllllllllIIllIllllIlllIIII.next();
                if (G.lIIIlIIlIIIlIll(b.A.contains(lllllllllllllllIIllIllllIllIllll.getId()) ? 1 : 0) && G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIlllIlII.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)lllllllllllllllIIllIllllIllIllll.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)lllllllllllllllIIllIllllIllIllll.getLocation()));
                    return lllIIIlIIllI[1];
                }
                "".length();
                if (" ".length() != 0) continue;
                return ((0x64 ^ 0x3C) & ~(0x2F ^ 0x77)) != 0;
            }
        }
        Movement.setDestination((WorldPoint)this.destination.get());
        return lllIIIlIIllI[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> lllllllllllllllIIllIllllIllIlIII = this.startAreas.get().iterator();
        while (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIllIlIII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIllIllllIllIlIIl;
            WorldArea lllllllllllllllIIllIllllIllIIlll = lllllllllllllllIIllIllllIllIlIII.next();
            if (G.lIIIlIIlIIIlIll(lllllllllllllllIIllIllllIllIIlll.contains((Locatable)lllllllllllllllIIllIllllIllIlIIl) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }
            "".length();
            if ("  ".length() <= "  ".length()) continue;
            return ((0xF4 ^ 0xC0) & ~(0x9A ^ 0xAE)) != 0;
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIIlIIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

