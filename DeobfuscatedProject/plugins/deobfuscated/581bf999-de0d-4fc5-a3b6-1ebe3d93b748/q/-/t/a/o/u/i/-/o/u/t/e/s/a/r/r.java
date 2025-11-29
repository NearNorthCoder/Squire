/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.awt.Point;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;

public final class r
extends Enum<r> {
    public static final /* synthetic */ /* enum */ r ROOM_6;
    public static final /* synthetic */ /* enum */ r ROOM_4_1;
    public static final /* synthetic */ /* enum */ r ROOM_5;
    public static final /* synthetic */ /* enum */ r ROOM_3;
    private final /* synthetic */ Map<Point, Integer> placingMirrors;
    public static final /* synthetic */ /* enum */ r ROOM_7_1;
    private static /* synthetic */ String[] llIlIIllIII;
    public static final /* synthetic */ /* enum */ r ROOM_1;
    public static final /* synthetic */ /* enum */ r ROOM_8_1;
    private final /* synthetic */ Set<Point> detectionMirrors;
    public static final /* synthetic */ /* enum */ r ROOM_7;
    public static final /* synthetic */ /* enum */ r ROOM_3_1;
    private final /* synthetic */ List<Point> wallsToBreak;
    public static final /* synthetic */ /* enum */ r ROOM_4;
    public static final /* synthetic */ /* enum */ r ROOM_1_2;
    private static final /* synthetic */ r[] $VALUES;
    private static final /* synthetic */ int REGION_ID;
    private final /* synthetic */ Point stand;
    private static /* synthetic */ int[] llIlIIllIIl;
    public static final /* synthetic */ /* enum */ r ROOM_8_2;

    public static r valueOf(String string) {
        return Enum.valueOf(r.class, string);
    }

    public boolean d(WorldPoint worldPoint) {
        Point point = this.c(worldPoint);
        return this.placingMirrors.containsKey(point);
    }

    private static boolean lIlIIlIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private r(Point point, Set<Point> set, Map<Point, Integer> map, Point ... pointArray) {
        this.stand = point;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = Stream.of(pointArray).collect(Collectors.toList());
    }

    private static void lIlIIlIlllIIII() {
        llIlIIllIII = new String[llIlIIllIIl[37]];
        r.llIlIIllIII[r.llIlIIllIIl[0]] = r."Mirror";
        r.llIlIIllIII[r.llIlIIllIIl[1]] = r."Pick-up";
        r.llIlIIllIII[r.llIlIIllIIl[3]] = r."ROOM_1";
        r.llIlIIllIII[r.llIlIIllIIl[15]] = r."ROOM_1_2";
        r.llIlIIllIII[r.llIlIIllIIl[19]] = r."ROOM_3";
        r.llIlIIllIII[r.llIlIIllIIl[22]] = r."ROOM_3_1";
        r.llIlIIllIII[r.llIlIIllIIl[25]] = r."ROOM_4";
        r.llIlIIllIII[r.llIlIIllIIl[29]] = r."ROOM_4_1";
        r.llIlIIllIII[r.llIlIIllIIl[30]] = r."ROOM_5";
        r.llIlIIllIII[r.llIlIIllIIl[31]] = r."ROOM_6";
        r.llIlIIllIII[r.llIlIIllIIl[33]] = r."ROOM_7";
        r.llIlIIllIII[r.llIlIIllIIl[34]] = r."ROOM_7_1";
        r.llIlIIllIII[r.llIlIIllIIl[35]] = r."ROOM_8_1";
        r.llIlIIllIII[r.llIlIIllIIl[36]] = r."ROOM_8_2";
    }

    public Point c(WorldPoint worldPoint) {
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        return new Point(regionPoint.getX(), regionPoint.getY());
    }

    private r(Set<Point> set, Map<Point, Integer> map, Point ... pointArray) {
        this.stand = null;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = Stream.of(pointArray).collect(Collectors.toList());
    }

    private static void lIlIIlIlllIIIl() {
        llIlIIllIIl = new int[38];
        r.llIlIIllIIl[0] = (0xB0 ^ 0x92 ^ (1 ^ 0x6F)) & (19 + 101 - 69 + 144 ^ 29 + 48 - 8 + 74 ^ -1);
        r.llIlIIllIIl[1] = 1;
        r.llIlIIllIIl[2] = 0xFFFFF957 & 0x3FFA;
        r.llIlIIllIIl[3] = 2;
        r.llIlIIllIIl[4] = 0x8E ^ 0xA8 ^ (0x43 ^ 0x7B);
        r.llIlIIllIIl[5] = 0x46 ^ 0x10 ^ (0x3D ^ 0x49);
        r.llIlIIllIIl[6] = 0x36 ^ 0x2B;
        r.llIlIIllIIl[7] = 101 + 59 - 132 + 143 ^ 73 + 161 - 192 + 141;
        r.llIlIIllIIl[8] = 0xC5 ^ 0x83 ^ (0xEE ^ 0xB2);
        r.llIlIIllIIl[9] = 0x31 ^ 0x2A;
        r.llIlIIllIIl[10] = 0x49 ^ 0x61;
        r.llIlIIllIIl[11] = 0x46 ^ 0x66;
        r.llIlIIllIIl[12] = 0xFFFFC51C & 0x3BE3;
        r.llIlIIllIIl[13] = 0x15 ^ 0x56 ^ (0xEF ^ 0x88);
        r.llIlIIllIIl[14] = 0xFFFFF731 & 0xDCE;
        r.llIlIIllIIl[15] = 3;
        r.llIlIIllIIl[16] = 0x81 ^ 0x98;
        r.llIlIIllIIl[17] = 0x70 ^ 0x59;
        r.llIlIIllIIl[18] = 0xFFFFAB03 & 0x57FC;
        r.llIlIIllIIl[19] = 0x1D ^ 0x75 ^ (0x1E ^ 0x72);
        r.llIlIIllIIl[20] = 0x74 ^ 0x57;
        r.llIlIIllIIl[21] = 0x9C ^ 0x84;
        r.llIlIIllIIl[22] = 0x59 ^ 0x5C;
        r.llIlIIllIIl[23] = 0x24 ^ 0x64 ^ (0x29 ^ 0x4F);
        r.llIlIIllIIl[24] = 0xFFFFE7D1 & 0x1F2E;
        r.llIlIIllIIl[25] = 0x5D ^ 0x5B;
        r.llIlIIllIIl[26] = 0x1F ^ 0x47 ^ (0x65 ^ 0x18);
        r.llIlIIllIIl[27] = 0x8E ^ 0xA9;
        r.llIlIIllIIl[28] = 6 ^ 0x27;
        r.llIlIIllIIl[29] = 0x7B ^ 0x7C;
        r.llIlIIllIIl[30] = 0x3E ^ 0x36;
        r.llIlIIllIIl[31] = 0x70 ^ 0x79;
        r.llIlIIllIIl[32] = 0xB1 ^ 0xAE;
        r.llIlIIllIIl[33] = 5 + 169 - 52 + 58 ^ 121 + 153 - 250 + 166;
        r.llIlIIllIIl[34] = 0x7E ^ 0x75;
        r.llIlIIllIIl[35] = 0xA9 ^ 0xA5;
        r.llIlIIllIIl[36] = 0x9B ^ 0x96;
        r.llIlIIllIIl[37] = 0x76 ^ 0x15 ^ (0x4F ^ 0x22);
    }

    public Set<Point> ac() {
        return this.detectionMirrors;
    }

    public Map<Point, Integer> ad() {
        return this.placingMirrors;
    }

    public WorldPoint a(Point point) {
        Client client = Static.getClient();
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        RegionPoint regionPoint = new RegionPoint(point.x, point.y, client.getPlane(), llIlIIllIIl[2]);
        return WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(worldPoint))).orElse(null);
    }

    public Point ab() {
        return this.stand;
    }

    public List<Point> ae() {
        return this.wallsToBreak;
    }

    static {
        r.lIlIIlIlllIIIl();
        r.lIlIIlIlllIIII();
        REGION_ID = llIlIIllIIl[2];
        Point[] pointArray = new Point[llIlIIllIIl[1]];
        pointArray[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[13], llIlIIllIIl[5]);
        ROOM_1 = new r(new Point(llIlIIllIIl[4], llIlIIllIIl[5]), Set.of(new Point(llIlIIllIIl[6], llIlIIllIIl[7]), new Point(llIlIIllIIl[8], llIlIIllIIl[6]), new Point(llIlIIllIIl[9], llIlIIllIIl[10])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[13], llIlIIllIIl[10]), llIlIIllIIl[14]), pointArray);
        Point[] pointArray2 = new Point[llIlIIllIIl[1]];
        pointArray2[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[13], llIlIIllIIl[5]);
        ROOM_1_2 = new r(new Point(llIlIIllIIl[4], llIlIIllIIl[5]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[7], llIlIIllIIl[9]), new Point(llIlIIllIIl[5], llIlIIllIIl[17])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[9], llIlIIllIIl[10]), llIlIIllIIl[18], new Point(llIlIIllIIl[13], llIlIIllIIl[10]), llIlIIllIIl[14]), pointArray2);
        Point[] pointArray3 = new Point[llIlIIllIIl[1]];
        pointArray3[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_3 = new r(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[6]), new Point(llIlIIllIIl[6], llIlIIllIIl[5]), new Point(llIlIIllIIl[20], llIlIIllIIl[21])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[8], llIlIIllIIl[21]), llIlIIllIIl[12]), pointArray3);
        Point[] pointArray4 = new Point[llIlIIllIIl[1]];
        pointArray4[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_3_1 = new r(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[9], llIlIIllIIl[16]), new Point(llIlIIllIIl[10], llIlIIllIIl[7]), new Point(llIlIIllIIl[10], llIlIIllIIl[23])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[8], llIlIIllIIl[21]), llIlIIllIIl[12], new Point(llIlIIllIIl[20], llIlIIllIIl[21]), llIlIIllIIl[24]), pointArray4);
        Point[] pointArray5 = new Point[llIlIIllIIl[1]];
        pointArray5[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[16], llIlIIllIIl[6]);
        ROOM_4 = new r(Set.of(new Point(llIlIIllIIl[8], llIlIIllIIl[7]), new Point(llIlIIllIIl[26], llIlIIllIIl[23]), new Point(llIlIIllIIl[27], llIlIIllIIl[28])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[16], llIlIIllIIl[21]), llIlIIllIIl[12], new Point(llIlIIllIIl[27], llIlIIllIIl[21]), llIlIIllIIl[24]), pointArray5);
        Point[] pointArray6 = new Point[llIlIIllIIl[1]];
        pointArray6[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[16], llIlIIllIIl[6]);
        ROOM_4_1 = new r(new Point(llIlIIllIIl[11], llIlIIllIIl[6]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[9], llIlIIllIIl[16]), new Point(llIlIIllIIl[13], llIlIIllIIl[6])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[21]), llIlIIllIIl[12], new Point(llIlIIllIIl[27], llIlIIllIIl[21]), llIlIIllIIl[24]), pointArray6);
        ROOM_5 = new r(new Point(llIlIIllIIl[6], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[23]), new Point(llIlIIllIIl[26], llIlIIllIIl[26]), new Point(llIlIIllIIl[13], llIlIIllIIl[16])), Map.of(new Point(llIlIIllIIl[21], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[21], llIlIIllIIl[27]), llIlIIllIIl[18], new Point(llIlIIllIIl[20], llIlIIllIIl[27]), llIlIIllIIl[14]), new Point[llIlIIllIIl[0]]);
        ROOM_6 = new r(new Point(llIlIIllIIl[11], llIlIIllIIl[20]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[32], llIlIIllIIl[21]), new Point(llIlIIllIIl[13], llIlIIllIIl[27])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[27]), llIlIIllIIl[18]), new Point[llIlIIllIIl[0]]);
        Point[] pointArray7 = new Point[llIlIIllIIl[1]];
        pointArray7[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[5], llIlIIllIIl[5]);
        ROOM_7 = new r(Set.of(new Point(llIlIIllIIl[23], llIlIIllIIl[32]), new Point(llIlIIllIIl[17], llIlIIllIIl[13]), new Point(llIlIIllIIl[16], llIlIIllIIl[6])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[9], llIlIIllIIl[20]), llIlIIllIIl[18], new Point(llIlIIllIIl[5], llIlIIllIIl[20]), llIlIIllIIl[14]), pointArray7);
        Point[] pointArray8 = new Point[llIlIIllIIl[1]];
        pointArray8[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[5], llIlIIllIIl[5]);
        ROOM_7_1 = new r(new Point(llIlIIllIIl[32], llIlIIllIIl[20]), Set.of(new Point(llIlIIllIIl[9], llIlIIllIIl[20]), new Point(llIlIIllIIl[21], llIlIIllIIl[11]), new Point(llIlIIllIIl[17], llIlIIllIIl[6])), Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), llIlIIllIIl[12], new Point(llIlIIllIIl[5], llIlIIllIIl[20]), llIlIIllIIl[14]), pointArray8);
        Point[] pointArray9 = new Point[llIlIIllIIl[1]];
        pointArray9[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_8_1 = new r(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[11], llIlIIllIIl[21]), new Point(llIlIIllIIl[11], llIlIIllIIl[6]), new Point(llIlIIllIIl[6], llIlIIllIIl[17])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), llIlIIllIIl[18], new Point(llIlIIllIIl[8], llIlIIllIIl[16]), llIlIIllIIl[12], new Point(llIlIIllIIl[20], llIlIIllIIl[16]), llIlIIllIIl[24]), pointArray9);
        Point[] pointArray10 = new Point[llIlIIllIIl[1]];
        pointArray10[r.llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_8_2 = new r(new Point(llIlIIllIIl[4], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), new Point(llIlIIllIIl[13], llIlIIllIIl[17]), new Point(llIlIIllIIl[6], llIlIIllIIl[17])), Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[16]), llIlIIllIIl[12], new Point(llIlIIllIIl[20], llIlIIllIIl[16]), llIlIIllIIl[24]), pointArray10);
        r[] rArray = new r[llIlIIllIIl[35]];
        rArray[r.llIlIIllIIl[0]] = ROOM_1;
        rArray[r.llIlIIllIIl[1]] = ROOM_1_2;
        rArray[r.llIlIIllIIl[3]] = ROOM_3;
        rArray[r.llIlIIllIIl[15]] = ROOM_3_1;
        rArray[r.llIlIIllIIl[19]] = ROOM_4;
        rArray[r.llIlIIllIIl[22]] = ROOM_4_1;
        rArray[r.llIlIIllIIl[25]] = ROOM_5;
        rArray[r.llIlIIllIIl[29]] = ROOM_6;
        rArray[r.llIlIIllIIl[30]] = ROOM_7;
        rArray[r.llIlIIllIIl[31]] = ROOM_7_1;
        rArray[r.llIlIIllIIl[33]] = ROOM_8_1;
        rArray[r.llIlIIllIIl[34]] = ROOM_8_2;
        $VALUES = rArray;
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    private static String lIlIIlIllIlllI(String llllllllllllllllIIllIlIlIIlllIII, String llllllllllllllllIIllIlIlIIllllII) {
        llllllllllllllllIIllIlIlIIlllIII = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlIlIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIlIlIIlllIll = new StringBuilder();
        char[] llllllllllllllllIIllIlIlIIlllIlI = llllllllllllllllIIllIlIlIIllllII.toCharArray();
        int llllllllllllllllIIllIlIlIIlllIIl = llIlIIllIIl[0];
        char[] llllllllllllllllIIllIlIlIIllIIll = llllllllllllllllIIllIlIlIIlllIII.toCharArray();
        int llllllllllllllllIIllIlIlIIllIIlI = llllllllllllllllIIllIlIlIIllIIll.length;
        int llllllllllllllllIIllIlIlIIllIIIl = llIlIIllIIl[0];
        while (r.lIlIIlIlllIIlI(llllllllllllllllIIllIlIlIIllIIIl, llllllllllllllllIIllIlIlIIllIIlI)) {
            char llllllllllllllllIIllIlIlIIlllllI = llllllllllllllllIIllIlIlIIllIIll[llllllllllllllllIIllIlIlIIllIIIl];
            llllllllllllllllIIllIlIlIIlllIll.append((char)(llllllllllllllllIIllIlIlIIlllllI ^ llllllllllllllllIIllIlIlIIlllIlI[llllllllllllllllIIllIlIlIIlllIIl % llllllllllllllllIIllIlIlIIlllIlI.length]));
            0;
            ++llllllllllllllllIIllIlIlIIlllIIl;
            ++llllllllllllllllIIllIlIlIIllIIIl;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIlIlIIlllIll);
    }

    private static String lIlIIlIllIllll(String llllllllllllllllIIllIlIlIlIIlIll, String llllllllllllllllIIllIlIlIlIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIlIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlIlIIllII.getBytes(StandardCharsets.UTF_8)), llIlIIllIIl[30]), "DES");
            Cipher llllllllllllllllIIllIlIlIlIIllll = Cipher.getInstance("DES");
            llllllllllllllllIIllIlIlIlIIllll.init(llIlIIllIIl[3], llllllllllllllllIIllIlIlIlIlIIII);
            return new String(llllllllllllllllIIllIlIlIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIlIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIlIlIlIIlllI) {
            llllllllllllllllIIllIlIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static r aa() {
        void llllllllllllllllIIllIlIlIllIlIIl;
        List list = TileObjects.getAll(tileObject -> {
            int n2;
            if (r.lIlIIlIlllIIll(tileObject.getName().equals(llIlIIllIII[llIlIIllIIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlIIllIIl[1]];
                stringArray[r.llIlIIllIIl[0]] = llIlIIllIII[llIlIIllIIl[1]];
                if (r.lIlIIlIlllIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIlIIllIIl[1];
                    0;
                    if ((0x6B ^ 0x6F) >= (0x5C ^ 0x58)) return n2 != 0;
                    return ((0xAB ^ 0x98) & ~(0x3A ^ 9)) != 0;
                }
            }
            n2 = llIlIIllIIl[0];
            return n2 != 0;
        });
        List list2 = list.stream().map(Locatable::getWorldLocation).map(RegionPoint::fromWorld).map(regionPoint -> new Point(regionPoint.getX(), regionPoint.getY())).collect(Collectors.toList());
        r[] rArray = r.values();
        int n2 = rArray.length;
        int llllllllllllllllIIllIlIlIllIlIII = llIlIIllIIl[0];
        while (r.lIlIIlIlllIIlI(llllllllllllllllIIllIlIlIllIlIII, (int)llllllllllllllllIIllIlIlIllIlIIl)) {
            void llllllllllllllllIIllIlIlIllIlIlI;
            void llllllllllllllllIIllIlIlIllIIlll = llllllllllllllllIIllIlIlIllIlIlI[llllllllllllllllIIllIlIlIllIlIII];
            int llllllllllllllllIIllIlIlIllIIllI = llIlIIllIIl[1];
            Iterator<Point> llllllllllllllllIIllIlIlIllIIlIl = llllllllllllllllIIllIlIlIllIIlll.ac().iterator();
            while (r.lIlIIlIlllIIll(llllllllllllllllIIllIlIlIllIIlIl.hasNext() ? 1 : 0)) {
                void llllllllllllllllIIllIlIlIllIlIll;
                Point llllllllllllllllIIllIlIlIllIIlII = llllllllllllllllIIllIlIlIllIIlIl.next();
                if (r.lIlIIlIlllIlII(llllllllllllllllIIllIlIlIllIlIll.contains(llllllllllllllllIIllIlIlIllIIlII) ? 1 : 0)) {
                    llllllllllllllllIIllIlIlIllIIllI = llIlIIllIIl[0];
                    0;
                    if (((196 + 132 - 175 + 89 ^ 167 + 80 - 224 + 157) & (0xBA ^ 0x85 ^ (0xC ^ 0x75) ^ -1)) == 0) break;
                    return null;
                }
                0;
                if (2 != 0) continue;
                return null;
            }
            if (r.lIlIIlIlllIlII(llllllllllllllllIIllIlIlIllIIllI)) {
                0;
                if (((115 + 80 - 160 + 143 ^ 28 + 106 - 122 + 136) & (0xF3 ^ 0xBD ^ (0x21 ^ 0x49) ^ -1)) != 0) {
                    return null;
                }
            } else {
                return llllllllllllllllIIllIlIlIllIIlll;
            }
            ++llllllllllllllllIIllIlIlIllIlIII;
            0;
            if (-(0x17 ^ 0x13) <= 0) continue;
            return null;
        }
        return null;
    }

    private static String lIlIIlIllIllIl(String llllllllllllllllIIllIlIlIlIllIlI, String llllllllllllllllIIllIlIlIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIlIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIlIlIlIlllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIlIlIlIlllII.init(llIlIIllIIl[3], llllllllllllllllIIllIlIlIlIlllIl);
            return new String(llllllllllllllllIIllIlIlIlIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIlIlIlIllIll) {
            llllllllllllllllIIllIlIlIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlllIIll(int n2) {
        return n2 != 0;
    }
}

