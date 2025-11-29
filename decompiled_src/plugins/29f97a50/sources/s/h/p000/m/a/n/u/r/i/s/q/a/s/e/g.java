package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

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
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.g  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/g.class */
public final class g {
    private final /* synthetic */ Area area;
    private static /* synthetic */ int[] lIIlIlllIIlII;
    private final /* synthetic */ List<WorldPoint> safeSpots;
    public static final /* synthetic */ g FIRST_ROOM;
    private final /* synthetic */ WorldPoint origin;
    private static final /* synthetic */ g[] $VALUES;
    private static /* synthetic */ String[] lIIlIlllIIIll;
    private final /* synthetic */ WorldPoint center;

    public Area x() {
        return this.area;
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    private static void lIlIllIllIIllll() {
        lIIlIlllIIIll = new String[lIIlIlllIIlII[6]];
        lIIlIlllIIIll[lIIlIlllIIlII[0]] = lIlIllIllIIlllI("5F+CI8Mgrw26ItyCWy9ZiQ==", "eMoyA");
    }

    private static String lIlIllIllIIlllI(String llllllllllllllIllllIlIIlIIIIIllI, String llllllllllllllIllllIlIIlIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIlIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlllIIlII[7], llllllllllllllIllllIlIIlIIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIlIIIIIlll) {
            llllllllllllllIllllIlIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIIII() {
        lIIlIlllIIlII = new int[16];
        lIIlIlllIIlII[0] = (90 ^ 4) & ((199 ^ 153) ^ (-1));
        lIIlIlllIIlII[1] = (-((-285) & 23519)) & (-21) & 24543;
        lIIlIlllIIlII[2] = (-((-8978) & 15123)) & (-1) & 16245;
        lIIlIlllIIlII[3] = (-((-19001) & 23295)) & (-26666) & 32255;
        lIIlIlllIIlII[4] = (-((-5905) & 7953)) & (-4225) & 16365;
        lIIlIlllIIlII[5] = (22 ^ 52) ^ (163 ^ 139);
        lIIlIlllIIlII[6] = " ".length();
        lIIlIlllIIlII[7] = "  ".length();
        lIIlIlllIIlII[8] = "   ".length();
        lIIlIlllIIlII[9] = 0 ^ 4;
        lIIlIlllIIlII[10] = 120 ^ 125;
        lIIlIlllIIlII[11] = -" ".length();
        lIIlIlllIIlII[12] = (148 ^ 168) ^ (108 ^ 86);
        lIIlIlllIIlII[13] = 161 ^ 166;
        lIIlIlllIIlII[14] = (((112 + 198) - 222) + 119) ^ (((132 + 118) - 65) + 14);
        lIIlIlllIIlII[15] = (177 ^ 135) ^ (250 ^ 197);
    }

    public WorldPoint A() {
        return this.center;
    }

    public WorldPoint y() {
        return this.origin;
    }

    static {
        lIlIllIllIlIIII();
        lIlIllIllIIllll();
        String str = lIIlIlllIIIll[lIIlIlllIIlII[0]];
        int i = lIIlIlllIIlII[0];
        RectangularArea rectangularArea = new RectangularArea(lIIlIlllIIlII[1], lIIlIlllIIlII[2], lIIlIlllIIlII[3], lIIlIlllIIlII[4], lIIlIlllIIlII[0]);
        WorldPoint worldPoint = c.D;
        WorldPoint[] worldPointArr = new WorldPoint[lIIlIlllIIlII[5]];
        worldPointArr[lIIlIlllIIlII[0]] = c.D.dy(lIIlIlllIIlII[6]);
        worldPointArr[lIIlIlllIIlII[6]] = c.D.dy(lIIlIlllIIlII[7]);
        worldPointArr[lIIlIlllIIlII[7]] = c.D.dy(lIIlIlllIIlII[8]);
        worldPointArr[lIIlIlllIIlII[8]] = c.D.dy(lIIlIlllIIlII[9]);
        worldPointArr[lIIlIlllIIlII[9]] = c.D.dy(lIIlIlllIIlII[10]);
        worldPointArr[lIIlIlllIIlII[10]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[7]);
        worldPointArr[lIIlIlllIIlII[12]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[8]);
        worldPointArr[lIIlIlllIIlII[13]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[9]);
        worldPointArr[lIIlIlllIIlII[14]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[10]);
        worldPointArr[lIIlIlllIIlII[15]] = c.D.dy(lIIlIlllIIlII[11]).dx(lIIlIlllIIlII[12]);
        FIRST_ROOM = new g(str, i, rectangularArea, worldPoint, Arrays.asList(worldPointArr), c.G);
        g[] gVarArr = new g[lIIlIlllIIlII[6]];
        gVarArr[lIIlIlllIIlII[0]] = FIRST_ROOM;
        $VALUES = gVarArr;
    }

    private g(String str, int i, Area area, WorldPoint worldPoint, List list, WorldPoint worldPoint2) {
        this.area = area;
        this.origin = worldPoint;
        this.safeSpots = list;
        this.center = worldPoint2;
    }

    public List<WorldPoint> z() {
        return this.safeSpots;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }
}
