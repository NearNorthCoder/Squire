/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.Area
 *  net.unethicalite.api.coords.RectangularArea
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.Area;
import net.unethicalite.api.coords.RectangularArea;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c_Unknown;

public final class GEnum
extends Enum<g> {
    private final /* synthetic */ Area area;
    private static /* synthetic */ int[] lIIlIlllIIlII;
    private final /* synthetic */ List<WorldPoint> safeSpots;
    public static final /* synthetic */ /* enum */ g FIRST_ROOM;
    private final /* synthetic */ WorldPoint origin;
    private static final /* synthetic */ g[] $VALUES;
    private static /* synthetic */ String[] lIIlIlllIIIll;
    private final /* synthetic */ WorldPoint center;

    public Area x() {
        return this.area;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void lIlIllIllIIllll() {
        lIIlIlllIIIll = new String[lIIlIlllIIlII[6]];
        g.lIIlIlllIIIll[g.lIIlIlllIIlII[0]] = g."FIRST_ROOM";
    }

    private static String lIlIllIllIIlllI(String var3, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlIlllIIlII[7], var2);
            return new String(var5.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIIII() {
        lIIlIlllIIlII = new int[16];
        g.lIIlIlllIIlII[0] = (0x5A ^ 4) & ~(0xC7 ^ 0x99);
        g.lIIlIlllIIlII[1] = -(0xFFFFFEE3 & 0x5BDF) & (0xFFFFFFEB & 0x5FDF);
        g.lIIlIlllIIlII[2] = -(0xFFFFDCEE & 0x3B13) & (0xFFFFFFFF & 0x3F75);
        g.lIIlIlllIIlII[3] = -(0xFFFFB5C7 & 0x5AFF) & (0xFFFF97D6 & 0x7DFF);
        g.lIIlIlllIIlII[4] = -(0xFFFFE8EF & 0x1F11) & (0xFFFFEF7F & 0x3FED);
        g.lIIlIlllIIlII[5] = 0x16 ^ 0x34 ^ (0xA3 ^ 0x8B);
        g.lIIlIlllIIlII[6] = 1;
        g.lIIlIlllIIlII[7] = 2;
        g.lIIlIlllIIlII[8] = 3;
        g.lIIlIlllIIlII[9] = 0 ^ 4;
        g.lIIlIlllIIlII[10] = 0x78 ^ 0x7D;
        g.lIIlIlllIIlII[11] = -1;
        g.lIIlIlllIIlII[12] = 0x94 ^ 0xA8 ^ (0x6C ^ 0x56);
        g.lIIlIlllIIlII[13] = 0xA1 ^ 0xA6;
        g.lIIlIlllIIlII[14] = 112 + 198 - 222 + 119 ^ 132 + 118 - 65 + 14;
        g.lIIlIlllIIlII[15] = 0xB1 ^ 0x87 ^ (0xFA ^ 0xC5);
    }

    public WorldPoint A() {
        return this.center;
    }

    public WorldPoint y() {
        return this.origin;
    }

    static {
        g.lIlIllIllIlIIII();
        g.lIlIllIllIIllll();
        WorldPoint[] worldPointArray = new WorldPoint[lIIlIlllIIlII[5]];
        worldPointArray[g.lIIlIlllIIlII[0]] = c.D.dy(lIIlIlllIIlII[6]);
        worldPointArray[g.lIIlIlllIIlII[6]] = c.D.dy(lIIlIlllIIlII[7]);
        worldPointArray[g.lIIlIlllIIlII[7]] = c.D.dy(lIIlIlllIIlII[8]);
        worldPointArray[g.lIIlIlllIIlII[8]] = c.D.dy(lIIlIlllIIlII[9]);
        worldPointArray[g.lIIlIlllIIlII[9]] = c.D.dy(lIIlIlllIIlII[10]);
        worldPointArray[g.lIIlIlllIIlII[10]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[7]);
        worldPointArray[g.lIIlIlllIIlII[12]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[8]);
        worldPointArray[g.lIIlIlllIIlII[13]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[9]);
        worldPointArray[g.lIIlIlllIIlII[14]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[10]);
        worldPointArray[g.lIIlIlllIIlII[15]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[12]);
        FIRST_ROOM = new g((Area)new RectangularArea(lIIlIlllIIlII[1], lIIlIlllIIlII[2], lIIlIlllIIlII[3], lIIlIlllIIlII[4], lIIlIlllIIlII[0]), c.D, Arrays.asList(worldPointArray), c.G);
        g[] gArray = new g[lIIlIlllIIlII[6]];
        gArray[g.lIIlIlllIIlII[0]] = FIRST_ROOM;
        $VALUES = gArray;
    }

    private g(Area area, WorldPoint worldPoint, List<WorldPoint> list, WorldPoint worldPoint2) {
        this.area = area;
        this.origin = worldPoint;
        this.safeSpots = list;
        this.center = worldPoint2;
    }

    public List<WorldPoint> z() {
        return this.safeSpots;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }
}

