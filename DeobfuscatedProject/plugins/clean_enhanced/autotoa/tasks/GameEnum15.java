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
package gg.squire.autotoa.tasks;

import java.awt.Point;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;

public final class GameEnum15
extends Enum<r> {
    public static final  /* enum */ r ROOM_6;
    public static final  /* enum */ r ROOM_4_1;
    public static final  /* enum */ r ROOM_5;
    public static final  /* enum */ r ROOM_3;
    private final  Map<Point, Integer> placingMirrors;
    public static final  /* enum */ r ROOM_7_1;
    
    public static final  /* enum */ r ROOM_1;
    public static final  /* enum */ r ROOM_8_1;
    private final  Set<Point> detectionMirrors;
    public static final  /* enum */ r ROOM_7;
    public static final  /* enum */ r ROOM_3_1;
    private final  List<Point> wallsToBreak;
    public static final  /* enum */ r ROOM_4;
    public static final  /* enum */ r ROOM_1_2;
    private static final  r[] $VALUES;
    private static final  int REGION_ID;
    private final  Point stand;
    
    public static final  /* enum */ r ROOM_8_2;

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum15.class, string);
    }

    public boolean d(WorldPoint worldPoint) {
        Point point = this.c(worldPoint);
        return this.placingMirrors.containsKey(point);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum15(Point point, Set<Point> set, Map<Point, Integer> map, Point ... pointArray) {
        this.stand = point;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = Stream.of(pointArray).collect(Collectors.toList());
    }

    private static void var5() {
        var1 = new String[var2[37]];
        r.var1[r.var2[0]] = "Mirror";
        r.var1[r.var2[1]] = "Pick-up";
        r.var1[r.var2[3]] = "ROOM_1";
        r.var1[r.var2[15]] = "ROOM_1_2";
        r.var1[r.var2[19]] = "ROOM_3";
        r.var1[r.var2[22]] = "ROOM_3_1";
        r.var1[r.var2[25]] = "ROOM_4";
        r.var1[r.var2[29]] = "ROOM_4_1";
        r.var1[r.var2[30]] = "ROOM_5";
        r.var1[r.var2[31]] = "ROOM_6";
        r.var1[r.var2[33]] = "ROOM_7";
        r.var1[r.var2[34]] = "ROOM_7_1";
        r.var1[r.var2[35]] = "ROOM_8_1";
        r.var1[r.var2[36]] = "ROOM_8_2";
    }

    public Point c(WorldPoint worldPoint) {
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        return new Point(regionPoint.getX(), regionPoint.getY());
    }

    private GameEnum15(Set<Point> set, Map<Point, Integer> map, Point ... pointArray) {
        this.stand = null;
        this.detectionMirrors = set;
        this.placingMirrors = map;
        this.wallsToBreak = Stream.of(pointArray).collect(Collectors.toList());
    }

    private static void var6() {
        var2 = new int[38];
        r.var2[0] = (0xB0 ^ 0x92 ^ (1 ^ 0x6F)) & (19 + 101 - 69 + 144 ^ 29 + 48 - 8 + 74 ^ -1);
        r.var2[1] = 1;
        r.var2[2] = 0xFFFFF957 & 0x3FFA;
        r.var2[3] = 2;
        r.var2[4] = 0x8E ^ 0xA8 ^ (0x43 ^ 0x7B);
        r.var2[5] = 0x46 ^ 0x10 ^ (0x3D ^ 0x49);
        r.var2[6] = 0x36 ^ 0x2B;
        r.var2[7] = 101 + 59 - 132 + 143 ^ 73 + 161 - 192 + 141;
        r.var2[8] = 0xC5 ^ 0x83 ^ (0xEE ^ 0xB2);
        r.var2[9] = 0x31 ^ 0x2A;
        r.var2[10] = 0x49 ^ 0x61;
        r.var2[11] = 0x46 ^ 0x66;
        r.var2[12] = 0xFFFFC51C & 0x3BE3;
        r.var2[13] = 0x15 ^ 0x56 ^ (0xEF ^ 0x88);
        r.var2[14] = 0xFFFFF731 & 0xDCE;
        r.var2[15] = 3;
        r.var2[16] = 0x81 ^ 0x98;
        r.var2[17] = 0x70 ^ 0x59;
        r.var2[18] = 0xFFFFAB03 & 0x57FC;
        r.var2[19] = 0x1D ^ 0x75 ^ (0x1E ^ 0x72);
        r.var2[20] = 0x74 ^ 0x57;
        r.var2[21] = 0x9C ^ 0x84;
        r.var2[22] = 0x59 ^ 0x5C;
        r.var2[23] = 0x24 ^ 0x64 ^ (0x29 ^ 0x4F);
        r.var2[24] = 0xFFFFE7D1 & 0x1F2E;
        r.var2[25] = 0x5D ^ 0x5B;
        r.var2[26] = 0x1F ^ 0x47 ^ (0x65 ^ 0x18);
        r.var2[27] = 0x8E ^ 0xA9;
        r.var2[28] = 6 ^ 0x27;
        r.var2[29] = 0x7B ^ 0x7C;
        r.var2[30] = 0x3E ^ 0x36;
        r.var2[31] = 0x70 ^ 0x79;
        r.var2[32] = 0xB1 ^ 0xAE;
        r.var2[33] = 5 + 169 - 52 + 58 ^ 121 + 153 - 250 + 166;
        r.var2[34] = 0x7E ^ 0x75;
        r.var2[35] = 0xA9 ^ 0xA5;
        r.var2[36] = 0x9B ^ 0x96;
        r.var2[37] = 0x76 ^ 0x15 ^ (0x4F ^ 0x22);
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
        RegionPoint regionPoint = new RegionPoint(point.x, point.y, client.getPlane(), var2[2]);
        return WorldPoint.toLocalInstance((Client)client, (WorldPoint)regionPoint.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(worldPoint))).orElse(null);
    }

    public Point ab() {
        return this.stand;
    }

    public List<Point> ae() {
        return this.wallsToBreak;
    }

    static {
        r.var6();
        r.var5();
        REGION_ID = var2[2];
        Point[] pointArray = new Point[var2[1]];
        pointArray[r.var2[0]] = new Point(var2[13], var2[5]);
        ROOM_1 = new GameEnum15(new Point(var2[4], var2[5]), Set.of(new Point(var2[6], var2[7]), new Point(var2[8], var2[6]), new Point(var2[9], var2[10])), Map.of(new Point(var2[9], var2[11]), var2[12], new Point(var2[13], var2[10]), var2[14]), pointArray);
        Point[] pointArray2 = new Point[var2[1]];
        pointArray2[r.var2[0]] = new Point(var2[13], var2[5]);
        ROOM_1_2 = new GameEnum15(new Point(var2[4], var2[5]), Set.of(new Point(var2[16], var2[11]), new Point(var2[7], var2[9]), new Point(var2[5], var2[17])), Map.of(new Point(var2[9], var2[11]), var2[12], new Point(var2[9], var2[10]), var2[18], new Point(var2[13], var2[10]), var2[14]), pointArray2);
        Point[] pointArray3 = new Point[var2[1]];
        pointArray3[r.var2[0]] = new Point(var2[20], var2[8]);
        ROOM_3 = new GameEnum15(new Point(var2[4], var2[4]), Set.of(new Point(var2[16], var2[6]), new Point(var2[6], var2[5]), new Point(var2[20], var2[21])), Map.of(new Point(var2[8], var2[11]), var2[18], new Point(var2[8], var2[21]), var2[12]), pointArray3);
        Point[] pointArray4 = new Point[var2[1]];
        pointArray4[r.var2[0]] = new Point(var2[20], var2[8]);
        ROOM_3_1 = new GameEnum15(new Point(var2[4], var2[4]), Set.of(new Point(var2[9], var2[16]), new Point(var2[10], var2[7]), new Point(var2[10], var2[23])), Map.of(new Point(var2[8], var2[11]), var2[18], new Point(var2[8], var2[21]), var2[12], new Point(var2[20], var2[21]), var2[24]), pointArray4);
        Point[] pointArray5 = new Point[var2[1]];
        pointArray5[r.var2[0]] = new Point(var2[16], var2[6]);
        ROOM_4 = new GameEnum15(Set.of(new Point(var2[8], var2[7]), new Point(var2[26], var2[23]), new Point(var2[27], var2[28])), Map.of(new Point(var2[16], var2[11]), var2[18], new Point(var2[16], var2[21]), var2[12], new Point(var2[27], var2[21]), var2[24]), pointArray5);
        Point[] pointArray6 = new Point[var2[1]];
        pointArray6[r.var2[0]] = new Point(var2[16], var2[6]);
        ROOM_4_1 = new GameEnum15(new Point(var2[11], var2[6]), Set.of(new Point(var2[16], var2[11]), new Point(var2[9], var2[16]), new Point(var2[13], var2[6])), Map.of(new Point(var2[16], var2[21]), var2[12], new Point(var2[27], var2[21]), var2[24]), pointArray6);
        ROOM_5 = new GameEnum15(new Point(var2[6], var2[4]), Set.of(new Point(var2[16], var2[23]), new Point(var2[26], var2[26]), new Point(var2[13], var2[16])), Map.of(new Point(var2[21], var2[11]), var2[12], new Point(var2[21], var2[27]), var2[18], new Point(var2[20], var2[27]), var2[14]), new Point[var2[0]]);
        ROOM_6 = new GameEnum15(new Point(var2[11], var2[20]), Set.of(new Point(var2[16], var2[11]), new Point(var2[32], var2[21]), new Point(var2[13], var2[27])), Map.of(new Point(var2[16], var2[27]), var2[18]), new Point[var2[0]]);
        Point[] pointArray7 = new Point[var2[1]];
        pointArray7[r.var2[0]] = new Point(var2[5], var2[5]);
        ROOM_7 = new GameEnum15(Set.of(new Point(var2[23], var2[32]), new Point(var2[17], var2[13]), new Point(var2[16], var2[6])), Map.of(new Point(var2[9], var2[11]), var2[12], new Point(var2[9], var2[20]), var2[18], new Point(var2[5], var2[20]), var2[14]), pointArray7);
        Point[] pointArray8 = new Point[var2[1]];
        pointArray8[r.var2[0]] = new Point(var2[5], var2[5]);
        ROOM_7_1 = new GameEnum15(new Point(var2[32], var2[20]), Set.of(new Point(var2[9], var2[20]), new Point(var2[21], var2[11]), new Point(var2[17], var2[6])), Map.of(new Point(var2[9], var2[11]), var2[12], new Point(var2[5], var2[20]), var2[14]), pointArray8);
        Point[] pointArray9 = new Point[var2[1]];
        pointArray9[r.var2[0]] = new Point(var2[20], var2[8]);
        ROOM_8_1 = new GameEnum15(new Point(var2[4], var2[4]), Set.of(new Point(var2[11], var2[21]), new Point(var2[11], var2[6]), new Point(var2[6], var2[17])), Map.of(new Point(var2[8], var2[11]), var2[18], new Point(var2[8], var2[16]), var2[12], new Point(var2[20], var2[16]), var2[24]), pointArray9);
        Point[] pointArray10 = new Point[var2[1]];
        pointArray10[r.var2[0]] = new Point(var2[20], var2[8]);
        ROOM_8_2 = new GameEnum15(new Point(var2[4], var2[4]), Set.of(new Point(var2[8], var2[11]), new Point(var2[13], var2[17]), new Point(var2[6], var2[17])), Map.of(new Point(var2[8], var2[16]), var2[12], new Point(var2[20], var2[16]), var2[24]), pointArray10);
        r[] rArray = new r[var2[35]];
        rArray[r.var2[0]] = ROOM_1;
        rArray[r.var2[1]] = ROOM_1_2;
        rArray[r.var2[3]] = ROOM_3;
        rArray[r.var2[15]] = ROOM_3_1;
        rArray[r.var2[19]] = ROOM_4;
        rArray[r.var2[22]] = ROOM_4_1;
        rArray[r.var2[25]] = ROOM_5;
        rArray[r.var2[29]] = ROOM_6;
        rArray[r.var2[30]] = ROOM_7;
        rArray[r.var2[31]] = ROOM_7_1;
        rArray[r.var2[33]] = ROOM_8_1;
        rArray[r.var2[34]] = ROOM_8_2;
        $VALUES = rArray;
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var2[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var2[0];
        while (r.var4(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static r aa() {
        void var23;
        List list = TileObjects.getAll(tileObject -> {
            int n2;
            if (r.var24(tileObject.getName().equals(var1[var2[0]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[r.var2[0]] = var1[var2[1]];
                if (r.var3(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var2[1];
                    0;
                    if ((0x6B ^ 0x6F) >= (0x5C ^ 0x58)) return n2 != 0;
                    return ((0xAB ^ 0x98) & ~(0x3A ^ 9)) != 0;
                }
            }
            n2 = var2[0];
            return n2 != 0;
        });
        List list2 = list.stream().map(Locatable::getWorldLocation).map(RegionPoint::fromWorld).map(regionPoint -> new Point(regionPoint.getX(), regionPoint.getY())).collect(Collectors.toList());
        r[] rArray = r.values();
        int n2 = rArray.length;
        int var25 = var2[0];
        while (r.var4(var25, (int)var23)) {
            void var26;
            void var27 = var26[var25];
            int var28 = var2[1];
            Iterator<Point> var29 = var27.ac().iterator();
            while (r.var24(var29.hasNext() ? 1 : 0)) {
                void var30;
                Point var31 = var29.next();
                if (r.var3(var30.contains(var31) ? 1 : 0)) {
                    var28 = var2[0];
                    0;
                    if (((196 + 132 - 175 + 89 ^ 167 + 80 - 224 + 157) & (0xBA ^ 0x85 ^ (0xC ^ 0x75) ^ -1)) == 0) break;
                    return null;
                }
                0;
                if (2 != 0) continue;
                return null;
            }
            if (r.var3(var28)) {
                0;
                if (((115 + 80 - 160 + 143 ^ 28 + 106 - 122 + 136) & (0xF3 ^ 0xBD ^ (0x21 ^ 0x49) ^ -1)) != 0) {
                    return null;
                }
            } else {
                return var27;
            }
            ++var25;
            0;
            if (-(0x17 ^ 0x13) <= 0) continue;
            return null;
        }
        return null;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }
}

