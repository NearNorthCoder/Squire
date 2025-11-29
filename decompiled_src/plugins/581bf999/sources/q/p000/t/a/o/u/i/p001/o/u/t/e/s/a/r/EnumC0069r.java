package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/r.class */
public final class EnumC0069r {
    public static final /* synthetic */ EnumC0069r ROOM_6;
    public static final /* synthetic */ EnumC0069r ROOM_4_1;
    public static final /* synthetic */ EnumC0069r ROOM_5;
    public static final /* synthetic */ EnumC0069r ROOM_3;
    private final /* synthetic */ Map<Point, Integer> placingMirrors;
    public static final /* synthetic */ EnumC0069r ROOM_7_1;
    private static /* synthetic */ String[] llIlIIllIII;
    public static final /* synthetic */ EnumC0069r ROOM_1;
    public static final /* synthetic */ EnumC0069r ROOM_8_1;
    private final /* synthetic */ Set<Point> detectionMirrors;
    public static final /* synthetic */ EnumC0069r ROOM_7;
    public static final /* synthetic */ EnumC0069r ROOM_3_1;
    private final /* synthetic */ List<Point> wallsToBreak;
    public static final /* synthetic */ EnumC0069r ROOM_4;
    public static final /* synthetic */ EnumC0069r ROOM_1_2;
    private static final /* synthetic */ EnumC0069r[] $VALUES;
    private static final /* synthetic */ int REGION_ID;
    private final /* synthetic */ Point stand;
    private static /* synthetic */ int[] llIlIIllIIl;
    public static final /* synthetic */ EnumC0069r ROOM_8_2;

    public static EnumC0069r valueOf(String str) {
        return (EnumC0069r) Enum.valueOf(EnumC0069r.class, str);
    }

    public boolean d(WorldPoint worldPoint) {
        return this.placingMirrors.containsKey(c(worldPoint));
    }

    private static boolean lIlIIlIlllIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIIlIlllIIlI(int i, int i2) {
        return i < i2;
    }

    private EnumC0069r(String str, int i, Point point, Set set, Map map, Point... pointArr) {
        this.stand = point;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = (List) Stream.of((Object[]) pointArr).collect(Collectors.toList());
    }

    private static void lIlIIlIlllIIII() {
        llIlIIllIII = new String[llIlIIllIIl[37]];
        llIlIIllIII[llIlIIllIIl[0]] = lIlIIlIllIllIl("1BsexXCa1SE=", "rkLYA");
        llIlIIllIII[llIlIIllIIl[1]] = lIlIIlIllIlllI("FiQ1LlozPQ==", "FMVEw");
        llIlIIllIII[llIlIIllIIl[3]] = lIlIIlIllIllll("hKiUjARF1Fs=", "tGkRZ");
        llIlIIllIII[llIlIIllIIl[15]] = lIlIIlIllIllIl("DmobyyYHQykBDVbgjtSGvg==", "IftsV");
        llIlIIllIII[llIlIIllIIl[19]] = lIlIIlIllIllll("D/UR3eiaX4I=", "GUlxa");
        llIlIIllIII[llIlIIllIIl[22]] = lIlIIlIllIllIl("DCkcH5sgNoYFAItVBNlMIw==", "exgaZ");
        llIlIIllIII[llIlIIllIIl[25]] = lIlIIlIllIllIl("qhg4O4HgkOQ=", "OgdNu");
        llIlIIllIII[llIlIIllIIl[29]] = lIlIIlIllIllIl("1TOpeIP4duZ9sa0yQP2hxw==", "bhDzb");
        llIlIIllIII[llIlIIllIIl[30]] = lIlIIlIllIllIl("Xyoe37qhBPM=", "inkWy");
        llIlIIllIII[llIlIIllIIl[31]] = lIlIIlIllIllIl("6NcHIU4TTB4=", "sOHde");
        llIlIIllIII[llIlIIllIIl[33]] = lIlIIlIllIlllI("ESg+Igh0", "CgqoW");
        llIlIIllIII[llIlIIllIIl[34]] = lIlIIlIllIllll("atnCogMKnz89o+OBbWuSHQ==", "SUcHJ");
        llIlIIllIII[llIlIIllIIl[35]] = lIlIIlIllIllIl("lEc7hFc0EebAehXFDTMP8g==", "HhhbX");
        llIlIIllIII[llIlIIllIIl[36]] = lIlIIlIllIllll("m9V3F18+qAZ9Y6VOmGD5Fg==", "oPeQL");
    }

    public Point c(WorldPoint worldPoint) {
        RegionPoint fromWorld = RegionPoint.fromWorld(worldPoint);
        return new Point(fromWorld.getX(), fromWorld.getY());
    }

    private EnumC0069r(String str, int i, Set set, Map map, Point... pointArr) {
        this.stand = null;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = (List) Stream.of((Object[]) pointArr).collect(Collectors.toList());
    }

    private static void lIlIIlIlllIIIl() {
        llIlIIllIIl = new int[38];
        llIlIIllIIl[0] = ((176 ^ 146) ^ (1 ^ 111)) & (((((19 + 101) - 69) + 144) ^ (((29 + 48) - 8) + 74)) ^ (-" ".length()));
        llIlIIllIIl[1] = " ".length();
        llIlIIllIIl[2] = (-1705) & 16378;
        llIlIIllIIl[3] = "  ".length();
        llIlIIllIIl[4] = (142 ^ 168) ^ (67 ^ 123);
        llIlIIllIIl[5] = (70 ^ 16) ^ (61 ^ 73);
        llIlIIllIIl[6] = 54 ^ 43;
        llIlIIllIIl[7] = (((101 + 59) - 132) + 143) ^ (((73 + 161) - 192) + 141);
        llIlIIllIIl[8] = (197 ^ 131) ^ (238 ^ 178);
        llIlIIllIIl[9] = 49 ^ 42;
        llIlIIllIIl[10] = 73 ^ 97;
        llIlIIllIIl[11] = 70 ^ 102;
        llIlIIllIIl[12] = (-15076) & 15331;
        llIlIIllIIl[13] = (21 ^ 86) ^ (239 ^ 136);
        llIlIIllIIl[14] = (-2255) & 3534;
        llIlIIllIIl[15] = "   ".length();
        llIlIIllIIl[16] = 129 ^ 152;
        llIlIIllIIl[17] = 112 ^ 89;
        llIlIIllIIl[18] = (-21757) & 22524;
        llIlIIllIIl[19] = (29 ^ 117) ^ (30 ^ 114);
        llIlIIllIIl[20] = 116 ^ 87;
        llIlIIllIIl[21] = 156 ^ 132;
        llIlIIllIIl[22] = 89 ^ 92;
        llIlIIllIIl[23] = (36 ^ 100) ^ (41 ^ 79);
        llIlIIllIIl[24] = (-6191) & 7982;
        llIlIIllIIl[25] = 93 ^ 91;
        llIlIIllIIl[26] = (31 ^ 71) ^ (101 ^ 24);
        llIlIIllIIl[27] = 142 ^ 169;
        llIlIIllIIl[28] = 6 ^ 39;
        llIlIIllIIl[29] = 123 ^ 124;
        llIlIIllIIl[30] = 62 ^ 54;
        llIlIIllIIl[31] = 112 ^ 121;
        llIlIIllIIl[32] = 177 ^ 174;
        llIlIIllIIl[33] = (((5 + 169) - 52) + 58) ^ (((121 + 153) - 250) + 166);
        llIlIIllIIl[34] = 126 ^ 117;
        llIlIIllIIl[35] = 169 ^ 165;
        llIlIIllIIl[36] = 155 ^ 150;
        llIlIIllIIl[37] = (118 ^ 21) ^ (79 ^ 34);
    }

    public Set<Point> ac() {
        return this.detectionMirrors;
    }

    public Map<Point, Integer> ad() {
        return this.placingMirrors;
    }

    public WorldPoint a(Point point) {
        Client client = Static.getClient();
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        return (WorldPoint) WorldPoint.toLocalInstance(client, new RegionPoint(point.x, point.y, client.getPlane(), llIlIIllIIl[2]).toWorld()).stream().min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo2D(worldLocation);
        })).orElse(null);
    }

    public Point ab() {
        return this.stand;
    }

    public List<Point> ae() {
        return this.wallsToBreak;
    }

    static {
        lIlIIlIlllIIIl();
        lIlIIlIlllIIII();
        REGION_ID = llIlIIllIIl[2];
        String str = llIlIIllIII[llIlIIllIIl[3]];
        int i = llIlIIllIIl[0];
        Point point = new Point(llIlIIllIIl[4], llIlIIllIIl[5]);
        Set of = Set.of(new Point(llIlIIllIIl[6], llIlIIllIIl[7]), new Point(llIlIIllIIl[8], llIlIIllIIl[6]), new Point(llIlIIllIIl[9], llIlIIllIIl[10]));
        Map of2 = Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[13], llIlIIllIIl[10]), Integer.valueOf(llIlIIllIIl[14]));
        Point[] pointArr = new Point[llIlIIllIIl[1]];
        pointArr[llIlIIllIIl[0]] = new Point(llIlIIllIIl[13], llIlIIllIIl[5]);
        ROOM_1 = new EnumC0069r(str, i, point, of, of2, pointArr);
        String str2 = llIlIIllIII[llIlIIllIIl[15]];
        int i2 = llIlIIllIIl[1];
        Point point2 = new Point(llIlIIllIIl[4], llIlIIllIIl[5]);
        Set of3 = Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[7], llIlIIllIIl[9]), new Point(llIlIIllIIl[5], llIlIIllIIl[17]));
        Map of4 = Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[9], llIlIIllIIl[10]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[13], llIlIIllIIl[10]), Integer.valueOf(llIlIIllIIl[14]));
        Point[] pointArr2 = new Point[llIlIIllIIl[1]];
        pointArr2[llIlIIllIIl[0]] = new Point(llIlIIllIIl[13], llIlIIllIIl[5]);
        ROOM_1_2 = new EnumC0069r(str2, i2, point2, of3, of4, pointArr2);
        String str3 = llIlIIllIII[llIlIIllIIl[19]];
        int i3 = llIlIIllIIl[3];
        Point point3 = new Point(llIlIIllIIl[4], llIlIIllIIl[4]);
        Set of5 = Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[6]), new Point(llIlIIllIIl[6], llIlIIllIIl[5]), new Point(llIlIIllIIl[20], llIlIIllIIl[21]));
        Map of6 = Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[8], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[12]));
        Point[] pointArr3 = new Point[llIlIIllIIl[1]];
        pointArr3[llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_3 = new EnumC0069r(str3, i3, point3, of5, of6, pointArr3);
        String str4 = llIlIIllIII[llIlIIllIIl[22]];
        int i4 = llIlIIllIIl[15];
        Point point4 = new Point(llIlIIllIIl[4], llIlIIllIIl[4]);
        Set of7 = Set.of(new Point(llIlIIllIIl[9], llIlIIllIIl[16]), new Point(llIlIIllIIl[10], llIlIIllIIl[7]), new Point(llIlIIllIIl[10], llIlIIllIIl[23]));
        Map of8 = Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[8], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[20], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[24]));
        Point[] pointArr4 = new Point[llIlIIllIIl[1]];
        pointArr4[llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_3_1 = new EnumC0069r(str4, i4, point4, of7, of8, pointArr4);
        String str5 = llIlIIllIII[llIlIIllIIl[25]];
        int i5 = llIlIIllIIl[19];
        Set of9 = Set.of(new Point(llIlIIllIIl[8], llIlIIllIIl[7]), new Point(llIlIIllIIl[26], llIlIIllIIl[23]), new Point(llIlIIllIIl[27], llIlIIllIIl[28]));
        Map of10 = Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[16], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[27], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[24]));
        Point[] pointArr5 = new Point[llIlIIllIIl[1]];
        pointArr5[llIlIIllIIl[0]] = new Point(llIlIIllIIl[16], llIlIIllIIl[6]);
        ROOM_4 = new EnumC0069r(str5, i5, of9, of10, pointArr5);
        String str6 = llIlIIllIII[llIlIIllIIl[29]];
        int i6 = llIlIIllIIl[22];
        Point point5 = new Point(llIlIIllIIl[11], llIlIIllIIl[6]);
        Set of11 = Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[9], llIlIIllIIl[16]), new Point(llIlIIllIIl[13], llIlIIllIIl[6]));
        Map of12 = Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[27], llIlIIllIIl[21]), Integer.valueOf(llIlIIllIIl[24]));
        Point[] pointArr6 = new Point[llIlIIllIIl[1]];
        pointArr6[llIlIIllIIl[0]] = new Point(llIlIIllIIl[16], llIlIIllIIl[6]);
        ROOM_4_1 = new EnumC0069r(str6, i6, point5, of11, of12, pointArr6);
        ROOM_5 = new EnumC0069r(llIlIIllIII[llIlIIllIIl[30]], llIlIIllIIl[25], new Point(llIlIIllIIl[6], llIlIIllIIl[4]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[23]), new Point(llIlIIllIIl[26], llIlIIllIIl[26]), new Point(llIlIIllIIl[13], llIlIIllIIl[16])), Map.of(new Point(llIlIIllIIl[21], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[21], llIlIIllIIl[27]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[20], llIlIIllIIl[27]), Integer.valueOf(llIlIIllIIl[14])), new Point[llIlIIllIIl[0]]);
        ROOM_6 = new EnumC0069r(llIlIIllIII[llIlIIllIIl[31]], llIlIIllIIl[29], new Point(llIlIIllIIl[11], llIlIIllIIl[20]), Set.of(new Point(llIlIIllIIl[16], llIlIIllIIl[11]), new Point(llIlIIllIIl[32], llIlIIllIIl[21]), new Point(llIlIIllIIl[13], llIlIIllIIl[27])), Map.of(new Point(llIlIIllIIl[16], llIlIIllIIl[27]), Integer.valueOf(llIlIIllIIl[18])), new Point[llIlIIllIIl[0]]);
        String str7 = llIlIIllIII[llIlIIllIIl[33]];
        int i7 = llIlIIllIIl[30];
        Set of13 = Set.of(new Point(llIlIIllIIl[23], llIlIIllIIl[32]), new Point(llIlIIllIIl[17], llIlIIllIIl[13]), new Point(llIlIIllIIl[16], llIlIIllIIl[6]));
        Map of14 = Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[9], llIlIIllIIl[20]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[5], llIlIIllIIl[20]), Integer.valueOf(llIlIIllIIl[14]));
        Point[] pointArr7 = new Point[llIlIIllIIl[1]];
        pointArr7[llIlIIllIIl[0]] = new Point(llIlIIllIIl[5], llIlIIllIIl[5]);
        ROOM_7 = new EnumC0069r(str7, i7, of13, of14, pointArr7);
        String str8 = llIlIIllIII[llIlIIllIIl[34]];
        int i8 = llIlIIllIIl[31];
        Point point6 = new Point(llIlIIllIIl[32], llIlIIllIIl[20]);
        Set of15 = Set.of(new Point(llIlIIllIIl[9], llIlIIllIIl[20]), new Point(llIlIIllIIl[21], llIlIIllIIl[11]), new Point(llIlIIllIIl[17], llIlIIllIIl[6]));
        Map of16 = Map.of(new Point(llIlIIllIIl[9], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[5], llIlIIllIIl[20]), Integer.valueOf(llIlIIllIIl[14]));
        Point[] pointArr8 = new Point[llIlIIllIIl[1]];
        pointArr8[llIlIIllIIl[0]] = new Point(llIlIIllIIl[5], llIlIIllIIl[5]);
        ROOM_7_1 = new EnumC0069r(str8, i8, point6, of15, of16, pointArr8);
        String str9 = llIlIIllIII[llIlIIllIIl[35]];
        int i9 = llIlIIllIIl[33];
        Point point7 = new Point(llIlIIllIIl[4], llIlIIllIIl[4]);
        Set of17 = Set.of(new Point(llIlIIllIIl[11], llIlIIllIIl[21]), new Point(llIlIIllIIl[11], llIlIIllIIl[6]), new Point(llIlIIllIIl[6], llIlIIllIIl[17]));
        Map of18 = Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), Integer.valueOf(llIlIIllIIl[18]), new Point(llIlIIllIIl[8], llIlIIllIIl[16]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[20], llIlIIllIIl[16]), Integer.valueOf(llIlIIllIIl[24]));
        Point[] pointArr9 = new Point[llIlIIllIIl[1]];
        pointArr9[llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_8_1 = new EnumC0069r(str9, i9, point7, of17, of18, pointArr9);
        String str10 = llIlIIllIII[llIlIIllIIl[36]];
        int i10 = llIlIIllIIl[34];
        Point point8 = new Point(llIlIIllIIl[4], llIlIIllIIl[4]);
        Set of19 = Set.of(new Point(llIlIIllIIl[8], llIlIIllIIl[11]), new Point(llIlIIllIIl[13], llIlIIllIIl[17]), new Point(llIlIIllIIl[6], llIlIIllIIl[17]));
        Map of20 = Map.of(new Point(llIlIIllIIl[8], llIlIIllIIl[16]), Integer.valueOf(llIlIIllIIl[12]), new Point(llIlIIllIIl[20], llIlIIllIIl[16]), Integer.valueOf(llIlIIllIIl[24]));
        Point[] pointArr10 = new Point[llIlIIllIIl[1]];
        pointArr10[llIlIIllIIl[0]] = new Point(llIlIIllIIl[20], llIlIIllIIl[8]);
        ROOM_8_2 = new EnumC0069r(str10, i10, point8, of19, of20, pointArr10);
        EnumC0069r[] enumC0069rArr = new EnumC0069r[llIlIIllIIl[35]];
        enumC0069rArr[llIlIIllIIl[0]] = ROOM_1;
        enumC0069rArr[llIlIIllIIl[1]] = ROOM_1_2;
        enumC0069rArr[llIlIIllIIl[3]] = ROOM_3;
        enumC0069rArr[llIlIIllIIl[15]] = ROOM_3_1;
        enumC0069rArr[llIlIIllIIl[19]] = ROOM_4;
        enumC0069rArr[llIlIIllIIl[22]] = ROOM_4_1;
        enumC0069rArr[llIlIIllIIl[25]] = ROOM_5;
        enumC0069rArr[llIlIIllIIl[29]] = ROOM_6;
        enumC0069rArr[llIlIIllIIl[30]] = ROOM_7;
        enumC0069rArr[llIlIIllIIl[31]] = ROOM_7_1;
        enumC0069rArr[llIlIIllIIl[33]] = ROOM_8_1;
        enumC0069rArr[llIlIIllIIl[34]] = ROOM_8_2;
        $VALUES = enumC0069rArr;
    }

    public static EnumC0069r[] values() {
        return (EnumC0069r[]) $VALUES.clone();
    }

    private static String lIlIIlIllIlllI(String llllllllllllllllIIllIlIlIIllllIl, String llllllllllllllllIIllIlIlIIllllII) {
        String llllllllllllllllIIllIlIlIIllllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllIlIlIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIlIlIIlllIlI = llllllllllllllllIIllIlIlIIllllII.toCharArray();
        int llllllllllllllllIIllIlIlIIllIlII = llIlIIllIIl[0];
        char[] charArray = llllllllllllllllIIllIlIlIIllllIl2.toCharArray();
        int length = charArray.length;
        int i = llIlIIllIIl[0];
        while (lIlIIlIlllIIlI(i, length)) {
            char llllllllllllllllIIllIlIlIIlllllI = charArray[i];
            sb.append((char) (llllllllllllllllIIllIlIlIIlllllI ^ llllllllllllllllIIllIlIlIIlllIlI[llllllllllllllllIIllIlIlIIllIlII % llllllllllllllllIIllIlIlIIlllIlI.length]));
            "".length();
            llllllllllllllllIIllIlIlIIllIlII++;
            i++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIlIllIllll(String llllllllllllllllIIllIlIlIlIIllIl, String llllllllllllllllIIllIlIlIlIIllII) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIlIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlIlIIllII.getBytes(StandardCharsets.UTF_8)), llIlIIllIIl[30]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIIllIIl[3], llllllllllllllllIIllIlIlIlIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIlIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIlIlIlIIlllI) {
            llllllllllllllllIIllIlIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e9, code lost:
        if (lIlIIlIlllIlII(r11) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ec, code lost:
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0121, code lost:
        if ((((((115 + 80) - 160) + 143) ^ (((28 + 106) - 122) + 136)) & (((243 ^ 189) ^ (33 ^ 73)) ^ (-" ".length()))) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0124, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0128, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0129, code lost:
        r9 = r9 + 1;
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0138, code lost:
        if ((-(23 ^ 19)) <= 0) goto L2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013b, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC0069r aa() {
        List list = (List) TileObjects.getAll(tileObject -> {
            if (lIlIIlIlllIIll(tileObject.getName().equals(llIlIIllIII[llIlIIllIIl[0]]) ? 1 : 0)) {
                String[] strArr = new String[llIlIIllIIl[1]];
                strArr[llIlIIllIIl[0]] = llIlIIllIII[llIlIIllIIl[1]];
                if (lIlIIlIlllIlII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llIlIIllIIl[1];
                    "".length();
                    return (107 ^ 111) < (92 ^ 88) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return llIlIIllIIl[0];
        }).stream().map((v0) -> {
            return v0.getWorldLocation();
        }).map(RegionPoint::fromWorld).map(regionPoint -> {
            return new Point(regionPoint.getX(), regionPoint.getY());
        }).collect(Collectors.toList());
        EnumC0069r[] values = values();
        int length = values.length;
        int i = llIlIIllIIl[0];
        while (lIlIIlIlllIIlI(i, length)) {
            EnumC0069r enumC0069r = values[i];
            int i2 = llIlIIllIIl[1];
            Iterator<Point> it = enumC0069r.ac().iterator();
            while (true) {
                if (!lIlIIlIlllIIll(it.hasNext() ? 1 : 0)) {
                    break;
                } else if (lIlIIlIlllIlII(list.contains(it.next()) ? 1 : 0)) {
                    i2 = llIlIIllIIl[0];
                    "".length();
                    if ((((((196 + 132) - 175) + 89) ^ (((167 + 80) - 224) + 157)) & (((186 ^ 133) ^ (12 ^ 117)) ^ (-" ".length()))) != 0) {
                        return null;
                    }
                } else {
                    "".length();
                    if ("  ".length() == 0) {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    private static String lIlIIlIllIllIl(String llllllllllllllllIIllIlIlIlIllIlI, String llllllllllllllllIIllIlIlIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIlIlIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIlIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIIllIIl[3], llllllllllllllllIIllIlIlIlIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIlIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIlIlIlIllIll) {
            llllllllllllllllIIllIlIlIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIlllIIll(int i) {
        return i != 0;
    }
}
