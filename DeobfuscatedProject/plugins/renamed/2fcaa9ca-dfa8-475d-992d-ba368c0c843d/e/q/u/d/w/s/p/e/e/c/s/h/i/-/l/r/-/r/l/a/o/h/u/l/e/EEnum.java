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
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.f_Unknown;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.GEnum;
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
import net.unethicalite.api.movement.Movement;

public final class EEnum
extends Enum<e> {
    public /* synthetic */ Supplier<TileObject> object;
    private static /* synthetic */ String[] lllIIIlllIIl;
    public static final /* synthetic */ /* enum */ e WEST_III_VI;
    private static /* synthetic */ int[] lllIIIlllIlI;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ /* enum */ e WEST_IV_I;
    public static final /* synthetic */ /* enum */ e SOUTH_II_III;
    public static final /* synthetic */ /* enum */ e NORTH_II_III;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ e SOUTH_I_I;
    public static final /* synthetic */ /* enum */ e TOP_V_IV;
    public static final /* synthetic */ /* enum */ e NORTH_III_III;
    public static final /* synthetic */ /* enum */ e SOUTH_IV_VI;
    public static final /* synthetic */ /* enum */ e WEST_II_I;
    public static final /* synthetic */ /* enum */ e NORTH_III_V;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ /* enum */ e WEST_II_VII;
    public static final /* synthetic */ /* enum */ e NORTH_IV_III;
    public static final /* synthetic */ /* enum */ e MIDDLE_V_XI;
    /* synthetic */ Supplier<WorldPoint> destination;
    public static final /* synthetic */ /* enum */ e EAST_I_III;
    /* synthetic */ g type;
    public static final /* synthetic */ /* enum */ e WEST_I_III;
    public static final /* synthetic */ /* enum */ e WEST_III_III;

    private static String lIIIlIIllIIlIIl(String var10, String var20) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lllIIIlllIlI[16]), "DES");
            Cipher var28 = Cipher.getInstance("DES");
            var28.init(lllIIIlllIlI[14], var9);
            return new String(var28.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var17 = this.startAreas.get().iterator();
        while (e.lIIIlIIllIllIlI(var17.hasNext() ? 1 : 0)) {
            void var4;
            WorldArea var15 = var17.next();
            if (e.lIIIlIIllIllIlI(var15.contains((Locatable)var4) ? 1 : 0)) {
                return lllIIIlllIlI[2];
            }
            0;
            
            return false;
        }
        return lllIIIlllIlI[0];
    }

    private static void lIIIlIIllIlIIIl() {
        lllIIIlllIlI = new int[54];
        e.lllIIIlllIlI[0] = (0x86 ^ 0xAA) & ~(0x1A ^ 0x36);
        e.lllIIIlllIlI[1] = 1 + 65 - -61 + 42 ^ 62 + 1 - -85 + 25;
        e.lllIIIlllIlI[2] = 1;
        e.lllIIIlllIlI[3] = 0x70 ^ 0x7D;
        e.lllIIIlllIlI[4] = 0x3E ^ 0x2E;
        e.lllIIIlllIlI[5] = 0x7E ^ 0x7B;
        e.lllIIIlllIlI[6] = 0x43 ^ 0x4C;
        e.lllIIIlllIlI[7] = 0xA8 ^ 0xA6;
        e.lllIIIlllIlI[8] = 0x3F ^ 0x62 ^ (0x70 ^ 0x27);
        e.lllIIIlllIlI[9] = 3;
        e.lllIIIlllIlI[10] = 0x36 ^ 0x2C;
        e.lllIIIlllIlI[11] = 0x22 ^ 0x24;
        e.lllIIIlllIlI[12] = 0x51 ^ 0x42;
        e.lllIIIlllIlI[13] = 0x1F ^ 0xD;
        e.lllIIIlllIlI[14] = 2;
        e.lllIIIlllIlI[15] = 0x67 ^ 0x60;
        e.lllIIIlllIlI[16] = 0x8E ^ 0x86;
        e.lllIIIlllIlI[17] = 0x50 ^ 0x59;
        e.lllIIIlllIlI[18] = 0xA6 ^ 0xAD;
        e.lllIIIlllIlI[19] = 81 + 141 - 221 + 174 ^ 122 + 136 - 148 + 53;
        e.lllIIIlllIlI[20] = 4 ^ 0x39;
        e.lllIIIlllIlI[21] = 0x7E ^ 0x4E ^ (0xAF ^ 0xB7);
        e.lllIIIlllIlI[22] = 0xB1 ^ 0x8A ^ (0x24 ^ 0x3A);
        e.lllIIIlllIlI[23] = 0x91 ^ 0xC0 ^ (0xBF ^ 0xC2);
        e.lllIIIlllIlI[24] = 0xC ^ 0xA ^ (0x96 ^ 0xA4);
        e.lllIIIlllIlI[25] = 0x22 ^ 0x55 ^ (0x60 ^ 6);
        e.lllIIIlllIlI[26] = 0x39 ^ 5;
        e.lllIIIlllIlI[27] = 0x4B ^ 0x68 ^ (0x31 ^ 0x3B);
        e.lllIIIlllIlI[28] = 0x53 ^ 0x4C;
        e.lllIIIlllIlI[29] = 0x65 ^ 0x69 ^ (0xA8 ^ 0x9E);
        e.lllIIIlllIlI[30] = 0x2D ^ 0xF;
        e.lllIIIlllIlI[31] = 0x91 ^ 0x9C ^ (0xB1 ^ 0x82);
        e.lllIIIlllIlI[32] = 0x6A ^ 2 ^ (0xFA ^ 0xA5);
        e.lllIIIlllIlI[33] = 0x9B ^ 0x85;
        e.lllIIIlllIlI[34] = 7 ^ 0x26;
        e.lllIIIlllIlI[35] = 20 + 75 - 38 + 71 ^ 115 + 17 - 35 + 74;
        e.lllIIIlllIlI[36] = 0xB2 ^ 0xA6;
        e.lllIIIlllIlI[37] = 0x2E ^ 0x73 ^ (0x5F ^ 0x1B);
        e.lllIIIlllIlI[38] = 0x66 ^ 0x71;
        e.lllIIIlllIlI[39] = 9 ^ 0x29;
        e.lllIIIlllIlI[40] = 0x62 ^ 0x77;
        e.lllIIIlllIlI[41] = 2 + 144 - 81 + 121 ^ 127 + 17 - 108 + 136;
        e.lllIIIlllIlI[42] = 0x5D ^ 0x40;
        e.lllIIIlllIlI[43] = 7 ^ 0x38;
        e.lllIIIlllIlI[44] = 0xC1 ^ 0x8A ^ (0x2D ^ 0x5E);
        e.lllIIIlllIlI[45] = 0x1E ^ 0x2B;
        e.lllIIIlllIlI[46] = 54 + 70 - 77 + 81 ^ 167 + 134 - 200 + 69;
        e.lllIIIlllIlI[47] = 0x94 ^ 0x8C;
        e.lllIIIlllIlI[48] = 0x9D ^ 0xAD;
        e.lllIIIlllIlI[49] = 173 + 96 - 146 + 111 ^ 36 + 126 - -3 + 31;
        e.lllIIIlllIlI[50] = 0x48 ^ 0xF ^ (6 ^ 0x77);
        e.lllIIIlllIlI[51] = 0xD3 ^ 0xB5 ^ (0xD3 ^ 0x8E);
        e.lllIIIlllIlI[52] = 0x1C ^ 7;
        e.lllIIIlllIlI[53] = 0x6E ^ 0x72;
    }

    private static boolean lIIIlIIllIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private e(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, g g2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = g2;
    }

    private static void lIIIlIIllIlIIII() {
        lllIIIlllIIl = new String[lllIIIlllIlI[39]];
        e.lllIIIlllIIl[e.lllIIIlllIlI[0]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[2]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[14]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[9]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[1]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[5]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[11]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[15]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[16]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[17]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[8]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[18]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[19]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[3]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[7]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[6]] = e."Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[4]] = e."WEST_I_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[25]] = e."SOUTH_I_I";
        e.lllIIIlllIIl[e.lllIIIlllIlI[13]] = e."EAST_I_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[12]] = e."WEST_II_I";
        e.lllIIIlllIIl[e.lllIIIlllIlI[36]] = e."WEST_II_VII";
        e.lllIIIlllIIl[e.lllIIIlllIlI[40]] = e."SOUTH_II_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[41]] = e."NORTH_II_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[38]] = e."NORTH_III_V";
        e.lllIIIlllIIl[e.lllIIIlllIlI[47]] = e."WEST_III_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[37]] = e."NORTH_III_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[10]] = e."WEST_III_VI";
        e.lllIIIlllIIl[e.lllIIIlllIlI[52]] = e."NORTH_IV_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[53]] = e."SOUTH_IV_VI";
        e.lllIIIlllIIl[e.lllIIIlllIlI[42]] = e."WEST_IV_I";
        e.lllIIIlllIIl[e.lllIIIlllIlI[33]] = e."TOP_V_IV";
        e.lllIIIlllIIl[e.lllIIIlllIlI[28]] = e."MIDDLE_V_XI";
    }

    private e(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, g g2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var25 = list.iterator();
            while (e.lIIIlIIllIllIlI(var25.hasNext() ? 1 : 0)) {
                void var6;
                Triple var8 = (Triple)var25.next();
                var6.add(new WorldArea(SquireSepulchre.a((RegionPoint)var8.getFirst()), ((Integer)var8.getSecond()).intValue(), ((Integer)var8.getThird()).intValue()));
                0;
                0;
                if (-2 < 0) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = g2;
    }

    private static boolean lIIIlIIllIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static String lIIIlIIllIIllII(String var27, String var21) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(lllIIIlllIlI[14], var19);
            return new String(var22.doFinal(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var30;
        void var7;
        void var26;
        e var32;
        Player player = Players.getLocal();
        if (e.lIIIlIIllIlIIlI(player)) {
            return lllIIIlllIlI[0];
        }
        if (e.lIIIlIIllIlIIll(var32.a((Locatable)var26) ? 1 : 0)) {
            return lllIIIlllIlI[0];
        }
        var32.a((SquireSepulchre)var7);
        if (e.lIIIlIIllIllIlI(var32.a((d)var30) ? 1 : 0)) {
            WorldPoint var5 = var32.destination.get();
            System.out.println(var5);
            Movement.setDestination((WorldPoint)var5);
            return lllIIIlllIlI[2];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return lllIIIlllIlI[2];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static boolean lIIIlIIllIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlIIllIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static boolean lIIIlIIllIlIIll(int n2) {
        return n2 == 0;
    }

    static {
        e.lIIIlIIllIlIIIl();
        e.lIIIlIIllIlIIII();
        WEST_I_III = new e(new RegionPoint(lllIIIlllIlI[0], lllIIIlllIlI[22], lllIIIlllIlI[14], b.C), lllIIIlllIlI[15], lllIIIlllIlI[17], new RegionPoint(lllIIIlllIlI[0], lllIIIlllIlI[23], lllIIIlllIlI[14], b.C), new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[24], lllIIIlllIlI[14], b.C), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[6]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIlI[20], lllIIIlllIlI[21], lllIIIlllIlI[14], b.D)), (String[])stringArray);
        }, g.BLADE);
        SOUTH_I_I = new e(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[21], lllIIIlllIlI[9], lllIIIlllIlI[14], b.C), (Object)lllIIIlllIlI[4], (Object)lllIIIlllIlI[9]), new Triple((Object)new RegionPoint(lllIIIlllIlI[24], lllIIIlllIlI[26], lllIIIlllIlI[14], b.E), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17])), new RegionPoint(lllIIIlllIlI[27], lllIIIlllIlI[9], lllIIIlllIlI[14], b.C), new RegionPoint(lllIIIlllIlI[28], lllIIIlllIlI[8], lllIIIlllIlI[14], b.C), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[7]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLADE_I);
        EAST_I_III = new e(new RegionPoint(lllIIIlllIlI[29], lllIIIlllIlI[30], lllIIIlllIlI[14], b.C), lllIIIlllIlI[11], lllIIIlllIlI[18], new RegionPoint(lllIIIlllIlI[31], lllIIIlllIlI[30], lllIIIlllIlI[14], b.C), new RegionPoint(lllIIIlllIlI[32], lllIIIlllIlI[13], lllIIIlllIlI[14], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[3]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                if (3 <= ((234 + 62 - 176 + 134 ^ 58 + 31 - -36 + 41) & (0x77 ^ 0x21 ^ (0x7B ^ 0x75) ^ -1))) {
                    return ((32 + 157 - 182 + 245 ^ 162 + 13 - 108 + 111) & (0x64 ^ 0x41 ^ (0x6B ^ 0) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE);
        WEST_II_I = new e(new RegionPoint(lllIIIlllIlI[13], lllIIIlllIlI[33], lllIIIlllIlI[14], b.G), lllIIIlllIlI[19], lllIIIlllIlI[1], new RegionPoint(lllIIIlllIlI[13], lllIIIlllIlI[34], lllIIIlllIlI[14], b.G), new RegionPoint(lllIIIlllIlI[19], lllIIIlllIlI[35], lllIIIlllIlI[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[19]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                if (((0x2C ^ 0x69) & ~(0x80 ^ 0xC5)) != 0) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE);
        WEST_II_VII = new e(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[37], lllIIIlllIlI[2], b.I), (Object)lllIIIlllIlI[11], (Object)lllIIIlllIlI[11]), new Triple((Object)new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[30], lllIIIlllIlI[2], b.I), (Object)lllIIIlllIlI[11], (Object)lllIIIlllIlI[8])), new RegionPoint(lllIIIlllIlI[2], lllIIIlllIlI[33], lllIIIlllIlI[2], b.G), new RegionPoint(lllIIIlllIlI[38], lllIIIlllIlI[39], lllIIIlllIlI[2], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[18]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[2])) {
                n2 = lllIIIlllIlI[2];
                0;
                if (1 >= (0x55 ^ 0x51)) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE_II);
        SOUTH_II_III = new e(new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], b.G), lllIIIlllIlI[9], lllIIIlllIlI[2], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], b.G), new RegionPoint(lllIIIlllIlI[6], lllIIIlllIlI[3], lllIIIlllIlI[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[8]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                if (1 == 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE_III);
        NORTH_II_III = new e(new RegionPoint(lllIIIlllIlI[42], lllIIIlllIlI[43], lllIIIlllIlI[14], b.G), lllIIIlllIlI[19], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[21], lllIIIlllIlI[43], lllIIIlllIlI[14], b.G), new RegionPoint(lllIIIlllIlI[24], lllIIIlllIlI[44], lllIIIlllIlI[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[17]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                if (((0x33 ^ 0x6C) & ~(0x17 ^ 0x48)) > 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE_IV);
        NORTH_III_V = new e(new RegionPoint(lllIIIlllIlI[45], lllIIIlllIlI[7], lllIIIlllIlI[14], b.J), lllIIIlllIlI[9], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[45], lllIIIlllIlI[4], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[46], lllIIIlllIlI[40], lllIIIlllIlI[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[16]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                if (1 > 1) {
                    return ((0x1E ^ 0x42 ^ (0x69 ^ 0x71)) & (0x63 ^ 0xA ^ (0x8C ^ 0xA1) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_II);
        WEST_III_III = new e(new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[48], lllIIIlllIlI[14], b.J), lllIIIlllIlI[19], lllIIIlllIlI[7], new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[29], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[46], lllIIIlllIlI[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[15]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_I);
        NORTH_III_III = new e(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[49], lllIIIlllIlI[49], lllIIIlllIlI[14], b.J), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17]), new Triple((Object)new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[30], lllIIIlllIlI[2], b.I), (Object)lllIIIlllIlI[11], (Object)lllIIIlllIlI[8])), new RegionPoint(lllIIIlllIlI[48], lllIIIlllIlI[50], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[51], lllIIIlllIlI[35], lllIIIlllIlI[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[11]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];
                0;
                if ((0x39 ^ 0x3D) < ((0x20 ^ 0x67) & ~(0x17 ^ 0x50))) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_I);
        WEST_III_VI = new e(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[6], lllIIIlllIlI[14], b.J), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17]), new Triple((Object)new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[9], lllIIIlllIlI[14], b.J), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17])), new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[10], lllIIIlllIlI[5], lllIIIlllIlI[14], b.J), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[5]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_III);
        NORTH_IV_III = new e(new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[30], lllIIIlllIlI[14], b.L), lllIIIlllIlI[7], lllIIIlllIlI[17], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[46], lllIIIlllIlI[14], b.L), new RegionPoint(lllIIIlllIlI[19], lllIIIlllIlI[26], lllIIIlllIlI[14], b.L), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[1]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_IV);
        SOUTH_IV_VI = new e(new RegionPoint(lllIIIlllIlI[5], lllIIIlllIlI[8], lllIIIlllIlI[14], b.L), lllIIIlllIlI[11], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[8], lllIIIlllIlI[14], b.L), new RegionPoint(lllIIIlllIlI[47], lllIIIlllIlI[45], lllIIIlllIlI[14], b.M), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[9]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_V);
        WEST_IV_I = new e(new RegionPoint(lllIIIlllIlI[36], lllIIIlllIlI[25], lllIIIlllIlI[2], b.L), lllIIIlllIlI[16], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[36], lllIIIlllIlI[12], lllIIIlllIlI[2], b.L), new RegionPoint(lllIIIlllIlI[15], lllIIIlllIlI[39], lllIIIlllIlI[2], b.L), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[14]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_VI);
        TOP_V_IV = new e(new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[45], lllIIIlllIlI[14], b.N), lllIIIlllIlI[25], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[45], lllIIIlllIlI[14], b.N), new RegionPoint(lllIIIlllIlI[5], lllIIIlllIlI[24], lllIIIlllIlI[14], b.N), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[2]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLUE_BLADE_I);
        MIDDLE_V_XI = new e(new RegionPoint(lllIIIlllIlI[23], lllIIIlllIlI[45], lllIIIlllIlI[2], b.N), lllIIIlllIlI[6], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[29], lllIIIlllIlI[45], lllIIIlllIlI[2], b.N), new RegionPoint(lllIIIlllIlI[51], lllIIIlllIlI[24], lllIIIlllIlI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[0]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLUE_BLADE_II);
        e[] eArray = new e[lllIIIlllIlI[4]];
        eArray[e.lllIIIlllIlI[0]] = WEST_I_III;
        eArray[e.lllIIIlllIlI[2]] = SOUTH_I_I;
        eArray[e.lllIIIlllIlI[14]] = EAST_I_III;
        eArray[e.lllIIIlllIlI[9]] = WEST_II_I;
        eArray[e.lllIIIlllIlI[1]] = WEST_II_VII;
        eArray[e.lllIIIlllIlI[5]] = SOUTH_II_III;
        eArray[e.lllIIIlllIlI[11]] = NORTH_II_III;
        eArray[e.lllIIIlllIlI[15]] = NORTH_III_V;
        eArray[e.lllIIIlllIlI[16]] = WEST_III_III;
        eArray[e.lllIIIlllIlI[17]] = NORTH_III_III;
        eArray[e.lllIIIlllIlI[8]] = WEST_III_VI;
        eArray[e.lllIIIlllIlI[18]] = NORTH_IV_III;
        eArray[e.lllIIIlllIlI[19]] = SOUTH_IV_VI;
        eArray[e.lllIIIlllIlI[3]] = WEST_IV_I;
        eArray[e.lllIIIlllIlI[7]] = TOP_V_IV;
        eArray[e.lllIIIlllIlI[6]] = MIDDLE_V_XI;
        $VALUES = eArray;
    }

    private static String lIIIlIIllIIllll(String var3, String var23) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var2 = var23.toCharArray();
        int var14 = lllIIIlllIlI[0];
        char[] var33 = var3.toCharArray();
        int var18 = var33.length;
        int var16 = lllIIIlllIlI[0];
        while (e.lIIIlIIllIllIIl(var16, var18)) {
            char var29 = var33[var16];
            var11.append((char)(var29 ^ var2[var14 % var2.length]));
            0;
            ++var14;
            ++var16;
            0;
            if ((46 + 73 - -29 + 34 ^ 144 + 39 - 181 + 177) > 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2) {
        e var24;
        J j2 = d2.b(this.object.get());
        if (e.lIIIlIIllIlIIlI(j2)) {
            return lllIIIlllIlI[0];
        }
        Player var31 = Players.getLocal();
        if (e.lIIIlIIllIlIIlI(var31)) {
            return lllIIIlllIlI[0];
        }
        if (e.lIIIlIIllIlIIll(var31.getWorldLocation().equals((Object)var24.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIlI[0];
        }
        switch (f.S[var24.type.ordinal()]) {
            case 1: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && !e.lIIIlIIllIlIlIl(var13.aF(), lllIIIlllIlI[1]) || e.lIIIlIIllIlIlII(var13.aG(), b.v)) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && !e.lIIIlIIllIlIllI(var13.aF(), lllIIIlllIlI[3]) || !e.lIIIlIIllIlIlll(var13.aG(), b.t) || e.lIIIlIIllIlIlII(var13.aG(), b.w)) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 2: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s)) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 3: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[4])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.t)) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 4: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[5])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[6])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 5: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[5])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[4])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 6: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[5])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[7])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 7: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[1])) {
                    return lllIIIlllIlI[2];
                }
                if (!e.lIIIlIIllIlIlll(var13.aG(), b.u) || e.lIIIlIIllIlIlII(var13.aG(), b.v)) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[8])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 8: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[9])) {
                    return lllIIIlllIlI[2];
                }
                if (!e.lIIIlIIllIlIlll(var13.aG(), b.u) || e.lIIIlIIllIlIlII(var13.aG(), b.v)) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[7])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 9: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[6])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[9])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 10: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[9])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 11: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[10])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[11])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 12: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[12])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[11])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 13: {
                void var13;
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIII(var13.aF(), lllIIIlllIlI[13])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var13.aG(), b.s) && e.lIIIlIIllIllIIl(var13.aF(), lllIIIlllIlI[11])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
        }
        return lllIIIlllIlI[0];
    }

    private static boolean lIIIlIIllIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIllIlIIlI(Object object) {
        return object == null;
    }
}

