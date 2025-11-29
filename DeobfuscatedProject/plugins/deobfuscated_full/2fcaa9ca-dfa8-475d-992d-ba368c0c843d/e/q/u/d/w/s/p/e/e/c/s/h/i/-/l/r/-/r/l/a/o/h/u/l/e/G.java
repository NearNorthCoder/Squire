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
            Iterator var26 = list.iterator();
            while (G.lIIIlIIlIIIlIll(var26.hasNext() ? 1 : 0)) {
                void var16;
                Triple var3 = (Triple)var26.next();
                var16.add(new WorldArea(SquireSepulchre.a((RegionPoint)var3.getFirst()), ((Integer)var3.getSecond()).intValue(), ((Integer)var3.getThird()).intValue()));
                0;
                0;
                if (-1 <= 2) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = h2;
    }

    private static String lIIIlIIlIIIIlIl(String var29, String var25) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), lllIIIlIIllI[25]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lllIIIlIIllI[4], var8);
            return new String(var9.doFinal(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIlIIIIllI() {
        lllIIIlIIlIl = new String[lllIIIlIIllI[31]];
        G.lllIIIlIIlIl[G.lllIIIlIIllI[0]] = G."in here!";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[1]] = G."WEST_II_III";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[4]] = G."EAST_II_VI";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[5]] = G."NORTH_II_V";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[9]] = G."NORTH_II_VI";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[11]] = G."NORTH_II_VII";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[17]] = G."EAST_IV_II";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[21]] = G."TOP_V_V";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[25]] = G."TOP_V_VII";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[23]] = G."MIDDLE_V_XIII";
        G.lllIIIlIIlIl[G.lllIIIlIIllI[29]] = G."MIDDLE_V_XV";
    }

    private static String lIIIlIIlIIIIIll(String var22, String var33) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var24 = var33.toCharArray();
        int var14 = lllIIIlIIllI[0];
        char[] var15 = var22.toCharArray();
        int var5 = var15.length;
        int var2 = lllIIIlIIllI[0];
        while (G.lIIIlIIlIIIllII(var2, var5)) {
            char var1 = var15[var2];
            var4.append((char)(var1 ^ var24[var14 % var24.length]));
            0;
            ++var14;
            ++var2;
            0;
            if ((0xB ^ 0xF) > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static void lIIIlIIlIIIIlll() {
        lllIIIlIIllI = new int[32];
        G.lllIIIlIIllI[0] = (2 ^ 0x26 ^ (0x5E ^ 0x7F)) & (0x6F ^ 0x16 ^ (0xF0 ^ 0x8C) ^ -1);
        G.lllIIIlIIllI[1] = 1;
        G.lllIIIlIIllI[2] = 9 ^ 0x35;
        G.lllIIIlIIllI[3] = 0xFC ^ 0xC2 ^ (0x37 ^ 0x27);
        G.lllIIIlIIllI[4] = 2;
        G.lllIIIlIIllI[5] = 3;
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
        Iterator<WorldArea> var13 = this.startAreas.get().iterator();
        while (G.lIIIlIIlIIIlIll(var13.hasNext() ? 1 : 0)) {
            void var10;
            WorldArea var30 = var13.next();
            if (G.lIIIlIIlIIIlIll(var30.contains((WorldPoint)var10) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }
            0;
            
            return ((28 + 123 - 59 + 68 ^ 149 + 134 - 187 + 63) & (0x41 ^ 0x16 ^ (0x27 ^ 0x4F) ^ -1)) != 0;
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIIIlIIlIIIIlII(String var31, String var17) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lllIIIlIIllI[4], var11);
            return new String(var23.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var34) {
            var34.printStackTrace();
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
        void var19;
        void var32;
        G var20;
        Player player = Players.getLocal();
        if (G.lIIIlIIlIIIlIII(player)) {
            return lllIIIlIIllI[0];
        }
        if (G.lIIIlIIlIIIlIIl(var20.a((Locatable)var32) ? 1 : 0)) {
            return lllIIIlIIllI[0];
        }
        System.out.println(lllIIIlIIlIl[lllIIIlIIllI[0]]);
        var20.a((SquireSepulchre)var19);
        if (G.lIIIlIIlIIIlIlI((Object)var20.type, (Object)H.DART_STRANGE_TILES)) {
            Deque var21 = Static.getClient().getGraphicsObjects();
            Iterator var6 = var21.iterator();
            while (G.lIIIlIIlIIIlIll(var6.hasNext() ? 1 : 0)) {
                GraphicsObject var7 = (GraphicsObject)var6.next();
                if (G.lIIIlIIlIIIlIll(b.A.contains(var7.getId()) ? 1 : 0) && G.lIIIlIIlIIIlIll(var20.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var7.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var7.getLocation()));
                    return lllIIIlIIllI[1];
                }
                0;
                if (-2 <= 0) continue;
                return ((0x88 ^ 0xB0 ^ (0x38 ^ 0x34)) & (0x59 ^ 9 ^ (0x46 ^ 0x22) ^ -1)) != 0;
            }
            return lllIIIlIIllI[0];
        }
        if (G.lIIIlIIlIIIlIlI((Object)var20.type, (Object)H.BLADE_STRANGE_TILES)) {
            Deque var21 = Static.getClient().getGraphicsObjects();
            Iterator var6 = var21.iterator();
            while (G.lIIIlIIlIIIlIll(var6.hasNext() ? 1 : 0)) {
                GraphicsObject var7 = (GraphicsObject)var6.next();
                if (G.lIIIlIIlIIIlIll(b.A.contains(var7.getId()) ? 1 : 0) && G.lIIIlIIlIIIlIll(var20.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var7.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var7.getLocation()));
                    return lllIIIlIIllI[1];
                }
                0;
                if (1 != 0) continue;
                return false;
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
        Iterator<WorldArea> var18 = this.startAreas.get().iterator();
        while (G.lIIIlIIlIIIlIll(var18.hasNext() ? 1 : 0)) {
            void var12;
            WorldArea var28 = var18.next();
            if (G.lIIIlIIlIIIlIll(var28.contains((Locatable)var12) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }
            0;
            if (2 <= 2) continue;
            return false;
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

